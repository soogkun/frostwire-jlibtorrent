package com.frostwire.jlibtorrent.demo;

import com.frostwire.jlibtorrent.AlertListener;
import com.frostwire.jlibtorrent.SessionManager;
import com.frostwire.jlibtorrent.TorrentInfo;
import com.frostwire.jlibtorrent.alerts.Alert;
import com.frostwire.jlibtorrent.alerts.AlertType;
import com.frostwire.jlibtorrent.alerts.BlockFinishedAlert;
import com.frostwire.jlibtorrent.alerts.TorrentAddedAlert;
import com.frostwire.jlibtorrent.swig.libtorrent;
import com.frostwire.jlibtorrent.swig.posix_wrapper;

import java.io.File;
import java.util.concurrent.CountDownLatch;

/**
 * @author gubatron
 * @author aldenml
 */
public final class PosixTest {

    public static void main(String[] args) throws Throwable {

        posix_wrapper p = new posix_wrapper() {

            @Override
            public int open(String path, int flags, int mode) {
                System.out.println("open: " + path);
                return super.open(path, flags, mode);
            }
        };

        p.swigReleaseOwnership();
        libtorrent.set_posix_wrapper(p);

        // comment this line for a real application
        args = new String[]{"/Users/aldenml/Downloads/Honey_Larochelle_Hijack_FrostClick_FrostWire_MP3_May_06_2016.torrent"};

        File torrentFile = new File(args[0]);

        final SessionManager s = new SessionManager();

        final CountDownLatch signal = new CountDownLatch(1);

        s.addListener(new AlertListener() {
            @Override
            public int[] types() {
                return null;
            }

            @Override
            public void alert(Alert<?> alert) {
                AlertType type = alert.type();

                switch (type) {
                    case TORRENT_ADDED:
                        System.out.println("Torrent added");
                        ((TorrentAddedAlert) alert).handle().resume();
                        break;
                    case BLOCK_FINISHED:
                        BlockFinishedAlert a = (BlockFinishedAlert) alert;
                        int p = (int) (a.handle().status().progress() * 100);
                        System.out.println("Progress: " + p + " for torrent name: " + a.torrentName());
                        System.out.println(s.stats().totalDownload());
                        break;
                }
            }
        });

        s.start();

        TorrentInfo ti = new TorrentInfo(torrentFile);
        s.download(ti, torrentFile.getParentFile());

        signal.await();

        s.stop();
    }
}

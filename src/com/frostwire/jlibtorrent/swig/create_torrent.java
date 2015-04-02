/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class create_torrent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected create_torrent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(create_torrent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_create_torrent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public create_torrent(file_storage fs, int piece_size, int pad_file_limit, int flags, int alignment) {
    this(libtorrent_jni.new_create_torrent__SWIG_0(file_storage.getCPtr(fs), fs, piece_size, pad_file_limit, flags, alignment), true);
  }

  public create_torrent(file_storage fs, int piece_size, int pad_file_limit, int flags) {
    this(libtorrent_jni.new_create_torrent__SWIG_1(file_storage.getCPtr(fs), fs, piece_size, pad_file_limit, flags), true);
  }

  public create_torrent(file_storage fs, int piece_size, int pad_file_limit) {
    this(libtorrent_jni.new_create_torrent__SWIG_2(file_storage.getCPtr(fs), fs, piece_size, pad_file_limit), true);
  }

  public create_torrent(file_storage fs, int piece_size) {
    this(libtorrent_jni.new_create_torrent__SWIG_3(file_storage.getCPtr(fs), fs, piece_size), true);
  }

  public create_torrent(file_storage fs) {
    this(libtorrent_jni.new_create_torrent__SWIG_4(file_storage.getCPtr(fs), fs), true);
  }

  public create_torrent(torrent_info ti) {
    this(libtorrent_jni.new_create_torrent__SWIG_5(torrent_info.getCPtr(ti), ti), true);
  }

  public entry generate() {
    return new entry(libtorrent_jni.create_torrent_generate(swigCPtr, this), true);
  }

  public file_storage files() {
    return new file_storage(libtorrent_jni.create_torrent_files(swigCPtr, this), false);
  }

  public void set_comment(String str) {
    libtorrent_jni.create_torrent_set_comment(swigCPtr, this, str);
  }

  public void set_creator(String str) {
    libtorrent_jni.create_torrent_set_creator(swigCPtr, this, str);
  }

  public void set_hash(int index, sha1_hash h) {
    libtorrent_jni.create_torrent_set_hash(swigCPtr, this, index, sha1_hash.getCPtr(h), h);
  }

  public void set_file_hash(int index, sha1_hash h) {
    libtorrent_jni.create_torrent_set_file_hash(swigCPtr, this, index, sha1_hash.getCPtr(h), h);
  }

  public void add_url_seed(String url) {
    libtorrent_jni.create_torrent_add_url_seed(swigCPtr, this, url);
  }

  public void add_http_seed(String url) {
    libtorrent_jni.create_torrent_add_http_seed(swigCPtr, this, url);
  }

  public void add_node(string_int_pair node) {
    libtorrent_jni.create_torrent_add_node(swigCPtr, this, string_int_pair.getCPtr(node), node);
  }

  public void add_tracker(String url, int tier) {
    libtorrent_jni.create_torrent_add_tracker__SWIG_0(swigCPtr, this, url, tier);
  }

  public void add_tracker(String url) {
    libtorrent_jni.create_torrent_add_tracker__SWIG_1(swigCPtr, this, url);
  }

  public void set_root_cert(String pem) {
    libtorrent_jni.create_torrent_set_root_cert(swigCPtr, this, pem);
  }

  public void set_priv(boolean p) {
    libtorrent_jni.create_torrent_set_priv(swigCPtr, this, p);
  }

  public boolean priv() {
    return libtorrent_jni.create_torrent_priv(swigCPtr, this);
  }

  public int num_pieces() {
    return libtorrent_jni.create_torrent_num_pieces(swigCPtr, this);
  }

  public int piece_length() {
    return libtorrent_jni.create_torrent_piece_length(swigCPtr, this);
  }

  public int piece_size(int i) {
    return libtorrent_jni.create_torrent_piece_size(swigCPtr, this, i);
  }

  public sha1_hash_vector merkle_tree() {
    return new sha1_hash_vector(libtorrent_jni.create_torrent_merkle_tree(swigCPtr, this), false);
  }

  public void add_similar_torrent(sha1_hash ih) {
    libtorrent_jni.create_torrent_add_similar_torrent(swigCPtr, this, sha1_hash.getCPtr(ih), ih);
  }

  public void add_collection(String c) {
    libtorrent_jni.create_torrent_add_collection(swigCPtr, this, c);
  }

  public enum flags_t {
    optimize_alignment(libtorrent_jni.create_torrent_optimize_alignment_get()),
    optimize(libtorrent_jni.create_torrent_optimize_get()),
    merkle(libtorrent_jni.create_torrent_merkle_get()),
    modification_time(libtorrent_jni.create_torrent_modification_time_get()),
    symlinks(libtorrent_jni.create_torrent_symlinks_get()),
    mutable_torrent_support(libtorrent_jni.create_torrent_mutable_torrent_support_get());

    public final int swigValue() {
      return swigValue;
    }

    public static flags_t swigToEnum(int swigValue) {
      flags_t[] swigValues = flags_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (flags_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private flags_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private flags_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private flags_t(flags_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}

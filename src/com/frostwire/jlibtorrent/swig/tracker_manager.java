/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class tracker_manager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected tracker_manager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_manager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_manager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void abort_all_requests(boolean all) {
    libtorrent_jni.tracker_manager_abort_all_requests__SWIG_0(swigCPtr, this, all);
  }

  public void abort_all_requests() {
    libtorrent_jni.tracker_manager_abort_all_requests__SWIG_1(swigCPtr, this);
  }

  public void remove_request(tracker_connection arg0) {
    libtorrent_jni.tracker_manager_remove_request(swigCPtr, this, tracker_connection.getCPtr(arg0), arg0);
  }

  public boolean empty() {
    return libtorrent_jni.tracker_manager_empty(swigCPtr, this);
  }

  public int num_requests() {
    return libtorrent_jni.tracker_manager_num_requests(swigCPtr, this);
  }

  public void sent_bytes(int bytes) {
    libtorrent_jni.tracker_manager_sent_bytes(swigCPtr, this, bytes);
  }

  public void received_bytes(int bytes) {
    libtorrent_jni.tracker_manager_received_bytes(swigCPtr, this, bytes);
  }

}

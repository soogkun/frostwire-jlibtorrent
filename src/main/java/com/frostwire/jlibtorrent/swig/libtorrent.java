/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static boolean op_eq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_eq__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_lt__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_eq__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_lt__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_0(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_1(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code code, error_condition condition) {
    return libtorrent_jni.op_eq__SWIG_2(error_code.getCPtr(code), code, error_condition.getCPtr(condition), condition);
  }

  public static boolean op_neq(error_code lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_2(error_code.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_condition condition, error_code code) {
    return libtorrent_jni.op_eq__SWIG_3(error_condition.getCPtr(condition), condition, error_code.getCPtr(code), code);
  }

  public static boolean op_neq(error_condition lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_3(error_condition.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static long hash_value(error_code ec) {
    return libtorrent_jni.hash_value(error_code.getCPtr(ec), ec);
  }

  public static error_code make_error_code(errc_t e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static error_condition make_error_condition(errc_t e) {
    return new error_condition(libtorrent_jni.make_error_condition(e.swigValue()), true);
  }

  public static String version() {
    return libtorrent_jni.version();
  }

  public static error_category get_libtorrent_category() {
    return new error_category(libtorrent_jni.get_libtorrent_category(), false);
  }

  public static error_category get_http_category() {
    return new error_category(libtorrent_jni.get_http_category(), false);
  }

  public static stats_metric_vector session_stats_metrics() {
    return new stats_metric_vector(libtorrent_jni.session_stats_metrics(), true);
  }

  public static int find_metric_idx(String name) {
    return libtorrent_jni.find_metric_idx(name);
  }

  public static close_reason_t error_to_close_reason(error_code ec) {
    return close_reason_t.swigToEnum(libtorrent_jni.error_to_close_reason(error_code.getCPtr(ec), ec));
  }

  public static String operation_name(int op) {
    return libtorrent_jni.operation_name(op);
  }

  public static int getUser_alert_id() {
    return libtorrent_jni.user_alert_id_get();
  }

  public static int setting_by_name(String name) {
    return libtorrent_jni.setting_by_name(name);
  }

  public static String name_for_setting(int s) {
    return libtorrent_jni.name_for_setting(s);
  }

  public static void min_memory_usage(settings_pack set) {
    libtorrent_jni.min_memory_usage(settings_pack.getCPtr(set), set);
  }

  public static void high_performance_seed(settings_pack set) {
    libtorrent_jni.high_performance_seed(settings_pack.getCPtr(set), set);
  }

  public static void TORRENT_CFG() {
    libtorrent_jni.TORRENT_CFG();
  }

  public static int plus_one(int val) {
    return libtorrent_jni.plus_one(val);
  }

  public static int minus_one(int val) {
    return libtorrent_jni.minus_one(val);
  }

  public static error_category get_bdecode_category() {
    return new error_category(libtorrent_jni.get_bdecode_category(), false);
  }

  public static String make_magnet_uri(torrent_handle handle) {
    return libtorrent_jni.make_magnet_uri__SWIG_0(torrent_handle.getCPtr(handle), handle);
  }

  public static String make_magnet_uri(torrent_info info) {
    return libtorrent_jni.make_magnet_uri__SWIG_1(torrent_info.getCPtr(info), info);
  }

  public static void parse_magnet_uri(String uri, add_torrent_params p, error_code ec) {
    libtorrent_jni.parse_magnet_uri(uri, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec);
  }

  public static void add_files(file_storage fs, String file, long flags) {
    libtorrent_jni.add_files__SWIG_0(file_storage.getCPtr(fs), fs, file, flags);
  }

  public static void add_files(file_storage fs, String file) {
    libtorrent_jni.add_files__SWIG_1(file_storage.getCPtr(fs), fs, file);
  }

  public static void set_piece_hashes(create_torrent t, String p, error_code ec) {
    libtorrent_jni.set_piece_hashes(create_torrent.getCPtr(t), t, p, error_code.getCPtr(ec), ec);
  }

  public static void setSse42_support(boolean value) {
    libtorrent_jni.sse42_support_set(value);
  }

  public static boolean getSse42_support() {
    return libtorrent_jni.sse42_support_get();
  }

  public static void setMmx_support(boolean value) {
    libtorrent_jni.mmx_support_set(value);
  }

  public static boolean getMmx_support() {
    return libtorrent_jni.mmx_support_get();
  }

  public static void setArm_neon_support(boolean value) {
    libtorrent_jni.arm_neon_support_set(value);
  }

  public static boolean getArm_neon_support() {
    return libtorrent_jni.arm_neon_support_get();
  }

  public static void setArm_crc32c_support(boolean value) {
    libtorrent_jni.arm_crc32c_support_set(value);
  }

  public static boolean getArm_crc32c_support() {
    return libtorrent_jni.arm_crc32c_support_get();
  }

  public static boolean is_utp_stream_logging() {
    return libtorrent_jni.is_utp_stream_logging();
  }

  public static void set_utp_stream_logging(boolean enable) {
    libtorrent_jni.set_utp_stream_logging(enable);
  }

  public static void ed25519_create_seed(byte_vector seed) {
    libtorrent_jni.ed25519_create_seed(byte_vector.getCPtr(seed), seed);
  }

  public static void ed25519_create_keypair(byte_vector public_key, byte_vector private_key, byte_vector seed) {
    libtorrent_jni.ed25519_create_keypair(byte_vector.getCPtr(public_key), public_key, byte_vector.getCPtr(private_key), private_key, byte_vector.getCPtr(seed), seed);
  }

  public static void ed25519_sign(byte_vector signature, byte_vector message, byte_vector public_key, byte_vector private_key) {
    libtorrent_jni.ed25519_sign(byte_vector.getCPtr(signature), signature, byte_vector.getCPtr(message), message, byte_vector.getCPtr(public_key), public_key, byte_vector.getCPtr(private_key), private_key);
  }

  public static int ed25519_verify(byte_vector signature, byte_vector message, byte_vector private_key) {
    return libtorrent_jni.ed25519_verify(byte_vector.getCPtr(signature), signature, byte_vector.getCPtr(message), message, byte_vector.getCPtr(private_key), private_key);
  }

  public static void ed25519_add_scalar(byte_vector public_key, byte_vector private_key, byte_vector scalar) {
    libtorrent_jni.ed25519_add_scalar(byte_vector.getCPtr(public_key), public_key, byte_vector.getCPtr(private_key), private_key, byte_vector.getCPtr(scalar), scalar);
  }

  public static void ed25519_key_exchange(byte_vector shared_secret, byte_vector public_key, byte_vector private_key) {
    libtorrent_jni.ed25519_key_exchange(byte_vector.getCPtr(shared_secret), shared_secret, byte_vector.getCPtr(public_key), public_key, byte_vector.getCPtr(private_key), private_key);
  }

  public static boolean default_storage_disk_write_access_log() {
    return libtorrent_jni.default_storage_disk_write_access_log__SWIG_0();
  }

  public static void default_storage_disk_write_access_log(boolean enable) {
    libtorrent_jni.default_storage_disk_write_access_log__SWIG_1(enable);
  }

  public static void add_files(file_storage fs, String file, add_files_listener listener, long flags) {
    libtorrent_jni.add_files(file_storage.getCPtr(fs), fs, file, add_files_listener.getCPtr(listener), listener, flags);
  }

  public static void set_piece_hashes_ex(create_torrent t, String p, set_piece_hashes_listener listener, error_code ec) {
    libtorrent_jni.set_piece_hashes_ex(create_torrent.getCPtr(t), t, p, set_piece_hashes_listener.getCPtr(listener), listener, error_code.getCPtr(ec), ec);
  }

  public static int boost_version() {
    return libtorrent_jni.boost_version();
  }

  public static String boost_lib_version() {
    return libtorrent_jni.boost_lib_version();
  }

  public static int openssl_version_number() {
    return libtorrent_jni.openssl_version_number();
  }

  public static String openssl_version_text() {
    return libtorrent_jni.openssl_version_text();
  }

  public static void set_posix_wrapper(posix_wrapper obj) {
    libtorrent_jni.set_posix_wrapper(posix_wrapper.getCPtr(obj), obj);
  }

}

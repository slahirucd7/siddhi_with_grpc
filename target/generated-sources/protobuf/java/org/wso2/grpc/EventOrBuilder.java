// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventService.proto

package org.wso2.grpc;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:eventservice.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string payload = 1;</code>
   */
  java.lang.String getPayload();
  /**
   * <code>string payload = 1;</code>
   */
  com.google.protobuf.ByteString
      getPayloadBytes();

  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);
}

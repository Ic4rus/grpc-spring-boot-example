// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.proto.greeting;

/**
 * Protobuf type {@code GreetRequest}
 */
public final class GreetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GreetRequest)
    GreetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetRequest.newBuilder() to construct.
  private GreetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GreetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GreetRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.proto.greeting.Greeting.Builder subBuilder = null;
            if (greeting_ != null) {
              subBuilder = greeting_.toBuilder();
            }
            greeting_ = input.readMessage(com.proto.greeting.Greeting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(greeting_);
              greeting_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.greeting.GreetingOuterClass.internal_static_GreetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.greeting.GreetingOuterClass.internal_static_GreetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.greeting.GreetRequest.class, com.proto.greeting.GreetRequest.Builder.class);
  }

  public static final int GREETING_FIELD_NUMBER = 1;
  private com.proto.greeting.Greeting greeting_;
  /**
   * <code>.Greeting greeting = 1;</code>
   * @return Whether the greeting field is set.
   */
  @java.lang.Override
  public boolean hasGreeting() {
    return greeting_ != null;
  }
  /**
   * <code>.Greeting greeting = 1;</code>
   * @return The greeting.
   */
  @java.lang.Override
  public com.proto.greeting.Greeting getGreeting() {
    return greeting_ == null ? com.proto.greeting.Greeting.getDefaultInstance() : greeting_;
  }
  /**
   * <code>.Greeting greeting = 1;</code>
   */
  @java.lang.Override
  public com.proto.greeting.GreetingOrBuilder getGreetingOrBuilder() {
    return getGreeting();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (greeting_ != null) {
      output.writeMessage(1, getGreeting());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (greeting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGreeting());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.greeting.GreetRequest)) {
      return super.equals(obj);
    }
    com.proto.greeting.GreetRequest other = (com.proto.greeting.GreetRequest) obj;

    if (hasGreeting() != other.hasGreeting()) return false;
    if (hasGreeting()) {
      if (!getGreeting()
          .equals(other.getGreeting())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGreeting()) {
      hash = (37 * hash) + GREETING_FIELD_NUMBER;
      hash = (53 * hash) + getGreeting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.greeting.GreetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.GreetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greeting.GreetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greeting.GreetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.greeting.GreetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greeting.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.greeting.GreetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GreetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GreetRequest)
      com.proto.greeting.GreetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.greeting.GreetingOuterClass.internal_static_GreetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.greeting.GreetingOuterClass.internal_static_GreetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.greeting.GreetRequest.class, com.proto.greeting.GreetRequest.Builder.class);
    }

    // Construct using com.proto.greeting.GreetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (greetingBuilder_ == null) {
        greeting_ = null;
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.greeting.GreetingOuterClass.internal_static_GreetRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.greeting.GreetRequest getDefaultInstanceForType() {
      return com.proto.greeting.GreetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.greeting.GreetRequest build() {
      com.proto.greeting.GreetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.greeting.GreetRequest buildPartial() {
      com.proto.greeting.GreetRequest result = new com.proto.greeting.GreetRequest(this);
      if (greetingBuilder_ == null) {
        result.greeting_ = greeting_;
      } else {
        result.greeting_ = greetingBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.greeting.GreetRequest) {
        return mergeFrom((com.proto.greeting.GreetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.greeting.GreetRequest other) {
      if (other == com.proto.greeting.GreetRequest.getDefaultInstance()) return this;
      if (other.hasGreeting()) {
        mergeGreeting(other.getGreeting());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.greeting.GreetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.greeting.GreetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.greeting.Greeting greeting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greeting.Greeting, com.proto.greeting.Greeting.Builder, com.proto.greeting.GreetingOrBuilder> greetingBuilder_;
    /**
     * <code>.Greeting greeting = 1;</code>
     * @return Whether the greeting field is set.
     */
    public boolean hasGreeting() {
      return greetingBuilder_ != null || greeting_ != null;
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     * @return The greeting.
     */
    public com.proto.greeting.Greeting getGreeting() {
      if (greetingBuilder_ == null) {
        return greeting_ == null ? com.proto.greeting.Greeting.getDefaultInstance() : greeting_;
      } else {
        return greetingBuilder_.getMessage();
      }
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(com.proto.greeting.Greeting value) {
      if (greetingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        greeting_ = value;
        onChanged();
      } else {
        greetingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(
        com.proto.greeting.Greeting.Builder builderForValue) {
      if (greetingBuilder_ == null) {
        greeting_ = builderForValue.build();
        onChanged();
      } else {
        greetingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public Builder mergeGreeting(com.proto.greeting.Greeting value) {
      if (greetingBuilder_ == null) {
        if (greeting_ != null) {
          greeting_ =
            com.proto.greeting.Greeting.newBuilder(greeting_).mergeFrom(value).buildPartial();
        } else {
          greeting_ = value;
        }
        onChanged();
      } else {
        greetingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public Builder clearGreeting() {
      if (greetingBuilder_ == null) {
        greeting_ = null;
        onChanged();
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public com.proto.greeting.Greeting.Builder getGreetingBuilder() {
      
      onChanged();
      return getGreetingFieldBuilder().getBuilder();
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    public com.proto.greeting.GreetingOrBuilder getGreetingOrBuilder() {
      if (greetingBuilder_ != null) {
        return greetingBuilder_.getMessageOrBuilder();
      } else {
        return greeting_ == null ?
            com.proto.greeting.Greeting.getDefaultInstance() : greeting_;
      }
    }
    /**
     * <code>.Greeting greeting = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greeting.Greeting, com.proto.greeting.Greeting.Builder, com.proto.greeting.GreetingOrBuilder> 
        getGreetingFieldBuilder() {
      if (greetingBuilder_ == null) {
        greetingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.greeting.Greeting, com.proto.greeting.Greeting.Builder, com.proto.greeting.GreetingOrBuilder>(
                getGreeting(),
                getParentForChildren(),
                isClean());
        greeting_ = null;
      }
      return greetingBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GreetRequest)
  }

  // @@protoc_insertion_point(class_scope:GreetRequest)
  private static final com.proto.greeting.GreetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.greeting.GreetRequest();
  }

  public static com.proto.greeting.GreetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GreetRequest>() {
    @java.lang.Override
    public GreetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GreetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GreetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.greeting.GreetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


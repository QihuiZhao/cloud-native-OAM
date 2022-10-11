// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nfregister.proto

package org.xgvela.oam.nfregister;

/**
 * Protobuf type {@code nfregister.RegisterReq}
 */
public  final class RegisterReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nfregister.RegisterReq)
    RegisterReqOrBuilder {
  // Use RegisterReq.newBuilder() to construct.
  private RegisterReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterReq() {
    neId_ = "";
    vnfName_ = "";
    neType_ = "";
    vnfManageIp_ = "";
    vnfManagePort_ = "";
    vnfSignalPort_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RegisterReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            neId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            vnfName_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            neType_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            vnfManageIp_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            vnfManagePort_ = s;
            break;
          }
          case 50: {
            String s = input.readStringRequireUtf8();

            vnfSignalPort_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return NFRegister.internal_static_nfregister_RegisterReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return NFRegister.internal_static_nfregister_RegisterReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RegisterReq.class, Builder.class);
  }

  public static final int NEID_FIELD_NUMBER = 1;
  private volatile Object neId_;
  /**
   * <code>string neId = 1;</code>
   */
  public String getNeId() {
    Object ref = neId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      neId_ = s;
      return s;
    }
  }
  /**
   * <code>string neId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNeIdBytes() {
    Object ref = neId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      neId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VNFNAME_FIELD_NUMBER = 2;
  private volatile Object vnfName_;
  /**
   * <code>string vnfName = 2;</code>
   */
  public String getVnfName() {
    Object ref = vnfName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      vnfName_ = s;
      return s;
    }
  }
  /**
   * <code>string vnfName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVnfNameBytes() {
    Object ref = vnfName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      vnfName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETYPE_FIELD_NUMBER = 3;
  private volatile Object neType_;
  /**
   * <code>string neType = 3;</code>
   */
  public String getNeType() {
    Object ref = neType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      neType_ = s;
      return s;
    }
  }
  /**
   * <code>string neType = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNeTypeBytes() {
    Object ref = neType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      neType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VNFMANAGEIP_FIELD_NUMBER = 4;
  private volatile Object vnfManageIp_;
  /**
   * <code>string vnfManageIp = 4;</code>
   */
  public String getVnfManageIp() {
    Object ref = vnfManageIp_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      vnfManageIp_ = s;
      return s;
    }
  }
  /**
   * <code>string vnfManageIp = 4;</code>
   */
  public com.google.protobuf.ByteString
      getVnfManageIpBytes() {
    Object ref = vnfManageIp_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      vnfManageIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VNFMANAGEPORT_FIELD_NUMBER = 5;
  private volatile Object vnfManagePort_;
  /**
   * <code>string vnfManagePort = 5;</code>
   */
  public String getVnfManagePort() {
    Object ref = vnfManagePort_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      vnfManagePort_ = s;
      return s;
    }
  }
  /**
   * <code>string vnfManagePort = 5;</code>
   */
  public com.google.protobuf.ByteString
      getVnfManagePortBytes() {
    Object ref = vnfManagePort_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      vnfManagePort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VNFSIGNALPORT_FIELD_NUMBER = 6;
  private volatile Object vnfSignalPort_;
  /**
   * <code>string vnfSignalPort = 6;</code>
   */
  public String getVnfSignalPort() {
    Object ref = vnfSignalPort_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      vnfSignalPort_ = s;
      return s;
    }
  }
  /**
   * <code>string vnfSignalPort = 6;</code>
   */
  public com.google.protobuf.ByteString
      getVnfSignalPortBytes() {
    Object ref = vnfSignalPort_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      vnfSignalPort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, neId_);
    }
    if (!getVnfNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vnfName_);
    }
    if (!getNeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, neType_);
    }
    if (!getVnfManageIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, vnfManageIp_);
    }
    if (!getVnfManagePortBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, vnfManagePort_);
    }
    if (!getVnfSignalPortBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, vnfSignalPort_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, neId_);
    }
    if (!getVnfNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vnfName_);
    }
    if (!getNeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, neType_);
    }
    if (!getVnfManageIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, vnfManageIp_);
    }
    if (!getVnfManagePortBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, vnfManagePort_);
    }
    if (!getVnfSignalPortBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, vnfSignalPort_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RegisterReq)) {
      return super.equals(obj);
    }
    RegisterReq other = (RegisterReq) obj;

    boolean result = true;
    result = result && getNeId()
        .equals(other.getNeId());
    result = result && getVnfName()
        .equals(other.getVnfName());
    result = result && getNeType()
        .equals(other.getNeType());
    result = result && getVnfManageIp()
        .equals(other.getVnfManageIp());
    result = result && getVnfManagePort()
        .equals(other.getVnfManagePort());
    result = result && getVnfSignalPort()
        .equals(other.getVnfSignalPort());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NEID_FIELD_NUMBER;
    hash = (53 * hash) + getNeId().hashCode();
    hash = (37 * hash) + VNFNAME_FIELD_NUMBER;
    hash = (53 * hash) + getVnfName().hashCode();
    hash = (37 * hash) + NETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getNeType().hashCode();
    hash = (37 * hash) + VNFMANAGEIP_FIELD_NUMBER;
    hash = (53 * hash) + getVnfManageIp().hashCode();
    hash = (37 * hash) + VNFMANAGEPORT_FIELD_NUMBER;
    hash = (53 * hash) + getVnfManagePort().hashCode();
    hash = (37 * hash) + VNFSIGNALPORT_FIELD_NUMBER;
    hash = (53 * hash) + getVnfSignalPort().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RegisterReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RegisterReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RegisterReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code nfregister.RegisterReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nfregister.RegisterReq)
      RegisterReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NFRegister.internal_static_nfregister_RegisterReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NFRegister.internal_static_nfregister_RegisterReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RegisterReq.class, Builder.class);
    }

    // Construct using RegisterReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      neId_ = "";

      vnfName_ = "";

      neType_ = "";

      vnfManageIp_ = "";

      vnfManagePort_ = "";

      vnfSignalPort_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return NFRegister.internal_static_nfregister_RegisterReq_descriptor;
    }

    public RegisterReq getDefaultInstanceForType() {
      return RegisterReq.getDefaultInstance();
    }

    public RegisterReq build() {
      RegisterReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public RegisterReq buildPartial() {
      RegisterReq result = new RegisterReq(this);
      result.neId_ = neId_;
      result.vnfName_ = vnfName_;
      result.neType_ = neType_;
      result.vnfManageIp_ = vnfManageIp_;
      result.vnfManagePort_ = vnfManagePort_;
      result.vnfSignalPort_ = vnfSignalPort_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof RegisterReq) {
        return mergeFrom((RegisterReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RegisterReq other) {
      if (other == RegisterReq.getDefaultInstance()) return this;
      if (!other.getNeId().isEmpty()) {
        neId_ = other.neId_;
        onChanged();
      }
      if (!other.getVnfName().isEmpty()) {
        vnfName_ = other.vnfName_;
        onChanged();
      }
      if (!other.getNeType().isEmpty()) {
        neType_ = other.neType_;
        onChanged();
      }
      if (!other.getVnfManageIp().isEmpty()) {
        vnfManageIp_ = other.vnfManageIp_;
        onChanged();
      }
      if (!other.getVnfManagePort().isEmpty()) {
        vnfManagePort_ = other.vnfManagePort_;
        onChanged();
      }
      if (!other.getVnfSignalPort().isEmpty()) {
        vnfSignalPort_ = other.vnfSignalPort_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      RegisterReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RegisterReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object neId_ = "";
    /**
     * <code>string neId = 1;</code>
     */
    public String getNeId() {
      Object ref = neId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        neId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string neId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNeIdBytes() {
      Object ref = neId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        neId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string neId = 1;</code>
     */
    public Builder setNeId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      neId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string neId = 1;</code>
     */
    public Builder clearNeId() {
      
      neId_ = getDefaultInstance().getNeId();
      onChanged();
      return this;
    }
    /**
     * <code>string neId = 1;</code>
     */
    public Builder setNeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      neId_ = value;
      onChanged();
      return this;
    }

    private Object vnfName_ = "";
    /**
     * <code>string vnfName = 2;</code>
     */
    public String getVnfName() {
      Object ref = vnfName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        vnfName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string vnfName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVnfNameBytes() {
      Object ref = vnfName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        vnfName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vnfName = 2;</code>
     */
    public Builder setVnfName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vnfName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vnfName = 2;</code>
     */
    public Builder clearVnfName() {
      
      vnfName_ = getDefaultInstance().getVnfName();
      onChanged();
      return this;
    }
    /**
     * <code>string vnfName = 2;</code>
     */
    public Builder setVnfNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vnfName_ = value;
      onChanged();
      return this;
    }

    private Object neType_ = "";
    /**
     * <code>string neType = 3;</code>
     */
    public String getNeType() {
      Object ref = neType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        neType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string neType = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNeTypeBytes() {
      Object ref = neType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        neType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string neType = 3;</code>
     */
    public Builder setNeType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      neType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string neType = 3;</code>
     */
    public Builder clearNeType() {
      
      neType_ = getDefaultInstance().getNeType();
      onChanged();
      return this;
    }
    /**
     * <code>string neType = 3;</code>
     */
    public Builder setNeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      neType_ = value;
      onChanged();
      return this;
    }

    private Object vnfManageIp_ = "";
    /**
     * <code>string vnfManageIp = 4;</code>
     */
    public String getVnfManageIp() {
      Object ref = vnfManageIp_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        vnfManageIp_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string vnfManageIp = 4;</code>
     */
    public com.google.protobuf.ByteString
        getVnfManageIpBytes() {
      Object ref = vnfManageIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        vnfManageIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vnfManageIp = 4;</code>
     */
    public Builder setVnfManageIp(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vnfManageIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vnfManageIp = 4;</code>
     */
    public Builder clearVnfManageIp() {
      
      vnfManageIp_ = getDefaultInstance().getVnfManageIp();
      onChanged();
      return this;
    }
    /**
     * <code>string vnfManageIp = 4;</code>
     */
    public Builder setVnfManageIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vnfManageIp_ = value;
      onChanged();
      return this;
    }

    private Object vnfManagePort_ = "";
    /**
     * <code>string vnfManagePort = 5;</code>
     */
    public String getVnfManagePort() {
      Object ref = vnfManagePort_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        vnfManagePort_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string vnfManagePort = 5;</code>
     */
    public com.google.protobuf.ByteString
        getVnfManagePortBytes() {
      Object ref = vnfManagePort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        vnfManagePort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vnfManagePort = 5;</code>
     */
    public Builder setVnfManagePort(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vnfManagePort_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vnfManagePort = 5;</code>
     */
    public Builder clearVnfManagePort() {
      
      vnfManagePort_ = getDefaultInstance().getVnfManagePort();
      onChanged();
      return this;
    }
    /**
     * <code>string vnfManagePort = 5;</code>
     */
    public Builder setVnfManagePortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vnfManagePort_ = value;
      onChanged();
      return this;
    }

    private Object vnfSignalPort_ = "";
    /**
     * <code>string vnfSignalPort = 6;</code>
     */
    public String getVnfSignalPort() {
      Object ref = vnfSignalPort_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        vnfSignalPort_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string vnfSignalPort = 6;</code>
     */
    public com.google.protobuf.ByteString
        getVnfSignalPortBytes() {
      Object ref = vnfSignalPort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        vnfSignalPort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vnfSignalPort = 6;</code>
     */
    public Builder setVnfSignalPort(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vnfSignalPort_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vnfSignalPort = 6;</code>
     */
    public Builder clearVnfSignalPort() {
      
      vnfSignalPort_ = getDefaultInstance().getVnfSignalPort();
      onChanged();
      return this;
    }
    /**
     * <code>string vnfSignalPort = 6;</code>
     */
    public Builder setVnfSignalPortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vnfSignalPort_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:nfregister.RegisterReq)
  }

  // @@protoc_insertion_point(class_scope:nfregister.RegisterReq)
  private static final RegisterReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegisterReq();
  }

  public static RegisterReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterReq>
      PARSER = new com.google.protobuf.AbstractParser<RegisterReq>() {
    public RegisterReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RegisterReq> getParserForType() {
    return PARSER;
  }

  public RegisterReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


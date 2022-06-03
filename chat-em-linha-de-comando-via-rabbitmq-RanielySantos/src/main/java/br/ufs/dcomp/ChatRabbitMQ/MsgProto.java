package br.ufs.dcomp.ChatRabbitMQ;

import java.lang.*;

public final class MsgProto {
  private MsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MensagemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:br.ufs.dcomp.chat.Mensagem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string emissor = 1;</code>
     */
    java.lang.String getEmissor();
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string emissor = 1;</code>
     */
    com.google.protobuf.ByteString
        getEmissorBytes();

    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    java.lang.String getData();
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();

    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string hora = 3;</code>
     */
    java.lang.String getHora();
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string hora = 3;</code>
     */
    com.google.protobuf.ByteString
        getHoraBytes();

    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string grupo = 4;</code>
     */
    java.lang.String getGrupo();
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string grupo = 4;</code>
     */
    com.google.protobuf.ByteString
        getGrupoBytes();

    /**
     * <pre>
     * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
     * </pre>
     *
     * <code>string tipo = 5;</code>
     */
    java.lang.String getTipo();
    /**
     * <pre>
     * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
     * </pre>
     *
     * <code>string tipo = 5;</code>
     */
    com.google.protobuf.ByteString
        getTipoBytes();

    /**
     * <pre>
     * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
     * </pre>
     *
     * <code>string nome = 6;</code>
     */
    java.lang.String getNome();
    /**
     * <pre>
     * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
     * </pre>
     *
     * <code>string nome = 6;</code>
     */
    com.google.protobuf.ByteString
        getNomeBytes();

    /**
     * <pre>
     * Sequência de bytes que compõe o corpo da mensagem
     * </pre>
     *
     * <code>bytes corpo = 7;</code>
     */
    com.google.protobuf.ByteString getCorpo();
  }
  /**
   * Protobuf type {@code br.ufs.dcomp.chat.Mensagem}
   */
  public  static final class Mensagem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:br.ufs.dcomp.chat.Mensagem)
      MensagemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mensagem.newBuilder() to construct.
    private Mensagem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mensagem() {
      emissor_ = "";
      data_ = "";
      hora_ = "";
      grupo_ = "";
      tipo_ = "";
      nome_ = "";
      corpo_ = com.google.protobuf.ByteString.EMPTY;
    }
    
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mensagem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Mensagem(
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
              java.lang.String s = input.readStringRequireUtf8();

              emissor_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              data_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              hora_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              grupo_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              tipo_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              nome_ = s;
              break;
            }
            case 58: {

              corpo_ = input.readBytes();
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
      return MsgProto.internal_static_Mensagem_descriptor;    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MsgProto.internal_static_Mensagem_fieldAccessorTable .ensureFieldAccessorsInitialized(
        MsgProto.Mensagem.class, MsgProto.Mensagem.Builder.class);
    }

    public static final int EMISSOR_FIELD_NUMBER = 1;
    private volatile java.lang.Object emissor_;
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string emissor = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getEmissor() {
      java.lang.Object ref = emissor_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emissor_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string emissor = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmissorBytes() {
      java.lang.Object ref = emissor_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emissor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private volatile java.lang.Object data_;
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string data = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HORA_FIELD_NUMBER = 3;
    private volatile java.lang.Object hora_;
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string hora = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getHora() {
      java.lang.Object ref = hora_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hora_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string hora = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHoraBytes() {
      java.lang.Object ref = hora_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hora_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GRUPO_FIELD_NUMBER = 4;
    private volatile java.lang.Object grupo_;
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string grupo = 4;</code>
     */
    @java.lang.Override
    public java.lang.String getGrupo() {
      java.lang.Object ref = grupo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grupo_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string grupo = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGrupoBytes() {
      java.lang.Object ref = grupo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grupo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIPO_FIELD_NUMBER = 5;
    private volatile java.lang.Object tipo_;
    /**
     * <pre>
     * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
     * </pre>
     *
     * <code>string tipo = 5;</code>
     */
    @java.lang.Override
    public java.lang.String getTipo() {
      java.lang.Object ref = tipo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tipo_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
     * </pre>
     *
     * <code>string tipo = 5;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTipoBytes() {
      java.lang.Object ref = tipo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tipo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NOME_FIELD_NUMBER = 6;
    private volatile java.lang.Object nome_;
    /**
     * <pre>
     * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
     * </pre>
     *
     * <code>string nome = 6;</code>
     */
    @java.lang.Override
    public java.lang.String getNome() {
      java.lang.Object ref = nome_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nome_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
     * </pre>
     *
     * <code>string nome = 6;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNomeBytes() {
      java.lang.Object ref = nome_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nome_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CORPO_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString corpo_;
    /**
     * <pre>
     * Sequência de bytes que compõe o corpo da mensagem
     * </pre>
     *
     * <code>bytes corpo = 7;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCorpo() {
      return corpo_;
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
      if (!getEmissorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emissor_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, data_);
      }
      if (!getHoraBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hora_);
      }
      if (!getGrupoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, grupo_);
      }
      if (!getTipoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, tipo_);
      }
      if (!getNomeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, nome_);
      }
      if (!corpo_.isEmpty()) {
        output.writeBytes(7, corpo_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEmissorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emissor_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, data_);
      }
      if (!getHoraBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hora_);
      }
      if (!getGrupoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, grupo_);
      }
      if (!getTipoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, tipo_);
      }
      if (!getNomeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, nome_);
      }
      if (!corpo_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, corpo_);
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
      if (!(obj instanceof MsgProto.Mensagem)) {
        return super.equals(obj);
      }
      MsgProto.Mensagem other = (MsgProto.Mensagem) obj;
      if (!getEmissor()
          .equals(other.getEmissor())) return false;
      if (!getData()
          .equals(other.getData())) return false;
      if (!getHora()
          .equals(other.getHora())) return false;
      if (!getGrupo()
          .equals(other.getGrupo())) return false;
      if (!getTipo()
          .equals(other.getTipo())) return false;
      if (!getNome()
          .equals(other.getNome())) return false;
      if (!getCorpo()
          .equals(other.getCorpo())) return false;
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
      hash = (37 * hash) + EMISSOR_FIELD_NUMBER;
      hash = (53 * hash) + getEmissor().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + HORA_FIELD_NUMBER;
      hash = (53 * hash) + getHora().hashCode();
      hash = (37 * hash) + GRUPO_FIELD_NUMBER;
      hash = (53 * hash) + getGrupo().hashCode();
      hash = (37 * hash) + TIPO_FIELD_NUMBER;
      hash = (53 * hash) + getTipo().hashCode();
      hash = (37 * hash) + NOME_FIELD_NUMBER;
      hash = (53 * hash) + getNome().hashCode();
      hash = (37 * hash) + CORPO_FIELD_NUMBER;
      hash = (53 * hash) + getCorpo().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MsgProto.Mensagem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MsgProto.Mensagem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MsgProto.Mensagem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MsgProto.Mensagem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MsgProto.Mensagem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MsgProto.Mensagem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MsgProto.Mensagem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MsgProto.Mensagem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MsgProto.Mensagem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MsgProto.Mensagem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MsgProto.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MsgProto.Mensagem parseFrom(
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
    public static Builder newBuilder(MsgProto.Mensagem prototype) {
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
     * Protobuf type {@code Mensagem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements: Mensagem)
        MsgProto.MensagemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MsgProto.internal_static_Mensagem_descriptor;
          }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MsgProto.internal_static_Mensagem_fieldAccessorTable 
        .ensureFieldAccessorsInitialized(
          MsgProto.Mensagem.class, MsgProto.Mensagem.Builder.class);      }

      // Construct MsgProto.Mensagem.newBuilder()
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
        emissor_ = "";

        data_ = "";

        hora_ = "";

        grupo_ = "";

        tipo_ = "";

        nome_ = "";

        corpo_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MsgProto.internal_static_Mensagem_descriptor;
      }
      @java.lang.Override
      public MsgProto.Mensagem getDefaultInstanceForType() {
        return MsgProto.Mensagem.getDefaultInstance();
      }
      @java.lang.Override
      public MsgProto.Mensagem build() {
        MsgProto.Mensagem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MsgProto.Mensagem buildPartial() {
        MsgProto.Mensagem result = new MsgProto.Mensagem(this);
        result.emissor_ = emissor_;
        result.data_ = data_;
        result.hora_ = hora_;
        result.grupo_ = grupo_;
        result.tipo_ = tipo_;
        result.nome_ = nome_;
        result.corpo_ = corpo_;
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
        if (other instanceof MsgProto.Mensagem) {
          return mergeFrom((MsgProto.Mensagem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MsgProto.Mensagem other) {
        if (other == MsgProto.Mensagem.getDefaultInstance()) return this;
        if (!other.getEmissor().isEmpty()) {
          emissor_ = other.emissor_;
          onChanged();
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
        }
        if (!other.getHora().isEmpty()) {
          hora_ = other.hora_;
          onChanged();
        }
        if (!other.getGrupo().isEmpty()) {
          grupo_ = other.grupo_;
          onChanged();
        }
        if (!other.getTipo().isEmpty()) {
          tipo_ = other.tipo_;
          onChanged();
        }
        if (!other.getNome().isEmpty()) {
          nome_ = other.nome_;
          onChanged();
        }
        if (other.getCorpo() != com.google.protobuf.ByteString.EMPTY) {
          setCorpo(other.getCorpo());
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
        MsgProto.Mensagem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MsgProto.Mensagem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object emissor_ = "";
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string emissor = 1;</code>
       */
      public java.lang.String getEmissor() {
        java.lang.Object ref = emissor_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          emissor_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string emissor = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEmissorBytes() {
        java.lang.Object ref = emissor_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          emissor_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string emissor = 1;</code>
       */
      public Builder setEmissor(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        emissor_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string emissor = 1;</code>
       */
      public Builder clearEmissor() {
        
        emissor_ = getDefaultInstance().getEmissor();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string emissor = 1;</code>
       */
      public Builder setEmissorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        emissor_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string data = 2;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string data = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string data = 2;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string data = 2;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string data = 2;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object hora_ = "";
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string hora = 3;</code>
       */
      public java.lang.String getHora() {
        java.lang.Object ref = hora_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hora_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string hora = 3;</code>
       */
      public com.google.protobuf.ByteString
          getHoraBytes() {
        java.lang.Object ref = hora_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hora_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string hora = 3;</code>
       */
      public Builder setHora(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hora_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string hora = 3;</code>
       */
      public Builder clearHora() {
        
        hora_ = getDefaultInstance().getHora();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string hora = 3;</code>
       */
      public Builder setHoraBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hora_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object grupo_ = "";
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string grupo = 4;</code>
       */
      public java.lang.String getGrupo() {
        java.lang.Object ref = grupo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          grupo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string grupo = 4;</code>
       */
      public com.google.protobuf.ByteString
          getGrupoBytes() {
        java.lang.Object ref = grupo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          grupo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string grupo = 4;</code>
       */
      public Builder setGrupo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        grupo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string grupo = 4;</code>
       */
      public Builder clearGrupo() {
        
        grupo_ = getDefaultInstance().getGrupo();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string grupo = 4;</code>
       */
      public Builder setGrupoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        grupo_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object tipo_ = "";
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string tipo = 5;</code>
       */
      public java.lang.String getTipo() {
        java.lang.Object ref = tipo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tipo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string tipo = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTipoBytes() {
        java.lang.Object ref = tipo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tipo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string tipo = 5;</code>
       */
      public Builder setTipo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tipo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string tipo = 5;</code>
       */
      public Builder clearTipo() {
        
        tipo_ = getDefaultInstance().getTipo();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string tipo = 5;</code>
       */
      public Builder setTipoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tipo_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nome_ = "";
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string nome = 6;</code>
       */
      public java.lang.String getNome() {
        java.lang.Object ref = nome_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nome_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string nome = 6;</code>
       */
      public com.google.protobuf.ByteString
          getNomeBytes() {
        java.lang.Object ref = nome_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nome_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string nome = 6;</code>
       */
      public Builder setNome(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nome_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string nome = 6;</code>
       */
      public Builder clearNome() {
        
        nome_ = getDefaultInstance().getNome();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string nome = 6;</code>
       */
      public Builder setNomeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nome_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString corpo_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Sequência de bytes que compõe o corpo da mensagem
       * </pre>
       *
       * <code>bytes corpo = 7;</code>
       */
      public com.google.protobuf.ByteString getCorpo() {
        return corpo_;
      }
      /**
       * <pre>
       * Sequência de bytes que compõe o corpo da mensagem
       * </pre>
       *
       * <code>bytes corpo = 7;</code>
       */
      public Builder setCorpo(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        corpo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Sequência de bytes que compõe o corpo da mensagem
       * </pre>
       *
       * <code>bytes corpo = 7;</code>
       */
      public Builder clearCorpo() {
        
        corpo_ = getDefaultInstance().getCorpo();
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:br.ufs.dcomp.chat.Mensagem)
    }

    // @@protoc_insertion_point(class_scope:br.ufs.dcomp.chat.Mensagem)
    private static final MsgProto.Mensagem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MsgProto.Mensagem();
    }

    public static MsgProto.Mensagem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mensagem>
        PARSER = new com.google.protobuf.AbstractParser<Mensagem>() {
      @java.lang.Override
      public Mensagem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Mensagem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Mensagem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mensagem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MsgProto.Mensagem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mensagem_descriptor;
    private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mensagem_fieldAccessorTable;
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024teste/messenger.proto\"q\n\010Mensagem\022\017\n\007em" +
      "issor\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\022\014\n\004hora\030\003 \001(\t\022" +
      "\r\n\005grupo\030\004 \001(\t\022\014\n\004tipo\030\005 \001(\t\022\014\n\004nome\030\006 \001" +
      "(\t\022\r\n\005corpo\030\007 \001(\014B\017B\rMsgProtob\006proto3"
    /*
    java.lang.String[] descriptorData = {
      "\n\016messenger.proto\022\021br.ufs.dcomp.ChatRabbitMQ\"q\n\010M" +
      "ensagem\022\017\n\007emissor\030\001 \001(\t\022\014\n\004data\030\002 \001(\t\022\014" +
      "\n\004hora\030\003 \001(\t\022\r\n\005grupo\030\004 \001(\t\022\014\n\004tipo\030\005 \001(" +
      "\t\022\014\n\004nome\030\006 \001(\t\022\r\n\005corpo\030\007 \001(\014B\"\n\021br.ufs" +
      ".dcomp.ChatRabbitMQB\rMsgProtob\006proto3"
      */
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mensagem_descriptor,
        new java.lang.String[] { "Emissor", "Data", "Hora", "Grupo", "Tipo", "Nome", "Corpo", });
  }

}
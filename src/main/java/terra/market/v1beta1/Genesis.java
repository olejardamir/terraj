// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: terra/market/v1beta1/genesis.proto

package terra.market.v1beta1;

public final class Genesis {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_terra_market_v1beta1_GenesisState_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_terra_market_v1beta1_GenesisState_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\"terra/market/v1beta1/genesis.proto\022\024te" +
                        "rra.market.v1beta1\032\024gogoproto/gogo.proto" +
                        "\032!terra/market/v1beta1/market.proto\"\214\001\n\014" +
                        "GenesisState\0222\n\006params\030\001 \001(\0132\034.terra.mar" +
                        "ket.v1beta1.ParamsB\004\310\336\037\000\022H\n\020terra_pool_d" +
                        "elta\030\002 \001(\014B.\332\336\037&github.com/cosmos/cosmos" +
                        "-sdk/types.Dec\310\336\037\000B,Z*github.com/terra-m" +
                        "oney/core/x/market/typesb\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.google.protobuf.GoGoProtos.getDescriptor(),
                                terra.market.v1beta1.Market.getDescriptor(),
                        });
        internal_static_terra_market_v1beta1_GenesisState_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_terra_market_v1beta1_GenesisState_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_terra_market_v1beta1_GenesisState_descriptor,
                new java.lang.String[]{"Params", "TerraPoolDelta",});
        com.google.protobuf.ExtensionRegistry registry =
                com.google.protobuf.ExtensionRegistry.newInstance();
        registry.add(com.google.protobuf.GoGoProtos.customtype);
        registry.add(com.google.protobuf.GoGoProtos.nullable);
        com.google.protobuf.Descriptors.FileDescriptor
                .internalUpdateFileDescriptor(descriptor, registry);
        com.google.protobuf.GoGoProtos.getDescriptor();
        terra.market.v1beta1.Market.getDescriptor();
    }

    private Genesis() {
    }

    public static void registerAllExtensions() {
        registerAllExtensions(
        );
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    public interface GenesisStateOrBuilder extends
            // @@protoc_insertion_point(interface_extends:terra.market.v1beta1.GenesisState)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         *
         * @return Whether the params field is set.
         */
        boolean hasParams();

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         *
         * @return The params.
         */
        terra.market.v1beta1.Market.Params getParams();

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         */
        terra.market.v1beta1.Market.ParamsOrBuilder getParamsOrBuilder();

        /**
         * <pre>
         * the gap between the TerraPool and the BasePool
         * </pre>
         *
         * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
         *
         * @return The terraPoolDelta.
         */
        com.google.protobuf.ByteString getTerraPoolDelta();
    }

    /**
     * <pre>
     * GenesisState defines the market module's genesis state.
     * </pre>
     * <p>
     * Protobuf type {@code terra.market.v1beta1.GenesisState}
     */
    public static final class GenesisState extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:terra.market.v1beta1.GenesisState)
            GenesisStateOrBuilder {
        public static final int PARAMS_FIELD_NUMBER = 1;
        public static final int TERRA_POOL_DELTA_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:terra.market.v1beta1.GenesisState)
        private static final terra.market.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<GenesisState>
                PARSER = new com.google.protobuf.AbstractParser<>() {
            @java.lang.Override
            public GenesisState parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new GenesisState(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new terra.market.v1beta1.Genesis.GenesisState();
        }

        private terra.market.v1beta1.Market.Params params_;
        private com.google.protobuf.ByteString terraPoolDelta_;
        private byte memoizedIsInitialized = -1;
        // Use GenesisState.newBuilder() to construct.
        private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GenesisState() {
            terraPoolDelta_ = com.google.protobuf.ByteString.EMPTY;
        }

        private GenesisState(
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
                            terra.market.v1beta1.Market.Params.Builder subBuilder = null;
                            if (params_ != null) {
                                subBuilder = params_.toBuilder();
                            }
                            params_ = input.readMessage(terra.market.v1beta1.Market.Params.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(params_);
                                params_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 18: {

                            terraPoolDelta_ = input.readBytes();
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

        public static com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return terra.market.v1beta1.Genesis.internal_static_terra_market_v1beta1_GenesisState_descriptor;
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static terra.market.v1beta1.Genesis.GenesisState parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(terra.market.v1beta1.Genesis.GenesisState prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static terra.market.v1beta1.Genesis.GenesisState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<GenesisState> parser() {
            return PARSER;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new GenesisState();
        }

        @java.lang.Override
        public com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return terra.market.v1beta1.Genesis.internal_static_terra_market_v1beta1_GenesisState_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            terra.market.v1beta1.Genesis.GenesisState.class, terra.market.v1beta1.Genesis.GenesisState.Builder.class);
        }

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         *
         * @return Whether the params field is set.
         */
        @java.lang.Override
        public boolean hasParams() {
            return params_ != null;
        }

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         *
         * @return The params.
         */
        @java.lang.Override
        public terra.market.v1beta1.Market.Params getParams() {
            return params_ == null ? terra.market.v1beta1.Market.Params.getDefaultInstance() : params_;
        }

        /**
         * <pre>
         * params defines all the paramaters of the module.
         * </pre>
         *
         * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
         */
        @java.lang.Override
        public terra.market.v1beta1.Market.ParamsOrBuilder getParamsOrBuilder() {
            return getParams();
        }

        /**
         * <pre>
         * the gap between the TerraPool and the BasePool
         * </pre>
         *
         * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
         *
         * @return The terraPoolDelta.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getTerraPoolDelta() {
            return terraPoolDelta_;
        }

        @java.lang.Override
        public boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (params_ != null) {
                output.writeMessage(1, getParams());
            }
            if (!terraPoolDelta_.isEmpty()) {
                output.writeBytes(2, terraPoolDelta_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (params_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getParams());
            }
            if (!terraPoolDelta_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, terraPoolDelta_);
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
            if (!(obj instanceof terra.market.v1beta1.Genesis.GenesisState)) {
                return super.equals(obj);
            }
            terra.market.v1beta1.Genesis.GenesisState other = (terra.market.v1beta1.Genesis.GenesisState) obj;

            if (hasParams() != other.hasParams()) return false;
            if (hasParams()) {
                if (!getParams()
                        .equals(other.getParams())) return false;
            }
            if (!getTerraPoolDelta()
                    .equals(other.getTerraPoolDelta())) return false;
            return unknownFields.equals(other.unknownFields);
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasParams()) {
                hash = (37 * hash) + PARAMS_FIELD_NUMBER;
                hash = (53 * hash) + getParams().hashCode();
            }
            hash = (37 * hash) + TERRA_POOL_DELTA_FIELD_NUMBER;
            hash = (53 * hash) + getTerraPoolDelta().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GenesisState> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public terra.market.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * <pre>
         * GenesisState defines the market module's genesis state.
         * </pre>
         * <p>
         * Protobuf type {@code terra.market.v1beta1.GenesisState}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:terra.market.v1beta1.GenesisState)
                terra.market.v1beta1.Genesis.GenesisStateOrBuilder {
            private terra.market.v1beta1.Market.Params params_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    terra.market.v1beta1.Market.Params, terra.market.v1beta1.Market.Params.Builder, terra.market.v1beta1.Market.ParamsOrBuilder> paramsBuilder_;
            private com.google.protobuf.ByteString terraPoolDelta_ = com.google.protobuf.ByteString.EMPTY;

            // Construct using terra.market.v1beta1.Genesis.GenesisState.newBuilder()
            private Builder() {
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
            }

            public static com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return terra.market.v1beta1.Genesis.internal_static_terra_market_v1beta1_GenesisState_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return terra.market.v1beta1.Genesis.internal_static_terra_market_v1beta1_GenesisState_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                terra.market.v1beta1.Genesis.GenesisState.class, terra.market.v1beta1.Genesis.GenesisState.Builder.class);
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (paramsBuilder_ == null) {
                    params_ = null;
                } else {
                    params_ = null;
                    paramsBuilder_ = null;
                }
                terraPoolDelta_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return terra.market.v1beta1.Genesis.internal_static_terra_market_v1beta1_GenesisState_descriptor;
            }

            @java.lang.Override
            public terra.market.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
                return terra.market.v1beta1.Genesis.GenesisState.getDefaultInstance();
            }

            @java.lang.Override
            public terra.market.v1beta1.Genesis.GenesisState build() {
                terra.market.v1beta1.Genesis.GenesisState result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public terra.market.v1beta1.Genesis.GenesisState buildPartial() {
                terra.market.v1beta1.Genesis.GenesisState result = new terra.market.v1beta1.Genesis.GenesisState(this);
                if (paramsBuilder_ == null) {
                    result.params_ = params_;
                } else {
                    result.params_ = paramsBuilder_.build();
                }
                result.terraPoolDelta_ = terraPoolDelta_;
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
                if (other instanceof terra.market.v1beta1.Genesis.GenesisState) {
                    return mergeFrom((terra.market.v1beta1.Genesis.GenesisState) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(terra.market.v1beta1.Genesis.GenesisState other) {
                if (other == terra.market.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
                if (other.hasParams()) {
                    mergeParams(other.getParams());
                }
                if (other.getTerraPoolDelta() != com.google.protobuf.ByteString.EMPTY) {
                    setTerraPoolDelta(other.getTerraPoolDelta());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                terra.market.v1beta1.Genesis.GenesisState parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (terra.market.v1beta1.Genesis.GenesisState) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             *
             * @return Whether the params field is set.
             */
            public boolean hasParams() {
                return paramsBuilder_ != null || params_ != null;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             *
             * @return The params.
             */
            public terra.market.v1beta1.Market.Params getParams() {
                if (paramsBuilder_ == null) {
                    return params_ == null ? terra.market.v1beta1.Market.Params.getDefaultInstance() : params_;
                } else {
                    return paramsBuilder_.getMessage();
                }
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public Builder setParams(terra.market.v1beta1.Market.Params value) {
                if (paramsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    params_ = value;
                    onChanged();
                } else {
                    paramsBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public Builder setParams(
                    terra.market.v1beta1.Market.Params.Builder builderForValue) {
                if (paramsBuilder_ == null) {
                    params_ = builderForValue.build();
                    onChanged();
                } else {
                    paramsBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public Builder mergeParams(terra.market.v1beta1.Market.Params value) {
                if (paramsBuilder_ == null) {
                    if (params_ != null) {
                        params_ =
                                terra.market.v1beta1.Market.Params.newBuilder(params_).mergeFrom(value).buildPartial();
                    } else {
                        params_ = value;
                    }
                    onChanged();
                } else {
                    paramsBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public Builder clearParams() {
                if (paramsBuilder_ == null) {
                    params_ = null;
                    onChanged();
                } else {
                    params_ = null;
                    paramsBuilder_ = null;
                }

                return this;
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public terra.market.v1beta1.Market.Params.Builder getParamsBuilder() {

                onChanged();
                return getParamsFieldBuilder().getBuilder();
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            public terra.market.v1beta1.Market.ParamsOrBuilder getParamsOrBuilder() {
                if (paramsBuilder_ != null) {
                    return paramsBuilder_.getMessageOrBuilder();
                } else {
                    return params_ == null ?
                            terra.market.v1beta1.Market.Params.getDefaultInstance() : params_;
                }
            }

            /**
             * <pre>
             * params defines all the paramaters of the module.
             * </pre>
             *
             * <code>.terra.market.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    terra.market.v1beta1.Market.Params, terra.market.v1beta1.Market.Params.Builder, terra.market.v1beta1.Market.ParamsOrBuilder>
            getParamsFieldBuilder() {
                if (paramsBuilder_ == null) {
                    paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<>(
                            getParams(),
                            getParentForChildren(),
                            isClean());
                    params_ = null;
                }
                return paramsBuilder_;
            }

            /**
             * <pre>
             * the gap between the TerraPool and the BasePool
             * </pre>
             *
             * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
             *
             * @return The terraPoolDelta.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getTerraPoolDelta() {
                return terraPoolDelta_;
            }

            /**
             * <pre>
             * the gap between the TerraPool and the BasePool
             * </pre>
             *
             * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
             *
             * @param value The terraPoolDelta to set.
             * @return This builder for chaining.
             */
            public Builder setTerraPoolDelta(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                terraPoolDelta_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * the gap between the TerraPool and the BasePool
             * </pre>
             *
             * <code>bytes terra_pool_delta = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTerraPoolDelta() {

                terraPoolDelta_ = getDefaultInstance().getTerraPoolDelta();
                onChanged();
                return this;
            }

            @java.lang.Override
            public Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:terra.market.v1beta1.GenesisState)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}

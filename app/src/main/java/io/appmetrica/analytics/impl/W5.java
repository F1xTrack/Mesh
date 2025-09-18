package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class W5 extends MessageNano {
    public static volatile W5[] d;
    public V5 a;
    public String b;
    public int c;

    public W5() {
        a();
    }

    public static W5[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new W5[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final W5 a() {
        this.a = null;
        this.b = "";
        this.c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        V5 v5 = this.a;
        if (v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, v5);
        }
        if (!this.b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        int i = this.c;
        return i != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        V5 v5 = this.a;
        if (v5 != null) {
            codedOutputByteBufferNano.writeMessage(1, v5);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        int i = this.c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new V5();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.c = int32;
                }
            }
        }
    }

    public static W5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W5().mergeFrom(codedInputByteBufferNano);
    }

    public static W5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W5) MessageNano.mergeFrom(new W5(), bArr);
    }
}

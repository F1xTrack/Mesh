package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g8 */
/* loaded from: classes2.dex */
public final class C4570g8 extends MessageNano {
    public static volatile C4570g8[] c;
    public int a;
    public C4472c8 b;

    public C4570g8() {
        a();
    }

    public static C4570g8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4570g8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4570g8 a() {
        this.a = 0;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C4472c8 c4472c8 = this.b;
        return c4472c8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4472c8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C4472c8 c4472c8 = this.b;
        if (c4472c8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4472c8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4570g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new C4472c8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C4570g8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4570g8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4570g8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4570g8) MessageNano.mergeFrom(new C4570g8(), bArr);
    }
}

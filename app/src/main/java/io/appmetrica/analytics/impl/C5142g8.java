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
public final class C5142g8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5142g8[] f31750c;

    /* renamed from: a */
    public int f31751a;

    /* renamed from: b */
    public C5042c8 f31752b;

    public C5142g8() {
        m20442a();
    }

    /* renamed from: b */
    public static C5142g8[] m20441b() {
        if (f31750c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31750c == null) {
                        f31750c = new C5142g8[0];
                    }
                } finally {
                }
            }
        }
        return f31750c;
    }

    /* renamed from: a */
    public final C5142g8 m20442a() {
        this.f31751a = 0;
        this.f31752b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31751a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C5042c8 c5042c8 = this.f31752b;
        return c5042c8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5042c8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31751a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C5042c8 c5042c8 = this.f31752b;
        if (c5042c8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5042c8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5142g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31751a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31752b == null) {
                    this.f31752b = new C5042c8();
                }
                codedInputByteBufferNano.readMessage(this.f31752b);
            }
        }
    }

    /* renamed from: b */
    public static C5142g8 m20440b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5142g8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5142g8 m20439a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5142g8) MessageNano.mergeFrom(new C5142g8(), bArr);
    }
}

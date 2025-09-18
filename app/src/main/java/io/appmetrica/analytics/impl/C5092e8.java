package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e8 */
/* loaded from: classes2.dex */
public final class C5092e8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5092e8[] f31555c;

    /* renamed from: a */
    public long f31556a;

    /* renamed from: b */
    public int f31557b;

    public C5092e8() {
        m20327a();
    }

    /* renamed from: b */
    public static C5092e8[] m20326b() {
        if (f31555c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31555c == null) {
                        f31555c = new C5092e8[0];
                    }
                } finally {
                }
            }
        }
        return f31555c;
    }

    /* renamed from: a */
    public final C5092e8 m20327a() {
        this.f31556a = 0L;
        this.f31557b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f31556a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f31557b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f31556a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f31557b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5092e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31556a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31557b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C5092e8 m20325b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5092e8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5092e8 m20324a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5092e8) MessageNano.mergeFrom(new C5092e8(), bArr);
    }
}

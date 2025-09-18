package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.X5 */
/* loaded from: classes2.dex */
public final class C4917X5 extends MessageNano {

    /* renamed from: c */
    public static volatile C4917X5[] f31012c;

    /* renamed from: a */
    public byte[] f31013a;

    /* renamed from: b */
    public byte[] f31014b;

    public C4917X5() {
        m19967a();
    }

    /* renamed from: b */
    public static C4917X5[] m19966b() {
        if (f31012c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31012c == null) {
                        f31012c = new C4917X5[0];
                    }
                } finally {
                }
            }
        }
        return f31012c;
    }

    /* renamed from: a */
    public final C4917X5 m19967a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31013a = bArr;
        this.f31014b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31013a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31013a);
        }
        return !Arrays.equals(this.f31014b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f31014b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31013a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31013a);
        }
        if (!Arrays.equals(this.f31014b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f31014b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4917X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31013a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31014b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4917X5 m19965b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4917X5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4917X5 m19964a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4917X5) MessageNano.mergeFrom(new C4917X5(), bArr);
    }
}

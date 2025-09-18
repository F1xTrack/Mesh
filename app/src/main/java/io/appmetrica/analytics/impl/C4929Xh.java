package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Xh */
/* loaded from: classes2.dex */
public final class C4929Xh extends MessageNano {

    /* renamed from: c */
    public static volatile C4929Xh[] f31050c;

    /* renamed from: a */
    public byte[] f31051a;

    /* renamed from: b */
    public byte[] f31052b;

    public C4929Xh() {
        m19981a();
    }

    /* renamed from: b */
    public static C4929Xh[] m19980b() {
        if (f31050c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31050c == null) {
                        f31050c = new C4929Xh[0];
                    }
                } finally {
                }
            }
        }
        return f31050c;
    }

    /* renamed from: a */
    public final C4929Xh m19981a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31051a = bArr;
        this.f31052b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31051a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31051a);
        }
        return !Arrays.equals(this.f31052b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f31052b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31051a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31051a);
        }
        if (!Arrays.equals(this.f31052b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f31052b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4929Xh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31051a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31052b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4929Xh m19979b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4929Xh().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4929Xh m19978a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4929Xh) MessageNano.mergeFrom(new C4929Xh(), bArr);
    }
}

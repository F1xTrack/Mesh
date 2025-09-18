package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i8 */
/* loaded from: classes2.dex */
public final class C5192i8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5192i8[] f31914c;

    /* renamed from: a */
    public byte[] f31915a;

    /* renamed from: b */
    public byte[] f31916b;

    public C5192i8() {
        m20570a();
    }

    /* renamed from: b */
    public static C5192i8[] m20569b() {
        if (f31914c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31914c == null) {
                        f31914c = new C5192i8[0];
                    }
                } finally {
                }
            }
        }
        return f31914c;
    }

    /* renamed from: a */
    public final C5192i8 m20570a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31915a = bArr;
        this.f31916b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31915a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31915a);
        }
        return !Arrays.equals(this.f31916b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f31916b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31915a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31915a);
        }
        if (!Arrays.equals(this.f31916b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f31916b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5192i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31915a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31916b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C5192i8 m20568b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5192i8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5192i8 m20567a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5192i8) MessageNano.mergeFrom(new C5192i8(), bArr);
    }
}

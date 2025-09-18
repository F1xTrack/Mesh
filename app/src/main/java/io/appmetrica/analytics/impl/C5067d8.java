package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d8 */
/* loaded from: classes2.dex */
public final class C5067d8 extends MessageNano {

    /* renamed from: b */
    public static volatile C5067d8[] f31471b;

    /* renamed from: a */
    public byte[][] f31472a;

    public C5067d8() {
        m20273a();
    }

    /* renamed from: b */
    public static C5067d8[] m20272b() {
        if (f31471b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31471b == null) {
                        f31471b = new C5067d8[0];
                    }
                } finally {
                }
            }
        }
        return f31471b;
    }

    /* renamed from: a */
    public final C5067d8 m20273a() {
        this.f31472a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f31472a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeBytesSizeNoTag = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f31472a;
            if (i >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i2;
            }
            byte[] bArr3 = bArr2[i];
            if (bArr3 != null) {
                i2++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f31472a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f31472a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5067d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f31472a;
                int length = bArr == null ? 0 : bArr.length;
                int i = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f31472a = bArr2;
            }
        }
    }

    /* renamed from: b */
    public static C5067d8 m20271b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5067d8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5067d8 m20270a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5067d8) MessageNano.mergeFrom(new C5067d8(), bArr);
    }
}

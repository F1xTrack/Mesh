package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a9 */
/* loaded from: classes2.dex */
public final class C4993a9 extends MessageNano {

    /* renamed from: c */
    public static volatile C4993a9[] f31250c;

    /* renamed from: a */
    public byte[] f31251a;

    /* renamed from: b */
    public byte[] f31252b;

    public C4993a9() {
        m20115a();
    }

    /* renamed from: b */
    public static C4993a9[] m20114b() {
        if (f31250c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31250c == null) {
                        f31250c = new C4993a9[0];
                    }
                } finally {
                }
            }
        }
        return f31250c;
    }

    /* renamed from: a */
    public final C4993a9 m20115a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31251a = bArr;
        this.f31252b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31251a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31251a);
        }
        return !Arrays.equals(this.f31252b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f31252b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31251a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31251a);
        }
        if (!Arrays.equals(this.f31252b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f31252b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4993a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31251a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31252b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4993a9 m20113b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4993a9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4993a9 m20112a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4993a9) MessageNano.mergeFrom(new C4993a9(), bArr);
    }
}

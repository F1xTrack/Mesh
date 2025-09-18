package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l9 */
/* loaded from: classes2.dex */
public final class C5268l9 extends MessageNano {

    /* renamed from: b */
    public static volatile C5268l9[] f32142b;

    /* renamed from: a */
    public byte[] f32143a;

    public C5268l9() {
        m20688a();
    }

    /* renamed from: b */
    public static C5268l9[] m20687b() {
        if (f32142b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32142b == null) {
                        f32142b = new C5268l9[0];
                    }
                } finally {
                }
            }
        }
        return f32142b;
    }

    /* renamed from: a */
    public final C5268l9 m20688a() {
        this.f32143a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f32143a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f32143a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f32143a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32143a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5268l9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32143a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C5268l9 m20685a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5268l9) MessageNano.mergeFrom(new C5268l9(), bArr);
    }

    /* renamed from: b */
    public static C5268l9 m20686b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5268l9().mergeFrom(codedInputByteBufferNano);
    }
}

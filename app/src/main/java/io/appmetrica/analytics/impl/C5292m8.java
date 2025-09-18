package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m8 */
/* loaded from: classes2.dex */
public final class C5292m8 extends MessageNano {

    /* renamed from: b */
    public static volatile C5292m8[] f32187b;

    /* renamed from: a */
    public byte[] f32188a;

    public C5292m8() {
        m20703a();
    }

    /* renamed from: b */
    public static C5292m8[] m20702b() {
        if (f32187b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32187b == null) {
                        f32187b = new C5292m8[0];
                    }
                } finally {
                }
            }
        }
        return f32187b;
    }

    /* renamed from: a */
    public final C5292m8 m20703a() {
        this.f32188a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f32188a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f32188a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f32188a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32188a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5292m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32188a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C5292m8 m20700a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5292m8) MessageNano.mergeFrom(new C5292m8(), bArr);
    }

    /* renamed from: b */
    public static C5292m8 m20701b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5292m8().mergeFrom(codedInputByteBufferNano);
    }
}

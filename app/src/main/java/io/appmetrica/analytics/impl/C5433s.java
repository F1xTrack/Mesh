package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s */
/* loaded from: classes2.dex */
public final class C5433s extends MessageNano {

    /* renamed from: c */
    public static volatile C5433s[] f32524c;

    /* renamed from: a */
    public long f32525a;

    /* renamed from: b */
    public int f32526b;

    public C5433s() {
        m21029a();
    }

    /* renamed from: b */
    public static C5433s[] m21028b() {
        if (f32524c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32524c == null) {
                        f32524c = new C5433s[0];
                    }
                } finally {
                }
            }
        }
        return f32524c;
    }

    /* renamed from: a */
    public final C5433s m21029a() {
        this.f32525a = 0L;
        this.f32526b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f32525a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f32526b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f32525a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f32526b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5433s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f32525a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32526b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C5433s m21027b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5433s().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5433s m21026a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5433s) MessageNano.mergeFrom(new C5433s(), bArr);
    }
}

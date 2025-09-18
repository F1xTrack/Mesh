package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ql */
/* loaded from: classes2.dex */
public final class C5405ql extends MessageNano {

    /* renamed from: b */
    public static volatile C5405ql[] f32470b;

    /* renamed from: a */
    public long f32471a;

    public C5405ql() {
        m20984a();
    }

    /* renamed from: b */
    public static C5405ql[] m20983b() {
        if (f32470b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32470b == null) {
                        f32470b = new C5405ql[0];
                    }
                } finally {
                }
            }
        }
        return f32470b;
    }

    /* renamed from: a */
    public final C5405ql m20984a() {
        this.f32471a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f32471a;
        return j != 10000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f32471a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5405ql mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32471a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C5405ql m20981a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5405ql) MessageNano.mergeFrom(new C5405ql(), bArr);
    }

    /* renamed from: b */
    public static C5405ql m20982b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5405ql().mergeFrom(codedInputByteBufferNano);
    }
}

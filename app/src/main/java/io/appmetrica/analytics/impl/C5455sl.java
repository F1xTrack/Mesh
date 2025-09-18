package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sl */
/* loaded from: classes2.dex */
public final class C5455sl extends MessageNano {

    /* renamed from: b */
    public static volatile C5455sl[] f32578b;

    /* renamed from: a */
    public long f32579a;

    public C5455sl() {
        m21054a();
    }

    /* renamed from: b */
    public static C5455sl[] m21053b() {
        if (f32578b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32578b == null) {
                        f32578b = new C5455sl[0];
                    }
                } finally {
                }
            }
        }
        return f32578b;
    }

    /* renamed from: a */
    public final C5455sl m21054a() {
        this.f32579a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f32579a;
        return j != 864000000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f32579a;
        if (j != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5455sl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32579a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C5455sl m21051a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5455sl) MessageNano.mergeFrom(new C5455sl(), bArr);
    }

    /* renamed from: b */
    public static C5455sl m21052b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5455sl().mergeFrom(codedInputByteBufferNano);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xl */
/* loaded from: classes2.dex */
public final class C5580xl extends MessageNano {

    /* renamed from: b */
    public static volatile C5580xl[] f32831b;

    /* renamed from: a */
    public long f32832a;

    public C5580xl() {
        m21212a();
    }

    /* renamed from: b */
    public static C5580xl[] m21211b() {
        if (f32831b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32831b == null) {
                        f32831b = new C5580xl[0];
                    }
                } finally {
                }
            }
        }
        return f32831b;
    }

    /* renamed from: a */
    public final C5580xl m21212a() {
        this.f32832a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f32832a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f32832a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5580xl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32832a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C5580xl m21209a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5580xl) MessageNano.mergeFrom(new C5580xl(), bArr);
    }

    /* renamed from: b */
    public static C5580xl m21210b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5580xl().mergeFrom(codedInputByteBufferNano);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b8 */
/* loaded from: classes2.dex */
public final class C5017b8 extends MessageNano {

    /* renamed from: b */
    public static volatile C5017b8[] f31308b;

    /* renamed from: a */
    public C5042c8 f31309a;

    public C5017b8() {
        m20159a();
    }

    /* renamed from: b */
    public static C5017b8[] m20158b() {
        if (f31308b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31308b == null) {
                        f31308b = new C5017b8[0];
                    }
                } finally {
                }
            }
        }
        return f31308b;
    }

    /* renamed from: a */
    public final C5017b8 m20159a() {
        this.f31309a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5042c8 c5042c8 = this.f31309a;
        return c5042c8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c5042c8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5042c8 c5042c8 = this.f31309a;
        if (c5042c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5042c8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5017b8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f31309a == null) {
                    this.f31309a = new C5042c8();
                }
                codedInputByteBufferNano.readMessage(this.f31309a);
            }
        }
    }

    /* renamed from: b */
    public static C5017b8 m20157b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5017b8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5017b8 m20156a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5017b8) MessageNano.mergeFrom(new C5017b8(), bArr);
    }
}

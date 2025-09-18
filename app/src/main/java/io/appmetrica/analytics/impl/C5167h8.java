package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h8 */
/* loaded from: classes2.dex */
public final class C5167h8 extends MessageNano {

    /* renamed from: b */
    public static volatile C5167h8[] f31845b;

    /* renamed from: a */
    public C5117f8 f31846a;

    public C5167h8() {
        m20490a();
    }

    /* renamed from: b */
    public static C5167h8[] m20489b() {
        if (f31845b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31845b == null) {
                        f31845b = new C5167h8[0];
                    }
                } finally {
                }
            }
        }
        return f31845b;
    }

    /* renamed from: a */
    public final C5167h8 m20490a() {
        this.f31846a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5117f8 c5117f8 = this.f31846a;
        return c5117f8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c5117f8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5117f8 c5117f8 = this.f31846a;
        if (c5117f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5117f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5167h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f31846a == null) {
                    this.f31846a = new C5117f8();
                }
                codedInputByteBufferNano.readMessage(this.f31846a);
            }
        }
    }

    /* renamed from: b */
    public static C5167h8 m20488b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5167h8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5167h8 m20487a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5167h8) MessageNano.mergeFrom(new C5167h8(), bArr);
    }
}

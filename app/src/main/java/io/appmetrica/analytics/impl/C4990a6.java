package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.a6 */
/* loaded from: classes2.dex */
public final class C4990a6 extends MessageNano {

    /* renamed from: b */
    public static volatile C4990a6[] f31242b;

    /* renamed from: a */
    public String f31243a;

    public C4990a6() {
        m20103a();
    }

    /* renamed from: b */
    public static C4990a6[] m20102b() {
        if (f31242b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31242b == null) {
                        f31242b = new C4990a6[0];
                    }
                } finally {
                }
            }
        }
        return f31242b;
    }

    /* renamed from: a */
    public final C4990a6 m20103a() {
        this.f31243a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f31243a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f31243a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4990a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f31243a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C4990a6 m20100a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4990a6) MessageNano.mergeFrom(new C4990a6(), bArr);
    }

    /* renamed from: b */
    public static C4990a6 m20101b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4990a6().mergeFrom(codedInputByteBufferNano);
    }
}

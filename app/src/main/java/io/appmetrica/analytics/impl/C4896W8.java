package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.W8 */
/* loaded from: classes2.dex */
public final class C4896W8 extends MessageNano {

    /* renamed from: c */
    public static volatile C4896W8[] f30932c;

    /* renamed from: a */
    public String f30933a;

    /* renamed from: b */
    public String f30934b;

    public C4896W8() {
        m19942a();
    }

    /* renamed from: b */
    public static C4896W8[] m19941b() {
        if (f30932c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30932c == null) {
                        f30932c = new C4896W8[0];
                    }
                } finally {
                }
            }
        }
        return f30932c;
    }

    /* renamed from: a */
    public final C4896W8 m19942a() {
        this.f30933a = "";
        this.f30934b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f30934b) + CodedOutputByteBufferNano.computeStringSize(1, this.f30933a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f30933a);
        codedOutputByteBufferNano.writeString(2, this.f30934b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4896W8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30933a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f30934b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C4896W8 m19940b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4896W8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4896W8 m19939a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4896W8) MessageNano.mergeFrom(new C4896W8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X1 */
/* loaded from: classes2.dex */
public final class C4913X1 extends MessageNano {

    /* renamed from: c */
    public static volatile C4913X1[] f30998c;

    /* renamed from: a */
    public String f30999a;

    /* renamed from: b */
    public boolean f31000b;

    public C4913X1() {
        m19958a();
    }

    /* renamed from: b */
    public static C4913X1[] m19957b() {
        if (f30998c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30998c == null) {
                        f30998c = new C4913X1[0];
                    }
                } finally {
                }
            }
        }
        return f30998c;
    }

    /* renamed from: a */
    public final C4913X1 m19958a() {
        this.f30999a = "";
        this.f31000b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f31000b) + CodedOutputByteBufferNano.computeStringSize(1, this.f30999a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f30999a);
        codedOutputByteBufferNano.writeBool(2, this.f31000b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4913X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30999a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31000b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C4913X1 m19956b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4913X1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4913X1 m19955a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4913X1) MessageNano.mergeFrom(new C4913X1(), bArr);
    }
}

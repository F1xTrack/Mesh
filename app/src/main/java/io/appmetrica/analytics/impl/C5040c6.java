package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c6 */
/* loaded from: classes2.dex */
public final class C5040c6 extends MessageNano {

    /* renamed from: c */
    public static volatile C5040c6[] f31355c;

    /* renamed from: a */
    public int f31356a;

    /* renamed from: b */
    public String f31357b;

    public C5040c6() {
        m20218a();
    }

    /* renamed from: b */
    public static C5040c6[] m20217b() {
        if (f31355c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31355c == null) {
                        f31355c = new C5040c6[0];
                    }
                } finally {
                }
            }
        }
        return f31355c;
    }

    /* renamed from: a */
    public final C5040c6 m20218a() {
        this.f31356a = 0;
        this.f31357b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31356a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f31357b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f31357b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31356a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f31357b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f31357b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5040c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f31356a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31357b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C5040c6 m20216b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5040c6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5040c6 m20215a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5040c6) MessageNano.mergeFrom(new C5040c6(), bArr);
    }
}

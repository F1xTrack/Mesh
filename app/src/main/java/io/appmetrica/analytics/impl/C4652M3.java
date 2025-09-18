package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.M3 */
/* loaded from: classes2.dex */
public final class C4652M3 extends MessageNano {

    /* renamed from: c */
    public static volatile C4652M3[] f30458c;

    /* renamed from: a */
    public String f30459a;

    /* renamed from: b */
    public String f30460b;

    public C4652M3() {
        m19624a();
    }

    /* renamed from: b */
    public static C4652M3[] m19623b() {
        if (f30458c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30458c == null) {
                        f30458c = new C4652M3[0];
                    }
                } finally {
                }
            }
        }
        return f30458c;
    }

    /* renamed from: a */
    public final C4652M3 m19624a() {
        this.f30459a = "";
        this.f30460b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f30459a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f30459a);
        }
        return !this.f30460b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f30460b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f30459a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f30459a);
        }
        if (!this.f30460b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f30460b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4652M3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30459a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f30460b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C4652M3 m19622b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4652M3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4652M3 m19621a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4652M3) MessageNano.mergeFrom(new C4652M3(), bArr);
    }
}

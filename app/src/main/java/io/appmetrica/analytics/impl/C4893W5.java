package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.W5 */
/* loaded from: classes2.dex */
public final class C4893W5 extends MessageNano {

    /* renamed from: d */
    public static volatile C4893W5[] f30920d;

    /* renamed from: a */
    public C4869V5 f30921a;

    /* renamed from: b */
    public String f30922b;

    /* renamed from: c */
    public int f30923c;

    public C4893W5() {
        m19937a();
    }

    /* renamed from: b */
    public static C4893W5[] m19936b() {
        if (f30920d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30920d == null) {
                        f30920d = new C4893W5[0];
                    }
                } finally {
                }
            }
        }
        return f30920d;
    }

    /* renamed from: a */
    public final C4893W5 m19937a() {
        this.f30921a = null;
        this.f30922b = "";
        this.f30923c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4869V5 c4869v5 = this.f30921a;
        if (c4869v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4869v5);
        }
        if (!this.f30922b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f30922b);
        }
        int i = this.f30923c;
        return i != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4869V5 c4869v5 = this.f30921a;
        if (c4869v5 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4869v5);
        }
        if (!this.f30922b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f30922b);
        }
        int i = this.f30923c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4893W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f30921a == null) {
                    this.f30921a = new C4869V5();
                }
                codedInputByteBufferNano.readMessage(this.f30921a);
            } else if (tag == 18) {
                this.f30922b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f30923c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4893W5 m19935b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4893W5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4893W5 m19934a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4893W5) MessageNano.mergeFrom(new C4893W5(), bArr);
    }
}

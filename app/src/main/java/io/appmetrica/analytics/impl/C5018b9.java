package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b9 */
/* loaded from: classes2.dex */
public final class C5018b9 extends MessageNano {

    /* renamed from: c */
    public static volatile C5018b9[] f31310c;

    /* renamed from: a */
    public int f31311a;

    /* renamed from: b */
    public String f31312b;

    public C5018b9() {
        m20164a();
    }

    /* renamed from: b */
    public static C5018b9[] m20163b() {
        if (f31310c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31310c == null) {
                        f31310c = new C5018b9[0];
                    }
                } finally {
                }
            }
        }
        return f31310c;
    }

    /* renamed from: a */
    public final C5018b9 m20164a() {
        this.f31311a = 2;
        this.f31312b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31311a;
        if (i != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return !this.f31312b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f31312b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31311a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.f31312b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f31312b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5018b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f31311a = int32;
                        break;
                }
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31312b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C5018b9 m20162b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5018b9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5018b9 m20161a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5018b9) MessageNano.mergeFrom(new C5018b9(), bArr);
    }
}

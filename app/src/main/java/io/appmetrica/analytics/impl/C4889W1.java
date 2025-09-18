package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.W1 */
/* loaded from: classes2.dex */
public final class C4889W1 extends MessageNano {

    /* renamed from: c */
    public static final int f30880c = 0;

    /* renamed from: d */
    public static final int f30881d = 1;

    /* renamed from: e */
    public static final int f30882e = 2;

    /* renamed from: f */
    public static final int f30883f = 3;

    /* renamed from: g */
    public static final int f30884g = 4;

    /* renamed from: h */
    public static final int f30885h = 5;

    /* renamed from: i */
    public static final int f30886i = -1;

    /* renamed from: j */
    public static final int f30887j = 0;

    /* renamed from: k */
    public static final int f30888k = 1;

    /* renamed from: l */
    public static volatile C4889W1[] f30889l;

    /* renamed from: a */
    public int f30890a;

    /* renamed from: b */
    public int f30891b;

    public C4889W1() {
        m19926a();
    }

    /* renamed from: b */
    public static C4889W1[] m19925b() {
        if (f30889l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30889l == null) {
                        f30889l = new C4889W1[0];
                    }
                } finally {
                }
            }
        }
        return f30889l;
    }

    /* renamed from: a */
    public final C4889W1 m19926a() {
        this.f30890a = 0;
        this.f30891b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f30891b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f30890a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f30890a);
        codedOutputByteBufferNano.writeInt32(3, this.f30891b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4889W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                    this.f30890a = int32;
                }
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int322 = codedInputByteBufferNano.readInt32();
                if (int322 == -1 || int322 == 0 || int322 == 1) {
                    this.f30891b = int322;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4889W1 m19924b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4889W1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4889W1 m19923a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4889W1) MessageNano.mergeFrom(new C4889W1(), bArr);
    }
}

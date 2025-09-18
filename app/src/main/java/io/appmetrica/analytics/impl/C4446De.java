package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.De */
/* loaded from: classes2.dex */
public final class C4446De extends MessageNano {

    /* renamed from: d */
    public static volatile C4446De[] f30015d;

    /* renamed from: a */
    public String f30016a;

    /* renamed from: b */
    public String f30017b;

    /* renamed from: c */
    public int f30018c;

    public C4446De() {
        m19329a();
    }

    /* renamed from: b */
    public static C4446De[] m19328b() {
        if (f30015d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30015d == null) {
                        f30015d = new C4446De[0];
                    }
                } finally {
                }
            }
        }
        return f30015d;
    }

    /* renamed from: a */
    public final C4446De m19329a() {
        this.f30016a = "";
        this.f30017b = "";
        this.f30018c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f30016a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f30016a);
        }
        if (!this.f30017b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f30017b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f30018c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f30016a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f30016a);
        }
        if (!this.f30017b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f30017b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f30018c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4446De mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30016a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f30017b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f30018c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4446De m19327b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4446De().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4446De m19326a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4446De) MessageNano.mergeFrom(new C4446De(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.bn */
/* loaded from: classes2.dex */
public final class C5032bn extends MessageNano {

    /* renamed from: e */
    public static final int f31337e = 0;

    /* renamed from: f */
    public static final int f31338f = 1;

    /* renamed from: g */
    public static final int f31339g = 2;

    /* renamed from: h */
    public static final int f31340h = 3;

    /* renamed from: i */
    public static volatile C5032bn[] f31341i;

    /* renamed from: a */
    public byte[] f31342a;

    /* renamed from: b */
    public int f31343b;

    /* renamed from: c */
    public C5057cn f31344c;

    /* renamed from: d */
    public C5082dn f31345d;

    public C5032bn() {
        m20205a();
    }

    /* renamed from: b */
    public static C5032bn[] m20204b() {
        if (f31341i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31341i == null) {
                        f31341i = new C5032bn[0];
                    }
                } finally {
                }
            }
        }
        return f31341i;
    }

    /* renamed from: a */
    public final C5032bn m20205a() {
        this.f31342a = WireFormatNano.EMPTY_BYTES;
        this.f31343b = 0;
        this.f31344c = null;
        this.f31345d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f31343b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f31342a) + super.computeSerializedSize();
        C5057cn c5057cn = this.f31344c;
        if (c5057cn != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5057cn);
        }
        C5082dn c5082dn = this.f31345d;
        return c5082dn != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c5082dn) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f31342a);
        codedOutputByteBufferNano.writeInt32(2, this.f31343b);
        C5057cn c5057cn = this.f31344c;
        if (c5057cn != null) {
            codedOutputByteBufferNano.writeMessage(3, c5057cn);
        }
        C5082dn c5082dn = this.f31345d;
        if (c5082dn != null) {
            codedOutputByteBufferNano.writeMessage(4, c5082dn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5032bn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31342a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f31343b = int32;
                }
            } else if (tag == 26) {
                if (this.f31344c == null) {
                    this.f31344c = new C5057cn();
                }
                codedInputByteBufferNano.readMessage(this.f31344c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31345d == null) {
                    this.f31345d = new C5082dn();
                }
                codedInputByteBufferNano.readMessage(this.f31345d);
            }
        }
    }

    /* renamed from: b */
    public static C5032bn m20203b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5032bn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5032bn m20202a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5032bn) MessageNano.mergeFrom(new C5032bn(), bArr);
    }
}

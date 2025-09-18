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
public final class C4462bn extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static volatile C4462bn[] i;
    public byte[] a;
    public int b;
    public C4487cn c;
    public C4512dn d;

    public C4462bn() {
        a();
    }

    public static C4462bn[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new C4462bn[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final C4462bn a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.b) + CodedOutputByteBufferNano.computeBytesSize(1, this.a) + super.computeSerializedSize();
        C4487cn c4487cn = this.c;
        if (c4487cn != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4487cn);
        }
        C4512dn c4512dn = this.d;
        return c4512dn != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c4512dn) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        codedOutputByteBufferNano.writeInt32(2, this.b);
        C4487cn c4487cn = this.c;
        if (c4487cn != null) {
            codedOutputByteBufferNano.writeMessage(3, c4487cn);
        }
        C4512dn c4512dn = this.d;
        if (c4512dn != null) {
            codedOutputByteBufferNano.writeMessage(4, c4512dn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4462bn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.b = int32;
                }
            } else if (tag == 26) {
                if (this.c == null) {
                    this.c = new C4487cn();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.d == null) {
                    this.d = new C4512dn();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
    }

    public static C4462bn b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4462bn().mergeFrom(codedInputByteBufferNano);
    }

    public static C4462bn a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4462bn) MessageNano.mergeFrom(new C4462bn(), bArr);
    }
}

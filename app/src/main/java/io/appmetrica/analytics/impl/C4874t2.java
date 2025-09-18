package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t2 */
/* loaded from: classes2.dex */
public final class C4874t2 extends MessageNano {
    public static volatile C4874t2[] f;
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;

    public C4874t2() {
        a();
    }

    public static C4874t2[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C4874t2[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C4874t2 a() {
        this.a = 1;
        this.b = "";
        this.c = "";
        this.d = 0L;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.d) + CodedOutputByteBufferNano.computeStringSize(3, this.c) + CodedOutputByteBufferNano.computeStringSize(2, this.b) + CodedOutputByteBufferNano.computeInt32Size(1, this.a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.a);
        codedOutputByteBufferNano.writeString(2, this.b);
        codedOutputByteBufferNano.writeString(3, this.c);
        codedOutputByteBufferNano.writeUInt64(4, this.d);
        codedOutputByteBufferNano.writeUInt64(5, this.e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4874t2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4874t2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4874t2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.a = int32;
                }
            } else if (tag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C4874t2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4874t2) MessageNano.mergeFrom(new C4874t2(), bArr);
    }
}

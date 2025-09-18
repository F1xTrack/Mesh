package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8 */
/* loaded from: classes2.dex */
public final class C4856s8 extends MessageNano {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static volatile C4856s8[] o;
    public int a;
    public C4832r8 b;
    public C4785p8 c;
    public C4809q8 d;
    public C4447b8 e;
    public C4594h8 f;

    public C4856s8() {
        a();
    }

    public static C4856s8[] b() {
        if (o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (o == null) {
                        o = new C4856s8[0];
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public final C4856s8 a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i2 = this.a;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        C4832r8 c4832r8 = this.b;
        if (c4832r8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4832r8);
        }
        C4785p8 c4785p8 = this.c;
        if (c4785p8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4785p8);
        }
        C4809q8 c4809q8 = this.d;
        if (c4809q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4809q8);
        }
        C4447b8 c4447b8 = this.e;
        if (c4447b8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4447b8);
        }
        C4594h8 c4594h8 = this.f;
        return c4594h8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c4594h8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        C4832r8 c4832r8 = this.b;
        if (c4832r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4832r8);
        }
        C4785p8 c4785p8 = this.c;
        if (c4785p8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4785p8);
        }
        C4809q8 c4809q8 = this.d;
        if (c4809q8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4809q8);
        }
        C4447b8 c4447b8 = this.e;
        if (c4447b8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4447b8);
        }
        C4594h8 c4594h8 = this.f;
        if (c4594h8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4594h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4856s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4856s8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4856s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
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
                        this.a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new C4832r8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag == 26) {
                if (this.c == null) {
                    this.c = new C4785p8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (tag == 34) {
                if (this.d == null) {
                    this.d = new C4809q8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (tag == 42) {
                if (this.e == null) {
                    this.e = new C4447b8();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f == null) {
                    this.f = new C4594h8();
                }
                codedInputByteBufferNano.readMessage(this.f);
            }
        }
    }

    public static C4856s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4856s8) MessageNano.mergeFrom(new C4856s8(), bArr);
    }
}

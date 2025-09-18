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
public final class C5442s8 extends MessageNano {

    /* renamed from: g */
    public static final int f32538g = 0;

    /* renamed from: h */
    public static final int f32539h = 1;

    /* renamed from: i */
    public static final int f32540i = 2;

    /* renamed from: j */
    public static final int f32541j = 3;

    /* renamed from: k */
    public static final int f32542k = 4;

    /* renamed from: l */
    public static final int f32543l = 5;

    /* renamed from: m */
    public static final int f32544m = 6;

    /* renamed from: n */
    public static final int f32545n = 7;

    /* renamed from: o */
    public static volatile C5442s8[] f32546o;

    /* renamed from: a */
    public int f32547a;

    /* renamed from: b */
    public C5417r8 f32548b;

    /* renamed from: c */
    public C5367p8 f32549c;

    /* renamed from: d */
    public C5392q8 f32550d;

    /* renamed from: e */
    public C5017b8 f32551e;

    /* renamed from: f */
    public C5167h8 f32552f;

    public C5442s8() {
        m21043a();
    }

    /* renamed from: b */
    public static C5442s8[] m21042b() {
        if (f32546o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32546o == null) {
                        f32546o = new C5442s8[0];
                    }
                } finally {
                }
            }
        }
        return f32546o;
    }

    /* renamed from: a */
    public final C5442s8 m21043a() {
        this.f32547a = 0;
        this.f32548b = null;
        this.f32549c = null;
        this.f32550d = null;
        this.f32551e = null;
        this.f32552f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32547a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        C5417r8 c5417r8 = this.f32548b;
        if (c5417r8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5417r8);
        }
        C5367p8 c5367p8 = this.f32549c;
        if (c5367p8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5367p8);
        }
        C5392q8 c5392q8 = this.f32550d;
        if (c5392q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5392q8);
        }
        C5017b8 c5017b8 = this.f32551e;
        if (c5017b8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5017b8);
        }
        C5167h8 c5167h8 = this.f32552f;
        return c5167h8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c5167h8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32547a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        C5417r8 c5417r8 = this.f32548b;
        if (c5417r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5417r8);
        }
        C5367p8 c5367p8 = this.f32549c;
        if (c5367p8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5367p8);
        }
        C5392q8 c5392q8 = this.f32550d;
        if (c5392q8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5392q8);
        }
        C5017b8 c5017b8 = this.f32551e;
        if (c5017b8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5017b8);
        }
        C5167h8 c5167h8 = this.f32552f;
        if (c5167h8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5167h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5442s8 m21041b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5442s8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5442s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                        this.f32547a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.f32548b == null) {
                    this.f32548b = new C5417r8();
                }
                codedInputByteBufferNano.readMessage(this.f32548b);
            } else if (tag == 26) {
                if (this.f32549c == null) {
                    this.f32549c = new C5367p8();
                }
                codedInputByteBufferNano.readMessage(this.f32549c);
            } else if (tag == 34) {
                if (this.f32550d == null) {
                    this.f32550d = new C5392q8();
                }
                codedInputByteBufferNano.readMessage(this.f32550d);
            } else if (tag == 42) {
                if (this.f32551e == null) {
                    this.f32551e = new C5017b8();
                }
                codedInputByteBufferNano.readMessage(this.f32551e);
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32552f == null) {
                    this.f32552f = new C5167h8();
                }
                codedInputByteBufferNano.readMessage(this.f32552f);
            }
        }
    }

    /* renamed from: a */
    public static C5442s8 m21040a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5442s8) MessageNano.mergeFrom(new C5442s8(), bArr);
    }
}

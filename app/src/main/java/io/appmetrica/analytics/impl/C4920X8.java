package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X8 */
/* loaded from: classes2.dex */
public final class C4920X8 extends MessageNano {

    /* renamed from: j */
    public static final int f31015j = 0;

    /* renamed from: k */
    public static final int f31016k = 1;

    /* renamed from: l */
    public static final int f31017l = 2;

    /* renamed from: m */
    public static volatile C4920X8[] f31018m;

    /* renamed from: a */
    public double f31019a;

    /* renamed from: b */
    public double f31020b;

    /* renamed from: c */
    public long f31021c;

    /* renamed from: d */
    public int f31022d;

    /* renamed from: e */
    public int f31023e;

    /* renamed from: f */
    public int f31024f;

    /* renamed from: g */
    public int f31025g;

    /* renamed from: h */
    public int f31026h;

    /* renamed from: i */
    public String f31027i;

    public C4920X8() {
        m19972a();
    }

    /* renamed from: b */
    public static C4920X8[] m19971b() {
        if (f31018m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31018m == null) {
                        f31018m = new C4920X8[0];
                    }
                } finally {
                }
            }
        }
        return f31018m;
    }

    /* renamed from: a */
    public final C4920X8 m19972a() {
        this.f31019a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f31020b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f31021c = 0L;
        this.f31022d = 0;
        this.f31023e = 0;
        this.f31024f = 0;
        this.f31025g = 0;
        this.f31026h = 0;
        this.f31027i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f31020b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f31019a) + super.computeSerializedSize();
        long j = this.f31021c;
        if (j != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
        }
        int i = this.f31022d;
        if (i != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i2 = this.f31023e;
        if (i2 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        int i3 = this.f31024f;
        if (i3 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i3);
        }
        int i4 = this.f31025g;
        if (i4 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        int i5 = this.f31026h;
        if (i5 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
        }
        return !this.f31027i.equals("") ? iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f31027i) : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f31019a);
        codedOutputByteBufferNano.writeDouble(2, this.f31020b);
        long j = this.f31021c;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j);
        }
        int i = this.f31022d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i2 = this.f31023e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        int i3 = this.f31024f;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i3);
        }
        int i4 = this.f31025g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        int i5 = this.f31026h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i5);
        }
        if (!this.f31027i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f31027i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C4920X8 m19970b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4920X8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4920X8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 9) {
                this.f31019a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f31020b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f31021c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f31022d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f31023e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f31024f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f31025g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f31026h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31027i = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C4920X8 m19969a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4920X8) MessageNano.mergeFrom(new C4920X8(), bArr);
    }
}

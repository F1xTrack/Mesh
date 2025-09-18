package io.appmetrica.analytics.impl;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o7 */
/* loaded from: classes2.dex */
public final class C5341o7 extends MessageNano {

    /* renamed from: k */
    public static volatile C5341o7[] f32321k;

    /* renamed from: a */
    public int f32322a;

    /* renamed from: b */
    public double f32323b;

    /* renamed from: c */
    public double f32324c;

    /* renamed from: d */
    public int f32325d;

    /* renamed from: e */
    public int f32326e;

    /* renamed from: f */
    public int f32327f;

    /* renamed from: g */
    public int f32328g;

    /* renamed from: h */
    public long f32329h;

    /* renamed from: i */
    public String f32330i;

    /* renamed from: j */
    public String f32331j;

    public C5341o7() {
        m20852a();
    }

    /* renamed from: b */
    public static C5341o7[] m20851b() {
        if (f32321k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32321k == null) {
                        f32321k = new C5341o7[0];
                    }
                } finally {
                }
            }
        }
        return f32321k;
    }

    /* renamed from: a */
    public final C5341o7 m20852a() {
        this.f32322a = -1;
        this.f32323b = -1.0d;
        this.f32324c = -1.0d;
        this.f32325d = -1;
        this.f32326e = -1;
        this.f32327f = -1;
        this.f32328g = -1;
        this.f32329h = -1L;
        this.f32330i = "";
        this.f32331j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32322a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f32323b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f32323b);
        }
        if (Double.doubleToLongBits(this.f32324c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f32324c);
        }
        int i2 = this.f32325d;
        if (i2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        int i3 = this.f32326e;
        if (i3 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i3);
        }
        int i4 = this.f32327f;
        if (i4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        int i5 = this.f32328g;
        if (i5 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        long j = this.f32329h;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j);
        }
        if (!this.f32330i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f32330i);
        }
        return !this.f32331j.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f32331j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32322a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f32323b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f32323b);
        }
        if (Double.doubleToLongBits(this.f32324c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f32324c);
        }
        int i2 = this.f32325d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        int i3 = this.f32326e;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i3);
        }
        int i4 = this.f32327f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        int i5 = this.f32328g;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        long j = this.f32329h;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(8, j);
        }
        if (!this.f32330i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f32330i);
        }
        if (!this.f32331j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f32331j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5341o7 m20850b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5341o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5341o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f32322a = int32;
                        break;
                    }
                    break;
                case 17:
                    this.f32323b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f32324c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f32325d = codedInputByteBufferNano.readInt32();
                    break;
                case C5043c9.f31376L /* 40 */:
                    this.f32326e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f32327f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f32328g = codedInputByteBufferNano.readInt32();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    this.f32329h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f32330i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f32331j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C5341o7 m20849a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5341o7) MessageNano.mergeFrom(new C5341o7(), bArr);
    }
}

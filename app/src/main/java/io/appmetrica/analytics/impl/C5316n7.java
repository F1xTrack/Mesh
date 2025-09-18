package io.appmetrica.analytics.impl;

import com.facebook.crypto.mac.NativeMac;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n7 */
/* loaded from: classes2.dex */
public final class C5316n7 extends MessageNano {

    /* renamed from: s */
    public static volatile C5316n7[] f32245s;

    /* renamed from: a */
    public int f32246a;

    /* renamed from: b */
    public String f32247b;

    /* renamed from: c */
    public String f32248c;

    /* renamed from: d */
    public long f32249d;

    /* renamed from: e */
    public C5341o7 f32250e;

    /* renamed from: f */
    public String f32251f;

    /* renamed from: g */
    public String f32252g;

    /* renamed from: h */
    public long f32253h;

    /* renamed from: i */
    public int f32254i;

    /* renamed from: j */
    public int f32255j;

    /* renamed from: k */
    public String f32256k;

    /* renamed from: l */
    public int f32257l;

    /* renamed from: m */
    public String f32258m;

    /* renamed from: n */
    public int f32259n;

    /* renamed from: o */
    public int f32260o;

    /* renamed from: p */
    public int f32261p;

    /* renamed from: q */
    public int f32262q;

    /* renamed from: r */
    public byte[] f32263r;

    public C5316n7() {
        m20807a();
    }

    /* renamed from: b */
    public static C5316n7[] m20806b() {
        if (f32245s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32245s == null) {
                        f32245s = new C5316n7[0];
                    }
                } finally {
                }
            }
        }
        return f32245s;
    }

    /* renamed from: a */
    public final C5316n7 m20807a() {
        this.f32246a = -1;
        this.f32247b = "";
        this.f32248c = "";
        this.f32249d = -1L;
        this.f32250e = null;
        this.f32251f = "";
        this.f32252g = "";
        this.f32253h = -1L;
        this.f32254i = -1;
        this.f32255j = -1;
        this.f32256k = "";
        this.f32257l = -1;
        this.f32258m = "";
        this.f32259n = -1;
        this.f32260o = -1;
        this.f32261p = -1;
        this.f32262q = -1;
        this.f32263r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32246a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f32247b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f32247b);
        }
        if (!this.f32248c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f32248c);
        }
        long j = this.f32249d;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j);
        }
        C5341o7 c5341o7 = this.f32250e;
        if (c5341o7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5341o7);
        }
        if (!this.f32251f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f32251f);
        }
        if (!this.f32252g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f32252g);
        }
        long j2 = this.f32253h;
        if (j2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        int i2 = this.f32254i;
        if (i2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f32255j;
        if (i3 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        if (!this.f32256k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f32256k);
        }
        int i4 = this.f32257l;
        if (i4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i4);
        }
        if (!this.f32258m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f32258m);
        }
        int i5 = this.f32259n;
        if (i5 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i5);
        }
        int i6 = this.f32260o;
        if (i6 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i6);
        }
        int i7 = this.f32261p;
        if (i7 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i7);
        }
        int i8 = this.f32262q;
        if (i8 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i8);
        }
        return !Arrays.equals(this.f32263r, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f32263r) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32246a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f32247b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f32247b);
        }
        if (!this.f32248c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f32248c);
        }
        long j = this.f32249d;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(4, j);
        }
        C5341o7 c5341o7 = this.f32250e;
        if (c5341o7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5341o7);
        }
        if (!this.f32251f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f32251f);
        }
        if (!this.f32252g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f32252g);
        }
        long j2 = this.f32253h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        int i2 = this.f32254i;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f32255j;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        if (!this.f32256k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f32256k);
        }
        int i4 = this.f32257l;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i4);
        }
        if (!this.f32258m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f32258m);
        }
        int i5 = this.f32259n;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i5);
        }
        int i6 = this.f32260o;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i6);
        }
        int i7 = this.f32261p;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i7);
        }
        int i8 = this.f32262q;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i8);
        }
        if (!Arrays.equals(this.f32263r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f32263r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5316n7 m20805b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5316n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5316n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f32246a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f32247b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f32248c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f32249d = codedInputByteBufferNano.readInt64();
                    break;
                case C5043c9.f31377M /* 42 */:
                    if (this.f32250e == null) {
                        this.f32250e = new C5341o7();
                    }
                    codedInputByteBufferNano.readMessage(this.f32250e);
                    break;
                case 50:
                    this.f32251f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f32252g = codedInputByteBufferNano.readString();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    this.f32253h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f32254i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f32255j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f32256k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f32257l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f32258m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f32259n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f32260o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f32261p = int32;
                        break;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.f32262q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f32263r = codedInputByteBufferNano.readBytes();
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
    public static C5316n7 m20804a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5316n7) MessageNano.mergeFrom(new C5316n7(), bArr);
    }
}

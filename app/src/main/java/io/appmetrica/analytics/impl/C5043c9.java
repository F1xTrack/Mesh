package io.appmetrica.analytics.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c9 */
/* loaded from: classes2.dex */
public final class C5043c9 extends MessageNano {

    /* renamed from: A */
    public static final int f31365A = 17;

    /* renamed from: B */
    public static final int f31366B = 18;

    /* renamed from: C */
    public static final int f31367C = 19;

    /* renamed from: D */
    public static final int f31368D = 20;

    /* renamed from: E */
    public static final int f31369E = 21;

    /* renamed from: F */
    public static final int f31370F = 25;

    /* renamed from: G */
    public static final int f31371G = 26;

    /* renamed from: H */
    public static final int f31372H = 27;

    /* renamed from: I */
    public static final int f31373I = 29;

    /* renamed from: J */
    public static final int f31374J = 35;

    /* renamed from: K */
    public static final int f31375K = 38;

    /* renamed from: L */
    public static final int f31376L = 40;

    /* renamed from: M */
    public static final int f31377M = 42;

    /* renamed from: N */
    public static final int f31378N = 0;

    /* renamed from: O */
    public static final int f31379O = 1;

    /* renamed from: P */
    public static final int f31380P = 2;

    /* renamed from: Q */
    public static final int f31381Q = 0;

    /* renamed from: R */
    public static final int f31382R = 1;

    /* renamed from: S */
    public static volatile C5043c9[] f31383S = null;

    /* renamed from: t */
    public static final int f31384t = 1;

    /* renamed from: u */
    public static final int f31385u = 2;

    /* renamed from: v */
    public static final int f31386v = 4;

    /* renamed from: w */
    public static final int f31387w = 5;

    /* renamed from: x */
    public static final int f31388x = 7;

    /* renamed from: y */
    public static final int f31389y = 13;

    /* renamed from: z */
    public static final int f31390z = 16;

    /* renamed from: a */
    public long f31391a;

    /* renamed from: b */
    public long f31392b;

    /* renamed from: c */
    public int f31393c;

    /* renamed from: d */
    public String f31394d;

    /* renamed from: e */
    public byte[] f31395e;

    /* renamed from: f */
    public C4920X8 f31396f;

    /* renamed from: g */
    public C5018b9 f31397g;

    /* renamed from: h */
    public String f31398h;

    /* renamed from: i */
    public int f31399i;

    /* renamed from: j */
    public int f31400j;

    /* renamed from: k */
    public int f31401k;

    /* renamed from: l */
    public byte[] f31402l;

    /* renamed from: m */
    public int f31403m;

    /* renamed from: n */
    public long f31404n;

    /* renamed from: o */
    public long f31405o;

    /* renamed from: p */
    public int f31406p;

    /* renamed from: q */
    public boolean f31407q;

    /* renamed from: r */
    public long f31408r;

    /* renamed from: s */
    public C4993a9[] f31409s;

    public C5043c9() {
        m20230a();
    }

    /* renamed from: b */
    public static C5043c9[] m20229b() {
        if (f31383S == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31383S == null) {
                        f31383S = new C5043c9[0];
                    }
                } finally {
                }
            }
        }
        return f31383S;
    }

    /* renamed from: a */
    public final C5043c9 m20230a() {
        this.f31391a = 0L;
        this.f31392b = 0L;
        this.f31393c = 0;
        this.f31394d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31395e = bArr;
        this.f31396f = null;
        this.f31397g = null;
        this.f31398h = "";
        this.f31399i = 0;
        this.f31400j = 0;
        this.f31401k = -1;
        this.f31402l = bArr;
        this.f31403m = -1;
        this.f31404n = 0L;
        this.f31405o = 0L;
        this.f31406p = 0;
        this.f31407q = false;
        this.f31408r = 1L;
        this.f31409s = C4993a9.m20114b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f31393c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f31392b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f31391a) + super.computeSerializedSize();
        if (!this.f31394d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f31394d);
        }
        byte[] bArr = this.f31395e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f31395e);
        }
        C4920X8 c4920x8 = this.f31396f;
        if (c4920x8 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4920x8);
        }
        C5018b9 c5018b9 = this.f31397g;
        if (c5018b9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c5018b9);
        }
        if (!this.f31398h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f31398h);
        }
        int i = this.f31399i;
        if (i != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i2 = this.f31400j;
        if (i2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i2);
        }
        int i3 = this.f31401k;
        if (i3 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i3);
        }
        if (!Arrays.equals(this.f31402l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f31402l);
        }
        int i4 = this.f31403m;
        if (i4 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i4);
        }
        long j = this.f31404n;
        if (j != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j);
        }
        long j2 = this.f31405o;
        if (j2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j2);
        }
        int i5 = this.f31406p;
        if (i5 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i5);
        }
        boolean z = this.f31407q;
        if (z) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z);
        }
        long j3 = this.f31408r;
        if (j3 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j3);
        }
        C4993a9[] c4993a9Arr = this.f31409s;
        if (c4993a9Arr != null && c4993a9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C4993a9[] c4993a9Arr2 = this.f31409s;
                if (i6 >= c4993a9Arr2.length) {
                    break;
                }
                C4993a9 c4993a9 = c4993a9Arr2[i6];
                if (c4993a9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c4993a9) + iComputeUInt32Size;
                }
                i6++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f31391a);
        codedOutputByteBufferNano.writeUInt64(2, this.f31392b);
        codedOutputByteBufferNano.writeUInt32(3, this.f31393c);
        if (!this.f31394d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f31394d);
        }
        byte[] bArr = this.f31395e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f31395e);
        }
        C4920X8 c4920x8 = this.f31396f;
        if (c4920x8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4920x8);
        }
        C5018b9 c5018b9 = this.f31397g;
        if (c5018b9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c5018b9);
        }
        if (!this.f31398h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f31398h);
        }
        int i = this.f31399i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i2 = this.f31400j;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i2);
        }
        int i3 = this.f31401k;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i3);
        }
        if (!Arrays.equals(this.f31402l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f31402l);
        }
        int i4 = this.f31403m;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i4);
        }
        long j = this.f31404n;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j);
        }
        long j2 = this.f31405o;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j2);
        }
        int i5 = this.f31406p;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i5);
        }
        boolean z = this.f31407q;
        if (z) {
            codedOutputByteBufferNano.writeBool(23, z);
        }
        long j3 = this.f31408r;
        if (j3 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j3);
        }
        C4993a9[] c4993a9Arr = this.f31409s;
        if (c4993a9Arr != null && c4993a9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C4993a9[] c4993a9Arr2 = this.f31409s;
                if (i6 >= c4993a9Arr2.length) {
                    break;
                }
                C4993a9 c4993a9 = c4993a9Arr2[i6];
                if (c4993a9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4993a9);
                }
                i6++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5043c9 m20228b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5043c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5043c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f31391a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f31392b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f31393c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f31394d = codedInputByteBufferNano.readString();
                    break;
                case f31377M /* 42 */:
                    this.f31395e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f31396f == null) {
                        this.f31396f = new C4920X8();
                    }
                    codedInputByteBufferNano.readMessage(this.f31396f);
                    break;
                case 58:
                    if (this.f31397g == null) {
                        this.f31397g = new C5018b9();
                    }
                    codedInputByteBufferNano.readMessage(this.f31397g);
                    break;
                case 66:
                    this.f31398h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f31399i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f31400j = int32;
                        break;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != -1 && int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f31401k = int322;
                        break;
                    }
                case 114:
                    this.f31402l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 != -1 && int323 != 0 && int323 != 1) {
                        break;
                    } else {
                        this.f31403m = int323;
                        break;
                    }
                case 128:
                    this.f31404n = codedInputByteBufferNano.readUInt64();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.f31405o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 != 0 && int324 != 1) {
                        break;
                    } else {
                        this.f31406p = int324;
                        break;
                    }
                    break;
                case 184:
                    this.f31407q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f31408r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4993a9[] c4993a9Arr = this.f31409s;
                    int length = c4993a9Arr == null ? 0 : c4993a9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4993a9[] c4993a9Arr2 = new C4993a9[i];
                    if (length != 0) {
                        System.arraycopy(c4993a9Arr, 0, c4993a9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4993a9 c4993a9 = new C4993a9();
                        c4993a9Arr2[length] = c4993a9;
                        codedInputByteBufferNano.readMessage(c4993a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4993a9 c4993a92 = new C4993a9();
                    c4993a9Arr2[length] = c4993a92;
                    codedInputByteBufferNano.readMessage(c4993a92);
                    this.f31409s = c4993a9Arr2;
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
    public static C5043c9 m20227a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5043c9) MessageNano.mergeFrom(new C5043c9(), bArr);
    }
}

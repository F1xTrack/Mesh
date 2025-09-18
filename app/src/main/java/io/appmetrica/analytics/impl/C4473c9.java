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
public final class C4473c9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static volatile C4473c9[] S = null;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 5;
    public static final int x = 7;
    public static final int y = 13;
    public static final int z = 16;
    public long a;
    public long b;
    public int c;
    public String d;
    public byte[] e;
    public X8 f;
    public C4448b9 g;
    public String h;
    public int i;
    public int j;
    public int k;
    public byte[] l;
    public int m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public long r;
    public C4423a9[] s;

    public C4473c9() {
        a();
    }

    public static C4473c9[] b() {
        if (S == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (S == null) {
                        S = new C4473c9[0];
                    }
                } finally {
                }
            }
        }
        return S;
    }

    public final C4473c9 a() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.e = bArr;
        this.f = null;
        this.g = null;
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = -1;
        this.l = bArr;
        this.m = -1;
        this.n = 0L;
        this.o = 0L;
        this.p = 0;
        this.q = false;
        this.r = 1L;
        this.s = C4423a9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        if (!this.d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        byte[] bArr = this.e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.e);
        }
        X8 x8 = this.f;
        if (x8 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, x8);
        }
        C4448b9 c4448b9 = this.g;
        if (c4448b9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c4448b9);
        }
        if (!this.h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        int i = this.i;
        if (i != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i2);
        }
        int i3 = this.k;
        if (i3 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i3);
        }
        if (!Arrays.equals(this.l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.l);
        }
        int i4 = this.m;
        if (i4 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i4);
        }
        long j = this.n;
        if (j != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j);
        }
        long j2 = this.o;
        if (j2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j2);
        }
        int i5 = this.p;
        if (i5 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i5);
        }
        boolean z2 = this.q;
        if (z2) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        long j3 = this.r;
        if (j3 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j3);
        }
        C4423a9[] c4423a9Arr = this.s;
        if (c4423a9Arr != null && c4423a9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C4423a9[] c4423a9Arr2 = this.s;
                if (i6 >= c4423a9Arr2.length) {
                    break;
                }
                C4423a9 c4423a9 = c4423a9Arr2[i6];
                if (c4423a9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c4423a9) + iComputeUInt32Size;
                }
                i6++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        codedOutputByteBufferNano.writeUInt64(2, this.b);
        codedOutputByteBufferNano.writeUInt32(3, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        byte[] bArr = this.e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.e);
        }
        X8 x8 = this.f;
        if (x8 != null) {
            codedOutputByteBufferNano.writeMessage(6, x8);
        }
        C4448b9 c4448b9 = this.g;
        if (c4448b9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4448b9);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i2 = this.j;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i2);
        }
        int i3 = this.k;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i3);
        }
        if (!Arrays.equals(this.l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.l);
        }
        int i4 = this.m;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i4);
        }
        long j = this.n;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j);
        }
        long j2 = this.o;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j2);
        }
        int i5 = this.p;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i5);
        }
        boolean z2 = this.q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        long j3 = this.r;
        if (j3 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j3);
        }
        C4423a9[] c4423a9Arr = this.s;
        if (c4423a9Arr != null && c4423a9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C4423a9[] c4423a9Arr2 = this.s;
                if (i6 >= c4423a9Arr2.length) {
                    break;
                }
                C4423a9 c4423a9 = c4423a9Arr2[i6];
                if (c4423a9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c4423a9);
                }
                i6++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4473c9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4473c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4473c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case M /* 42 */:
                    this.e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new X8();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new C4448b9();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    break;
                case 66:
                    this.h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.j = int32;
                        break;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != -1 && int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.k = int322;
                        break;
                    }
                case 114:
                    this.l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 != -1 && int323 != 0 && int323 != 1) {
                        break;
                    } else {
                        this.m = int323;
                        break;
                    }
                case 128:
                    this.n = codedInputByteBufferNano.readUInt64();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 != 0 && int324 != 1) {
                        break;
                    } else {
                        this.p = int324;
                        break;
                    }
                    break;
                case 184:
                    this.q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C4423a9[] c4423a9Arr = this.s;
                    int length = c4423a9Arr == null ? 0 : c4423a9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4423a9[] c4423a9Arr2 = new C4423a9[i];
                    if (length != 0) {
                        System.arraycopy(c4423a9Arr, 0, c4423a9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4423a9 c4423a9 = new C4423a9();
                        c4423a9Arr2[length] = c4423a9;
                        codedInputByteBufferNano.readMessage(c4423a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4423a9 c4423a92 = new C4423a9();
                    c4423a9Arr2[length] = c4423a92;
                    codedInputByteBufferNano.readMessage(c4423a92);
                    this.s = c4423a9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C4473c9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4473c9) MessageNano.mergeFrom(new C4473c9(), bArr);
    }
}

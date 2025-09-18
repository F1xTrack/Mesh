package io.appmetrica.analytics.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5013yl extends MessageNano {
    public static final int E = -1;
    public static final int F = 0;
    public static final int G = 1;
    public static volatile C5013yl[] H;
    public C4774ol A;
    public C4965wl B;
    public C4917ul[] C;
    public C4869sl D;
    public String a;
    public long b;
    public String[] c;
    public String d;
    public String e;
    public String[] f;
    public String[] g;
    public C4845rl[] h;
    public C4893tl i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String[] o;
    public C4989xl p;
    public boolean q;
    public String r;
    public long s;
    public long t;
    public boolean u;
    public C4941vl v;
    public int w;
    public int x;
    public C4822ql y;
    public C4798pl z;

    public C5013yl() {
        a();
    }

    public static C5013yl[] b() {
        if (H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (H == null) {
                        H = new C5013yl[0];
                    }
                } finally {
                }
            }
        }
        return H;
    }

    public final C5013yl a() {
        this.a = "";
        this.b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.c = strArr;
        this.d = "";
        this.e = "";
        this.f = strArr;
        this.g = strArr;
        this.h = C4845rl.b();
        this.i = null;
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = false;
        this.n = "";
        this.o = strArr;
        this.p = null;
        this.q = false;
        this.r = "";
        this.s = 0L;
        this.t = 0L;
        this.u = false;
        this.v = null;
        this.w = 600;
        this.x = 1;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = C4917ul.b();
        this.D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.b) + iComputeSerializedSize;
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int iComputeStringSizeNoTag = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i3++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i3;
        }
        if (!this.d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        if (!this.e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    i5++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i4++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i5;
        }
        String[] strArr5 = this.g;
        if (strArr5 != null && strArr5.length > 0) {
            int i6 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.g;
                if (i6 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i6];
                if (str3 != null) {
                    i7++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i6++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i7;
        }
        C4845rl[] c4845rlArr = this.h;
        if (c4845rlArr != null && c4845rlArr.length > 0) {
            int i8 = 0;
            while (true) {
                C4845rl[] c4845rlArr2 = this.h;
                if (i8 >= c4845rlArr2.length) {
                    break;
                }
                C4845rl c4845rl = c4845rlArr2[i8];
                if (c4845rl != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c4845rl) + iComputeInt64Size;
                }
                i8++;
            }
        }
        C4893tl c4893tl = this.i;
        if (c4893tl != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c4893tl);
        }
        if (!this.j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.j);
        }
        if (!this.k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        if (!this.l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.m) + iComputeInt64Size;
        if (!this.n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr8 = this.o;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    i10++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i9++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i10;
        }
        C4989xl c4989xl = this.p;
        if (c4989xl != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c4989xl);
        }
        boolean z = this.q;
        if (z) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.t) + CodedOutputByteBufferNano.computeInt64Size(21, this.s) + iComputeBoolSize;
        boolean z2 = this.u;
        if (z2) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        C4941vl c4941vl = this.v;
        if (c4941vl != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c4941vl);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.x) + CodedOutputByteBufferNano.computeInt32Size(25, this.w) + iComputeInt64Size2;
        C4822ql c4822ql = this.y;
        if (c4822ql != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c4822ql);
        }
        C4798pl c4798pl = this.z;
        if (c4798pl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c4798pl);
        }
        C4774ol c4774ol = this.A;
        if (c4774ol != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c4774ol);
        }
        C4965wl c4965wl = this.B;
        if (c4965wl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c4965wl);
        }
        C4917ul[] c4917ulArr = this.C;
        if (c4917ulArr != null && c4917ulArr.length > 0) {
            while (true) {
                C4917ul[] c4917ulArr2 = this.C;
                if (i >= c4917ulArr2.length) {
                    break;
                }
                C4917ul c4917ul = c4917ulArr2[i];
                if (c4917ul != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c4917ul) + iComputeInt32Size;
                }
                i++;
            }
        }
        C4869sl c4869sl = this.D;
        return c4869sl != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c4869sl) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.b);
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        String[] strArr3 = this.f;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i3++;
            }
        }
        String[] strArr5 = this.g;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.g;
                if (i4 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i4++;
            }
        }
        C4845rl[] c4845rlArr = this.h;
        if (c4845rlArr != null && c4845rlArr.length > 0) {
            int i5 = 0;
            while (true) {
                C4845rl[] c4845rlArr2 = this.h;
                if (i5 >= c4845rlArr2.length) {
                    break;
                }
                C4845rl c4845rl = c4845rlArr2[i5];
                if (c4845rl != null) {
                    codedOutputByteBufferNano.writeMessage(8, c4845rl);
                }
                i5++;
            }
        }
        C4893tl c4893tl = this.i;
        if (c4893tl != null) {
            codedOutputByteBufferNano.writeMessage(9, c4893tl);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.l);
        }
        codedOutputByteBufferNano.writeBool(13, this.m);
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        String[] strArr7 = this.o;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.o;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i6++;
            }
        }
        C4989xl c4989xl = this.p;
        if (c4989xl != null) {
            codedOutputByteBufferNano.writeMessage(16, c4989xl);
        }
        boolean z = this.q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.s);
        codedOutputByteBufferNano.writeInt64(22, this.t);
        boolean z2 = this.u;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        C4941vl c4941vl = this.v;
        if (c4941vl != null) {
            codedOutputByteBufferNano.writeMessage(24, c4941vl);
        }
        codedOutputByteBufferNano.writeInt32(25, this.w);
        codedOutputByteBufferNano.writeInt32(26, this.x);
        C4822ql c4822ql = this.y;
        if (c4822ql != null) {
            codedOutputByteBufferNano.writeMessage(27, c4822ql);
        }
        C4798pl c4798pl = this.z;
        if (c4798pl != null) {
            codedOutputByteBufferNano.writeMessage(28, c4798pl);
        }
        C4774ol c4774ol = this.A;
        if (c4774ol != null) {
            codedOutputByteBufferNano.writeMessage(29, c4774ol);
        }
        C4965wl c4965wl = this.B;
        if (c4965wl != null) {
            codedOutputByteBufferNano.writeMessage(30, c4965wl);
        }
        C4917ul[] c4917ulArr = this.C;
        if (c4917ulArr != null && c4917ulArr.length > 0) {
            while (true) {
                C4917ul[] c4917ulArr2 = this.C;
                if (i >= c4917ulArr2.length) {
                    break;
                }
                C4917ul c4917ul = c4917ulArr2[i];
                if (c4917ul != null) {
                    codedOutputByteBufferNano.writeMessage(31, c4917ul);
                }
                i++;
            }
        }
        C4869sl c4869sl = this.D;
        if (c4869sl != null) {
            codedOutputByteBufferNano.writeMessage(32, c4869sl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5013yl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5013yl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5013yl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.c = strArr2;
                    break;
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case C4473c9.M /* 42 */:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i3 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C4845rl[] c4845rlArr = this.h;
                    int length4 = c4845rlArr == null ? 0 : c4845rlArr.length;
                    int i4 = repeatedFieldArrayLength4 + length4;
                    C4845rl[] c4845rlArr2 = new C4845rl[i4];
                    if (length4 != 0) {
                        System.arraycopy(c4845rlArr, 0, c4845rlArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        C4845rl c4845rl = new C4845rl();
                        c4845rlArr2[length4] = c4845rl;
                        codedInputByteBufferNano.readMessage(c4845rl);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C4845rl c4845rl2 = new C4845rl();
                    c4845rlArr2[length4] = c4845rl2;
                    codedInputByteBufferNano.readMessage(c4845rl2);
                    this.h = c4845rlArr2;
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new C4893tl();
                    }
                    codedInputByteBufferNano.readMessage(this.i);
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i5];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.o = strArr8;
                    break;
                case 130:
                    if (this.p == null) {
                        this.p = new C4989xl();
                    }
                    codedInputByteBufferNano.readMessage(this.p);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.v == null) {
                        this.v = new C4941vl();
                    }
                    codedInputByteBufferNano.readMessage(this.v);
                    break;
                case 200:
                    this.w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.y == null) {
                        this.y = new C4822ql();
                    }
                    codedInputByteBufferNano.readMessage(this.y);
                    break;
                case 226:
                    if (this.z == null) {
                        this.z = new C4798pl();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    break;
                case 234:
                    if (this.A == null) {
                        this.A = new C4774ol();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 242:
                    if (this.B == null) {
                        this.B = new C4965wl();
                    }
                    codedInputByteBufferNano.readMessage(this.B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C4917ul[] c4917ulArr = this.C;
                    int length6 = c4917ulArr == null ? 0 : c4917ulArr.length;
                    int i6 = repeatedFieldArrayLength6 + length6;
                    C4917ul[] c4917ulArr2 = new C4917ul[i6];
                    if (length6 != 0) {
                        System.arraycopy(c4917ulArr, 0, c4917ulArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        C4917ul c4917ul = new C4917ul();
                        c4917ulArr2[length6] = c4917ul;
                        codedInputByteBufferNano.readMessage(c4917ul);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C4917ul c4917ul2 = new C4917ul();
                    c4917ulArr2[length6] = c4917ul2;
                    codedInputByteBufferNano.readMessage(c4917ul2);
                    this.C = c4917ulArr2;
                    break;
                case 258:
                    if (this.D == null) {
                        this.D = new C4869sl();
                    }
                    codedInputByteBufferNano.readMessage(this.D);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C5013yl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5013yl) MessageNano.mergeFrom(new C5013yl(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.yl */
/* loaded from: classes2.dex */
public final class C5605yl extends MessageNano {

    /* renamed from: E */
    public static final int f32863E = -1;

    /* renamed from: F */
    public static final int f32864F = 0;

    /* renamed from: G */
    public static final int f32865G = 1;

    /* renamed from: H */
    public static volatile C5605yl[] f32866H;

    /* renamed from: A */
    public C5355ol f32867A;

    /* renamed from: B */
    public C5555wl f32868B;

    /* renamed from: C */
    public C5505ul[] f32869C;

    /* renamed from: D */
    public C5455sl f32870D;

    /* renamed from: a */
    public String f32871a;

    /* renamed from: b */
    public long f32872b;

    /* renamed from: c */
    public String[] f32873c;

    /* renamed from: d */
    public String f32874d;

    /* renamed from: e */
    public String f32875e;

    /* renamed from: f */
    public String[] f32876f;

    /* renamed from: g */
    public String[] f32877g;

    /* renamed from: h */
    public C5430rl[] f32878h;

    /* renamed from: i */
    public C5480tl f32879i;

    /* renamed from: j */
    public String f32880j;

    /* renamed from: k */
    public String f32881k;

    /* renamed from: l */
    public String f32882l;

    /* renamed from: m */
    public boolean f32883m;

    /* renamed from: n */
    public String f32884n;

    /* renamed from: o */
    public String[] f32885o;

    /* renamed from: p */
    public C5580xl f32886p;

    /* renamed from: q */
    public boolean f32887q;

    /* renamed from: r */
    public String f32888r;

    /* renamed from: s */
    public long f32889s;

    /* renamed from: t */
    public long f32890t;

    /* renamed from: u */
    public boolean f32891u;

    /* renamed from: v */
    public C5530vl f32892v;

    /* renamed from: w */
    public int f32893w;

    /* renamed from: x */
    public int f32894x;

    /* renamed from: y */
    public C5405ql f32895y;

    /* renamed from: z */
    public C5380pl f32896z;

    public C5605yl() {
        m21226a();
    }

    /* renamed from: b */
    public static C5605yl[] m21225b() {
        if (f32866H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32866H == null) {
                        f32866H = new C5605yl[0];
                    }
                } finally {
                }
            }
        }
        return f32866H;
    }

    /* renamed from: a */
    public final C5605yl m21226a() {
        this.f32871a = "";
        this.f32872b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f32873c = strArr;
        this.f32874d = "";
        this.f32875e = "";
        this.f32876f = strArr;
        this.f32877g = strArr;
        this.f32878h = C5430rl.m21022b();
        this.f32879i = null;
        this.f32880j = "";
        this.f32881k = "";
        this.f32882l = "";
        this.f32883m = false;
        this.f32884n = "";
        this.f32885o = strArr;
        this.f32886p = null;
        this.f32887q = false;
        this.f32888r = "";
        this.f32889s = 0L;
        this.f32890t = 0L;
        this.f32891u = false;
        this.f32892v = null;
        this.f32893w = 600;
        this.f32894x = 1;
        this.f32895y = null;
        this.f32896z = null;
        this.f32867A = null;
        this.f32868B = null;
        this.f32869C = C5505ul.m21147b();
        this.f32870D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f32871a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f32871a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f32872b) + iComputeSerializedSize;
        String[] strArr = this.f32873c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int iComputeStringSizeNoTag = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f32873c;
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
        if (!this.f32874d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f32874d);
        }
        if (!this.f32875e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f32875e);
        }
        String[] strArr3 = this.f32876f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f32876f;
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
        String[] strArr5 = this.f32877g;
        if (strArr5 != null && strArr5.length > 0) {
            int i6 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.f32877g;
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
        C5430rl[] c5430rlArr = this.f32878h;
        if (c5430rlArr != null && c5430rlArr.length > 0) {
            int i8 = 0;
            while (true) {
                C5430rl[] c5430rlArr2 = this.f32878h;
                if (i8 >= c5430rlArr2.length) {
                    break;
                }
                C5430rl c5430rl = c5430rlArr2[i8];
                if (c5430rl != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c5430rl) + iComputeInt64Size;
                }
                i8++;
            }
        }
        C5480tl c5480tl = this.f32879i;
        if (c5480tl != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c5480tl);
        }
        if (!this.f32880j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f32880j);
        }
        if (!this.f32881k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f32881k);
        }
        if (!this.f32882l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f32882l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f32883m) + iComputeInt64Size;
        if (!this.f32884n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f32884n);
        }
        String[] strArr7 = this.f32885o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr8 = this.f32885o;
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
        C5580xl c5580xl = this.f32886p;
        if (c5580xl != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c5580xl);
        }
        boolean z = this.f32887q;
        if (z) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f32888r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f32888r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f32890t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f32889s) + iComputeBoolSize;
        boolean z2 = this.f32891u;
        if (z2) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        C5530vl c5530vl = this.f32892v;
        if (c5530vl != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c5530vl);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f32894x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f32893w) + iComputeInt64Size2;
        C5405ql c5405ql = this.f32895y;
        if (c5405ql != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c5405ql);
        }
        C5380pl c5380pl = this.f32896z;
        if (c5380pl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c5380pl);
        }
        C5355ol c5355ol = this.f32867A;
        if (c5355ol != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c5355ol);
        }
        C5555wl c5555wl = this.f32868B;
        if (c5555wl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c5555wl);
        }
        C5505ul[] c5505ulArr = this.f32869C;
        if (c5505ulArr != null && c5505ulArr.length > 0) {
            while (true) {
                C5505ul[] c5505ulArr2 = this.f32869C;
                if (i >= c5505ulArr2.length) {
                    break;
                }
                C5505ul c5505ul = c5505ulArr2[i];
                if (c5505ul != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c5505ul) + iComputeInt32Size;
                }
                i++;
            }
        }
        C5455sl c5455sl = this.f32870D;
        return c5455sl != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c5455sl) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32871a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32871a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f32872b);
        String[] strArr = this.f32873c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f32873c;
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
        if (!this.f32874d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f32874d);
        }
        if (!this.f32875e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f32875e);
        }
        String[] strArr3 = this.f32876f;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f32876f;
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
        String[] strArr5 = this.f32877g;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.f32877g;
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
        C5430rl[] c5430rlArr = this.f32878h;
        if (c5430rlArr != null && c5430rlArr.length > 0) {
            int i5 = 0;
            while (true) {
                C5430rl[] c5430rlArr2 = this.f32878h;
                if (i5 >= c5430rlArr2.length) {
                    break;
                }
                C5430rl c5430rl = c5430rlArr2[i5];
                if (c5430rl != null) {
                    codedOutputByteBufferNano.writeMessage(8, c5430rl);
                }
                i5++;
            }
        }
        C5480tl c5480tl = this.f32879i;
        if (c5480tl != null) {
            codedOutputByteBufferNano.writeMessage(9, c5480tl);
        }
        if (!this.f32880j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f32880j);
        }
        if (!this.f32881k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f32881k);
        }
        if (!this.f32882l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f32882l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f32883m);
        if (!this.f32884n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f32884n);
        }
        String[] strArr7 = this.f32885o;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f32885o;
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
        C5580xl c5580xl = this.f32886p;
        if (c5580xl != null) {
            codedOutputByteBufferNano.writeMessage(16, c5580xl);
        }
        boolean z = this.f32887q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f32888r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f32888r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f32889s);
        codedOutputByteBufferNano.writeInt64(22, this.f32890t);
        boolean z2 = this.f32891u;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        C5530vl c5530vl = this.f32892v;
        if (c5530vl != null) {
            codedOutputByteBufferNano.writeMessage(24, c5530vl);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f32893w);
        codedOutputByteBufferNano.writeInt32(26, this.f32894x);
        C5405ql c5405ql = this.f32895y;
        if (c5405ql != null) {
            codedOutputByteBufferNano.writeMessage(27, c5405ql);
        }
        C5380pl c5380pl = this.f32896z;
        if (c5380pl != null) {
            codedOutputByteBufferNano.writeMessage(28, c5380pl);
        }
        C5355ol c5355ol = this.f32867A;
        if (c5355ol != null) {
            codedOutputByteBufferNano.writeMessage(29, c5355ol);
        }
        C5555wl c5555wl = this.f32868B;
        if (c5555wl != null) {
            codedOutputByteBufferNano.writeMessage(30, c5555wl);
        }
        C5505ul[] c5505ulArr = this.f32869C;
        if (c5505ulArr != null && c5505ulArr.length > 0) {
            while (true) {
                C5505ul[] c5505ulArr2 = this.f32869C;
                if (i >= c5505ulArr2.length) {
                    break;
                }
                C5505ul c5505ul = c5505ulArr2[i];
                if (c5505ul != null) {
                    codedOutputByteBufferNano.writeMessage(31, c5505ul);
                }
                i++;
            }
        }
        C5455sl c5455sl = this.f32870D;
        if (c5455sl != null) {
            codedOutputByteBufferNano.writeMessage(32, c5455sl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5605yl m21224b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5605yl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5605yl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f32871a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f32872b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f32873c;
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
                    this.f32873c = strArr2;
                    break;
                case 34:
                    this.f32874d = codedInputByteBufferNano.readString();
                    break;
                case C5043c9.f31377M /* 42 */:
                    this.f32875e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f32876f;
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
                    this.f32876f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f32877g;
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
                    this.f32877g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C5430rl[] c5430rlArr = this.f32878h;
                    int length4 = c5430rlArr == null ? 0 : c5430rlArr.length;
                    int i4 = repeatedFieldArrayLength4 + length4;
                    C5430rl[] c5430rlArr2 = new C5430rl[i4];
                    if (length4 != 0) {
                        System.arraycopy(c5430rlArr, 0, c5430rlArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        C5430rl c5430rl = new C5430rl();
                        c5430rlArr2[length4] = c5430rl;
                        codedInputByteBufferNano.readMessage(c5430rl);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C5430rl c5430rl2 = new C5430rl();
                    c5430rlArr2[length4] = c5430rl2;
                    codedInputByteBufferNano.readMessage(c5430rl2);
                    this.f32878h = c5430rlArr2;
                    break;
                case 74:
                    if (this.f32879i == null) {
                        this.f32879i = new C5480tl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32879i);
                    break;
                case 82:
                    this.f32880j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f32881k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f32882l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f32883m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f32884n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f32885o;
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
                    this.f32885o = strArr8;
                    break;
                case 130:
                    if (this.f32886p == null) {
                        this.f32886p = new C5580xl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32886p);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.f32887q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f32888r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f32889s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f32890t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f32891u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f32892v == null) {
                        this.f32892v = new C5530vl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32892v);
                    break;
                case 200:
                    this.f32893w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f32894x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f32895y == null) {
                        this.f32895y = new C5405ql();
                    }
                    codedInputByteBufferNano.readMessage(this.f32895y);
                    break;
                case 226:
                    if (this.f32896z == null) {
                        this.f32896z = new C5380pl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32896z);
                    break;
                case 234:
                    if (this.f32867A == null) {
                        this.f32867A = new C5355ol();
                    }
                    codedInputByteBufferNano.readMessage(this.f32867A);
                    break;
                case 242:
                    if (this.f32868B == null) {
                        this.f32868B = new C5555wl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32868B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C5505ul[] c5505ulArr = this.f32869C;
                    int length6 = c5505ulArr == null ? 0 : c5505ulArr.length;
                    int i6 = repeatedFieldArrayLength6 + length6;
                    C5505ul[] c5505ulArr2 = new C5505ul[i6];
                    if (length6 != 0) {
                        System.arraycopy(c5505ulArr, 0, c5505ulArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        C5505ul c5505ul = new C5505ul();
                        c5505ulArr2[length6] = c5505ul;
                        codedInputByteBufferNano.readMessage(c5505ul);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C5505ul c5505ul2 = new C5505ul();
                    c5505ulArr2[length6] = c5505ul2;
                    codedInputByteBufferNano.readMessage(c5505ul2);
                    this.f32869C = c5505ulArr2;
                    break;
                case 258:
                    if (this.f32870D == null) {
                        this.f32870D = new C5455sl();
                    }
                    codedInputByteBufferNano.readMessage(this.f32870D);
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
    public static C5605yl m21223a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5605yl) MessageNano.mergeFrom(new C5605yl(), bArr);
    }
}

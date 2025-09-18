package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b6 */
/* loaded from: classes2.dex */
public final class C5015b6 extends MessageNano {

    /* renamed from: l */
    public static final int f31290l = 0;

    /* renamed from: m */
    public static final int f31291m = 1;

    /* renamed from: n */
    public static volatile C5015b6[] f31292n;

    /* renamed from: o */
    public static byte[] f31293o;

    /* renamed from: p */
    public static volatile boolean f31294p;

    /* renamed from: a */
    public C5115f6 f31295a;

    /* renamed from: b */
    public C4869V5 f31296b;

    /* renamed from: c */
    public String f31297c;

    /* renamed from: d */
    public int f31298d;

    /* renamed from: e */
    public C5065d6[] f31299e;

    /* renamed from: f */
    public String f31300f;

    /* renamed from: g */
    public int f31301g;

    /* renamed from: h */
    public C4990a6 f31302h;

    /* renamed from: i */
    public byte[] f31303i;

    /* renamed from: j */
    public byte[] f31304j;

    /* renamed from: k */
    public C4917X5[] f31305k;

    public C5015b6() {
        if (!f31294p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f31294p) {
                        f31293o = InternalNano.bytesDefaultValue("JVM");
                        f31294p = true;
                    }
                } finally {
                }
            }
        }
        m20154a();
    }

    /* renamed from: b */
    public static C5015b6[] m20153b() {
        if (f31292n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31292n == null) {
                        f31292n = new C5015b6[0];
                    }
                } finally {
                }
            }
        }
        return f31292n;
    }

    /* renamed from: a */
    public final C5015b6 m20154a() {
        this.f31295a = null;
        this.f31296b = null;
        this.f31297c = "";
        this.f31298d = -1;
        this.f31299e = C5065d6.m20265b();
        this.f31300f = "";
        this.f31301g = 0;
        this.f31302h = null;
        this.f31303i = (byte[]) f31293o.clone();
        this.f31304j = WireFormatNano.EMPTY_BYTES;
        this.f31305k = C4917X5.m19966b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5115f6 c5115f6 = this.f31295a;
        if (c5115f6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5115f6);
        }
        C4869V5 c4869v5 = this.f31296b;
        if (c4869v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4869v5);
        }
        if (!this.f31297c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f31297c);
        }
        int i = this.f31298d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C5065d6[] c5065d6Arr = this.f31299e;
        int i2 = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31299e;
                if (i3 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i3];
                if (c5065d6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c5065d6) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        if (!this.f31300f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f31300f);
        }
        int i4 = this.f31301g;
        if (i4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        C4990a6 c4990a6 = this.f31302h;
        if (c4990a6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c4990a6);
        }
        if (!Arrays.equals(this.f31303i, f31293o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f31303i);
        }
        if (!Arrays.equals(this.f31304j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f31304j);
        }
        C4917X5[] c4917x5Arr = this.f31305k;
        if (c4917x5Arr != null && c4917x5Arr.length > 0) {
            while (true) {
                C4917X5[] c4917x5Arr2 = this.f31305k;
                if (i2 >= c4917x5Arr2.length) {
                    break;
                }
                C4917X5 c4917x5 = c4917x5Arr2[i2];
                if (c4917x5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c4917x5) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5115f6 c5115f6 = this.f31295a;
        if (c5115f6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5115f6);
        }
        C4869V5 c4869v5 = this.f31296b;
        if (c4869v5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4869v5);
        }
        if (!this.f31297c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f31297c);
        }
        int i = this.f31298d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C5065d6[] c5065d6Arr = this.f31299e;
        int i2 = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31299e;
                if (i3 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i3];
                if (c5065d6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5065d6);
                }
                i3++;
            }
        }
        if (!this.f31300f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f31300f);
        }
        int i4 = this.f31301g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        C4990a6 c4990a6 = this.f31302h;
        if (c4990a6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c4990a6);
        }
        if (!Arrays.equals(this.f31303i, f31293o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f31303i);
        }
        if (!Arrays.equals(this.f31304j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f31304j);
        }
        C4917X5[] c4917x5Arr = this.f31305k;
        if (c4917x5Arr != null && c4917x5Arr.length > 0) {
            while (true) {
                C4917X5[] c4917x5Arr2 = this.f31305k;
                if (i2 >= c4917x5Arr2.length) {
                    break;
                }
                C4917X5 c4917x5 = c4917x5Arr2[i2];
                if (c4917x5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c4917x5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5015b6 m20152b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5015b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5015b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f31295a == null) {
                        this.f31295a = new C5115f6();
                    }
                    codedInputByteBufferNano.readMessage(this.f31295a);
                    break;
                case 18:
                    if (this.f31296b == null) {
                        this.f31296b = new C4869V5();
                    }
                    codedInputByteBufferNano.readMessage(this.f31296b);
                    break;
                case 26:
                    this.f31297c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f31298d = int32;
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C5065d6[] c5065d6Arr = this.f31299e;
                    int length = c5065d6Arr == null ? 0 : c5065d6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C5065d6[] c5065d6Arr2 = new C5065d6[i];
                    if (length != 0) {
                        System.arraycopy(c5065d6Arr, 0, c5065d6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C5065d6 c5065d6 = new C5065d6();
                        c5065d6Arr2[length] = c5065d6;
                        codedInputByteBufferNano.readMessage(c5065d6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C5065d6 c5065d62 = new C5065d6();
                    c5065d6Arr2[length] = c5065d62;
                    codedInputByteBufferNano.readMessage(c5065d62);
                    this.f31299e = c5065d6Arr2;
                    break;
                case 50:
                    this.f31300f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f31301g = int322;
                        break;
                    }
                case 66:
                    if (this.f31302h == null) {
                        this.f31302h = new C4990a6();
                    }
                    codedInputByteBufferNano.readMessage(this.f31302h);
                    break;
                case 74:
                    this.f31303i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f31304j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C4917X5[] c4917x5Arr = this.f31305k;
                    int length2 = c4917x5Arr == null ? 0 : c4917x5Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C4917X5[] c4917x5Arr2 = new C4917X5[i2];
                    if (length2 != 0) {
                        System.arraycopy(c4917x5Arr, 0, c4917x5Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C4917X5 c4917x5 = new C4917X5();
                        c4917x5Arr2[length2] = c4917x5;
                        codedInputByteBufferNano.readMessage(c4917x5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C4917X5 c4917x52 = new C4917X5();
                    c4917x5Arr2[length2] = c4917x52;
                    codedInputByteBufferNano.readMessage(c4917x52);
                    this.f31305k = c4917x5Arr2;
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
    public static C5015b6 m20151a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5015b6) MessageNano.mergeFrom(new C5015b6(), bArr);
    }
}

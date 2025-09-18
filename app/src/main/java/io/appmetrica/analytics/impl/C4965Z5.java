package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Z5 */
/* loaded from: classes2.dex */
public final class C4965Z5 extends MessageNano {

    /* renamed from: k */
    public static final int f31146k = 0;

    /* renamed from: l */
    public static final int f31147l = 1;

    /* renamed from: m */
    public static volatile C4965Z5[] f31148m;

    /* renamed from: n */
    public static byte[] f31149n;

    /* renamed from: o */
    public static volatile boolean f31150o;

    /* renamed from: a */
    public C5115f6 f31151a;

    /* renamed from: b */
    public C4869V5 f31152b;

    /* renamed from: c */
    public String f31153c;

    /* renamed from: d */
    public int f31154d;

    /* renamed from: e */
    public C5065d6[] f31155e;

    /* renamed from: f */
    public int f31156f;

    /* renamed from: g */
    public C4941Y5 f31157g;

    /* renamed from: h */
    public byte[] f31158h;

    /* renamed from: i */
    public byte[] f31159i;

    /* renamed from: j */
    public C4917X5[] f31160j;

    public C4965Z5() {
        if (!f31150o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f31150o) {
                        f31149n = InternalNano.bytesDefaultValue("JVM");
                        f31150o = true;
                    }
                } finally {
                }
            }
        }
        m20062a();
    }

    /* renamed from: b */
    public static C4965Z5[] m20061b() {
        if (f31148m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31148m == null) {
                        f31148m = new C4965Z5[0];
                    }
                } finally {
                }
            }
        }
        return f31148m;
    }

    /* renamed from: a */
    public final C4965Z5 m20062a() {
        this.f31151a = null;
        this.f31152b = null;
        this.f31153c = "";
        this.f31154d = -1;
        this.f31155e = C5065d6.m20265b();
        this.f31156f = 0;
        this.f31157g = null;
        this.f31158h = (byte[]) f31149n.clone();
        this.f31159i = WireFormatNano.EMPTY_BYTES;
        this.f31160j = C4917X5.m19966b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5115f6 c5115f6 = this.f31151a;
        if (c5115f6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5115f6);
        }
        C4869V5 c4869v5 = this.f31152b;
        if (c4869v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4869v5);
        }
        if (!this.f31153c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f31153c);
        }
        int i = this.f31154d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C5065d6[] c5065d6Arr = this.f31155e;
        int i2 = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31155e;
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
        int i4 = this.f31156f;
        if (i4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        C4941Y5 c4941y5 = this.f31157g;
        if (c4941y5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c4941y5);
        }
        if (!Arrays.equals(this.f31158h, f31149n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f31158h);
        }
        if (!Arrays.equals(this.f31159i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f31159i);
        }
        C4917X5[] c4917x5Arr = this.f31160j;
        if (c4917x5Arr != null && c4917x5Arr.length > 0) {
            while (true) {
                C4917X5[] c4917x5Arr2 = this.f31160j;
                if (i2 >= c4917x5Arr2.length) {
                    break;
                }
                C4917X5 c4917x5 = c4917x5Arr2[i2];
                if (c4917x5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4917x5) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5115f6 c5115f6 = this.f31151a;
        if (c5115f6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5115f6);
        }
        C4869V5 c4869v5 = this.f31152b;
        if (c4869v5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4869v5);
        }
        if (!this.f31153c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f31153c);
        }
        int i = this.f31154d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C5065d6[] c5065d6Arr = this.f31155e;
        int i2 = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31155e;
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
        int i4 = this.f31156f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        C4941Y5 c4941y5 = this.f31157g;
        if (c4941y5 != null) {
            codedOutputByteBufferNano.writeMessage(7, c4941y5);
        }
        if (!Arrays.equals(this.f31158h, f31149n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f31158h);
        }
        if (!Arrays.equals(this.f31159i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f31159i);
        }
        C4917X5[] c4917x5Arr = this.f31160j;
        if (c4917x5Arr != null && c4917x5Arr.length > 0) {
            while (true) {
                C4917X5[] c4917x5Arr2 = this.f31160j;
                if (i2 >= c4917x5Arr2.length) {
                    break;
                }
                C4917X5 c4917x5 = c4917x5Arr2[i2];
                if (c4917x5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4917x5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C4965Z5 m20060b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4965Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4965Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f31151a == null) {
                        this.f31151a = new C5115f6();
                    }
                    codedInputByteBufferNano.readMessage(this.f31151a);
                    break;
                case 18:
                    if (this.f31152b == null) {
                        this.f31152b = new C4869V5();
                    }
                    codedInputByteBufferNano.readMessage(this.f31152b);
                    break;
                case 26:
                    this.f31153c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f31154d = int32;
                        break;
                    }
                    break;
                case C5043c9.f31377M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C5065d6[] c5065d6Arr = this.f31155e;
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
                    this.f31155e = c5065d6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f31156f = int322;
                        break;
                    }
                    break;
                case 58:
                    if (this.f31157g == null) {
                        this.f31157g = new C4941Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.f31157g);
                    break;
                case 66:
                    this.f31158h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f31159i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C4917X5[] c4917x5Arr = this.f31160j;
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
                    this.f31160j = c4917x5Arr2;
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
    public static C4965Z5 m20059a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4965Z5) MessageNano.mergeFrom(new C4965Z5(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Z5 extends MessageNano {
    public static final int k = 0;
    public static final int l = 1;
    public static volatile Z5[] m;
    public static byte[] n;
    public static volatile boolean o;
    public C4544f6 a;
    public V5 b;
    public String c;
    public int d;
    public C4495d6[] e;
    public int f;
    public Y5 g;
    public byte[] h;
    public byte[] i;
    public X5[] j;

    public Z5() {
        if (!o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!o) {
                        n = InternalNano.bytesDefaultValue("JVM");
                        o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static Z5[] b() {
        if (m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (m == null) {
                        m = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return m;
    }

    public final Z5 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = C4495d6.b();
        this.f = 0;
        this.g = null;
        this.h = (byte[]) n.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.j = X5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4544f6 c4544f6 = this.a;
        if (c4544f6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4544f6);
        }
        V5 v5 = this.b;
        if (v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, v5);
        }
        if (!this.c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C4495d6[] c4495d6Arr = this.e;
        int i2 = 0;
        if (c4495d6Arr != null && c4495d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4495d6[] c4495d6Arr2 = this.e;
                if (i3 >= c4495d6Arr2.length) {
                    break;
                }
                C4495d6 c4495d6 = c4495d6Arr2[i3];
                if (c4495d6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c4495d6) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f;
        if (i4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        Y5 y5 = this.g;
        if (y5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, y5);
        }
        if (!Arrays.equals(this.h, n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        X5[] x5Arr = this.j;
        if (x5Arr != null && x5Arr.length > 0) {
            while (true) {
                X5[] x5Arr2 = this.j;
                if (i2 >= x5Arr2.length) {
                    break;
                }
                X5 x5 = x5Arr2[i2];
                if (x5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, x5) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4544f6 c4544f6 = this.a;
        if (c4544f6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4544f6);
        }
        V5 v5 = this.b;
        if (v5 != null) {
            codedOutputByteBufferNano.writeMessage(2, v5);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C4495d6[] c4495d6Arr = this.e;
        int i2 = 0;
        if (c4495d6Arr != null && c4495d6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4495d6[] c4495d6Arr2 = this.e;
                if (i3 >= c4495d6Arr2.length) {
                    break;
                }
                C4495d6 c4495d6 = c4495d6Arr2[i3];
                if (c4495d6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4495d6);
                }
                i3++;
            }
        }
        int i4 = this.f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        Y5 y5 = this.g;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(7, y5);
        }
        if (!Arrays.equals(this.h, n)) {
            codedOutputByteBufferNano.writeBytes(8, this.h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        X5[] x5Arr = this.j;
        if (x5Arr != null && x5Arr.length > 0) {
            while (true) {
                X5[] x5Arr2 = this.j;
                if (i2 >= x5Arr2.length) {
                    break;
                }
                X5 x5 = x5Arr2[i2];
                if (x5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, x5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.a == null) {
                        this.a = new C4544f6();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new V5();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    break;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.d = int32;
                        break;
                    }
                    break;
                case C4473c9.M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4495d6[] c4495d6Arr = this.e;
                    int length = c4495d6Arr == null ? 0 : c4495d6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4495d6[] c4495d6Arr2 = new C4495d6[i];
                    if (length != 0) {
                        System.arraycopy(c4495d6Arr, 0, c4495d6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4495d6 c4495d6 = new C4495d6();
                        c4495d6Arr2[length] = c4495d6;
                        codedInputByteBufferNano.readMessage(c4495d6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4495d6 c4495d62 = new C4495d6();
                    c4495d6Arr2[length] = c4495d62;
                    codedInputByteBufferNano.readMessage(c4495d62);
                    this.e = c4495d6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f = int322;
                        break;
                    }
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new Y5();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    break;
                case 66:
                    this.h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    X5[] x5Arr = this.j;
                    int length2 = x5Arr == null ? 0 : x5Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    X5[] x5Arr2 = new X5[i2];
                    if (length2 != 0) {
                        System.arraycopy(x5Arr, 0, x5Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        X5 x5 = new X5();
                        x5Arr2[length2] = x5;
                        codedInputByteBufferNano.readMessage(x5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    X5 x52 = new X5();
                    x5Arr2[length2] = x52;
                    codedInputByteBufferNano.readMessage(x52);
                    this.j = x5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static Z5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}

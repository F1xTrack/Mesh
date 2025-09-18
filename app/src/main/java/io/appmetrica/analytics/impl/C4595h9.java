package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4595h9 extends MessageNano {
    public static final int f = -1;
    public static final int g = 0;
    public static final int h = 1;
    public static volatile C4595h9[] i;
    public C4523e9[] a;
    public Z8 b;
    public W8[] c;
    public C4547f9[] d;
    public String[] e;

    public C4595h9() {
        a();
    }

    public static C4595h9[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new C4595h9[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final C4595h9 a() {
        this.a = C4523e9.b();
        this.b = null;
        this.c = W8.b();
        this.d = C4547f9.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4523e9[] c4523e9Arr = this.a;
        int i2 = 0;
        if (c4523e9Arr != null && c4523e9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4523e9[] c4523e9Arr2 = this.a;
                if (i3 >= c4523e9Arr2.length) {
                    break;
                }
                C4523e9 c4523e9 = c4523e9Arr2[i3];
                if (c4523e9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c4523e9) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        Z8 z8 = this.b;
        if (z8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, z8);
        }
        W8[] w8Arr = this.c;
        if (w8Arr != null && w8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                W8[] w8Arr2 = this.c;
                if (i4 >= w8Arr2.length) {
                    break;
                }
                W8 w8 = w8Arr2[i4];
                if (w8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, w8) + iComputeSerializedSize;
                }
                i4++;
            }
        }
        C4547f9[] c4547f9Arr = this.d;
        if (c4547f9Arr != null && c4547f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C4547f9[] c4547f9Arr2 = this.d;
                if (i5 >= c4547f9Arr2.length) {
                    break;
                }
                C4547f9 c4547f9 = c4547f9Arr2[i5];
                if (c4547f9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c4547f9) + iComputeSerializedSize;
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.e;
            if (i2 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i6;
            }
            String str = strArr2[i2];
            if (str != null) {
                i6++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4523e9[] c4523e9Arr = this.a;
        int i2 = 0;
        if (c4523e9Arr != null && c4523e9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4523e9[] c4523e9Arr2 = this.a;
                if (i3 >= c4523e9Arr2.length) {
                    break;
                }
                C4523e9 c4523e9 = c4523e9Arr2[i3];
                if (c4523e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4523e9);
                }
                i3++;
            }
        }
        Z8 z8 = this.b;
        if (z8 != null) {
            codedOutputByteBufferNano.writeMessage(4, z8);
        }
        W8[] w8Arr = this.c;
        if (w8Arr != null && w8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                W8[] w8Arr2 = this.c;
                if (i4 >= w8Arr2.length) {
                    break;
                }
                W8 w8 = w8Arr2[i4];
                if (w8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, w8);
                }
                i4++;
            }
        }
        C4547f9[] c4547f9Arr = this.d;
        if (c4547f9Arr != null && c4547f9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C4547f9[] c4547f9Arr2 = this.d;
                if (i5 >= c4547f9Arr2.length) {
                    break;
                }
                C4547f9 c4547f9 = c4547f9Arr2[i5];
                if (c4547f9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c4547f9);
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.e;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4595h9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4595h9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4595h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4523e9[] c4523e9Arr = this.a;
                int length = c4523e9Arr == null ? 0 : c4523e9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C4523e9[] c4523e9Arr2 = new C4523e9[i2];
                if (length != 0) {
                    System.arraycopy(c4523e9Arr, 0, c4523e9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C4523e9 c4523e9 = new C4523e9();
                    c4523e9Arr2[length] = c4523e9;
                    codedInputByteBufferNano.readMessage(c4523e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4523e9 c4523e92 = new C4523e9();
                c4523e9Arr2[length] = c4523e92;
                codedInputByteBufferNano.readMessage(c4523e92);
                this.a = c4523e9Arr2;
            } else if (tag == 34) {
                if (this.b == null) {
                    this.b = new Z8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                W8[] w8Arr = this.c;
                int length2 = w8Arr == null ? 0 : w8Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                W8[] w8Arr2 = new W8[i3];
                if (length2 != 0) {
                    System.arraycopy(w8Arr, 0, w8Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    W8 w8 = new W8();
                    w8Arr2[length2] = w8;
                    codedInputByteBufferNano.readMessage(w8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                W8 w82 = new W8();
                w8Arr2[length2] = w82;
                codedInputByteBufferNano.readMessage(w82);
                this.c = w8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C4547f9[] c4547f9Arr = this.d;
                int length3 = c4547f9Arr == null ? 0 : c4547f9Arr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                C4547f9[] c4547f9Arr2 = new C4547f9[i4];
                if (length3 != 0) {
                    System.arraycopy(c4547f9Arr, 0, c4547f9Arr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    C4547f9 c4547f9 = new C4547f9();
                    c4547f9Arr2[length3] = c4547f9;
                    codedInputByteBufferNano.readMessage(c4547f9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C4547f9 c4547f92 = new C4547f9();
                c4547f9Arr2[length3] = c4547f92;
                codedInputByteBufferNano.readMessage(c4547f92);
                this.d = c4547f9Arr2;
            } else if (tag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i5];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i5 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.e = strArr2;
            }
        }
    }

    public static C4595h9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4595h9) MessageNano.mergeFrom(new C4595h9(), bArr);
    }
}

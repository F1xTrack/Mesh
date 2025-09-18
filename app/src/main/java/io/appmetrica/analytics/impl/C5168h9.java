package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9 */
/* loaded from: classes2.dex */
public final class C5168h9 extends MessageNano {

    /* renamed from: f */
    public static final int f31847f = -1;

    /* renamed from: g */
    public static final int f31848g = 0;

    /* renamed from: h */
    public static final int f31849h = 1;

    /* renamed from: i */
    public static volatile C5168h9[] f31850i;

    /* renamed from: a */
    public C5093e9[] f31851a;

    /* renamed from: b */
    public C4968Z8 f31852b;

    /* renamed from: c */
    public C4896W8[] f31853c;

    /* renamed from: d */
    public C5118f9[] f31854d;

    /* renamed from: e */
    public String[] f31855e;

    public C5168h9() {
        m20495a();
    }

    /* renamed from: b */
    public static C5168h9[] m20494b() {
        if (f31850i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31850i == null) {
                        f31850i = new C5168h9[0];
                    }
                } finally {
                }
            }
        }
        return f31850i;
    }

    /* renamed from: a */
    public final C5168h9 m20495a() {
        this.f31851a = C5093e9.m20331b();
        this.f31852b = null;
        this.f31853c = C4896W8.m19941b();
        this.f31854d = C5118f9.m20378b();
        this.f31855e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5093e9[] c5093e9Arr = this.f31851a;
        int i = 0;
        if (c5093e9Arr != null && c5093e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5093e9[] c5093e9Arr2 = this.f31851a;
                if (i2 >= c5093e9Arr2.length) {
                    break;
                }
                C5093e9 c5093e9 = c5093e9Arr2[i2];
                if (c5093e9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c5093e9) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        C4968Z8 c4968z8 = this.f31852b;
        if (c4968z8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4968z8);
        }
        C4896W8[] c4896w8Arr = this.f31853c;
        if (c4896w8Arr != null && c4896w8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4896W8[] c4896w8Arr2 = this.f31853c;
                if (i3 >= c4896w8Arr2.length) {
                    break;
                }
                C4896W8 c4896w8 = c4896w8Arr2[i3];
                if (c4896w8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c4896w8) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        C5118f9[] c5118f9Arr = this.f31854d;
        if (c5118f9Arr != null && c5118f9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C5118f9[] c5118f9Arr2 = this.f31854d;
                if (i4 >= c5118f9Arr2.length) {
                    break;
                }
                C5118f9 c5118f9 = c5118f9Arr2[i4];
                if (c5118f9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c5118f9) + iComputeSerializedSize;
                }
                i4++;
            }
        }
        String[] strArr = this.f31855e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f31855e;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i5;
            }
            String str = strArr2[i];
            if (str != null) {
                i5++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5093e9[] c5093e9Arr = this.f31851a;
        int i = 0;
        if (c5093e9Arr != null && c5093e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5093e9[] c5093e9Arr2 = this.f31851a;
                if (i2 >= c5093e9Arr2.length) {
                    break;
                }
                C5093e9 c5093e9 = c5093e9Arr2[i2];
                if (c5093e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5093e9);
                }
                i2++;
            }
        }
        C4968Z8 c4968z8 = this.f31852b;
        if (c4968z8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4968z8);
        }
        C4896W8[] c4896w8Arr = this.f31853c;
        if (c4896w8Arr != null && c4896w8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4896W8[] c4896w8Arr2 = this.f31853c;
                if (i3 >= c4896w8Arr2.length) {
                    break;
                }
                C4896W8 c4896w8 = c4896w8Arr2[i3];
                if (c4896w8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c4896w8);
                }
                i3++;
            }
        }
        C5118f9[] c5118f9Arr = this.f31854d;
        if (c5118f9Arr != null && c5118f9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C5118f9[] c5118f9Arr2 = this.f31854d;
                if (i4 >= c5118f9Arr2.length) {
                    break;
                }
                C5118f9 c5118f9 = c5118f9Arr2[i4];
                if (c5118f9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c5118f9);
                }
                i4++;
            }
        }
        String[] strArr = this.f31855e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f31855e;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5168h9 m20493b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5168h9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5168h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5093e9[] c5093e9Arr = this.f31851a;
                int length = c5093e9Arr == null ? 0 : c5093e9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5093e9[] c5093e9Arr2 = new C5093e9[i];
                if (length != 0) {
                    System.arraycopy(c5093e9Arr, 0, c5093e9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5093e9 c5093e9 = new C5093e9();
                    c5093e9Arr2[length] = c5093e9;
                    codedInputByteBufferNano.readMessage(c5093e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5093e9 c5093e92 = new C5093e9();
                c5093e9Arr2[length] = c5093e92;
                codedInputByteBufferNano.readMessage(c5093e92);
                this.f31851a = c5093e9Arr2;
            } else if (tag == 34) {
                if (this.f31852b == null) {
                    this.f31852b = new C4968Z8();
                }
                codedInputByteBufferNano.readMessage(this.f31852b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C4896W8[] c4896w8Arr = this.f31853c;
                int length2 = c4896w8Arr == null ? 0 : c4896w8Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C4896W8[] c4896w8Arr2 = new C4896W8[i2];
                if (length2 != 0) {
                    System.arraycopy(c4896w8Arr, 0, c4896w8Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C4896W8 c4896w8 = new C4896W8();
                    c4896w8Arr2[length2] = c4896w8;
                    codedInputByteBufferNano.readMessage(c4896w8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4896W8 c4896w82 = new C4896W8();
                c4896w8Arr2[length2] = c4896w82;
                codedInputByteBufferNano.readMessage(c4896w82);
                this.f31853c = c4896w8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C5118f9[] c5118f9Arr = this.f31854d;
                int length3 = c5118f9Arr == null ? 0 : c5118f9Arr.length;
                int i3 = repeatedFieldArrayLength3 + length3;
                C5118f9[] c5118f9Arr2 = new C5118f9[i3];
                if (length3 != 0) {
                    System.arraycopy(c5118f9Arr, 0, c5118f9Arr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    C5118f9 c5118f9 = new C5118f9();
                    c5118f9Arr2[length3] = c5118f9;
                    codedInputByteBufferNano.readMessage(c5118f9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C5118f9 c5118f92 = new C5118f9();
                c5118f9Arr2[length3] = c5118f92;
                codedInputByteBufferNano.readMessage(c5118f92);
                this.f31854d = c5118f9Arr2;
            } else if (tag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f31855e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f31855e = strArr2;
            }
        }
    }

    /* renamed from: a */
    public static C5168h9 m20492a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5168h9) MessageNano.mergeFrom(new C5168h9(), bArr);
    }
}

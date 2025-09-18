package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y1 */
/* loaded from: classes2.dex */
public final class C4937Y1 extends MessageNano {

    /* renamed from: d */
    public static volatile C4937Y1[] f31084d;

    /* renamed from: a */
    public C4913X1[] f31085a;

    /* renamed from: b */
    public C4889W1 f31086b;

    /* renamed from: c */
    public String[] f31087c;

    public C4937Y1() {
        m20016a();
    }

    /* renamed from: b */
    public static C4937Y1[] m20015b() {
        if (f31084d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31084d == null) {
                        f31084d = new C4937Y1[0];
                    }
                } finally {
                }
            }
        }
        return f31084d;
    }

    /* renamed from: a */
    public final C4937Y1 m20016a() {
        this.f31085a = C4913X1.m19957b();
        this.f31086b = null;
        this.f31087c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4913X1[] c4913x1Arr = this.f31085a;
        int i = 0;
        if (c4913x1Arr != null && c4913x1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4913X1[] c4913x1Arr2 = this.f31085a;
                if (i2 >= c4913x1Arr2.length) {
                    break;
                }
                C4913X1 c4913x1 = c4913x1Arr2[i2];
                if (c4913x1 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4913x1) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        C4889W1 c4889w1 = this.f31086b;
        if (c4889w1 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4889w1);
        }
        String[] strArr = this.f31087c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f31087c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i3;
            }
            String str = strArr2[i];
            if (str != null) {
                i3++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4913X1[] c4913x1Arr = this.f31085a;
        int i = 0;
        if (c4913x1Arr != null && c4913x1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4913X1[] c4913x1Arr2 = this.f31085a;
                if (i2 >= c4913x1Arr2.length) {
                    break;
                }
                C4913X1 c4913x1 = c4913x1Arr2[i2];
                if (c4913x1 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4913x1);
                }
                i2++;
            }
        }
        C4889W1 c4889w1 = this.f31086b;
        if (c4889w1 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4889w1);
        }
        String[] strArr = this.f31087c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f31087c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4937Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4913X1[] c4913x1Arr = this.f31085a;
                int length = c4913x1Arr == null ? 0 : c4913x1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4913X1[] c4913x1Arr2 = new C4913X1[i];
                if (length != 0) {
                    System.arraycopy(c4913x1Arr, 0, c4913x1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4913X1 c4913x1 = new C4913X1();
                    c4913x1Arr2[length] = c4913x1;
                    codedInputByteBufferNano.readMessage(c4913x1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4913X1 c4913x12 = new C4913X1();
                c4913x1Arr2[length] = c4913x12;
                codedInputByteBufferNano.readMessage(c4913x12);
                this.f31085a = c4913x1Arr2;
            } else if (tag == 18) {
                if (this.f31086b == null) {
                    this.f31086b = new C4889W1();
                }
                codedInputByteBufferNano.readMessage(this.f31086b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f31087c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f31087c = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C4937Y1 m20014b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4937Y1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4937Y1 m20013a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4937Y1) MessageNano.mergeFrom(new C4937Y1(), bArr);
    }
}

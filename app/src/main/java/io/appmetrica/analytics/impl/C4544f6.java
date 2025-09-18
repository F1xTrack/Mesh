package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f6 */
/* loaded from: classes2.dex */
public final class C4544f6 extends MessageNano {
    public static volatile C4544f6[] f;
    public String a;
    public String b;
    public C4495d6[] c;
    public C4544f6 d;
    public C4544f6[] e;

    public C4544f6() {
        a();
    }

    public static C4544f6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C4544f6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C4544f6 a() {
        this.a = "";
        this.b = "";
        this.c = C4495d6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        if (!this.b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        C4495d6[] c4495d6Arr = this.c;
        int i = 0;
        if (c4495d6Arr != null && c4495d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4495d6[] c4495d6Arr2 = this.c;
                if (i2 >= c4495d6Arr2.length) {
                    break;
                }
                C4495d6 c4495d6 = c4495d6Arr2[i2];
                if (c4495d6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c4495d6) + iComputeStringSize;
                }
                i2++;
            }
        }
        C4544f6 c4544f6 = this.d;
        if (c4544f6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c4544f6);
        }
        C4544f6[] c4544f6Arr = this.e;
        if (c4544f6Arr != null && c4544f6Arr.length > 0) {
            while (true) {
                C4544f6[] c4544f6Arr2 = this.e;
                if (i >= c4544f6Arr2.length) {
                    break;
                }
                C4544f6 c4544f62 = c4544f6Arr2[i];
                if (c4544f62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c4544f62) + iComputeStringSize;
                }
                i++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        C4495d6[] c4495d6Arr = this.c;
        int i = 0;
        if (c4495d6Arr != null && c4495d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4495d6[] c4495d6Arr2 = this.c;
                if (i2 >= c4495d6Arr2.length) {
                    break;
                }
                C4495d6 c4495d6 = c4495d6Arr2[i2];
                if (c4495d6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4495d6);
                }
                i2++;
            }
        }
        C4544f6 c4544f6 = this.d;
        if (c4544f6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4544f6);
        }
        C4544f6[] c4544f6Arr = this.e;
        if (c4544f6Arr != null && c4544f6Arr.length > 0) {
            while (true) {
                C4544f6[] c4544f6Arr2 = this.e;
                if (i >= c4544f6Arr2.length) {
                    break;
                }
                C4544f6 c4544f62 = c4544f6Arr2[i];
                if (c4544f62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4544f62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4544f6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4544f6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4544f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4495d6[] c4495d6Arr = this.c;
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
                this.c = c4495d6Arr2;
            } else if (tag == 34) {
                if (this.d == null) {
                    this.d = new C4544f6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C4544f6[] c4544f6Arr = this.e;
                int length2 = c4544f6Arr == null ? 0 : c4544f6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C4544f6[] c4544f6Arr2 = new C4544f6[i2];
                if (length2 != 0) {
                    System.arraycopy(c4544f6Arr, 0, c4544f6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C4544f6 c4544f6 = new C4544f6();
                    c4544f6Arr2[length2] = c4544f6;
                    codedInputByteBufferNano.readMessage(c4544f6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4544f6 c4544f62 = new C4544f6();
                c4544f6Arr2[length2] = c4544f62;
                codedInputByteBufferNano.readMessage(c4544f62);
                this.e = c4544f6Arr2;
            }
        }
    }

    public static C4544f6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4544f6) MessageNano.mergeFrom(new C4544f6(), bArr);
    }
}

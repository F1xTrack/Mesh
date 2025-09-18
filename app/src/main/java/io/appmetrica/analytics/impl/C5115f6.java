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
public final class C5115f6 extends MessageNano {

    /* renamed from: f */
    public static volatile C5115f6[] f31653f;

    /* renamed from: a */
    public String f31654a;

    /* renamed from: b */
    public String f31655b;

    /* renamed from: c */
    public C5065d6[] f31656c;

    /* renamed from: d */
    public C5115f6 f31657d;

    /* renamed from: e */
    public C5115f6[] f31658e;

    public C5115f6() {
        m20364a();
    }

    /* renamed from: b */
    public static C5115f6[] m20363b() {
        if (f31653f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31653f == null) {
                        f31653f = new C5115f6[0];
                    }
                } finally {
                }
            }
        }
        return f31653f;
    }

    /* renamed from: a */
    public final C5115f6 m20364a() {
        this.f31654a = "";
        this.f31655b = "";
        this.f31656c = C5065d6.m20265b();
        this.f31657d = null;
        this.f31658e = m20363b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f31654a) + super.computeSerializedSize();
        if (!this.f31655b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f31655b);
        }
        C5065d6[] c5065d6Arr = this.f31656c;
        int i = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31656c;
                if (i2 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i2];
                if (c5065d6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c5065d6) + iComputeStringSize;
                }
                i2++;
            }
        }
        C5115f6 c5115f6 = this.f31657d;
        if (c5115f6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c5115f6);
        }
        C5115f6[] c5115f6Arr = this.f31658e;
        if (c5115f6Arr != null && c5115f6Arr.length > 0) {
            while (true) {
                C5115f6[] c5115f6Arr2 = this.f31658e;
                if (i >= c5115f6Arr2.length) {
                    break;
                }
                C5115f6 c5115f62 = c5115f6Arr2[i];
                if (c5115f62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c5115f62) + iComputeStringSize;
                }
                i++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f31654a);
        if (!this.f31655b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f31655b);
        }
        C5065d6[] c5065d6Arr = this.f31656c;
        int i = 0;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31656c;
                if (i2 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i2];
                if (c5065d6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5065d6);
                }
                i2++;
            }
        }
        C5115f6 c5115f6 = this.f31657d;
        if (c5115f6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5115f6);
        }
        C5115f6[] c5115f6Arr = this.f31658e;
        if (c5115f6Arr != null && c5115f6Arr.length > 0) {
            while (true) {
                C5115f6[] c5115f6Arr2 = this.f31658e;
                if (i >= c5115f6Arr2.length) {
                    break;
                }
                C5115f6 c5115f62 = c5115f6Arr2[i];
                if (c5115f62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5115f62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5115f6 m20362b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5115f6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5115f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31654a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f31655b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5065d6[] c5065d6Arr = this.f31656c;
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
                this.f31656c = c5065d6Arr2;
            } else if (tag == 34) {
                if (this.f31657d == null) {
                    this.f31657d = new C5115f6();
                }
                codedInputByteBufferNano.readMessage(this.f31657d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C5115f6[] c5115f6Arr = this.f31658e;
                int length2 = c5115f6Arr == null ? 0 : c5115f6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C5115f6[] c5115f6Arr2 = new C5115f6[i2];
                if (length2 != 0) {
                    System.arraycopy(c5115f6Arr, 0, c5115f6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C5115f6 c5115f6 = new C5115f6();
                    c5115f6Arr2[length2] = c5115f6;
                    codedInputByteBufferNano.readMessage(c5115f6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C5115f6 c5115f62 = new C5115f6();
                c5115f6Arr2[length2] = c5115f62;
                codedInputByteBufferNano.readMessage(c5115f62);
                this.f31658e = c5115f6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C5115f6 m20361a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5115f6) MessageNano.mergeFrom(new C5115f6(), bArr);
    }
}

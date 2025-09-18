package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class V5 extends MessageNano {
    public static volatile V5[] d;
    public C4520e6 a;
    public C4520e6[] b;
    public String c;

    public V5() {
        a();
    }

    public static V5[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new V5[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final V5 a() {
        this.a = null;
        this.b = C4520e6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4520e6 c4520e6 = this.a;
        if (c4520e6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4520e6);
        }
        C4520e6[] c4520e6Arr = this.b;
        if (c4520e6Arr != null && c4520e6Arr.length > 0) {
            int i = 0;
            while (true) {
                C4520e6[] c4520e6Arr2 = this.b;
                if (i >= c4520e6Arr2.length) {
                    break;
                }
                C4520e6 c4520e62 = c4520e6Arr2[i];
                if (c4520e62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4520e62) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.c) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4520e6 c4520e6 = this.a;
        if (c4520e6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4520e6);
        }
        C4520e6[] c4520e6Arr = this.b;
        if (c4520e6Arr != null && c4520e6Arr.length > 0) {
            int i = 0;
            while (true) {
                C4520e6[] c4520e6Arr2 = this.b;
                if (i >= c4520e6Arr2.length) {
                    break;
                }
                C4520e6 c4520e62 = c4520e6Arr2[i];
                if (c4520e62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4520e62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new C4520e6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4520e6[] c4520e6Arr = this.b;
                int length = c4520e6Arr == null ? 0 : c4520e6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4520e6[] c4520e6Arr2 = new C4520e6[i];
                if (length != 0) {
                    System.arraycopy(c4520e6Arr, 0, c4520e6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4520e6 c4520e6 = new C4520e6();
                    c4520e6Arr2[length] = c4520e6;
                    codedInputByteBufferNano.readMessage(c4520e6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4520e6 c4520e62 = new C4520e6();
                c4520e6Arr2[length] = c4520e62;
                codedInputByteBufferNano.readMessage(c4520e62);
                this.b = c4520e6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    public static V5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.V5 */
/* loaded from: classes2.dex */
public final class C4869V5 extends MessageNano {

    /* renamed from: d */
    public static volatile C4869V5[] f30844d;

    /* renamed from: a */
    public C5090e6 f30845a;

    /* renamed from: b */
    public C5090e6[] f30846b;

    /* renamed from: c */
    public String f30847c;

    public C4869V5() {
        m19907a();
    }

    /* renamed from: b */
    public static C4869V5[] m19906b() {
        if (f30844d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30844d == null) {
                        f30844d = new C4869V5[0];
                    }
                } finally {
                }
            }
        }
        return f30844d;
    }

    /* renamed from: a */
    public final C4869V5 m19907a() {
        this.f30845a = null;
        this.f30846b = C5090e6.m20305b();
        this.f30847c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5090e6 c5090e6 = this.f30845a;
        if (c5090e6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5090e6);
        }
        C5090e6[] c5090e6Arr = this.f30846b;
        if (c5090e6Arr != null && c5090e6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5090e6[] c5090e6Arr2 = this.f30846b;
                if (i >= c5090e6Arr2.length) {
                    break;
                }
                C5090e6 c5090e62 = c5090e6Arr2[i];
                if (c5090e62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5090e62) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f30847c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f30847c) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5090e6 c5090e6 = this.f30845a;
        if (c5090e6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5090e6);
        }
        C5090e6[] c5090e6Arr = this.f30846b;
        if (c5090e6Arr != null && c5090e6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5090e6[] c5090e6Arr2 = this.f30846b;
                if (i >= c5090e6Arr2.length) {
                    break;
                }
                C5090e6 c5090e62 = c5090e6Arr2[i];
                if (c5090e62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5090e62);
                }
                i++;
            }
        }
        if (!this.f30847c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f30847c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4869V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f30845a == null) {
                    this.f30845a = new C5090e6();
                }
                codedInputByteBufferNano.readMessage(this.f30845a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5090e6[] c5090e6Arr = this.f30846b;
                int length = c5090e6Arr == null ? 0 : c5090e6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5090e6[] c5090e6Arr2 = new C5090e6[i];
                if (length != 0) {
                    System.arraycopy(c5090e6Arr, 0, c5090e6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5090e6 c5090e6 = new C5090e6();
                    c5090e6Arr2[length] = c5090e6;
                    codedInputByteBufferNano.readMessage(c5090e6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5090e6 c5090e62 = new C5090e6();
                c5090e6Arr2[length] = c5090e62;
                codedInputByteBufferNano.readMessage(c5090e62);
                this.f30846b = c5090e6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f30847c = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C4869V5 m19905b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4869V5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4869V5 m19904a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4869V5) MessageNano.mergeFrom(new C4869V5(), bArr);
    }
}

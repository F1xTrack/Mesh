package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Nj */
/* loaded from: classes2.dex */
public final class C4692Nj extends MessageNano {

    /* renamed from: b */
    public static volatile C4692Nj[] f30529b;

    /* renamed from: a */
    public C4716Oj[] f30530a;

    public C4692Nj() {
        m19671a();
    }

    /* renamed from: b */
    public static C4692Nj[] m19670b() {
        if (f30529b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30529b == null) {
                        f30529b = new C4692Nj[0];
                    }
                } finally {
                }
            }
        }
        return f30529b;
    }

    /* renamed from: a */
    public final C4692Nj m19671a() {
        this.f30530a = C4716Oj.m19701b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4716Oj[] c4716OjArr = this.f30530a;
        if (c4716OjArr != null && c4716OjArr.length > 0) {
            int i = 0;
            while (true) {
                C4716Oj[] c4716OjArr2 = this.f30530a;
                if (i >= c4716OjArr2.length) {
                    break;
                }
                C4716Oj c4716Oj = c4716OjArr2[i];
                if (c4716Oj != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4716Oj) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4716Oj[] c4716OjArr = this.f30530a;
        if (c4716OjArr != null && c4716OjArr.length > 0) {
            int i = 0;
            while (true) {
                C4716Oj[] c4716OjArr2 = this.f30530a;
                if (i >= c4716OjArr2.length) {
                    break;
                }
                C4716Oj c4716Oj = c4716OjArr2[i];
                if (c4716Oj != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4716Oj);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4692Nj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4716Oj[] c4716OjArr = this.f30530a;
                int length = c4716OjArr == null ? 0 : c4716OjArr.length;
                int i = repeatedFieldArrayLength + length;
                C4716Oj[] c4716OjArr2 = new C4716Oj[i];
                if (length != 0) {
                    System.arraycopy(c4716OjArr, 0, c4716OjArr2, 0, length);
                }
                while (length < i - 1) {
                    C4716Oj c4716Oj = new C4716Oj();
                    c4716OjArr2[length] = c4716Oj;
                    codedInputByteBufferNano.readMessage(c4716Oj);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4716Oj c4716Oj2 = new C4716Oj();
                c4716OjArr2[length] = c4716Oj2;
                codedInputByteBufferNano.readMessage(c4716Oj2);
                this.f30530a = c4716OjArr2;
            }
        }
    }

    /* renamed from: b */
    public static C4692Nj m19669b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4692Nj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4692Nj m19668a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4692Nj) MessageNano.mergeFrom(new C4692Nj(), bArr);
    }
}

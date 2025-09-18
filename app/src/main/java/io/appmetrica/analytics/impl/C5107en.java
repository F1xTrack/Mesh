package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.en */
/* loaded from: classes2.dex */
public final class C5107en extends MessageNano {

    /* renamed from: b */
    public static volatile C5107en[] f31642b;

    /* renamed from: a */
    public C5032bn[] f31643a;

    public C5107en() {
        m20356a();
    }

    /* renamed from: b */
    public static C5107en[] m20355b() {
        if (f31642b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31642b == null) {
                        f31642b = new C5107en[0];
                    }
                } finally {
                }
            }
        }
        return f31642b;
    }

    /* renamed from: a */
    public final C5107en m20356a() {
        this.f31643a = C5032bn.m20204b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5032bn[] c5032bnArr = this.f31643a;
        if (c5032bnArr != null && c5032bnArr.length > 0) {
            int i = 0;
            while (true) {
                C5032bn[] c5032bnArr2 = this.f31643a;
                if (i >= c5032bnArr2.length) {
                    break;
                }
                C5032bn c5032bn = c5032bnArr2[i];
                if (c5032bn != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5032bn) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5032bn[] c5032bnArr = this.f31643a;
        if (c5032bnArr != null && c5032bnArr.length > 0) {
            int i = 0;
            while (true) {
                C5032bn[] c5032bnArr2 = this.f31643a;
                if (i >= c5032bnArr2.length) {
                    break;
                }
                C5032bn c5032bn = c5032bnArr2[i];
                if (c5032bn != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5032bn);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5107en mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5032bn[] c5032bnArr = this.f31643a;
                int length = c5032bnArr == null ? 0 : c5032bnArr.length;
                int i = repeatedFieldArrayLength + length;
                C5032bn[] c5032bnArr2 = new C5032bn[i];
                if (length != 0) {
                    System.arraycopy(c5032bnArr, 0, c5032bnArr2, 0, length);
                }
                while (length < i - 1) {
                    C5032bn c5032bn = new C5032bn();
                    c5032bnArr2[length] = c5032bn;
                    codedInputByteBufferNano.readMessage(c5032bn);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5032bn c5032bn2 = new C5032bn();
                c5032bnArr2[length] = c5032bn2;
                codedInputByteBufferNano.readMessage(c5032bn2);
                this.f31643a = c5032bnArr2;
            }
        }
    }

    /* renamed from: b */
    public static C5107en m20354b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5107en().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5107en m20353a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5107en) MessageNano.mergeFrom(new C5107en(), bArr);
    }
}

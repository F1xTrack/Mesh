package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class en extends MessageNano {
    public static volatile en[] b;
    public C4462bn[] a;

    public en() {
        a();
    }

    public static en[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new en[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final en a() {
        this.a = C4462bn.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4462bn[] c4462bnArr = this.a;
        if (c4462bnArr != null && c4462bnArr.length > 0) {
            int i = 0;
            while (true) {
                C4462bn[] c4462bnArr2 = this.a;
                if (i >= c4462bnArr2.length) {
                    break;
                }
                C4462bn c4462bn = c4462bnArr2[i];
                if (c4462bn != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4462bn) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4462bn[] c4462bnArr = this.a;
        if (c4462bnArr != null && c4462bnArr.length > 0) {
            int i = 0;
            while (true) {
                C4462bn[] c4462bnArr2 = this.a;
                if (i >= c4462bnArr2.length) {
                    break;
                }
                C4462bn c4462bn = c4462bnArr2[i];
                if (c4462bn != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4462bn);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final en mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4462bn[] c4462bnArr = this.a;
                int length = c4462bnArr == null ? 0 : c4462bnArr.length;
                int i = repeatedFieldArrayLength + length;
                C4462bn[] c4462bnArr2 = new C4462bn[i];
                if (length != 0) {
                    System.arraycopy(c4462bnArr, 0, c4462bnArr2, 0, length);
                }
                while (length < i - 1) {
                    C4462bn c4462bn = new C4462bn();
                    c4462bnArr2[length] = c4462bn;
                    codedInputByteBufferNano.readMessage(c4462bn);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4462bn c4462bn2 = new C4462bn();
                c4462bnArr2[length] = c4462bn2;
                codedInputByteBufferNano.readMessage(c4462bn2);
                this.a = c4462bnArr2;
            }
        }
    }

    public static en b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new en().mergeFrom(codedInputByteBufferNano);
    }

    public static en a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (en) MessageNano.mergeFrom(new en(), bArr);
    }
}

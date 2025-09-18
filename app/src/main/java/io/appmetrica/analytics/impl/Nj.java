package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class Nj extends MessageNano {
    public static volatile Nj[] b;
    public Oj[] a;

    public Nj() {
        a();
    }

    public static Nj[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Nj[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final Nj a() {
        this.a = Oj.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Oj[] ojArr = this.a;
        if (ojArr != null && ojArr.length > 0) {
            int i = 0;
            while (true) {
                Oj[] ojArr2 = this.a;
                if (i >= ojArr2.length) {
                    break;
                }
                Oj oj = ojArr2[i];
                if (oj != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, oj) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Oj[] ojArr = this.a;
        if (ojArr != null && ojArr.length > 0) {
            int i = 0;
            while (true) {
                Oj[] ojArr2 = this.a;
                if (i >= ojArr2.length) {
                    break;
                }
                Oj oj = ojArr2[i];
                if (oj != null) {
                    codedOutputByteBufferNano.writeMessage(1, oj);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                Oj[] ojArr = this.a;
                int length = ojArr == null ? 0 : ojArr.length;
                int i = repeatedFieldArrayLength + length;
                Oj[] ojArr2 = new Oj[i];
                if (length != 0) {
                    System.arraycopy(ojArr, 0, ojArr2, 0, length);
                }
                while (length < i - 1) {
                    Oj oj = new Oj();
                    ojArr2[length] = oj;
                    codedInputByteBufferNano.readMessage(oj);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Oj oj2 = new Oj();
                ojArr2[length] = oj2;
                codedInputByteBufferNano.readMessage(oj2);
                this.a = ojArr2;
            }
        }
    }

    public static Nj b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Nj().mergeFrom(codedInputByteBufferNano);
    }

    public static Nj a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Nj) MessageNano.mergeFrom(new Nj(), bArr);
    }
}

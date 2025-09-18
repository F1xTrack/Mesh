package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4774ol extends MessageNano {
    public static volatile C4774ol[] b;
    public C4750nl[] a;

    public C4774ol() {
        a();
    }

    public static C4774ol[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C4774ol[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C4774ol a() {
        this.a = C4750nl.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4750nl[] c4750nlArr = this.a;
        if (c4750nlArr != null && c4750nlArr.length > 0) {
            int i = 0;
            while (true) {
                C4750nl[] c4750nlArr2 = this.a;
                if (i >= c4750nlArr2.length) {
                    break;
                }
                C4750nl c4750nl = c4750nlArr2[i];
                if (c4750nl != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4750nl) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4750nl[] c4750nlArr = this.a;
        if (c4750nlArr != null && c4750nlArr.length > 0) {
            int i = 0;
            while (true) {
                C4750nl[] c4750nlArr2 = this.a;
                if (i >= c4750nlArr2.length) {
                    break;
                }
                C4750nl c4750nl = c4750nlArr2[i];
                if (c4750nl != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4750nl);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4774ol mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4750nl[] c4750nlArr = this.a;
                int length = c4750nlArr == null ? 0 : c4750nlArr.length;
                int i = repeatedFieldArrayLength + length;
                C4750nl[] c4750nlArr2 = new C4750nl[i];
                if (length != 0) {
                    System.arraycopy(c4750nlArr, 0, c4750nlArr2, 0, length);
                }
                while (length < i - 1) {
                    C4750nl c4750nl = new C4750nl();
                    c4750nlArr2[length] = c4750nl;
                    codedInputByteBufferNano.readMessage(c4750nl);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4750nl c4750nl2 = new C4750nl();
                c4750nlArr2[length] = c4750nl2;
                codedInputByteBufferNano.readMessage(c4750nl2);
                this.a = c4750nlArr2;
            }
        }
    }

    public static C4774ol b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4774ol().mergeFrom(codedInputByteBufferNano);
    }

    public static C4774ol a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4774ol) MessageNano.mergeFrom(new C4774ol(), bArr);
    }
}

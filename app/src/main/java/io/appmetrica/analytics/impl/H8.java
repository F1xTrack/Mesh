package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class H8 extends MessageNano {
    public static volatile H8[] b;
    public G8[] a;

    public H8() {
        a();
    }

    public static H8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new H8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final H8 a() {
        this.a = G8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        G8[] g8Arr = this.a;
        if (g8Arr != null && g8Arr.length > 0) {
            int i = 0;
            while (true) {
                G8[] g8Arr2 = this.a;
                if (i >= g8Arr2.length) {
                    break;
                }
                G8 g8 = g8Arr2[i];
                if (g8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, g8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        G8[] g8Arr = this.a;
        if (g8Arr != null && g8Arr.length > 0) {
            int i = 0;
            while (true) {
                G8[] g8Arr2 = this.a;
                if (i >= g8Arr2.length) {
                    break;
                }
                G8 g8 = g8Arr2[i];
                if (g8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, g8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                G8[] g8Arr = this.a;
                int length = g8Arr == null ? 0 : g8Arr.length;
                int i = repeatedFieldArrayLength + length;
                G8[] g8Arr2 = new G8[i];
                if (length != 0) {
                    System.arraycopy(g8Arr, 0, g8Arr2, 0, length);
                }
                while (length < i - 1) {
                    G8 g8 = new G8();
                    g8Arr2[length] = g8;
                    codedInputByteBufferNano.readMessage(g8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                G8 g82 = new G8();
                g8Arr2[length] = g82;
                codedInputByteBufferNano.readMessage(g82);
                this.a = g8Arr2;
            }
        }
    }

    public static H8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H8().mergeFrom(codedInputByteBufferNano);
    }

    public static H8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H8) MessageNano.mergeFrom(new H8(), bArr);
    }
}

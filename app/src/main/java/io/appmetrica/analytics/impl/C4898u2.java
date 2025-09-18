package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4898u2 extends MessageNano {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static volatile C4898u2[] f;
    public C4874t2[] a;
    public boolean b;

    public C4898u2() {
        a();
    }

    public static C4898u2[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C4898u2[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C4898u2 a() {
        this.a = C4874t2.b();
        this.b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4874t2[] c4874t2Arr = this.a;
        if (c4874t2Arr != null && c4874t2Arr.length > 0) {
            int i = 0;
            while (true) {
                C4874t2[] c4874t2Arr2 = this.a;
                if (i >= c4874t2Arr2.length) {
                    break;
                }
                C4874t2 c4874t2 = c4874t2Arr2[i];
                if (c4874t2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4874t2) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4874t2[] c4874t2Arr = this.a;
        if (c4874t2Arr != null && c4874t2Arr.length > 0) {
            int i = 0;
            while (true) {
                C4874t2[] c4874t2Arr2 = this.a;
                if (i >= c4874t2Arr2.length) {
                    break;
                }
                C4874t2 c4874t2 = c4874t2Arr2[i];
                if (c4874t2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4874t2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4898u2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4874t2[] c4874t2Arr = this.a;
                int length = c4874t2Arr == null ? 0 : c4874t2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4874t2[] c4874t2Arr2 = new C4874t2[i];
                if (length != 0) {
                    System.arraycopy(c4874t2Arr, 0, c4874t2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4874t2 c4874t2 = new C4874t2();
                    c4874t2Arr2[length] = c4874t2;
                    codedInputByteBufferNano.readMessage(c4874t2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4874t2 c4874t22 = new C4874t2();
                c4874t2Arr2[length] = c4874t22;
                codedInputByteBufferNano.readMessage(c4874t22);
                this.a = c4874t2Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4898u2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4898u2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4898u2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4898u2) MessageNano.mergeFrom(new C4898u2(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4665k8 extends MessageNano {
    public static volatile C4665k8[] c;
    public C4422a8 a;
    public C4422a8[] b;

    public C4665k8() {
        a();
    }

    public static C4665k8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4665k8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4665k8 a() {
        this.a = null;
        this.b = C4422a8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4422a8 c4422a8 = this.a;
        if (c4422a8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4422a8);
        }
        C4422a8[] c4422a8Arr = this.b;
        if (c4422a8Arr != null && c4422a8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4422a8[] c4422a8Arr2 = this.b;
                if (i >= c4422a8Arr2.length) {
                    break;
                }
                C4422a8 c4422a82 = c4422a8Arr2[i];
                if (c4422a82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4422a82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4422a8 c4422a8 = this.a;
        if (c4422a8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4422a8);
        }
        C4422a8[] c4422a8Arr = this.b;
        if (c4422a8Arr != null && c4422a8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4422a8[] c4422a8Arr2 = this.b;
                if (i >= c4422a8Arr2.length) {
                    break;
                }
                C4422a8 c4422a82 = c4422a8Arr2[i];
                if (c4422a82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4422a82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4665k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new C4422a8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4422a8[] c4422a8Arr = this.b;
                int length = c4422a8Arr == null ? 0 : c4422a8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4422a8[] c4422a8Arr2 = new C4422a8[i];
                if (length != 0) {
                    System.arraycopy(c4422a8Arr, 0, c4422a8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4422a8 c4422a8 = new C4422a8();
                    c4422a8Arr2[length] = c4422a8;
                    codedInputByteBufferNano.readMessage(c4422a8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4422a8 c4422a82 = new C4422a8();
                c4422a8Arr2[length] = c4422a82;
                codedInputByteBufferNano.readMessage(c4422a82);
                this.b = c4422a8Arr2;
            }
        }
    }

    public static C4665k8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4665k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4665k8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4665k8) MessageNano.mergeFrom(new C4665k8(), bArr);
    }
}

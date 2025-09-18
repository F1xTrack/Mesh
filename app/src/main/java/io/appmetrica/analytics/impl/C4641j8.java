package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4641j8 extends MessageNano {
    public static volatile C4641j8[] c;
    public C4618i8[] a;
    public int b;

    public C4641j8() {
        a();
    }

    public static C4641j8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4641j8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4641j8 a() {
        this.a = C4618i8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4618i8[] c4618i8Arr = this.a;
        if (c4618i8Arr != null && c4618i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4618i8[] c4618i8Arr2 = this.a;
                if (i >= c4618i8Arr2.length) {
                    break;
                }
                C4618i8 c4618i8 = c4618i8Arr2[i];
                if (c4618i8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4618i8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4618i8[] c4618i8Arr = this.a;
        if (c4618i8Arr != null && c4618i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4618i8[] c4618i8Arr2 = this.a;
                if (i >= c4618i8Arr2.length) {
                    break;
                }
                C4618i8 c4618i8 = c4618i8Arr2[i];
                if (c4618i8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4618i8);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4641j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4618i8[] c4618i8Arr = this.a;
                int length = c4618i8Arr == null ? 0 : c4618i8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4618i8[] c4618i8Arr2 = new C4618i8[i];
                if (length != 0) {
                    System.arraycopy(c4618i8Arr, 0, c4618i8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4618i8 c4618i8 = new C4618i8();
                    c4618i8Arr2[length] = c4618i8;
                    codedInputByteBufferNano.readMessage(c4618i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4618i8 c4618i82 = new C4618i8();
                c4618i8Arr2[length] = c4618i82;
                codedInputByteBufferNano.readMessage(c4618i82);
                this.a = c4618i8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C4641j8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4641j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4641j8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4641j8) MessageNano.mergeFrom(new C4641j8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4546f8 extends MessageNano {
    public static volatile C4546f8[] f;
    public byte[] a;
    public byte[] b;
    public C4641j8 c;
    public C4570g8[] d;
    public int e;

    public C4546f8() {
        a();
    }

    public static C4546f8[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C4546f8[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C4546f8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = C4570g8.b();
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C4641j8 c4641j8 = this.c;
        if (c4641j8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4641j8);
        }
        C4570g8[] c4570g8Arr = this.d;
        if (c4570g8Arr != null && c4570g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4570g8[] c4570g8Arr2 = this.d;
                if (i >= c4570g8Arr2.length) {
                    break;
                }
                C4570g8 c4570g8 = c4570g8Arr2[i];
                if (c4570g8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c4570g8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.e;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C4641j8 c4641j8 = this.c;
        if (c4641j8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4641j8);
        }
        C4570g8[] c4570g8Arr = this.d;
        if (c4570g8Arr != null && c4570g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4570g8[] c4570g8Arr2 = this.d;
                if (i >= c4570g8Arr2.length) {
                    break;
                }
                C4570g8 c4570g8 = c4570g8Arr2[i];
                if (c4570g8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c4570g8);
                }
                i++;
            }
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4546f8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4546f8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4546f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.c == null) {
                    this.c = new C4641j8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C4570g8[] c4570g8Arr = this.d;
                int length = c4570g8Arr == null ? 0 : c4570g8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4570g8[] c4570g8Arr2 = new C4570g8[i];
                if (length != 0) {
                    System.arraycopy(c4570g8Arr, 0, c4570g8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4570g8 c4570g8 = new C4570g8();
                    c4570g8Arr2[length] = c4570g8;
                    codedInputByteBufferNano.readMessage(c4570g8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4570g8 c4570g82 = new C4570g8();
                c4570g8Arr2[length] = c4570g82;
                codedInputByteBufferNano.readMessage(c4570g82);
                this.d = c4570g8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C4546f8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4546f8) MessageNano.mergeFrom(new C4546f8(), bArr);
    }
}

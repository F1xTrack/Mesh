package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.l8 */
/* loaded from: classes2.dex */
public final class C4689l8 extends MessageNano {
    public static volatile C4689l8[] h;
    public byte[] a;
    public byte[] b;
    public C4497d8 c;
    public C4641j8 d;
    public C4665k8 e;
    public C4665k8 f;
    public C4713m8[] g;

    public C4689l8() {
        a();
    }

    public static C4689l8[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C4689l8[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final C4689l8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = C4713m8.b();
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
        C4497d8 c4497d8 = this.c;
        if (c4497d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4497d8);
        }
        C4641j8 c4641j8 = this.d;
        if (c4641j8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c4641j8);
        }
        C4665k8 c4665k8 = this.e;
        if (c4665k8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c4665k8);
        }
        C4665k8 c4665k82 = this.f;
        if (c4665k82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c4665k82);
        }
        C4713m8[] c4713m8Arr = this.g;
        if (c4713m8Arr != null && c4713m8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4713m8[] c4713m8Arr2 = this.g;
                if (i >= c4713m8Arr2.length) {
                    break;
                }
                C4713m8 c4713m8 = c4713m8Arr2[i];
                if (c4713m8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c4713m8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
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
        C4497d8 c4497d8 = this.c;
        if (c4497d8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4497d8);
        }
        C4641j8 c4641j8 = this.d;
        if (c4641j8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4641j8);
        }
        C4665k8 c4665k8 = this.e;
        if (c4665k8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c4665k8);
        }
        C4665k8 c4665k82 = this.f;
        if (c4665k82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c4665k82);
        }
        C4713m8[] c4713m8Arr = this.g;
        if (c4713m8Arr != null && c4713m8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4713m8[] c4713m8Arr2 = this.g;
                if (i >= c4713m8Arr2.length) {
                    break;
                }
                C4713m8 c4713m8 = c4713m8Arr2[i];
                if (c4713m8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c4713m8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4689l8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4689l8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4689l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.c = new C4497d8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (tag == 34) {
                if (this.d == null) {
                    this.d = new C4641j8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (tag == 42) {
                if (this.e == null) {
                    this.e = new C4665k8();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (tag == 50) {
                if (this.f == null) {
                    this.f = new C4665k8();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C4713m8[] c4713m8Arr = this.g;
                int length = c4713m8Arr == null ? 0 : c4713m8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4713m8[] c4713m8Arr2 = new C4713m8[i];
                if (length != 0) {
                    System.arraycopy(c4713m8Arr, 0, c4713m8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4713m8 c4713m8 = new C4713m8();
                    c4713m8Arr2[length] = c4713m8;
                    codedInputByteBufferNano.readMessage(c4713m8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4713m8 c4713m82 = new C4713m8();
                c4713m8Arr2[length] = c4713m82;
                codedInputByteBufferNano.readMessage(c4713m82);
                this.g = c4713m8Arr2;
            }
        }
    }

    public static C4689l8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4689l8) MessageNano.mergeFrom(new C4689l8(), bArr);
    }
}

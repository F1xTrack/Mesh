package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.f8 */
/* loaded from: classes2.dex */
public final class C5117f8 extends MessageNano {

    /* renamed from: f */
    public static volatile C5117f8[] f31666f;

    /* renamed from: a */
    public byte[] f31667a;

    /* renamed from: b */
    public byte[] f31668b;

    /* renamed from: c */
    public C5217j8 f31669c;

    /* renamed from: d */
    public C5142g8[] f31670d;

    /* renamed from: e */
    public int f31671e;

    public C5117f8() {
        m20374a();
    }

    /* renamed from: b */
    public static C5117f8[] m20373b() {
        if (f31666f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31666f == null) {
                        f31666f = new C5117f8[0];
                    }
                } finally {
                }
            }
        }
        return f31666f;
    }

    /* renamed from: a */
    public final C5117f8 m20374a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31667a = bArr;
        this.f31668b = bArr;
        this.f31669c = null;
        this.f31670d = C5142g8.m20441b();
        this.f31671e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31667a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31667a);
        }
        if (!Arrays.equals(this.f31668b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f31668b);
        }
        C5217j8 c5217j8 = this.f31669c;
        if (c5217j8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5217j8);
        }
        C5142g8[] c5142g8Arr = this.f31670d;
        if (c5142g8Arr != null && c5142g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5142g8[] c5142g8Arr2 = this.f31670d;
                if (i >= c5142g8Arr2.length) {
                    break;
                }
                C5142g8 c5142g8 = c5142g8Arr2[i];
                if (c5142g8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c5142g8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.f31671e;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31667a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31667a);
        }
        if (!Arrays.equals(this.f31668b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f31668b);
        }
        C5217j8 c5217j8 = this.f31669c;
        if (c5217j8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5217j8);
        }
        C5142g8[] c5142g8Arr = this.f31670d;
        if (c5142g8Arr != null && c5142g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5142g8[] c5142g8Arr2 = this.f31670d;
                if (i >= c5142g8Arr2.length) {
                    break;
                }
                C5142g8 c5142g8 = c5142g8Arr2[i];
                if (c5142g8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c5142g8);
                }
                i++;
            }
        }
        int i2 = this.f31671e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5117f8 m20372b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5117f8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5117f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31667a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f31668b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f31669c == null) {
                    this.f31669c = new C5217j8();
                }
                codedInputByteBufferNano.readMessage(this.f31669c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C5142g8[] c5142g8Arr = this.f31670d;
                int length = c5142g8Arr == null ? 0 : c5142g8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5142g8[] c5142g8Arr2 = new C5142g8[i];
                if (length != 0) {
                    System.arraycopy(c5142g8Arr, 0, c5142g8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5142g8 c5142g8 = new C5142g8();
                    c5142g8Arr2[length] = c5142g8;
                    codedInputByteBufferNano.readMessage(c5142g8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5142g8 c5142g82 = new C5142g8();
                c5142g8Arr2[length] = c5142g82;
                codedInputByteBufferNano.readMessage(c5142g82);
                this.f31670d = c5142g8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31671e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C5117f8 m20371a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5117f8) MessageNano.mergeFrom(new C5117f8(), bArr);
    }
}

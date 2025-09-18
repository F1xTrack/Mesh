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
public final class C5267l8 extends MessageNano {

    /* renamed from: h */
    public static volatile C5267l8[] f32134h;

    /* renamed from: a */
    public byte[] f32135a;

    /* renamed from: b */
    public byte[] f32136b;

    /* renamed from: c */
    public C5067d8 f32137c;

    /* renamed from: d */
    public C5217j8 f32138d;

    /* renamed from: e */
    public C5242k8 f32139e;

    /* renamed from: f */
    public C5242k8 f32140f;

    /* renamed from: g */
    public C5292m8[] f32141g;

    public C5267l8() {
        m20683a();
    }

    /* renamed from: b */
    public static C5267l8[] m20682b() {
        if (f32134h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32134h == null) {
                        f32134h = new C5267l8[0];
                    }
                } finally {
                }
            }
        }
        return f32134h;
    }

    /* renamed from: a */
    public final C5267l8 m20683a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f32135a = bArr;
        this.f32136b = bArr;
        this.f32137c = null;
        this.f32138d = null;
        this.f32139e = null;
        this.f32140f = null;
        this.f32141g = C5292m8.m20702b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f32135a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f32135a);
        }
        if (!Arrays.equals(this.f32136b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f32136b);
        }
        C5067d8 c5067d8 = this.f32137c;
        if (c5067d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5067d8);
        }
        C5217j8 c5217j8 = this.f32138d;
        if (c5217j8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5217j8);
        }
        C5242k8 c5242k8 = this.f32139e;
        if (c5242k8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5242k8);
        }
        C5242k8 c5242k82 = this.f32140f;
        if (c5242k82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c5242k82);
        }
        C5292m8[] c5292m8Arr = this.f32141g;
        if (c5292m8Arr != null && c5292m8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5292m8[] c5292m8Arr2 = this.f32141g;
                if (i >= c5292m8Arr2.length) {
                    break;
                }
                C5292m8 c5292m8 = c5292m8Arr2[i];
                if (c5292m8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c5292m8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f32135a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32135a);
        }
        if (!Arrays.equals(this.f32136b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f32136b);
        }
        C5067d8 c5067d8 = this.f32137c;
        if (c5067d8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5067d8);
        }
        C5217j8 c5217j8 = this.f32138d;
        if (c5217j8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5217j8);
        }
        C5242k8 c5242k8 = this.f32139e;
        if (c5242k8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5242k8);
        }
        C5242k8 c5242k82 = this.f32140f;
        if (c5242k82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5242k82);
        }
        C5292m8[] c5292m8Arr = this.f32141g;
        if (c5292m8Arr != null && c5292m8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5292m8[] c5292m8Arr2 = this.f32141g;
                if (i >= c5292m8Arr2.length) {
                    break;
                }
                C5292m8 c5292m8 = c5292m8Arr2[i];
                if (c5292m8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c5292m8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5267l8 m20681b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5267l8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5267l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32135a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f32136b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f32137c == null) {
                    this.f32137c = new C5067d8();
                }
                codedInputByteBufferNano.readMessage(this.f32137c);
            } else if (tag == 34) {
                if (this.f32138d == null) {
                    this.f32138d = new C5217j8();
                }
                codedInputByteBufferNano.readMessage(this.f32138d);
            } else if (tag == 42) {
                if (this.f32139e == null) {
                    this.f32139e = new C5242k8();
                }
                codedInputByteBufferNano.readMessage(this.f32139e);
            } else if (tag == 50) {
                if (this.f32140f == null) {
                    this.f32140f = new C5242k8();
                }
                codedInputByteBufferNano.readMessage(this.f32140f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C5292m8[] c5292m8Arr = this.f32141g;
                int length = c5292m8Arr == null ? 0 : c5292m8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5292m8[] c5292m8Arr2 = new C5292m8[i];
                if (length != 0) {
                    System.arraycopy(c5292m8Arr, 0, c5292m8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5292m8 c5292m8 = new C5292m8();
                    c5292m8Arr2[length] = c5292m8;
                    codedInputByteBufferNano.readMessage(c5292m8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5292m8 c5292m82 = new C5292m8();
                c5292m8Arr2[length] = c5292m82;
                codedInputByteBufferNano.readMessage(c5292m82);
                this.f32141g = c5292m8Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C5267l8 m20680a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5267l8) MessageNano.mergeFrom(new C5267l8(), bArr);
    }
}

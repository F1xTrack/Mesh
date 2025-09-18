package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.bi */
/* loaded from: classes2.dex */
public final class C5027bi extends MessageNano {

    /* renamed from: f */
    public static final int f31326f = 0;

    /* renamed from: g */
    public static final int f31327g = 1;

    /* renamed from: h */
    public static final int f31328h = 2;

    /* renamed from: i */
    public static volatile C5027bi[] f31329i;

    /* renamed from: a */
    public byte[] f31330a;

    /* renamed from: b */
    public long f31331b;

    /* renamed from: c */
    public int f31332c;

    /* renamed from: d */
    public byte[] f31333d;

    /* renamed from: e */
    public long f31334e;

    public C5027bi() {
        m20198a();
    }

    /* renamed from: b */
    public static C5027bi[] m20197b() {
        if (f31329i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31329i == null) {
                        f31329i = new C5027bi[0];
                    }
                } finally {
                }
            }
        }
        return f31329i;
    }

    /* renamed from: a */
    public final C5027bi m20198a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31330a = bArr;
        this.f31331b = 0L;
        this.f31332c = 0;
        this.f31333d = bArr;
        this.f31334e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f31330a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31330a);
        }
        long j = this.f31331b;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        int i = this.f31332c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        if (!Arrays.equals(this.f31333d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f31333d);
        }
        long j2 = this.f31334e;
        return j2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f31330a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31330a);
        }
        long j = this.f31331b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        int i = this.f31332c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!Arrays.equals(this.f31333d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f31333d);
        }
        long j2 = this.f31334e;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5027bi m20196b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5027bi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5027bi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31330a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f31331b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f31332c = int32;
                }
            } else if (tag == 34) {
                this.f31333d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31334e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C5027bi m20195a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5027bi) MessageNano.mergeFrom(new C5027bi(), bArr);
    }
}

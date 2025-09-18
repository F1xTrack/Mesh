package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8 */
/* loaded from: classes2.dex */
public final class C5342o8 extends MessageNano {

    /* renamed from: e */
    public static volatile C5342o8[] f32332e;

    /* renamed from: a */
    public byte[] f32333a;

    /* renamed from: b */
    public C5067d8 f32334b;

    /* renamed from: c */
    public byte[] f32335c;

    /* renamed from: d */
    public C5217j8 f32336d;

    public C5342o8() {
        m20857a();
    }

    /* renamed from: b */
    public static C5342o8[] m20856b() {
        if (f32332e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32332e == null) {
                        f32332e = new C5342o8[0];
                    }
                } finally {
                }
            }
        }
        return f32332e;
    }

    /* renamed from: a */
    public final C5342o8 m20857a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f32333a = bArr;
        this.f32334b = null;
        this.f32335c = bArr;
        this.f32336d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f32333a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f32333a);
        }
        C5067d8 c5067d8 = this.f32334b;
        if (c5067d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5067d8);
        }
        if (!Arrays.equals(this.f32335c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f32335c);
        }
        C5217j8 c5217j8 = this.f32336d;
        return c5217j8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c5217j8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f32333a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32333a);
        }
        C5067d8 c5067d8 = this.f32334b;
        if (c5067d8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5067d8);
        }
        if (!Arrays.equals(this.f32335c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f32335c);
        }
        C5217j8 c5217j8 = this.f32336d;
        if (c5217j8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5217j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5342o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32333a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f32334b == null) {
                    this.f32334b = new C5067d8();
                }
                codedInputByteBufferNano.readMessage(this.f32334b);
            } else if (tag == 26) {
                this.f32335c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32336d == null) {
                    this.f32336d = new C5217j8();
                }
                codedInputByteBufferNano.readMessage(this.f32336d);
            }
        }
    }

    /* renamed from: b */
    public static C5342o8 m20855b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5342o8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5342o8 m20854a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5342o8) MessageNano.mergeFrom(new C5342o8(), bArr);
    }
}

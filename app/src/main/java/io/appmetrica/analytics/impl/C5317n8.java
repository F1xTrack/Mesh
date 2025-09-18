package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8 */
/* loaded from: classes2.dex */
public final class C5317n8 extends MessageNano {

    /* renamed from: d */
    public static volatile C5317n8[] f32264d;

    /* renamed from: a */
    public byte[] f32265a;

    /* renamed from: b */
    public byte[] f32266b;

    /* renamed from: c */
    public C5342o8 f32267c;

    public C5317n8() {
        m20812a();
    }

    /* renamed from: b */
    public static C5317n8[] m20811b() {
        if (f32264d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32264d == null) {
                        f32264d = new C5317n8[0];
                    }
                } finally {
                }
            }
        }
        return f32264d;
    }

    /* renamed from: a */
    public final C5317n8 m20812a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f32265a = bArr;
        this.f32266b = bArr;
        this.f32267c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f32265a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f32265a);
        }
        if (!Arrays.equals(this.f32266b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f32266b);
        }
        C5342o8 c5342o8 = this.f32267c;
        return c5342o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c5342o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f32265a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32265a);
        }
        if (!Arrays.equals(this.f32266b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f32266b);
        }
        C5342o8 c5342o8 = this.f32267c;
        if (c5342o8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5342o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5317n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32265a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f32266b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32267c == null) {
                    this.f32267c = new C5342o8();
                }
                codedInputByteBufferNano.readMessage(this.f32267c);
            }
        }
    }

    /* renamed from: b */
    public static C5317n8 m20810b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5317n8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5317n8 m20809a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5317n8) MessageNano.mergeFrom(new C5317n8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q8 */
/* loaded from: classes2.dex */
public final class C5392q8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5392q8[] f32436c;

    /* renamed from: a */
    public C5267l8 f32437a;

    /* renamed from: b */
    public C5317n8 f32438b;

    public C5392q8() {
        m20948a();
    }

    /* renamed from: b */
    public static C5392q8[] m20947b() {
        if (f32436c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32436c == null) {
                        f32436c = new C5392q8[0];
                    }
                } finally {
                }
            }
        }
        return f32436c;
    }

    /* renamed from: a */
    public final C5392q8 m20948a() {
        this.f32437a = null;
        this.f32438b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5267l8 c5267l8 = this.f32437a;
        if (c5267l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5267l8);
        }
        C5317n8 c5317n8 = this.f32438b;
        return c5317n8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5317n8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5267l8 c5267l8 = this.f32437a;
        if (c5267l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5267l8);
        }
        C5317n8 c5317n8 = this.f32438b;
        if (c5317n8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5317n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5392q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f32437a == null) {
                    this.f32437a = new C5267l8();
                }
                codedInputByteBufferNano.readMessage(this.f32437a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32438b == null) {
                    this.f32438b = new C5317n8();
                }
                codedInputByteBufferNano.readMessage(this.f32438b);
            }
        }
    }

    /* renamed from: b */
    public static C5392q8 m20946b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5392q8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5392q8 m20945a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5392q8) MessageNano.mergeFrom(new C5392q8(), bArr);
    }
}

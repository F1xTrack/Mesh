package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p8 */
/* loaded from: classes2.dex */
public final class C5367p8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5367p8[] f32390c;

    /* renamed from: a */
    public C5267l8 f32391a;

    /* renamed from: b */
    public C5342o8 f32392b;

    public C5367p8() {
        m20912a();
    }

    /* renamed from: b */
    public static C5367p8[] m20911b() {
        if (f32390c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32390c == null) {
                        f32390c = new C5367p8[0];
                    }
                } finally {
                }
            }
        }
        return f32390c;
    }

    /* renamed from: a */
    public final C5367p8 m20912a() {
        this.f32391a = null;
        this.f32392b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5267l8 c5267l8 = this.f32391a;
        if (c5267l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5267l8);
        }
        C5342o8 c5342o8 = this.f32392b;
        return c5342o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5342o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5267l8 c5267l8 = this.f32391a;
        if (c5267l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5267l8);
        }
        C5342o8 c5342o8 = this.f32392b;
        if (c5342o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5342o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5367p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f32391a == null) {
                    this.f32391a = new C5267l8();
                }
                codedInputByteBufferNano.readMessage(this.f32391a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32392b == null) {
                    this.f32392b = new C5342o8();
                }
                codedInputByteBufferNano.readMessage(this.f32392b);
            }
        }
    }

    /* renamed from: b */
    public static C5367p8 m20910b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5367p8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5367p8 m20909a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5367p8) MessageNano.mergeFrom(new C5367p8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8 */
/* loaded from: classes2.dex */
public final class C5417r8 extends MessageNano {

    /* renamed from: b */
    public static volatile C5417r8[] f32502b;

    /* renamed from: a */
    public C5342o8 f32503a;

    public C5417r8() {
        m21012a();
    }

    /* renamed from: b */
    public static C5417r8[] m21011b() {
        if (f32502b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32502b == null) {
                        f32502b = new C5417r8[0];
                    }
                } finally {
                }
            }
        }
        return f32502b;
    }

    /* renamed from: a */
    public final C5417r8 m21012a() {
        this.f32503a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5342o8 c5342o8 = this.f32503a;
        return c5342o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c5342o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5342o8 c5342o8 = this.f32503a;
        if (c5342o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5342o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5417r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32503a == null) {
                    this.f32503a = new C5342o8();
                }
                codedInputByteBufferNano.readMessage(this.f32503a);
            }
        }
    }

    /* renamed from: b */
    public static C5417r8 m21010b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5417r8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5417r8 m21009a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5417r8) MessageNano.mergeFrom(new C5417r8(), bArr);
    }
}

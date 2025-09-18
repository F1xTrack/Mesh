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
public final class C4832r8 extends MessageNano {
    public static volatile C4832r8[] b;
    public C4761o8 a;

    public C4832r8() {
        a();
    }

    public static C4832r8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C4832r8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C4832r8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4761o8 c4761o8 = this.a;
        return c4761o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4761o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4761o8 c4761o8 = this.a;
        if (c4761o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4761o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4832r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.a == null) {
                    this.a = new C4761o8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
    }

    public static C4832r8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4832r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4832r8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4832r8) MessageNano.mergeFrom(new C4832r8(), bArr);
    }
}

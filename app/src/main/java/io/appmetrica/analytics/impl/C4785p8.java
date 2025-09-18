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
public final class C4785p8 extends MessageNano {
    public static volatile C4785p8[] c;
    public C4689l8 a;
    public C4761o8 b;

    public C4785p8() {
        a();
    }

    public static C4785p8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4785p8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4785p8 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4689l8 c4689l8 = this.a;
        if (c4689l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4689l8);
        }
        C4761o8 c4761o8 = this.b;
        return c4761o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4761o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4689l8 c4689l8 = this.a;
        if (c4689l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4689l8);
        }
        C4761o8 c4761o8 = this.b;
        if (c4761o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4761o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4785p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new C4689l8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new C4761o8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C4785p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4785p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4785p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4785p8) MessageNano.mergeFrom(new C4785p8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4809q8 extends MessageNano {
    public static volatile C4809q8[] c;
    public C4689l8 a;
    public C4737n8 b;

    public C4809q8() {
        a();
    }

    public static C4809q8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4809q8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4809q8 a() {
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
        C4737n8 c4737n8 = this.b;
        return c4737n8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4737n8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4689l8 c4689l8 = this.a;
        if (c4689l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4689l8);
        }
        C4737n8 c4737n8 = this.b;
        if (c4737n8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4737n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4809q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new C4737n8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C4809q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4809q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4809q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4809q8) MessageNano.mergeFrom(new C4809q8(), bArr);
    }
}

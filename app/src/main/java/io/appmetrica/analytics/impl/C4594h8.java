package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4594h8 extends MessageNano {
    public static volatile C4594h8[] b;
    public C4546f8 a;

    public C4594h8() {
        a();
    }

    public static C4594h8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C4594h8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C4594h8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4546f8 c4546f8 = this.a;
        return c4546f8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c4546f8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4546f8 c4546f8 = this.a;
        if (c4546f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4546f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4594h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.a = new C4546f8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
    }

    public static C4594h8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4594h8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4594h8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4594h8) MessageNano.mergeFrom(new C4594h8(), bArr);
    }
}

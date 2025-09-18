package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4726ml extends MessageNano {
    public static volatile C4726ml[] b;
    public String a;

    public C4726ml() {
        a();
    }

    public static C4726ml[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C4726ml[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C4726ml a() {
        this.a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4726ml mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C4726ml a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4726ml) MessageNano.mergeFrom(new C4726ml(), bArr);
    }

    public static C4726ml b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4726ml().mergeFrom(codedInputByteBufferNano);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4750nl extends MessageNano {
    public static volatile C4750nl[] c;
    public String a;
    public C4726ml b;

    public C4750nl() {
        a();
    }

    public static C4750nl[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4750nl[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4750nl a() {
        this.a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        C4726ml c4726ml = this.b;
        return c4726ml != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4726ml) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        C4726ml c4726ml = this.b;
        if (c4726ml != null) {
            codedOutputByteBufferNano.writeMessage(2, c4726ml);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4750nl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new C4726ml();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C4750nl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4750nl().mergeFrom(codedInputByteBufferNano);
    }

    public static C4750nl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4750nl) MessageNano.mergeFrom(new C4750nl(), bArr);
    }
}

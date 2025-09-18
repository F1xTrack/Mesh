package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4432ai extends MessageNano {
    public static volatile C4432ai[] d;
    public boolean a;
    public Zh b;
    public Yh c;

    public C4432ai() {
        a();
    }

    public static C4432ai[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C4432ai[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final C4432ai a() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Zh zh = this.b;
        if (zh != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, zh);
        }
        Yh yh = this.c;
        return yh != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, yh) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Zh zh = this.b;
        if (zh != null) {
            codedOutputByteBufferNano.writeMessage(2, zh);
        }
        Yh yh = this.c;
        if (yh != null) {
            codedOutputByteBufferNano.writeMessage(3, yh);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4432ai mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new Zh();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.c == null) {
                    this.c = new Yh();
                }
                codedInputByteBufferNano.readMessage(this.c);
            }
        }
    }

    public static C4432ai b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4432ai().mergeFrom(codedInputByteBufferNano);
    }

    public static C4432ai a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4432ai) MessageNano.mergeFrom(new C4432ai(), bArr);
    }
}

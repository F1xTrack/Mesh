package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.wl */
/* loaded from: classes2.dex */
public final class C4965wl extends MessageNano {
    public static volatile C4965wl[] b;
    public int a;

    public C4965wl() {
        a();
    }

    public static C4965wl[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C4965wl[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C4965wl a() {
        this.a = RemoteMessageConst.DEFAULT_TTL;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        return i != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4965wl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C4965wl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4965wl) MessageNano.mergeFrom(new C4965wl(), bArr);
    }

    public static C4965wl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4965wl().mergeFrom(codedInputByteBufferNano);
    }
}

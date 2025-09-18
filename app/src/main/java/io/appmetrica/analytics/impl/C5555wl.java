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
public final class C5555wl extends MessageNano {

    /* renamed from: b */
    public static volatile C5555wl[] f32780b;

    /* renamed from: a */
    public int f32781a;

    public C5555wl() {
        m21186a();
    }

    /* renamed from: b */
    public static C5555wl[] m21185b() {
        if (f32780b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32780b == null) {
                        f32780b = new C5555wl[0];
                    }
                } finally {
                }
            }
        }
        return f32780b;
    }

    /* renamed from: a */
    public final C5555wl m21186a() {
        this.f32781a = RemoteMessageConst.DEFAULT_TTL;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32781a;
        return i != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32781a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5555wl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32781a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C5555wl m21183a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5555wl) MessageNano.mergeFrom(new C5555wl(), bArr);
    }

    /* renamed from: b */
    public static C5555wl m21184b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5555wl().mergeFrom(codedInputByteBufferNano);
    }
}

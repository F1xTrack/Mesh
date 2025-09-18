package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.cn */
/* loaded from: classes2.dex */
public final class C5057cn extends MessageNano {

    /* renamed from: c */
    public static volatile C5057cn[] f31450c;

    /* renamed from: a */
    public boolean f31451a;

    /* renamed from: b */
    public boolean f31452b;

    public C5057cn() {
        m20261a();
    }

    /* renamed from: b */
    public static C5057cn[] m20260b() {
        if (f31450c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31450c == null) {
                        f31450c = new C5057cn[0];
                    }
                } finally {
                }
            }
        }
        return f31450c;
    }

    /* renamed from: a */
    public final C5057cn m20261a() {
        this.f31451a = false;
        this.f31452b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z = this.f31451a;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z2 = this.f31452b;
        return z2 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f31451a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z2 = this.f31452b;
        if (z2) {
            codedOutputByteBufferNano.writeBool(2, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5057cn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31451a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31452b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C5057cn m20259b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5057cn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5057cn m20258a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5057cn) MessageNano.mergeFrom(new C5057cn(), bArr);
    }
}

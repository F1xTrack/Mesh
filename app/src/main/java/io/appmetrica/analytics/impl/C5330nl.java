package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.nl */
/* loaded from: classes2.dex */
public final class C5330nl extends MessageNano {

    /* renamed from: c */
    public static volatile C5330nl[] f32307c;

    /* renamed from: a */
    public String f32308a;

    /* renamed from: b */
    public C5305ml f32309b;

    public C5330nl() {
        m20843a();
    }

    /* renamed from: b */
    public static C5330nl[] m20842b() {
        if (f32307c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32307c == null) {
                        f32307c = new C5330nl[0];
                    }
                } finally {
                }
            }
        }
        return f32307c;
    }

    /* renamed from: a */
    public final C5330nl m20843a() {
        this.f32308a = "";
        this.f32309b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f32308a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f32308a);
        }
        C5305ml c5305ml = this.f32309b;
        return c5305ml != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5305ml) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32308a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32308a);
        }
        C5305ml c5305ml = this.f32309b;
        if (c5305ml != null) {
            codedOutputByteBufferNano.writeMessage(2, c5305ml);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5330nl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32308a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f32309b == null) {
                    this.f32309b = new C5305ml();
                }
                codedInputByteBufferNano.readMessage(this.f32309b);
            }
        }
    }

    /* renamed from: b */
    public static C5330nl m20841b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5330nl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5330nl m20840a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5330nl) MessageNano.mergeFrom(new C5330nl(), bArr);
    }
}

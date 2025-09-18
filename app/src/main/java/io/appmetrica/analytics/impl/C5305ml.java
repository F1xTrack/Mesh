package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ml */
/* loaded from: classes2.dex */
public final class C5305ml extends MessageNano {

    /* renamed from: b */
    public static volatile C5305ml[] f32230b;

    /* renamed from: a */
    public String f32231a;

    public C5305ml() {
        m20761a();
    }

    /* renamed from: b */
    public static C5305ml[] m20760b() {
        if (f32230b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32230b == null) {
                        f32230b = new C5305ml[0];
                    }
                } finally {
                }
            }
        }
        return f32230b;
    }

    /* renamed from: a */
    public final C5305ml m20761a() {
        this.f32231a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f32231a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f32231a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32231a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32231a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5305ml mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f32231a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C5305ml m20758a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5305ml) MessageNano.mergeFrom(new C5305ml(), bArr);
    }

    /* renamed from: b */
    public static C5305ml m20759b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5305ml().mergeFrom(codedInputByteBufferNano);
    }
}

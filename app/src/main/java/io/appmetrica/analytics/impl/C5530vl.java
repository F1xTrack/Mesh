package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vl */
/* loaded from: classes2.dex */
public final class C5530vl extends MessageNano {

    /* renamed from: c */
    public static volatile C5530vl[] f32742c;

    /* renamed from: a */
    public long f32743a;

    /* renamed from: b */
    public long f32744b;

    public C5530vl() {
        m21165a();
    }

    /* renamed from: b */
    public static C5530vl[] m21164b() {
        if (f32742c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32742c == null) {
                        f32742c = new C5530vl[0];
                    }
                } finally {
                }
            }
        }
        return f32742c;
    }

    /* renamed from: a */
    public final C5530vl m21165a() {
        this.f32743a = 86400L;
        this.f32744b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f32744b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f32743a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f32743a);
        codedOutputByteBufferNano.writeInt64(2, this.f32744b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5530vl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f32743a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32744b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C5530vl m21163b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5530vl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5530vl m21162a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5530vl) MessageNano.mergeFrom(new C5530vl(), bArr);
    }
}

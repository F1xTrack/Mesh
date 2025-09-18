package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y8 */
/* loaded from: classes2.dex */
public final class C4944Y8 extends MessageNano {

    /* renamed from: c */
    public static volatile C4944Y8[] f31099c;

    /* renamed from: a */
    public String f31100a;

    /* renamed from: b */
    public long f31101b;

    public C4944Y8() {
        m20029a();
    }

    /* renamed from: b */
    public static C4944Y8[] m20028b() {
        if (f31099c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31099c == null) {
                        f31099c = new C4944Y8[0];
                    }
                } finally {
                }
            }
        }
        return f31099c;
    }

    /* renamed from: a */
    public final C4944Y8 m20029a() {
        this.f31100a = "";
        this.f31101b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f31101b) + CodedOutputByteBufferNano.computeStringSize(1, this.f31100a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f31100a);
        codedOutputByteBufferNano.writeUInt64(2, this.f31101b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4944Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31100a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31101b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C4944Y8 m20027b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4944Y8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4944Y8 m20026a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4944Y8) MessageNano.mergeFrom(new C4944Y8(), bArr);
    }
}

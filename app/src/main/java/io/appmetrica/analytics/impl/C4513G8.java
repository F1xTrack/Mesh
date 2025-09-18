package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.G8 */
/* loaded from: classes2.dex */
public final class C4513G8 extends MessageNano {

    /* renamed from: c */
    public static volatile C4513G8[] f30164c;

    /* renamed from: a */
    public String f30165a;

    /* renamed from: b */
    public byte[] f30166b;

    public C4513G8() {
        m19435a();
    }

    /* renamed from: b */
    public static C4513G8[] m19434b() {
        if (f30164c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30164c == null) {
                        f30164c = new C4513G8[0];
                    }
                } finally {
                }
            }
        }
        return f30164c;
    }

    /* renamed from: a */
    public final C4513G8 m19435a() {
        this.f30165a = "";
        this.f30166b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f30165a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f30165a);
        }
        return !Arrays.equals(this.f30166b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f30166b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f30165a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f30165a);
        }
        if (!Arrays.equals(this.f30166b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f30166b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4513G8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30165a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f30166b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4513G8 m19433b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4513G8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4513G8 m19432a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4513G8) MessageNano.mergeFrom(new C4513G8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a8 */
/* loaded from: classes2.dex */
public final class C4992a8 extends MessageNano {

    /* renamed from: c */
    public static volatile C4992a8[] f31247c;

    /* renamed from: a */
    public byte[] f31248a;

    /* renamed from: b */
    public C5092e8 f31249b;

    public C4992a8() {
        m20110a();
    }

    /* renamed from: b */
    public static C4992a8[] m20109b() {
        if (f31247c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31247c == null) {
                        f31247c = new C4992a8[0];
                    }
                } finally {
                }
            }
        }
        return f31247c;
    }

    /* renamed from: a */
    public final C4992a8 m20110a() {
        this.f31248a = WireFormatNano.EMPTY_BYTES;
        this.f31249b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f31248a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31248a);
        }
        C5092e8 c5092e8 = this.f31249b;
        return c5092e8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5092e8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f31248a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31248a);
        }
        C5092e8 c5092e8 = this.f31249b;
        if (c5092e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5092e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4992a8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31248a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31249b == null) {
                    this.f31249b = new C5092e8();
                }
                codedInputByteBufferNano.readMessage(this.f31249b);
            }
        }
    }

    /* renamed from: b */
    public static C4992a8 m20108b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4992a8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4992a8 m20107a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4992a8) MessageNano.mergeFrom(new C4992a8(), bArr);
    }
}

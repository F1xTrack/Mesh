package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Y5 */
/* loaded from: classes2.dex */
public final class C4941Y5 extends MessageNano {

    /* renamed from: c */
    public static volatile C4941Y5[] f31093c;

    /* renamed from: a */
    public byte[] f31094a;

    /* renamed from: b */
    public C5040c6 f31095b;

    public C4941Y5() {
        m20024a();
    }

    /* renamed from: b */
    public static C4941Y5[] m20023b() {
        if (f31093c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31093c == null) {
                        f31093c = new C4941Y5[0];
                    }
                } finally {
                }
            }
        }
        return f31093c;
    }

    /* renamed from: a */
    public final C4941Y5 m20024a() {
        this.f31094a = WireFormatNano.EMPTY_BYTES;
        this.f31095b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f31094a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31094a);
        }
        C5040c6 c5040c6 = this.f31095b;
        return c5040c6 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5040c6) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f31094a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31094a);
        }
        C5040c6 c5040c6 = this.f31095b;
        if (c5040c6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5040c6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31094a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31095b == null) {
                    this.f31095b = new C5040c6();
                }
                codedInputByteBufferNano.readMessage(this.f31095b);
            }
        }
    }

    /* renamed from: b */
    public static C4941Y5 m20022b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4941Y5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4941Y5 m20021a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4941Y5) MessageNano.mergeFrom(new C4941Y5(), bArr);
    }
}

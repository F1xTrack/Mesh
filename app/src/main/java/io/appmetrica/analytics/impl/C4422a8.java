package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4422a8 extends MessageNano {
    public static volatile C4422a8[] c;
    public byte[] a;
    public C4522e8 b;

    public C4422a8() {
        a();
    }

    public static C4422a8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C4422a8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4422a8 a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        C4522e8 c4522e8 = this.b;
        return c4522e8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c4522e8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        C4522e8 c4522e8 = this.b;
        if (c4522e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4522e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4422a8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new C4522e8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C4422a8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4422a8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4422a8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4422a8) MessageNano.mergeFrom(new C4422a8(), bArr);
    }
}

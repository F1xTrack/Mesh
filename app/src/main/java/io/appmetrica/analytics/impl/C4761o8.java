package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8 */
/* loaded from: classes2.dex */
public final class C4761o8 extends MessageNano {
    public static volatile C4761o8[] e;
    public byte[] a;
    public C4497d8 b;
    public byte[] c;
    public C4641j8 d;

    public C4761o8() {
        a();
    }

    public static C4761o8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C4761o8[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C4761o8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = null;
        this.c = bArr;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        C4497d8 c4497d8 = this.b;
        if (c4497d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4497d8);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.c);
        }
        C4641j8 c4641j8 = this.d;
        return c4641j8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4641j8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        C4497d8 c4497d8 = this.b;
        if (c4497d8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4497d8);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.c);
        }
        C4641j8 c4641j8 = this.d;
        if (c4641j8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4641j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4761o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new C4497d8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag == 26) {
                this.c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.d == null) {
                    this.d = new C4641j8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
    }

    public static C4761o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4761o8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4761o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4761o8) MessageNano.mergeFrom(new C4761o8(), bArr);
    }
}

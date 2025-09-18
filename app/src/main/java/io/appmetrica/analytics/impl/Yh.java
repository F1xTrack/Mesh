package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Yh extends MessageNano {
    public static volatile Yh[] e;
    public long a;
    public Zh b;
    public int c;
    public byte[] d;

    public Yh() {
        a();
    }

    public static Yh[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new Yh[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final Yh a() {
        this.a = 0L;
        this.b = null;
        this.c = 0;
        this.d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        Zh zh = this.b;
        if (zh != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, zh);
        }
        int i = this.c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        Zh zh = this.b;
        if (zh != null) {
            codedOutputByteBufferNano.writeMessage(2, zh);
        }
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new Zh();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag == 24) {
                this.c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Yh b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Yh().mergeFrom(codedInputByteBufferNano);
    }

    public static Yh a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Yh) MessageNano.mergeFrom(new Yh(), bArr);
    }
}

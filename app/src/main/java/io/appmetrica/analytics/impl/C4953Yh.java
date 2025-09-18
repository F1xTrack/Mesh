package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Yh */
/* loaded from: classes2.dex */
public final class C4953Yh extends MessageNano {

    /* renamed from: e */
    public static volatile C4953Yh[] f31120e;

    /* renamed from: a */
    public long f31121a;

    /* renamed from: b */
    public C4977Zh f31122b;

    /* renamed from: c */
    public int f31123c;

    /* renamed from: d */
    public byte[] f31124d;

    public C4953Yh() {
        m20044a();
    }

    /* renamed from: b */
    public static C4953Yh[] m20043b() {
        if (f31120e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31120e == null) {
                        f31120e = new C4953Yh[0];
                    }
                } finally {
                }
            }
        }
        return f31120e;
    }

    /* renamed from: a */
    public final C4953Yh m20044a() {
        this.f31121a = 0L;
        this.f31122b = null;
        this.f31123c = 0;
        this.f31124d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f31121a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        C4977Zh c4977Zh = this.f31122b;
        if (c4977Zh != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4977Zh);
        }
        int i = this.f31123c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.f31124d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f31124d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f31121a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        C4977Zh c4977Zh = this.f31122b;
        if (c4977Zh != null) {
            codedOutputByteBufferNano.writeMessage(2, c4977Zh);
        }
        int i = this.f31123c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f31124d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f31124d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4953Yh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31121a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f31122b == null) {
                    this.f31122b = new C4977Zh();
                }
                codedInputByteBufferNano.readMessage(this.f31122b);
            } else if (tag == 24) {
                this.f31123c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31124d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4953Yh m20042b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4953Yh().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4953Yh m20041a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4953Yh) MessageNano.mergeFrom(new C4953Yh(), bArr);
    }
}

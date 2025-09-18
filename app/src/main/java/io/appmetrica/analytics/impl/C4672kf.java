package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4672kf extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static volatile C4672kf[] h;
    public byte[] a;
    public long b;
    public long c;
    public int d;

    public C4672kf() {
        a();
    }

    public static C4672kf[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C4672kf[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final C4672kf a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.a) + super.computeSerializedSize();
        long j = this.b;
        if (j != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.d;
        return i != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        long j = this.b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4672kf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.d = int32;
                }
            }
        }
    }

    public static C4672kf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4672kf().mergeFrom(codedInputByteBufferNano);
    }

    public static C4672kf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4672kf) MessageNano.mergeFrom(new C4672kf(), bArr);
    }
}

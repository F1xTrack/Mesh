package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.kf */
/* loaded from: classes2.dex */
public final class C5249kf extends MessageNano {

    /* renamed from: e */
    public static final int f32069e = 0;

    /* renamed from: f */
    public static final int f32070f = 1;

    /* renamed from: g */
    public static final int f32071g = 2;

    /* renamed from: h */
    public static volatile C5249kf[] f32072h;

    /* renamed from: a */
    public byte[] f32073a;

    /* renamed from: b */
    public long f32074b;

    /* renamed from: c */
    public long f32075c;

    /* renamed from: d */
    public int f32076d;

    public C5249kf() {
        m20650a();
    }

    /* renamed from: b */
    public static C5249kf[] m20649b() {
        if (f32072h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32072h == null) {
                        f32072h = new C5249kf[0];
                    }
                } finally {
                }
            }
        }
        return f32072h;
    }

    /* renamed from: a */
    public final C5249kf m20650a() {
        this.f32073a = WireFormatNano.EMPTY_BYTES;
        this.f32074b = 0L;
        this.f32075c = 0L;
        this.f32076d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f32073a) + super.computeSerializedSize();
        long j = this.f32074b;
        if (j != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f32075c;
        if (j2 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f32076d;
        return i != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f32073a);
        long j = this.f32074b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f32075c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f32076d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5249kf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32073a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f32074b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f32075c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f32076d = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C5249kf m20648b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5249kf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5249kf m20647a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5249kf) MessageNano.mergeFrom(new C5249kf(), bArr);
    }
}

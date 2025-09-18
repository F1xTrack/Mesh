package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9 */
/* loaded from: classes2.dex */
public final class C5143g9 extends MessageNano {

    /* renamed from: e */
    public static volatile C5143g9[] f31753e;

    /* renamed from: a */
    public long f31754a;

    /* renamed from: b */
    public int f31755b;

    /* renamed from: c */
    public long f31756c;

    /* renamed from: d */
    public boolean f31757d;

    public C5143g9() {
        m20447a();
    }

    /* renamed from: b */
    public static C5143g9[] m20446b() {
        if (f31753e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31753e == null) {
                        f31753e = new C5143g9[0];
                    }
                } finally {
                }
            }
        }
        return f31753e;
    }

    /* renamed from: a */
    public final C5143g9 m20447a() {
        this.f31754a = 0L;
        this.f31755b = 0;
        this.f31756c = 0L;
        this.f31757d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f31755b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f31754a) + super.computeSerializedSize();
        long j = this.f31756c;
        if (j != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        boolean z = this.f31757d;
        return z ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f31754a);
        codedOutputByteBufferNano.writeSInt32(2, this.f31755b);
        long j = this.f31756c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        boolean z = this.f31757d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5143g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31754a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f31755b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f31756c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31757d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C5143g9 m20445b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5143g9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5143g9 m20444a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5143g9) MessageNano.mergeFrom(new C5143g9(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4571g9 extends MessageNano {
    public static volatile C4571g9[] e;
    public long a;
    public int b;
    public long c;
    public boolean d;

    public C4571g9() {
        a();
    }

    public static C4571g9[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C4571g9[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C4571g9 a() {
        this.a = 0L;
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        long j = this.c;
        if (j != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        boolean z = this.d;
        return z ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        codedOutputByteBufferNano.writeSInt32(2, this.b);
        long j = this.c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4571g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C4571g9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4571g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4571g9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4571g9) MessageNano.mergeFrom(new C4571g9(), bArr);
    }
}

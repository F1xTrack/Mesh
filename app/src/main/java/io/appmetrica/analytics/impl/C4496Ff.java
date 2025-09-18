package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ff */
/* loaded from: classes2.dex */
public final class C4496Ff extends MessageNano {

    /* renamed from: e */
    public static final int f30135e = 0;

    /* renamed from: f */
    public static final int f30136f = 1;

    /* renamed from: g */
    public static final int f30137g = 2;

    /* renamed from: h */
    public static volatile C4496Ff[] f30138h;

    /* renamed from: a */
    public String f30139a;

    /* renamed from: b */
    public long f30140b;

    /* renamed from: c */
    public long f30141c;

    /* renamed from: d */
    public int f30142d;

    public C4496Ff() {
        m19418a();
    }

    /* renamed from: b */
    public static C4496Ff[] m19417b() {
        if (f30138h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30138h == null) {
                        f30138h = new C4496Ff[0];
                    }
                } finally {
                }
            }
        }
        return f30138h;
    }

    /* renamed from: a */
    public final C4496Ff m19418a() {
        this.f30139a = "";
        this.f30140b = 0L;
        this.f30141c = 0L;
        this.f30142d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f30139a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f30139a);
        }
        long j = this.f30140b;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f30141c;
        if (j2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f30142d;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f30139a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f30139a);
        }
        long j = this.f30140b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f30141c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f30142d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4496Ff mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30139a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f30140b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f30141c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f30142d = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4496Ff m19416b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4496Ff().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4496Ff m19415a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4496Ff) MessageNano.mergeFrom(new C4496Ff(), bArr);
    }
}

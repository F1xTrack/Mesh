package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p7 */
/* loaded from: classes2.dex */
public final class C5366p7 extends MessageNano {

    /* renamed from: d */
    public static volatile C5366p7[] f32386d;

    /* renamed from: a */
    public long f32387a;

    /* renamed from: b */
    public long f32388b;

    /* renamed from: c */
    public int f32389c;

    public C5366p7() {
        m20907a();
    }

    /* renamed from: b */
    public static C5366p7[] m20906b() {
        if (f32386d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32386d == null) {
                        f32386d = new C5366p7[0];
                    }
                } finally {
                }
            }
        }
        return f32386d;
    }

    /* renamed from: a */
    public final C5366p7 m20907a() {
        this.f32387a = -1L;
        this.f32388b = -1L;
        this.f32389c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f32387a;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        long j2 = this.f32388b;
        if (j2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        int i = this.f32389c;
        return i != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f32387a;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        long j2 = this.f32388b;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        int i = this.f32389c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5366p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f32387a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f32388b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f32389c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C5366p7 m20905b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5366p7().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5366p7 m20904a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5366p7) MessageNano.mergeFrom(new C5366p7(), bArr);
    }
}

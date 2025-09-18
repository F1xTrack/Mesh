package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Zh */
/* loaded from: classes2.dex */
public final class C4977Zh extends MessageNano {

    /* renamed from: c */
    public static final int f31201c = 0;

    /* renamed from: d */
    public static final int f31202d = 1;

    /* renamed from: e */
    public static final int f31203e = 2;

    /* renamed from: f */
    public static final int f31204f = 3;

    /* renamed from: g */
    public static final int f31205g = 4;

    /* renamed from: h */
    public static volatile C4977Zh[] f31206h;

    /* renamed from: a */
    public int f31207a;

    /* renamed from: b */
    public int f31208b;

    public C4977Zh() {
        m20087a();
    }

    /* renamed from: b */
    public static C4977Zh[] m20086b() {
        if (f31206h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31206h == null) {
                        f31206h = new C4977Zh[0];
                    }
                } finally {
                }
            }
        }
        return f31206h;
    }

    /* renamed from: a */
    public final C4977Zh m20087a() {
        this.f31207a = 0;
        this.f31208b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31207a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f31208b;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31207a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f31208b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4977Zh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31207a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f31208b = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4977Zh m20085b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4977Zh().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4977Zh m20084a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4977Zh) MessageNano.mergeFrom(new C4977Zh(), bArr);
    }
}

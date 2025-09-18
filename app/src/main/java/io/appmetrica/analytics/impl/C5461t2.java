package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t2 */
/* loaded from: classes2.dex */
public final class C5461t2 extends MessageNano {

    /* renamed from: f */
    public static volatile C5461t2[] f32610f;

    /* renamed from: a */
    public int f32611a;

    /* renamed from: b */
    public String f32612b;

    /* renamed from: c */
    public String f32613c;

    /* renamed from: d */
    public long f32614d;

    /* renamed from: e */
    public long f32615e;

    public C5461t2() {
        m21072a();
    }

    /* renamed from: b */
    public static C5461t2[] m21071b() {
        if (f32610f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32610f == null) {
                        f32610f = new C5461t2[0];
                    }
                } finally {
                }
            }
        }
        return f32610f;
    }

    /* renamed from: a */
    public final C5461t2 m21072a() {
        this.f32611a = 1;
        this.f32612b = "";
        this.f32613c = "";
        this.f32614d = 0L;
        this.f32615e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f32615e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f32614d) + CodedOutputByteBufferNano.computeStringSize(3, this.f32613c) + CodedOutputByteBufferNano.computeStringSize(2, this.f32612b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f32611a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f32611a);
        codedOutputByteBufferNano.writeString(2, this.f32612b);
        codedOutputByteBufferNano.writeString(3, this.f32613c);
        codedOutputByteBufferNano.writeUInt64(4, this.f32614d);
        codedOutputByteBufferNano.writeUInt64(5, this.f32615e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5461t2 m21070b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5461t2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5461t2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f32611a = int32;
                }
            } else if (tag == 18) {
                this.f32612b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f32613c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f32614d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32615e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C5461t2 m21069a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5461t2) MessageNano.mergeFrom(new C5461t2(), bArr);
    }
}

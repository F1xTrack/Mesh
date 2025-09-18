package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9 */
/* loaded from: classes2.dex */
public final class C5118f9 extends MessageNano {

    /* renamed from: e */
    public static volatile C5118f9[] f31672e;

    /* renamed from: a */
    public int f31673a;

    /* renamed from: b */
    public int f31674b;

    /* renamed from: c */
    public String f31675c;

    /* renamed from: d */
    public boolean f31676d;

    public C5118f9() {
        m20379a();
    }

    /* renamed from: b */
    public static C5118f9[] m20378b() {
        if (f31672e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31672e == null) {
                        f31672e = new C5118f9[0];
                    }
                } finally {
                }
            }
        }
        return f31672e;
    }

    /* renamed from: a */
    public final C5118f9 m20379a() {
        this.f31673a = 0;
        this.f31674b = 0;
        this.f31675c = "";
        this.f31676d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31673a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f31674b;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
        }
        if (!this.f31675c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f31675c);
        }
        boolean z = this.f31676d;
        return z ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31673a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f31674b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        if (!this.f31675c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f31675c);
        }
        boolean z = this.f31676d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5118f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31673a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f31674b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f31675c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31676d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C5118f9 m20377b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5118f9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5118f9 m20376a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5118f9) MessageNano.mergeFrom(new C5118f9(), bArr);
    }
}

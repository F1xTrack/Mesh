package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.L3 */
/* loaded from: classes2.dex */
public final class C4628L3 extends MessageNano {

    /* renamed from: c */
    public static volatile C4628L3[] f30415c;

    /* renamed from: a */
    public C4676N3 f30416a;

    /* renamed from: b */
    public int f30417b;

    public C4628L3() {
        m19566a();
    }

    /* renamed from: b */
    public static C4628L3[] m19565b() {
        if (f30415c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30415c == null) {
                        f30415c = new C4628L3[0];
                    }
                } finally {
                }
            }
        }
        return f30415c;
    }

    /* renamed from: a */
    public final C4628L3 m19566a() {
        this.f30416a = null;
        this.f30417b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4676N3 c4676n3 = this.f30416a;
        if (c4676n3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4676n3);
        }
        int i = this.f30417b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4676N3 c4676n3 = this.f30416a;
        if (c4676n3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4676n3);
        }
        int i = this.f30417b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4628L3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f30416a == null) {
                    this.f30416a = new C4676N3();
                }
                codedInputByteBufferNano.readMessage(this.f30416a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f30417b = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C4628L3 m19564b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4628L3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4628L3 m19563a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4628L3) MessageNano.mergeFrom(new C4628L3(), bArr);
    }
}

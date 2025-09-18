package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.x9 */
/* loaded from: classes2.dex */
public final class C5568x9 extends MessageNano {

    /* renamed from: c */
    public static final int f32809c = 0;

    /* renamed from: d */
    public static final int f32810d = 1;

    /* renamed from: e */
    public static final int f32811e = 2;

    /* renamed from: f */
    public static final int f32812f = 3;

    /* renamed from: g */
    public static final int f32813g = 4;

    /* renamed from: h */
    public static final int f32814h = 5;

    /* renamed from: i */
    public static final int f32815i = 6;

    /* renamed from: j */
    public static volatile C5568x9[] f32816j;

    /* renamed from: a */
    public int f32817a;

    /* renamed from: b */
    public byte[] f32818b;

    public C5568x9() {
        m21203a();
    }

    /* renamed from: b */
    public static C5568x9[] m21202b() {
        if (f32816j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32816j == null) {
                        f32816j = new C5568x9[0];
                    }
                } finally {
                }
            }
        }
        return f32816j;
    }

    /* renamed from: a */
    public final C5568x9 m21203a() {
        this.f32817a = 0;
        this.f32818b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32817a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !Arrays.equals(this.f32818b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f32818b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32817a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!Arrays.equals(this.f32818b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f32818b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5568x9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f32817a = int32;
                        break;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32818b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C5568x9 m21201b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5568x9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5568x9 m21200a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5568x9) MessageNano.mergeFrom(new C5568x9(), bArr);
    }
}

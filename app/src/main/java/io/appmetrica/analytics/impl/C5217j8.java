package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j8 */
/* loaded from: classes2.dex */
public final class C5217j8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5217j8[] f31967c;

    /* renamed from: a */
    public C5192i8[] f31968a;

    /* renamed from: b */
    public int f31969b;

    public C5217j8() {
        m20591a();
    }

    /* renamed from: b */
    public static C5217j8[] m20590b() {
        if (f31967c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31967c == null) {
                        f31967c = new C5217j8[0];
                    }
                } finally {
                }
            }
        }
        return f31967c;
    }

    /* renamed from: a */
    public final C5217j8 m20591a() {
        this.f31968a = C5192i8.m20569b();
        this.f31969b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5192i8[] c5192i8Arr = this.f31968a;
        if (c5192i8Arr != null && c5192i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5192i8[] c5192i8Arr2 = this.f31968a;
                if (i >= c5192i8Arr2.length) {
                    break;
                }
                C5192i8 c5192i8 = c5192i8Arr2[i];
                if (c5192i8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5192i8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.f31969b;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5192i8[] c5192i8Arr = this.f31968a;
        if (c5192i8Arr != null && c5192i8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5192i8[] c5192i8Arr2 = this.f31968a;
                if (i >= c5192i8Arr2.length) {
                    break;
                }
                C5192i8 c5192i8 = c5192i8Arr2[i];
                if (c5192i8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5192i8);
                }
                i++;
            }
        }
        int i2 = this.f31969b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5217j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5192i8[] c5192i8Arr = this.f31968a;
                int length = c5192i8Arr == null ? 0 : c5192i8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5192i8[] c5192i8Arr2 = new C5192i8[i];
                if (length != 0) {
                    System.arraycopy(c5192i8Arr, 0, c5192i8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5192i8 c5192i8 = new C5192i8();
                    c5192i8Arr2[length] = c5192i8;
                    codedInputByteBufferNano.readMessage(c5192i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5192i8 c5192i82 = new C5192i8();
                c5192i8Arr2[length] = c5192i82;
                codedInputByteBufferNano.readMessage(c5192i82);
                this.f31968a = c5192i8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31969b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C5217j8 m20589b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5217j8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5217j8 m20588a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5217j8) MessageNano.mergeFrom(new C5217j8(), bArr);
    }
}

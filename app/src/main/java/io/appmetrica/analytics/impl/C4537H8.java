package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.H8 */
/* loaded from: classes2.dex */
public final class C4537H8 extends MessageNano {

    /* renamed from: b */
    public static volatile C4537H8[] f30245b;

    /* renamed from: a */
    public C4513G8[] f30246a;

    public C4537H8() {
        m19463a();
    }

    /* renamed from: b */
    public static C4537H8[] m19462b() {
        if (f30245b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30245b == null) {
                        f30245b = new C4537H8[0];
                    }
                } finally {
                }
            }
        }
        return f30245b;
    }

    /* renamed from: a */
    public final C4537H8 m19463a() {
        this.f30246a = C4513G8.m19434b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4513G8[] c4513g8Arr = this.f30246a;
        if (c4513g8Arr != null && c4513g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4513G8[] c4513g8Arr2 = this.f30246a;
                if (i >= c4513g8Arr2.length) {
                    break;
                }
                C4513G8 c4513g8 = c4513g8Arr2[i];
                if (c4513g8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4513g8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4513G8[] c4513g8Arr = this.f30246a;
        if (c4513g8Arr != null && c4513g8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4513G8[] c4513g8Arr2 = this.f30246a;
                if (i >= c4513g8Arr2.length) {
                    break;
                }
                C4513G8 c4513g8 = c4513g8Arr2[i];
                if (c4513g8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4513g8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4537H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4513G8[] c4513g8Arr = this.f30246a;
                int length = c4513g8Arr == null ? 0 : c4513g8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4513G8[] c4513g8Arr2 = new C4513G8[i];
                if (length != 0) {
                    System.arraycopy(c4513g8Arr, 0, c4513g8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4513G8 c4513g8 = new C4513G8();
                    c4513g8Arr2[length] = c4513g8;
                    codedInputByteBufferNano.readMessage(c4513g8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4513G8 c4513g82 = new C4513G8();
                c4513g8Arr2[length] = c4513g82;
                codedInputByteBufferNano.readMessage(c4513g82);
                this.f30246a = c4513g8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C4537H8 m19461b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4537H8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4537H8 m19460a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4537H8) MessageNano.mergeFrom(new C4537H8(), bArr);
    }
}

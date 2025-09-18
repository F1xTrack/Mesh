package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.N3 */
/* loaded from: classes2.dex */
public final class C4676N3 extends MessageNano {

    /* renamed from: b */
    public static volatile C4676N3[] f30501b;

    /* renamed from: a */
    public C4652M3[] f30502a;

    public C4676N3() {
        m19650a();
    }

    /* renamed from: b */
    public static C4676N3[] m19649b() {
        if (f30501b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30501b == null) {
                        f30501b = new C4676N3[0];
                    }
                } finally {
                }
            }
        }
        return f30501b;
    }

    /* renamed from: a */
    public final C4676N3 m19650a() {
        this.f30502a = C4652M3.m19623b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4652M3[] c4652m3Arr = this.f30502a;
        if (c4652m3Arr != null && c4652m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C4652M3[] c4652m3Arr2 = this.f30502a;
                if (i >= c4652m3Arr2.length) {
                    break;
                }
                C4652M3 c4652m3 = c4652m3Arr2[i];
                if (c4652m3 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4652m3) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4652M3[] c4652m3Arr = this.f30502a;
        if (c4652m3Arr != null && c4652m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C4652M3[] c4652m3Arr2 = this.f30502a;
                if (i >= c4652m3Arr2.length) {
                    break;
                }
                C4652M3 c4652m3 = c4652m3Arr2[i];
                if (c4652m3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4652m3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4676N3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C4652M3[] c4652m3Arr = this.f30502a;
                int length = c4652m3Arr == null ? 0 : c4652m3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4652M3[] c4652m3Arr2 = new C4652M3[i];
                if (length != 0) {
                    System.arraycopy(c4652m3Arr, 0, c4652m3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4652M3 c4652m3 = new C4652M3();
                    c4652m3Arr2[length] = c4652m3;
                    codedInputByteBufferNano.readMessage(c4652m3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4652M3 c4652m32 = new C4652M3();
                c4652m3Arr2[length] = c4652m32;
                codedInputByteBufferNano.readMessage(c4652m32);
                this.f30502a = c4652m3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C4676N3 m19648b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4676N3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4676N3 m19647a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4676N3) MessageNano.mergeFrom(new C4676N3(), bArr);
    }
}

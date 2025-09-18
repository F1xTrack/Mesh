package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u2 */
/* loaded from: classes2.dex */
public final class C5486u2 extends MessageNano {

    /* renamed from: c */
    public static final int f32665c = 1;

    /* renamed from: d */
    public static final int f32666d = 2;

    /* renamed from: e */
    public static final int f32667e = 3;

    /* renamed from: f */
    public static volatile C5486u2[] f32668f;

    /* renamed from: a */
    public C5461t2[] f32669a;

    /* renamed from: b */
    public boolean f32670b;

    public C5486u2() {
        m21111a();
    }

    /* renamed from: b */
    public static C5486u2[] m21110b() {
        if (f32668f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32668f == null) {
                        f32668f = new C5486u2[0];
                    }
                } finally {
                }
            }
        }
        return f32668f;
    }

    /* renamed from: a */
    public final C5486u2 m21111a() {
        this.f32669a = C5461t2.m21071b();
        this.f32670b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5461t2[] c5461t2Arr = this.f32669a;
        if (c5461t2Arr != null && c5461t2Arr.length > 0) {
            int i = 0;
            while (true) {
                C5461t2[] c5461t2Arr2 = this.f32669a;
                if (i >= c5461t2Arr2.length) {
                    break;
                }
                C5461t2 c5461t2 = c5461t2Arr2[i];
                if (c5461t2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5461t2) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f32670b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5461t2[] c5461t2Arr = this.f32669a;
        if (c5461t2Arr != null && c5461t2Arr.length > 0) {
            int i = 0;
            while (true) {
                C5461t2[] c5461t2Arr2 = this.f32669a;
                if (i >= c5461t2Arr2.length) {
                    break;
                }
                C5461t2 c5461t2 = c5461t2Arr2[i];
                if (c5461t2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5461t2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f32670b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5486u2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5461t2[] c5461t2Arr = this.f32669a;
                int length = c5461t2Arr == null ? 0 : c5461t2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5461t2[] c5461t2Arr2 = new C5461t2[i];
                if (length != 0) {
                    System.arraycopy(c5461t2Arr, 0, c5461t2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5461t2 c5461t2 = new C5461t2();
                    c5461t2Arr2[length] = c5461t2;
                    codedInputByteBufferNano.readMessage(c5461t2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5461t2 c5461t22 = new C5461t2();
                c5461t2Arr2[length] = c5461t22;
                codedInputByteBufferNano.readMessage(c5461t22);
                this.f32669a = c5461t2Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32670b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C5486u2 m21109b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5486u2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5486u2 m21108a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5486u2) MessageNano.mergeFrom(new C5486u2(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8 */
/* loaded from: classes2.dex */
public final class C5242k8 extends MessageNano {

    /* renamed from: c */
    public static volatile C5242k8[] f32031c;

    /* renamed from: a */
    public C4992a8 f32032a;

    /* renamed from: b */
    public C4992a8[] f32033b;

    public C5242k8() {
        m20611a();
    }

    /* renamed from: b */
    public static C5242k8[] m20610b() {
        if (f32031c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32031c == null) {
                        f32031c = new C5242k8[0];
                    }
                } finally {
                }
            }
        }
        return f32031c;
    }

    /* renamed from: a */
    public final C5242k8 m20611a() {
        this.f32032a = null;
        this.f32033b = C4992a8.m20109b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4992a8 c4992a8 = this.f32032a;
        if (c4992a8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4992a8);
        }
        C4992a8[] c4992a8Arr = this.f32033b;
        if (c4992a8Arr != null && c4992a8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4992a8[] c4992a8Arr2 = this.f32033b;
                if (i >= c4992a8Arr2.length) {
                    break;
                }
                C4992a8 c4992a82 = c4992a8Arr2[i];
                if (c4992a82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4992a82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4992a8 c4992a8 = this.f32032a;
        if (c4992a8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4992a8);
        }
        C4992a8[] c4992a8Arr = this.f32033b;
        if (c4992a8Arr != null && c4992a8Arr.length > 0) {
            int i = 0;
            while (true) {
                C4992a8[] c4992a8Arr2 = this.f32033b;
                if (i >= c4992a8Arr2.length) {
                    break;
                }
                C4992a8 c4992a82 = c4992a8Arr2[i];
                if (c4992a82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4992a82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5242k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f32032a == null) {
                    this.f32032a = new C4992a8();
                }
                codedInputByteBufferNano.readMessage(this.f32032a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4992a8[] c4992a8Arr = this.f32033b;
                int length = c4992a8Arr == null ? 0 : c4992a8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4992a8[] c4992a8Arr2 = new C4992a8[i];
                if (length != 0) {
                    System.arraycopy(c4992a8Arr, 0, c4992a8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4992a8 c4992a8 = new C4992a8();
                    c4992a8Arr2[length] = c4992a8;
                    codedInputByteBufferNano.readMessage(c4992a8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4992a8 c4992a82 = new C4992a8();
                c4992a8Arr2[length] = c4992a82;
                codedInputByteBufferNano.readMessage(c4992a82);
                this.f32033b = c4992a8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C5242k8 m20609b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5242k8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5242k8 m20608a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5242k8) MessageNano.mergeFrom(new C5242k8(), bArr);
    }
}

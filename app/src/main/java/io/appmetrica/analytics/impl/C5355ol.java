package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ol */
/* loaded from: classes2.dex */
public final class C5355ol extends MessageNano {

    /* renamed from: b */
    public static volatile C5355ol[] f32362b;

    /* renamed from: a */
    public C5330nl[] f32363a;

    public C5355ol() {
        m20886a();
    }

    /* renamed from: b */
    public static C5355ol[] m20885b() {
        if (f32362b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32362b == null) {
                        f32362b = new C5355ol[0];
                    }
                } finally {
                }
            }
        }
        return f32362b;
    }

    /* renamed from: a */
    public final C5355ol m20886a() {
        this.f32363a = C5330nl.m20842b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5330nl[] c5330nlArr = this.f32363a;
        if (c5330nlArr != null && c5330nlArr.length > 0) {
            int i = 0;
            while (true) {
                C5330nl[] c5330nlArr2 = this.f32363a;
                if (i >= c5330nlArr2.length) {
                    break;
                }
                C5330nl c5330nl = c5330nlArr2[i];
                if (c5330nl != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5330nl) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5330nl[] c5330nlArr = this.f32363a;
        if (c5330nlArr != null && c5330nlArr.length > 0) {
            int i = 0;
            while (true) {
                C5330nl[] c5330nlArr2 = this.f32363a;
                if (i >= c5330nlArr2.length) {
                    break;
                }
                C5330nl c5330nl = c5330nlArr2[i];
                if (c5330nl != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5330nl);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5355ol mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5330nl[] c5330nlArr = this.f32363a;
                int length = c5330nlArr == null ? 0 : c5330nlArr.length;
                int i = repeatedFieldArrayLength + length;
                C5330nl[] c5330nlArr2 = new C5330nl[i];
                if (length != 0) {
                    System.arraycopy(c5330nlArr, 0, c5330nlArr2, 0, length);
                }
                while (length < i - 1) {
                    C5330nl c5330nl = new C5330nl();
                    c5330nlArr2[length] = c5330nl;
                    codedInputByteBufferNano.readMessage(c5330nl);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5330nl c5330nl2 = new C5330nl();
                c5330nlArr2[length] = c5330nl2;
                codedInputByteBufferNano.readMessage(c5330nl2);
                this.f32363a = c5330nlArr2;
            }
        }
    }

    /* renamed from: b */
    public static C5355ol m20884b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5355ol().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5355ol m20883a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5355ol) MessageNano.mergeFrom(new C5355ol(), bArr);
    }
}

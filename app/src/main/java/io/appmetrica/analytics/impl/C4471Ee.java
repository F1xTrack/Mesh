package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ee */
/* loaded from: classes2.dex */
public final class C4471Ee extends MessageNano {

    /* renamed from: c */
    public static final int f30069c = 0;

    /* renamed from: d */
    public static final int f30070d = 1;

    /* renamed from: e */
    public static final int f30071e = 2;

    /* renamed from: f */
    public static final int f30072f = 3;

    /* renamed from: g */
    public static volatile C4471Ee[] f30073g;

    /* renamed from: a */
    public C4421Ce f30074a;

    /* renamed from: b */
    public C4446De[] f30075b;

    public C4471Ee() {
        m19356a();
    }

    /* renamed from: b */
    public static C4471Ee[] m19355b() {
        if (f30073g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30073g == null) {
                        f30073g = new C4471Ee[0];
                    }
                } finally {
                }
            }
        }
        return f30073g;
    }

    /* renamed from: a */
    public final C4471Ee m19356a() {
        this.f30074a = null;
        this.f30075b = C4446De.m19328b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4421Ce c4421Ce = this.f30074a;
        if (c4421Ce != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4421Ce);
        }
        C4446De[] c4446DeArr = this.f30075b;
        if (c4446DeArr != null && c4446DeArr.length > 0) {
            int i = 0;
            while (true) {
                C4446De[] c4446DeArr2 = this.f30075b;
                if (i >= c4446DeArr2.length) {
                    break;
                }
                C4446De c4446De = c4446DeArr2[i];
                if (c4446De != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4446De) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4421Ce c4421Ce = this.f30074a;
        if (c4421Ce != null) {
            codedOutputByteBufferNano.writeMessage(1, c4421Ce);
        }
        C4446De[] c4446DeArr = this.f30075b;
        if (c4446DeArr != null && c4446DeArr.length > 0) {
            int i = 0;
            while (true) {
                C4446De[] c4446DeArr2 = this.f30075b;
                if (i >= c4446DeArr2.length) {
                    break;
                }
                C4446De c4446De = c4446DeArr2[i];
                if (c4446De != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4446De);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4471Ee mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f30074a == null) {
                    this.f30074a = new C4421Ce();
                }
                codedInputByteBufferNano.readMessage(this.f30074a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4446De[] c4446DeArr = this.f30075b;
                int length = c4446DeArr == null ? 0 : c4446DeArr.length;
                int i = repeatedFieldArrayLength + length;
                C4446De[] c4446DeArr2 = new C4446De[i];
                if (length != 0) {
                    System.arraycopy(c4446DeArr, 0, c4446DeArr2, 0, length);
                }
                while (length < i - 1) {
                    C4446De c4446De = new C4446De();
                    c4446DeArr2[length] = c4446De;
                    codedInputByteBufferNano.readMessage(c4446De);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4446De c4446De2 = new C4446De();
                c4446DeArr2[length] = c4446De2;
                codedInputByteBufferNano.readMessage(c4446De2);
                this.f30075b = c4446DeArr2;
            }
        }
    }

    /* renamed from: b */
    public static C4471Ee m19354b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4471Ee().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4471Ee m19353a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4471Ee) MessageNano.mergeFrom(new C4471Ee(), bArr);
    }
}

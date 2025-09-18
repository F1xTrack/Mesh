package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class Ee extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile Ee[] g;
    public Ce a;
    public De[] b;

    public Ee() {
        a();
    }

    public static Ee[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new Ee[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Ee a() {
        this.a = null;
        this.b = De.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Ce ce = this.a;
        if (ce != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, ce);
        }
        De[] deArr = this.b;
        if (deArr != null && deArr.length > 0) {
            int i = 0;
            while (true) {
                De[] deArr2 = this.b;
                if (i >= deArr2.length) {
                    break;
                }
                De de = deArr2[i];
                if (de != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, de) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Ce ce = this.a;
        if (ce != null) {
            codedOutputByteBufferNano.writeMessage(1, ce);
        }
        De[] deArr = this.b;
        if (deArr != null && deArr.length > 0) {
            int i = 0;
            while (true) {
                De[] deArr2 = this.b;
                if (i >= deArr2.length) {
                    break;
                }
                De de = deArr2[i];
                if (de != null) {
                    codedOutputByteBufferNano.writeMessage(2, de);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ee mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new Ce();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                De[] deArr = this.b;
                int length = deArr == null ? 0 : deArr.length;
                int i = repeatedFieldArrayLength + length;
                De[] deArr2 = new De[i];
                if (length != 0) {
                    System.arraycopy(deArr, 0, deArr2, 0, length);
                }
                while (length < i - 1) {
                    De de = new De();
                    deArr2[length] = de;
                    codedInputByteBufferNano.readMessage(de);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                De de2 = new De();
                deArr2[length] = de2;
                codedInputByteBufferNano.readMessage(de2);
                this.b = deArr2;
            }
        }
    }

    public static Ee b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ee().mergeFrom(codedInputByteBufferNano);
    }

    public static Ee a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ee) MessageNano.mergeFrom(new Ee(), bArr);
    }
}

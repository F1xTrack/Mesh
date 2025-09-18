package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.q */
/* loaded from: classes2.dex */
public final class C3877q extends MessageNano {

    /* renamed from: c */
    public static volatile C3877q[] f25647c;

    /* renamed from: a */
    public String f25648a;

    /* renamed from: b */
    public C3879s[] f25649b;

    public C3877q() {
        m17415a();
    }

    /* renamed from: a */
    public final void m17415a() {
        this.f25648a = "";
        if (C3879s.f25654d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (C3879s.f25654d == null) {
                        C3879s.f25654d = new C3879s[0];
                    }
                } finally {
                }
            }
        }
        this.f25649b = C3879s.f25654d;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25648a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25648a);
        }
        C3879s[] c3879sArr = this.f25649b;
        if (c3879sArr != null && c3879sArr.length > 0) {
            int i = 0;
            while (true) {
                C3879s[] c3879sArr2 = this.f25649b;
                if (i >= c3879sArr2.length) {
                    break;
                }
                C3879s c3879s = c3879sArr2[i];
                if (c3879s != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c3879s) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25648a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C3879s[] c3879sArr = this.f25649b;
                int length = c3879sArr == null ? 0 : c3879sArr.length;
                int i = repeatedFieldArrayLength + length;
                C3879s[] c3879sArr2 = new C3879s[i];
                if (length != 0) {
                    System.arraycopy(c3879sArr, 0, c3879sArr2, 0, length);
                }
                while (length < i - 1) {
                    C3879s c3879s = new C3879s();
                    c3879sArr2[length] = c3879s;
                    codedInputByteBufferNano.readMessage(c3879s);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3879s c3879s2 = new C3879s();
                c3879sArr2[length] = c3879s2;
                codedInputByteBufferNano.readMessage(c3879s2);
                this.f25649b = c3879sArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25648a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25648a);
        }
        C3879s[] c3879sArr = this.f25649b;
        if (c3879sArr != null && c3879sArr.length > 0) {
            int i = 0;
            while (true) {
                C3879s[] c3879sArr2 = this.f25649b;
                if (i >= c3879sArr2.length) {
                    break;
                }
                C3879s c3879s = c3879sArr2[i];
                if (c3879s != null) {
                    codedOutputByteBufferNano.writeMessage(2, c3879s);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

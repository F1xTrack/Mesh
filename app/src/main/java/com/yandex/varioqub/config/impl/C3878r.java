package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.r */
/* loaded from: classes2.dex */
public final class C3878r extends MessageNano {

    /* renamed from: a */
    public String f25650a;

    /* renamed from: b */
    public String f25651b;

    /* renamed from: c */
    public C3877q[] f25652c;

    /* renamed from: d */
    public String f25653d;

    public C3878r() {
        m17416a();
    }

    /* renamed from: a */
    public final void m17416a() {
        this.f25650a = "";
        this.f25651b = "";
        if (C3877q.f25647c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (C3877q.f25647c == null) {
                        C3877q.f25647c = new C3877q[0];
                    }
                } finally {
                }
            }
        }
        this.f25652c = C3877q.f25647c;
        this.f25653d = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25650a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25650a);
        }
        if (!this.f25651b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f25651b);
        }
        C3877q[] c3877qArr = this.f25652c;
        if (c3877qArr != null && c3877qArr.length > 0) {
            int i = 0;
            while (true) {
                C3877q[] c3877qArr2 = this.f25652c;
                if (i >= c3877qArr2.length) {
                    break;
                }
                C3877q c3877q = c3877qArr2[i];
                if (c3877q != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c3877q) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f25653d.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f25653d) : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25650a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f25651b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C3877q[] c3877qArr = this.f25652c;
                int length = c3877qArr == null ? 0 : c3877qArr.length;
                int i = repeatedFieldArrayLength + length;
                C3877q[] c3877qArr2 = new C3877q[i];
                if (length != 0) {
                    System.arraycopy(c3877qArr, 0, c3877qArr2, 0, length);
                }
                while (length < i - 1) {
                    C3877q c3877q = new C3877q();
                    c3877qArr2[length] = c3877q;
                    codedInputByteBufferNano.readMessage(c3877q);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C3877q c3877q2 = new C3877q();
                c3877qArr2[length] = c3877q2;
                codedInputByteBufferNano.readMessage(c3877q2);
                this.f25652c = c3877qArr2;
            } else if (tag == 34) {
                this.f25653d = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25650a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25650a);
        }
        if (!this.f25651b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f25651b);
        }
        C3877q[] c3877qArr = this.f25652c;
        if (c3877qArr != null && c3877qArr.length > 0) {
            int i = 0;
            while (true) {
                C3877q[] c3877qArr2 = this.f25652c;
                if (i >= c3877qArr2.length) {
                    break;
                }
                C3877q c3877q = c3877qArr2[i];
                if (c3877q != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3877q);
                }
                i++;
            }
        }
        if (!this.f25653d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f25653d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.n */
/* loaded from: classes2.dex */
public final class C3874n extends MessageNano {

    /* renamed from: c */
    public static volatile C3874n[] f25627c;

    /* renamed from: a */
    public String f25628a;

    /* renamed from: b */
    public String f25629b;

    public C3874n() {
        m17411a();
    }

    /* renamed from: a */
    public final void m17411a() {
        this.f25628a = "";
        this.f25629b = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25628a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25628a);
        }
        return !this.f25629b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f25629b) : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25628a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f25629b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25628a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25628a);
        }
        if (!this.f25629b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f25629b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

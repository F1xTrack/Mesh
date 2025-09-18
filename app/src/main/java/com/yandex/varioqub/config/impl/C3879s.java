package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.s */
/* loaded from: classes2.dex */
public final class C3879s extends MessageNano {

    /* renamed from: d */
    public static volatile C3879s[] f25654d;

    /* renamed from: a */
    public String f25655a;

    /* renamed from: b */
    public long f25656b;

    /* renamed from: c */
    public boolean f25657c;

    public C3879s() {
        m17417a();
    }

    /* renamed from: a */
    public final void m17417a() {
        this.f25655a = "";
        this.f25656b = 0L;
        this.f25657c = false;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25655a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25655a);
        }
        long j = this.f25656b;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j);
        }
        boolean z = this.f25657c;
        return z ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, z) : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25655a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f25656b = codedInputByteBufferNano.readInt64();
            } else if (tag == 24) {
                this.f25657c = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25655a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25655a);
        }
        long j = this.f25656b;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(2, j);
        }
        boolean z = this.f25657c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

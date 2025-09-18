package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.o */
/* loaded from: classes2.dex */
public final class C3875o extends MessageNano {

    /* renamed from: c */
    public static volatile C3875o[] f25630c;

    /* renamed from: a */
    public String f25631a;

    /* renamed from: b */
    public double f25632b;

    public C3875o() {
        m17413a();
    }

    /* renamed from: b */
    public static C3875o[] m17412b() {
        if (f25630c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25630c == null) {
                        f25630c = new C3875o[0];
                    }
                } finally {
                }
            }
        }
        return f25630c;
    }

    /* renamed from: a */
    public final void m17413a() {
        this.f25631a = "";
        this.f25632b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25631a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25631a);
        }
        return Double.doubleToLongBits(this.f25632b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(2, this.f25632b) : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25631a = codedInputByteBufferNano.readString();
            } else if (tag == 17) {
                this.f25632b = codedInputByteBufferNano.readDouble();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25631a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25631a);
        }
        if (Double.doubleToLongBits(this.f25632b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f25632b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

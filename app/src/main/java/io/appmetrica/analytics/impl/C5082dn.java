package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.dn */
/* loaded from: classes2.dex */
public final class C5082dn extends MessageNano {

    /* renamed from: e */
    public static volatile C5082dn[] f31500e;

    /* renamed from: a */
    public byte[] f31501a;

    /* renamed from: b */
    public double f31502b;

    /* renamed from: c */
    public double f31503c;

    /* renamed from: d */
    public boolean f31504d;

    public C5082dn() {
        m20296a();
    }

    /* renamed from: b */
    public static C5082dn[] m20295b() {
        if (f31500e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31500e == null) {
                        f31500e = new C5082dn[0];
                    }
                } finally {
                }
            }
        }
        return f31500e;
    }

    /* renamed from: a */
    public final C5082dn m20296a() {
        this.f31501a = WireFormatNano.EMPTY_BYTES;
        this.f31502b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f31503c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f31504d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f31501a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f31501a);
        }
        if (Double.doubleToLongBits(this.f31502b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f31502b);
        }
        if (Double.doubleToLongBits(this.f31503c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f31503c);
        }
        boolean z = this.f31504d;
        return z ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f31501a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f31501a);
        }
        if (Double.doubleToLongBits(this.f31502b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f31502b);
        }
        if (Double.doubleToLongBits(this.f31503c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(3, this.f31503c);
        }
        boolean z = this.f31504d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5082dn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31501a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f31502b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f31503c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31504d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C5082dn m20294b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5082dn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5082dn m20293a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5082dn) MessageNano.mergeFrom(new C5082dn(), bArr);
    }
}

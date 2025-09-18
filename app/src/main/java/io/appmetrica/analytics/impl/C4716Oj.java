package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Oj */
/* loaded from: classes2.dex */
public final class C4716Oj extends MessageNano {

    /* renamed from: c */
    public static volatile C4716Oj[] f30585c;

    /* renamed from: a */
    public byte[] f30586a;

    /* renamed from: b */
    public byte[] f30587b;

    public C4716Oj() {
        m19702a();
    }

    /* renamed from: b */
    public static C4716Oj[] m19701b() {
        if (f30585c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30585c == null) {
                        f30585c = new C4716Oj[0];
                    }
                } finally {
                }
            }
        }
        return f30585c;
    }

    /* renamed from: a */
    public final C4716Oj m19702a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f30586a = bArr;
        this.f30587b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f30586a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f30586a);
        }
        return !Arrays.equals(this.f30587b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f30587b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f30586a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f30586a);
        }
        if (!Arrays.equals(this.f30587b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f30587b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4716Oj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f30586a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f30587b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C4716Oj m19700b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4716Oj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4716Oj m19699a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4716Oj) MessageNano.mergeFrom(new C4716Oj(), bArr);
    }
}

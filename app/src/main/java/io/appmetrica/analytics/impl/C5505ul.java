package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ul */
/* loaded from: classes2.dex */
public final class C5505ul extends MessageNano {

    /* renamed from: c */
    public static volatile C5505ul[] f32707c;

    /* renamed from: a */
    public String f32708a;

    /* renamed from: b */
    public byte[] f32709b;

    public C5505ul() {
        m21148a();
    }

    /* renamed from: b */
    public static C5505ul[] m21147b() {
        if (f32707c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32707c == null) {
                        f32707c = new C5505ul[0];
                    }
                } finally {
                }
            }
        }
        return f32707c;
    }

    /* renamed from: a */
    public final C5505ul m21148a() {
        this.f32708a = "";
        this.f32709b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f32708a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f32708a);
        }
        return !Arrays.equals(this.f32709b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f32709b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32708a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32708a);
        }
        if (!Arrays.equals(this.f32709b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f32709b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5505ul mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32708a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32709b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C5505ul m21146b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5505ul().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5505ul m21145a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5505ul) MessageNano.mergeFrom(new C5505ul(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c8 */
/* loaded from: classes2.dex */
public final class C5042c8 extends MessageNano {

    /* renamed from: e */
    public static volatile C5042c8[] f31360e;

    /* renamed from: a */
    public C5267l8 f31361a;

    /* renamed from: b */
    public C5317n8 f31362b;

    /* renamed from: c */
    public C5092e8 f31363c;

    /* renamed from: d */
    public C5242k8 f31364d;

    public C5042c8() {
        m20225a();
    }

    /* renamed from: b */
    public static C5042c8[] m20224b() {
        if (f31360e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31360e == null) {
                        f31360e = new C5042c8[0];
                    }
                } finally {
                }
            }
        }
        return f31360e;
    }

    /* renamed from: a */
    public final C5042c8 m20225a() {
        this.f31361a = null;
        this.f31362b = null;
        this.f31363c = null;
        this.f31364d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5267l8 c5267l8 = this.f31361a;
        if (c5267l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5267l8);
        }
        C5317n8 c5317n8 = this.f31362b;
        if (c5317n8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5317n8);
        }
        C5092e8 c5092e8 = this.f31363c;
        if (c5092e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5092e8);
        }
        C5242k8 c5242k8 = this.f31364d;
        return c5242k8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c5242k8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5267l8 c5267l8 = this.f31361a;
        if (c5267l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5267l8);
        }
        C5317n8 c5317n8 = this.f31362b;
        if (c5317n8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5317n8);
        }
        C5092e8 c5092e8 = this.f31363c;
        if (c5092e8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5092e8);
        }
        C5242k8 c5242k8 = this.f31364d;
        if (c5242k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5242k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5042c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f31361a == null) {
                    this.f31361a = new C5267l8();
                }
                codedInputByteBufferNano.readMessage(this.f31361a);
            } else if (tag == 18) {
                if (this.f31362b == null) {
                    this.f31362b = new C5317n8();
                }
                codedInputByteBufferNano.readMessage(this.f31362b);
            } else if (tag == 26) {
                if (this.f31363c == null) {
                    this.f31363c = new C5092e8();
                }
                codedInputByteBufferNano.readMessage(this.f31363c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31364d == null) {
                    this.f31364d = new C5242k8();
                }
                codedInputByteBufferNano.readMessage(this.f31364d);
            }
        }
    }

    /* renamed from: b */
    public static C5042c8 m20223b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5042c8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5042c8 m20222a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5042c8) MessageNano.mergeFrom(new C5042c8(), bArr);
    }
}

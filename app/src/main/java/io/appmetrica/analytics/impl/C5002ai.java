package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ai */
/* loaded from: classes2.dex */
public final class C5002ai extends MessageNano {

    /* renamed from: d */
    public static volatile C5002ai[] f31262d;

    /* renamed from: a */
    public boolean f31263a;

    /* renamed from: b */
    public C4977Zh f31264b;

    /* renamed from: c */
    public C4953Yh f31265c;

    public C5002ai() {
        m20127a();
    }

    /* renamed from: b */
    public static C5002ai[] m20126b() {
        if (f31262d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31262d == null) {
                        f31262d = new C5002ai[0];
                    }
                } finally {
                }
            }
        }
        return f31262d;
    }

    /* renamed from: a */
    public final C5002ai m20127a() {
        this.f31263a = false;
        this.f31264b = null;
        this.f31265c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z = this.f31263a;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        C4977Zh c4977Zh = this.f31264b;
        if (c4977Zh != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4977Zh);
        }
        C4953Yh c4953Yh = this.f31265c;
        return c4953Yh != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c4953Yh) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f31263a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        C4977Zh c4977Zh = this.f31264b;
        if (c4977Zh != null) {
            codedOutputByteBufferNano.writeMessage(2, c4977Zh);
        }
        C4953Yh c4953Yh = this.f31265c;
        if (c4953Yh != null) {
            codedOutputByteBufferNano.writeMessage(3, c4953Yh);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5002ai mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31263a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f31264b == null) {
                    this.f31264b = new C4977Zh();
                }
                codedInputByteBufferNano.readMessage(this.f31264b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f31265c == null) {
                    this.f31265c = new C4953Yh();
                }
                codedInputByteBufferNano.readMessage(this.f31265c);
            }
        }
    }

    /* renamed from: b */
    public static C5002ai m20125b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5002ai().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5002ai m20124a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5002ai) MessageNano.mergeFrom(new C5002ai(), bArr);
    }
}

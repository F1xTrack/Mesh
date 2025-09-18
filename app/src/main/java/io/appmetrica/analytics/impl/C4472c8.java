package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4472c8 extends MessageNano {
    public static volatile C4472c8[] e;
    public C4689l8 a;
    public C4737n8 b;
    public C4522e8 c;
    public C4665k8 d;

    public C4472c8() {
        a();
    }

    public static C4472c8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C4472c8[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C4472c8 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4689l8 c4689l8 = this.a;
        if (c4689l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4689l8);
        }
        C4737n8 c4737n8 = this.b;
        if (c4737n8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4737n8);
        }
        C4522e8 c4522e8 = this.c;
        if (c4522e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c4522e8);
        }
        C4665k8 c4665k8 = this.d;
        return c4665k8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c4665k8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4689l8 c4689l8 = this.a;
        if (c4689l8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4689l8);
        }
        C4737n8 c4737n8 = this.b;
        if (c4737n8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4737n8);
        }
        C4522e8 c4522e8 = this.c;
        if (c4522e8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c4522e8);
        }
        C4665k8 c4665k8 = this.d;
        if (c4665k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c4665k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4472c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.a == null) {
                    this.a = new C4689l8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new C4737n8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag == 26) {
                if (this.c == null) {
                    this.c = new C4522e8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.d == null) {
                    this.d = new C4665k8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
    }

    public static C4472c8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4472c8().mergeFrom(codedInputByteBufferNano);
    }

    public static C4472c8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4472c8) MessageNano.mergeFrom(new C4472c8(), bArr);
    }
}

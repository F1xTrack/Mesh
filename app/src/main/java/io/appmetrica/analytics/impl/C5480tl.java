package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tl */
/* loaded from: classes2.dex */
public final class C5480tl extends MessageNano {

    /* renamed from: g */
    public static volatile C5480tl[] f32648g;

    /* renamed from: a */
    public boolean f32649a;

    /* renamed from: b */
    public boolean f32650b;

    /* renamed from: c */
    public boolean f32651c;

    /* renamed from: d */
    public boolean f32652d;

    /* renamed from: e */
    public boolean f32653e;

    /* renamed from: f */
    public int f32654f;

    public C5480tl() {
        m21090a();
    }

    /* renamed from: b */
    public static C5480tl[] m21089b() {
        if (f32648g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32648g == null) {
                        f32648g = new C5480tl[0];
                    }
                } finally {
                }
            }
        }
        return f32648g;
    }

    /* renamed from: a */
    public final C5480tl m21090a() {
        this.f32649a = false;
        this.f32650b = false;
        this.f32651c = false;
        this.f32652d = false;
        this.f32653e = false;
        this.f32654f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f32652d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f32651c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f32650b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f32649a) + super.computeSerializedSize();
        boolean z = this.f32653e;
        if (z) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i = this.f32654f;
        return i != -1 ? iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i) : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f32649a);
        codedOutputByteBufferNano.writeBool(2, this.f32650b);
        codedOutputByteBufferNano.writeBool(3, this.f32651c);
        codedOutputByteBufferNano.writeBool(4, this.f32652d);
        boolean z = this.f32653e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i = this.f32654f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5480tl m21088b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5480tl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5480tl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f32649a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f32650b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f32651c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f32652d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f32653e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f32654f = int32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C5480tl m21087a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5480tl) MessageNano.mergeFrom(new C5480tl(), bArr);
    }
}

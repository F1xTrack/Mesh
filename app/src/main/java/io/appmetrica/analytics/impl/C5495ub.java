package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ub */
/* loaded from: classes2.dex */
public final class C5495ub extends MessageNano {

    /* renamed from: f */
    public static volatile C5495ub[] f32682f;

    /* renamed from: a */
    public String f32683a;

    /* renamed from: b */
    public String f32684b;

    /* renamed from: c */
    public boolean f32685c;

    /* renamed from: d */
    public String f32686d;

    /* renamed from: e */
    public String f32687e;

    public C5495ub() {
        m21126a();
    }

    /* renamed from: b */
    public static C5495ub[] m21125b() {
        if (f32682f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32682f == null) {
                        f32682f = new C5495ub[0];
                    }
                } finally {
                }
            }
        }
        return f32682f;
    }

    /* renamed from: a */
    public final C5495ub m21126a() {
        this.f32683a = "";
        this.f32684b = "";
        this.f32685c = false;
        this.f32686d = "";
        this.f32687e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f32683a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f32683a);
        }
        if (!this.f32684b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f32684b);
        }
        boolean z = this.f32685c;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f32686d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f32686d);
        }
        return !this.f32687e.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f32687e) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32683a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32683a);
        }
        if (!this.f32684b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f32684b);
        }
        boolean z = this.f32685c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f32686d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f32686d);
        }
        if (!this.f32687e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f32687e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5495ub m21124b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5495ub().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5495ub mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32683a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f32684b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f32685c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f32686d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32687e = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C5495ub m21123a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5495ub) MessageNano.mergeFrom(new C5495ub(), bArr);
    }
}

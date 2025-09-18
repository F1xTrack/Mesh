package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6 */
/* loaded from: classes2.dex */
public final class C5065d6 extends MessageNano {

    /* renamed from: g */
    public static volatile C5065d6[] f31463g;

    /* renamed from: a */
    public String f31464a;

    /* renamed from: b */
    public String f31465b;

    /* renamed from: c */
    public int f31466c;

    /* renamed from: d */
    public String f31467d;

    /* renamed from: e */
    public boolean f31468e;

    /* renamed from: f */
    public int f31469f;

    public C5065d6() {
        m20266a();
    }

    /* renamed from: b */
    public static C5065d6[] m20265b() {
        if (f31463g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31463g == null) {
                        f31463g = new C5065d6[0];
                    }
                } finally {
                }
            }
        }
        return f31463g;
    }

    /* renamed from: a */
    public final C5065d6 m20266a() {
        this.f31464a = "";
        this.f31465b = "";
        this.f31466c = -1;
        this.f31467d = "";
        this.f31468e = false;
        this.f31469f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f31464a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f31464a);
        }
        if (!this.f31465b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f31465b);
        }
        int i = this.f31466c;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f31467d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f31467d);
        }
        boolean z = this.f31468e;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f31469f;
        return i2 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f31464a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f31464a);
        }
        if (!this.f31465b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f31465b);
        }
        int i = this.f31466c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f31467d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f31467d);
        }
        boolean z = this.f31468e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f31469f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5065d6 m20264b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5065d6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5065d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31464a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f31465b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f31466c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f31467d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f31468e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f31469f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    /* renamed from: a */
    public static C5065d6 m20263a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5065d6) MessageNano.mergeFrom(new C5065d6(), bArr);
    }
}

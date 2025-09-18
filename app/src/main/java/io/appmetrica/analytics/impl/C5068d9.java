package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d9 */
/* loaded from: classes2.dex */
public final class C5068d9 extends MessageNano {

    /* renamed from: d */
    public static final int f31473d = 0;

    /* renamed from: e */
    public static final int f31474e = 1;

    /* renamed from: f */
    public static final int f31475f = 2;

    /* renamed from: g */
    public static volatile C5068d9[] f31476g;

    /* renamed from: a */
    public C5143g9 f31477a;

    /* renamed from: b */
    public String f31478b;

    /* renamed from: c */
    public int f31479c;

    public C5068d9() {
        m20278a();
    }

    /* renamed from: b */
    public static C5068d9[] m20277b() {
        if (f31476g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31476g == null) {
                        f31476g = new C5068d9[0];
                    }
                } finally {
                }
            }
        }
        return f31476g;
    }

    /* renamed from: a */
    public final C5068d9 m20278a() {
        this.f31477a = null;
        this.f31478b = "";
        this.f31479c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C5143g9 c5143g9 = this.f31477a;
        if (c5143g9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5143g9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f31478b) + iComputeSerializedSize;
        int i = this.f31479c;
        return i != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i) : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5143g9 c5143g9 = this.f31477a;
        if (c5143g9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5143g9);
        }
        codedOutputByteBufferNano.writeString(2, this.f31478b);
        int i = this.f31479c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5068d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f31477a == null) {
                    this.f31477a = new C5143g9();
                }
                codedInputByteBufferNano.readMessage(this.f31477a);
            } else if (tag == 18) {
                this.f31478b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f31479c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C5068d9 m20276b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5068d9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5068d9 m20275a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5068d9) MessageNano.mergeFrom(new C5068d9(), bArr);
    }
}

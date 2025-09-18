package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ce */
/* loaded from: classes2.dex */
public final class C4421Ce extends MessageNano {

    /* renamed from: f */
    public static volatile C4421Ce[] f29956f;

    /* renamed from: a */
    public String f29957a;

    /* renamed from: b */
    public String f29958b;

    /* renamed from: c */
    public boolean f29959c;

    /* renamed from: d */
    public boolean f29960d;

    /* renamed from: e */
    public int f29961e;

    public C4421Ce() {
        m19275a();
    }

    /* renamed from: b */
    public static C4421Ce[] m19274b() {
        if (f29956f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f29956f == null) {
                        f29956f = new C4421Ce[0];
                    }
                } finally {
                }
            }
        }
        return f29956f;
    }

    /* renamed from: a */
    public final C4421Ce m19275a() {
        this.f29957a = "";
        this.f29958b = "";
        this.f29959c = false;
        this.f29960d = false;
        this.f29961e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f29957a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f29957a);
        }
        if (!this.f29958b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f29958b);
        }
        boolean z = this.f29959c;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z2 = this.f29960d;
        if (z2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f29961e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f29957a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f29957a);
        }
        if (!this.f29958b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f29958b);
        }
        boolean z = this.f29959c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z2 = this.f29960d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f29961e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C4421Ce m19273b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4421Ce().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C4421Ce mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f29957a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f29958b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f29959c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f29960d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f29961e = int32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C4421Ce m19272a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4421Ce) MessageNano.mergeFrom(new C4421Ce(), bArr);
    }
}

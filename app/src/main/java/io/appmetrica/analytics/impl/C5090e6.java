package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e6 */
/* loaded from: classes2.dex */
public final class C5090e6 extends MessageNano {

    /* renamed from: g */
    public static volatile C5090e6[] f31530g;

    /* renamed from: a */
    public String f31531a;

    /* renamed from: b */
    public int f31532b;

    /* renamed from: c */
    public long f31533c;

    /* renamed from: d */
    public String f31534d;

    /* renamed from: e */
    public int f31535e;

    /* renamed from: f */
    public C5065d6[] f31536f;

    public C5090e6() {
        m20306a();
    }

    /* renamed from: b */
    public static C5090e6[] m20305b() {
        if (f31530g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31530g == null) {
                        f31530g = new C5090e6[0];
                    }
                } finally {
                }
            }
        }
        return f31530g;
    }

    /* renamed from: a */
    public final C5090e6 m20306a() {
        this.f31531a = "";
        this.f31532b = 0;
        this.f31533c = 0L;
        this.f31534d = "";
        this.f31535e = 0;
        this.f31536f = C5065d6.m20265b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f31533c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f31532b) + CodedOutputByteBufferNano.computeStringSize(1, this.f31531a) + super.computeSerializedSize();
        if (!this.f31534d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f31534d);
        }
        int i = this.f31535e;
        if (i != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C5065d6[] c5065d6Arr = this.f31536f;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31536f;
                if (i2 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i2];
                if (c5065d6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c5065d6) + iComputeSInt64Size;
                }
                i2++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f31531a);
        codedOutputByteBufferNano.writeSInt32(2, this.f31532b);
        codedOutputByteBufferNano.writeSInt64(3, this.f31533c);
        if (!this.f31534d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f31534d);
        }
        int i = this.f31535e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C5065d6[] c5065d6Arr = this.f31536f;
        if (c5065d6Arr != null && c5065d6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5065d6[] c5065d6Arr2 = this.f31536f;
                if (i2 >= c5065d6Arr2.length) {
                    break;
                }
                C5065d6 c5065d6 = c5065d6Arr2[i2];
                if (c5065d6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c5065d6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5090e6 m20304b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5090e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5090e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f31531a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f31532b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f31533c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f31534d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f31535e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C5065d6[] c5065d6Arr = this.f31536f;
                int length = c5065d6Arr == null ? 0 : c5065d6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5065d6[] c5065d6Arr2 = new C5065d6[i];
                if (length != 0) {
                    System.arraycopy(c5065d6Arr, 0, c5065d6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5065d6 c5065d6 = new C5065d6();
                    c5065d6Arr2[length] = c5065d6;
                    codedInputByteBufferNano.readMessage(c5065d6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5065d6 c5065d62 = new C5065d6();
                c5065d6Arr2[length] = c5065d62;
                codedInputByteBufferNano.readMessage(c5065d62);
                this.f31536f = c5065d6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C5090e6 m20303a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5090e6) MessageNano.mergeFrom(new C5090e6(), bArr);
    }
}

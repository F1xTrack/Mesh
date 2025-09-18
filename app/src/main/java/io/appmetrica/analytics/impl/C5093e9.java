package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e9 */
/* loaded from: classes2.dex */
public final class C5093e9 extends MessageNano {

    /* renamed from: d */
    public static final int f31558d = 0;

    /* renamed from: e */
    public static final int f31559e = 1;

    /* renamed from: f */
    public static final int f31560f = 2;

    /* renamed from: g */
    public static final int f31561g = 3;

    /* renamed from: h */
    public static final int f31562h = 4;

    /* renamed from: i */
    public static final int f31563i = 5;

    /* renamed from: j */
    public static final int f31564j = 6;

    /* renamed from: k */
    public static final int f31565k = 7;

    /* renamed from: l */
    public static final int f31566l = 8;

    /* renamed from: m */
    public static final int f31567m = 9;

    /* renamed from: n */
    public static final int f31568n = 10;

    /* renamed from: o */
    public static final int f31569o = 11;

    /* renamed from: p */
    public static final int f31570p = 12;

    /* renamed from: q */
    public static volatile C5093e9[] f31571q;

    /* renamed from: a */
    public long f31572a;

    /* renamed from: b */
    public C5068d9 f31573b;

    /* renamed from: c */
    public C5043c9[] f31574c;

    public C5093e9() {
        m20332a();
    }

    /* renamed from: b */
    public static C5093e9[] m20331b() {
        if (f31571q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31571q == null) {
                        f31571q = new C5093e9[0];
                    }
                } finally {
                }
            }
        }
        return f31571q;
    }

    /* renamed from: a */
    public final C5093e9 m20332a() {
        this.f31572a = 0L;
        this.f31573b = null;
        this.f31574c = C5043c9.m20229b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f31572a) + super.computeSerializedSize();
        C5068d9 c5068d9 = this.f31573b;
        if (c5068d9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5068d9);
        }
        C5043c9[] c5043c9Arr = this.f31574c;
        if (c5043c9Arr != null && c5043c9Arr.length > 0) {
            int i = 0;
            while (true) {
                C5043c9[] c5043c9Arr2 = this.f31574c;
                if (i >= c5043c9Arr2.length) {
                    break;
                }
                C5043c9 c5043c9 = c5043c9Arr2[i];
                if (c5043c9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5043c9) + iComputeUInt64Size;
                }
                i++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f31572a);
        C5068d9 c5068d9 = this.f31573b;
        if (c5068d9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5068d9);
        }
        C5043c9[] c5043c9Arr = this.f31574c;
        if (c5043c9Arr != null && c5043c9Arr.length > 0) {
            int i = 0;
            while (true) {
                C5043c9[] c5043c9Arr2 = this.f31574c;
                if (i >= c5043c9Arr2.length) {
                    break;
                }
                C5043c9 c5043c9 = c5043c9Arr2[i];
                if (c5043c9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5043c9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5093e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f31572a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f31573b == null) {
                    this.f31573b = new C5068d9();
                }
                codedInputByteBufferNano.readMessage(this.f31573b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5043c9[] c5043c9Arr = this.f31574c;
                int length = c5043c9Arr == null ? 0 : c5043c9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5043c9[] c5043c9Arr2 = new C5043c9[i];
                if (length != 0) {
                    System.arraycopy(c5043c9Arr, 0, c5043c9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5043c9 c5043c9 = new C5043c9();
                    c5043c9Arr2[length] = c5043c9;
                    codedInputByteBufferNano.readMessage(c5043c9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5043c9 c5043c92 = new C5043c9();
                c5043c9Arr2[length] = c5043c92;
                codedInputByteBufferNano.readMessage(c5043c92);
                this.f31574c = c5043c9Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C5093e9 m20330b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5093e9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5093e9 m20329a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5093e9) MessageNano.mergeFrom(new C5093e9(), bArr);
    }
}

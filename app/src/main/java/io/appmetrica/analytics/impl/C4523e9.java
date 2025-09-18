package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4523e9 extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile C4523e9[] q;
    public long a;
    public C4498d9 b;
    public C4473c9[] c;

    public C4523e9() {
        a();
    }

    public static C4523e9[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C4523e9[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final C4523e9 a() {
        this.a = 0L;
        this.b = null;
        this.c = C4473c9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C4498d9 c4498d9 = this.b;
        if (c4498d9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c4498d9);
        }
        C4473c9[] c4473c9Arr = this.c;
        if (c4473c9Arr != null && c4473c9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4473c9[] c4473c9Arr2 = this.c;
                if (i2 >= c4473c9Arr2.length) {
                    break;
                }
                C4473c9 c4473c9 = c4473c9Arr2[i2];
                if (c4473c9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c4473c9) + iComputeUInt64Size;
                }
                i2++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        C4498d9 c4498d9 = this.b;
        if (c4498d9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4498d9);
        }
        C4473c9[] c4473c9Arr = this.c;
        if (c4473c9Arr != null && c4473c9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4473c9[] c4473c9Arr2 = this.c;
                if (i2 >= c4473c9Arr2.length) {
                    break;
                }
                C4473c9 c4473c9 = c4473c9Arr2[i2];
                if (c4473c9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4473c9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4523e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.b == null) {
                    this.b = new C4498d9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4473c9[] c4473c9Arr = this.c;
                int length = c4473c9Arr == null ? 0 : c4473c9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C4473c9[] c4473c9Arr2 = new C4473c9[i2];
                if (length != 0) {
                    System.arraycopy(c4473c9Arr, 0, c4473c9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C4473c9 c4473c9 = new C4473c9();
                    c4473c9Arr2[length] = c4473c9;
                    codedInputByteBufferNano.readMessage(c4473c9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4473c9 c4473c92 = new C4473c9();
                c4473c9Arr2[length] = c4473c92;
                codedInputByteBufferNano.readMessage(c4473c92);
                this.c = c4473c9Arr2;
            }
        }
    }

    public static C4523e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4523e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C4523e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4523e9) MessageNano.mergeFrom(new C4523e9(), bArr);
    }
}

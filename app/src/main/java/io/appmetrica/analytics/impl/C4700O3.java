package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.O3 */
/* loaded from: classes2.dex */
public final class C4700O3 extends MessageNano {

    /* renamed from: c */
    public static final int f30540c = 0;

    /* renamed from: d */
    public static final int f30541d = 1;

    /* renamed from: e */
    public static final int f30542e = 2;

    /* renamed from: f */
    public static final int f30543f = 3;

    /* renamed from: g */
    public static volatile C4700O3[] f30544g;

    /* renamed from: a */
    public C4628L3 f30545a;

    /* renamed from: b */
    public C4628L3[] f30546b;

    public C4700O3() {
        m19678a();
    }

    /* renamed from: b */
    public static C4700O3[] m19677b() {
        if (f30544g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f30544g == null) {
                        f30544g = new C4700O3[0];
                    }
                } finally {
                }
            }
        }
        return f30544g;
    }

    /* renamed from: a */
    public final C4700O3 m19678a() {
        this.f30545a = null;
        this.f30546b = C4628L3.m19565b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C4628L3 c4628l3 = this.f30545a;
        if (c4628l3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c4628l3);
        }
        C4628L3[] c4628l3Arr = this.f30546b;
        if (c4628l3Arr != null && c4628l3Arr.length > 0) {
            int i = 0;
            while (true) {
                C4628L3[] c4628l3Arr2 = this.f30546b;
                if (i >= c4628l3Arr2.length) {
                    break;
                }
                C4628L3 c4628l32 = c4628l3Arr2[i];
                if (c4628l32 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c4628l32) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4628L3 c4628l3 = this.f30545a;
        if (c4628l3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c4628l3);
        }
        C4628L3[] c4628l3Arr = this.f30546b;
        if (c4628l3Arr != null && c4628l3Arr.length > 0) {
            int i = 0;
            while (true) {
                C4628L3[] c4628l3Arr2 = this.f30546b;
                if (i >= c4628l3Arr2.length) {
                    break;
                }
                C4628L3 c4628l32 = c4628l3Arr2[i];
                if (c4628l32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c4628l32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4700O3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f30545a == null) {
                    this.f30545a = new C4628L3();
                }
                codedInputByteBufferNano.readMessage(this.f30545a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C4628L3[] c4628l3Arr = this.f30546b;
                int length = c4628l3Arr == null ? 0 : c4628l3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4628L3[] c4628l3Arr2 = new C4628L3[i];
                if (length != 0) {
                    System.arraycopy(c4628l3Arr, 0, c4628l3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4628L3 c4628l3 = new C4628L3();
                    c4628l3Arr2[length] = c4628l3;
                    codedInputByteBufferNano.readMessage(c4628l3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4628L3 c4628l32 = new C4628L3();
                c4628l3Arr2[length] = c4628l32;
                codedInputByteBufferNano.readMessage(c4628l32);
                this.f30546b = c4628l3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C4700O3 m19676b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4700O3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C4700O3 m19675a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4700O3) MessageNano.mergeFrom(new C4700O3(), bArr);
    }
}

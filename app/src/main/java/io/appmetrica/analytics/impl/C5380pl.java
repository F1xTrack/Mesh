package io.appmetrica.analytics.impl;

import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pl */
/* loaded from: classes2.dex */
public final class C5380pl extends MessageNano {

    /* renamed from: c */
    public static volatile C5380pl[] f32405c;

    /* renamed from: a */
    public int f32406a;

    /* renamed from: b */
    public int f32407b;

    public C5380pl() {
        m20923a();
    }

    /* renamed from: b */
    public static C5380pl[] m20922b() {
        if (f32405c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32405c == null) {
                        f32405c = new C5380pl[0];
                    }
                } finally {
                }
            }
        }
        return f32405c;
    }

    /* renamed from: a */
    public final C5380pl m20923a() {
        this.f32406a = RemoteMessageConst.DEFAULT_TTL;
        this.f32407b = RemoteMessageConst.DEFAULT_TTL;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f32406a;
        if (i != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        int i2 = this.f32407b;
        return i2 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f32406a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        int i2 = this.f32407b;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C5380pl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f32406a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f32407b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C5380pl m20921b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5380pl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5380pl m20920a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5380pl) MessageNano.mergeFrom(new C5380pl(), bArr);
    }
}

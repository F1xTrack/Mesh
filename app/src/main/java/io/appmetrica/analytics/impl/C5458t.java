package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t */
/* loaded from: classes2.dex */
public final class C5458t extends MessageNano {

    /* renamed from: l */
    public static final int f32587l = 0;

    /* renamed from: m */
    public static final int f32588m = 1;

    /* renamed from: n */
    public static final int f32589n = 2;

    /* renamed from: o */
    public static final int f32590o = 3;

    /* renamed from: p */
    public static final int f32591p = 4;

    /* renamed from: q */
    public static final int f32592q = 5;

    /* renamed from: r */
    public static final int f32593r = 6;

    /* renamed from: s */
    public static volatile C5458t[] f32594s;

    /* renamed from: t */
    public static byte[] f32595t;

    /* renamed from: u */
    public static volatile boolean f32596u;

    /* renamed from: a */
    public byte[] f32597a;

    /* renamed from: b */
    public C5433s f32598b;

    /* renamed from: c */
    public byte[] f32599c;

    /* renamed from: d */
    public int f32600d;

    /* renamed from: e */
    public byte[] f32601e;

    /* renamed from: f */
    public byte[] f32602f;

    /* renamed from: g */
    public byte[] f32603g;

    /* renamed from: h */
    public byte[] f32604h;

    /* renamed from: i */
    public byte[] f32605i;

    /* renamed from: j */
    public byte[] f32606j;

    /* renamed from: k */
    public byte[] f32607k;

    public C5458t() {
        if (!f32596u) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f32596u) {
                        f32595t = InternalNano.bytesDefaultValue("manual");
                        f32596u = true;
                    }
                } finally {
                }
            }
        }
        m21067a();
    }

    /* renamed from: b */
    public static C5458t[] m21066b() {
        if (f32594s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32594s == null) {
                        f32594s = new C5458t[0];
                    }
                } finally {
                }
            }
        }
        return f32594s;
    }

    /* renamed from: a */
    public final C5458t m21067a() {
        this.f32597a = (byte[]) f32595t.clone();
        this.f32598b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f32599c = bArr;
        this.f32600d = 0;
        this.f32601e = bArr;
        this.f32602f = bArr;
        this.f32603g = bArr;
        this.f32604h = bArr;
        this.f32605i = bArr;
        this.f32606j = bArr;
        this.f32607k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f32597a, f32595t)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f32597a);
        }
        C5433s c5433s = this.f32598b;
        if (c5433s != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c5433s);
        }
        byte[] bArr = this.f32599c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f32599c);
        }
        int i = this.f32600d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f32601e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f32601e);
        }
        if (!Arrays.equals(this.f32602f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f32602f);
        }
        if (!Arrays.equals(this.f32603g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f32603g);
        }
        if (!Arrays.equals(this.f32604h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f32604h);
        }
        if (!Arrays.equals(this.f32605i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f32605i);
        }
        if (!Arrays.equals(this.f32606j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f32606j);
        }
        return !Arrays.equals(this.f32607k, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f32607k) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f32597a, f32595t)) {
            codedOutputByteBufferNano.writeBytes(1, this.f32597a);
        }
        C5433s c5433s = this.f32598b;
        if (c5433s != null) {
            codedOutputByteBufferNano.writeMessage(2, c5433s);
        }
        byte[] bArr = this.f32599c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f32599c);
        }
        int i = this.f32600d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f32601e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f32601e);
        }
        if (!Arrays.equals(this.f32602f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f32602f);
        }
        if (!Arrays.equals(this.f32603g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f32603g);
        }
        if (!Arrays.equals(this.f32604h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f32604h);
        }
        if (!Arrays.equals(this.f32605i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f32605i);
        }
        if (!Arrays.equals(this.f32606j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f32606j);
        }
        if (!Arrays.equals(this.f32607k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f32607k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5458t m21065b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5458t().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5458t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f32597a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f32598b == null) {
                        this.f32598b = new C5433s();
                    }
                    codedInputByteBufferNano.readMessage(this.f32598b);
                    break;
                case 26:
                    this.f32599c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f32600d = int32;
                            break;
                    }
                case C5043c9.f31377M /* 42 */:
                    this.f32601e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f32602f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f32603g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f32604h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f32605i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f32606j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f32607k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C5458t m21064a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5458t) MessageNano.mergeFrom(new C5458t(), bArr);
    }
}

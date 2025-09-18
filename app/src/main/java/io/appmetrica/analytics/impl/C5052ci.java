package io.appmetrica.analytics.impl;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ci */
/* loaded from: classes2.dex */
public final class C5052ci extends MessageNano {

    /* renamed from: l */
    public static final int f31415l = 0;

    /* renamed from: m */
    public static final int f31416m = 1;

    /* renamed from: n */
    public static final int f31417n = 2;

    /* renamed from: o */
    public static final int f31418o = 1;

    /* renamed from: p */
    public static final int f31419p = 2;

    /* renamed from: q */
    public static volatile C5052ci[] f31420q;

    /* renamed from: a */
    public int f31421a;

    /* renamed from: b */
    public byte[] f31422b;

    /* renamed from: c */
    public byte[] f31423c;

    /* renamed from: d */
    public byte[] f31424d;

    /* renamed from: e */
    public C4929Xh f31425e;

    /* renamed from: f */
    public long f31426f;

    /* renamed from: g */
    public boolean f31427g;

    /* renamed from: h */
    public int f31428h;

    /* renamed from: i */
    public int f31429i;

    /* renamed from: j */
    public C5027bi f31430j;

    /* renamed from: k */
    public C5002ai f31431k;

    public C5052ci() {
        m20238a();
    }

    /* renamed from: b */
    public static C5052ci[] m20237b() {
        if (f31420q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31420q == null) {
                        f31420q = new C5052ci[0];
                    }
                } finally {
                }
            }
        }
        return f31420q;
    }

    /* renamed from: a */
    public final C5052ci m20238a() {
        this.f31421a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f31422b = bArr;
        this.f31423c = bArr;
        this.f31424d = bArr;
        this.f31425e = null;
        this.f31426f = 0L;
        this.f31427g = false;
        this.f31428h = 0;
        this.f31429i = 1;
        this.f31430j = null;
        this.f31431k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f31421a;
        if (i != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f31422b) + iComputeSerializedSize;
        byte[] bArr = this.f31423c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f31423c);
        }
        if (!Arrays.equals(this.f31424d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f31424d);
        }
        C4929Xh c4929Xh = this.f31425e;
        if (c4929Xh != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, c4929Xh);
        }
        long j = this.f31426f;
        if (j != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z = this.f31427g;
        if (z) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i2 = this.f31428h;
        if (i2 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f31429i;
        if (i3 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        C5027bi c5027bi = this.f31430j;
        if (c5027bi != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, c5027bi);
        }
        C5002ai c5002ai = this.f31431k;
        return c5002ai != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, c5002ai) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f31421a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f31422b);
        byte[] bArr = this.f31423c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f31423c);
        }
        if (!Arrays.equals(this.f31424d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f31424d);
        }
        C4929Xh c4929Xh = this.f31425e;
        if (c4929Xh != null) {
            codedOutputByteBufferNano.writeMessage(6, c4929Xh);
        }
        long j = this.f31426f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z = this.f31427g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i2 = this.f31428h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f31429i;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        C5027bi c5027bi = this.f31430j;
        if (c5027bi != null) {
            codedOutputByteBufferNano.writeMessage(11, c5027bi);
        }
        C5002ai c5002ai = this.f31431k;
        if (c5002ai != null) {
            codedOutputByteBufferNano.writeMessage(12, c5002ai);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C5052ci m20236b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5052ci().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5052ci mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f31421a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f31422b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f31423c = codedInputByteBufferNano.readBytes();
                    break;
                case C5043c9.f31377M /* 42 */:
                    this.f31424d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f31425e == null) {
                        this.f31425e = new C4929Xh();
                    }
                    codedInputByteBufferNano.readMessage(this.f31425e);
                    break;
                case 56:
                    this.f31426f = codedInputByteBufferNano.readInt64();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    this.f31427g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f31428h = int32;
                        break;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 1 && int322 != 2) {
                        break;
                    } else {
                        this.f31429i = int322;
                        break;
                    }
                    break;
                case 90:
                    if (this.f31430j == null) {
                        this.f31430j = new C5027bi();
                    }
                    codedInputByteBufferNano.readMessage(this.f31430j);
                    break;
                case 98:
                    if (this.f31431k == null) {
                        this.f31431k = new C5002ai();
                    }
                    codedInputByteBufferNano.readMessage(this.f31431k);
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
    public static C5052ci m20235a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5052ci) MessageNano.mergeFrom(new C5052ci(), bArr);
    }
}

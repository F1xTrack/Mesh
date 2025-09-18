package io.appmetrica.analytics.impl;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z8 */
/* loaded from: classes2.dex */
public final class C4968Z8 extends MessageNano {

    /* renamed from: n */
    public static volatile C4968Z8[] f31181n;

    /* renamed from: a */
    public String f31182a;

    /* renamed from: b */
    public String f31183b;

    /* renamed from: c */
    public String f31184c;

    /* renamed from: d */
    public int f31185d;

    /* renamed from: e */
    public String f31186e;

    /* renamed from: f */
    public String f31187f;

    /* renamed from: g */
    public boolean f31188g;

    /* renamed from: h */
    public int f31189h;

    /* renamed from: i */
    public String f31190i;

    /* renamed from: j */
    public String f31191j;

    /* renamed from: k */
    public int f31192k;

    /* renamed from: l */
    public C4944Y8[] f31193l;

    /* renamed from: m */
    public String f31194m;

    public C4968Z8() {
        m20079a();
    }

    /* renamed from: b */
    public static C4968Z8[] m20078b() {
        if (f31181n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f31181n == null) {
                        f31181n = new C4968Z8[0];
                    }
                } finally {
                }
            }
        }
        return f31181n;
    }

    /* renamed from: a */
    public final C4968Z8 m20079a() {
        this.f31182a = "";
        this.f31183b = "";
        this.f31184c = "";
        this.f31185d = 0;
        this.f31186e = "";
        this.f31187f = "";
        this.f31188g = false;
        this.f31189h = 0;
        this.f31190i = "";
        this.f31191j = "";
        this.f31192k = 0;
        this.f31193l = C4944Y8.m20028b();
        this.f31194m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f31182a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f31182a);
        }
        if (!this.f31183b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f31183b);
        }
        if (!this.f31184c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f31184c);
        }
        int i = this.f31185d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.f31186e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f31186e);
        }
        if (!this.f31187f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f31187f);
        }
        boolean z = this.f31188g;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i2 = this.f31189h;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i2);
        }
        if (!this.f31190i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f31190i);
        }
        if (!this.f31191j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f31191j);
        }
        int i3 = this.f31192k;
        if (i3 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i3);
        }
        C4944Y8[] c4944y8Arr = this.f31193l;
        if (c4944y8Arr != null && c4944y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C4944Y8[] c4944y8Arr2 = this.f31193l;
                if (i4 >= c4944y8Arr2.length) {
                    break;
                }
                C4944Y8 c4944y8 = c4944y8Arr2[i4];
                if (c4944y8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c4944y8) + iComputeSerializedSize;
                }
                i4++;
            }
        }
        return !this.f31194m.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f31194m) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f31182a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f31182a);
        }
        if (!this.f31183b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f31183b);
        }
        if (!this.f31184c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f31184c);
        }
        int i = this.f31185d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.f31186e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f31186e);
        }
        if (!this.f31187f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f31187f);
        }
        boolean z = this.f31188g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i2 = this.f31189h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i2);
        }
        if (!this.f31190i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f31190i);
        }
        if (!this.f31191j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f31191j);
        }
        int i3 = this.f31192k;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i3);
        }
        C4944Y8[] c4944y8Arr = this.f31193l;
        if (c4944y8Arr != null && c4944y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C4944Y8[] c4944y8Arr2 = this.f31193l;
                if (i4 >= c4944y8Arr2.length) {
                    break;
                }
                C4944Y8 c4944y8 = c4944y8Arr2[i4];
                if (c4944y8 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c4944y8);
                }
                i4++;
            }
        }
        if (!this.f31194m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f31194m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C4968Z8 m20077b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4968Z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4968Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f31182a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f31183b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f31184c = codedInputByteBufferNano.readString();
                    break;
                case C5043c9.f31376L /* 40 */:
                    this.f31185d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f31186e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f31187f = codedInputByteBufferNano.readString();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.f31188g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f31189h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f31190i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f31191j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f31192k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C4944Y8[] c4944y8Arr = this.f31193l;
                    int length = c4944y8Arr == null ? 0 : c4944y8Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4944Y8[] c4944y8Arr2 = new C4944Y8[i];
                    if (length != 0) {
                        System.arraycopy(c4944y8Arr, 0, c4944y8Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4944Y8 c4944y8 = new C4944Y8();
                        c4944y8Arr2[length] = c4944y8;
                        codedInputByteBufferNano.readMessage(c4944y8);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4944Y8 c4944y82 = new C4944Y8();
                    c4944y8Arr2[length] = c4944y82;
                    codedInputByteBufferNano.readMessage(c4944y82);
                    this.f31193l = c4944y8Arr2;
                    break;
                case 194:
                    this.f31194m = codedInputByteBufferNano.readString();
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
    public static C4968Z8 m20076a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4968Z8) MessageNano.mergeFrom(new C4968Z8(), bArr);
    }
}

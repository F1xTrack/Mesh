package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rl */
/* loaded from: classes2.dex */
public final class C5430rl extends MessageNano {

    /* renamed from: c */
    public static volatile C5430rl[] f32520c;

    /* renamed from: a */
    public String f32521a;

    /* renamed from: b */
    public String[] f32522b;

    public C5430rl() {
        m21023a();
    }

    /* renamed from: b */
    public static C5430rl[] m21022b() {
        if (f32520c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f32520c == null) {
                        f32520c = new C5430rl[0];
                    }
                } finally {
                }
            }
        }
        return f32520c;
    }

    /* renamed from: a */
    public final C5430rl m21023a() {
        this.f32521a = "";
        this.f32522b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f32521a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f32521a);
        }
        String[] strArr = this.f32522b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeStringSizeNoTag = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.f32522b;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i2;
            }
            String str = strArr2[i];
            if (str != null) {
                i2++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f32521a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f32521a);
        }
        String[] strArr = this.f32522b;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f32522b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5430rl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f32521a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f32522b;
                int length = strArr == null ? 0 : strArr.length;
                int i = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f32522b = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C5430rl m21021b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5430rl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C5430rl m21020a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5430rl) MessageNano.mergeFrom(new C5430rl(), bArr);
    }
}

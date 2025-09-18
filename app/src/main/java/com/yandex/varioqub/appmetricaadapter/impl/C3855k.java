package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.k */
/* loaded from: classes2.dex */
public final class C3855k extends MessageNano {

    /* renamed from: o */
    public String f25565o = "";

    /* renamed from: p */
    public long[] f25566p = WireFormatNano.EMPTY_LONG_ARRAY;

    public C3855k() {
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25565o.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25565o);
        }
        long[] jArr = this.f25566p;
        if (jArr == null || jArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeInt64SizeNoTag = 0;
        while (true) {
            long[] jArr2 = this.f25566p;
            if (i >= jArr2.length) {
                return iComputeSerializedSize + iComputeInt64SizeNoTag + jArr2.length;
            }
            iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i]);
            i++;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f25565o = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                long[] jArr = this.f25566p;
                int length = jArr == null ? 0 : jArr.length;
                int i = repeatedFieldArrayLength + length;
                long[] jArr2 = new long[i];
                if (length != 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, length);
                }
                while (length < i - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.f25566p = jArr2;
            } else if (tag == 18) {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i2++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                long[] jArr3 = this.f25566p;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i3 = i2 + length2;
                long[] jArr4 = new long[i3];
                if (length2 != 0) {
                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                }
                while (length2 < i3) {
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    length2++;
                }
                this.f25566p = jArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25565o.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25565o);
        }
        long[] jArr = this.f25566p;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f25566p;
                if (i >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;

/* renamed from: com.yandex.varioqub.config.impl.p */
/* loaded from: classes2.dex */
public final class C3876p extends MessageNano {

    /* renamed from: a */
    public String f25633a;

    /* renamed from: b */
    public String f25634b;

    /* renamed from: c */
    public C3874n[] f25635c;

    /* renamed from: d */
    public String f25636d;

    /* renamed from: e */
    public String f25637e;

    /* renamed from: f */
    public String f25638f;

    /* renamed from: g */
    public String f25639g;

    /* renamed from: h */
    public String f25640h;

    /* renamed from: i */
    public String f25641i;

    /* renamed from: j */
    public C3875o[] f25642j;

    /* renamed from: k */
    public String f25643k;

    /* renamed from: l */
    public String f25644l;

    /* renamed from: m */
    public String f25645m;

    /* renamed from: n */
    public String f25646n;

    public C3876p() {
        m17414a();
    }

    /* renamed from: a */
    public final void m17414a() {
        this.f25633a = "";
        this.f25634b = "";
        if (C3874n.f25627c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (C3874n.f25627c == null) {
                        C3874n.f25627c = new C3874n[0];
                    }
                } finally {
                }
            }
        }
        this.f25635c = C3874n.f25627c;
        this.f25636d = "";
        this.f25637e = "";
        this.f25638f = "";
        this.f25639g = "";
        this.f25640h = "";
        this.f25641i = "";
        this.f25642j = C3875o.m17412b();
        this.f25643k = "";
        this.f25644l = "";
        this.f25645m = "";
        this.f25646n = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f25633a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f25633a);
        }
        if (!this.f25634b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f25634b);
        }
        C3874n[] c3874nArr = this.f25635c;
        int i = 0;
        if (c3874nArr != null && c3874nArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3874n[] c3874nArr2 = this.f25635c;
                if (i2 >= c3874nArr2.length) {
                    break;
                }
                C3874n c3874n = c3874nArr2[i2];
                if (c3874n != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c3874n) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        if (!this.f25636d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f25636d);
        }
        if (!this.f25637e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f25637e);
        }
        if (!this.f25638f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f25638f);
        }
        if (!this.f25639g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f25639g);
        }
        if (!this.f25640h.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f25640h);
        }
        if (!this.f25641i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f25641i);
        }
        C3875o[] c3875oArr = this.f25642j;
        if (c3875oArr != null && c3875oArr.length > 0) {
            while (true) {
                C3875o[] c3875oArr2 = this.f25642j;
                if (i >= c3875oArr2.length) {
                    break;
                }
                C3875o c3875o = c3875oArr2[i];
                if (c3875o != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c3875o) + iComputeSerializedSize;
                }
                i++;
            }
        }
        if (!this.f25643k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f25643k);
        }
        if (!this.f25644l.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(12, this.f25644l);
        }
        if (!this.f25645m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f25645m);
        }
        return !this.f25646n.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(14, this.f25646n) : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f25633a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f25634b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    C3874n[] c3874nArr = this.f25635c;
                    int length = c3874nArr == null ? 0 : c3874nArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C3874n[] c3874nArr2 = new C3874n[i];
                    if (length != 0) {
                        System.arraycopy(c3874nArr, 0, c3874nArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C3874n c3874n = new C3874n();
                        c3874nArr2[length] = c3874n;
                        codedInputByteBufferNano.readMessage(c3874n);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C3874n c3874n2 = new C3874n();
                    c3874nArr2[length] = c3874n2;
                    codedInputByteBufferNano.readMessage(c3874n2);
                    this.f25635c = c3874nArr2;
                    break;
                case 34:
                    this.f25636d = codedInputByteBufferNano.readString();
                    break;
                case C5043c9.f31377M /* 42 */:
                    this.f25637e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f25638f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f25639g = codedInputByteBufferNano.readString();
                    break;
                case 66:
                    this.f25640h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.f25641i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C3875o[] c3875oArr = this.f25642j;
                    int length2 = c3875oArr == null ? 0 : c3875oArr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C3875o[] c3875oArr2 = new C3875o[i2];
                    if (length2 != 0) {
                        System.arraycopy(c3875oArr, 0, c3875oArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C3875o c3875o = new C3875o();
                        c3875oArr2[length2] = c3875o;
                        codedInputByteBufferNano.readMessage(c3875o);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C3875o c3875o2 = new C3875o();
                    c3875oArr2[length2] = c3875o2;
                    codedInputByteBufferNano.readMessage(c3875o2);
                    this.f25642j = c3875oArr2;
                    break;
                case 90:
                    this.f25643k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f25644l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.f25645m = codedInputByteBufferNano.readString();
                    break;
                case 114:
                    this.f25646n = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f25633a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f25633a);
        }
        if (!this.f25634b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f25634b);
        }
        C3874n[] c3874nArr = this.f25635c;
        int i = 0;
        if (c3874nArr != null && c3874nArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3874n[] c3874nArr2 = this.f25635c;
                if (i2 >= c3874nArr2.length) {
                    break;
                }
                C3874n c3874n = c3874nArr2[i2];
                if (c3874n != null) {
                    codedOutputByteBufferNano.writeMessage(3, c3874n);
                }
                i2++;
            }
        }
        if (!this.f25636d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f25636d);
        }
        if (!this.f25637e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f25637e);
        }
        if (!this.f25638f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f25638f);
        }
        if (!this.f25639g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f25639g);
        }
        if (!this.f25640h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f25640h);
        }
        if (!this.f25641i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f25641i);
        }
        C3875o[] c3875oArr = this.f25642j;
        if (c3875oArr != null && c3875oArr.length > 0) {
            while (true) {
                C3875o[] c3875oArr2 = this.f25642j;
                if (i >= c3875oArr2.length) {
                    break;
                }
                C3875o c3875o = c3875oArr2[i];
                if (c3875o != null) {
                    codedOutputByteBufferNano.writeMessage(10, c3875o);
                }
                i++;
            }
        }
        if (!this.f25643k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f25643k);
        }
        if (!this.f25644l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f25644l);
        }
        if (!this.f25645m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f25645m);
        }
        if (!this.f25646n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f25646n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

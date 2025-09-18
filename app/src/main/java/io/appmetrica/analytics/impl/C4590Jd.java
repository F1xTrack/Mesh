package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Jd */
/* loaded from: classes2.dex */
public final class C4590Jd implements InterfaceC4967Z7 {

    /* renamed from: a */
    public final C4662Md f30362a;

    /* renamed from: b */
    public final C4360A3 f30363b;

    /* renamed from: c */
    public final C5369pa f30364c;

    /* renamed from: d */
    public final C4950Ye f30365d;

    public C4590Jd() {
        this(new C4662Md(), new C4360A3(), new C5369pa(100), new C4950Ye());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4833Th> fromModel(C4566Id c4566Id) {
        C4833Th c4833ThFromModel;
        C5442s8 c5442s8 = new C5442s8();
        c5442s8.f32547a = c4566Id.f30285a;
        c5442s8.f32552f = new C5167h8();
        C4614Kd c4614Kd = c4566Id.f30286b;
        C5117f8 c5117f8 = new C5117f8();
        c5117f8.f31667a = StringUtils.getUTF8Bytes(c4614Kd.f30400a);
        C4575Im c4575ImMo19520a = this.f30364c.mo19520a(c4614Kd.f30401b);
        c5117f8.f31668b = StringUtils.getUTF8Bytes((String) c4575ImMo19520a.f30323a);
        c5117f8.f31671e = c4614Kd.f30402c.size();
        Map<String, String> map = c4614Kd.f30403d;
        if (map != null) {
            c4833ThFromModel = this.f30362a.fromModel(map);
            c5117f8.f31669c = (C5217j8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        c5442s8.f32552f.f31846a = c5117f8;
        C5412r3 c5412r3 = new C5412r3(C5412r3.m21006b(c4575ImMo19520a, c4833ThFromModel));
        List list = c4614Kd.f30402c;
        ArrayList arrayList = new ArrayList();
        this.f30365d.getClass();
        int iComputeInt32Size = c5442s8.f32547a != new C5442s8().f32547a ? CodedOutputByteBufferNano.computeInt32Size(1, c5442s8.f32547a) : 0;
        C5417r8 c5417r8 = c5442s8.f32548b;
        if (c5417r8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c5417r8);
        }
        C5367p8 c5367p8 = c5442s8.f32549c;
        if (c5367p8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5367p8);
        }
        C5392q8 c5392q8 = c5442s8.f32550d;
        int i = 4;
        if (c5392q8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c5392q8);
        }
        C5017b8 c5017b8 = c5442s8.f32551e;
        if (c5017b8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c5017b8);
        }
        C5167h8 c5167h8 = c5442s8.f32552f;
        if (c5167h8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c5167h8);
        }
        ArrayList arrayList2 = new ArrayList();
        C5442s8 c5442s82 = new C5442s8();
        c5442s82.f32547a = c5442s8.f32547a;
        C5167h8 c5167h82 = new C5167h8();
        c5442s82.f32552f = c5167h82;
        c5167h82.f31846a = new C5117f8();
        C5117f8 c5117f82 = c5442s82.f32552f.f31846a;
        C5117f8 c5117f83 = c5442s8.f32552f.f31846a;
        c5117f82.f31668b = c5117f83.f31668b;
        c5117f82.f31667a = c5117f83.f31667a;
        c5117f82.f31671e = c5117f83.f31671e;
        c5117f82.f31669c = c5117f83.f31669c;
        int i2 = 0;
        C5412r3 c5412r32 = c5412r3;
        int i3 = iComputeInt32Size;
        while (i2 < list.size()) {
            C4385B3 c4385b3 = (C4385B3) list.get(i2);
            C5142g8 c5142g8 = new C5142g8();
            c5142g8.f31751a = i2;
            C4833Th c4833ThFromModel2 = this.f30363b.fromModel(c4385b3);
            c5142g8.f31752b = (C5042c8) c4833ThFromModel2.f30788a;
            c4833ThFromModel2.f30789b.getBytesTruncated();
            C4833Th c4833Th = new C4833Th(c5142g8, c4833ThFromModel2);
            C4950Ye c4950Ye = this.f30365d;
            C5142g8 c5142g82 = (C5142g8) c4833Th.f30788a;
            c4950Ye.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c5142g82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i3 + iComputeRawVarint32Size > 204800) {
                c5442s82.f32552f.f31846a.f31670d = (C5142g8[]) arrayList2.toArray(new C5142g8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C4833Th(c5442s82, c5412r32));
                C5442s8 c5442s83 = new C5442s8();
                c5442s83.f32547a = c5442s8.f32547a;
                C5167h8 c5167h83 = new C5167h8();
                c5442s83.f32552f = c5167h83;
                c5167h83.f31846a = new C5117f8();
                C5117f8 c5117f84 = c5442s83.f32552f.f31846a;
                C5117f8 c5117f85 = c5442s8.f32552f.f31846a;
                c5117f84.f31668b = c5117f85.f31668b;
                c5117f84.f31667a = c5117f85.f31667a;
                c5117f84.f31671e = c5117f85.f31671e;
                c5117f84.f31669c = c5117f85.f31669c;
                c5412r32 = c5412r3;
                i3 = iComputeInt32Size;
                c5442s82 = c5442s83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C5142g8) c4833Th.f30788a);
            c5412r32 = new C5412r3(C5412r3.m21006b(c5412r32, c4833Th.f30789b));
            i3 += iComputeRawVarint32Size;
            i2++;
            i = 4;
        }
        c5442s82.f32552f.f31846a.f31670d = (C5142g8[]) arrayList2.toArray(new C5142g8[arrayList2.size()]);
        arrayList.add(new C4833Th(c5442s82, c5412r32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4590Jd(C4662Md c4662Md, C4360A3 c4360a3, C5369pa c5369pa, C4950Ye c4950Ye) {
        this.f30362a = c4662Md;
        this.f30363b = c4360a3;
        this.f30364c = c5369pa;
        this.f30365d = c4950Ye;
    }

    /* renamed from: a */
    public final C4566Id m19531a(List<C4833Th> list) {
        throw new UnsupportedOperationException();
    }
}

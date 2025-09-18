package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Jd implements Z7 {
    public final Md a;
    public final A3 b;
    public final C4787pa c;
    public final Ye d;

    public Jd() {
        this(new Md(), new A3(), new C4787pa(100), new Ye());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Th> fromModel(Id id) {
        Th thFromModel;
        C4856s8 c4856s8 = new C4856s8();
        c4856s8.a = id.a;
        c4856s8.f = new C4594h8();
        Kd kd = id.b;
        C4546f8 c4546f8 = new C4546f8();
        c4546f8.a = StringUtils.getUTF8Bytes(kd.a);
        Im imA = this.c.a(kd.b);
        c4546f8.b = StringUtils.getUTF8Bytes((String) imA.a);
        c4546f8.e = kd.c.size();
        Map<String, String> map = kd.d;
        if (map != null) {
            thFromModel = this.a.fromModel(map);
            c4546f8.c = (C4641j8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        c4856s8.f.a = c4546f8;
        C4827r3 c4827r3 = new C4827r3(C4827r3.b(imA, thFromModel));
        List list = kd.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int iComputeInt32Size = c4856s8.a != new C4856s8().a ? CodedOutputByteBufferNano.computeInt32Size(1, c4856s8.a) : 0;
        C4832r8 c4832r8 = c4856s8.b;
        if (c4832r8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c4832r8);
        }
        C4785p8 c4785p8 = c4856s8.c;
        if (c4785p8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4785p8);
        }
        C4809q8 c4809q8 = c4856s8.d;
        int i = 4;
        if (c4809q8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c4809q8);
        }
        C4447b8 c4447b8 = c4856s8.e;
        if (c4447b8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c4447b8);
        }
        C4594h8 c4594h8 = c4856s8.f;
        if (c4594h8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4594h8);
        }
        ArrayList arrayList2 = new ArrayList();
        C4856s8 c4856s82 = new C4856s8();
        c4856s82.a = c4856s8.a;
        C4594h8 c4594h82 = new C4594h8();
        c4856s82.f = c4594h82;
        c4594h82.a = new C4546f8();
        C4546f8 c4546f82 = c4856s82.f.a;
        C4546f8 c4546f83 = c4856s8.f.a;
        c4546f82.b = c4546f83.b;
        c4546f82.a = c4546f83.a;
        c4546f82.e = c4546f83.e;
        c4546f82.c = c4546f83.c;
        int i2 = 0;
        C4827r3 c4827r32 = c4827r3;
        int i3 = iComputeInt32Size;
        while (i2 < list.size()) {
            B3 b3 = (B3) list.get(i2);
            C4570g8 c4570g8 = new C4570g8();
            c4570g8.a = i2;
            Th thFromModel2 = this.b.fromModel(b3);
            c4570g8.b = (C4472c8) thFromModel2.a;
            thFromModel2.b.getBytesTruncated();
            Th th = new Th(c4570g8, thFromModel2);
            Ye ye = this.d;
            C4570g8 c4570g82 = (C4570g8) th.a;
            ye.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c4570g82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i3 + iComputeRawVarint32Size > 204800) {
                c4856s82.f.a.d = (C4570g8[]) arrayList2.toArray(new C4570g8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Th(c4856s82, c4827r32));
                C4856s8 c4856s83 = new C4856s8();
                c4856s83.a = c4856s8.a;
                C4594h8 c4594h83 = new C4594h8();
                c4856s83.f = c4594h83;
                c4594h83.a = new C4546f8();
                C4546f8 c4546f84 = c4856s83.f.a;
                C4546f8 c4546f85 = c4856s8.f.a;
                c4546f84.b = c4546f85.b;
                c4546f84.a = c4546f85.a;
                c4546f84.e = c4546f85.e;
                c4546f84.c = c4546f85.c;
                c4827r32 = c4827r3;
                i3 = iComputeInt32Size;
                c4856s82 = c4856s83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C4570g8) th.a);
            c4827r32 = new C4827r3(C4827r3.b(c4827r32, th.b));
            i3 += iComputeRawVarint32Size;
            i2++;
            i = 4;
        }
        c4856s82.f.a.d = (C4570g8[]) arrayList2.toArray(new C4570g8[arrayList2.size()]);
        arrayList.add(new Th(c4856s82, c4827r32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jd(Md md, A3 a3, C4787pa c4787pa, Ye ye) {
        this.a = md;
        this.b = a3;
        this.c = c4787pa;
        this.d = ye;
    }

    public final Id a(List<Th> list) {
        throw new UnsupportedOperationException();
    }
}

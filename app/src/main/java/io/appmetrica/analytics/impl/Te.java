package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Te implements Converter {
    public final Md a;
    public final Ne b;
    public final C3 c;
    public final Xe d;
    public final C4787pa e;
    public final C4787pa f;

    public Te() {
        this(new Md(), new Ne(), new C3(), new Xe(), new C4787pa(100), new C4787pa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Th fromModel(We we) {
        Th thFromModel;
        Th thFromModel2;
        Th thFromModel3;
        Th thFromModel4;
        C4689l8 c4689l8 = new C4689l8();
        Im imA = this.e.a(we.a);
        c4689l8.a = StringUtils.getUTF8Bytes((String) imA.a);
        Im imA2 = this.f.a(we.b);
        c4689l8.b = StringUtils.getUTF8Bytes((String) imA2.a);
        List<String> list = we.c;
        Th thFromModel5 = null;
        if (list != null) {
            thFromModel = this.c.fromModel(list);
            c4689l8.c = (C4497d8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        Map<String, String> map = we.d;
        if (map != null) {
            thFromModel2 = this.a.fromModel(map);
            c4689l8.d = (C4641j8) thFromModel2.a;
        } else {
            thFromModel2 = null;
        }
        Pe pe = we.e;
        if (pe != null) {
            thFromModel3 = this.b.fromModel(pe);
            c4689l8.e = (C4665k8) thFromModel3.a;
        } else {
            thFromModel3 = null;
        }
        Pe pe2 = we.f;
        if (pe2 != null) {
            thFromModel4 = this.b.fromModel(pe2);
            c4689l8.f = (C4665k8) thFromModel4.a;
        } else {
            thFromModel4 = null;
        }
        List<String> list2 = we.g;
        if (list2 != null) {
            thFromModel5 = this.d.fromModel(list2);
            c4689l8.g = (C4713m8[]) thFromModel5.a;
        }
        return new Th(c4689l8, new C4827r3(C4827r3.b(imA, imA2, thFromModel, thFromModel2, thFromModel3, thFromModel4, thFromModel5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Te(Md md, Ne ne, C3 c3, Xe xe, C4787pa c4787pa, C4787pa c4787pa2) {
        this.a = md;
        this.b = ne;
        this.c = c3;
        this.d = xe;
        this.e = c4787pa;
        this.f = c4787pa2;
    }

    public final We a(Th th) {
        throw new UnsupportedOperationException();
    }
}

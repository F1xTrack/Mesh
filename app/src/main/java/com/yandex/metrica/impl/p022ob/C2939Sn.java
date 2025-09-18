package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Sn */
/* loaded from: classes2.dex */
public class C2939Sn extends AbstractC2914Rn {

    /* renamed from: b */
    private final AbstractC2914Rn f22336b;

    public C2939Sn(int i) {
        this(i, null);
    }

    /* renamed from: b */
    public int mo14524b(Object obj) {
        throw null;
    }

    public C2939Sn(int i, AbstractC2914Rn abstractC2914Rn) {
        super(i);
        this.f22336b = abstractC2914Rn;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2914Rn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2890Qn<List<Object>, C2665Hn> mo15090a(List<Object> list) {
        int iMo14524b;
        int i = 0;
        if (list == null || (list.size() <= m15089a() && this.f22336b == null)) {
            iMo14524b = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iMo14524b = 0;
            int i2 = 0;
            for (Object obj : list) {
                if (i2 < m15089a()) {
                    AbstractC2914Rn abstractC2914Rn = this.f22336b;
                    if (abstractC2914Rn != null) {
                        C2890Qn<Object, InterfaceC2615Fn> c2890QnMo15090a = abstractC2914Rn.mo15090a(obj);
                        Object obj2 = c2890QnMo15090a.f22084a;
                        iMo14524b += c2890QnMo15090a.f22085b.mo14051a();
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i++;
                    iMo14524b += mo14524b(obj);
                }
                i2++;
            }
            list = arrayList;
        }
        return new C2890Qn<>(list, new C2665Hn(i, iMo14524b));
    }
}

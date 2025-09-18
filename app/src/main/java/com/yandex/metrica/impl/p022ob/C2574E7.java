package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.E7 */
/* loaded from: classes2.dex */
public class C2574E7 implements InterfaceC3230ea<C3461n7, C2882Qf> {

    /* renamed from: a */
    private final C2499B7 f21076a;

    public C2574E7() {
        this(new C2499B7());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3461n7 mo13846a(C2882Qf c2882Qf) {
        throw new UnsupportedOperationException();
    }

    public C2574E7(C2499B7 c2499b7) {
        this.f21076a = c2499b7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2882Qf mo13847b(C3461n7 c3461n7) {
        C2882Qf c2882Qf = new C2882Qf();
        String strM16478b = c3461n7.m16478b();
        if (strM16478b == null) {
            strM16478b = "";
        }
        c2882Qf.f22014b = strM16478b;
        String strM16479c = c3461n7.m16479c();
        c2882Qf.f22015c = strM16479c != null ? strM16479c : "";
        c2882Qf.f22016d = this.f21076a.mo13847b(c3461n7.m16480d());
        if (c3461n7.m16477a() != null) {
            c2882Qf.f22017e = mo13847b(c3461n7.m16477a());
        }
        List<C3461n7> listM16481e = c3461n7.m16481e();
        int i = 0;
        if (listM16481e == null) {
            c2882Qf.f22018f = new C2882Qf[0];
        } else {
            c2882Qf.f22018f = new C2882Qf[listM16481e.size()];
            Iterator<C3461n7> it = listM16481e.iterator();
            while (it.hasNext()) {
                c2882Qf.f22018f[i] = mo13847b(it.next());
                i++;
            }
        }
        return c2882Qf;
    }
}

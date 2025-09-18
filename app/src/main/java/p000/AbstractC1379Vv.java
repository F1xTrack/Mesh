package p000;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Vv */
/* loaded from: classes.dex */
public abstract class AbstractC1379Vv extends AbstractC6758rg {

    /* renamed from: h */
    public final HashMap f12859h = new HashMap();

    /* renamed from: i */
    public Handler f12860i;

    /* renamed from: j */
    public InterfaceC9648hc1 f12861j;

    @Override // p000.AbstractC6758rg
    /* renamed from: d */
    public final void mo8633d() {
        for (C1316Uv c1316Uv : this.f12859h.values()) {
            c1316Uv.f12198a.m24439c(c1316Uv.f12199b);
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: f */
    public final void mo8634f() {
        for (C1316Uv c1316Uv : this.f12859h.values()) {
            c1316Uv.f12198a.m24440e(c1316Uv.f12199b);
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: j */
    public void mo3163j() {
        Iterator it = this.f12859h.values().iterator();
        while (it.hasNext()) {
            ((C1316Uv) it.next()).f12198a.mo3163j();
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: q */
    public void mo3165q() {
        HashMap map = this.f12859h;
        for (C1316Uv c1316Uv : map.values()) {
            c1316Uv.f12198a.m24443p(c1316Uv.f12199b);
            T71 t71 = c1316Uv.f12200c;
            AbstractC6758rg abstractC6758rg = c1316Uv.f12198a;
            abstractC6758rg.m24445s(t71);
            abstractC6758rg.m24444r(t71);
        }
        map.clear();
    }

    /* renamed from: u */
    public abstract C7604Fp0 mo8635u(Object obj, C7604Fp0 c7604Fp0);

    /* renamed from: y */
    public abstract void mo8638y(Object obj, AbstractC6758rg abstractC6758rg, AbstractC7419Ca1 abstractC7419Ca1);

    /* renamed from: z */
    public final void m8639z(Object obj, AbstractC6758rg abstractC6758rg) {
        HashMap map = this.f12859h;
        YN1.m9278c(!map.containsKey(obj));
        C1253Tv c1253Tv = new InterfaceC7656Gp0() { // from class: Tv

            /* renamed from: b */
            public final /* synthetic */ Object f11597b;

            public /* synthetic */ C1253Tv(Object obj2) {
                obj = obj2;
            }

            @Override // p000.InterfaceC7656Gp0
            /* renamed from: a */
            public final void mo3172a(AbstractC6758rg abstractC6758rg2, AbstractC7419Ca1 abstractC7419Ca1) {
                this.f11596a.mo8638y(obj, abstractC6758rg2, abstractC7419Ca1);
            }
        };
        T71 t71 = new T71();
        t71.f11176d = this;
        t71.f11174b = m24438a(null);
        t71.f11175c = new C0903OL(this.f41800d.f8366c, 0, null);
        t71.f11173a = obj2;
        map.put(obj2, new C1316Uv(abstractC6758rg, c1253Tv, t71));
        Handler handler = this.f12860i;
        handler.getClass();
        abstractC6758rg.getClass();
        C1356VY c1356vy = abstractC6758rg.f41799c;
        c1356vy.getClass();
        C7812Jp0 c7812Jp0 = new C7812Jp0();
        c7812Jp0.f5713a = handler;
        c7812Jp0.f5714b = t71;
        ((CopyOnWriteArrayList) c1356vy.f12613d).add(c7812Jp0);
        Handler handler2 = this.f12860i;
        handler2.getClass();
        C0903OL c0903ol = abstractC6758rg.f41800d;
        c0903ol.getClass();
        C0840NL c0840nl = new C0840NL();
        c0840nl.f7729a = handler2;
        c0840nl.f7730b = t71;
        c0903ol.f8366c.add(c0840nl);
        InterfaceC9648hc1 interfaceC9648hc1 = this.f12861j;
        NB0 nb0 = this.f41803g;
        YN1.m9283h(nb0);
        abstractC6758rg.m24441k(c1253Tv, interfaceC9648hc1, nb0);
        if (this.f41798b.isEmpty()) {
            abstractC6758rg.m24439c(c1253Tv);
        }
    }

    /* renamed from: w */
    public long mo8636w(long j, Object obj) {
        return j;
    }

    /* renamed from: x */
    public int mo8637x(int i, Object obj) {
        return i;
    }
}

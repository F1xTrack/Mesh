package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Vv */
/* loaded from: classes.dex */
public abstract class AbstractC1720Vv extends AbstractC6883rg {
    public final HashMap h = new HashMap();
    public Handler i;
    public InterfaceC4188hc1 j;

    @Override // defpackage.AbstractC6883rg
    public final void d() {
        for (C1642Uv c1642Uv : this.h.values()) {
            c1642Uv.a.c(c1642Uv.b);
        }
    }

    @Override // defpackage.AbstractC6883rg
    public final void f() {
        for (C1642Uv c1642Uv : this.h.values()) {
            c1642Uv.a.e(c1642Uv.b);
        }
    }

    @Override // defpackage.AbstractC6883rg
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((C1642Uv) it.next()).a.j();
        }
    }

    @Override // defpackage.AbstractC6883rg
    public void q() {
        HashMap map = this.h;
        for (C1642Uv c1642Uv : map.values()) {
            c1642Uv.a.p(c1642Uv.b);
            T71 t71 = c1642Uv.c;
            AbstractC6883rg abstractC6883rg = c1642Uv.a;
            abstractC6883rg.s(t71);
            abstractC6883rg.r(t71);
        }
        map.clear();
    }

    public abstract C0456Fp0 u(Object obj, C0456Fp0 c0456Fp0);

    public abstract void y(Object obj, AbstractC6883rg abstractC6883rg, AbstractC0178Ca1 abstractC0178Ca1);

    public final void z(Object obj, AbstractC6883rg abstractC6883rg) {
        HashMap map = this.h;
        YN1.c(!map.containsKey(obj));
        C1564Tv c1564Tv = new InterfaceC0534Gp0() { // from class: Tv
            public final /* synthetic */ Object b;

            public /* synthetic */ C1564Tv(Object obj2) {
                obj = obj2;
            }

            @Override // defpackage.InterfaceC0534Gp0
            public final void a(AbstractC6883rg abstractC6883rg2, AbstractC0178Ca1 abstractC0178Ca1) {
                this.a.y(obj, abstractC6883rg2, abstractC0178Ca1);
            }
        };
        T71 t71 = new T71();
        t71.d = this;
        t71.b = a(null);
        t71.c = new OL(this.d.c, 0, null);
        t71.a = obj2;
        map.put(obj2, new C1642Uv(abstractC6883rg, c1564Tv, t71));
        Handler handler = this.i;
        handler.getClass();
        abstractC6883rg.getClass();
        VY vy = abstractC6883rg.c;
        vy.getClass();
        C0768Jp0 c0768Jp0 = new C0768Jp0();
        c0768Jp0.a = handler;
        c0768Jp0.b = t71;
        ((CopyOnWriteArrayList) vy.d).add(c0768Jp0);
        Handler handler2 = this.i;
        handler2.getClass();
        OL ol = abstractC6883rg.d;
        ol.getClass();
        NL nl = new NL();
        nl.a = handler2;
        nl.b = t71;
        ol.c.add(nl);
        InterfaceC4188hc1 interfaceC4188hc1 = this.j;
        NB0 nb0 = this.g;
        YN1.h(nb0);
        abstractC6883rg.k(c1564Tv, interfaceC4188hc1, nb0);
        if (this.b.isEmpty()) {
            abstractC6883rg.c(c1564Tv);
        }
    }

    public long w(long j, Object obj) {
        return j;
    }

    public int x(int i, Object obj) {
        return i;
    }
}

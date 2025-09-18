package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import p000.AbstractC0705LB;
import p000.AbstractC7167xu;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

/* renamed from: com.yandex.metrica.impl.ob.Og */
/* loaded from: classes2.dex */
public final class C2833Og {

    /* renamed from: a */
    private final Lazy f21871a = AbstractC0705LB.m4915b(new c());

    /* renamed from: b */
    private final Lazy f21872b = AbstractC0705LB.m4915b(new b());

    /* renamed from: c */
    private final Lazy f21873c = AbstractC0705LB.m4915b(new d());

    /* renamed from: d */
    private final List<C2608Fg> f21874d = new ArrayList();

    /* renamed from: e */
    private final C2982Ug f21875e;

    /* renamed from: f */
    private final C3082Yg f21876f;

    /* renamed from: g */
    private final C2683Ig f21877g;

    /* renamed from: h */
    private final C3107Zg f21878h;

    /* renamed from: com.yandex.metrica.impl.ob.Og$a */
    public interface a {
        /* renamed from: a */
        void mo14710a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$b */
    public static final class b extends AbstractC8418Vg0 implements InterfaceC6434mZ {
        public b() {
            super(0);
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return new C2858Pg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$c */
    public static final class c extends AbstractC8418Vg0 implements InterfaceC6434mZ {
        public c() {
            super(0);
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return new C2883Qg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$d */
    public static final class d extends AbstractC8418Vg0 implements InterfaceC6434mZ {
        public d() {
            super(0);
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return new C2907Rg(this);
        }
    }

    public C2833Og(C2982Ug c2982Ug, C3082Yg c3082Yg, C2683Ig c2683Ig, C3107Zg c3107Zg) {
        this.f21875e = c2982Ug;
        this.f21876f = c3082Yg;
        this.f21877g = c2683Ig;
        this.f21878h = c3107Zg;
    }

    /* renamed from: b */
    public static final a m14706b(C2833Og c2833Og) {
        return (a) c2833Og.f21872b.getValue();
    }

    /* renamed from: c */
    public static final a m14707c(C2833Og c2833Og) {
        return (a) c2833Og.f21871a.getValue();
    }

    /* renamed from: a */
    public static final void m14705a(C2833Og c2833Og, C2608Fg c2608Fg, a aVar) {
        c2833Og.f21874d.add(c2608Fg);
        if (c2833Og.f21878h.m15553a(c2608Fg)) {
            c2833Og.f21875e.m15278a(c2608Fg);
        } else {
            aVar.mo14710a();
        }
    }

    /* renamed from: b */
    public final void m14709b() {
        this.f21876f.m15511a((InterfaceC3057Xg) this.f21873c.getValue());
    }

    /* renamed from: a */
    public final void m14703a() {
        List<C2608Fg> list = this.f21874d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f21878h.m15554b((C2608Fg) obj)) {
                arrayList.add(obj);
            }
        }
        this.f21875e.m15278a(this.f21878h.m15552a(AbstractC7167xu.m25997y(arrayList)));
    }
}

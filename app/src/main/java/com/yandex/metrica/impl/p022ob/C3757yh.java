package com.yandex.metrica.impl.p022ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yh */
/* loaded from: classes2.dex */
public class C3757yh {

    /* renamed from: a */
    private C2876Q9 f25331a;

    /* renamed from: b */
    private C2584Eh f25332b;

    /* renamed from: c */
    private C2814Nm f25333c;

    /* renamed from: d */
    private C2634Gh f25334d;

    /* renamed from: e */
    private a f25335e;

    /* renamed from: com.yandex.metrica.impl.ob.yh$a */
    public interface a {
    }

    public C3757yh(C2876Q9 c2876q9, a aVar) {
        this(c2876q9, aVar, new C2814Nm(), new C2634Gh(c2876q9));
    }

    /* renamed from: a */
    public void m17262a(C2584Eh c2584Eh) {
        this.f25331a.m14813a(c2584Eh);
        this.f25332b = c2584Eh;
        this.f25334d.m14202a();
        C2509Bh c2509Bh = (C2509Bh) this.f25335e;
        c2509Bh.f20935a.m14009b();
        c2509Bh.f20935a.f21039h = false;
    }

    public C3757yh(C2876Q9 c2876q9, a aVar, C2814Nm c2814Nm, C2634Gh c2634Gh) {
        this.f25331a = c2876q9;
        this.f25332b = (C2584Eh) c2876q9.m14814b();
        this.f25333c = c2814Nm;
        this.f25334d = c2634Gh;
        this.f25335e = aVar;
    }

    /* renamed from: a */
    public void m17261a() {
        C2584Eh c2584Eh = this.f25332b;
        List<C2659Hh> list = c2584Eh.f21117a;
        String str = c2584Eh.f21118b;
        this.f25333c.getClass();
        C2584Eh c2584Eh2 = new C2584Eh(list, str, System.currentTimeMillis(), true, true);
        this.f25331a.m14813a(c2584Eh2);
        this.f25332b = c2584Eh2;
        C2509Bh c2509Bh = (C2509Bh) this.f25335e;
        c2509Bh.f20935a.m14009b();
        c2509Bh.f20935a.f21039h = false;
    }
}

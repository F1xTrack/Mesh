package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C2662Hk;
import com.yandex.metrica.impl.p022ob.C3012Vl;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.ul */
/* loaded from: classes2.dex */
class C3657ul {

    /* renamed from: a */
    private final C3012Vl.a f24961a;

    /* renamed from: b */
    private final C2762Lk f24962b;

    /* renamed from: c */
    private final C2601F9 f24963c;

    /* renamed from: d */
    private volatile C2688Il f24964d;

    /* renamed from: e */
    private final C3294gm f24965e;

    /* renamed from: f */
    private final C2662Hk.b f24966f;

    /* renamed from: g */
    private final C2687Ik f24967g;

    public C3657ul(C2688Il c2688Il, C2762Lk c2762Lk, C2601F9 c2601f9, C3294gm c3294gm, C2687Ik c2687Ik) {
        this(c2688Il, c2762Lk, c2601f9, new C3012Vl.a(), c3294gm, c2687Ik, new C2662Hk.b());
    }

    /* renamed from: a */
    public void m16937a(C2688Il c2688Il) {
        this.f24964d = c2688Il;
    }

    public C3657ul(C2688Il c2688Il, C2762Lk c2762Lk, C2601F9 c2601f9, C3012Vl.a aVar, C3294gm c3294gm, C2687Ik c2687Ik, C2662Hk.b bVar) {
        this.f24964d = c2688Il;
        this.f24962b = c2762Lk;
        this.f24963c = c2601f9;
        this.f24961a = aVar;
        this.f24965e = c3294gm;
        this.f24967g = c2687Ik;
        this.f24966f = bVar;
    }

    /* renamed from: a */
    public void m16936a(Activity activity, InterfaceC2838Ol interfaceC2838Ol, boolean z) {
        this.f24961a.getClass();
        C3012Vl c3012Vl = new C3012Vl(interfaceC2838Ol, new C2987Ul(z));
        C2688Il c2688Il = this.f24964d;
        if ((!z && !this.f24962b.m14548b().isEmpty()) || activity == null) {
            c3012Vl.onResult(this.f24962b.m14546a());
            return;
        }
        c3012Vl.m15379a(true);
        EnumC3761yl enumC3761ylM14367a = this.f24967g.m14367a(activity, c2688Il);
        if (enumC3761ylM14367a != EnumC3761yl.OK) {
            int iOrdinal = enumC3761ylM14367a.ordinal();
            interfaceC2838Ol.onError(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application" : "feature ui_parsing disabled" : "no ui_parsing_config" : "no ui_access_config");
            return;
        }
        if (!c2688Il.f21450c) {
            interfaceC2838Ol.onError("feature ui_collecting_for_bridge disabled");
            return;
        }
        if (c2688Il.f21454g == null) {
            interfaceC2838Ol.onError("no ui_collecting_for_bridge_config");
            return;
        }
        C3294gm c3294gm = this.f24965e;
        C3164bm c3164bm = c2688Il.f21452e;
        C2662Hk.b bVar = this.f24966f;
        C2762Lk c2762Lk = this.f24962b;
        C2601F9 c2601f9 = this.f24963c;
        bVar.getClass();
        c3294gm.m16014a(activity, 0L, c2688Il, c3164bm, Collections.singletonList(new C2662Hk(c2762Lk, c2601f9, z, c3012Vl, new C2662Hk.a())));
    }
}

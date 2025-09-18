package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.Hk;
import com.yandex.metrica.impl.ob.Vl;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.ul, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3134ul {
    private final Vl.a a;
    private final Lk b;
    private final F9 c;
    private volatile Il d;
    private final C2787gm e;
    private final Hk.b f;
    private final Ik g;

    public C3134ul(Il il, Lk lk, F9 f9, C2787gm c2787gm, Ik ik) {
        this(il, lk, f9, new Vl.a(), c2787gm, ik, new Hk.b());
    }

    public void a(Il il) {
        this.d = il;
    }

    public C3134ul(Il il, Lk lk, F9 f9, Vl.a aVar, C2787gm c2787gm, Ik ik, Hk.b bVar) {
        this.d = il;
        this.b = lk;
        this.c = f9;
        this.a = aVar;
        this.e = c2787gm;
        this.g = ik;
        this.f = bVar;
    }

    public void a(Activity activity, Ol ol, boolean z) {
        this.a.getClass();
        Vl vl = new Vl(ol, new Ul(z));
        Il il = this.d;
        if ((!z && !this.b.b().isEmpty()) || activity == null) {
            vl.onResult(this.b.a());
            return;
        }
        vl.a(true);
        EnumC3239yl enumC3239ylA = this.g.a(activity, il);
        if (enumC3239ylA != EnumC3239yl.OK) {
            int iOrdinal = enumC3239ylA.ordinal();
            ol.onError(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application" : "feature ui_parsing disabled" : "no ui_parsing_config" : "no ui_access_config");
            return;
        }
        if (!il.c) {
            ol.onError("feature ui_collecting_for_bridge disabled");
            return;
        }
        if (il.g == null) {
            ol.onError("no ui_collecting_for_bridge_config");
            return;
        }
        C2787gm c2787gm = this.e;
        C2662bm c2662bm = il.e;
        Hk.b bVar = this.f;
        Lk lk = this.b;
        F9 f9 = this.c;
        bVar.getClass();
        c2787gm.a(activity, 0L, il, c2662bm, Collections.singletonList(new Hk(lk, f9, z, vl, new Hk.a())));
    }
}

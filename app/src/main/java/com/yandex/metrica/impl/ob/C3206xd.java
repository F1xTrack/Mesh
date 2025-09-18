package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3206xd {
    private c a;
    private a b;
    private b c;
    private Context d;
    private Uc e;
    private C3256zd f;
    private Ad g;
    private C3230yc h;
    private final C2753fd i;
    private Fc j;
    private Map<String, C2778gd> k;

    /* renamed from: com.yandex.metrica.impl.ob.xd$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$b */
    public static class b {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$c */
    public static class c {
    }

    public C3206xd(Context context, Uc uc, Ad ad, C3230yc c3230yc, C3007pi c3007pi) {
        this(context, uc, new c(), new C2753fd(c3007pi), new a(), new b(), ad, c3230yc);
    }

    public void a(Location location) {
        String provider = location.getProvider();
        C2778gd c2778gd = this.k.get(provider);
        if (c2778gd == null) {
            if (this.f == null) {
                c cVar = this.a;
                Context context = this.d;
                cVar.getClass();
                this.f = new C3256zd(null, Qa.a(context).f(), new Cc(context), new Nm(), P0.i().d(), P0.i().c());
            }
            if (this.j == null) {
                a aVar = this.b;
                C3256zd c3256zd = this.f;
                C2753fd c2753fd = this.i;
                aVar.getClass();
                this.j = new Fc(c3256zd, c2753fd);
            }
            b bVar = this.c;
            Uc uc = this.e;
            Fc fc = this.j;
            Ad ad = this.g;
            C3230yc c3230yc = this.h;
            bVar.getClass();
            c2778gd = new C2778gd(uc, fc, null, 0L, new R2(), ad, c3230yc);
            this.k.put(provider, c2778gd);
        } else {
            c2778gd.a(this.e);
        }
        c2778gd.a(location);
    }

    public C2753fd b() {
        return this.i;
    }

    public C3206xd(Context context, Uc uc, c cVar, C2753fd c2753fd, a aVar, b bVar, Ad ad, C3230yc c3230yc) {
        this.k = new HashMap();
        this.d = context;
        this.e = uc;
        this.a = cVar;
        this.i = c2753fd;
        this.b = aVar;
        this.c = bVar;
        this.g = ad;
        this.h = c3230yc;
    }

    public Location a() {
        return this.i.a();
    }

    public void a(Uc uc) {
        this.e = uc;
    }

    public void a(Qi qi) {
        if (qi.d() != null) {
            this.i.c(qi.d());
        }
    }
}

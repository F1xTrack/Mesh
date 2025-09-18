package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xd */
/* loaded from: classes2.dex */
class C3727xd {

    /* renamed from: a */
    private c f25237a;

    /* renamed from: b */
    private a f25238b;

    /* renamed from: c */
    private b f25239c;

    /* renamed from: d */
    private Context f25240d;

    /* renamed from: e */
    private C2978Uc f25241e;

    /* renamed from: f */
    private C3779zd f25242f;

    /* renamed from: g */
    private C2480Ad f25243g;

    /* renamed from: h */
    private C3752yc f25244h;

    /* renamed from: i */
    private final C3259fd f25245i;

    /* renamed from: j */
    private C2604Fc f25246j;

    /* renamed from: k */
    private Map<String, C3285gd> f25247k;

    /* renamed from: com.yandex.metrica.impl.ob.xd$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$b */
    public static class b {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$c */
    public static class c {
    }

    public C3727xd(Context context, C2978Uc c2978Uc, C2480Ad c2480Ad, C3752yc c3752yc, C3524pi c3524pi) {
        this(context, c2978Uc, new c(), new C3259fd(c3524pi), new a(), new b(), c2480Ad, c3752yc);
    }

    /* renamed from: a */
    public void m17176a(Location location) {
        String provider = location.getProvider();
        C3285gd c3285gd = this.f25247k.get(provider);
        if (c3285gd == null) {
            if (this.f25242f == null) {
                c cVar = this.f25237a;
                Context context = this.f25240d;
                cVar.getClass();
                this.f25242f = new C3779zd(null, C2877Qa.m14815a(context).m14830f(), new C2529Cc(context), new C2814Nm(), C2842P0.m14728i().m14734d(), C2842P0.m14728i().m14733c());
            }
            if (this.f25246j == null) {
                a aVar = this.f25238b;
                C3779zd c3779zd = this.f25242f;
                C3259fd c3259fd = this.f25245i;
                aVar.getClass();
                this.f25246j = new C2604Fc(c3779zd, c3259fd);
            }
            b bVar = this.f25239c;
            C2978Uc c2978Uc = this.f25241e;
            C2604Fc c2604Fc = this.f25246j;
            C2480Ad c2480Ad = this.f25243g;
            C3752yc c3752yc = this.f25244h;
            bVar.getClass();
            c3285gd = new C3285gd(c2978Uc, c2604Fc, null, 0L, new C2893R2(), c2480Ad, c3752yc);
            this.f25247k.put(provider, c3285gd);
        } else {
            c3285gd.m15995a(this.f25241e);
        }
        c3285gd.m15994a(location);
    }

    /* renamed from: b */
    public C3259fd m17179b() {
        return this.f25245i;
    }

    public C3727xd(Context context, C2978Uc c2978Uc, c cVar, C3259fd c3259fd, a aVar, b bVar, C2480Ad c2480Ad, C3752yc c3752yc) {
        this.f25247k = new HashMap();
        this.f25240d = context;
        this.f25241e = c2978Uc;
        this.f25237a = cVar;
        this.f25245i = c3259fd;
        this.f25238b = aVar;
        this.f25239c = bVar;
        this.f25243g = c2480Ad;
        this.f25244h = c3752yc;
    }

    /* renamed from: a */
    public Location m17175a() {
        return this.f25245i.mo14757a();
    }

    /* renamed from: a */
    public void m17178a(C2978Uc c2978Uc) {
        this.f25241e = c2978Uc;
    }

    /* renamed from: a */
    public void m17177a(C2885Qi c2885Qi) {
        if (c2885Qi.m14878d() != null) {
            this.f25245i.m14806c(c2885Qi.m14878d());
        }
    }
}

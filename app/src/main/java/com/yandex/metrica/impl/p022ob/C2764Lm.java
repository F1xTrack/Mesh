package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Lm */
/* loaded from: classes2.dex */
public class C2764Lm implements InterfaceC3117a1 {

    /* renamed from: a */
    private volatile long f21664a;

    /* renamed from: b */
    private C2676I9 f21665b;

    /* renamed from: c */
    private InterfaceC2839Om f21666c;

    /* renamed from: com.yandex.metrica.impl.ob.Lm$b */
    public static class b {

        /* renamed from: a */
        static C2764Lm f21667a = new C2764Lm();
    }

    public /* synthetic */ C2764Lm(a aVar) {
        this();
    }

    /* renamed from: c */
    public static C2764Lm m14551c() {
        return b.f21667a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3117a1
    /* renamed from: a */
    public synchronized long mo14352a() {
        return this.f21664a;
    }

    /* renamed from: b */
    public synchronized void m14553b() {
        this.f21665b.m14320c(false);
        this.f21665b.m14258c();
    }

    /* renamed from: d */
    public synchronized void m14554d() {
        C2676I9 c2676i9M14750u = C2842P0.m14728i().m14750u();
        C2814Nm c2814Nm = new C2814Nm();
        this.f21665b = c2676i9M14750u;
        this.f21664a = c2676i9M14750u.m14313b(0);
        this.f21666c = c2814Nm;
    }

    /* renamed from: e */
    public synchronized boolean m14555e() {
        return this.f21665b.m14312a(true);
    }

    private C2764Lm() {
    }

    /* renamed from: a */
    public synchronized void m14552a(long j, Long l) {
        try {
            this.f21664a = (j - this.f21666c.mo14674a()) / 1000;
            boolean z = true;
            if (this.f21665b.m14312a(true)) {
                if (l != null) {
                    long jAbs = Math.abs(j - this.f21666c.mo14674a());
                    C2676I9 c2676i9 = this.f21665b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    c2676i9.m14320c(z);
                } else {
                    this.f21665b.m14320c(false);
                }
            }
            this.f21665b.m14337l(this.f21664a);
            this.f21665b.m14258c();
        } catch (Throwable th) {
            throw th;
        }
    }
}

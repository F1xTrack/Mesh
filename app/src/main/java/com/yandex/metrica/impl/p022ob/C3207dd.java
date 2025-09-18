package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2885Qi;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.dd */
/* loaded from: classes2.dex */
public class C3207dd {

    /* renamed from: n */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3207dd f23228n;

    /* renamed from: o */
    public static final long f23229o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p */
    private static final Object f23230p = new Object();

    /* renamed from: q */
    public static final /* synthetic */ int f23231q = 0;

    /* renamed from: c */
    private C2978Uc f23234c;

    /* renamed from: d */
    private C2885Qi f23235d;

    /* renamed from: e */
    private C3649ud f23236e;

    /* renamed from: f */
    private c f23237f;

    /* renamed from: g */
    private Runnable f23238g;

    /* renamed from: h */
    private final C3778zc f23239h;

    /* renamed from: i */
    private final C2500B8 f23240i;

    /* renamed from: j */
    private final C2475A8 f23241j;

    /* renamed from: k */
    private final C3416le f23242k;

    /* renamed from: b */
    private boolean f23233b = false;

    /* renamed from: l */
    private boolean f23243l = false;

    /* renamed from: m */
    private final Object f23244m = new Object();

    /* renamed from: a */
    private final WeakHashMap<Object, Object> f23232a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.dd$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2885Qi f23245a;

        public a(C2885Qi c2885Qi) {
            this.f23245a = c2885Qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3207dd.this.f23236e != null) {
                C3207dd.this.f23236e.m16912a(this.f23245a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2978Uc f23247a;

        public b(C2978Uc c2978Uc) {
            this.f23247a = c2978Uc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3207dd.this.f23236e != null) {
                C3207dd.this.f23236e.m16913a(this.f23247a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$c */
    public static class c {
    }

    public C3207dd(Context context, C3233ed c3233ed, c cVar, C2885Qi c2885Qi) {
        this.f23239h = new C3778zc(context, c3233ed.m15846a(), c3233ed.m15849d());
        this.f23240i = c3233ed.m15848c();
        this.f23241j = c3233ed.m15847b();
        this.f23242k = c3233ed.m15850e();
        this.f23237f = cVar;
        this.f23235d = c2885Qi;
    }

    /* renamed from: b */
    public void m15759b(Object obj) {
        synchronized (this.f23244m) {
            this.f23232a.remove(obj);
            m15752b();
        }
    }

    /* renamed from: a */
    public static C3207dd m15750a(Context context) {
        if (f23228n == null) {
            synchronized (f23230p) {
                try {
                    if (f23228n == null) {
                        Context applicationContext = context.getApplicationContext();
                        f23228n = new C3207dd(applicationContext, new C3233ed(applicationContext), new c(), new C2885Qi.b(applicationContext).m14950a());
                    }
                } finally {
                }
            }
        }
        return f23228n;
    }

    /* renamed from: b */
    private void m15752b() {
        if (this.f23243l) {
            if (!this.f23233b || this.f23232a.isEmpty()) {
                this.f23239h.f25416b.execute(new RunnableC3129ad(this));
                Runnable runnable = this.f23238g;
                if (runnable != null) {
                    this.f23239h.f25416b.m16703a(runnable);
                }
                this.f23243l = false;
                return;
            }
            return;
        }
        if (!this.f23233b || this.f23232a.isEmpty()) {
            return;
        }
        if (this.f23236e == null) {
            c cVar = this.f23237f;
            C3675vd c3675vd = new C3675vd(this.f23239h, this.f23240i, this.f23241j, this.f23235d, this.f23234c);
            cVar.getClass();
            this.f23236e = new C3649ud(c3675vd);
        }
        this.f23239h.f25416b.execute(new RunnableC3155bd(this));
        if (this.f23238g == null) {
            RunnableC3181cd runnableC3181cd = new RunnableC3181cd(this);
            this.f23238g = runnableC3181cd;
            this.f23239h.f25416b.m16704a(runnableC3181cd, f23229o);
        }
        this.f23239h.f25416b.execute(new RunnableC3103Zc(this));
        this.f23243l = true;
    }

    /* renamed from: a */
    public void m15757a(Object obj) {
        synchronized (this.f23244m) {
            this.f23232a.put(obj, null);
            m15752b();
        }
    }

    /* renamed from: a */
    public Location m15754a() {
        C3649ud c3649ud = this.f23236e;
        if (c3649ud == null) {
            return null;
        }
        return c3649ud.m16914b();
    }

    /* renamed from: a */
    public void m15758a(boolean z) {
        synchronized (this.f23244m) {
            try {
                if (this.f23233b != z) {
                    this.f23233b = z;
                    this.f23242k.m16389a(z);
                    this.f23239h.f25417c.m15931a(this.f23242k.m16387a());
                    m15752b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m15753b(C3207dd c3207dd) {
        c3207dd.f23239h.f25416b.m16704a(c3207dd.f23238g, f23229o);
    }

    /* renamed from: a */
    public void m15755a(C2885Qi c2885Qi, C2978Uc c2978Uc) {
        synchronized (this.f23244m) {
            try {
                this.f23235d = c2885Qi;
                this.f23242k.m16388a(c2885Qi);
                this.f23239h.f25417c.m15931a(this.f23242k.m16387a());
                this.f23239h.f25416b.execute(new a(c2885Qi));
                if (!C2968U2.m15245a(this.f23234c, c2978Uc)) {
                    m15756a(c2978Uc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m15756a(C2978Uc c2978Uc) {
        synchronized (this.f23244m) {
            this.f23234c = c2978Uc;
        }
        this.f23239h.f25416b.execute(new b(c2978Uc));
    }
}

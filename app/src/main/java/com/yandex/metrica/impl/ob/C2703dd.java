package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.ob.Qi;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.dd */
/* loaded from: classes2.dex */
public class C2703dd {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2703dd n;
    public static final long o = TimeUnit.MINUTES.toMillis(1);
    private static final Object p = new Object();
    public static final /* synthetic */ int q = 0;
    private Uc c;
    private Qi d;
    private C3126ud e;
    private c f;
    private Runnable g;
    private final C3255zc h;
    private final B8 i;
    private final A8 j;
    private final C2903le k;
    private boolean b = false;
    private boolean l = false;
    private final Object m = new Object();
    private final WeakHashMap<Object, Object> a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.dd$a */
    public class a implements Runnable {
        final /* synthetic */ Qi a;

        public a(Qi qi) {
            this.a = qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2703dd.this.e != null) {
                C2703dd.this.e.a(this.a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$b */
    public class b implements Runnable {
        final /* synthetic */ Uc a;

        public b(Uc uc) {
            this.a = uc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2703dd.this.e != null) {
                C2703dd.this.e.a(this.a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$c */
    public static class c {
    }

    public C2703dd(Context context, C2728ed c2728ed, c cVar, Qi qi) {
        this.h = new C3255zc(context, c2728ed.a(), c2728ed.d());
        this.i = c2728ed.c();
        this.j = c2728ed.b();
        this.k = c2728ed.e();
        this.f = cVar;
        this.d = qi;
    }

    public void b(Object obj) {
        synchronized (this.m) {
            this.a.remove(obj);
            b();
        }
    }

    public static C2703dd a(Context context) {
        if (n == null) {
            synchronized (p) {
                try {
                    if (n == null) {
                        Context applicationContext = context.getApplicationContext();
                        n = new C2703dd(applicationContext, new C2728ed(applicationContext), new c(), new Qi.b(applicationContext).a());
                    }
                } finally {
                }
            }
        }
        return n;
    }

    private void b() {
        if (this.l) {
            if (!this.b || this.a.isEmpty()) {
                this.h.b.execute(new RunnableC2628ad(this));
                Runnable runnable = this.g;
                if (runnable != null) {
                    this.h.b.a(runnable);
                }
                this.l = false;
                return;
            }
            return;
        }
        if (!this.b || this.a.isEmpty()) {
            return;
        }
        if (this.e == null) {
            c cVar = this.f;
            C3151vd c3151vd = new C3151vd(this.h, this.i, this.j, this.d, this.c);
            cVar.getClass();
            this.e = new C3126ud(c3151vd);
        }
        this.h.b.execute(new RunnableC2653bd(this));
        if (this.g == null) {
            RunnableC2678cd runnableC2678cd = new RunnableC2678cd(this);
            this.g = runnableC2678cd;
            this.h.b.a(runnableC2678cd, o);
        }
        this.h.b.execute(new Zc(this));
        this.l = true;
    }

    public void a(Object obj) {
        synchronized (this.m) {
            this.a.put(obj, null);
            b();
        }
    }

    public Location a() {
        C3126ud c3126ud = this.e;
        if (c3126ud == null) {
            return null;
        }
        return c3126ud.b();
    }

    public void a(boolean z) {
        synchronized (this.m) {
            try {
                if (this.b != z) {
                    this.b = z;
                    this.k.a(z);
                    this.h.c.a(this.k.a());
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(C2703dd c2703dd) {
        c2703dd.h.b.a(c2703dd.g, o);
    }

    public void a(Qi qi, Uc uc) {
        synchronized (this.m) {
            try {
                this.d = qi;
                this.k.a(qi);
                this.h.c.a(this.k.a());
                this.h.b.execute(new a(qi));
                if (!U2.a(this.c, uc)) {
                    a(uc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Uc uc) {
        synchronized (this.m) {
            this.c = uc;
        }
        this.h.b.execute(new b(uc));
    }
}

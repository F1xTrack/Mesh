package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.zn */
/* loaded from: classes2.dex */
public class C3789zn {

    /* renamed from: a */
    private final C3763yn f25453a;

    /* renamed from: b */
    private volatile InterfaceExecutorC3607sn f25454b;

    /* renamed from: c */
    private volatile Executor f25455c;

    /* renamed from: d */
    private volatile InterfaceExecutorC3607sn f25456d;

    /* renamed from: e */
    private volatile InterfaceExecutorC3607sn f25457e;

    /* renamed from: f */
    private volatile C3581rn f25458f;

    /* renamed from: g */
    private volatile InterfaceExecutorC3607sn f25459g;

    /* renamed from: h */
    private volatile InterfaceExecutorC3607sn f25460h;

    /* renamed from: i */
    private volatile InterfaceExecutorC3607sn f25461i;

    /* renamed from: j */
    private volatile InterfaceExecutorC3607sn f25462j;

    /* renamed from: k */
    private volatile InterfaceExecutorC3607sn f25463k;

    /* renamed from: l */
    private volatile Executor f25464l;

    public C3789zn() {
        this(new C3763yn());
    }

    /* renamed from: a */
    public InterfaceExecutorC3607sn m17347a() {
        if (this.f25459g == null) {
            synchronized (this) {
                try {
                    if (this.f25459g == null) {
                        this.f25453a.getClass();
                        this.f25459g = new C3581rn("YMM-CSE");
                    }
                } finally {
                }
            }
        }
        return this.f25459g;
    }

    /* renamed from: b */
    public InterfaceExecutorC3607sn m17349b() {
        if (this.f25462j == null) {
            synchronized (this) {
                try {
                    if (this.f25462j == null) {
                        this.f25453a.getClass();
                        this.f25462j = new C3581rn("YMM-DE");
                    }
                } finally {
                }
            }
        }
        return this.f25462j;
    }

    /* renamed from: c */
    public C3581rn m17351c() {
        if (this.f25458f == null) {
            synchronized (this) {
                try {
                    if (this.f25458f == null) {
                        this.f25453a.getClass();
                        this.f25458f = new C3581rn("YMM-UH-1");
                    }
                } finally {
                }
            }
        }
        return this.f25458f;
    }

    /* renamed from: d */
    public InterfaceExecutorC3607sn m17352d() {
        if (this.f25454b == null) {
            synchronized (this) {
                try {
                    if (this.f25454b == null) {
                        this.f25453a.getClass();
                        this.f25454b = new C3581rn("YMM-MC");
                    }
                } finally {
                }
            }
        }
        return this.f25454b;
    }

    /* renamed from: e */
    public InterfaceExecutorC3607sn m17353e() {
        if (this.f25460h == null) {
            synchronized (this) {
                try {
                    if (this.f25460h == null) {
                        this.f25453a.getClass();
                        this.f25460h = new C3581rn("YMM-CTH");
                    }
                } finally {
                }
            }
        }
        return this.f25460h;
    }

    /* renamed from: f */
    public InterfaceExecutorC3607sn m17354f() {
        if (this.f25456d == null) {
            synchronized (this) {
                try {
                    if (this.f25456d == null) {
                        this.f25453a.getClass();
                        this.f25456d = new C3581rn("YMM-MSTE");
                    }
                } finally {
                }
            }
        }
        return this.f25456d;
    }

    /* renamed from: g */
    public InterfaceExecutorC3607sn m17355g() {
        if (this.f25463k == null) {
            synchronized (this) {
                try {
                    if (this.f25463k == null) {
                        this.f25453a.getClass();
                        this.f25463k = new C3581rn("YMM-RTM");
                    }
                } finally {
                }
            }
        }
        return this.f25463k;
    }

    /* renamed from: h */
    public InterfaceExecutorC3607sn m17356h() {
        if (this.f25461i == null) {
            synchronized (this) {
                try {
                    if (this.f25461i == null) {
                        this.f25453a.getClass();
                        this.f25461i = new C3581rn("YMM-SDCT");
                    }
                } finally {
                }
            }
        }
        return this.f25461i;
    }

    /* renamed from: i */
    public Executor m17357i() {
        if (this.f25455c == null) {
            synchronized (this) {
                try {
                    if (this.f25455c == null) {
                        this.f25453a.getClass();
                        this.f25455c = new C2490An();
                    }
                } finally {
                }
            }
        }
        return this.f25455c;
    }

    /* renamed from: j */
    public InterfaceExecutorC3607sn m17358j() {
        if (this.f25457e == null) {
            synchronized (this) {
                try {
                    if (this.f25457e == null) {
                        this.f25453a.getClass();
                        this.f25457e = new C3581rn("YMM-TP");
                    }
                } finally {
                }
            }
        }
        return this.f25457e;
    }

    /* renamed from: k */
    public Executor m17359k() {
        if (this.f25464l == null) {
            synchronized (this) {
                try {
                    if (this.f25464l == null) {
                        C3763yn c3763yn = this.f25453a;
                        c3763yn.getClass();
                        this.f25464l = new ExecutorC3737xn(c3763yn, new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f25464l;
    }

    public C3789zn(C3763yn c3763yn) {
        this.f25453a = c3763yn;
    }

    /* renamed from: a */
    public C3685vn m17348a(Runnable runnable) {
        this.f25453a.getClass();
        return ThreadFactoryC3711wn.m17150a("YMM-HMSR", runnable);
    }

    /* renamed from: b */
    public C3685vn m17350b(Runnable runnable) {
        this.f25453a.getClass();
        return ThreadFactoryC3711wn.m17150a("YMM-IB", runnable);
    }
}

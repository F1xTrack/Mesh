package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.zn */
/* loaded from: classes2.dex */
public class C3266zn {
    private final C3241yn a;
    private volatile InterfaceExecutorC3086sn b;
    private volatile Executor c;
    private volatile InterfaceExecutorC3086sn d;
    private volatile InterfaceExecutorC3086sn e;
    private volatile C3061rn f;
    private volatile InterfaceExecutorC3086sn g;
    private volatile InterfaceExecutorC3086sn h;
    private volatile InterfaceExecutorC3086sn i;
    private volatile InterfaceExecutorC3086sn j;
    private volatile InterfaceExecutorC3086sn k;
    private volatile Executor l;

    public C3266zn() {
        this(new C3241yn());
    }

    public InterfaceExecutorC3086sn a() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.a.getClass();
                        this.g = new C3061rn("YMM-CSE");
                    }
                } finally {
                }
            }
        }
        return this.g;
    }

    public InterfaceExecutorC3086sn b() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        this.a.getClass();
                        this.j = new C3061rn("YMM-DE");
                    }
                } finally {
                }
            }
        }
        return this.j;
    }

    public C3061rn c() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        this.a.getClass();
                        this.f = new C3061rn("YMM-UH-1");
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public InterfaceExecutorC3086sn d() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.a.getClass();
                        this.b = new C3061rn("YMM-MC");
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public InterfaceExecutorC3086sn e() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.a.getClass();
                        this.h = new C3061rn("YMM-CTH");
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public InterfaceExecutorC3086sn f() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.a.getClass();
                        this.d = new C3061rn("YMM-MSTE");
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public InterfaceExecutorC3086sn g() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.a.getClass();
                        this.k = new C3061rn("YMM-RTM");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public InterfaceExecutorC3086sn h() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.a.getClass();
                        this.i = new C3061rn("YMM-SDCT");
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public Executor i() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.a.getClass();
                        this.c = new An();
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public InterfaceExecutorC3086sn j() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.a.getClass();
                        this.e = new C3061rn("YMM-TP");
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public Executor k() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        C3241yn c3241yn = this.a;
                        c3241yn.getClass();
                        this.l = new ExecutorC3216xn(c3241yn, new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public C3266zn(C3241yn c3241yn) {
        this.a = c3241yn;
    }

    public C3166vn a(Runnable runnable) {
        this.a.getClass();
        return ThreadFactoryC3191wn.a("YMM-HMSR", runnable);
    }

    public C3166vn b(Runnable runnable) {
        this.a.getClass();
        return ThreadFactoryC3191wn.a("YMM-IB", runnable);
    }
}

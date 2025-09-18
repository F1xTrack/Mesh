package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4631im implements InterfaceC4939vj {
    public final Ba a;
    public final Object b = new Object();
    public boolean c = false;
    public final Lk d;

    public C4631im(Ba ba, Lk lk) {
        this.a = ba;
        this.d = lk;
    }

    public void a() {
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    e();
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Ba c() {
        return this.a;
    }

    public final Lk d() {
        return this.d;
    }

    public final void e() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final void onCreate() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    this.c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final void onDestroy() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    a();
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

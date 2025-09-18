package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class I implements YC {
    public HashMap a;
    public Object d = null;
    public Throwable e = null;
    public float f = 0.0f;
    public boolean c = false;
    public int b = 1;
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();

    @Override // defpackage.YC
    public synchronized boolean a() {
        return this.d != null;
    }

    public final synchronized Throwable c() {
        return this.e;
    }

    @Override // defpackage.YC
    public boolean close() {
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                Object obj = this.d;
                this.d = null;
                if (obj != null) {
                    b(obj);
                }
                if (!g()) {
                    h();
                }
                synchronized (this) {
                    this.g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized float d() {
        return this.f;
    }

    public final synchronized boolean e() {
        return this.b == 3;
    }

    public final synchronized boolean f() {
        return this.c;
    }

    public final synchronized boolean g() {
        return this.b != 1;
    }

    @Override // defpackage.YC
    public synchronized Object getResult() {
        return this.d;
    }

    public final void h() {
        boolean zE = e();
        boolean zM = m();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new H(this, zE, (InterfaceC4302iD) pair.first, zM));
        }
    }

    public final boolean i(Throwable th, HashMap map) {
        boolean z;
        synchronized (this) {
            if (this.c) {
                z = false;
            } else {
                z = true;
                if (this.b != 1) {
                    z = false;
                } else {
                    this.b = 3;
                    this.e = th;
                    this.a = map;
                }
            }
        }
        if (z) {
            h();
        }
        return z;
    }

    public final boolean j(float f) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.c && this.b == 1 && f >= this.f) {
                this.f = f;
                z = true;
            }
        }
        if (z) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new WZ(this, (InterfaceC4302iD) pair.first, false, 1));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.lang.Object r3, boolean r4, java.util.HashMap r5) {
        /*
            r2 = this;
            r2.a = r5
            r5 = 0
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L40
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L31
            int r0 = r2.b     // Catch: java.lang.Throwable -> L18
            r1 = 1
            if (r0 == r1) goto Le
            goto L31
        Le:
            if (r4 == 0) goto L1a
            r4 = 2
            r2.b = r4     // Catch: java.lang.Throwable -> L18
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f = r4     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L3e
        L1a:
            java.lang.Object r4 = r2.d     // Catch: java.lang.Throwable -> L18
            if (r4 == r3) goto L25
            r2.d = r3     // Catch: java.lang.Throwable -> L22
            r3 = r4
            goto L26
        L22:
            r3 = move-exception
            r5 = r4
            goto L3e
        L25:
            r3 = r5
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L38
            r2.b(r3)
            goto L38
        L2d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L3e
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L37
            r2.b(r3)
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L3d
            r2.h()
        L3d:
            return r1
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L40
        L40:
            r3 = move-exception
            if (r5 == 0) goto L46
            r2.b(r5)
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I.k(java.lang.Object, boolean, java.util.HashMap):boolean");
    }

    public final void l(InterfaceC4302iD interfaceC4302iD, AbstractExecutorService abstractExecutorService) {
        interfaceC4302iD.getClass();
        abstractExecutorService.getClass();
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                boolean z = true;
                if (this.b == 1) {
                    this.g.add(Pair.create(interfaceC4302iD, abstractExecutorService));
                }
                if (!a() && !g() && !m()) {
                    z = false;
                }
                if (z) {
                    abstractExecutorService.execute(new H(this, e(), interfaceC4302iD, m()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I.m():boolean");
    }

    public void b(Object obj) {
    }
}

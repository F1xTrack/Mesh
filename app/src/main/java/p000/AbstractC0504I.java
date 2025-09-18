package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: I */
/* loaded from: classes.dex */
public abstract class AbstractC0504I implements InterfaceC1523YC {

    /* renamed from: a */
    public HashMap f4626a;

    /* renamed from: d */
    public Object f4629d = null;

    /* renamed from: e */
    public Throwable f4630e = null;

    /* renamed from: f */
    public float f4631f = 0.0f;

    /* renamed from: c */
    public boolean f4628c = false;

    /* renamed from: b */
    public int f4627b = 1;

    /* renamed from: g */
    public final ConcurrentLinkedQueue f4632g = new ConcurrentLinkedQueue();

    @Override // p000.InterfaceC1523YC
    /* renamed from: a */
    public synchronized boolean mo3662a() {
        return this.f4629d != null;
    }

    /* renamed from: c */
    public final synchronized Throwable m3664c() {
        return this.f4630e;
    }

    @Override // p000.InterfaceC1523YC
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f4628c) {
                    return false;
                }
                this.f4628c = true;
                Object obj = this.f4629d;
                this.f4629d = null;
                if (obj != null) {
                    mo3663b(obj);
                }
                if (!m3668g()) {
                    m3669h();
                }
                synchronized (this) {
                    this.f4632g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final synchronized float m3665d() {
        return this.f4631f;
    }

    /* renamed from: e */
    public final synchronized boolean m3666e() {
        return this.f4627b == 3;
    }

    /* renamed from: f */
    public final synchronized boolean m3667f() {
        return this.f4628c;
    }

    /* renamed from: g */
    public final synchronized boolean m3668g() {
        return this.f4627b != 1;
    }

    @Override // p000.InterfaceC1523YC
    public synchronized Object getResult() {
        return this.f4629d;
    }

    /* renamed from: h */
    public final void m3669h() {
        boolean zM3666e = m3666e();
        boolean zM3674m = m3674m();
        Iterator it = this.f4632g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new RunnableC0441H(this, zM3666e, (InterfaceC4228iD) pair.first, zM3674m));
        }
    }

    /* renamed from: i */
    public final boolean m3670i(Throwable th, HashMap map) {
        boolean z;
        synchronized (this) {
            if (this.f4628c) {
                z = false;
            } else {
                z = true;
                if (this.f4627b != 1) {
                    z = false;
                } else {
                    this.f4627b = 3;
                    this.f4630e = th;
                    this.f4626a = map;
                }
            }
        }
        if (z) {
            m3669h();
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m3671j(float f) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.f4628c && this.f4627b == 1 && f >= this.f4631f) {
                this.f4631f = f;
                z = true;
            }
        }
        if (z) {
            Iterator it = this.f4632g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new RunnableC1420WZ(this, (InterfaceC4228iD) pair.first, false, 1));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003e). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3672k(java.lang.Object r3, boolean r4, java.util.HashMap r5) {
        /*
            r2 = this;
            r2.f4626a = r5
            r5 = 0
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L40
            boolean r0 = r2.f4628c     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L31
            int r0 = r2.f4627b     // Catch: java.lang.Throwable -> L18
            r1 = 1
            if (r0 == r1) goto Le
            goto L31
        Le:
            if (r4 == 0) goto L1a
            r4 = 2
            r2.f4627b = r4     // Catch: java.lang.Throwable -> L18
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f4631f = r4     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L3e
        L1a:
            java.lang.Object r4 = r2.f4629d     // Catch: java.lang.Throwable -> L18
            if (r4 == r3) goto L25
            r2.f4629d = r3     // Catch: java.lang.Throwable -> L22
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
            r2.mo3663b(r3)
            goto L38
        L2d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L3e
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L37
            r2.mo3663b(r3)
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L3d
            r2.m3669h()
        L3d:
            return r1
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L40
        L40:
            r3 = move-exception
            if (r5 == 0) goto L46
            r2.mo3663b(r5)
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0504I.m3672k(java.lang.Object, boolean, java.util.HashMap):boolean");
    }

    /* renamed from: l */
    public final void m3673l(InterfaceC4228iD interfaceC4228iD, AbstractExecutorService abstractExecutorService) {
        interfaceC4228iD.getClass();
        abstractExecutorService.getClass();
        synchronized (this) {
            try {
                if (this.f4628c) {
                    return;
                }
                boolean z = true;
                if (this.f4627b == 1) {
                    this.f4632g.add(Pair.create(interfaceC4228iD, abstractExecutorService));
                }
                if (!mo3662a() && !m3668g() && !m3674m()) {
                    z = false;
                }
                if (z) {
                    abstractExecutorService.execute(new RunnableC0441H(this, m3666e(), interfaceC4228iD, m3674m()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m3674m() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m3667f()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.m3668g()     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0504I.m3674m():boolean");
    }

    /* renamed from: b */
    public void mo3663b(Object obj) {
    }
}

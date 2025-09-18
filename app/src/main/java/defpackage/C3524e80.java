package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3524e80 extends I {
    public ArrayList h;
    public int i;
    public int j;
    public AtomicInteger k;
    public Throwable l;
    public HashMap m;
    public final /* synthetic */ C3715f80 n;

    public C3524e80(C3715f80 c3715f80) {
        this.n = c3715f80;
        c3715f80.getClass();
        if (this.k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new AtomicInteger(0);
                    int size = this.n.a.size();
                    this.j = size;
                    this.i = size;
                    this.h = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        YC yc = (YC) ((InterfaceC6396p61) this.n.a.get(i)).get();
                        this.h.add(yc);
                        I i2 = (I) yc;
                        i2.l(new C3334d80(this, i), C2196am.a);
                        if (!i2.a()) {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static void n(C3524e80 c3524e80, int i, YC yc) {
        YC ycO;
        Throwable th;
        synchronized (c3524e80) {
            ycO = yc == c3524e80.q() ? null : yc == c3524e80.p(i) ? c3524e80.o(i) : yc;
        }
        if (ycO != null) {
            ycO.close();
        }
        if (i == 0) {
            I i2 = (I) yc;
            c3524e80.l = i2.c();
            c3524e80.m = i2.a;
        }
        if (c3524e80.k.incrementAndGet() != c3524e80.j || (th = c3524e80.l) == null) {
            return;
        }
        c3524e80.i(th, c3524e80.m);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // defpackage.I, defpackage.YC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            f80 r0 = r1.n     // Catch: java.lang.Throwable -> L14
            r0.getClass()     // Catch: java.lang.Throwable -> L14
            YC r0 = r1.q()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 0
        L17:
            monitor-exit(r1)
            return r0
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3524e80.a():boolean");
    }

    @Override // defpackage.I, defpackage.YC
    public final boolean close() {
        this.n.getClass();
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.h;
                this.h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    YC yc = (YC) arrayList.get(i);
                    if (yc != null) {
                        yc.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.I, defpackage.YC
    public final synchronized Object getResult() {
        YC ycQ;
        this.n.getClass();
        ycQ = q();
        return ycQ != null ? ycQ.getResult() : null;
    }

    public final synchronized YC o(int i) {
        YC yc;
        ArrayList arrayList = this.h;
        yc = null;
        if (arrayList != null && i < arrayList.size()) {
            yc = (YC) this.h.set(i, null);
        }
        return yc;
    }

    public final synchronized YC p(int i) {
        ArrayList arrayList;
        arrayList = this.h;
        return (arrayList == null || i >= arrayList.size()) ? null : (YC) this.h.get(i);
    }

    public final synchronized YC q() {
        return p(this.i);
    }
}

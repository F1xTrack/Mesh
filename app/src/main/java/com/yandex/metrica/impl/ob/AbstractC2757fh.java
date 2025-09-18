package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2707dh;
import com.yandex.metrica.impl.ob.C2707dh.d;
import com.yandex.metrica.impl.ob.C2990p1;
import com.yandex.metrica.impl.ob.InterfaceC2682ch;

/* renamed from: com.yandex.metrica.impl.ob.fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2757fh<T extends C2707dh, IA, A extends InterfaceC2682ch<IA, A>, L extends C2707dh.d<T, C2707dh.c<A>>> implements C2990p1.a {
    private T a;
    private L b;
    private C2707dh.c<A> c;

    public AbstractC2757fh(L l, Qi qi, A a) {
        this.b = l;
        C2990p1.a(P0.i().f()).a(this);
        a((C2707dh.c) new C2707dh.c<>(qi, a));
    }

    @Override // com.yandex.metrica.impl.ob.C2990p1.a
    public void a() {
        synchronized (this) {
            this.a = null;
        }
    }

    public synchronized T b() {
        try {
            if (this.a == null) {
                this.a = (T) this.b.a(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    public synchronized A c() {
        return this.c.b;
    }

    public synchronized Qi d() {
        return this.c.a;
    }

    public synchronized void e() {
        this.a = null;
    }

    public synchronized void a(C2707dh.c<A> cVar) {
        this.c = cVar;
    }

    public synchronized void a(IA ia) {
        try {
            if (!this.c.b.b(ia)) {
                synchronized (this) {
                    C2707dh.c<A> cVar = this.c;
                    C2707dh.c<A> cVar2 = new C2707dh.c<>(cVar.a, cVar.b.a(ia));
                    synchronized (this) {
                        this.c = cVar2;
                    }
                }
                synchronized (this) {
                    this.a = null;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(com.yandex.metrica.impl.ob.Qi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.dh$c r0 = new com.yandex.metrica.impl.ob.dh$c     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            com.yandex.metrica.impl.ob.dh$c<A extends com.yandex.metrica.impl.ob.ch<IA, A>> r1 = r2.c     // Catch: java.lang.Throwable -> L21
            A r1 = r1.b     // Catch: java.lang.Throwable -> L21
            com.yandex.metrica.impl.ob.ch r1 = (com.yandex.metrica.impl.ob.InterfaceC2682ch) r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r2.c = r0     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r3 = 0
            r2.a = r3     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L19:
            r3 = move-exception
            goto L24
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L1e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L21:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.AbstractC2757fh.a(com.yandex.metrica.impl.ob.Qi):void");
    }
}

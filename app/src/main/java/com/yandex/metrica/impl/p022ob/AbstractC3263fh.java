package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3211dh;
import com.yandex.metrica.impl.p022ob.C3211dh.d;
import com.yandex.metrica.impl.p022ob.C3507p1;
import com.yandex.metrica.impl.p022ob.InterfaceC3185ch;

/* renamed from: com.yandex.metrica.impl.ob.fh */
/* loaded from: classes2.dex */
public abstract class AbstractC3263fh<T extends C3211dh, IA, A extends InterfaceC3185ch<IA, A>, L extends C3211dh.d<T, C3211dh.c<A>>> implements C3507p1.a {

    /* renamed from: a */
    private T f23442a;

    /* renamed from: b */
    private L f23443b;

    /* renamed from: c */
    private C3211dh.c<A> f23444c;

    public AbstractC3263fh(L l, C2885Qi c2885Qi, A a) {
        this.f23443b = l;
        C3507p1.m16548a(C2842P0.m14728i().m14736f()).m16551a(this);
        m15940a((C3211dh.c) new C3211dh.c<>(c2885Qi, a));
    }

    @Override // com.yandex.metrica.impl.p022ob.C3507p1.a
    /* renamed from: a */
    public void mo15938a() {
        synchronized (this) {
            this.f23442a = null;
        }
    }

    /* renamed from: b */
    public synchronized T m15942b() {
        try {
            if (this.f23442a == null) {
                this.f23442a = (T) this.f23443b.mo14785a(this.f23444c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23442a;
    }

    /* renamed from: c */
    public synchronized A m15943c() {
        return this.f23444c.f23276b;
    }

    /* renamed from: d */
    public synchronized C2885Qi m15944d() {
        return this.f23444c.f23275a;
    }

    /* renamed from: e */
    public synchronized void m15945e() {
        this.f23442a = null;
    }

    /* renamed from: a */
    public synchronized void m15940a(C3211dh.c<A> cVar) {
        this.f23444c = cVar;
    }

    /* renamed from: a */
    public synchronized void m15941a(IA ia) {
        try {
            if (!this.f23444c.f23276b.mo15414b(ia)) {
                synchronized (this) {
                    C3211dh.c<A> cVar = this.f23444c;
                    C3211dh.c<A> cVar2 = new C3211dh.c<>(cVar.f23275a, cVar.f23276b.mo15413a(ia));
                    synchronized (this) {
                        this.f23444c = cVar2;
                    }
                }
                synchronized (this) {
                    this.f23442a = null;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m15939a(com.yandex.metrica.impl.p022ob.C2885Qi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.dh$c r0 = new com.yandex.metrica.impl.ob.dh$c     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            com.yandex.metrica.impl.ob.dh$c<A extends com.yandex.metrica.impl.ob.ch<IA, A>> r1 = r2.f23444c     // Catch: java.lang.Throwable -> L21
            A r1 = r1.f23276b     // Catch: java.lang.Throwable -> L21
            com.yandex.metrica.impl.ob.ch r1 = (com.yandex.metrica.impl.p022ob.InterfaceC3185ch) r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r2.f23444c = r0     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L19
            r3 = 0
            r2.f23442a = r3     // Catch: java.lang.Throwable -> L1b
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.AbstractC3263fh.m15939a(com.yandex.metrica.impl.ob.Qi):void");
    }
}

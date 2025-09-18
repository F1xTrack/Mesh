package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: JP */
/* loaded from: classes2.dex */
public abstract class AbstractC0593JP extends AbstractC0656KP implements InterfaceC6939uH {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5510g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0593JP.class, Object.class, "_queue$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5511h = AtomicReferenceFieldUpdater.newUpdater(AbstractC0593JP.class, Object.class, "_delayed$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5512i = AtomicIntegerFieldUpdater.newUpdater(AbstractC0593JP.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Removed duplicated region for block: B:137:0x0099  */
    @Override // p000.AbstractC0656KP
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo4306A() {
        /*
            r10 = this;
            boolean r0 = r10.m4626D()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r10.m4308U()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0593JP.f5510g
            java.lang.Object r3 = r0.get(r10)
            yG r4 = p000.AbstractC8259Se1.f10890b
            r5 = 0
            if (r3 != 0) goto L19
        L17:
            r7 = r5
            goto L49
        L19:
            boolean r6 = r3 instanceof p000.C9153dl0
            if (r6 == 0) goto L3d
            r6 = r3
            dl0 r6 = (p000.C9153dl0) r6
            java.lang.Object r7 = r6.m17739d()
            yG r8 = p000.C9153dl0.f26256g
            if (r7 == r8) goto L2b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L49
        L2b:
            dl0 r6 = r6.m17738c()
        L2f:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L36
            goto Lc
        L36:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L2f
            goto Lc
        L3d:
            if (r3 != r4) goto L40
            goto L17
        L40:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L49:
            if (r7 == 0) goto L4f
            r7.run()
            return r1
        L4f:
            n8 r3 = r10.f6065e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5a
        L58:
            r8 = r6
            goto L62
        L5a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L61
            goto L58
        L61:
            r8 = r1
        L62:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L67
            goto Lb6
        L67:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L8f
            boolean r3 = r0 instanceof p000.C9153dl0
            if (r3 == 0) goto L8b
            dl0 r0 = (p000.C9153dl0) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C9153dl0.f26255f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto Lb6
            goto L8f
        L8b:
            if (r0 != r4) goto Lb6
        L8d:
            r1 = r6
            goto Lb6
        L8f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0593JP.f5511h
            java.lang.Object r0 = r0.get(r10)
            IP r0 = (p000.C0530IP) r0
            if (r0 == 0) goto L8d
            monitor-enter(r0)
            HP[] r3 = r0.f14180a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La1:
            monitor-exit(r0)
            if (r5 != 0) goto La5
            goto L8d
        La5:
            long r3 = r5.f4282a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            goto Lb6
        Lb1:
            r1 = r3
            goto Lb6
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r1
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L40
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0593JP.mo4306A():long");
    }

    /* renamed from: S */
    public void mo4307S(Runnable runnable) {
        m4308U();
        if (!m4309W(runnable)) {
            RunnableC6811sF.f42334j.mo4307S(runnable);
            return;
        }
        Thread threadMo1842w = mo1842w();
        if (Thread.currentThread() != threadMo1842w) {
            LockSupport.unpark(threadMo1842w);
        }
    }

    /* renamed from: U */
    public final void m4308U() {
        AbstractRunnableC0467HP abstractRunnableC0467HPM9230c;
        C0530IP c0530ip = (C0530IP) f5511h.get(this);
        if (c0530ip == null || Y91.f14179b.get(c0530ip) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0530ip) {
                try {
                    AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = c0530ip.f14180a;
                    AbstractRunnableC0467HP abstractRunnableC0467HP = abstractRunnableC0467HPArr != null ? abstractRunnableC0467HPArr[0] : null;
                    if (abstractRunnableC0467HP != null) {
                        abstractRunnableC0467HPM9230c = ((jNanoTime - abstractRunnableC0467HP.f4282a) > 0L ? 1 : ((jNanoTime - abstractRunnableC0467HP.f4282a) == 0L ? 0 : -1)) >= 0 ? m4309W(abstractRunnableC0467HP) : false ? c0530ip.m9230c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0467HPM9230c != null);
    }

    /* renamed from: W */
    public final boolean m4309W(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5510g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f5512i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof C9153dl0)) {
                if (obj == AbstractC8259Se1.f10890b) {
                    return false;
                }
                C9153dl0 c9153dl0 = new C9153dl0(8, true);
                c9153dl0.m17736a((Runnable) obj);
                c9153dl0.m17736a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9153dl0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            C9153dl0 c9153dl02 = (C9153dl0) obj;
            int iM17736a = c9153dl02.m17736a(runnable);
            if (iM17736a == 0) {
                return true;
            }
            if (iM17736a == 1) {
                C9153dl0 c9153dl0M17738c = c9153dl02.m17738c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9153dl0M17738c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM17736a == 2) {
                return false;
            }
        }
    }

    /* renamed from: X */
    public final boolean m4310X() {
        C6470n8 c6470n8 = this.f6065e;
        if (!(c6470n8 != null ? c6470n8.isEmpty() : true)) {
            return false;
        }
        C0530IP c0530ip = (C0530IP) f5511h.get(this);
        if (c0530ip != null && Y91.f14179b.get(c0530ip) != 0) {
            return false;
        }
        Object obj = f5510g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C9153dl0) {
            long j = C9153dl0.f26255f.get((C9153dl0) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC8259Se1.f10890b) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: a */
    public InterfaceC0776MK mo4311a(long j, RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        return AbstractC6874tF.f42962a.mo4311a(j, runnableC7627Ga1, interfaceC0125Bz);
    }

    /* renamed from: b0 */
    public final void m4312b0(long j, AbstractRunnableC0467HP abstractRunnableC0467HP) {
        int iM3409d;
        Thread threadMo1842w;
        boolean z = f5512i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5511h;
        if (z) {
            iM3409d = 1;
        } else {
            C0530IP c0530ip = (C0530IP) atomicReferenceFieldUpdater.get(this);
            if (c0530ip == null) {
                C0530IP c0530ip2 = new C0530IP();
                c0530ip2.f4925c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0530ip2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                O90.m5965c(obj);
                c0530ip = (C0530IP) obj;
            }
            iM3409d = abstractRunnableC0467HP.m3409d(j, c0530ip, this);
        }
        if (iM3409d != 0) {
            if (iM3409d == 1) {
                mo4627J(j, abstractRunnableC0467HP);
                return;
            } else {
                if (iM3409d != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0530IP c0530ip3 = (C0530IP) atomicReferenceFieldUpdater.get(this);
        if (c0530ip3 != null) {
            synchronized (c0530ip3) {
                AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = c0530ip3.f14180a;
                abstractRunnableC0467HP = abstractRunnableC0467HPArr != null ? abstractRunnableC0467HPArr[0] : null;
            }
        }
        if (abstractRunnableC0467HP != abstractRunnableC0467HP || Thread.currentThread() == (threadMo1842w = mo1842w())) {
            return;
        }
        LockSupport.unpark(threadMo1842w);
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: e */
    public final void mo4313e(long j, C0619Jp c0619Jp) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0341FP c0341fp = new C0341FP(this, j2 + jNanoTime, c0619Jp);
            m4312b0(jNanoTime, c0341fp);
            c0619Jp.m4442v(new C0052Ap(2, c0341fp));
        }
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        mo4307S(runnable);
    }

    @Override // p000.AbstractC0656KP
    public void shutdown() {
        AbstractRunnableC0467HP abstractRunnableC0467HPM9230c;
        X91.f13583a.set(null);
        f5512i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5510g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7190yG c7190yG = AbstractC8259Se1.f10890b;
            if (obj != null) {
                if (!(obj instanceof C9153dl0)) {
                    if (obj != c7190yG) {
                        C9153dl0 c9153dl0 = new C9153dl0(8, true);
                        c9153dl0.m17736a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c9153dl0)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C9153dl0) obj).m17737b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c7190yG)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo4306A() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0530IP c0530ip = (C0530IP) f5511h.get(this);
            if (c0530ip == null) {
                return;
            }
            synchronized (c0530ip) {
                abstractRunnableC0467HPM9230c = Y91.f14179b.get(c0530ip) > 0 ? c0530ip.m9230c(0) : null;
            }
            if (abstractRunnableC0467HPM9230c == null) {
                return;
            } else {
                mo4627J(jNanoTime, abstractRunnableC0467HPM9230c);
            }
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class JP extends KP implements InterfaceC7381uH {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(JP.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(JP.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(JP.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Removed duplicated region for block: B:137:0x0099  */
    @Override // defpackage.KP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A() {
        /*
            r10 = this;
            boolean r0 = r10.D()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            r10.U()
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.JP.g
            java.lang.Object r3 = r0.get(r10)
            yG r4 = defpackage.AbstractC1437Se1.b
            r5 = 0
            if (r3 != 0) goto L19
        L17:
            r7 = r5
            goto L49
        L19:
            boolean r6 = r3 instanceof defpackage.C3451dl0
            if (r6 == 0) goto L3d
            r6 = r3
            dl0 r6 = (defpackage.C3451dl0) r6
            java.lang.Object r7 = r6.d()
            yG r8 = defpackage.C3451dl0.g
            if (r7 == r8) goto L2b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L49
        L2b:
            dl0 r6 = r6.c()
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
            n8 r3 = r10.e
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
            boolean r3 = r0 instanceof defpackage.C3451dl0
            if (r3 == 0) goto L8b
            dl0 r0 = (defpackage.C3451dl0) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.C3451dl0.f
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.JP.h
            java.lang.Object r0 = r0.get(r10)
            IP r0 = (defpackage.IP) r0
            if (r0 == 0) goto L8d
            monitor-enter(r0)
            HP[] r3 = r0.a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La1:
            monitor-exit(r0)
            if (r5 != 0) goto La5
            goto L8d
        La5:
            long r3 = r5.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JP.A():long");
    }

    public void S(Runnable runnable) {
        U();
        if (!W(runnable)) {
            RunnableC6993sF.j.S(runnable);
            return;
        }
        Thread threadW = w();
        if (Thread.currentThread() != threadW) {
            LockSupport.unpark(threadW);
        }
    }

    public final void U() {
        HP hpC;
        IP ip = (IP) h.get(this);
        if (ip == null || Y91.b.get(ip) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (ip) {
                try {
                    HP[] hpArr = ip.a;
                    HP hp = hpArr != null ? hpArr[0] : null;
                    if (hp != null) {
                        hpC = ((jNanoTime - hp.a) > 0L ? 1 : ((jNanoTime - hp.a) == 0L ? 0 : -1)) >= 0 ? W(hp) : false ? ip.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (hpC != null);
    }

    public final boolean W(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (i.get(this) != 0) {
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
            if (!(obj instanceof C3451dl0)) {
                if (obj == AbstractC1437Se1.b) {
                    return false;
                }
                C3451dl0 c3451dl0 = new C3451dl0(8, true);
                c3451dl0.a((Runnable) obj);
                c3451dl0.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3451dl0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            C3451dl0 c3451dl02 = (C3451dl0) obj;
            int iA = c3451dl02.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3451dl0 c3451dl0C = c3451dl02.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3451dl0C) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean X() {
        C6018n8 c6018n8 = this.e;
        if (!(c6018n8 != null ? c6018n8.isEmpty() : true)) {
            return false;
        }
        IP ip = (IP) h.get(this);
        if (ip != null && Y91.b.get(ip) != 0) {
            return false;
        }
        Object obj = g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C3451dl0) {
            long j = C3451dl0.f.get((C3451dl0) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC1437Se1.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC7381uH
    public MK a(long j, RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        return AbstractC7184tF.a.a(j, runnableC0490Ga1, interfaceC0173Bz);
    }

    public final void b0(long j, HP hp) {
        int iD;
        Thread threadW;
        boolean z = i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (z) {
            iD = 1;
        } else {
            IP ip = (IP) atomicReferenceFieldUpdater.get(this);
            if (ip == null) {
                IP ip2 = new IP();
                ip2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ip2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                O90.c(obj);
                ip = (IP) obj;
            }
            iD = hp.d(j, ip, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                J(j, hp);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        IP ip3 = (IP) atomicReferenceFieldUpdater.get(this);
        if (ip3 != null) {
            synchronized (ip3) {
                HP[] hpArr = ip3.a;
                hp = hpArr != null ? hpArr[0] : null;
            }
        }
        if (hp != hp || Thread.currentThread() == (threadW = w())) {
            return;
        }
        LockSupport.unpark(threadW);
    }

    @Override // defpackage.InterfaceC7381uH
    public final void e(long j, C0767Jp c0767Jp) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            FP fp = new FP(this, j2 + jNanoTime, c0767Jp);
            b0(jNanoTime, fp);
            c0767Jp.v(new C0065Ap(2, fp));
        }
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        S(runnable);
    }

    @Override // defpackage.KP
    public void shutdown() {
        HP hpC;
        X91.a.set(null);
        i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C8139yG c8139yG = AbstractC1437Se1.b;
            if (obj != null) {
                if (!(obj instanceof C3451dl0)) {
                    if (obj != c8139yG) {
                        C3451dl0 c3451dl0 = new C3451dl0(8, true);
                        c3451dl0.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3451dl0)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C3451dl0) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c8139yG)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (A() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            IP ip = (IP) h.get(this);
            if (ip == null) {
                return;
            }
            synchronized (ip) {
                hpC = Y91.b.get(ip) > 0 ? ip.c(0) : null;
            }
            if (hpC == null) {
                return;
            } else {
                J(jNanoTime, hpC);
            }
        }
    }
}

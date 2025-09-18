package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Kz */
/* loaded from: classes2.dex */
public final class ExecutorC0875Kz implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(ExecutorC0875Kz.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(ExecutorC0875Kz.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0875Kz.class, "_isTerminated$volatile");
    public static final C8139yG k = new C8139yG("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final I10 e;
    public final I10 f;
    public final ZR0 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0875Kz(long j2, String str, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(AbstractC8235ym.f(i3, "Max pool size ", i2, " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.e = new I10();
        this.f = new I10();
        this.g = new ZR0((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ExecutorC0875Kz.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.C0719Iz
            r3 = 0
            if (r1 == 0) goto L18
            Iz r0 = (defpackage.C0719Iz) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            Kz r1 = r0.h
            boolean r1 = defpackage.O90.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            ZR0 r1 = r8.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ExecutorC0875Kz.i     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            ZR0 r5 = r8.g
            java.lang.Object r5 = r5.b(r1)
            defpackage.O90.c(r5)
            Iz r5 = (defpackage.C0719Iz) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            Qo1 r5 = r5.a
            I10 r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.C1311Qo1.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            O81 r7 = (defpackage.O81) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            O81 r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            I10 r1 = r8.f
            r1.b()
            I10 r1 = r8.e
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            O81 r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            I10 r1 = r8.e
            java.lang.Object r1 = r1.d()
            O81 r1 = (defpackage.O81) r1
            if (r1 != 0) goto Lb3
            I10 r1 = r8.f
            java.lang.Object r1 = r1.d()
            O81 r1 = (defpackage.O81) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            Jz r1 = defpackage.EnumC0797Jz.e
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0875Kz.h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0875Kz.i
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExecutorC0875Kz.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(runnable, false, false);
    }

    public final int m() {
        synchronized (this.g) {
            try {
                if (j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0719Iz c0719Iz = new C0719Iz(this, i4);
                this.g.c(i4, c0719Iz);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                c0719Iz.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, boolean z, boolean z2) {
        O81 z81;
        EnumC0797Jz enumC0797Jz;
        AbstractC3338d91.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof O81) {
            z81 = (O81) runnable;
            z81.a = jNanoTime;
            z81.b = z;
        } else {
            z81 = new Z81(runnable, jNanoTime, z);
        }
        boolean z3 = z81.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0719Iz c0719Iz = threadCurrentThread instanceof C0719Iz ? (C0719Iz) threadCurrentThread : null;
        if (c0719Iz == null || !O90.a(c0719Iz.h, this)) {
            c0719Iz = null;
        }
        if (c0719Iz != null && (enumC0797Jz = c0719Iz.c) != EnumC0797Jz.e && (z81.b || enumC0797Jz != EnumC0797Jz.b)) {
            c0719Iz.g = true;
            C1311Qo1 c1311Qo1 = c0719Iz.a;
            if (z2) {
                z81 = c1311Qo1.a(z81);
            } else {
                c1311Qo1.getClass();
                O81 o81 = (O81) C1311Qo1.b.getAndSet(c1311Qo1, z81);
                z81 = o81 == null ? null : c1311Qo1.a(o81);
            }
        }
        if (z81 != null) {
            if (!(z81.b ? this.f.a(z81) : this.e.a(z81))) {
                throw new RejectedExecutionException(AbstractC1705Vq.l(new StringBuilder(), this.d, " was terminated"));
            }
        }
        boolean z4 = z2 && c0719Iz != null;
        if (z3) {
            if (z4 || w() || p(jAddAndGet)) {
                return;
            }
            w();
            return;
        }
        if (z4 || w() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        w();
    }

    public final void o(C0719Iz c0719Iz, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objC = c0719Iz.c();
                    while (true) {
                        if (objC == k) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        C0719Iz c0719Iz2 = (C0719Iz) objC;
                        int iB = c0719Iz2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                        objC = c0719Iz2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (h.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int iM = m();
            if (iM == 1 && i3 > 1) {
                m();
            }
            if (iM > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ZR0 zr0 = this.g;
        int iA = zr0.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            C0719Iz c0719Iz = (C0719Iz) zr0.b(i7);
            if (c0719Iz != null) {
                C1311Qo1 c1311Qo1 = c0719Iz.a;
                c1311Qo1.getClass();
                int i8 = C1311Qo1.b.get(c1311Qo1) != null ? (C1311Qo1.c.get(c1311Qo1) - C1311Qo1.d.get(c1311Qo1)) + 1 : C1311Qo1.c.get(c1311Qo1) - C1311Qo1.d.get(c1311Qo1);
                int iOrdinal = c0719Iz.c.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C7074sg();
                    }
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(AbstractC8130yD.c(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.a;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean w() {
        C8139yG c8139yG;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            C0719Iz c0719Iz = (C0719Iz) this.g.b((int) (2097151 & j2));
            if (c0719Iz == null) {
                c0719Iz = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = c0719Iz.c();
                while (true) {
                    c8139yG = k;
                    if (objC == c8139yG) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C0719Iz c0719Iz2 = (C0719Iz) objC;
                    iB = c0719Iz2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c0719Iz2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | iB)) {
                    c0719Iz.g(c8139yG);
                }
            }
            if (c0719Iz == null) {
                return false;
            }
            if (C0719Iz.i.compareAndSet(c0719Iz, -1, 0)) {
                LockSupport.unpark(c0719Iz);
                return true;
            }
        }
    }
}

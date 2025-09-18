package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Iz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0719Iz extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(C0719Iz.class, "workerCtl$volatile");
    public final C1311Qo1 a;
    public final TO0 b;
    public EnumC0797Jz c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ ExecutorC0875Kz h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0719Iz(ExecutorC0875Kz executorC0875Kz, int i2) {
        this.h = executorC0875Kz;
        setDaemon(true);
        setContextClassLoader(executorC0875Kz.getClass().getClassLoader());
        this.a = new C1311Qo1();
        this.b = new TO0();
        this.c = EnumC0797Jz.d;
        this.nextParkedWorker = ExecutorC0875Kz.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = defpackage.C1311Qo1.d.get(r3);
        r0 = defpackage.C1311Qo1.c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (defpackage.C1311Qo1.e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.O81 a(boolean r13) {
        /*
            r12 = this;
            Jz r0 = r12.c
            Jz r1 = defpackage.EnumC0797Jz.a
            r2 = 0
            Qo1 r3 = r12.a
            r4 = 1
            Kz r5 = r12.h
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC0875Kz.i
        L10:
            Kz r7 = r12.h
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.C1311Qo1.b
            java.lang.Object r0 = r13.get(r3)
            O81 r0 = (defpackage.O81) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.b
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.C1311Qo1.d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C1311Qo1.c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C1311Qo1.e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            O81 r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            I10 r13 = r5.f
            java.lang.Object r13 = r13.d()
            r2 = r13
            O81 r2 = (defpackage.O81) r2
            if (r2 != 0) goto L74
            O81 r2 = r12.i(r4)
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.ExecutorC0875Kz.i
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            Jz r0 = defpackage.EnumC0797Jz.a
            r12.c = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.a
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            O81 r13 = r12.e()
            if (r13 == 0) goto L9f
            goto Lc8
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.C1311Qo1.b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            O81 r13 = (defpackage.O81) r13
            if (r13 != 0) goto Lb0
            O81 r13 = r3.b()
        Lb0:
            if (r13 == 0) goto Lb3
            goto Lc8
        Lb3:
            if (r4 != 0) goto Lc3
            O81 r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lbc:
            O81 r13 = r12.e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lc3:
            r13 = 3
            O81 r13 = r12.i(r13)
        Lc8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0719Iz.a(boolean):O81");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final O81 e() {
        int iD = d(2);
        ExecutorC0875Kz executorC0875Kz = this.h;
        if (iD == 0) {
            O81 o81 = (O81) executorC0875Kz.e.d();
            return o81 != null ? o81 : (O81) executorC0875Kz.f.d();
        }
        O81 o812 = (O81) executorC0875Kz.f.d();
        return o812 != null ? o812 : (O81) executorC0875Kz.e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(EnumC0797Jz enumC0797Jz) {
        EnumC0797Jz enumC0797Jz2 = this.c;
        boolean z = enumC0797Jz2 == EnumC0797Jz.a;
        if (z) {
            ExecutorC0875Kz.i.addAndGet(this.h, 4398046511104L);
        }
        if (enumC0797Jz2 != enumC0797Jz) {
            this.c = enumC0797Jz;
        }
        return z;
    }

    public final O81 i(int i2) {
        O81 o81C;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0875Kz.i;
        ExecutorC0875Kz executorC0875Kz = this.h;
        int i3 = (int) (atomicLongFieldUpdater.get(executorC0875Kz) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        long jMin = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            C0719Iz c0719Iz = (C0719Iz) executorC0875Kz.g.b(iD);
            if (c0719Iz != null && c0719Iz != this) {
                C1311Qo1 c1311Qo1 = c0719Iz.a;
                if (i2 == 3) {
                    o81C = c1311Qo1.b();
                } else {
                    c1311Qo1.getClass();
                    int i5 = C1311Qo1.d.get(c1311Qo1);
                    int i6 = C1311Qo1.c.get(c1311Qo1);
                    boolean z = i2 == 1;
                    while (i5 != i6 && (!z || C1311Qo1.e.get(c1311Qo1) != 0)) {
                        int i7 = i5 + 1;
                        o81C = c1311Qo1.c(i5, z);
                        if (o81C != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    o81C = null;
                }
                TO0 to0 = this.b;
                if (o81C != null) {
                    to0.a = o81C;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1311Qo1.b;
                        O81 o81 = (O81) atomicReferenceFieldUpdater.get(c1311Qo1);
                        j = -2;
                        if (o81 == null) {
                            break;
                        }
                        if (((o81.b ? 1 : 2) & i2) != 0) {
                            AbstractC3338d91.f.getClass();
                            long jNanoTime = System.nanoTime() - o81.a;
                            long j3 = AbstractC3338d91.b;
                            if (jNanoTime >= j3) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(c1311Qo1, o81, null)) {
                                    if (atomicReferenceFieldUpdater.get(c1311Qo1) != o81) {
                                        break;
                                    }
                                }
                                to0.a = o81;
                                j = -1;
                                break;
                            }
                            j = j3 - jNanoTime;
                            break;
                        }
                        break;
                    }
                    j2 = j;
                }
                if (j2 == -1) {
                    O81 o812 = (O81) to0.a;
                    to0.a = null;
                    return o812;
                }
                if (j2 > 0) {
                    jMin = Math.min(jMin, j2);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z;
        boolean z2 = false;
        loop0: while (true) {
            boolean z3 = z2;
            while (true) {
                ExecutorC0875Kz executorC0875Kz = this.h;
                executorC0875Kz.getClass();
                if (ExecutorC0875Kz.j.get(executorC0875Kz) == 0) {
                    EnumC0797Jz enumC0797Jz = this.c;
                    EnumC0797Jz enumC0797Jz2 = EnumC0797Jz.e;
                    if (enumC0797Jz == enumC0797Jz2) {
                        break loop0;
                    }
                    O81 o81A = a(this.g);
                    long j = -2097152;
                    if (o81A != null) {
                        this.e = 0L;
                        this.d = 0L;
                        if (this.c == EnumC0797Jz.c) {
                            this.c = EnumC0797Jz.b;
                        }
                        boolean z4 = o81A.b;
                        ExecutorC0875Kz executorC0875Kz2 = this.h;
                        if (z4) {
                            if (h(EnumC0797Jz.b) && !executorC0875Kz2.w() && !executorC0875Kz2.p(ExecutorC0875Kz.i.get(executorC0875Kz2))) {
                                executorC0875Kz2.w();
                            }
                            executorC0875Kz2.getClass();
                            try {
                                o81A.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            ExecutorC0875Kz.i.addAndGet(executorC0875Kz2, -2097152L);
                            if (this.c != enumC0797Jz2) {
                                this.c = EnumC0797Jz.d;
                            }
                        } else {
                            executorC0875Kz2.getClass();
                            try {
                                o81A.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                        }
                    } else {
                        this.g = z2;
                        if (this.e == 0) {
                            Object obj = this.nextParkedWorker;
                            C8139yG c8139yG = ExecutorC0875Kz.k;
                            if (obj != c8139yG ? true : z2) {
                                i.set(this, -1);
                                while (this.nextParkedWorker != ExecutorC0875Kz.k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = i;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    ExecutorC0875Kz executorC0875Kz3 = this.h;
                                    executorC0875Kz3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = ExecutorC0875Kz.j;
                                    if (atomicIntegerFieldUpdater3.get(executorC0875Kz3) != 0) {
                                        break;
                                    }
                                    EnumC0797Jz enumC0797Jz3 = this.c;
                                    EnumC0797Jz enumC0797Jz4 = EnumC0797Jz.e;
                                    if (enumC0797Jz3 == enumC0797Jz4) {
                                        break;
                                    }
                                    h(EnumC0797Jz.c);
                                    Thread.interrupted();
                                    if (this.d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.d = System.nanoTime() + this.h.c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.h.c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0L;
                                        ExecutorC0875Kz executorC0875Kz4 = this.h;
                                        synchronized (executorC0875Kz4.g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(executorC0875Kz4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0875Kz.i;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0875Kz4) & 2097151)) > executorC0875Kz4.a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        z = false;
                                                        f(0);
                                                        executorC0875Kz4.o(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0875Kz4) & 2097151);
                                                        if (andDecrement != i2) {
                                                            Object objB = executorC0875Kz4.g.b(andDecrement);
                                                            O90.c(objB);
                                                            C0719Iz c0719Iz = (C0719Iz) objB;
                                                            executorC0875Kz4.g.c(i2, c0719Iz);
                                                            c0719Iz.f(i2);
                                                            executorC0875Kz4.o(c0719Iz, andDecrement, i2);
                                                        }
                                                        executorC0875Kz4.g.c(andDecrement, null);
                                                        this.c = enumC0797Jz4;
                                                    }
                                                }
                                                z = false;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        z = false;
                                    }
                                    z2 = z;
                                }
                            } else {
                                ExecutorC0875Kz executorC0875Kz5 = this.h;
                                executorC0875Kz5.getClass();
                                if (this.nextParkedWorker == c8139yG) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0875Kz.h;
                                        long j2 = atomicLongFieldUpdater2.get(executorC0875Kz5);
                                        int i3 = this.indexInArray;
                                        this.nextParkedWorker = executorC0875Kz5.g.b((int) (j2 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(executorC0875Kz5, j2, ((2097152 + j2) & j) | i3)) {
                                            break;
                                        } else {
                                            j = -2097152;
                                        }
                                    }
                                }
                            }
                            z2 = z2;
                        } else {
                            if (z3) {
                                h(EnumC0797Jz.c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.e);
                                this.e = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(EnumC0797Jz.e);
    }
}

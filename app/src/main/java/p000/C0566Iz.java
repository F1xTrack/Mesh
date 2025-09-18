package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Iz */
/* loaded from: classes2.dex */
public final class C0566Iz extends Thread {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5239i = AtomicIntegerFieldUpdater.newUpdater(C0566Iz.class, "workerCtl$volatile");

    /* renamed from: a */
    public final C8175Qo1 f5240a;

    /* renamed from: b */
    public final TO0 f5241b;

    /* renamed from: c */
    public EnumC0629Jz f5242c;

    /* renamed from: d */
    public long f5243d;

    /* renamed from: e */
    public long f5244e;

    /* renamed from: f */
    public int f5245f;

    /* renamed from: g */
    public boolean f5246g;

    /* renamed from: h */
    public final /* synthetic */ ExecutorC0692Kz f5247h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0566Iz(ExecutorC0692Kz executorC0692Kz, int i) {
        this.f5247h = executorC0692Kz;
        setDaemon(true);
        setContextClassLoader(executorC0692Kz.getClass().getClassLoader());
        this.f5240a = new C8175Qo1();
        this.f5241b = new TO0();
        this.f5242c = EnumC0629Jz.f5826d;
        this.nextParkedWorker = ExecutorC0692Kz.f6408k;
        int iNanoTime = (int) System.nanoTime();
        this.f5245f = iNanoTime == 0 ? 42 : iNanoTime;
        m4096f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = p000.C8175Qo1.f9794d.get(r3);
        r0 = p000.C8175Qo1.f9793c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (p000.C8175Qo1.f9795e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.m6791c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.O81 m4091a(boolean r13) {
        /*
            r12 = this;
            Jz r0 = r12.f5242c
            Jz r1 = p000.EnumC0629Jz.f5823a
            r2 = 0
            Qo1 r3 = r12.f5240a
            r4 = 1
            Kz r5 = r12.f5247h
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0692Kz.f6406i
        L10:
            Kz r7 = r12.f5247h
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = p000.C8175Qo1.f9792b
            java.lang.Object r0 = r13.get(r3)
            O81 r0 = (p000.O81) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f8259b
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = p000.C8175Qo1.f9794d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.C8175Qo1.f9793c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.C8175Qo1.f9795e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            O81 r1 = r3.m6791c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            I10 r13 = r5.f6414f
            java.lang.Object r13 = r13.m10504d()
            r2 = r13
            O81 r2 = (p000.O81) r2
            if (r2 != 0) goto L74
            O81 r2 = r12.m4099i(r4)
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p000.ExecutorC0692Kz.f6406i
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            Jz r0 = p000.EnumC0629Jz.f5823a
            r12.f5242c = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.f6409a
            int r13 = r13 * 2
            int r13 = r12.m4094d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            O81 r13 = r12.m4095e()
            if (r13 == 0) goto L9f
            goto Lc8
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = p000.C8175Qo1.f9792b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            O81 r13 = (p000.O81) r13
            if (r13 != 0) goto Lb0
            O81 r13 = r3.m6790b()
        Lb0:
            if (r13 == 0) goto Lb3
            goto Lc8
        Lb3:
            if (r4 != 0) goto Lc3
            O81 r13 = r12.m4095e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lbc:
            O81 r13 = r12.m4095e()
            if (r13 == 0) goto Lc3
            goto Lc8
        Lc3:
            r13 = 3
            O81 r13 = r12.m4099i(r13)
        Lc8:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0566Iz.m4091a(boolean):O81");
    }

    /* renamed from: b */
    public final int m4092b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final Object m4093c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m4094d(int i) {
        int i2 = this.f5245f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f5245f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: e */
    public final O81 m4095e() {
        int iM4094d = m4094d(2);
        ExecutorC0692Kz executorC0692Kz = this.f5247h;
        if (iM4094d == 0) {
            O81 o81 = (O81) executorC0692Kz.f6413e.m10504d();
            return o81 != null ? o81 : (O81) executorC0692Kz.f6414f.m10504d();
        }
        O81 o812 = (O81) executorC0692Kz.f6414f.m10504d();
        return o812 != null ? o812 : (O81) executorC0692Kz.f6413e.m10504d();
    }

    /* renamed from: f */
    public final void m4096f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5247h.f6412d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* renamed from: g */
    public final void m4097g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m4098h(EnumC0629Jz enumC0629Jz) {
        EnumC0629Jz enumC0629Jz2 = this.f5242c;
        boolean z = enumC0629Jz2 == EnumC0629Jz.f5823a;
        if (z) {
            ExecutorC0692Kz.f6406i.addAndGet(this.f5247h, 4398046511104L);
        }
        if (enumC0629Jz2 != enumC0629Jz) {
            this.f5242c = enumC0629Jz;
        }
        return z;
    }

    /* renamed from: i */
    public final O81 m4099i(int i) {
        O81 o81M6791c;
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0692Kz.f6406i;
        ExecutorC0692Kz executorC0692Kz = this.f5247h;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0692Kz) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM4094d = m4094d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM4094d++;
            if (iM4094d > i2) {
                iM4094d = 1;
            }
            C0566Iz c0566Iz = (C0566Iz) executorC0692Kz.f6415g.m9529b(iM4094d);
            if (c0566Iz != null && c0566Iz != this) {
                C8175Qo1 c8175Qo1 = c0566Iz.f5240a;
                if (i == 3) {
                    o81M6791c = c8175Qo1.m6790b();
                } else {
                    c8175Qo1.getClass();
                    int i4 = C8175Qo1.f9794d.get(c8175Qo1);
                    int i5 = C8175Qo1.f9793c.get(c8175Qo1);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || C8175Qo1.f9795e.get(c8175Qo1) != 0)) {
                        int i6 = i4 + 1;
                        o81M6791c = c8175Qo1.m6791c(i4, z);
                        if (o81M6791c != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    o81M6791c = null;
                }
                TO0 to0 = this.f5241b;
                if (o81M6791c != null) {
                    to0.f11337a = o81M6791c;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8175Qo1.f9792b;
                        O81 o81 = (O81) atomicReferenceFieldUpdater.get(c8175Qo1);
                        j = -2;
                        if (o81 == null) {
                            break;
                        }
                        if (((o81.f8259b ? 1 : 2) & i) != 0) {
                            AbstractC9078d91.f25848f.getClass();
                            long jNanoTime = System.nanoTime() - o81.f8258a;
                            long j3 = AbstractC9078d91.f25844b;
                            if (jNanoTime >= j3) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(c8175Qo1, o81, null)) {
                                    if (atomicReferenceFieldUpdater.get(c8175Qo1) != o81) {
                                        break;
                                    }
                                }
                                to0.f11337a = o81;
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
                    O81 o812 = (O81) to0.f11337a;
                    to0.f11337a = null;
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
        this.f5244e = jMin;
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
                ExecutorC0692Kz executorC0692Kz = this.f5247h;
                executorC0692Kz.getClass();
                if (ExecutorC0692Kz.f6407j.get(executorC0692Kz) == 0) {
                    EnumC0629Jz enumC0629Jz = this.f5242c;
                    EnumC0629Jz enumC0629Jz2 = EnumC0629Jz.f5827e;
                    if (enumC0629Jz == enumC0629Jz2) {
                        break loop0;
                    }
                    O81 o81M4091a = m4091a(this.f5246g);
                    long j = -2097152;
                    if (o81M4091a != null) {
                        this.f5244e = 0L;
                        this.f5243d = 0L;
                        if (this.f5242c == EnumC0629Jz.f5825c) {
                            this.f5242c = EnumC0629Jz.f5824b;
                        }
                        boolean z4 = o81M4091a.f8259b;
                        ExecutorC0692Kz executorC0692Kz2 = this.f5247h;
                        if (z4) {
                            if (m4098h(EnumC0629Jz.f5824b) && !executorC0692Kz2.m4802w() && !executorC0692Kz2.m4801p(ExecutorC0692Kz.f6406i.get(executorC0692Kz2))) {
                                executorC0692Kz2.m4802w();
                            }
                            executorC0692Kz2.getClass();
                            try {
                                o81M4091a.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            ExecutorC0692Kz.f6406i.addAndGet(executorC0692Kz2, -2097152L);
                            if (this.f5242c != enumC0629Jz2) {
                                this.f5242c = EnumC0629Jz.f5826d;
                            }
                        } else {
                            executorC0692Kz2.getClass();
                            try {
                                o81M4091a.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                        }
                    } else {
                        this.f5246g = z2;
                        if (this.f5244e == 0) {
                            Object obj = this.nextParkedWorker;
                            C7190yG c7190yG = ExecutorC0692Kz.f6408k;
                            if (obj != c7190yG ? true : z2) {
                                f5239i.set(this, -1);
                                while (this.nextParkedWorker != ExecutorC0692Kz.f6408k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f5239i;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    ExecutorC0692Kz executorC0692Kz3 = this.f5247h;
                                    executorC0692Kz3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = ExecutorC0692Kz.f6407j;
                                    if (atomicIntegerFieldUpdater3.get(executorC0692Kz3) != 0) {
                                        break;
                                    }
                                    EnumC0629Jz enumC0629Jz3 = this.f5242c;
                                    EnumC0629Jz enumC0629Jz4 = EnumC0629Jz.f5827e;
                                    if (enumC0629Jz3 == enumC0629Jz4) {
                                        break;
                                    }
                                    m4098h(EnumC0629Jz.f5825c);
                                    Thread.interrupted();
                                    if (this.f5243d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f5243d = System.nanoTime() + this.f5247h.f6411c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f5247h.f6411c);
                                    if (System.nanoTime() - this.f5243d >= 0) {
                                        this.f5243d = 0L;
                                        ExecutorC0692Kz executorC0692Kz4 = this.f5247h;
                                        synchronized (executorC0692Kz4.f6415g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(executorC0692Kz4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0692Kz.f6406i;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0692Kz4) & 2097151)) > executorC0692Kz4.f6409a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        z = false;
                                                        m4096f(0);
                                                        executorC0692Kz4.m4800o(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0692Kz4) & 2097151);
                                                        if (andDecrement != i) {
                                                            Object objM9529b = executorC0692Kz4.f6415g.m9529b(andDecrement);
                                                            O90.m5965c(objM9529b);
                                                            C0566Iz c0566Iz = (C0566Iz) objM9529b;
                                                            executorC0692Kz4.f6415g.m9530c(i, c0566Iz);
                                                            c0566Iz.m4096f(i);
                                                            executorC0692Kz4.m4800o(c0566Iz, andDecrement, i);
                                                        }
                                                        executorC0692Kz4.f6415g.m9530c(andDecrement, null);
                                                        this.f5242c = enumC0629Jz4;
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
                                ExecutorC0692Kz executorC0692Kz5 = this.f5247h;
                                executorC0692Kz5.getClass();
                                if (this.nextParkedWorker == c7190yG) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0692Kz.f6405h;
                                        long j2 = atomicLongFieldUpdater2.get(executorC0692Kz5);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = executorC0692Kz5.f6415g.m9529b((int) (j2 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(executorC0692Kz5, j2, ((2097152 + j2) & j) | i2)) {
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
                                m4098h(EnumC0629Jz.f5825c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f5244e);
                                this.f5244e = 0L;
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
        m4098h(EnumC0629Jz.f5827e);
    }
}

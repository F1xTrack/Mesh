package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Kz */
/* loaded from: classes2.dex */
public final class ExecutorC0692Kz implements Executor, Closeable {

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f6405h = AtomicLongFieldUpdater.newUpdater(ExecutorC0692Kz.class, "parkedWorkersStack$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f6406i = AtomicLongFieldUpdater.newUpdater(ExecutorC0692Kz.class, "controlState$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6407j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0692Kz.class, "_isTerminated$volatile");

    /* renamed from: k */
    public static final C7190yG f6408k = new C7190yG("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f6409a;

    /* renamed from: b */
    public final int f6410b;

    /* renamed from: c */
    public final long f6411c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f6412d;

    /* renamed from: e */
    public final I10 f6413e;

    /* renamed from: f */
    public final I10 f6414f;

    /* renamed from: g */
    public final ZR0 f6415g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0692Kz(long j, String str, int i, int i2) {
        this.f6409a = i;
        this.f6410b = i2;
        this.f6411c = j;
        this.f6412d = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(i2, "Max pool size ", i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f6413e = new I10();
        this.f6414f = new I10();
        this.f6415g = new ZR0((i + 1) * 2);
        this.controlState$volatile = i << 42;
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ExecutorC0692Kz.f6407j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p000.C0566Iz
            r3 = 0
            if (r1 == 0) goto L18
            Iz r0 = (p000.C0566Iz) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            Kz r1 = r0.f5247h
            boolean r1 = p000.O90.m5963a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            ZR0 r1 = r8.f6415g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.ExecutorC0692Kz.f6406i     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            ZR0 r5 = r8.f6415g
            java.lang.Object r5 = r5.m9529b(r1)
            p000.O90.m5965c(r5)
            Iz r5 = (p000.C0566Iz) r5
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
            Qo1 r5 = r5.f5240a
            I10 r6 = r8.f6414f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.C8175Qo1.f9792b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            O81 r7 = (p000.O81) r7
            if (r7 == 0) goto L69
            r6.m10501a(r7)
        L69:
            O81 r7 = r5.m6790b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.m10501a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            I10 r1 = r8.f6414f
            r1.m10502b()
            I10 r1 = r8.f6413e
            r1.m10502b()
        L83:
            if (r0 == 0) goto L8b
            O81 r1 = r0.m4091a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            I10 r1 = r8.f6413e
            java.lang.Object r1 = r1.m10504d()
            O81 r1 = (p000.O81) r1
            if (r1 != 0) goto Lb3
            I10 r1 = r8.f6414f
            java.lang.Object r1 = r1.m10504d()
            O81 r1 = (p000.O81) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            Jz r1 = p000.EnumC0629Jz.f5827e
            r0.m4098h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0692Kz.f6405h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0692Kz.f6406i
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ExecutorC0692Kz.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m4799n(runnable, false, false);
    }

    /* renamed from: m */
    public final int m4798m() {
        synchronized (this.f6415g) {
            try {
                if (f6407j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f6406i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f6409a) {
                    return 0;
                }
                if (i >= this.f6410b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f6415g.m9529b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0566Iz c0566Iz = new C0566Iz(this, i3);
                this.f6415g.m9530c(i3, c0566Iz);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0566Iz.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public final void m4799n(Runnable runnable, boolean z, boolean z2) {
        O81 z81;
        EnumC0629Jz enumC0629Jz;
        AbstractC9078d91.f25848f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof O81) {
            z81 = (O81) runnable;
            z81.f8258a = jNanoTime;
            z81.f8259b = z;
        } else {
            z81 = new Z81(runnable, jNanoTime, z);
        }
        boolean z3 = z81.f8259b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6406i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0566Iz c0566Iz = threadCurrentThread instanceof C0566Iz ? (C0566Iz) threadCurrentThread : null;
        if (c0566Iz == null || !O90.m5963a(c0566Iz.f5247h, this)) {
            c0566Iz = null;
        }
        if (c0566Iz != null && (enumC0629Jz = c0566Iz.f5242c) != EnumC0629Jz.f5827e && (z81.f8259b || enumC0629Jz != EnumC0629Jz.f5824b)) {
            c0566Iz.f5246g = true;
            C8175Qo1 c8175Qo1 = c0566Iz.f5240a;
            if (z2) {
                z81 = c8175Qo1.m6789a(z81);
            } else {
                c8175Qo1.getClass();
                O81 o81 = (O81) C8175Qo1.f9792b.getAndSet(c8175Qo1, z81);
                z81 = o81 == null ? null : c8175Qo1.m6789a(o81);
            }
        }
        if (z81 != null) {
            if (!(z81.f8259b ? this.f6414f.m10501a(z81) : this.f6413e.m10501a(z81))) {
                throw new RejectedExecutionException(AbstractC1374Vq.m8593l(new StringBuilder(), this.f6412d, " was terminated"));
            }
        }
        boolean z4 = z2 && c0566Iz != null;
        if (z3) {
            if (z4 || m4802w() || m4801p(jAddAndGet)) {
                return;
            }
            m4802w();
            return;
        }
        if (z4 || m4802w() || m4801p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m4802w();
    }

    /* renamed from: o */
    public final void m4800o(C0566Iz c0566Iz, int i, int i2) {
        while (true) {
            long j = f6405h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM4093c = c0566Iz.m4093c();
                    while (true) {
                        if (objM4093c == f6408k) {
                            i3 = -1;
                            break;
                        }
                        if (objM4093c == null) {
                            i3 = 0;
                            break;
                        }
                        C0566Iz c0566Iz2 = (C0566Iz) objM4093c;
                        int iM4092b = c0566Iz2.m4092b();
                        if (iM4092b != 0) {
                            i3 = iM4092b;
                            break;
                        }
                        objM4093c = c0566Iz2.m4093c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f6405h.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean m4801p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f6409a;
        if (i < i2) {
            int iM4798m = m4798m();
            if (iM4798m == 1 && i2 > 1) {
                m4798m();
            }
            if (iM4798m > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ZR0 zr0 = this.f6415g;
        int iM9528a = zr0.m9528a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM9528a; i6++) {
            C0566Iz c0566Iz = (C0566Iz) zr0.m9529b(i6);
            if (c0566Iz != null) {
                C8175Qo1 c8175Qo1 = c0566Iz.f5240a;
                c8175Qo1.getClass();
                int i7 = C8175Qo1.f9792b.get(c8175Qo1) != null ? (C8175Qo1.f9793c.get(c8175Qo1) - C8175Qo1.f9794d.get(c8175Qo1)) + 1 : C8175Qo1.f9793c.get(c8175Qo1) - C8175Qo1.f9794d.get(c8175Qo1);
                int iOrdinal = c0566Iz.f5242c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C6838sg();
                    }
                    i5++;
                }
            }
        }
        long j = f6406i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f6412d);
        sb4.append('@');
        sb4.append(AbstractC7187yD.m26097c(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f6409a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f6410b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f6413e.m10503c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f6414f.m10503c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* renamed from: w */
    public final boolean m4802w() {
        C7190yG c7190yG;
        int iM4092b;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6405h;
            long j = atomicLongFieldUpdater.get(this);
            C0566Iz c0566Iz = (C0566Iz) this.f6415g.m9529b((int) (2097151 & j));
            if (c0566Iz == null) {
                c0566Iz = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM4093c = c0566Iz.m4093c();
                while (true) {
                    c7190yG = f6408k;
                    if (objM4093c == c7190yG) {
                        iM4092b = -1;
                        break;
                    }
                    if (objM4093c == null) {
                        iM4092b = 0;
                        break;
                    }
                    C0566Iz c0566Iz2 = (C0566Iz) objM4093c;
                    iM4092b = c0566Iz2.m4092b();
                    if (iM4092b != 0) {
                        break;
                    }
                    objM4093c = c0566Iz2.m4093c();
                }
                if (iM4092b >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | iM4092b)) {
                    c0566Iz.m4097g(c7190yG);
                }
            }
            if (c0566Iz == null) {
                return false;
            }
            if (C0566Iz.f5239i.compareAndSet(c0566Iz, -1, 0)) {
                LockSupport.unpark(c0566Iz);
                return true;
            }
        }
    }
}

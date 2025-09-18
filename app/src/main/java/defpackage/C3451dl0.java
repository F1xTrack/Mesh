package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dl0 */
/* loaded from: classes2.dex */
public final class C3451dl0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(C3451dl0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C3451dl0.class, "_state$volatile");
    public static final C8139yG g = new C8139yG("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public C3451dl0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.C3451dl0.f
            long r2 = r6.get(r13)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L19
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r14 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r1 = 2
        L18:
            return r1
        L19:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r4 = r10 + 2
            int r11 = r13.c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.d
            boolean r4 = r13.b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.a
            if (r3 < r2) goto L50
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L50:
            return r1
        L51:
            int r0 = r10 + 1
            r0 = r0 & r5
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r0 = (long) r0
            long r0 = r0 << r9
            long r4 = r4 | r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r11
            r12.set(r0, r14)
            r0 = r13
        L6b:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L94
            dl0 r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof defpackage.C2575cl0
            if (r4 == 0) goto L91
            cl0 r3 = (defpackage.C2575cl0) r3
            int r3 = r3.a
            if (r3 != r10) goto L91
            r1.set(r2, r14)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6b
        L94:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3451dl0.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final C3451dl0 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            C3451dl0 c3451dl0 = (C3451dl0) atomicReferenceFieldUpdater.get(this);
            if (c3451dl0 != null) {
                return c3451dl0;
            }
            C3451dl0 c3451dl02 = new C3451dl0(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c2575cl0 = this.d.get(i4);
                if (c2575cl0 == null) {
                    c2575cl0 = new C2575cl0(i);
                }
                c3451dl02.d.set(c3451dl02.c & i, c2575cl0);
                i++;
            }
            atomicLongFieldUpdater.set(c3451dl02, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3451dl02) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = this.b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof C2575cl0) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (z) {
                    C3451dl0 c3451dl0C = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j3 = atomicLongFieldUpdater2.get(c3451dl0C);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c3451dl0C = c3451dl0C.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c3451dl0C, j3, (j3 & (-1073741824)) | j2)) {
                                c3451dl0C.d.set(c3451dl0C.c & i4, null);
                                c3451dl0C = null;
                            } else {
                                continue;
                            }
                        }
                        if (c3451dl0C == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

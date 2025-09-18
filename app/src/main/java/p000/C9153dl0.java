package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: dl0 */
/* loaded from: classes2.dex */
public final class C9153dl0 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26254e = AtomicReferenceFieldUpdater.newUpdater(C9153dl0.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f26255f = AtomicLongFieldUpdater.newUpdater(C9153dl0.class, "_state$volatile");

    /* renamed from: g */
    public static final C7190yG f26256g = new C7190yG("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f26257a;

    /* renamed from: b */
    public final boolean f26258b;

    /* renamed from: c */
    public final int f26259c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f26260d;

    public C9153dl0(int i, boolean z) {
        this.f26257a = i;
        this.f26258b = z;
        int i2 = i - 1;
        this.f26259c = i2;
        this.f26260d = new AtomicReferenceArray(i);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m17736a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p000.C9153dl0.f26255f
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
            int r11 = r13.f26259c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f26260d
            boolean r4 = r13.f26258b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f26257a
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
            dl0 r0 = r0.m17738c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f26260d
            int r2 = r0.f26259c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof p000.C9020cl0
            if (r4 == 0) goto L91
            cl0 r3 = (p000.C9020cl0) r3
            int r3 = r3.f17731a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C9153dl0.m17736a(java.lang.Runnable):int");
    }

    /* renamed from: b */
    public final boolean m17737b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f26255f;
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

    /* renamed from: c */
    public final C9153dl0 m17738c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f26255f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26254e;
            C9153dl0 c9153dl0 = (C9153dl0) atomicReferenceFieldUpdater.get(this);
            if (c9153dl0 != null) {
                return c9153dl0;
            }
            C9153dl0 c9153dl02 = new C9153dl0(this.f26257a * 2, this.f26258b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f26259c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c9020cl0 = this.f26260d.get(i4);
                if (c9020cl0 == null) {
                    c9020cl0 = new C9020cl0(i);
                }
                c9153dl02.f26260d.set(c9153dl02.f26259c & i, c9020cl0);
                i++;
            }
            atomicLongFieldUpdater.set(c9153dl02, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c9153dl02) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* renamed from: d */
    public final Object m17739d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f26255f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f26256g;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f26259c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f26260d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = this.f26258b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof C9020cl0) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (z) {
                    C9153dl0 c9153dl0M17738c = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f26255f;
                        long j3 = atomicLongFieldUpdater2.get(c9153dl0M17738c);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c9153dl0M17738c = c9153dl0M17738c.m17738c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c9153dl0M17738c, j3, (j3 & (-1073741824)) | j2)) {
                                c9153dl0M17738c.f26260d.set(c9153dl0M17738c.f26259c & i4, null);
                                c9153dl0M17738c = null;
                            } else {
                                continue;
                            }
                        }
                        if (c9153dl0M17738c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

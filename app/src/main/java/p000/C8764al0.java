package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: al0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8764al0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15682a = AtomicReferenceFieldUpdater.newUpdater(C8764al0.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15683b = AtomicReferenceFieldUpdater.newUpdater(C8764al0.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15684c = AtomicReferenceFieldUpdater.newUpdater(C8764al0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: d */
    public final boolean m9806d(C8764al0 c8764al0, int i) {
        while (true) {
            C8764al0 c8764al0M9807e = m9807e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15683b;
            if (c8764al0M9807e == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c8764al0M9807e = (C8764al0) obj;
                    if (!c8764al0M9807e.mo4469h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c8764al0M9807e);
                }
            }
            if (c8764al0M9807e instanceof C10941rj0) {
                return (((C10941rj0) c8764al0M9807e).f41834d & i) == 0 && c8764al0M9807e.m9806d(c8764al0, i);
            }
            atomicReferenceFieldUpdater.set(c8764al0, c8764al0M9807e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15682a;
            atomicReferenceFieldUpdater2.set(c8764al0, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c8764al0M9807e, this, c8764al0)) {
                if (atomicReferenceFieldUpdater2.get(c8764al0M9807e) != this) {
                    break;
                }
            }
            c8764al0.m9808f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p000.WQ0) r6).f13178a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C8764al0 m9807e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C8764al0.f15683b
            java.lang.Object r1 = r0.get(r9)
            al0 r1 = (p000.C8764al0) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C8764al0.f15682a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo4469h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof p000.WQ0
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            WQ0 r6 = (p000.WQ0) r6
            al0 r6 = r6.f13178a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            al0 r3 = (p000.C8764al0) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            p000.O90.m5966d(r6, r4)
            r4 = r6
            al0 r4 = (p000.C8764al0) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8764al0.m9807e():al0");
    }

    /* renamed from: f */
    public final void m9808f(C8764al0 c8764al0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15683b;
            C8764al0 c8764al02 = (C8764al0) atomicReferenceFieldUpdater.get(c8764al0);
            if (f15682a.get(this) != c8764al0) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c8764al0, c8764al02, this)) {
                if (atomicReferenceFieldUpdater.get(c8764al0) != c8764al02) {
                    break;
                }
            }
            if (mo4469h()) {
                c8764al0.m9807e();
                return;
            }
            return;
        }
    }

    /* renamed from: g */
    public final C8764al0 m9809g() {
        C8764al0 c8764al0;
        Object obj = f15682a.get(this);
        WQ0 wq0 = obj instanceof WQ0 ? (WQ0) obj : null;
        if (wq0 != null && (c8764al0 = wq0.f13178a) != null) {
            return c8764al0;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C8764al0) obj;
    }

    /* renamed from: h */
    public boolean mo4469h() {
        return f15682a.get(this) instanceof WQ0;
    }

    public String toString() {
        return new C8634Zk0(this, AbstractC7187yD.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC7187yD.m26097c(this);
    }
}

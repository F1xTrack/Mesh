package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: al0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2194al0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2194al0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C2194al0.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C2194al0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(C2194al0 c2194al0, int i) {
        while (true) {
            C2194al0 c2194al0E = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (c2194al0E == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c2194al0E = (C2194al0) obj;
                    if (!c2194al0E.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2194al0E);
                }
            }
            if (c2194al0E instanceof C6893rj0) {
                return (((C6893rj0) c2194al0E).d & i) == 0 && c2194al0E.d(c2194al0, i);
            }
            atomicReferenceFieldUpdater.set(c2194al0, c2194al0E);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(c2194al0, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c2194al0E, this, c2194al0)) {
                if (atomicReferenceFieldUpdater2.get(c2194al0E) != this) {
                    break;
                }
            }
            c2194al0.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.WQ0) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C2194al0 e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C2194al0.b
            java.lang.Object r1 = r0.get(r9)
            al0 r1 = (defpackage.C2194al0) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C2194al0.a
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
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.WQ0
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            WQ0 r6 = (defpackage.WQ0) r6
            al0 r6 = r6.a
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
            al0 r3 = (defpackage.C2194al0) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.O90.d(r6, r4)
            r4 = r6
            al0 r4 = (defpackage.C2194al0) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2194al0.e():al0");
    }

    public final void f(C2194al0 c2194al0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            C2194al0 c2194al02 = (C2194al0) atomicReferenceFieldUpdater.get(c2194al0);
            if (a.get(this) != c2194al0) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2194al0, c2194al02, this)) {
                if (atomicReferenceFieldUpdater.get(c2194al0) != c2194al02) {
                    break;
                }
            }
            if (h()) {
                c2194al0.e();
                return;
            }
            return;
        }
    }

    public final C2194al0 g() {
        C2194al0 c2194al0;
        Object obj = a.get(this);
        WQ0 wq0 = obj instanceof WQ0 ? (WQ0) obj : null;
        if (wq0 != null && (c2194al0 = wq0.a) != null) {
            return c2194al0;
        }
        O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C2194al0) obj;
    }

    public boolean h() {
        return a.get(this) instanceof WQ0;
    }

    public String toString() {
        return new C2000Zk0(this, AbstractC8130yD.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC8130yD.c(this);
    }
}

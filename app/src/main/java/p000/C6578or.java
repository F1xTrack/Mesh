package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: or */
/* loaded from: classes2.dex */
public final class C6578or extends KX0 {

    /* renamed from: e */
    public final C0109Bj f39305e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f39306f;

    public C6578or(long j, C6578or c6578or, C0109Bj c0109Bj, int i) {
        super(j, c6578or, i);
        this.f39305e = c0109Bj;
        this.f39306f = new AtomicReferenceArray(AbstractC0235Dj.f2188b * 2);
    }

    @Override // p000.KX0
    /* renamed from: g */
    public final int mo4664g() {
        return AbstractC0235Dj.f2188b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        m23563n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        p000.O90.m5965c(r4);
        r7 = r4.f991c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        p000.QI1.m6628a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // p000.KX0
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4665h(int r7, p000.InterfaceC0125Bz r8) {
        /*
            r6 = this;
            int r0 = p000.AbstractC0235Dj.f2188b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f39306f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.m23561l(r7)
            boolean r3 = r2 instanceof p000.InterfaceC10564om1
            Bj r4 = r6.f39305e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof p000.C10692pm1
            if (r3 == 0) goto L22
            goto L6b
        L22:
            yG r3 = p000.AbstractC0235Dj.f2196j
            if (r2 == r3) goto L5b
            yG r3 = p000.AbstractC0235Dj.f2197k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            yG r3 = p000.AbstractC0235Dj.f2193g
            if (r2 == r3) goto L12
            yG r3 = p000.AbstractC0235Dj.f2192f
            if (r2 != r3) goto L34
            goto L12
        L34:
            yG r7 = p000.AbstractC0235Dj.f2195i
            if (r2 == r7) goto L5a
            yG r7 = p000.AbstractC0235Dj.f2190d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            yG r7 = p000.AbstractC0235Dj.f2198l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m23563n(r7, r5)
            if (r1 == 0) goto L6a
            p000.O90.m5965c(r4)
            nZ r7 = r4.f991c
            if (r7 == 0) goto L6a
            p000.QI1.m6628a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            yG r3 = p000.AbstractC0235Dj.f2196j
            goto L72
        L70:
            yG r3 = p000.AbstractC0235Dj.f2197k
        L72:
            boolean r2 = r6.m23560k(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m23563n(r7, r5)
            r2 = r1 ^ 1
            r6.m23562m(r7, r2)
            if (r1 == 0) goto L8c
            p000.O90.m5965c(r4)
            nZ r7 = r4.f991c
            if (r7 == 0) goto L8c
            p000.QI1.m6628a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6578or.mo4665h(int, Bz):void");
    }

    /* renamed from: k */
    public final boolean m23560k(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f39306f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public final Object m23561l(int i) {
        return this.f39306f.get((i * 2) + 1);
    }

    /* renamed from: m */
    public final void m23562m(int i, boolean z) {
        if (z) {
            C0109Bj c0109Bj = this.f39305e;
            O90.m5965c(c0109Bj);
            c0109Bj.m819B((this.f6149c * AbstractC0235Dj.f2188b) + i);
        }
        m4666i();
    }

    /* renamed from: n */
    public final void m23563n(int i, Object obj) {
        this.f39306f.set(i * 2, obj);
    }

    /* renamed from: o */
    public final void m23564o(int i, C7190yG c7190yG) {
        this.f39306f.set((i * 2) + 1, c7190yG);
    }
}

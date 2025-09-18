package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: or, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6344or extends KX0 {
    public final C0125Bj e;
    public final /* synthetic */ AtomicReferenceArray f;

    public C6344or(long j, C6344or c6344or, C0125Bj c0125Bj, int i) {
        super(j, c6344or, i);
        this.e = c0125Bj;
        this.f = new AtomicReferenceArray(AbstractC0281Dj.b * 2);
    }

    @Override // defpackage.KX0
    public final int g() {
        return AbstractC0281Dj.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        defpackage.O90.c(r4);
        r7 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        defpackage.QI1.a(r7, r0, r8);
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
    @Override // defpackage.KX0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, defpackage.InterfaceC0173Bz r8) {
        /*
            r6 = this;
            int r0 = defpackage.AbstractC0281Dj.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof defpackage.InterfaceC6331om1
            Bj r4 = r6.e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof defpackage.C6522pm1
            if (r3 == 0) goto L22
            goto L6b
        L22:
            yG r3 = defpackage.AbstractC0281Dj.j
            if (r2 == r3) goto L5b
            yG r3 = defpackage.AbstractC0281Dj.k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            yG r3 = defpackage.AbstractC0281Dj.g
            if (r2 == r3) goto L12
            yG r3 = defpackage.AbstractC0281Dj.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            yG r7 = defpackage.AbstractC0281Dj.i
            if (r2 == r7) goto L5a
            yG r7 = defpackage.AbstractC0281Dj.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            yG r7 = defpackage.AbstractC0281Dj.l
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
            r6.n(r7, r5)
            if (r1 == 0) goto L6a
            defpackage.O90.c(r4)
            nZ r7 = r4.c
            if (r7 == 0) goto L6a
            defpackage.QI1.a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            yG r3 = defpackage.AbstractC0281Dj.j
            goto L72
        L70:
            yG r3 = defpackage.AbstractC0281Dj.k
        L72:
            boolean r2 = r6.k(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L8c
            defpackage.O90.c(r4)
            nZ r7 = r4.c
            if (r7 == 0) goto L8c
            defpackage.QI1.a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6344or.h(int, Bz):void");
    }

    public final boolean k(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            C0125Bj c0125Bj = this.e;
            O90.c(c0125Bj);
            c0125Bj.B((this.c * AbstractC0281Dj.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, C8139yG c8139yG) {
        this.f.set((i * 2) + 1, c8139yG);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class AA0 implements U21 {
    public final InterfaceC0827Kj a;
    public final C6129nj b;
    public JX0 c;
    public int d;
    public boolean e;
    public long f;

    public AA0(InterfaceC0827Kj interfaceC0827Kj) {
        this.a = interfaceC0827Kj;
        C6129nj c6129njZ = interfaceC0827Kj.z();
        this.b = c6129njZ;
        JX0 jx0 = c6129njZ.a;
        this.c = jx0;
        this.d = jx0 != null ? jx0.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r10 == r0.b) goto L13;
     */
    @Override // defpackage.U21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long H(defpackage.C6129nj r9, long r10) {
        /*
            r8 = this;
            java.lang.String r10 = "sink"
            defpackage.O90.f(r9, r10)
            boolean r10 = r8.e
            if (r10 != 0) goto L5d
            JX0 r10 = r8.c
            nj r11 = r8.b
            if (r10 == 0) goto L25
            JX0 r0 = r11.a
            if (r10 != r0) goto L1d
            int r10 = r8.d
            defpackage.O90.c(r0)
            int r0 = r0.b
            if (r10 != r0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L25:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            Kj r10 = r8.a
            boolean r10 = r10.R(r0)
            if (r10 != 0) goto L35
            r9 = -1
            return r9
        L35:
            JX0 r10 = r8.c
            if (r10 != 0) goto L43
            JX0 r10 = r11.a
            if (r10 == 0) goto L43
            r8.c = r10
            int r10 = r10.b
            r8.d = r10
        L43:
            long r10 = r11.b
            long r0 = r8.f
            long r10 = r10 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r0, r10)
            nj r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r6 = r10
            r2.p(r3, r4, r6)
            long r0 = r8.f
            long r0 = r0 + r10
            r8.f = r0
            return r10
        L5d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AA0.H(nj, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return this.a.r();
    }
}

package p000;

/* loaded from: classes2.dex */
public final class AA0 implements U21 {

    /* renamed from: a */
    public final InterfaceC0676Kj f94a;

    /* renamed from: b */
    public final C6507nj f95b;

    /* renamed from: c */
    public JX0 f96c;

    /* renamed from: d */
    public int f97d;

    /* renamed from: e */
    public boolean f98e;

    /* renamed from: f */
    public long f99f;

    public AA0(InterfaceC0676Kj interfaceC0676Kj) {
        this.f94a = interfaceC0676Kj;
        C6507nj c6507njMo4709z = interfaceC0676Kj.mo4709z();
        this.f95b = c6507njMo4709z;
        JX0 jx0 = c6507njMo4709z.f38487a;
        this.f96c = jx0;
        this.f97d = jx0 != null ? jx0.f5580b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r10 == r0.f5580b) goto L13;
     */
    @Override // p000.U21
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo96H(p000.C6507nj r9, long r10) {
        /*
            r8 = this;
            java.lang.String r10 = "sink"
            p000.O90.m5968f(r9, r10)
            boolean r10 = r8.f98e
            if (r10 != 0) goto L5d
            JX0 r10 = r8.f96c
            nj r11 = r8.f95b
            if (r10 == 0) goto L25
            JX0 r0 = r11.f38487a
            if (r10 != r0) goto L1d
            int r10 = r8.f97d
            p000.O90.m5965c(r0)
            int r0 = r0.f5580b
            if (r10 != r0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L25:
            long r0 = r8.f99f
            r2 = 1
            long r0 = r0 + r2
            Kj r10 = r8.f94a
            boolean r10 = r10.mo4705R(r0)
            if (r10 != 0) goto L35
            r9 = -1
            return r9
        L35:
            JX0 r10 = r8.f96c
            if (r10 != 0) goto L43
            JX0 r10 = r11.f38487a
            if (r10 == 0) goto L43
            r8.f96c = r10
            int r10 = r10.f5580b
            r8.f97d = r10
        L43:
            long r10 = r11.f38488b
            long r0 = r8.f99f
            long r10 = r10 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r0, r10)
            nj r2 = r8.f95b
            long r4 = r8.f99f
            r3 = r9
            r6 = r10
            r2.m23192p(r3, r4, r6)
            long r0 = r8.f99f
            long r0 = r0 + r10
            r8.f99f = r0
            return r10
        L5d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AA0.mo96H(nj, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f98e = true;
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return this.f94a.mo97r();
    }
}

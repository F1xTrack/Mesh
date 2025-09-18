package p000;

/* loaded from: classes2.dex */
public final class HF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f4193d;

    /* renamed from: e */
    public int f4194e;

    /* renamed from: f */
    public int f4195f;

    /* renamed from: g */
    public AF0 f4196g;

    /* renamed from: h */
    public int f4197h;

    /* renamed from: i */
    public AF0 f4198i;

    /* renamed from: j */
    public int f4199j;

    public final Object clone() {
        HF0 hf0 = new HF0();
        AF0 af0 = AF0.f123t;
        hf0.f4196g = af0;
        hf0.f4198i = af0;
        hf0.m3336m(m3335l());
        return hf0;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        IF0 if0M3335l = m3335l();
        if (if0M3335l.mo131e()) {
            return if0M3335l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.IF0.f4861m     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            IF0 r1 = new IF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m3336m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            IF0 r4 = (p000.IF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m3336m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.HF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m3336m((IF0) a00);
        return this;
    }

    /* renamed from: l */
    public final IF0 m3335l() {
        IF0 if0 = new IF0(this);
        int i = this.f4193d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        if0.f4864d = this.f4194e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        if0.f4865e = this.f4195f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        if0.f4866f = this.f4196g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        if0.f4867g = this.f4197h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        if0.f4868h = this.f4198i;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        if0.f4869i = this.f4199j;
        if0.f4863c = i2;
        return if0;
    }

    /* renamed from: m */
    public final void m3336m(IF0 if0) {
        AF0 af0;
        AF0 af02;
        if (if0 == IF0.f4860l) {
            return;
        }
        int i = if0.f4863c;
        if ((i & 1) == 1) {
            int i2 = if0.f4864d;
            this.f4193d = 1 | this.f4193d;
            this.f4194e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = if0.f4865e;
            this.f4193d = 2 | this.f4193d;
            this.f4195f = i3;
        }
        if ((i & 4) == 4) {
            AF0 af03 = if0.f4866f;
            if ((this.f4193d & 4) != 4 || (af02 = this.f4196g) == AF0.f123t) {
                this.f4196g = af03;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af02);
                c11901zF0M126r.m26352n(af03);
                this.f4196g = c11901zF0M126r.m26351l();
            }
            this.f4193d |= 4;
        }
        int i4 = if0.f4863c;
        if ((i4 & 8) == 8) {
            int i5 = if0.f4867g;
            this.f4193d = 8 | this.f4193d;
            this.f4197h = i5;
        }
        if ((i4 & 16) == 16) {
            AF0 af04 = if0.f4868h;
            if ((this.f4193d & 16) != 16 || (af0 = this.f4198i) == AF0.f123t) {
                this.f4198i = af04;
            } else {
                C11901zF0 c11901zF0M126r2 = AF0.m126r(af0);
                c11901zF0M126r2.m26352n(af04);
                this.f4198i = c11901zF0M126r2.m26351l();
            }
            this.f4193d |= 16;
        }
        if ((if0.f4863c & 32) == 32) {
            int i6 = if0.f4869i;
            this.f4193d = 32 | this.f4193d;
            this.f4199j = i6;
        }
        m25292k(if0);
        this.f41281a = this.f41281a.m3573d(if0.f4862b);
    }
}

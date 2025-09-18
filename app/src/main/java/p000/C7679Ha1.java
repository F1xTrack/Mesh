package p000;

/* renamed from: Ha1 */
/* loaded from: classes.dex */
public final class C7679Ha1 implements WS0 {

    /* renamed from: b */
    public final long f4354b;

    /* renamed from: c */
    public final WS0 f4355c;

    public C7679Ha1(long j, WS0 ws0) {
        AbstractC9104dM1.m17545d("Timeout must be non-negative.", j >= 0);
        this.f4354b = j;
        this.f4355c = ws0;
    }

    @Override // p000.WS0
    /* renamed from: a */
    public final long mo2782a() {
        return this.f4354b;
    }

    @Override // p000.WS0
    /* renamed from: b */
    public final VS0 mo2783b(C0303Eo c0303Eo) {
        VS0 vs0Mo2783b = this.f4355c.mo2783b(c0303Eo);
        long j = this.f4354b;
        if (j > 0) {
            return c0303Eo.f2908b >= j - vs0Mo2783b.f12582a ? VS0.f12579d : vs0Mo2783b;
        }
        return vs0Mo2783b;
    }
}

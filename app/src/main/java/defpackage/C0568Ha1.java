package defpackage;

/* renamed from: Ha1 */
/* loaded from: classes.dex */
public final class C0568Ha1 implements WS0 {
    public final long b;
    public final WS0 c;

    public C0568Ha1(long j, WS0 ws0) {
        AbstractC3377dM1.d("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = ws0;
    }

    @Override // defpackage.WS0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.WS0
    public final VS0 b(C0374Eo c0374Eo) {
        VS0 vs0B = this.c.b(c0374Eo);
        long j = this.b;
        if (j > 0) {
            return c0374Eo.b >= j - vs0B.a ? VS0.d : vs0B;
        }
        return vs0B;
    }
}

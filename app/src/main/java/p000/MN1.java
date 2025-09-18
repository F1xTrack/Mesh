package p000;

/* loaded from: classes.dex */
public abstract class MN1 {
    /* renamed from: a */
    public static final void m5359a(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26233j("toIndex (", ") is greater than size (", i, i2, ")."));
        }
    }

    /* renamed from: b */
    public static RH0 m5360b(R00 r00, int i, int i2, S00 s00) {
        O90.m5968f(r00, "handler");
        O90.m5968f(s00, "dataBuilder");
        RH0 rh0 = (RH0) RH0.f10107d.mo4581i();
        if (rh0 == null) {
            rh0 = new RH0();
        }
        RH0.m6930a(rh0, r00, i, i2, s00);
        return rh0;
    }
}

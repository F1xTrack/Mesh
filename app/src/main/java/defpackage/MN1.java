package defpackage;

/* loaded from: classes.dex */
public abstract class MN1 {
    public static final void a(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.j("toIndex (", ") is greater than size (", i, i2, ")."));
        }
    }

    public static RH0 b(R00 r00, int i, int i2, S00 s00) {
        O90.f(r00, "handler");
        O90.f(s00, "dataBuilder");
        RH0 rh0 = (RH0) RH0.d.i();
        if (rh0 == null) {
            rh0 = new RH0();
        }
        RH0.a(rh0, r00, i, i2, s00);
        return rh0;
    }
}

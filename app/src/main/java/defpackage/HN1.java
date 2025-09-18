package defpackage;

/* loaded from: classes.dex */
public abstract class HN1 {
    public static final C6563q0 a(Object[] objArr) {
        O90.f(objArr, "array");
        return new C6563q0(objArr);
    }

    public static FH0 b(R00 r00, S00 s00, boolean z) {
        O90.f(r00, "handler");
        O90.f(s00, "dataBuilder");
        FH0 fh0 = (FH0) FH0.d.i();
        if (fh0 == null) {
            fh0 = new FH0();
        }
        FH0.a(fh0, r00, s00, z);
        return fh0;
    }
}

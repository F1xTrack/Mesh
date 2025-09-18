package defpackage;

/* loaded from: classes.dex */
public final class W00 implements D41 {
    public final C0589Hh1 a;
    public final S81 b;

    public W00(C0589Hh1 c0589Hh1, S81 s81) {
        this.a = c0589Hh1;
        this.b = s81;
    }

    @Override // defpackage.D41
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.D41
    public final boolean b(C5541ke c5541ke) {
        if (c5541ke.b != 4 || this.a.a(c5541ke)) {
            return false;
        }
        String str = c5541ke.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.b(new C1432Sd(c5541ke.e, c5541ke.f, str));
        return true;
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class X00 implements D41 {
    public final S81 a;

    public X00(S81 s81) {
        this.a = s81;
    }

    @Override // defpackage.D41
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.D41
    public final boolean b(C5541ke c5541ke) {
        int i = c5541ke.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(c5541ke.a);
        return true;
    }
}

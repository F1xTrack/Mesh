package defpackage;

/* renamed from: fk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3829fk0 {
    public final int a;
    public final long b;

    public /* synthetic */ C3829fk0(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
    }

    public static C3829fk0 b(C7566vF c7566vF, C4103hA0 c4103hA0) {
        c7566vF.f(c4103hA0.a, 0, 8, false);
        c4103hA0.G(0);
        return new C3829fk0(c4103hA0.g(), c4103hA0.l(), false);
    }

    public boolean a() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public C3829fk0(int i, long j) {
        YN1.c(j >= 0);
        this.a = i;
        this.b = j;
    }
}

package p000;

/* renamed from: fk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9407fk0 {

    /* renamed from: a */
    public final int f27363a;

    /* renamed from: b */
    public final long f27364b;

    public /* synthetic */ C9407fk0(int i, long j, boolean z) {
        this.f27363a = i;
        this.f27364b = j;
    }

    /* renamed from: b */
    public static C9407fk0 m18290b(C7000vF c7000vF, C9591hA0 c9591hA0) {
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 8, false);
        c9591hA0.m18741G(0);
        return new C9407fk0(c9591hA0.m18749g(), c9591hA0.m18754l(), false);
    }

    /* renamed from: a */
    public boolean m18291a() {
        int i = this.f27363a;
        return i == 0 || i == 1;
    }

    public C9407fk0(int i, long j) {
        YN1.m9278c(j >= 0);
        this.f27363a = i;
        this.f27364b = j;
    }
}

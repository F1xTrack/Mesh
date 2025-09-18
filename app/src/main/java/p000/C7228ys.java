package p000;

/* renamed from: ys */
/* loaded from: classes2.dex */
public final class C7228ys {

    /* renamed from: a */
    public final C0055As f46522a;

    /* renamed from: b */
    public final C6770rs f46523b;

    public C7228ys(C0055As c0055As, C6770rs c6770rs) {
        O90.m5968f(c0055As, "classId");
        this.f46522a = c0055As;
        this.f46523b = c6770rs;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7228ys) {
            if (O90.m5963a(this.f46522a, ((C7228ys) obj).f46522a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46522a.hashCode();
    }
}

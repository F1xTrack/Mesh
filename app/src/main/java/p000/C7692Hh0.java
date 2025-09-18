package p000;

/* renamed from: Hh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7692Hh0 {

    /* renamed from: a */
    public final C8340Tt0 f4436a;

    /* renamed from: b */
    public final C9493gP0 f4437b;

    public C7692Hh0(C8340Tt0 c8340Tt0, C9493gP0 c9493gP0) {
        O90.m5968f(c8340Tt0, "name");
        this.f4436a = c8340Tt0;
        this.f4437b = c9493gP0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7692Hh0) {
            if (O90.m5963a(this.f4436a, ((C7692Hh0) obj).f4436a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4436a.hashCode();
    }
}

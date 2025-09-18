package p000;

/* renamed from: Gz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7676Gz0 implements InterfaceC6644ps {

    /* renamed from: a */
    public final Class f3975a;

    public C7676Gz0(Class cls, String str) {
        O90.m5968f(cls, "jClass");
        this.f3975a = cls;
    }

    @Override // p000.InterfaceC6644ps
    /* renamed from: b */
    public final Class mo2807b() {
        return this.f3975a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7676Gz0) {
            if (O90.m5963a(this.f3975a, ((C7676Gz0) obj).f3975a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3975a.hashCode();
    }

    public final String toString() {
        return this.f3975a.toString() + " (Kotlin reflection is not available)";
    }
}

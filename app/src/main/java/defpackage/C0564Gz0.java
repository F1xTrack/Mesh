package defpackage;

/* renamed from: Gz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0564Gz0 implements InterfaceC6538ps {
    public final Class a;

    public C0564Gz0(Class cls, String str) {
        O90.f(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.InterfaceC6538ps
    public final Class b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0564Gz0) {
            if (O90.a(this.a, ((C0564Gz0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}

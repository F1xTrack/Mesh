package p000;

/* renamed from: jt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9938jt1 {

    /* renamed from: a */
    public final String f35445a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9938jt1) {
            if (O90.m5963a(this.f35445a, ((C9938jt1) obj).f35445a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35445a.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("VersionName(value="), this.f35445a, ')');
    }
}

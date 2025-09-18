package defpackage;

/* renamed from: jt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5397jt1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof C5397jt1) {
            if (O90.a(this.a, ((C5397jt1) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("VersionName(value="), this.a, ')');
    }
}

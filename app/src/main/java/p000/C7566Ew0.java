package p000;

/* renamed from: Ew0 */
/* loaded from: classes2.dex */
public final class C7566Ew0 {

    /* renamed from: a */
    public final EnumC7514Dw0 f2977a;

    /* renamed from: b */
    public final boolean f2978b;

    public C7566Ew0(EnumC7514Dw0 enumC7514Dw0) {
        this.f2977a = enumC7514Dw0;
        this.f2978b = false;
    }

    /* renamed from: a */
    public static C7566Ew0 m2458a(C7566Ew0 c7566Ew0, EnumC7514Dw0 enumC7514Dw0, boolean z, int i) {
        if ((i & 1) != 0) {
            enumC7514Dw0 = c7566Ew0.f2977a;
        }
        if ((i & 2) != 0) {
            z = c7566Ew0.f2978b;
        }
        c7566Ew0.getClass();
        O90.m5968f(enumC7514Dw0, "qualifier");
        return new C7566Ew0(enumC7514Dw0, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7566Ew0)) {
            return false;
        }
        C7566Ew0 c7566Ew0 = (C7566Ew0) obj;
        return this.f2977a == c7566Ew0.f2977a && this.f2978b == c7566Ew0.f2978b;
    }

    public final int hashCode() {
        return (this.f2977a.hashCode() * 31) + (this.f2978b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f2977a);
        sb.append(", isForWarningOnly=");
        return F91.m2540w(sb, this.f2978b, ')');
    }

    public C7566Ew0(EnumC7514Dw0 enumC7514Dw0, boolean z) {
        this.f2977a = enumC7514Dw0;
        this.f2978b = z;
    }
}

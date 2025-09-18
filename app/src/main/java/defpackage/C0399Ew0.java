package defpackage;

/* renamed from: Ew0 */
/* loaded from: classes2.dex */
public final class C0399Ew0 {
    public final EnumC0321Dw0 a;
    public final boolean b;

    public C0399Ew0(EnumC0321Dw0 enumC0321Dw0) {
        this.a = enumC0321Dw0;
        this.b = false;
    }

    public static C0399Ew0 a(C0399Ew0 c0399Ew0, EnumC0321Dw0 enumC0321Dw0, boolean z, int i) {
        if ((i & 1) != 0) {
            enumC0321Dw0 = c0399Ew0.a;
        }
        if ((i & 2) != 0) {
            z = c0399Ew0.b;
        }
        c0399Ew0.getClass();
        O90.f(enumC0321Dw0, "qualifier");
        return new C0399Ew0(enumC0321Dw0, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0399Ew0)) {
            return false;
        }
        C0399Ew0 c0399Ew0 = (C0399Ew0) obj;
        return this.a == c0399Ew0.a && this.b == c0399Ew0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return F91.w(sb, this.b, ')');
    }

    public C0399Ew0(EnumC0321Dw0 enumC0321Dw0, boolean z) {
        this.a = enumC0321Dw0;
        this.b = z;
    }
}

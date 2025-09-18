package defpackage;

/* renamed from: Sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1462Sn {
    public final boolean a;
    public final boolean b;
    public final EnumC7188tG0 c;

    public C1462Sn(boolean z, boolean z2, EnumC7188tG0 enumC7188tG0) {
        O90.f(enumC7188tG0, "photoQualityBalance");
        this.a = z;
        this.b = z2;
        this.c = enumC7188tG0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1462Sn)) {
            return false;
        }
        C1462Sn c1462Sn = (C1462Sn) obj;
        return this.a == c1462Sn.a && this.b == c1462Sn.b && this.c == c1462Sn.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Photo(isMirrored=" + this.a + ", enableHdr=" + this.b + ", photoQualityBalance=" + this.c + ")";
    }
}

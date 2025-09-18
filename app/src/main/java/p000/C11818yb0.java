package p000;

import java.util.Set;

/* renamed from: yb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11818yb0 {

    /* renamed from: a */
    public final EnumC11952ze1 f46326a;

    /* renamed from: b */
    public final EnumC7368Bb0 f46327b;

    /* renamed from: c */
    public final boolean f46328c;

    /* renamed from: d */
    public final boolean f46329d;

    /* renamed from: e */
    public final Set f46330e;

    /* renamed from: f */
    public final X01 f46331f;

    public C11818yb0(EnumC11952ze1 enumC11952ze1, EnumC7368Bb0 enumC7368Bb0, boolean z, boolean z2, Set set, X01 x01) {
        O90.m5968f(enumC7368Bb0, "flexibility");
        this.f46326a = enumC11952ze1;
        this.f46327b = enumC7368Bb0;
        this.f46328c = z;
        this.f46329d = z2;
        this.f46330e = set;
        this.f46331f = x01;
    }

    /* renamed from: a */
    public static C11818yb0 m26174a(C11818yb0 c11818yb0, EnumC7368Bb0 enumC7368Bb0, boolean z, Set set, X01 x01, int i) {
        EnumC11952ze1 enumC11952ze1 = c11818yb0.f46326a;
        if ((i & 2) != 0) {
            enumC7368Bb0 = c11818yb0.f46327b;
        }
        EnumC7368Bb0 enumC7368Bb02 = enumC7368Bb0;
        if ((i & 4) != 0) {
            z = c11818yb0.f46328c;
        }
        boolean z2 = z;
        boolean z3 = c11818yb0.f46329d;
        if ((i & 16) != 0) {
            set = c11818yb0.f46330e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            x01 = c11818yb0.f46331f;
        }
        c11818yb0.getClass();
        O90.m5968f(enumC11952ze1, "howThisTypeIsUsed");
        O90.m5968f(enumC7368Bb02, "flexibility");
        return new C11818yb0(enumC11952ze1, enumC7368Bb02, z2, z3, set2, x01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11818yb0)) {
            return false;
        }
        C11818yb0 c11818yb0 = (C11818yb0) obj;
        return O90.m5963a(c11818yb0.f46331f, this.f46331f) && c11818yb0.f46326a == this.f46326a && c11818yb0.f46327b == this.f46327b && c11818yb0.f46328c == this.f46328c && c11818yb0.f46329d == this.f46329d;
    }

    public final int hashCode() {
        X01 x01 = this.f46331f;
        int iHashCode = x01 != null ? x01.hashCode() : 0;
        int iHashCode2 = this.f46326a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f46327b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f46328c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f46329d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f46326a + ", flexibility=" + this.f46327b + ", isRaw=" + this.f46328c + ", isForAnnotationParameter=" + this.f46329d + ", visitedTypeParameters=" + this.f46330e + ", defaultType=" + this.f46331f + ')';
    }

    public /* synthetic */ C11818yb0(EnumC11952ze1 enumC11952ze1, boolean z, boolean z2, Set set, int i) {
        this(enumC11952ze1, EnumC7368Bb0.f934a, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }
}

package defpackage;

import java.util.Set;

/* renamed from: yb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8203yb0 {
    public final EnumC8403ze1 a;
    public final EnumC0102Bb0 b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final X01 f;

    public C8203yb0(EnumC8403ze1 enumC8403ze1, EnumC0102Bb0 enumC0102Bb0, boolean z, boolean z2, Set set, X01 x01) {
        O90.f(enumC0102Bb0, "flexibility");
        this.a = enumC8403ze1;
        this.b = enumC0102Bb0;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = x01;
    }

    public static C8203yb0 a(C8203yb0 c8203yb0, EnumC0102Bb0 enumC0102Bb0, boolean z, Set set, X01 x01, int i) {
        EnumC8403ze1 enumC8403ze1 = c8203yb0.a;
        if ((i & 2) != 0) {
            enumC0102Bb0 = c8203yb0.b;
        }
        EnumC0102Bb0 enumC0102Bb02 = enumC0102Bb0;
        if ((i & 4) != 0) {
            z = c8203yb0.c;
        }
        boolean z2 = z;
        boolean z3 = c8203yb0.d;
        if ((i & 16) != 0) {
            set = c8203yb0.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            x01 = c8203yb0.f;
        }
        c8203yb0.getClass();
        O90.f(enumC8403ze1, "howThisTypeIsUsed");
        O90.f(enumC0102Bb02, "flexibility");
        return new C8203yb0(enumC8403ze1, enumC0102Bb02, z2, z3, set2, x01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8203yb0)) {
            return false;
        }
        C8203yb0 c8203yb0 = (C8203yb0) obj;
        return O90.a(c8203yb0.f, this.f) && c8203yb0.a == this.a && c8203yb0.b == this.b && c8203yb0.c == this.c && c8203yb0.d == this.d;
    }

    public final int hashCode() {
        X01 x01 = this.f;
        int iHashCode = x01 != null ? x01.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public /* synthetic */ C8203yb0(EnumC8403ze1 enumC8403ze1, boolean z, boolean z2, Set set, int i) {
        this(enumC8403ze1, EnumC0102Bb0.a, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }
}

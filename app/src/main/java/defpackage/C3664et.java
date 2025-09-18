package defpackage;

/* renamed from: et, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3664et {
    public static final C3664et b = new C3664et();
    public final C1591Ue a = C1591Ue.e("1.4.0");

    public static C3664et a() {
        return b;
    }

    public static boolean c(C1591Ue c1591Ue) {
        return b.a.a(c1591Ue.a, c1591Ue.b) <= 0;
    }

    public static boolean d(C1591Ue c1591Ue) {
        return b.a.a(c1591Ue.a, c1591Ue.b) >= 0;
    }

    public final C1591Ue b() {
        return this.a;
    }

    public final String e() {
        return this.a.toString();
    }
}

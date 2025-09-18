package defpackage;

/* renamed from: gV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3974gV extends GA0 {
    public static final C7533v4 b = C7533v4.d();
    public final C2457c8 a;

    public C3974gV(C2457c8 c2457c8) {
        this.a = c2457c8;
    }

    @Override // defpackage.GA0
    public final boolean a() {
        C7533v4 c7533v4 = b;
        C2457c8 c2457c8 = this.a;
        if (c2457c8 == null || !c2457c8.E() || !c2457c8.C() || !c2457c8.D()) {
            c7533v4.f();
        } else {
            if (!c2457c8.B()) {
                return true;
            }
            if (c2457c8.z().y() && c2457c8.z().z()) {
                return true;
            }
            c7533v4.f();
        }
        c7533v4.f();
        return false;
    }
}

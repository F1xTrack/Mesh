package defpackage;

/* renamed from: iV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4356iV extends GA0 {
    public final C5800m00 a;

    public C4356iV(C5800m00 c5800m00) {
        this.a = c5800m00;
    }

    @Override // defpackage.GA0
    public final boolean a() {
        C5800m00 c5800m00 = this.a;
        return c5800m00.D() && (c5800m00.z() > 0 || c5800m00.y() > 0 || (c5800m00.C() && c5800m00.B().y()));
    }
}

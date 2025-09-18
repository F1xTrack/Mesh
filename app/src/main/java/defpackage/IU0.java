package defpackage;

/* loaded from: classes2.dex */
public final class IU0 {
    public final WM a;
    public final KU0 b;
    public final HU0 c;

    public IU0(WM wm, KU0 ku0, HU0 hu0) {
        O90.f(wm, "insets");
        O90.f(ku0, "mode");
        this.a = wm;
        this.b = ku0;
        this.c = hu0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IU0)) {
            return false;
        }
        IU0 iu0 = (IU0) obj;
        return O90.a(this.a, iu0.a) && this.b == iu0.b && O90.a(this.c, iu0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewLocalData(insets=" + this.a + ", mode=" + this.b + ", edges=" + this.c + ")";
    }
}

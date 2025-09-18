package p000;

/* loaded from: classes2.dex */
public final class IU0 {

    /* renamed from: a */
    public final C1407WM f4954a;

    /* renamed from: b */
    public final KU0 f4955b;

    /* renamed from: c */
    public final HU0 f4956c;

    public IU0(C1407WM c1407wm, KU0 ku0, HU0 hu0) {
        O90.m5968f(c1407wm, "insets");
        O90.m5968f(ku0, "mode");
        this.f4954a = c1407wm;
        this.f4955b = ku0;
        this.f4956c = hu0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IU0)) {
            return false;
        }
        IU0 iu0 = (IU0) obj;
        return O90.m5963a(this.f4954a, iu0.f4954a) && this.f4955b == iu0.f4955b && O90.m5963a(this.f4956c, iu0.f4956c);
    }

    public final int hashCode() {
        return this.f4956c.hashCode() + ((this.f4955b.hashCode() + (this.f4954a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f4954a + ", mode=" + this.f4955b + ", edges=" + this.f4956c + ")";
    }
}

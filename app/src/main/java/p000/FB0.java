package p000;

/* loaded from: classes.dex */
public final class FB0 {

    /* renamed from: a */
    public final C1353VV f3085a;

    public FB0(C1353VV c1353vv) {
        this.f3085a = c1353vv;
    }

    /* renamed from: a */
    public final boolean m2544a(int... iArr) {
        C1353VV c1353vv = this.f3085a;
        for (int i : iArr) {
            if (c1353vv.f12594a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FB0) {
            return this.f3085a.equals(((FB0) obj).f3085a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3085a.hashCode();
    }
}

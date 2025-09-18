package defpackage;

/* loaded from: classes.dex */
public final class FB0 {
    public final VV a;

    public FB0(VV vv) {
        this.a = vv;
    }

    public final boolean a(int... iArr) {
        VV vv = this.a;
        for (int i : iArr) {
            if (vv.a.get(i)) {
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
            return this.a.equals(((FB0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

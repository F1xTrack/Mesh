package p000;

/* loaded from: classes.dex */
public final class BX0 {

    /* renamed from: a */
    public final EX0 f867a;

    /* renamed from: b */
    public final EX0 f868b;

    public BX0(EX0 ex0, EX0 ex02) {
        this.f867a = ex0;
        this.f868b = ex02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BX0.class != obj.getClass()) {
            return false;
        }
        BX0 bx0 = (BX0) obj;
        return this.f867a.equals(bx0.f867a) && this.f868b.equals(bx0.f868b);
    }

    public final int hashCode() {
        return this.f868b.hashCode() + (this.f867a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        EX0 ex0 = this.f867a;
        sb.append(ex0);
        EX0 ex02 = this.f868b;
        if (ex0.equals(ex02)) {
            str = "";
        } else {
            str = ", " + ex02;
        }
        return AbstractC1374Vq.m8593l(sb, str, "]");
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class BX0 {
    public final EX0 a;
    public final EX0 b;

    public BX0(EX0 ex0, EX0 ex02) {
        this.a = ex0;
        this.b = ex02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BX0.class != obj.getClass()) {
            return false;
        }
        BX0 bx0 = (BX0) obj;
        return this.a.equals(bx0.a) && this.b.equals(bx0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        EX0 ex0 = this.a;
        sb.append(ex0);
        EX0 ex02 = this.b;
        if (ex0.equals(ex02)) {
            str = "";
        } else {
            str = ", " + ex02;
        }
        return AbstractC1705Vq.l(sb, str, "]");
    }
}

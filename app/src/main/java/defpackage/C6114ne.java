package defpackage;

/* renamed from: ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6114ne {
    public final Integer a;

    public C6114ne(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6114ne)) {
            return false;
        }
        C6114ne c6114ne = (C6114ne) obj;
        Integer num = this.a;
        return num == null ? c6114ne.a == null : num.equals(c6114ne.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}

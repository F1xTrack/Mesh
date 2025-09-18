package p000;

/* renamed from: ne */
/* loaded from: classes.dex */
public final class C6502ne {

    /* renamed from: a */
    public final Integer f38427a;

    public C6502ne(Integer num) {
        this.f38427a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6502ne)) {
            return false;
        }
        C6502ne c6502ne = (C6502ne) obj;
        Integer num = this.f38427a;
        return num == null ? c6502ne.f38427a == null : num.equals(c6502ne.f38427a);
    }

    public final int hashCode() {
        Integer num = this.f38427a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f38427a + "}";
    }
}

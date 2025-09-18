package p000;

/* renamed from: Fd */
/* loaded from: classes.dex */
public final class C0355Fd extends AbstractC1223TR {

    /* renamed from: a */
    public final Integer f3359a;

    public C0355Fd(Integer num) {
        this.f3359a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1223TR)) {
            return false;
        }
        Integer num = this.f3359a;
        C0355Fd c0355Fd = (C0355Fd) ((AbstractC1223TR) obj);
        return num == null ? c0355Fd.f3359a == null : num.equals(c0355Fd.f3359a);
    }

    public final int hashCode() {
        Integer num = this.f3359a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f3359a + "}";
    }
}

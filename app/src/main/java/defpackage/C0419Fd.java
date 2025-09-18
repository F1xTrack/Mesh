package defpackage;

/* renamed from: Fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419Fd extends TR {
    public final Integer a;

    public C0419Fd(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TR)) {
            return false;
        }
        Integer num = this.a;
        C0419Fd c0419Fd = (C0419Fd) ((TR) obj);
        return num == null ? c0419Fd.a == null : num.equals(c0419Fd.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}

package p000;

/* renamed from: Gd */
/* loaded from: classes.dex */
public final class C0418Gd extends AbstractC1286UR {

    /* renamed from: a */
    public final C0355Fd f3823a;

    public C0418Gd(C0355Fd c0355Fd) {
        this.f3823a = c0355Fd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1286UR) {
            return this.f3823a.equals(((C0418Gd) ((AbstractC1286UR) obj)).f3823a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3823a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f3823a + "}";
    }
}

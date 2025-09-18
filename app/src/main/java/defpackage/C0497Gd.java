package defpackage;

/* renamed from: Gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497Gd extends UR {
    public final C0419Fd a;

    public C0497Gd(C0419Fd c0419Fd) {
        this.a = c0419Fd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UR) {
            return this.a.equals(((C0497Gd) ((UR) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}

package defpackage;

/* renamed from: Ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032Ae {
    public final Throwable a;

    public C0032Ae(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0032Ae)) {
            return false;
        }
        return this.a.equals(((C0032Ae) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}

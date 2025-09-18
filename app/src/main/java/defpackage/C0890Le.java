package defpackage;

/* renamed from: Le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890Le {
    public final T61 a;

    public C0890Le(T61 t61) {
        if (t61 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.a = t61;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0890Le)) {
            return false;
        }
        C0890Le c0890Le = (C0890Le) obj;
        c0890Le.getClass();
        return this.a.equals(c0890Le.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}

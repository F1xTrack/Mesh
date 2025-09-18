package p000;

/* renamed from: Le */
/* loaded from: classes.dex */
public final class C0733Le {

    /* renamed from: a */
    public final T61 f6775a;

    public C0733Le(T61 t61) {
        if (t61 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f6775a = t61;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0733Le)) {
            return false;
        }
        C0733Le c0733Le = (C0733Le) obj;
        c0733Le.getClass();
        return this.f6775a.equals(c0733Le.f6775a);
    }

    public final int hashCode() {
        return this.f6775a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f6775a + "}";
    }
}

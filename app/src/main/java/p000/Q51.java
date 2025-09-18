package p000;

/* loaded from: classes2.dex */
public final class Q51 {

    /* renamed from: a */
    public final VH0 f9477a;

    /* renamed from: b */
    public final O51 f9478b;

    /* renamed from: c */
    public volatile boolean f9479c = true;

    public Q51(VH0 vh0, O51 o51) {
        this.f9477a = vh0;
        this.f9478b = o51;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q51)) {
            return false;
        }
        Q51 q51 = (Q51) obj;
        return this.f9477a == q51.f9477a && this.f9478b.equals(q51.f9478b);
    }

    public final int hashCode() {
        return this.f9478b.f8227f.hashCode() + this.f9477a.hashCode();
    }
}

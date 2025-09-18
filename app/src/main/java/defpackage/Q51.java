package defpackage;

/* loaded from: classes2.dex */
public final class Q51 {
    public final VH0 a;
    public final O51 b;
    public volatile boolean c = true;

    public Q51(VH0 vh0, O51 o51) {
        this.a = vh0;
        this.b = o51;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q51)) {
            return false;
        }
        Q51 q51 = (Q51) obj;
        return this.a == q51.a && this.b.equals(q51.b);
    }

    public final int hashCode() {
        return this.b.f.hashCode() + this.a.hashCode();
    }
}

package defpackage;

/* renamed from: iC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4299iC {
    public final C6997sG0 a;
    public final boolean b;

    public C4299iC(C6997sG0 c6997sG0, boolean z) {
        this.a = c6997sG0;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4299iC)) {
            return false;
        }
        C4299iC c4299iC = (C4299iC) obj;
        return c4299iC.a.equals(this.a) && c4299iC.b == this.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}

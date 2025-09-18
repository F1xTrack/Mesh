package defpackage;

/* loaded from: classes2.dex */
public final class L5 {
    public final I5 a;

    public L5(I5 i5) {
        O90.f(i5, "annotations");
        this.a = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L5) {
            return O90.a(((L5) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

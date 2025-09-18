package defpackage;

/* renamed from: oE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6228oE0 {
    public final int a;
    public final boolean b;

    public C6228oE0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6228oE0.class != obj.getClass()) {
            return false;
        }
        C6228oE0 c6228oE0 = (C6228oE0) obj;
        return this.a == c6228oE0.a && this.b == c6228oE0.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}

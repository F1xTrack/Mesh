package p000;

/* renamed from: oE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10495oE0 {

    /* renamed from: a */
    public final int f38899a;

    /* renamed from: b */
    public final boolean f38900b;

    public C10495oE0(int i, boolean z) {
        this.f38899a = i;
        this.f38900b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10495oE0.class != obj.getClass()) {
            return false;
        }
        C10495oE0 c10495oE0 = (C10495oE0) obj;
        return this.f38899a == c10495oE0.f38899a && this.f38900b == c10495oE0.f38900b;
    }

    public final int hashCode() {
        return (this.f38899a * 31) + (this.f38900b ? 1 : 0);
    }
}

package p000;

/* renamed from: g90 */
/* loaded from: classes2.dex */
public final class C9461g90 extends C9205e90 {

    /* renamed from: d */
    public static final C9461g90 f27588d = new C9461g90(1, 0, 1);

    @Override // p000.C9205e90
    public final boolean equals(Object obj) {
        if (obj instanceof C9461g90) {
            if (!isEmpty() || !((C9461g90) obj).isEmpty()) {
                C9461g90 c9461g90 = (C9461g90) obj;
                if (this.f26569a == c9461g90.f26569a) {
                    if (this.f26570b == c9461g90.f26570b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C9205e90
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f26569a * 31) + this.f26570b;
    }

    @Override // p000.C9205e90
    public final boolean isEmpty() {
        return this.f26569a > this.f26570b;
    }

    @Override // p000.C9205e90
    public final String toString() {
        return this.f26569a + ".." + this.f26570b;
    }
}

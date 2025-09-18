package defpackage;

/* renamed from: g90 */
/* loaded from: classes2.dex */
public final class C3909g90 extends C3527e90 {
    public static final C3909g90 d = new C3909g90(1, 0, 1);

    @Override // defpackage.C3527e90
    public final boolean equals(Object obj) {
        if (obj instanceof C3909g90) {
            if (!isEmpty() || !((C3909g90) obj).isEmpty()) {
                C3909g90 c3909g90 = (C3909g90) obj;
                if (this.a == c3909g90.a) {
                    if (this.b == c3909g90.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C3527e90
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.C3527e90
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.C3527e90
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

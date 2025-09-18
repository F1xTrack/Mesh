package defpackage;

/* renamed from: it1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5206it1 extends A12 {
    public final C6140nm1 a;

    public C5206it1(C6140nm1 c6140nm1) {
        this.a = c6140nm1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5206it1) && O90.a(this.a, ((C5206it1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(networkConfigDto=" + this.a + ')';
    }
}

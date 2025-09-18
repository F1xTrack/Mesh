package defpackage;

/* renamed from: gt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4048gt1 extends A12 {
    public final C6140nm1 a;

    public C4048gt1(C6140nm1 c6140nm1) {
        O90.f(c6140nm1, "networkConfigDto");
        this.a = c6140nm1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4048gt1) && O90.a(this.a, ((C4048gt1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotModified(networkConfigDto=" + this.a + ')';
    }
}

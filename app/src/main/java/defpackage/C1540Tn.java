package defpackage;

/* renamed from: Tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1540Tn {
    public final InterfaceC2473cD0 a;

    public C1540Tn(InterfaceC2473cD0 interfaceC2473cD0) {
        this.a = interfaceC2473cD0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1540Tn) && O90.a(this.a, ((C1540Tn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Preview(surfaceProvider=" + this.a + ")";
    }
}

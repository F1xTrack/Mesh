package defpackage;

/* renamed from: pe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6498pe1 {
    public final InterfaceC5925me1 a;
    public final C8203yb0 b;

    public C6498pe1(InterfaceC5925me1 interfaceC5925me1, C8203yb0 c8203yb0) {
        O90.f(interfaceC5925me1, "typeParameter");
        O90.f(c8203yb0, "typeAttr");
        this.a = interfaceC5925me1;
        this.b = c8203yb0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6498pe1)) {
            return false;
        }
        C6498pe1 c6498pe1 = (C6498pe1) obj;
        return O90.a(c6498pe1.a, this.a) && O90.a(c6498pe1.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}

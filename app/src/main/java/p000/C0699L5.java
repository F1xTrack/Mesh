package p000;

/* renamed from: L5 */
/* loaded from: classes2.dex */
public final class C0699L5 {

    /* renamed from: a */
    public final InterfaceC0510I5 f6483a;

    public C0699L5(InterfaceC0510I5 interfaceC0510I5) {
        O90.m5968f(interfaceC0510I5, "annotations");
        this.f6483a = interfaceC0510I5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0699L5) {
            return O90.m5963a(((C0699L5) obj).f6483a, this.f6483a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6483a.hashCode();
    }
}

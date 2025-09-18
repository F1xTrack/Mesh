package p000;

/* renamed from: Tn */
/* loaded from: classes2.dex */
public final class C1245Tn {

    /* renamed from: a */
    public final InterfaceC8952cD0 f11515a;

    public C1245Tn(InterfaceC8952cD0 interfaceC8952cD0) {
        this.f11515a = interfaceC8952cD0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1245Tn) && O90.m5963a(this.f11515a, ((C1245Tn) obj).f11515a);
    }

    public final int hashCode() {
        return this.f11515a.hashCode();
    }

    public final String toString() {
        return "Preview(surfaceProvider=" + this.f11515a + ")";
    }
}

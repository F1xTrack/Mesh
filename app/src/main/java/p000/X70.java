package p000;

/* loaded from: classes2.dex */
public final class X70 implements QN0 {

    /* renamed from: a */
    public final InterfaceC6976us f13567a;

    public X70(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        this.f13567a = interfaceC6976us;
    }

    public final boolean equals(Object obj) {
        X70 x70 = obj instanceof X70 ? (X70) obj : null;
        return O90.m5963a(this.f13567a, x70 != null ? x70.f13567a : null);
    }

    @Override // p000.QN0
    public final AbstractC7742Ig0 getType() {
        X01 x01Mo1492m = this.f13567a.mo1492m();
        O90.m5967e(x01Mo1492m, "getDefaultType(...)");
        return x01Mo1492m;
    }

    public final int hashCode() {
        return this.f13567a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        X01 x01Mo1492m = this.f13567a.mo1492m();
        O90.m5967e(x01Mo1492m, "getDefaultType(...)");
        sb.append(x01Mo1492m);
        sb.append('}');
        return sb.toString();
    }
}

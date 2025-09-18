package defpackage;

/* loaded from: classes2.dex */
public final class X70 implements QN0 {
    public final InterfaceC7492us a;

    public X70(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "classDescriptor");
        this.a = interfaceC7492us;
    }

    public final boolean equals(Object obj) {
        X70 x70 = obj instanceof X70 ? (X70) obj : null;
        return O90.a(this.a, x70 != null ? x70.a : null);
    }

    @Override // defpackage.QN0
    public final AbstractC0663Ig0 getType() {
        X01 x01M = this.a.m();
        O90.e(x01M, "getDefaultType(...)");
        return x01M;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        X01 x01M = this.a.m();
        O90.e(x01M, "getDefaultType(...)");
        sb.append(x01M);
        sb.append('}');
        return sb.toString();
    }
}

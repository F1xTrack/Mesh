package defpackage;

import java.util.List;

/* renamed from: Vh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1679Vh0 implements InterfaceC7454uf0 {
    public final InterfaceC1667Vd0 a;
    public final boolean b;
    public final InterfaceC5908mZ c;
    public InterfaceC7454uf0 d;

    public C1679Vh0(InterfaceC1667Vd0 interfaceC1667Vd0, boolean z, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC1667Vd0, "classifier");
        O90.f(interfaceC5908mZ, "kTypeProvider");
        this.a = interfaceC1667Vd0;
        this.b = z;
        this.c = interfaceC5908mZ;
    }

    public final InterfaceC7454uf0 b() {
        if (this.d == null) {
            this.d = (InterfaceC7454uf0) this.c.invoke();
        }
        InterfaceC7454uf0 interfaceC7454uf0 = this.d;
        O90.c(interfaceC7454uf0);
        return interfaceC7454uf0;
    }

    @Override // defpackage.InterfaceC7454uf0
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679Vh0)) {
            return b().equals(obj);
        }
        C1679Vh0 c1679Vh0 = (C1679Vh0) obj;
        return O90.a(this.a, c1679Vh0.a) && this.b == c1679Vh0.b;
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        return b().getAnnotations();
    }

    @Override // defpackage.InterfaceC7454uf0
    public final List h() {
        return b().h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC7454uf0
    public final InterfaceC4384ie0 i() {
        return this.a;
    }

    public final String toString() {
        return b().toString();
    }
}

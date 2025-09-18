package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: Cs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0231Cs0 extends DD implements InterfaceC0153Bs0 {
    public final C1922Yk0 d;
    public final AbstractC8408zg0 e;
    public final Map f;
    public final InterfaceC0876Kz0 g;
    public C0481Fx1 h;
    public InterfaceC0174Bz0 i;
    public final boolean j;
    public final C1454Sk0 k;
    public final F71 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231Cs0(C1559Tt0 c1559Tt0, C1922Yk0 c1922Yk0, AbstractC8408zg0 abstractC8408zg0, int i) {
        super(S20.b, c1559Tt0);
        NN nn = NN.a;
        O90.f(c1559Tt0, "moduleName");
        this.d = c1922Yk0;
        this.e = abstractC8408zg0;
        if (!c1559Tt0.b) {
            throw new IllegalArgumentException("Module name must be special: " + c1559Tt0);
        }
        this.f = nn;
        InterfaceC0876Kz0.a.getClass();
        InterfaceC0876Kz0 interfaceC0876Kz0 = (InterfaceC0876Kz0) q(C0396Ev0.g);
        this.g = interfaceC0876Kz0 == null ? C0798Jz0.b : interfaceC0876Kz0;
        this.j = true;
        this.k = c1922Yk0.b(new C8277z(27, this));
        this.l = LB.b(new C1508Tc0(this, 1));
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final List B0() {
        if (this.h != null) {
            return MN.a;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().a;
        O90.e(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final InterfaceC0720Iz0 C0(KX kx) {
        O90.f(kx, "fqName");
        x1();
        return (InterfaceC0720Iz0) this.k.invoke(kx);
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final boolean H(InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(interfaceC0153Bs0, "targetModule");
        if (equals(interfaceC0153Bs0)) {
            return true;
        }
        O90.c(this.h);
        if (AbstractC8069xu.v(SN.a, interfaceC0153Bs0)) {
            return true;
        }
        B0();
        MN.a.contains(interfaceC0153Bs0);
        return interfaceC0153Bs0.B0().contains(this);
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.n(this, obj);
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final AbstractC8408zg0 h() {
        return this.e;
    }

    @Override // defpackage.CD
    public final CD i() {
        return null;
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final Object q(VK vk) {
        O90.f(vk, "capability");
        Object obj = this.f.get(vk);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.DD, defpackage.U0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DD.w1(this));
        if (!this.j) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC0174Bz0 interfaceC0174Bz0 = this.i;
        sb.append(interfaceC0174Bz0 != null ? interfaceC0174Bz0.getClass().getSimpleName() : null);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final void x1() {
        if (this.j) {
            return;
        }
        if (q(AbstractC1968Yz1.a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        O90.f(str, "message");
        throw new C0311Dt(str);
    }
}

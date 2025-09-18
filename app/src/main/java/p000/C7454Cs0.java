package p000;

import java.util.List;
import java.util.Map;

/* renamed from: Cs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7454Cs0 extends AbstractC0203DD implements InterfaceC7402Bs0 {

    /* renamed from: d */
    public final C8582Yk0 f1734d;

    /* renamed from: e */
    public final AbstractC11955zg0 f1735e;

    /* renamed from: f */
    public final Map f1736f;

    /* renamed from: g */
    public final InterfaceC7884Kz0 f1737g;

    /* renamed from: h */
    public C7621Fx1 f1738h;

    /* renamed from: i */
    public InterfaceC7416Bz0 f1739i;

    /* renamed from: j */
    public final boolean f1740j;

    /* renamed from: k */
    public final C8270Sk0 f1741k;

    /* renamed from: l */
    public final F71 f1742l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7454Cs0(C8340Tt0 c8340Tt0, C8582Yk0 c8582Yk0, AbstractC11955zg0 abstractC11955zg0, int i) {
        super(S20.f10539b, c8340Tt0);
        C0842NN c0842nn = C0842NN.f7735a;
        O90.m5968f(c8340Tt0, "moduleName");
        this.f1734d = c8582Yk0;
        this.f1735e = abstractC11955zg0;
        if (!c8340Tt0.f11578b) {
            throw new IllegalArgumentException("Module name must be special: " + c8340Tt0);
        }
        this.f1736f = c0842nn;
        InterfaceC7884Kz0.f6416a.getClass();
        InterfaceC7884Kz0 interfaceC7884Kz0 = (InterfaceC7884Kz0) mo898q(C7564Ev0.f2964g);
        this.f1737g = interfaceC7884Kz0 == null ? C7832Jz0.f5829b : interfaceC7884Kz0;
        this.f1740j = true;
        this.f1741k = c8582Yk0.m9350b(new C7236z(27, this));
        this.f1742l = AbstractC0705LB.m4915b(new C8306Tc0(this, 1));
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: B0 */
    public final List mo894B0() {
        if (this.f1738h != null) {
            return C0779MN.f7117a;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f11577a;
        O90.m5967e(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: C0 */
    public final InterfaceC7780Iz0 mo895C0(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        m1425x1();
        return (InterfaceC7780Iz0) this.f1741k.invoke(c0664kx);
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: H */
    public final boolean mo896H(InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(interfaceC7402Bs0, "targetModule");
        if (equals(interfaceC7402Bs0)) {
            return true;
        }
        O90.m5965c(this.f1738h);
        if (AbstractC7167xu.m25994v(C1156SN.f10705a, interfaceC7402Bs0)) {
            return true;
        }
        mo894B0();
        C0779MN.f7117a.contains(interfaceC7402Bs0);
        return interfaceC7402Bs0.mo894B0().contains(this);
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2851n(this, obj);
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: h */
    public final AbstractC11955zg0 mo897h() {
        return this.f1735e;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        return null;
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: q */
    public final Object mo898q(C1342VK c1342vk) {
        O90.m5968f(c1342vk, "capability");
        Object obj = this.f1736f.get(c1342vk);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p000.AbstractC0203DD, p000.AbstractC1259U0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0203DD.m1597w1(this));
        if (!this.f1740j) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC7416Bz0 interfaceC7416Bz0 = this.f1739i;
        sb.append(interfaceC7416Bz0 != null ? interfaceC7416Bz0.getClass().getSimpleName() : null);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: x1 */
    public final void m1425x1() {
        if (this.f1740j) {
            return;
        }
        if (mo898q(AbstractC8613Yz1.f14632a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        O90.m5968f(str, "message");
        throw new C0245Dt(str);
    }
}

package p000;

import java.util.List;

/* renamed from: aP */
/* loaded from: classes2.dex */
public final class C1662aP implements InterfaceC7402Bs0 {

    /* renamed from: a */
    public static final C1662aP f15487a = new C1662aP();

    /* renamed from: b */
    public static final C8340Tt0 f15488b;

    /* renamed from: c */
    public static final C0779MN f15489c;

    /* renamed from: d */
    public static final F71 f15490d;

    static {
        EnumC1472XO[] enumC1472XOArr = EnumC1472XO.f13686a;
        f15488b = C8340Tt0.m7800g("<Error module>");
        f15489c = C0779MN.f7117a;
        f15490d = AbstractC0705LB.m4915b(C1450X2.f13522z);
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: B0 */
    public final List mo894B0() {
        return f15489c;
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: C0 */
    public final InterfaceC7780Iz0 mo895C0(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: H */
    public final boolean mo896H(InterfaceC7402Bs0 interfaceC7402Bs0) {
        O90.m5968f(interfaceC7402Bs0, "targetModule");
        return false;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return null;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return S20.f10539b;
    }

    @Override // p000.InterfaceC0140CD
    public final C8340Tt0 getName() {
        return f15488b;
    }

    @Override // p000.InterfaceC7402Bs0
    /* renamed from: h */
    public final AbstractC11955zg0 mo897h() {
        return (AbstractC11955zg0) f15490d.getValue();
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
        return null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this;
    }
}

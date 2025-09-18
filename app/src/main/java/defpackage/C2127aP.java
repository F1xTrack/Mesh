package defpackage;

import java.util.List;

/* renamed from: aP */
/* loaded from: classes2.dex */
public final class C2127aP implements InterfaceC0153Bs0 {
    public static final C2127aP a = new C2127aP();
    public static final C1559Tt0 b;
    public static final MN c;
    public static final F71 d;

    static {
        XO[] xoArr = XO.a;
        b = C1559Tt0.g("<Error module>");
        c = MN.a;
        d = LB.b(X2.z);
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final List B0() {
        return c;
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final InterfaceC0720Iz0 C0(KX kx) {
        O90.f(kx, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final boolean H(InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(interfaceC0153Bs0, "targetModule");
        return false;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return S20.b;
    }

    @Override // defpackage.CD
    public final C1559Tt0 getName() {
        return b;
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final AbstractC8408zg0 h() {
        return (AbstractC8408zg0) d.getValue();
    }

    @Override // defpackage.CD
    public final CD i() {
        return null;
    }

    @Override // defpackage.InterfaceC0153Bs0
    public final Object q(VK vk) {
        O90.f(vk, "capability");
        return null;
    }

    @Override // defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this;
    }
}

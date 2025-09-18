package defpackage;

import java.util.List;

/* renamed from: ii0 */
/* loaded from: classes2.dex */
public final class C4395ii0 extends AbstractC0663Ig0 {
    public final C1922Yk0 b;
    public final AbstractC1676Vg0 c;
    public final C1688Vk0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public C4395ii0(C1922Yk0 c1922Yk0, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(c1922Yk0, "storageManager");
        this.b = c1922Yk0;
        this.c = (AbstractC1676Vg0) interfaceC5908mZ;
        this.d = new C1688Vk0(c1922Yk0, interfaceC5908mZ);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        return P().B();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC1200Pd1 E() {
        return P().E();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final boolean G() {
        return P().G();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        return new C4395ii0(this.b, new C7726w5(c1130Og0, 19, this));
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC1521Tg1 L() {
        AbstractC0663Ig0 abstractC0663Ig0P = P();
        while (abstractC0663Ig0P instanceof C4395ii0) {
            abstractC0663Ig0P = ((C4395ii0) abstractC0663Ig0P).P();
        }
        O90.d(abstractC0663Ig0P, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC1521Tg1) abstractC0663Ig0P;
    }

    public final AbstractC0663Ig0 P() {
        return (AbstractC0663Ig0) this.d.invoke();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        return P().d0();
    }

    public final String toString() {
        C1688Vk0 c1688Vk0 = this.d;
        return (c1688Vk0.c == EnumC1844Xk0.a || c1688Vk0.c == EnumC1844Xk0.b) ? "<Not computed yet>" : P().toString();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return P().u();
    }
}

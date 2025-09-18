package p000;

import java.util.List;

/* renamed from: qq */
/* loaded from: classes2.dex */
public final class C6705qq implements InterfaceC10292me1 {

    /* renamed from: a */
    public final InterfaceC10292me1 f41199a;

    /* renamed from: b */
    public final InterfaceC0936Os f41200b;

    /* renamed from: c */
    public final int f41201c;

    public C6705qq(InterfaceC10292me1 interfaceC10292me1, InterfaceC0936Os interfaceC0936Os, int i) {
        O90.m5968f(interfaceC0936Os, "declarationDescriptor");
        this.f41199a = interfaceC10292me1;
        this.f41200b = interfaceC0936Os;
        this.f41201c = i;
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: D */
    public final boolean mo22917D() {
        return this.f41199a.mo22917D();
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: O */
    public final EnumC9532gi1 mo22918O() {
        return this.f41199a.mo22918O();
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return this.f41199a.mo421Z(interfaceC0392GD, obj);
    }

    @Override // p000.InterfaceC0873Ns, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0873Ns mo2089x1() {
        return this.f41199a.mo2089x1();
    }

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return this.f41199a.mo422e();
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return this.f41199a.getAnnotations();
    }

    @Override // p000.InterfaceC10292me1
    public final int getIndex() {
        return this.f41199a.getIndex() + this.f41201c;
    }

    @Override // p000.InterfaceC0140CD
    public final C8340Tt0 getName() {
        return this.f41199a.getName();
    }

    @Override // p000.InterfaceC10292me1
    public final Z41 getStorageManager() {
        return this.f41199a.getStorageManager();
    }

    @Override // p000.InterfaceC10292me1
    public final List getUpperBounds() {
        return this.f41199a.getUpperBounds();
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        return this.f41200b;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: m */
    public final X01 mo1492m() {
        return this.f41199a.mo1492m();
    }

    public final String toString() {
        return this.f41199a + "[inner-copy]";
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f41199a.mo1439v();
    }

    @Override // p000.InterfaceC10292me1
    /* renamed from: v0 */
    public final boolean mo22919v0() {
        return true;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this.f41199a.mo2089x1();
    }

    @Override // p000.InterfaceC10292me1, p000.InterfaceC0873Ns, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC10292me1 mo2089x1() {
        return this.f41199a.mo2089x1();
    }
}

package p000;

import java.util.List;

/* renamed from: dW */
/* loaded from: classes2.dex */
public abstract class AbstractC3933dW extends AbstractC8315Tg1 implements InterfaceC7950Mg0 {

    /* renamed from: b */
    public final X01 f26126b;

    /* renamed from: c */
    public final X01 f26127c;

    public AbstractC3933dW(X01 x01, X01 x012) {
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
        this.f26126b = x01;
        this.f26127c = x012;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        return mo17701U().mo3796B();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return mo17701U().mo3797E();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return mo17701U().mo3798G();
    }

    /* renamed from: U */
    public abstract X01 mo17701U();

    /* renamed from: a0 */
    public abstract String mo17702a0(C6417mI c6417mI, C6417mI c6417mI2);

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public InterfaceC10059kq0 mo3799d0() {
        return mo17701U().mo3799d0();
    }

    public String toString() {
        return C6417mI.f37619e.m22736X(this);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return mo17701U().mo3800u();
    }
}

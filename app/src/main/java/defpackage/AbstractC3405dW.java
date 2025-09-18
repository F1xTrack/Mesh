package defpackage;

import java.util.List;

/* renamed from: dW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3405dW extends AbstractC1521Tg1 implements InterfaceC0974Mg0 {
    public final X01 b;
    public final X01 c;

    public AbstractC3405dW(X01 x01, X01 x012) {
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
        this.b = x01;
        this.c = x012;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        return U().B();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC1200Pd1 E() {
        return U().E();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final boolean G() {
        return U().G();
    }

    public abstract X01 U();

    public abstract String a0(C5857mI c5857mI, C5857mI c5857mI2);

    @Override // defpackage.AbstractC0663Ig0
    public InterfaceC5578kq0 d0() {
        return U().d0();
    }

    public String toString() {
        return C5857mI.e.X(this);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return U().u();
    }
}

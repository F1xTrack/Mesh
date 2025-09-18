package defpackage;

/* renamed from: ef0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3623ef0 extends AbstractC6500pf0 implements InterfaceC2557cf0 {
    public final C4005gf0 j;

    public C3623ef0(C4005gf0 c4005gf0) {
        O90.f(c4005gf0, "property");
        this.j = c4005gf0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        return this.j.get(obj);
    }

    @Override // defpackage.InterfaceC1670Ve0
    public final InterfaceC5927mf0 k() {
        return this.j;
    }

    @Override // defpackage.AbstractC6118nf0
    public final AbstractC7263tf0 u() {
        return this.j;
    }
}

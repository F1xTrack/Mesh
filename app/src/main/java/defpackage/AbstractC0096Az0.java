package defpackage;

/* renamed from: Az0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0096Az0 extends FD implements InterfaceC8465zz0 {
    public final KX f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0096Az0(InterfaceC0153Bs0 interfaceC0153Bs0, KX kx) {
        super(interfaceC0153Bs0, S20.b, kx.g(), W21.O0);
        O90.f(interfaceC0153Bs0, "module");
        O90.f(kx, "fqName");
        this.f = kx;
        this.g = "package " + kx + " of " + interfaceC0153Bs0;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.r(this, obj);
    }

    @Override // defpackage.FD, defpackage.ED
    public W21 e() {
        return W21.O0;
    }

    @Override // defpackage.DD, defpackage.U0
    public String toString() {
        return this.g;
    }

    @Override // defpackage.FD, defpackage.CD
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0153Bs0 i() {
        CD cdI = super.i();
        O90.d(cdI, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC0153Bs0) cdI;
    }
}

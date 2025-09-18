package p000;

/* renamed from: Az0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7364Az0 extends AbstractC0329FD implements InterfaceC11993zz0 {

    /* renamed from: f */
    public final C0664KX f494f;

    /* renamed from: g */
    public final String f495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7364Az0(InterfaceC7402Bs0 interfaceC7402Bs0, C0664KX c0664kx) {
        super(interfaceC7402Bs0, S20.f10539b, c0664kx.m4659g(), W21.f12940O0);
        O90.m5968f(interfaceC7402Bs0, "module");
        O90.m5968f(c0664kx, "fqName");
        this.f494f = c0664kx;
        this.f495g = "package " + c0664kx + " of " + interfaceC7402Bs0;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2855r(this, obj);
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0266ED
    /* renamed from: e */
    public W21 mo422e() {
        return W21.f12940O0;
    }

    @Override // p000.AbstractC0203DD, p000.AbstractC1259U0
    public String toString() {
        return this.f495g;
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0140CD
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC7402Bs0 mo423i() {
        InterfaceC0140CD interfaceC0140CDMo423i = super.mo423i();
        O90.m5966d(interfaceC0140CDMo423i, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC7402Bs0) interfaceC0140CDMo423i;
    }
}

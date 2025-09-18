package p000;

/* loaded from: classes2.dex */
public class JV0 extends AbstractC0315F implements InterfaceC0880Nz {

    /* renamed from: d */
    public final InterfaceC1382Vy f5561d;

    public JV0(InterfaceC1382Vy interfaceC1382Vy, InterfaceC0125Bz interfaceC0125Bz) {
        super(interfaceC0125Bz, true);
        this.f5561d = interfaceC1382Vy;
    }

    @Override // p000.C9002cc0
    /* renamed from: E */
    public final boolean mo4336E() {
        return true;
    }

    @Override // p000.C9002cc0
    /* renamed from: d */
    public void mo1298d(Object obj) {
        EU0.m2316c(AbstractC10599p22.m23595b(this.f5561d), HT1.m3452b(obj));
    }

    @Override // p000.InterfaceC0880Nz
    public final InterfaceC0880Nz getCallerFrame() {
        InterfaceC1382Vy interfaceC1382Vy = this.f5561d;
        if (interfaceC1382Vy instanceof InterfaceC0880Nz) {
            return (InterfaceC0880Nz) interfaceC1382Vy;
        }
        return null;
    }

    @Override // p000.C9002cc0
    /* renamed from: h */
    public void mo4337h(Object obj) {
        this.f5561d.resumeWith(HT1.m3452b(obj));
    }
}

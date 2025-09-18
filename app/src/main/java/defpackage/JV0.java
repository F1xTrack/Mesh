package defpackage;

/* loaded from: classes2.dex */
public class JV0 extends F implements InterfaceC1108Nz {
    public final InterfaceC1729Vy d;

    public JV0(InterfaceC1729Vy interfaceC1729Vy, InterfaceC0173Bz interfaceC0173Bz) {
        super(interfaceC0173Bz, true);
        this.d = interfaceC1729Vy;
    }

    @Override // defpackage.C2548cc0
    public final boolean E() {
        return true;
    }

    @Override // defpackage.C2548cc0
    public void d(Object obj) {
        EU0.c(AbstractC6383p22.b(this.d), HT1.b(obj));
    }

    @Override // defpackage.InterfaceC1108Nz
    public final InterfaceC1108Nz getCallerFrame() {
        InterfaceC1729Vy interfaceC1729Vy = this.d;
        if (interfaceC1729Vy instanceof InterfaceC1108Nz) {
            return (InterfaceC1108Nz) interfaceC1729Vy;
        }
        return null;
    }

    @Override // defpackage.C2548cc0
    public void h(Object obj) {
        this.d.resumeWith(HT1.b(obj));
    }
}

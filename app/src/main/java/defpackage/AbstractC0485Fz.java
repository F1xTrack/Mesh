package defpackage;

/* renamed from: Fz */
/* loaded from: classes2.dex */
public abstract class AbstractC0485Fz extends G implements InterfaceC2041Zy {
    public static final C0407Ez b = new C0407Ez(C0240Cv0.c, new C0329Dz());

    public AbstractC0485Fz() {
        super(C0240Cv0.c);
    }

    @Override // defpackage.G, defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        boolean z = interfaceC0095Az instanceof C0407Ez;
        JN jn = JN.a;
        if (z) {
            C0407Ez c0407Ez = (C0407Ez) interfaceC0095Az;
            InterfaceC0095Az interfaceC0095Az2 = this.a;
            if ((interfaceC0095Az2 == c0407Ez || c0407Ez.b == interfaceC0095Az2) && ((InterfaceC8464zz) c0407Ez.a.invoke(this)) != null) {
                return jn;
            }
        } else if (C0240Cv0.c == interfaceC0095Az) {
            return jn;
        }
        return this;
    }

    @Override // defpackage.G, defpackage.InterfaceC0173Bz
    public final InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        if (!(interfaceC0095Az instanceof C0407Ez)) {
            if (C0240Cv0.c == interfaceC0095Az) {
                return this;
            }
            return null;
        }
        C0407Ez c0407Ez = (C0407Ez) interfaceC0095Az;
        InterfaceC0095Az interfaceC0095Az2 = this.a;
        if (interfaceC0095Az2 != c0407Ez && c0407Ez.b != interfaceC0095Az2) {
            return null;
        }
        InterfaceC8464zz interfaceC8464zz = (InterfaceC8464zz) c0407Ez.a.invoke(this);
        if (interfaceC8464zz instanceof InterfaceC8464zz) {
            return interfaceC8464zz;
        }
        return null;
    }

    public abstract void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable);

    public boolean n(InterfaceC0173Bz interfaceC0173Bz) {
        return !(this instanceof AbstractC1050Nf1);
    }

    public AbstractC0485Fz o(int i, String str) {
        AbstractC2136aS.b(i);
        return new C1448Si0(this, i, str);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC8130yD.c(this);
    }
}

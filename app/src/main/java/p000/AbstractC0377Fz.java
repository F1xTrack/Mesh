package p000;

/* renamed from: Fz */
/* loaded from: classes2.dex */
public abstract class AbstractC0377Fz extends AbstractC0378G implements InterfaceC1634Zy {

    /* renamed from: b */
    public static final C0314Ez f3499b = new C0314Ez(C7460Cv0.f1753c, new C0251Dz());

    public AbstractC0377Fz() {
        super(C7460Cv0.f1753c);
    }

    @Override // p000.AbstractC0378G, p000.InterfaceC0125Bz
    /* renamed from: c */
    public final InterfaceC0125Bz mo935c(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        boolean z = interfaceC0062Az instanceof C0314Ez;
        C0591JN c0591jn = C0591JN.f5499a;
        if (z) {
            C0314Ez c0314Ez = (C0314Ez) interfaceC0062Az;
            InterfaceC0062Az interfaceC0062Az2 = this.f3507a;
            if ((interfaceC0062Az2 == c0314Ez || c0314Ez.f2999b == interfaceC0062Az2) && ((InterfaceC7298zz) c0314Ez.f2998a.invoke(this)) != null) {
                return c0591jn;
            }
        } else if (C7460Cv0.f1753c == interfaceC0062Az) {
            return c0591jn;
        }
        return this;
    }

    @Override // p000.AbstractC0378G, p000.InterfaceC0125Bz
    /* renamed from: g */
    public final InterfaceC7298zz mo937g(InterfaceC0062Az interfaceC0062Az) {
        O90.m5968f(interfaceC0062Az, "key");
        if (!(interfaceC0062Az instanceof C0314Ez)) {
            if (C7460Cv0.f1753c == interfaceC0062Az) {
                return this;
            }
            return null;
        }
        C0314Ez c0314Ez = (C0314Ez) interfaceC0062Az;
        InterfaceC0062Az interfaceC0062Az2 = this.f3507a;
        if (interfaceC0062Az2 != c0314Ez && c0314Ez.f2999b != interfaceC0062Az2) {
            return null;
        }
        InterfaceC7298zz interfaceC7298zz = (InterfaceC7298zz) c0314Ez.f2998a.invoke(this);
        if (interfaceC7298zz instanceof InterfaceC7298zz) {
            return interfaceC7298zz;
        }
        return null;
    }

    /* renamed from: l */
    public abstract void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable);

    /* renamed from: n */
    public boolean mo2868n(InterfaceC0125Bz interfaceC0125Bz) {
        return !(this instanceof AbstractC8001Nf1);
    }

    /* renamed from: o */
    public AbstractC0377Fz mo2869o(int i, String str) {
        AbstractC1665aS.m9744b(i);
        return new C8266Si0(this, i, str);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC7187yD.m26097c(this);
    }
}

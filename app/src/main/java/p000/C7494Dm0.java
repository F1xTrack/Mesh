package p000;

/* renamed from: Dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7494Dm0 extends C7285zm {

    /* renamed from: d */
    public C0277EO f2235d;

    @Override // p000.C7285zm
    /* renamed from: d */
    public final int mo1872d(Object obj) {
        InterfaceC10011kS0 interfaceC10011kS0 = (InterfaceC10011kS0) obj;
        if (interfaceC10011kS0 == null) {
            return 1;
        }
        return interfaceC10011kS0.getSize();
    }

    @Override // p000.C7285zm
    /* renamed from: e */
    public final void mo1873e(Object obj, Object obj2) {
        InterfaceC10011kS0 interfaceC10011kS0 = (InterfaceC10011kS0) obj2;
        C0277EO c0277eo = this.f2235d;
        if (c0277eo == null || interfaceC10011kS0 == null) {
            return;
        }
        c0277eo.f2683e.m6126l(interfaceC10011kS0, true);
    }

    /* renamed from: h */
    public final void m1874h(int i) {
        long j;
        if (i >= 40) {
            m26538g(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f46985a;
            }
            m26538g(j / 2);
        }
    }
}

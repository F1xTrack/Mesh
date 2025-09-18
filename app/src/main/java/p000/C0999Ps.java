package p000;

import java.util.ArrayList;

/* renamed from: Ps */
/* loaded from: classes2.dex */
public final class C0999Ps implements InterfaceC1062Qs {

    /* renamed from: b */
    public static final C0999Ps f9318b = new C0999Ps(0);

    /* renamed from: c */
    public static final C0999Ps f9319c = new C0999Ps(1);

    /* renamed from: d */
    public static final C0999Ps f9320d = new C0999Ps(2);

    /* renamed from: a */
    public final /* synthetic */ int f9321a;

    public /* synthetic */ C0999Ps(int i) {
        this.f9321a = i;
    }

    /* renamed from: b */
    public static String m6461b(InterfaceC0873Ns interfaceC0873Ns) {
        String strM19033c;
        C8340Tt0 name = interfaceC0873Ns.getName();
        O90.m5967e(name, "getName(...)");
        String strM19032b = AbstractC9752iQ1.m19032b(name);
        if (interfaceC0873Ns instanceof InterfaceC10292me1) {
            return strM19032b;
        }
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0873Ns.mo423i();
        O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
        if (interfaceC0140CDMo423i instanceof InterfaceC6976us) {
            strM19033c = m6461b((InterfaceC0873Ns) interfaceC0140CDMo423i);
        } else if (interfaceC0140CDMo423i instanceof InterfaceC11993zz0) {
            C0789MX c0789mxM4661i = ((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CDMo423i)).f494f.m4661i();
            O90.m5967e(c0789mxM4661i, "toUnsafe(...)");
            strM19033c = AbstractC9752iQ1.m19033c(c0789mxM4661i.m5391e());
        } else {
            strM19033c = null;
        }
        if (strM19033c == null || strM19033c.equals("")) {
            return strM19032b;
        }
        return strM19033c + '.' + strM19032b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [CD, Ns] */
    /* JADX WARN: Type inference failed for: r2v8, types: [CD] */
    /* JADX WARN: Type inference failed for: r2v9, types: [CD] */
    @Override // p000.InterfaceC1062Qs
    /* renamed from: a */
    public final String mo6462a(InterfaceC0873Ns interfaceC0873Ns, C6417mI c6417mI) {
        switch (this.f9321a) {
            case 0:
                O90.m5968f(c6417mI, "renderer");
                if (interfaceC0873Ns instanceof InterfaceC10292me1) {
                    C8340Tt0 name = ((InterfaceC10292me1) interfaceC0873Ns).getName();
                    O90.m5967e(name, "getName(...)");
                    return c6417mI.m22727N(name, false);
                }
                C0789MX c0789mxM24695g = AbstractC6814sI.m24695g(interfaceC0873Ns);
                O90.m5967e(c0789mxM24695g, "getFqName(...)");
                return c6417mI.m22760o(AbstractC9752iQ1.m19033c(c0789mxM24695g.m5391e()));
            case 1:
                O90.m5968f(c6417mI, "renderer");
                if (interfaceC0873Ns instanceof InterfaceC10292me1) {
                    C8340Tt0 name2 = ((InterfaceC10292me1) interfaceC0873Ns).getName();
                    O90.m5967e(name2, "getName(...)");
                    return c6417mI.m22727N(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC0873Ns.getName());
                    interfaceC0873Ns = interfaceC0873Ns.mo423i();
                } while (interfaceC0873Ns instanceof InterfaceC6976us);
                return AbstractC9752iQ1.m19033c(new C9501gT0(arrayList));
            default:
                O90.m5968f(c6417mI, "renderer");
                return m6461b(interfaceC0873Ns);
        }
    }
}

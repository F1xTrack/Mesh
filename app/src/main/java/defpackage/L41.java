package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class L41 extends AbstractC5769lq0 {
    public static final /* synthetic */ InterfaceC5927mf0[] f;
    public final HI b;
    public final boolean c;
    public final C1688Vk0 d;
    public final C1688Vk0 e;

    static {
        IP0 ip0 = BP0.a;
        f = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(L41.class), "functions", "getFunctions()Ljava/util/List;")), ip0.f(new GE0(ip0.b(L41.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public L41(Z41 z41, HI hi, boolean z) {
        O90.f(z41, "storageManager");
        this.b = hi;
        this.c = z;
        EnumC0152Bs enumC0152Bs = EnumC0152Bs.a;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        this.d = new C1688Vk0(c1922Yk0, new K41(this, 0));
        this.e = new C1688Vk0(c1922Yk0, new K41(this, 1));
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        List list = (List) WS1.b(this.d, f[0]);
        C7718w21 c7718w21 = new C7718w21();
        for (Object obj : list) {
            if (O90.a(((U01) obj).getName(), c1559Tt0)) {
                c7718w21.add(obj);
            }
        }
        return c7718w21;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        List list = (List) WS1.b(this.e, f[1]);
        C7718w21 c7718w21 = new C7718w21();
        for (Object obj : list) {
            if (O90.a(((CE0) obj).getName(), c1559Tt0)) {
                c7718w21.add(obj);
            }
        }
        return c7718w21;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        C1688Vk0 c1688Vk0 = this.d;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = f;
        return AbstractC8069xu.N((List) WS1.b(c1688Vk0, interfaceC5927mf0Arr[0]), (List) WS1.b(this.e, interfaceC5927mf0Arr[1]));
    }
}

package defpackage;

import java.util.HashMap;

/* renamed from: Vc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665Vc1 implements InterfaceC1275Qc1 {
    public final C1513Te a;
    public final String b;
    public final C7973xO c;
    public final InterfaceC8207yc1 d;
    public final C2362bd1 e;

    public C1665Vc1(C1513Te c1513Te, String str, C7973xO c7973xO, InterfaceC8207yc1 interfaceC8207yc1, C2362bd1 c2362bd1) {
        this.a = c1513Te;
        this.b = str;
        this.c = c7973xO;
        this.d = interfaceC8207yc1;
        this.e = c2362bd1;
    }

    public final void a(C0029Ad c0029Ad, InterfaceC2552cd1 interfaceC2552cd1) {
        C1513Te c1513Te = this.a;
        String str = this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        InterfaceC8207yc1 interfaceC8207yc1 = this.d;
        if (interfaceC8207yc1 == null) {
            throw new NullPointerException("Null transformer");
        }
        C7973xO c7973xO = this.c;
        C2362bd1 c2362bd1 = this.e;
        C1513Te c1513TeB = c1513Te.b(c0029Ad.b);
        C0107Bd c0107Bd = new C0107Bd();
        c0107Bd.f = new HashMap();
        c0107Bd.d = Long.valueOf(c2362bd1.a.d());
        c0107Bd.e = Long.valueOf(c2362bd1.b.d());
        c0107Bd.a = str;
        c0107Bd.c = new ZN(c7973xO, (byte[]) interfaceC8207yc1.apply(c0029Ad.a));
        c0107Bd.b = null;
        C6114ne c6114ne = c0029Ad.c;
        if (c6114ne != null) {
            c0107Bd.g = c6114ne.a;
        }
        C0185Cd c0185CdB = c0107Bd.b();
        C7949xG c7949xG = (C7949xG) c2362bd1.c;
        c7949xG.getClass();
        c7949xG.b.execute(new RunnableC6880rf(c7949xG, c1513TeB, interfaceC2552cd1, c0185CdB, 5));
    }
}

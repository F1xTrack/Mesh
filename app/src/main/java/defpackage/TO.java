package defpackage;

import kotlin.Pair;

/* loaded from: classes2.dex */
public final class TO extends AbstractC0323Dx {
    public final C0074As b;
    public final C1559Tt0 c;

    public TO(C0074As c0074As, C1559Tt0 c1559Tt0) {
        super(new Pair(c0074As, c1559Tt0));
        this.b = c0074As;
        this.c = c1559Tt0;
    }

    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(interfaceC0153Bs0, "module");
        C0074As c0074As = this.b;
        InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0, c0074As);
        X01 x01M = null;
        if (interfaceC7492usB != null) {
            int i = AbstractC7002sI.a;
            if (!AbstractC7002sI.n(interfaceC7492usB, EnumC0152Bs.c)) {
                interfaceC7492usB = null;
            }
            if (interfaceC7492usB != null) {
                x01M = interfaceC7492usB.m();
            }
        }
        if (x01M != null) {
            return x01M;
        }
        EnumC5305jP enumC5305jP = EnumC5305jP.A;
        String string = c0074As.toString();
        O90.e(string, "toString(...)");
        String str = this.c.a;
        O90.e(str, "toString(...)");
        return C5496kP.c(enumC5305jP, string, str);
    }

    @Override // defpackage.AbstractC0323Dx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.i());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}

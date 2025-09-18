package defpackage;

import java.util.Iterator;

/* renamed from: xh0 */
/* loaded from: classes2.dex */
public final class C8031xh0 implements I5 {
    public final C6045nH a;
    public final InterfaceC1502Ta0 b;
    public final boolean c;
    public final C1766Wk0 d;

    public C8031xh0(C6045nH c6045nH, InterfaceC1502Ta0 interfaceC1502Ta0, boolean z) {
        O90.f(c6045nH, "c");
        O90.f(interfaceC1502Ta0, "annotationOwner");
        this.a = c6045nH;
        this.b = interfaceC1502Ta0;
        this.c = z;
        this.d = ((C1922Yk0) ((C4375ib0) c6045nH.b).a).c(new C8277z(23, this));
    }

    @Override // defpackage.I5
    public final InterfaceC7916x5 D(KX kx) {
        InterfaceC7916x5 interfaceC7916x5;
        O90.f(kx, "fqName");
        InterfaceC1502Ta0 interfaceC1502Ta0 = this.b;
        WO0 wo0A = interfaceC1502Ta0.a(kx);
        if (wo0A != null && (interfaceC7916x5 = (InterfaceC7916x5) this.d.invoke(wo0A)) != null) {
            return interfaceC7916x5;
        }
        C1559Tt0 c1559Tt0 = AbstractC1424Sa0.a;
        return AbstractC1424Sa0.a(kx, interfaceC1502Ta0, this.a);
    }

    @Override // defpackage.I5
    public final boolean g(KX kx) {
        return AbstractC6447pN1.c(this, kx);
    }

    @Override // defpackage.I5
    public final boolean isEmpty() {
        return this.b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC1502Ta0 interfaceC1502Ta0 = this.b;
        C0028Ac1 c0028Ac1L = AbstractC4175hY0.l(AbstractC8069xu.t(interfaceC1502Ta0.getAnnotations()), this.d);
        C1559Tt0 c1559Tt0 = AbstractC1424Sa0.a;
        return new C7801wU(new C7991xU(AbstractC4175hY0.i(J8.d(new InterfaceC3412dY0[]{c0028Ac1L, J8.d(new Object[]{AbstractC1424Sa0.a(AbstractC6390p41.m, interfaceC1502Ta0, this.a)})})), false, XS0.n));
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Gh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0510Gh0 implements InterfaceC0330Dz0 {
    public final C6045nH a;
    public final C1454Sk0 b;

    public C0510Gh0(C4375ib0 c4375ib0) {
        this.a = new C6045nH(c4375ib0, C7532v32.g, new C8232yl(1));
        C1922Yk0 c1922Yk0 = (C1922Yk0) c4375ib0.a;
        c1922Yk0.getClass();
        this.b = new C1454Sk0(c1922Yk0, new ConcurrentHashMap(3, 1.0f, 2), new LX(1), 0);
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final List a(KX kx) {
        O90.f(kx, "fqName");
        return AbstractC8259yu.g(e(kx));
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final Collection b(KX kx, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(kx, "fqName");
        O90.f(interfaceC6099nZ, "nameFilter");
        Collection collection = (List) e(kx).l.invoke();
        if (collection == null) {
            collection = MN.a;
        }
        return collection;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final boolean c(KX kx) {
        O90.f(kx, "fqName");
        ((C1016Mu0) ((C4375ib0) this.a.b).b).getClass();
        return false;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final void d(KX kx, ArrayList arrayList) {
        O90.f(kx, "fqName");
        AbstractC3970gT1.a(arrayList, e(kx));
    }

    public final C0432Fh0 e(KX kx) throws Throwable {
        ((C1016Mu0) ((C4375ib0) this.a.b).b).getClass();
        O90.f(kx, "fqName");
        C7726w5 c7726w5 = new C7726w5(this, 16, new C6643qP0(kx));
        C1454Sk0 c1454Sk0 = this.b;
        c1454Sk0.getClass();
        Object objInvoke = c1454Sk0.invoke(new C1532Tk0(kx, c7726w5));
        if (objInvoke != null) {
            return (C0432Fh0) objInvoke;
        }
        C1454Sk0.a(3);
        throw null;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C0231Cs0) ((C4375ib0) this.a.b).o);
    }
}

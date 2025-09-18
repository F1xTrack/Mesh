package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Gh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7640Gh0 implements InterfaceC7520Dz0 {

    /* renamed from: a */
    public final C6479nH f3850a;

    /* renamed from: b */
    public final C8270Sk0 f3851b;

    public C7640Gh0(C9773ib0 c9773ib0) {
        this.f3850a = new C6479nH(c9773ib0, C11370v32.f44128g, new C7221yl(1));
        C8582Yk0 c8582Yk0 = (C8582Yk0) c9773ib0.f29338a;
        c8582Yk0.getClass();
        this.f3851b = new C8270Sk0(c8582Yk0, new ConcurrentHashMap(3, 1.0f, 2), new C0726LX(1), 0);
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: a */
    public final List mo939a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return AbstractC7230yu.m26276g(m3124e(c0664kx));
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: b */
    public final Collection mo940b(C0664KX c0664kx, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        Collection collection = (List) m3124e(c0664kx).f3395l.invoke();
        if (collection == null) {
            collection = C0779MN.f7117a;
        }
        return collection;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: c */
    public final boolean mo1483c(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        ((C7978Mu0) ((C9773ib0) this.f3850a.f38228b).f29339b).getClass();
        return false;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: d */
    public final void mo1484d(C0664KX c0664kx, ArrayList arrayList) {
        O90.m5968f(c0664kx, "fqName");
        AbstractC9502gT1.m18571a(arrayList, m3124e(c0664kx));
    }

    /* renamed from: e */
    public final C7588Fh0 m3124e(C0664KX c0664kx) throws Throwable {
        ((C7978Mu0) ((C9773ib0) this.f3850a.f38228b).f29339b).getClass();
        O90.m5968f(c0664kx, "fqName");
        C7053w5 c7053w5 = new C7053w5(this, 16, new C10773qP0(c0664kx));
        C8270Sk0 c8270Sk0 = this.f3851b;
        c8270Sk0.getClass();
        Object objInvoke = c8270Sk0.invoke(new C8322Tk0(c0664kx, c7053w5));
        if (objInvoke != null) {
            return (C7588Fh0) objInvoke;
        }
        C8270Sk0.m7448a(3);
        throw null;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C7454Cs0) ((C9773ib0) this.f3850a.f38228b).f29352o);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1294Qj implements InterfaceC7873ws {
    public final C1922Yk0 a;
    public final C0231Cs0 b;

    public C1294Qj(C1922Yk0 c1922Yk0, C0231Cs0 c0231Cs0) {
        O90.f(c0231Cs0, "module");
        this.a = c1922Yk0;
        this.b = c0231Cs0;
    }

    @Override // defpackage.InterfaceC7873ws
    public final InterfaceC7492us a(C0074As c0074As) {
        O90.f(c0074As, "classId");
        if (c0074As.c || !c0074As.b.e().d()) {
            return null;
        }
        String strB = c0074As.h().b();
        if (!AbstractC7538v51.p(strB, "Function", false)) {
            return null;
        }
        KX kxG = c0074As.g();
        O90.e(kxG, "getPackageFqName(...)");
        LZ lzA = MZ.c.a(kxG, strB);
        if (lzA == null) {
            return null;
        }
        List list = (List) WS1.b(((C1835Xh0) this.b.C0(kxG)).f, C1835Xh0.i[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1840Xj) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (AbstractC8069xu.C(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new C7816wZ(this.a, (C1840Xj) AbstractC8069xu.A(arrayList), lzA.a, lzA.b);
    }

    @Override // defpackage.InterfaceC7873ws
    public final Collection b(KX kx) {
        O90.f(kx, "packageFqName");
        return SN.a;
    }

    @Override // defpackage.InterfaceC7873ws
    public final boolean c(KX kx, C1559Tt0 c1559Tt0) {
        O90.f(kx, "packageFqName");
        O90.f(c1559Tt0, "name");
        String strB = c1559Tt0.b();
        O90.e(strB, "asString(...)");
        return (D51.o(strB, "Function", false) || D51.o(strB, "KFunction", false) || D51.o(strB, "SuspendFunction", false) || D51.o(strB, "KSuspendFunction", false)) && MZ.c.a(kx, strB) != null;
    }
}

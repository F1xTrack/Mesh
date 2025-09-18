package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class A12 {
    public static final int a(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        InterfaceC7916x5 interfaceC7916x5D = abstractC0663Ig0.getAnnotations().D(AbstractC6390p41.q);
        if (interfaceC7916x5D == null) {
            return 0;
        }
        AbstractC0323Dx abstractC0323Dx = (AbstractC0323Dx) AbstractC7096sn0.f(interfaceC7916x5D.g(), AbstractC6581q41.e);
        O90.d(abstractC0323Dx, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C4100h90) abstractC0323Dx).a).intValue();
    }

    public static final X01 b(AbstractC8408zg0 abstractC8408zg0, I5 i5, AbstractC0663Ig0 abstractC0663Ig0, List list, ArrayList arrayList, AbstractC0663Ig0 abstractC0663Ig02, boolean z) {
        InterfaceC7492us interfaceC7492usJ;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC0663Ig0 != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(CZ1.a((AbstractC0663Ig0) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC3970gT1.a(arrayList2, abstractC0663Ig0 != null ? CZ1.a(abstractC0663Ig0) : null);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            I5 k5 = S20.b;
            if (!zHasNext) {
                arrayList2.add(CZ1.a(abstractC0663Ig02));
                int size = list.size() + arrayList.size() + (abstractC0663Ig0 == null ? 0 : 1);
                if (z) {
                    interfaceC7492usJ = abstractC8408zg0.v(size);
                } else {
                    C1559Tt0 c1559Tt0 = AbstractC6581q41.a;
                    interfaceC7492usJ = abstractC8408zg0.j("Function" + size);
                }
                if (abstractC0663Ig0 != null) {
                    KX kx = AbstractC6390p41.p;
                    if (!i5.g(kx)) {
                        ArrayList arrayListM = AbstractC8069xu.M(i5, new C1216Pj(abstractC8408zg0, kx, NN.a));
                        i5 = arrayListM.isEmpty() ? k5 : new K5(arrayListM, i);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    KX kx2 = AbstractC6390p41.q;
                    if (!i5.g(kx2)) {
                        ArrayList arrayListM2 = AbstractC8069xu.M(i5, new C1216Pj(abstractC8408zg0, kx2, AbstractC7287tn0.c(new Pair(AbstractC6581q41.e, new C4100h90(size2)))));
                        if (!arrayListM2.isEmpty()) {
                            k5 = new K5(arrayListM2, i);
                        }
                        i5 = k5;
                    }
                }
                return NV1.y(AbstractC3988gZ1.e(i5), interfaceC7492usJ, arrayList2);
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            arrayList2.add(CZ1.a((AbstractC0663Ig0) next));
            i2 = i3;
        }
    }

    public static final C1559Tt0 c(AbstractC0663Ig0 abstractC0663Ig0) {
        String str;
        InterfaceC7916x5 interfaceC7916x5D = abstractC0663Ig0.getAnnotations().D(AbstractC6390p41.r);
        if (interfaceC7916x5D == null) {
            return null;
        }
        Object objS = AbstractC8069xu.S(interfaceC7916x5D.g().values());
        C7347u51 c7347u51 = objS instanceof C7347u51 ? (C7347u51) objS : null;
        if (c7347u51 != null && (str = (String) c7347u51.a) != null) {
            if (!C1559Tt0.f(str)) {
                str = null;
            }
            if (str != null) {
                return C1559Tt0.e(str);
            }
        }
        return null;
    }

    public static final List d(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        h(abstractC0663Ig0);
        int iA = a(abstractC0663Ig0);
        if (iA == 0) {
            return MN.a;
        }
        List listSubList = abstractC0663Ig0.u().subList(0, iA);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listSubList));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC0663Ig0 abstractC0663Ig0B = ((AbstractC6689qe1) it.next()).b();
            O90.e(abstractC0663Ig0B, "getType(...)");
            arrayList.add(abstractC0663Ig0B);
        }
        return arrayList;
    }

    public static final KZ e(InterfaceC1087Ns interfaceC1087Ns) {
        if (!(interfaceC1087Ns instanceof InterfaceC7492us) || !AbstractC8408zg0.H(interfaceC1087Ns)) {
            return null;
        }
        MX mxH = AbstractC7384uI.h(interfaceC1087Ns);
        if (!mxH.d() || mxH.a.isEmpty()) {
            return null;
        }
        MZ mz = MZ.c;
        KX kxE = mxH.g().e();
        O90.e(kxE, "parent(...)");
        String strB = mxH.f().b();
        O90.e(strB, "asString(...)");
        mz.getClass();
        LZ lzA = mz.a(kxE, strB);
        if (lzA != null) {
            return lzA.a;
        }
        return null;
    }

    public static final AbstractC0663Ig0 f(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        h(abstractC0663Ig0);
        if (abstractC0663Ig0.getAnnotations().D(AbstractC6390p41.p) == null) {
            return null;
        }
        return ((AbstractC6689qe1) abstractC0663Ig0.u().get(a(abstractC0663Ig0))).b();
    }

    public static final List g(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        h(abstractC0663Ig0);
        List listU = abstractC0663Ig0.u();
        return listU.subList(((!h(abstractC0663Ig0) || abstractC0663Ig0.getAnnotations().D(AbstractC6390p41.p) == null) ? 0 : 1) + a(abstractC0663Ig0), listU.size() - 1);
    }

    public static final boolean h(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (interfaceC1087NsA == null) {
            return false;
        }
        KZ kzE = e(interfaceC1087NsA);
        return O90.a(kzE, GZ.c) || O90.a(kzE, JZ.c);
    }

    public static final boolean i(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        return O90.a(interfaceC1087NsA != null ? e(interfaceC1087NsA) : null, JZ.c);
    }
}

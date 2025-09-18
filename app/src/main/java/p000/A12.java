package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class A12 {
    /* renamed from: a */
    public static final int m18a(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        InterfaceC7116x5 interfaceC7116x5Mo3260D = abstractC7742Ig0.getAnnotations().mo3260D(AbstractC10604p41.f39819q);
        if (interfaceC7116x5Mo3260D == null) {
            return 0;
        }
        AbstractC0249Dx abstractC0249Dx = (AbstractC0249Dx) AbstractC11077sn0.m24778f(interfaceC7116x5Mo3260D.mo4961g(), AbstractC10732q41.f40581e);
        O90.m5966d(abstractC0249Dx, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C9589h90) abstractC0249Dx).f2329a).intValue();
    }

    /* renamed from: b */
    public static final X01 m19b(AbstractC11955zg0 abstractC11955zg0, InterfaceC0510I5 interfaceC0510I5, AbstractC7742Ig0 abstractC7742Ig0, List list, ArrayList arrayList, AbstractC7742Ig0 abstractC7742Ig02, boolean z) {
        InterfaceC6976us interfaceC6976usM26503j;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC7742Ig0 != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(CZ1.m1225a((AbstractC7742Ig0) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC9502gT1.m18571a(arrayList2, abstractC7742Ig0 != null ? CZ1.m1225a(abstractC7742Ig0) : null);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            InterfaceC0510I5 c0636k5 = S20.f10539b;
            if (!zHasNext) {
                arrayList2.add(CZ1.m1225a(abstractC7742Ig02));
                int size = list.size() + arrayList.size() + (abstractC7742Ig0 == null ? 0 : 1);
                if (z) {
                    interfaceC6976usM26503j = abstractC11955zg0.m26511v(size);
                } else {
                    C8340Tt0 c8340Tt0 = AbstractC10732q41.f40577a;
                    interfaceC6976usM26503j = abstractC11955zg0.m26503j("Function" + size);
                }
                if (abstractC7742Ig0 != null) {
                    C0664KX c0664kx = AbstractC10604p41.f39818p;
                    if (!interfaceC0510I5.mo3261g(c0664kx)) {
                        ArrayList arrayListM25967M = AbstractC7167xu.m25967M(interfaceC0510I5, new C0990Pj(abstractC11955zg0, c0664kx, C0842NN.f7735a));
                        interfaceC0510I5 = arrayListM25967M.isEmpty() ? c0636k5 : new C0636K5(arrayListM25967M, i);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    C0664KX c0664kx2 = AbstractC10604p41.f39819q;
                    if (!interfaceC0510I5.mo3261g(c0664kx2)) {
                        ArrayList arrayListM25967M2 = AbstractC7167xu.m25967M(interfaceC0510I5, new C0990Pj(abstractC11955zg0, c0664kx2, AbstractC11205tn0.m24984c(new Pair(AbstractC10732q41.f40581e, new C9589h90(size2)))));
                        if (!arrayListM25967M2.isEmpty()) {
                            c0636k5 = new C0636K5(arrayListM25967M2, i);
                        }
                        interfaceC0510I5 = c0636k5;
                    }
                }
                return NV1.m5741y(AbstractC9514gZ1.m18584e(interfaceC0510I5), interfaceC6976usM26503j, arrayList2);
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            arrayList2.add(CZ1.m1225a((AbstractC7742Ig0) next));
            i2 = i3;
        }
    }

    /* renamed from: c */
    public static final C8340Tt0 m20c(AbstractC7742Ig0 abstractC7742Ig0) {
        String str;
        InterfaceC7116x5 interfaceC7116x5Mo3260D = abstractC7742Ig0.getAnnotations().mo3260D(AbstractC10604p41.f39820r);
        if (interfaceC7116x5Mo3260D == null) {
            return null;
        }
        Object objM25973S = AbstractC7167xu.m25973S(interfaceC7116x5Mo3260D.mo4961g().values());
        C11246u51 c11246u51 = objM25973S instanceof C11246u51 ? (C11246u51) objM25973S : null;
        if (c11246u51 != null && (str = (String) c11246u51.f2329a) != null) {
            if (!C8340Tt0.m7799f(str)) {
                str = null;
            }
            if (str != null) {
                return C8340Tt0.m7798e(str);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final List m21d(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        m25h(abstractC7742Ig0);
        int iM18a = m18a(abstractC7742Ig0);
        if (iM18a == 0) {
            return C0779MN.f7117a;
        }
        List listSubList = abstractC7742Ig0.mo3800u().subList(0, iM18a);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listSubList));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = ((AbstractC10804qe1) it.next()).mo24038b();
            O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
            arrayList.add(abstractC7742Ig0Mo24038b);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final AbstractC0666KZ m22e(InterfaceC0873Ns interfaceC0873Ns) {
        if (!(interfaceC0873Ns instanceof InterfaceC6976us) || !AbstractC11955zg0.m26489H(interfaceC0873Ns)) {
            return null;
        }
        C0789MX c0789mxM25155h = AbstractC6940uI.m25155h(interfaceC0873Ns);
        if (!c0789mxM25155h.m5390d() || c0789mxM25155h.f7212a.isEmpty()) {
            return null;
        }
        C0791MZ c0791mz = C0791MZ.f7224c;
        C0664KX c0664kxM4657e = c0789mxM25155h.m5393g().m4657e();
        O90.m5967e(c0664kxM4657e, "parent(...)");
        String strM7801b = c0789mxM25155h.m5392f().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        c0791mz.getClass();
        C0728LZ c0728lzM5399a = c0791mz.m5399a(c0664kxM4657e, strM7801b);
        if (c0728lzM5399a != null) {
            return c0728lzM5399a.f6712a;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC7742Ig0 m23f(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        m25h(abstractC7742Ig0);
        if (abstractC7742Ig0.getAnnotations().mo3260D(AbstractC10604p41.f39818p) == null) {
            return null;
        }
        return ((AbstractC10804qe1) abstractC7742Ig0.mo3800u().get(m18a(abstractC7742Ig0))).mo24038b();
    }

    /* renamed from: g */
    public static final List m24g(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        m25h(abstractC7742Ig0);
        List listMo3800u = abstractC7742Ig0.mo3800u();
        return listMo3800u.subList(((!m25h(abstractC7742Ig0) || abstractC7742Ig0.getAnnotations().mo3260D(AbstractC10604p41.f39818p) == null) ? 0 : 1) + m18a(abstractC7742Ig0), listMo3800u.size() - 1);
    }

    /* renamed from: h */
    public static final boolean m25h(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a == null) {
            return false;
        }
        AbstractC0666KZ abstractC0666KZM22e = m22e(interfaceC0873NsMo1962a);
        return O90.m5963a(abstractC0666KZM22e, C0414GZ.f3802c) || O90.m5963a(abstractC0666KZM22e, C0603JZ.f5603c);
    }

    /* renamed from: i */
    public static final boolean m26i(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        return O90.m5963a(interfaceC0873NsMo1962a != null ? m22e(interfaceC0873NsMo1962a) : null, C0603JZ.f5603c);
    }
}

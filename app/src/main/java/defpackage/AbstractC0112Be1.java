package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Be1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0112Be1 {
    public static final C4147hP a = C5496kP.c(EnumC5305jP.l, new String[0]);
    public static final C4147hP b = C5496kP.c(EnumC5305jP.i, new String[0]);
    public static final C0034Ae1 c = new C0034Ae1("NO_EXPECTED_TYPE");
    public static final C0034Ae1 d = new C0034Ae1("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:150:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0112Be1.a(int):void");
    }

    public static boolean b(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(28);
            throw null;
        }
        if (abstractC0663Ig0.G()) {
            return true;
        }
        return AbstractC4075h12.d(abstractC0663Ig0) && b(((AbstractC3405dW) abstractC0663Ig0.L()).c);
    }

    public static boolean c(AbstractC0663Ig0 abstractC0663Ig0, InterfaceC6099nZ interfaceC6099nZ, C8098y21 c8098y21) {
        if (abstractC0663Ig0 == null) {
            return false;
        }
        AbstractC1521Tg1 abstractC1521Tg1L = abstractC0663Ig0.L();
        if (l(abstractC0663Ig0)) {
            return ((Boolean) interfaceC6099nZ.invoke(abstractC1521Tg1L)).booleanValue();
        }
        if (c8098y21 != null && c8098y21.contains(abstractC0663Ig0)) {
            return false;
        }
        if (((Boolean) interfaceC6099nZ.invoke(abstractC1521Tg1L)).booleanValue()) {
            return true;
        }
        if (c8098y21 == null) {
            c8098y21 = new C8098y21();
        }
        c8098y21.add(abstractC0663Ig0);
        AbstractC3405dW abstractC3405dW = abstractC1521Tg1L instanceof AbstractC3405dW ? (AbstractC3405dW) abstractC1521Tg1L : null;
        if (abstractC3405dW != null && (c(abstractC3405dW.b, interfaceC6099nZ, c8098y21) || c(abstractC3405dW.c, interfaceC6099nZ, c8098y21))) {
            return true;
        }
        if ((abstractC1521Tg1L instanceof C6618qH) && c(((C6618qH) abstractC1521Tg1L).b, interfaceC6099nZ, c8098y21)) {
            return true;
        }
        InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC0663Ig0.E();
        if (interfaceC1200Pd1E instanceof M90) {
            Iterator it = ((M90) interfaceC1200Pd1E).b.iterator();
            while (it.hasNext()) {
                if (c((AbstractC0663Ig0) it.next(), interfaceC6099nZ, c8098y21)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC6689qe1 abstractC6689qe1 : abstractC0663Ig0.u()) {
            if (!abstractC6689qe1.c()) {
                if (c(abstractC6689qe1.b(), interfaceC6099nZ, c8098y21)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6962s41(((InterfaceC5925me1) it.next()).m()));
        }
        return AbstractC8069xu.b0(arrayList);
    }

    public static boolean e(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(27);
            throw null;
        }
        if (abstractC0663Ig0.G()) {
            return true;
        }
        if (AbstractC4075h12.d(abstractC0663Ig0) && e(((AbstractC3405dW) abstractC0663Ig0.L()).c)) {
            return true;
        }
        if (abstractC0663Ig0.L() instanceof C6618qH) {
            return false;
        }
        if (!f(abstractC0663Ig0)) {
            InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC0663Ig0.E();
            if (interfaceC1200Pd1E instanceof M90) {
                Iterator it = ((M90) interfaceC1200Pd1E).b.iterator();
                while (it.hasNext()) {
                    if (e((AbstractC0663Ig0) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(abstractC0663Ig0.E().a() instanceof InterfaceC7492us)) {
            C7833we1 c7833we1D = C7833we1.d(abstractC0663Ig0);
            Collection<AbstractC0663Ig0> collectionB = abstractC0663Ig0.E().b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            for (AbstractC0663Ig0 abstractC0663Ig02 : collectionB) {
                if (abstractC0663Ig02 == null) {
                    a(21);
                    throw null;
                }
                AbstractC0663Ig0 abstractC0663Ig0I = c7833we1D.i(abstractC0663Ig02, EnumC4015gi1.c);
                AbstractC0663Ig0 abstractC0663Ig0H = abstractC0663Ig0I != null ? h(abstractC0663Ig0I, abstractC0663Ig0.G()) : null;
                if (abstractC0663Ig0H != null) {
                    arrayList.add(abstractC0663Ig0H);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (e((AbstractC0663Ig0) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            a(60);
            throw null;
        }
        if ((abstractC0663Ig0.E().a() instanceof InterfaceC5925me1 ? (InterfaceC5925me1) abstractC0663Ig0.E().a() : null) != null) {
            return true;
        }
        abstractC0663Ig0.E();
        return false;
    }

    public static AbstractC1521Tg1 g(AbstractC0663Ig0 abstractC0663Ig0, boolean z) {
        if (abstractC0663Ig0 == null) {
            a(3);
            throw null;
        }
        AbstractC1521Tg1 abstractC1521Tg1P = abstractC0663Ig0.L().P(z);
        if (abstractC1521Tg1P != null) {
            return abstractC1521Tg1P;
        }
        a(4);
        throw null;
    }

    public static AbstractC0663Ig0 h(AbstractC0663Ig0 abstractC0663Ig0, boolean z) {
        if (abstractC0663Ig0 != null) {
            return z ? g(abstractC0663Ig0, true) : abstractC0663Ig0;
        }
        a(8);
        throw null;
    }

    public static X01 i(X01 x01, boolean z) {
        if (x01 == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return x01;
        }
        X01 x01P = x01.P(true);
        if (x01P != null) {
            return x01P;
        }
        a(6);
        throw null;
    }

    public static C6962s41 j(InterfaceC5925me1 interfaceC5925me1) {
        if (interfaceC5925me1 != null) {
            return new C6962s41(interfaceC5925me1);
        }
        a(45);
        throw null;
    }

    public static AbstractC6689qe1 k(InterfaceC5925me1 interfaceC5925me1, C8203yb0 c8203yb0) {
        if (interfaceC5925me1 != null) {
            return c8203yb0.a == EnumC8403ze1.a ? new C6962s41(QS1.b(interfaceC5925me1)) : new C6962s41(interfaceC5925me1);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 != null) {
            return abstractC0663Ig0 == c || abstractC0663Ig0 == d;
        }
        a(0);
        throw null;
    }
}

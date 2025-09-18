package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Be1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7375Be1 {

    /* renamed from: a */
    public static final C4177hP f963a = C6298kP.m22197c(EnumC6235jP.f35127l, new String[0]);

    /* renamed from: b */
    public static final C4177hP f964b = C6298kP.m22197c(EnumC6235jP.f35124i, new String[0]);

    /* renamed from: c */
    public static final C7323Ae1 f965c = new C7323Ae1("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C7323Ae1 f966d = new C7323Ae1("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:150:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0120  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m783a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7375Be1.m783a(int):void");
    }

    /* renamed from: b */
    public static boolean m784b(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m783a(28);
            throw null;
        }
        if (abstractC7742Ig0.mo3798G()) {
            return true;
        }
        return AbstractC9572h12.m18696d(abstractC7742Ig0) && m784b(((AbstractC3933dW) abstractC7742Ig0.mo3963L()).f26127c);
    }

    /* renamed from: c */
    public static boolean m785c(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC6497nZ interfaceC6497nZ, C11748y21 c11748y21) {
        if (abstractC7742Ig0 == null) {
            return false;
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = abstractC7742Ig0.mo3963L();
        if (m794l(abstractC7742Ig0)) {
            return ((Boolean) interfaceC6497nZ.invoke(abstractC8315Tg1Mo3963L)).booleanValue();
        }
        if (c11748y21 != null && c11748y21.contains(abstractC7742Ig0)) {
            return false;
        }
        if (((Boolean) interfaceC6497nZ.invoke(abstractC8315Tg1Mo3963L)).booleanValue()) {
            return true;
        }
        if (c11748y21 == null) {
            c11748y21 = new C11748y21();
        }
        c11748y21.add(abstractC7742Ig0);
        AbstractC3933dW abstractC3933dW = abstractC8315Tg1Mo3963L instanceof AbstractC3933dW ? (AbstractC3933dW) abstractC8315Tg1Mo3963L : null;
        if (abstractC3933dW != null && (m785c(abstractC3933dW.f26126b, interfaceC6497nZ, c11748y21) || m785c(abstractC3933dW.f26127c, interfaceC6497nZ, c11748y21))) {
            return true;
        }
        if ((abstractC8315Tg1Mo3963L instanceof C6670qH) && m785c(((C6670qH) abstractC8315Tg1Mo3963L).f40714b, interfaceC6497nZ, c11748y21)) {
            return true;
        }
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC7742Ig0.mo3797E();
        if (interfaceC8101Pd1Mo3797E instanceof M90) {
            Iterator it = ((M90) interfaceC8101Pd1Mo3797E).f7011b.iterator();
            while (it.hasNext()) {
                if (m785c((AbstractC7742Ig0) it.next(), interfaceC6497nZ, c11748y21)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC10804qe1 abstractC10804qe1 : abstractC7742Ig0.mo3800u()) {
            if (!abstractC10804qe1.mo24039c()) {
                if (m785c(abstractC10804qe1.mo24038b(), interfaceC6497nZ, c11748y21)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static List m786d(List list) {
        if (list == null) {
            m783a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10988s41(((InterfaceC10292me1) it.next()).mo1492m()));
        }
        return AbstractC7167xu.m25982b0(arrayList);
    }

    /* renamed from: e */
    public static boolean m787e(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m783a(27);
            throw null;
        }
        if (abstractC7742Ig0.mo3798G()) {
            return true;
        }
        if (AbstractC9572h12.m18696d(abstractC7742Ig0) && m787e(((AbstractC3933dW) abstractC7742Ig0.mo3963L()).f26127c)) {
            return true;
        }
        if (abstractC7742Ig0.mo3963L() instanceof C6670qH) {
            return false;
        }
        if (!m788f(abstractC7742Ig0)) {
            InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC7742Ig0.mo3797E();
            if (interfaceC8101Pd1Mo3797E instanceof M90) {
                Iterator it = ((M90) interfaceC8101Pd1Mo3797E).f7011b.iterator();
                while (it.hasNext()) {
                    if (m787e((AbstractC7742Ig0) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(abstractC7742Ig0.mo3797E().mo1962a() instanceof InterfaceC6976us)) {
            C11571we1 c11571we1M25662d = C11571we1.m25662d(abstractC7742Ig0);
            Collection<AbstractC7742Ig0> collectionMo5276b = abstractC7742Ig0.mo3797E().mo5276b();
            ArrayList arrayList = new ArrayList(collectionMo5276b.size());
            for (AbstractC7742Ig0 abstractC7742Ig02 : collectionMo5276b) {
                if (abstractC7742Ig02 == null) {
                    m783a(21);
                    throw null;
                }
                AbstractC7742Ig0 abstractC7742Ig0M25667i = c11571we1M25662d.m25667i(abstractC7742Ig02, EnumC9532gi1.f27947c);
                AbstractC7742Ig0 abstractC7742Ig0M790h = abstractC7742Ig0M25667i != null ? m790h(abstractC7742Ig0M25667i, abstractC7742Ig0.mo3798G()) : null;
                if (abstractC7742Ig0M790h != null) {
                    arrayList.add(abstractC7742Ig0M790h);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (m787e((AbstractC7742Ig0) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m788f(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            m783a(60);
            throw null;
        }
        if ((abstractC7742Ig0.mo3797E().mo1962a() instanceof InterfaceC10292me1 ? (InterfaceC10292me1) abstractC7742Ig0.mo3797E().mo1962a() : null) != null) {
            return true;
        }
        abstractC7742Ig0.mo3797E();
        return false;
    }

    /* renamed from: g */
    public static AbstractC8315Tg1 m789g(AbstractC7742Ig0 abstractC7742Ig0, boolean z) {
        if (abstractC7742Ig0 == null) {
            m783a(3);
            throw null;
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo250P = abstractC7742Ig0.mo3963L().mo250P(z);
        if (abstractC8315Tg1Mo250P != null) {
            return abstractC8315Tg1Mo250P;
        }
        m783a(4);
        throw null;
    }

    /* renamed from: h */
    public static AbstractC7742Ig0 m790h(AbstractC7742Ig0 abstractC7742Ig0, boolean z) {
        if (abstractC7742Ig0 != null) {
            return z ? m789g(abstractC7742Ig0, true) : abstractC7742Ig0;
        }
        m783a(8);
        throw null;
    }

    /* renamed from: i */
    public static X01 m791i(X01 x01, boolean z) {
        if (x01 == null) {
            m783a(5);
            throw null;
        }
        if (!z) {
            return x01;
        }
        X01 x01Mo250P = x01.mo250P(true);
        if (x01Mo250P != null) {
            return x01Mo250P;
        }
        m783a(6);
        throw null;
    }

    /* renamed from: j */
    public static C10988s41 m792j(InterfaceC10292me1 interfaceC10292me1) {
        if (interfaceC10292me1 != null) {
            return new C10988s41(interfaceC10292me1);
        }
        m783a(45);
        throw null;
    }

    /* renamed from: k */
    public static AbstractC10804qe1 m793k(InterfaceC10292me1 interfaceC10292me1, C11818yb0 c11818yb0) {
        if (interfaceC10292me1 != null) {
            return c11818yb0.f46326a == EnumC11952ze1.f46922a ? new C10988s41(QS1.m6718b(interfaceC10292me1)) : new C10988s41(interfaceC10292me1);
        }
        m783a(46);
        throw null;
    }

    /* renamed from: l */
    public static boolean m794l(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 != null) {
            return abstractC7742Ig0 == f965c || abstractC7742Ig0 == f966d;
        }
        m783a(0);
        throw null;
    }
}

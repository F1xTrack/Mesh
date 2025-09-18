package p000;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class KS1 {
    /* renamed from: a */
    public static String m4645a(InterfaceC7290zr interfaceC7290zr, C9261eb0 c9261eb0) {
        if (interfaceC7290zr.mo7727a(c9261eb0)) {
            return null;
        }
        return interfaceC7290zr.getDescription();
    }

    /* renamed from: b */
    public static final AbstractC8315Tg1 m4646b(AbstractC8315Tg1 abstractC8315Tg1, boolean z) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        C6670qH c6670qHM1456B0 = C7460Cv0.m1456B0(abstractC8315Tg1, z);
        if (c6670qHM1456B0 != null) {
            return c6670qHM1456B0;
        }
        X01 x01M4647c = m4647c(abstractC8315Tg1);
        return x01M4647c != null ? x01M4647c : abstractC8315Tg1.mo250P(false);
    }

    /* renamed from: c */
    public static final X01 m4647c(AbstractC8315Tg1 abstractC8315Tg1) {
        M90 m90;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = abstractC8315Tg1.mo3797E();
        M90 m902 = interfaceC8101Pd1Mo3797E instanceof M90 ? (M90) interfaceC8101Pd1Mo3797E : null;
        if (m902 == null) {
            return null;
        }
        LinkedHashSet<AbstractC7742Ig0> linkedHashSet = m902.f7011b;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(linkedHashSet));
        boolean z = false;
        for (AbstractC7742Ig0 abstractC7742Ig0M4646b : linkedHashSet) {
            if (AbstractC7375Be1.m787e(abstractC7742Ig0M4646b)) {
                abstractC7742Ig0M4646b = m4646b(abstractC7742Ig0M4646b.mo3963L(), false);
                z = true;
            }
            arrayList.add(abstractC7742Ig0M4646b);
        }
        if (z) {
            AbstractC7742Ig0 abstractC7742Ig0M4646b2 = m902.f7010a;
            if (abstractC7742Ig0M4646b2 == null) {
                abstractC7742Ig0M4646b2 = null;
            } else if (AbstractC7375Be1.m787e(abstractC7742Ig0M4646b2)) {
                abstractC7742Ig0M4646b2 = m4646b(abstractC7742Ig0M4646b2.mo3963L(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            m90 = new M90(linkedHashSet2);
            m90.f7010a = abstractC7742Ig0M4646b2;
        } else {
            m90 = null;
        }
        if (m90 == null) {
            return null;
        }
        return m90.m5277e();
    }

    /* renamed from: d */
    public static final X01 m4648d(X01 x01, X01 x012) {
        O90.m5968f(x01, "<this>");
        O90.m5968f(x012, "abbreviatedType");
        return AbstractC1141S8.m7182b(x01) ? x01 : new C6652q(x01, x012);
    }
}

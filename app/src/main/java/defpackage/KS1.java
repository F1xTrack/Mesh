package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class KS1 {
    public static String a(InterfaceC8440zr interfaceC8440zr, C3611eb0 c3611eb0) {
        if (interfaceC8440zr.a(c3611eb0)) {
            return null;
        }
        return interfaceC8440zr.getDescription();
    }

    public static final AbstractC1521Tg1 b(AbstractC1521Tg1 abstractC1521Tg1, boolean z) {
        O90.f(abstractC1521Tg1, "<this>");
        C6618qH c6618qHB0 = C0240Cv0.B0(abstractC1521Tg1, z);
        if (c6618qHB0 != null) {
            return c6618qHB0;
        }
        X01 x01C = c(abstractC1521Tg1);
        return x01C != null ? x01C : abstractC1521Tg1.P(false);
    }

    public static final X01 c(AbstractC1521Tg1 abstractC1521Tg1) {
        M90 m90;
        InterfaceC1200Pd1 interfaceC1200Pd1E = abstractC1521Tg1.E();
        M90 m902 = interfaceC1200Pd1E instanceof M90 ? (M90) interfaceC1200Pd1E : null;
        if (m902 == null) {
            return null;
        }
        LinkedHashSet<AbstractC0663Ig0> linkedHashSet = m902.b;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(linkedHashSet));
        boolean z = false;
        for (AbstractC0663Ig0 abstractC0663Ig0B : linkedHashSet) {
            if (AbstractC0112Be1.e(abstractC0663Ig0B)) {
                abstractC0663Ig0B = b(abstractC0663Ig0B.L(), false);
                z = true;
            }
            arrayList.add(abstractC0663Ig0B);
        }
        if (z) {
            AbstractC0663Ig0 abstractC0663Ig0B2 = m902.a;
            if (abstractC0663Ig0B2 == null) {
                abstractC0663Ig0B2 = null;
            } else if (AbstractC0112Be1.e(abstractC0663Ig0B2)) {
                abstractC0663Ig0B2 = b(abstractC0663Ig0B2.L(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            m90 = new M90(linkedHashSet2);
            m90.a = abstractC0663Ig0B2;
        } else {
            m90 = null;
        }
        if (m90 == null) {
            return null;
        }
        return m90.e();
    }

    public static final X01 d(X01 x01, X01 x012) {
        O90.f(x01, "<this>");
        O90.f(x012, "abbreviatedType");
        return S8.b(x01) ? x01 : new C6562q(x01, x012);
    }
}

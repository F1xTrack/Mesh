package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Ng0 */
/* loaded from: classes2.dex */
public final class C1052Ng0 {
    public static final C1052Ng0 a = new C1052Ng0();

    /* JADX WARN: Multi-variable type inference failed */
    public static X01 b(X01 x01) {
        AbstractC0663Ig0 abstractC0663Ig0B;
        InterfaceC1200Pd1 interfaceC1200Pd1E = x01.E();
        if (interfaceC1200Pd1E instanceof C6150nq) {
            C6150nq c6150nq = (C6150nq) interfaceC1200Pd1E;
            AbstractC6689qe1 abstractC6689qe1 = c6150nq.a;
            if (abstractC6689qe1.a() != EnumC4015gi1.d) {
                abstractC6689qe1 = null;
            }
            if (abstractC6689qe1 != null && (abstractC0663Ig0B = abstractC6689qe1.b()) != null) {
                abstractC1521Tg1G = abstractC0663Ig0B.L();
            }
            AbstractC1521Tg1 abstractC1521Tg1 = abstractC1521Tg1G;
            if (c6150nq.b == null) {
                Collection collectionB = c6150nq.b();
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collectionB));
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0663Ig0) it.next()).L());
                }
                AbstractC6689qe1 abstractC6689qe12 = c6150nq.a;
                O90.f(abstractC6689qe12, "projection");
                c6150nq.b = new C6548pv0(abstractC6689qe12, new BI(arrayList, 1), null, null, 8);
            }
            EnumC5386jq enumC5386jq = EnumC5386jq.a;
            C6548pv0 c6548pv0 = c6150nq.b;
            O90.c(c6548pv0);
            return new C6357ov0(enumC5386jq, c6548pv0, abstractC1521Tg1, x01.B(), x01.G(), 32);
        }
        if (!(interfaceC1200Pd1E instanceof M90) || !x01.G()) {
            return x01;
        }
        M90 m90 = (M90) interfaceC1200Pd1E;
        LinkedHashSet<AbstractC0663Ig0> linkedHashSet = m90.b;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(linkedHashSet));
        boolean z = false;
        for (AbstractC0663Ig0 abstractC0663Ig0 : linkedHashSet) {
            O90.f(abstractC0663Ig0, "<this>");
            arrayList2.add(AbstractC0112Be1.g(abstractC0663Ig0, true));
            z = true;
        }
        if (z) {
            AbstractC0663Ig0 abstractC0663Ig02 = m90.a;
            abstractC1521Tg1G = abstractC0663Ig02 != null ? AbstractC0112Be1.g(abstractC0663Ig02, true) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            M90 m902 = new M90(linkedHashSet2);
            m902.a = abstractC1521Tg1G;
            abstractC1521Tg1G = m902;
        }
        if (abstractC1521Tg1G != null) {
            m90 = abstractC1521Tg1G;
        }
        return m90.e();
    }

    public final AbstractC1521Tg1 a(InterfaceC0974Mg0 interfaceC0974Mg0) {
        AbstractC1521Tg1 abstractC1521Tg1T;
        O90.f(interfaceC0974Mg0, "type");
        if (!(interfaceC0974Mg0 instanceof AbstractC0663Ig0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC1521Tg1 abstractC1521Tg1L = ((AbstractC0663Ig0) interfaceC0974Mg0).L();
        if (abstractC1521Tg1L instanceof X01) {
            abstractC1521Tg1T = b((X01) abstractC1521Tg1L);
        } else {
            if (!(abstractC1521Tg1L instanceof AbstractC3405dW)) {
                throw new C7074sg();
            }
            AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1L;
            X01 x01 = abstractC3405dW.b;
            X01 x01B = b(x01);
            X01 x012 = abstractC3405dW.c;
            X01 x01B2 = b(x012);
            abstractC1521Tg1T = (x01B == x01 && x01B2 == x012) ? abstractC1521Tg1L : NV1.t(x01B, x01B2);
        }
        C1684Vj c1684Vj = new C1684Vj(1, this, 4);
        AbstractC0663Ig0 abstractC0663Ig0K = EZ1.k(abstractC1521Tg1L);
        return EZ1.n(abstractC1521Tg1T, abstractC0663Ig0K != null ? (AbstractC0663Ig0) c1684Vj.invoke(abstractC0663Ig0K) : null);
    }
}

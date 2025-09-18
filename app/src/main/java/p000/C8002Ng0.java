package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Ng0 */
/* loaded from: classes2.dex */
public final class C8002Ng0 {

    /* renamed from: a */
    public static final C8002Ng0 f7948a = new C8002Ng0();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static X01 m5797b(X01 x01) {
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = x01.mo3797E();
        if (interfaceC8101Pd1Mo3797E instanceof C6514nq) {
            C6514nq c6514nq = (C6514nq) interfaceC8101Pd1Mo3797E;
            AbstractC10804qe1 abstractC10804qe1 = c6514nq.f38552a;
            if (abstractC10804qe1.mo24037a() != EnumC9532gi1.f27948d) {
                abstractC10804qe1 = null;
            }
            if (abstractC10804qe1 != null && (abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b()) != null) {
                abstractC8315Tg1M789g = abstractC7742Ig0Mo24038b.mo3963L();
            }
            AbstractC8315Tg1 abstractC8315Tg1 = abstractC8315Tg1M789g;
            if (c6514nq.f38553b == null) {
                Collection collectionMo5276b = c6514nq.mo5276b();
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collectionMo5276b));
                Iterator it = collectionMo5276b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC7742Ig0) it.next()).mo3963L());
                }
                AbstractC10804qe1 abstractC10804qe12 = c6514nq.f38552a;
                O90.m5968f(abstractC10804qe12, "projection");
                c6514nq.f38553b = new C10709pv0(abstractC10804qe12, new C0082BI(arrayList, 1), null, null, 8);
            }
            EnumC6262jq enumC6262jq = EnumC6262jq.f35417a;
            C10709pv0 c10709pv0 = c6514nq.f38553b;
            O90.m5965c(c10709pv0);
            return new C10581ov0(enumC6262jq, c10709pv0, abstractC8315Tg1, x01.mo3796B(), x01.mo3798G(), 32);
        }
        if (!(interfaceC8101Pd1Mo3797E instanceof M90) || !x01.mo3798G()) {
            return x01;
        }
        M90 m90 = (M90) interfaceC8101Pd1Mo3797E;
        LinkedHashSet<AbstractC7742Ig0> linkedHashSet = m90.f7011b;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(linkedHashSet));
        boolean z = false;
        for (AbstractC7742Ig0 abstractC7742Ig0 : linkedHashSet) {
            O90.m5968f(abstractC7742Ig0, "<this>");
            arrayList2.add(AbstractC7375Be1.m789g(abstractC7742Ig0, true));
            z = true;
        }
        if (z) {
            AbstractC7742Ig0 abstractC7742Ig02 = m90.f7010a;
            abstractC8315Tg1M789g = abstractC7742Ig02 != null ? AbstractC7375Be1.m789g(abstractC7742Ig02, true) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            M90 m902 = new M90(linkedHashSet2);
            m902.f7010a = abstractC8315Tg1M789g;
            abstractC8315Tg1M789g = m902;
        }
        if (abstractC8315Tg1M789g != null) {
            m90 = abstractC8315Tg1M789g;
        }
        return m90.m5277e();
    }

    /* renamed from: a */
    public final AbstractC8315Tg1 m5798a(InterfaceC7950Mg0 interfaceC7950Mg0) {
        AbstractC8315Tg1 abstractC8315Tg1M5738t;
        O90.m5968f(interfaceC7950Mg0, "type");
        if (!(interfaceC7950Mg0 instanceof AbstractC7742Ig0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC8315Tg1 abstractC8315Tg1Mo3963L = ((AbstractC7742Ig0) interfaceC7950Mg0).mo3963L();
        if (abstractC8315Tg1Mo3963L instanceof X01) {
            abstractC8315Tg1M5738t = m5797b((X01) abstractC8315Tg1Mo3963L);
        } else {
            if (!(abstractC8315Tg1Mo3963L instanceof AbstractC3933dW)) {
                throw new C6838sg();
            }
            AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1Mo3963L;
            X01 x01 = abstractC3933dW.f26126b;
            X01 x01M5797b = m5797b(x01);
            X01 x012 = abstractC3933dW.f26127c;
            X01 x01M5797b2 = m5797b(x012);
            abstractC8315Tg1M5738t = (x01M5797b == x01 && x01M5797b2 == x012) ? abstractC8315Tg1Mo3963L : NV1.m5738t(x01M5797b, x01M5797b2);
        }
        C1367Vj c1367Vj = new C1367Vj(1, this, 4);
        AbstractC7742Ig0 abstractC7742Ig0M2351k = EZ1.m2351k(abstractC8315Tg1Mo3963L);
        return EZ1.m2354n(abstractC8315Tg1M5738t, abstractC7742Ig0M2351k != null ? (AbstractC7742Ig0) c1367Vj.invoke(abstractC7742Ig0M2351k) : null);
    }
}

package p000;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: mS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10268mS1 {
    /* renamed from: a */
    public static final AbstractC10804qe1 m22828a(AbstractC10804qe1 abstractC10804qe1, InterfaceC10292me1 interfaceC10292me1) {
        if (interfaceC10292me1 == null || abstractC10804qe1.mo24037a() == EnumC9532gi1.f27947c) {
            return abstractC10804qe1;
        }
        if (interfaceC10292me1.mo22918O() != abstractC10804qe1.mo24037a()) {
            C6514nq c6514nq = new C6514nq(abstractC10804qe1);
            C7789Jd1.f5652b.getClass();
            return new C10988s41(new C6325kq(abstractC10804qe1, c6514nq, false, C7789Jd1.f5653c));
        }
        if (!abstractC10804qe1.mo24039c()) {
            return new C10988s41(abstractC10804qe1.mo24038b());
        }
        C8114Pk0 c8114Pk0 = C8582Yk0.f14497e;
        O90.m5967e(c8114Pk0, "NO_LOCKS");
        return new C10988s41(new C9787ii0(c8114Pk0, new C4090g1(7, abstractC10804qe1)));
    }

    /* renamed from: b */
    public static AbstractC11316ue1 m22829b(AbstractC11316ue1 abstractC11316ue1) {
        if (!(abstractC11316ue1 instanceof C9715i80)) {
            return new C6577oq(abstractC11316ue1, true);
        }
        C9715i80 c9715i80 = (C9715i80) abstractC11316ue1;
        AbstractC10804qe1[] abstractC10804qe1Arr = c9715i80.f28834c;
        O90.m5968f(abstractC10804qe1Arr, "<this>");
        InterfaceC10292me1[] interfaceC10292me1Arr = c9715i80.f28833b;
        O90.m5968f(interfaceC10292me1Arr, "other");
        int iMin = Math.min(abstractC10804qe1Arr.length, interfaceC10292me1Arr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(abstractC10804qe1Arr[i], interfaceC10292me1Arr[i]));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(m22828a((AbstractC10804qe1) pair.f36702a, (InterfaceC10292me1) pair.f36703b));
        }
        return new C9715i80(interfaceC10292me1Arr, (AbstractC10804qe1[]) arrayList2.toArray(new AbstractC10804qe1[0]), true);
    }
}

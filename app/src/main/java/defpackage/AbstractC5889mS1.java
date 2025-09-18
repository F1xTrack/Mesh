package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: mS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5889mS1 {
    public static final AbstractC6689qe1 a(AbstractC6689qe1 abstractC6689qe1, InterfaceC5925me1 interfaceC5925me1) {
        if (interfaceC5925me1 == null || abstractC6689qe1.a() == EnumC4015gi1.c) {
            return abstractC6689qe1;
        }
        if (interfaceC5925me1.O() != abstractC6689qe1.a()) {
            C6150nq c6150nq = new C6150nq(abstractC6689qe1);
            C0733Jd1.b.getClass();
            return new C6962s41(new C5577kq(abstractC6689qe1, c6150nq, false, C0733Jd1.c));
        }
        if (!abstractC6689qe1.c()) {
            return new C6962s41(abstractC6689qe1.b());
        }
        C1220Pk0 c1220Pk0 = C1922Yk0.e;
        O90.e(c1220Pk0, "NO_LOCKS");
        return new C6962s41(new C4395ii0(c1220Pk0, new C3881g1(7, abstractC6689qe1)));
    }

    public static AbstractC7452ue1 b(AbstractC7452ue1 abstractC7452ue1) {
        if (!(abstractC7452ue1 instanceof C4288i80)) {
            return new C6341oq(abstractC7452ue1, true);
        }
        C4288i80 c4288i80 = (C4288i80) abstractC7452ue1;
        AbstractC6689qe1[] abstractC6689qe1Arr = c4288i80.c;
        O90.f(abstractC6689qe1Arr, "<this>");
        InterfaceC5925me1[] interfaceC5925me1Arr = c4288i80.b;
        O90.f(interfaceC5925me1Arr, "other");
        int iMin = Math.min(abstractC6689qe1Arr.length, interfaceC5925me1Arr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(abstractC6689qe1Arr[i], interfaceC5925me1Arr[i]));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(a((AbstractC6689qe1) pair.a, (InterfaceC5925me1) pair.b));
        }
        return new C4288i80(interfaceC5925me1Arr, (AbstractC6689qe1[]) arrayList2.toArray(new AbstractC6689qe1[0]), true);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class WI extends AbstractC6372p0 {
    public final C1666Vd l;
    public final FF0 m;
    public final C8145yI n;

    /* JADX WARN: Illegal instructions before constructor call */
    public WI(C1666Vd c1666Vd, FF0 ff0, int i) {
        EnumC4015gi1 enumC4015gi1;
        O90.f(c1666Vd, "c");
        C7955xI c7955xI = (C7955xI) c1666Vd.c;
        Z41 z41 = c7955xI.a;
        H5 h5 = S20.b;
        C1559Tt0 c1559Tt0B = CB1.b((InterfaceC1637Ut0) c1666Vd.d, ff0.e);
        EF0 ef0 = ff0.g;
        O90.e(ef0, "getVariance(...)");
        int iOrdinal = ef0.ordinal();
        if (iOrdinal == 0) {
            enumC4015gi1 = EnumC4015gi1.d;
        } else if (iOrdinal == 1) {
            enumC4015gi1 = EnumC4015gi1.e;
        } else {
            if (iOrdinal != 2) {
                throw new C7074sg();
            }
            enumC4015gi1 = EnumC4015gi1.c;
        }
        EnumC4015gi1 enumC4015gi12 = enumC4015gi1;
        super(z41, (CD) c1666Vd.e, h5, c1559Tt0B, enumC4015gi12, ff0.f, i, C0396Ev0.h);
        this.l = c1666Vd;
        this.m = ff0;
        this.n = new C8145yI(c7955xI.a, new C3881g1(15, this));
    }

    @Override // defpackage.U0, defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // defpackage.AbstractC6567q1
    public final List z1() {
        C1666Vd c1666Vd = this.l;
        C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
        FF0 ff0 = this.m;
        O90.f(ff0, "<this>");
        O90.f(c5826m71, "typeTable");
        List list = ff0.h;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = ff0.i;
            O90.e(list2, "getUpperBoundIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(AbstractC8449zu.k(list3));
            for (Integer num : list3) {
                O90.c(num);
                arrayList.add(c5826m71.h(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return AbstractC8259yu.e(AbstractC7384uI.e(this).m());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C1902Yd1) c1666Vd.h).g((AF0) it.next()));
        }
        return arrayList2;
    }
}

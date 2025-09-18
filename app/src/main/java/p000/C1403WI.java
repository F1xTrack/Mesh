package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: WI */
/* loaded from: classes2.dex */
public final class C1403WI extends AbstractC6590p0 {

    /* renamed from: l */
    public final C1361Vd f13126l;

    /* renamed from: m */
    public final FF0 f13127m;

    /* renamed from: n */
    public final C7192yI f13128n;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1403WI(C1361Vd c1361Vd, FF0 ff0, int i) {
        EnumC9532gi1 enumC9532gi1;
        O90.m5968f(c1361Vd, "c");
        C7129xI c7129xI = (C7129xI) c1361Vd.f12662c;
        Z41 z41 = c7129xI.f45518a;
        C0447H5 c0447h5 = S20.f10539b;
        C8340Tt0 c8340Tt0M1002b = CB1.m1002b((InterfaceC8392Ut0) c1361Vd.f12663d, ff0.f3116e);
        EF0 ef0 = ff0.f3118g;
        O90.m5967e(ef0, "getVariance(...)");
        int iOrdinal = ef0.ordinal();
        if (iOrdinal == 0) {
            enumC9532gi1 = EnumC9532gi1.f27948d;
        } else if (iOrdinal == 1) {
            enumC9532gi1 = EnumC9532gi1.f27949e;
        } else {
            if (iOrdinal != 2) {
                throw new C6838sg();
            }
            enumC9532gi1 = EnumC9532gi1.f27947c;
        }
        EnumC9532gi1 enumC9532gi12 = enumC9532gi1;
        super(z41, (InterfaceC0140CD) c1361Vd.f12664e, c0447h5, c8340Tt0M1002b, enumC9532gi12, ff0.f3117f, i, C7564Ev0.f2965h);
        this.f13126l = c1361Vd;
        this.f13127m = ff0;
        this.f13128n = new C7192yI(c7129xI.f45518a, new C4090g1(15, this));
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return this.f13128n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // p000.AbstractC6654q1
    /* renamed from: z1 */
    public final List mo8120z1() {
        C1361Vd c1361Vd = this.f13126l;
        C10226m71 c10226m71 = (C10226m71) c1361Vd.f12661b;
        FF0 ff0 = this.f13127m;
        O90.m5968f(ff0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        List list = ff0.f3119h;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = ff0.f3120i;
            O90.m5967e(list2, "getUpperBoundIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(AbstractC7293zu.m26586k(list3));
            for (Integer num : list3) {
                O90.m5965c(num);
                arrayList.add(c10226m71.m22681h(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return AbstractC7230yu.m26274e(AbstractC6940uI.m25152e(this).m26505m());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C8569Yd1) c1361Vd.f12667h).m9332g((AF0) it.next()));
        }
        return arrayList2;
    }
}

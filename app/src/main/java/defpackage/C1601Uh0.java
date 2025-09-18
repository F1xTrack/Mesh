package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: Uh0 */
/* loaded from: classes2.dex */
public final class C1601Uh0 extends AbstractC6372p0 {
    public final C6045nH l;
    public final C7406uP0 m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1601Uh0(C6045nH c6045nH, C7406uP0 c7406uP0, int i, ED ed) {
        O90.f(c7406uP0, "javaTypeParameter");
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        super((C1922Yk0) c4375ib0.a, ed, new C8031xh0(c6045nH, c7406uP0, false), C1559Tt0.e(c7406uP0.a.getName()), EnumC4015gi1.c, false, i, (C0396Ev0) c4375ib0.m);
        this.l = c6045nH;
        this.m = c7406uP0;
    }

    @Override // defpackage.AbstractC6567q1
    public final List y1(List list) {
        C6045nH c6045nH = this.l;
        S20 s20 = (S20) ((C4375ib0) c6045nH.b).r;
        s20.getClass();
        List<AbstractC0663Ig0> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
        for (AbstractC0663Ig0 abstractC0663Ig0O : list2) {
            XS0 xs0 = XS0.u;
            O90.f(abstractC0663Ig0O, "<this>");
            if (!AbstractC0112Be1.c(abstractC0663Ig0O, xs0, null) && (abstractC0663Ig0O = s20.o(new C5818m5((ED) this, false, c6045nH, B5.f, false), abstractC0663Ig0O, MN.a, null, false)) == null) {
                abstractC0663Ig0O = abstractC0663Ig0O;
            }
            arrayList.add(abstractC0663Ig0O);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC6567q1
    public final List z1() {
        Type[] bounds = this.m.a.getBounds();
        O90.e(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C4339iP0(type));
        }
        C4339iP0 c4339iP0 = (C4339iP0) AbstractC8069xu.T(arrayList);
        RandomAccess randomAccess = arrayList;
        if (O90.a(c4339iP0 != null ? c4339iP0.a : null, Object.class)) {
            randomAccess = MN.a;
        }
        ArrayList arrayList2 = (Collection) randomAccess;
        boolean zIsEmpty = arrayList2.isEmpty();
        C6045nH c6045nH = this.l;
        if (zIsEmpty) {
            return AbstractC8259yu.e(NV1.t(((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.e(), ((C0231Cs0) ((C4375ib0) c6045nH.b).o).e.o()));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayList3));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((C1857Xo1) c6045nH.e).V((C4339iP0) it.next(), K22.a(EnumC8403ze1.b, false, false, this, 3)));
        }
        return arrayList4;
    }
}

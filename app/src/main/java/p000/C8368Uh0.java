package p000;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: Uh0 */
/* loaded from: classes2.dex */
public final class C8368Uh0 extends AbstractC6590p0 {

    /* renamed from: l */
    public final C6479nH f11976l;

    /* renamed from: m */
    public final C11285uP0 f11977m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8368Uh0(C6479nH c6479nH, C11285uP0 c11285uP0, int i, InterfaceC0266ED interfaceC0266ED) {
        O90.m5968f(c11285uP0, "javaTypeParameter");
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        super((C8582Yk0) c9773ib0.f29338a, interfaceC0266ED, new C11703xh0(c6479nH, c11285uP0, false), C8340Tt0.m7798e(c11285uP0.f43688a.getName()), EnumC9532gi1.f27947c, false, i, (C7564Ev0) c9773ib0.f29350m);
        this.f11976l = c6479nH;
        this.f11977m = c11285uP0;
    }

    @Override // p000.AbstractC6654q1
    /* renamed from: y1 */
    public final List mo8119y1(List list) {
        C6479nH c6479nH = this.f11976l;
        S20 s20 = (S20) ((C9773ib0) c6479nH.f38228b).f29355r;
        s20.getClass();
        List<AbstractC7742Ig0> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
        for (AbstractC7742Ig0 abstractC7742Ig0M7163o : list2) {
            XS0 xs0 = XS0.f13785u;
            O90.m5968f(abstractC7742Ig0M7163o, "<this>");
            if (!AbstractC7375Be1.m785c(abstractC7742Ig0M7163o, xs0, null) && (abstractC7742Ig0M7163o = s20.m7163o(new C6404m5((InterfaceC0266ED) this, false, c6479nH, EnumC0069B5.f557f, false), abstractC7742Ig0M7163o, C0779MN.f7117a, null, false)) == null) {
                abstractC7742Ig0M7163o = abstractC7742Ig0M7163o;
            }
            arrayList.add(abstractC7742Ig0M7163o);
        }
        return arrayList;
    }

    @Override // p000.AbstractC6654q1
    /* renamed from: z1 */
    public final List mo8120z1() {
        Type[] bounds = this.f11977m.f43688a.getBounds();
        O90.m5967e(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C9749iP0(type));
        }
        C9749iP0 c9749iP0 = (C9749iP0) AbstractC7167xu.m25974T(arrayList);
        RandomAccess randomAccess = arrayList;
        if (O90.m5963a(c9749iP0 != null ? c9749iP0.f29121a : null, Object.class)) {
            randomAccess = C0779MN.f7117a;
        }
        ArrayList arrayList2 = (Collection) randomAccess;
        boolean zIsEmpty = arrayList2.isEmpty();
        C6479nH c6479nH = this.f11976l;
        if (zIsEmpty) {
            return AbstractC7230yu.m26274e(NV1.m5738t(((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26498e(), ((C7454Cs0) ((C9773ib0) c6479nH.f38228b).f29352o).f1735e.m26507o()));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayList3));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((C8539Xo1) c6479nH.f38231e).m9139V((C9749iP0) it.next(), K22.m4530a(EnumC11952ze1.f46923b, false, false, this, 3)));
        }
        return arrayList4;
    }
}

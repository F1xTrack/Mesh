package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: DZ */
/* loaded from: classes2.dex */
public final class C0225DZ extends U01 {
    public C0225DZ(InterfaceC0140CD interfaceC0140CD, C0225DZ c0225dz, int i, boolean z) {
        super(interfaceC0140CD, c0225dz, S20.f10539b, AbstractC11610wy0.f45195g, i, W21.f12940O0);
        this.f1438n = true;
        this.f1446v = z;
        this.f1447w = false;
    }

    @Override // p000.U01, p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        O90.m5968f(interfaceC0140CD, "newOwner");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(interfaceC0510I5, "annotations");
        return new C0225DZ(interfaceC0140CD, (C0225DZ) interfaceC0036AZ, i, this.f1446v);
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: B1 */
    public final AbstractC0162CZ mo1214B1(C0099BZ c0099bz) {
        C8340Tt0 c8340Tt0;
        O90.m5968f(c0099bz, "configuration");
        C0225DZ c0225dz = (C0225DZ) super.mo1214B1(c0099bz);
        if (c0225dz == null) {
            return null;
        }
        List listMo1221f0 = c0225dz.mo1221f0();
        O90.m5967e(listMo1221f0, "getValueParameters(...)");
        List list = listMo1221f0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c0225dz;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7742Ig0 type = ((C8473Wh1) it.next()).getType();
            O90.m5967e(type, "getType(...)");
            if (A12.m20c(type) != null) {
                List listMo1221f02 = c0225dz.mo1221f0();
                O90.m5967e(listMo1221f02, "getValueParameters(...)");
                List list2 = listMo1221f02;
                ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC7742Ig0 type2 = ((C8473Wh1) it2.next()).getType();
                    O90.m5967e(type2, "getType(...)");
                    arrayList.add(A12.m20c(type2));
                }
                int size = c0225dz.mo1221f0().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listMo1221f03 = c0225dz.mo1221f0();
                    O90.m5967e(listMo1221f03, "getValueParameters(...)");
                    ArrayList arrayListM25989i0 = AbstractC7167xu.m25989i0(arrayList, listMo1221f03);
                    if (arrayListM25989i0.isEmpty()) {
                        return c0225dz;
                    }
                    Iterator it3 = arrayListM25989i0.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!O90.m5963a((C8340Tt0) pair.f36702a, ((C8473Wh1) pair.f36703b).getName())) {
                        }
                    }
                    return c0225dz;
                }
                List listMo1221f04 = c0225dz.mo1221f0();
                O90.m5967e(listMo1221f04, "getValueParameters(...)");
                List<C8473Wh1> list3 = listMo1221f04;
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list3));
                for (C8473Wh1 c8473Wh1 : list3) {
                    C8340Tt0 name = c8473Wh1.getName();
                    O90.m5967e(name, "getName(...)");
                    int i = c8473Wh1.f13323g;
                    int i2 = i - size;
                    if (i2 >= 0 && (c8340Tt0 = (C8340Tt0) arrayList.get(i2)) != null) {
                        name = c8340Tt0;
                    }
                    arrayList2.add(c8473Wh1.mo8540y1(c0225dz, name, i));
                }
                C0099BZ c0099bzM1216E1 = c0225dz.m1216E1(C11571we1.f45010b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((C8340Tt0) it4.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                c0099bzM1216E1.f901v = Boolean.valueOf(z);
                c0099bzM1216E1.f886g = arrayList2;
                c0099bzM1216E1.f884e = c0225dz.mo229a();
                AbstractC0162CZ abstractC0162CZMo1214B1 = super.mo1214B1(c0099bzM1216E1);
                O90.m5965c(abstractC0162CZMo1214B1);
                return abstractC0162CZMo1214B1;
            }
        }
        return c0225dz;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    /* renamed from: S */
    public final boolean mo113S() {
        return false;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    public final boolean isInline() {
        return false;
    }
}

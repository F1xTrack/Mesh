package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class DZ extends U01 {
    public DZ(CD cd, DZ dz, int i, boolean z) {
        super(cd, dz, S20.b, AbstractC7892wy0.g, i, W21.O0);
        this.n = true;
        this.v = z;
        this.w = false;
    }

    @Override // defpackage.U01, defpackage.CZ
    public final CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        O90.f(cd, "newOwner");
        NX.m(i, "kind");
        O90.f(i5, "annotations");
        return new DZ(cd, (DZ) az, i, this.v);
    }

    @Override // defpackage.CZ
    public final CZ B1(BZ bz) {
        C1559Tt0 c1559Tt0;
        O90.f(bz, "configuration");
        DZ dz = (DZ) super.B1(bz);
        if (dz == null) {
            return null;
        }
        List listF0 = dz.f0();
        O90.e(listF0, "getValueParameters(...)");
        List list = listF0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return dz;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0663Ig0 type = ((C1758Wh1) it.next()).getType();
            O90.e(type, "getType(...)");
            if (A12.c(type) != null) {
                List listF02 = dz.f0();
                O90.e(listF02, "getValueParameters(...)");
                List list2 = listF02;
                ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC0663Ig0 type2 = ((C1758Wh1) it2.next()).getType();
                    O90.e(type2, "getType(...)");
                    arrayList.add(A12.c(type2));
                }
                int size = dz.f0().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listF03 = dz.f0();
                    O90.e(listF03, "getValueParameters(...)");
                    ArrayList arrayListI0 = AbstractC8069xu.i0(arrayList, listF03);
                    if (arrayListI0.isEmpty()) {
                        return dz;
                    }
                    Iterator it3 = arrayListI0.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!O90.a((C1559Tt0) pair.a, ((C1758Wh1) pair.b).getName())) {
                        }
                    }
                    return dz;
                }
                List listF04 = dz.f0();
                O90.e(listF04, "getValueParameters(...)");
                List<C1758Wh1> list3 = listF04;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list3));
                for (C1758Wh1 c1758Wh1 : list3) {
                    C1559Tt0 name = c1758Wh1.getName();
                    O90.e(name, "getName(...)");
                    int i = c1758Wh1.g;
                    int i2 = i - size;
                    if (i2 >= 0 && (c1559Tt0 = (C1559Tt0) arrayList.get(i2)) != null) {
                        name = c1559Tt0;
                    }
                    arrayList2.add(c1758Wh1.y1(dz, name, i));
                }
                BZ bzE1 = dz.E1(C7833we1.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((C1559Tt0) it4.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                bzE1.v = Boolean.valueOf(z);
                bzE1.g = arrayList2;
                bzE1.e = dz.a();
                CZ czB1 = super.B1(bzE1);
                O90.c(czB1);
                return czB1;
            }
        }
        return dz;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean S() {
        return false;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public final boolean isInline() {
        return false;
    }
}

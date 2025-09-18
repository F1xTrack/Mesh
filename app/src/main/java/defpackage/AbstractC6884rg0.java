package defpackage;

import java.util.ArrayList;

/* renamed from: rg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6884rg0 {
    public static final VH a = VH.A("k");

    public static ArrayList a(AbstractC8396zc0 abstractC8396zc0, C1847Xl0 c1847Xl0, float f, InterfaceC1836Xh1 interfaceC1836Xh1, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC8396zc0.U() == 6) {
            c1847Xl0.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC8396zc0.n();
        while (abstractC8396zc0.x()) {
            if (abstractC8396zc0.X(a) != 0) {
                abstractC8396zc0.d0();
            } else if (abstractC8396zc0.U() == 1) {
                abstractC8396zc0.m();
                if (abstractC8396zc0.U() == 7) {
                    arrayList.add(AbstractC6694qg0.b(abstractC8396zc0, c1847Xl0, f, interfaceC1836Xh1, false, z));
                } else {
                    while (abstractC8396zc0.x()) {
                        arrayList.add(AbstractC6694qg0.b(abstractC8396zc0, c1847Xl0, f, interfaceC1836Xh1, true, z));
                    }
                }
                abstractC8396zc0.o();
            } else {
                arrayList.add(AbstractC6694qg0.b(abstractC8396zc0, c1847Xl0, f, interfaceC1836Xh1, false, z));
            }
        }
        abstractC8396zc0.p();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C6312og0 c6312og0 = (C6312og0) arrayList.get(i2);
            i2++;
            C6312og0 c6312og02 = (C6312og0) arrayList.get(i2);
            c6312og0.h = Float.valueOf(c6312og02.g);
            if (c6312og0.c == null && (obj = c6312og02.b) != null) {
                c6312og0.c = obj;
                if (c6312og0 instanceof C6979sA0) {
                    ((C6979sA0) c6312og0).d();
                }
            }
        }
        C6312og0 c6312og03 = (C6312og0) arrayList.get(i);
        if ((c6312og03.b == null || c6312og03.c == null) && arrayList.size() > 1) {
            arrayList.remove(c6312og03);
        }
    }
}

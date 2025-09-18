package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class PZ0 implements InterfaceC1836Xh1 {
    public static final PZ0 a = new PZ0();
    public static final VH b = VH.A("c", "v", "i", "o");

    @Override // defpackage.InterfaceC1836Xh1
    public final Object z(AbstractC8396zc0 abstractC8396zc0, float f) {
        if (abstractC8396zc0.U() == 1) {
            abstractC8396zc0.m();
        }
        abstractC8396zc0.n();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zA = false;
        while (abstractC8396zc0.x()) {
            int iX = abstractC8396zc0.X(b);
            if (iX == 0) {
                zA = abstractC8396zc0.A();
            } else if (iX == 1) {
                arrayListC = AbstractC0651Ic0.c(abstractC8396zc0, f);
            } else if (iX == 2) {
                arrayListC2 = AbstractC0651Ic0.c(abstractC8396zc0, f);
            } else if (iX != 3) {
                abstractC8396zc0.b0();
                abstractC8396zc0.d0();
            } else {
                arrayListC3 = AbstractC0651Ic0.c(abstractC8396zc0, f);
            }
        }
        abstractC8396zc0.p();
        if (abstractC8396zc0.U() == 2) {
            abstractC8396zc0.o();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new OZ0(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new C6981sB(AbstractC2215as0.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), AbstractC2215as0.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zA) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new C6981sB(AbstractC2215as0.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), AbstractC2215as0.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new OZ0(pointF, zA, arrayList);
    }
}

package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class PZ0 implements InterfaceC8525Xh1 {

    /* renamed from: a */
    public static final PZ0 f9133a = new PZ0();

    /* renamed from: b */
    public static final C1339VH f9134b = C1339VH.m8357A("c", "v", "i", "o");

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public final Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        if (abstractC11947zc0.mo3517U() == 1) {
            abstractC11947zc0.mo3523m();
        }
        abstractC11947zc0.mo3525n();
        ArrayList arrayListM3956c = null;
        ArrayList arrayListM3956c2 = null;
        ArrayList arrayListM3956c3 = null;
        boolean zMo3513A = false;
        while (abstractC11947zc0.mo3535x()) {
            int iMo3518X = abstractC11947zc0.mo3518X(f9134b);
            if (iMo3518X == 0) {
                zMo3513A = abstractC11947zc0.mo3513A();
            } else if (iMo3518X == 1) {
                arrayListM3956c = AbstractC7734Ic0.m3956c(abstractC11947zc0, f);
            } else if (iMo3518X == 2) {
                arrayListM3956c2 = AbstractC7734Ic0.m3956c(abstractC11947zc0, f);
            } else if (iMo3518X != 3) {
                abstractC11947zc0.mo3519b0();
                abstractC11947zc0.mo3520d0();
            } else {
                arrayListM3956c3 = AbstractC7734Ic0.m3956c(abstractC11947zc0, f);
            }
        }
        abstractC11947zc0.mo3529p();
        if (abstractC11947zc0.mo3517U() == 2) {
            abstractC11947zc0.mo3527o();
        }
        if (arrayListM3956c == null || arrayListM3956c2 == null || arrayListM3956c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListM3956c.isEmpty()) {
            return new OZ0(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListM3956c.size();
        PointF pointF = (PointF) arrayListM3956c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListM3956c.get(i);
            int i2 = i - 1;
            arrayList.add(new C6807sB(AbstractC8778as0.m10349a((PointF) arrayListM3956c.get(i2), (PointF) arrayListM3956c3.get(i2)), AbstractC8778as0.m10349a(pointF2, (PointF) arrayListM3956c2.get(i)), pointF2));
        }
        if (zMo3513A) {
            PointF pointF3 = (PointF) arrayListM3956c.get(0);
            int i3 = size - 1;
            arrayList.add(new C6807sB(AbstractC8778as0.m10349a((PointF) arrayListM3956c.get(i3), (PointF) arrayListM3956c3.get(i3)), AbstractC8778as0.m10349a(pointF3, (PointF) arrayListM3956c2.get(0)), pointF3));
        }
        return new OZ0(pointF, zMo3513A, arrayList);
    }
}

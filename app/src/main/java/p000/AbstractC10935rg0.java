package p000;

import java.util.ArrayList;

/* renamed from: rg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10935rg0 {

    /* renamed from: a */
    public static final C1339VH f41804a = C1339VH.m8357A("k");

    /* renamed from: a */
    public static ArrayList m24446a(AbstractC11947zc0 abstractC11947zc0, C8532Xl0 c8532Xl0, float f, InterfaceC8525Xh1 interfaceC8525Xh1, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC11947zc0.mo3517U() == 6) {
            c8532Xl0.m9110a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC11947zc0.mo3525n();
        while (abstractC11947zc0.mo3535x()) {
            if (abstractC11947zc0.mo3518X(f41804a) != 0) {
                abstractC11947zc0.mo3520d0();
            } else if (abstractC11947zc0.mo3517U() == 1) {
                abstractC11947zc0.mo3523m();
                if (abstractC11947zc0.mo3517U() == 7) {
                    arrayList.add(AbstractC10807qg0.m24043b(abstractC11947zc0, c8532Xl0, f, interfaceC8525Xh1, false, z));
                } else {
                    while (abstractC11947zc0.mo3535x()) {
                        arrayList.add(AbstractC10807qg0.m24043b(abstractC11947zc0, c8532Xl0, f, interfaceC8525Xh1, true, z));
                    }
                }
                abstractC11947zc0.mo3527o();
            } else {
                arrayList.add(AbstractC10807qg0.m24043b(abstractC11947zc0, c8532Xl0, f, interfaceC8525Xh1, false, z));
            }
        }
        abstractC11947zc0.mo3529p();
        m24447b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m24447b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C10551og0 c10551og0 = (C10551og0) arrayList.get(i2);
            i2++;
            C10551og0 c10551og02 = (C10551og0) arrayList.get(i2);
            c10551og0.f39165h = Float.valueOf(c10551og02.f39164g);
            if (c10551og0.f39160c == null && (obj = c10551og02.f39159b) != null) {
                c10551og0.f39160c = obj;
                if (c10551og0 instanceof C10999sA0) {
                    ((C10999sA0) c10551og0).m24650d();
                }
            }
        }
        C10551og0 c10551og03 = (C10551og0) arrayList.get(i);
        if ((c10551og03.f39159b == null || c10551og03.f39160c == null) && arrayList.size() > 1) {
            arrayList.remove(c10551og03);
        }
    }
}

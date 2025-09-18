package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9500gS1 {
    /* renamed from: a */
    public static void m18558a(AbstractC6511nn abstractC6511nn, ArrayList arrayList) {
        if (abstractC6511nn instanceof C6574on) {
            Iterator it = ((C6574on) abstractC6511nn).f39260a.iterator();
            while (it.hasNext()) {
                m18558a((AbstractC6511nn) it.next(), arrayList);
            }
        } else if (abstractC6511nn instanceof C1310Up) {
            arrayList.add(((C1310Up) abstractC6511nn).f12154a);
        } else {
            arrayList.add(new C0364Fm(abstractC6511nn));
        }
    }

    /* renamed from: b */
    public static final boolean m18559b(RV0 rv0) {
        return rv0.getStackPresentation() == OV0.f8463d;
    }
}

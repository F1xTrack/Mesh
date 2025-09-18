package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3967gS1 {
    public static void a(AbstractC6141nn abstractC6141nn, ArrayList arrayList) {
        if (abstractC6141nn instanceof C6332on) {
            Iterator it = ((C6332on) abstractC6141nn).a.iterator();
            while (it.hasNext()) {
                a((AbstractC6141nn) it.next(), arrayList);
            }
        } else if (abstractC6141nn instanceof C1624Up) {
            arrayList.add(((C1624Up) abstractC6141nn).a);
        } else {
            arrayList.add(new C0446Fm(abstractC6141nn));
        }
    }

    public static final boolean b(RV0 rv0) {
        return rv0.getStackPresentation() == OV0.d;
    }
}

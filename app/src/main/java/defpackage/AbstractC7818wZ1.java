package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC7818wZ1 {
    public static final Object a(Object obj, boolean z) {
        EnumC7066sd0 enumC7066sd0;
        O90.f(obj, "possiblyPrimitiveType");
        if (!z) {
            return obj;
        }
        AbstractC1043Nd0 abstractC1043Nd0 = (AbstractC1043Nd0) obj;
        if (!(abstractC1043Nd0 instanceof C0965Md0) || (enumC7066sd0 = ((C0965Md0) abstractC1043Nd0).i) == null) {
            return abstractC1043Nd0;
        }
        String strE = C3427dd0.c(enumC7066sd0.e()).e();
        O90.e(strE, "getInternalName(...)");
        return OJ1.f(strE);
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC4314iH) it.next()).b();
        }
    }

    public static void c(List list) throws C4123hH {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((AbstractC4314iH) list.get(i)).d();
                i++;
            } catch (C4123hH e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((AbstractC4314iH) list.get(i2)).b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static C0599Hl d(List list, ExecutorC5715lY0 executorC5715lY0, C20 c20) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1500Sz1.l(((AbstractC4314iH) it.next()).c()));
        }
        return AbstractC8171yQ1.b(new C4290i9(AbstractC8171yQ1.b(new C0086Aw(AbstractC1500Sz1.q(arrayList), c20, 5000L, 3)), executorC5715lY0, list));
    }
}

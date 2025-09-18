package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC11561wZ1 {
    /* renamed from: a */
    public static final Object m25648a(Object obj, boolean z) {
        EnumC11057sd0 enumC11057sd0;
        O90.m5968f(obj, "possiblyPrimitiveType");
        if (!z) {
            return obj;
        }
        AbstractC7996Nd0 abstractC7996Nd0 = (AbstractC7996Nd0) obj;
        if (!(abstractC7996Nd0 instanceof C7944Md0) || (enumC11057sd0 = ((C7944Md0) abstractC7996Nd0).f7276i) == null) {
            return abstractC7996Nd0;
        }
        String strM17718e = C9137dd0.m17716c(enumC11057sd0.m24760e()).m17718e();
        O90.m5967e(strM17718e, "getInternalName(...)");
        return OJ1.m6011f(strM17718e);
    }

    /* renamed from: b */
    public static void m25649b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC4232iH) it.next()).m18991b();
        }
    }

    /* renamed from: c */
    public static void m25650c(List list) throws C4169hH {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((AbstractC4232iH) list.get(i)).m18993d();
                i++;
            } catch (C4169hH e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((AbstractC4232iH) list.get(i2)).m18991b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    /* renamed from: d */
    public static C0489Hl m25651d(List list, ExecutorC10151lY0 executorC10151lY0, C20 c20) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8301Sz1.m7489l(((AbstractC4232iH) it.next()).m18992c()));
        }
        return AbstractC11797yQ1.m26149b(new C4224i9(AbstractC11797yQ1.m26149b(new C0059Aw(AbstractC8301Sz1.m7494q(arrayList), c20, 5000L, 3)), executorC10151lY0, list));
    }
}

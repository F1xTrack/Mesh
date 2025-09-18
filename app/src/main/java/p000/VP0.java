package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class VP0 extends AbstractC11058sd1 {

    /* renamed from: a */
    public final LinkedHashMap f12549a;

    public VP0(LinkedHashMap linkedHashMap) {
        this.f12549a = linkedHashMap;
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c7890Lc0.m5034J();
            return;
        }
        c7890Lc0.m5045o();
        try {
            Iterator it = this.f12549a.values().iterator();
            while (it.hasNext()) {
                ((TP0) it.next()).m7688a(c7890Lc0, obj);
            }
            c7890Lc0.m5048x();
        } catch (IllegalAccessException e) {
            QP1 qp1 = PP0.f9065a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}

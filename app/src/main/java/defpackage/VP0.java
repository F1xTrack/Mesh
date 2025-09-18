package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class VP0 extends AbstractC7067sd1 {
    public final LinkedHashMap a;

    public VP0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c0885Lc0.J();
            return;
        }
        c0885Lc0.o();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((TP0) it.next()).a(c0885Lc0, obj);
            }
            c0885Lc0.x();
        } catch (IllegalAccessException e) {
            QP1 qp1 = PP0.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}

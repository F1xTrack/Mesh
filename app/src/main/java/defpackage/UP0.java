package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class UP0 extends AbstractC6876rd1 {
    public final LinkedHashMap a;

    public UP0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) throws IOException {
        if (c8206yc0.p0() == 9) {
            c8206yc0.i0();
            return null;
        }
        Object objC = c();
        try {
            c8206yc0.n();
            while (c8206yc0.J()) {
                SP0 sp0 = (SP0) this.a.get(c8206yc0.e0());
                if (sp0 == null || !sp0.e) {
                    c8206yc0.v0();
                } else {
                    e(objC, c8206yc0, sp0);
                }
            }
            c8206yc0.x();
            return d(objC);
        } catch (IllegalAccessException e) {
            NP1 np1 = OP0.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C6682qc0(e2);
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c0807Kc0.J();
            return;
        }
        c0807Kc0.o();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((SP0) it.next()).a(c0807Kc0, obj);
            }
            c0807Kc0.x();
        } catch (IllegalAccessException e) {
            NP1 np1 = OP0.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, C8206yc0 c8206yc0, SP0 sp0);
}

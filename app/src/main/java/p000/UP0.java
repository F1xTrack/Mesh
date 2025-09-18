package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class UP0 extends AbstractC10930rd1 {

    /* renamed from: a */
    public final LinkedHashMap f11774a;

    public UP0(LinkedHashMap linkedHashMap) {
        this.f11774a = linkedHashMap;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) throws IOException {
        if (c11820yc0.m26194p0() == 9) {
            c11820yc0.m26186i0();
            return null;
        }
        Object objMo8009c = mo8009c();
        try {
            c11820yc0.m26189n();
            while (c11820yc0.m26177J()) {
                SP0 sp0 = (SP0) this.f11774a.get(c11820yc0.m26184e0());
                if (sp0 == null || !sp0.f10748e) {
                    c11820yc0.m26200v0();
                } else {
                    mo8011e(objMo8009c, c11820yc0, sp0);
                }
            }
            c11820yc0.m26203x();
            return mo8010d(objMo8009c);
        } catch (IllegalAccessException e) {
            NP1 np1 = OP0.f8436a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C10799qc0(e2);
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            c7838Kc0.m4680J();
            return;
        }
        c7838Kc0.m4691o();
        try {
            Iterator it = this.f11774a.values().iterator();
            while (it.hasNext()) {
                ((SP0) it.next()).m7366a(c7838Kc0, obj);
            }
            c7838Kc0.m4694x();
        } catch (IllegalAccessException e) {
            NP1 np1 = OP0.f8436a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    /* renamed from: c */
    public abstract Object mo8009c();

    /* renamed from: d */
    public abstract Object mo8010d(Object obj);

    /* renamed from: e */
    public abstract void mo8011e(Object obj, C11820yc0 c11820yc0, SP0 sp0);
}

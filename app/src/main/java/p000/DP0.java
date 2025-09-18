package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class DP0 extends HP0 {

    /* renamed from: b */
    public final /* synthetic */ Method f2006b;

    public DP0(Method method) {
        this.f2006b = method;
    }

    @Override // p000.HP0
    /* renamed from: a */
    public final boolean mo1678a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f2006b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}

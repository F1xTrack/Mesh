package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class DP0 extends HP0 {
    public final /* synthetic */ Method b;

    public DP0(Method method) {
        this.b = method;
    }

    @Override // defpackage.HP0
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}

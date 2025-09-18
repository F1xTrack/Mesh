package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class CP0 extends GP0 {
    public final /* synthetic */ Method b;

    public CP0(Method method) {
        this.b = method;
    }

    @Override // defpackage.GP0
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}

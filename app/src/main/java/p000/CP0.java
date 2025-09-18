package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class CP0 extends GP0 {

    /* renamed from: b */
    public final /* synthetic */ Method f1355b;

    public CP0(Method method) {
        this.f1355b = method;
    }

    @Override // p000.GP0
    /* renamed from: a */
    public final boolean mo1180a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f1355b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}

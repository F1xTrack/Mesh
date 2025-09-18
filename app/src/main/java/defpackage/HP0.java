package defpackage;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class HP0 {
    public static final HP0 a;

    static {
        HP0 dp0;
        if (AbstractC0570Hb0.a >= 9) {
            try {
                dp0 = new DP0(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            dp0 = null;
        }
        if (dp0 == null) {
            dp0 = new FP0();
        }
        a = dp0;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}

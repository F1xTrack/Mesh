package p000;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class HP0 {

    /* renamed from: a */
    public static final HP0 f4284a;

    static {
        HP0 dp0;
        if (AbstractC7680Hb0.f4358a >= 9) {
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
        f4284a = dp0;
    }

    /* renamed from: a */
    public abstract boolean mo1678a(Object obj, AccessibleObject accessibleObject);
}

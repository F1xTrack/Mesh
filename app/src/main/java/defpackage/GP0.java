package defpackage;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class GP0 {
    public static final GP0 a;

    static {
        GP0 cp0;
        if (AbstractC0492Gb0.a >= 9) {
            try {
                cp0 = new CP0(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            cp0 = null;
        }
        if (cp0 == null) {
            cp0 = new EP0();
        }
        a = cp0;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}

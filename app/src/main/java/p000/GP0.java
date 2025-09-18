package p000;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class GP0 {

    /* renamed from: a */
    public static final GP0 f3731a;

    static {
        GP0 cp0;
        if (AbstractC7628Gb0.f3815a >= 9) {
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
        f3731a = cp0;
    }

    /* renamed from: a */
    public abstract boolean mo1180a(Object obj, AccessibleObject accessibleObject);
}

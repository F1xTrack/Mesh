package p000;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: rL */
/* loaded from: classes.dex */
public abstract class AbstractC6737rL {

    /* renamed from: a */
    public static final int[] f41601a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f41602b = new int[0];

    /* renamed from: c */
    public static final Rect f41603c = new Rect();

    /* renamed from: a */
    public static void m24315a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f41601a);
        } else {
            drawable.setState(f41602b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static Rect m24316b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM23367a = AbstractC6546oL.m23367a(drawable);
            return new Rect(insetsM23367a.left, insetsM23367a.top, insetsM23367a.right, insetsM23367a.bottom);
        }
        boolean z = drawable instanceof InterfaceC9418fp1;
        Object obj = drawable;
        if (z) {
            ((AbstractC9546gp1) ((InterfaceC9418fp1) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z2 = AbstractC6483nL.f38279a;
        } else if (AbstractC6483nL.f38279a) {
            try {
                Object objInvoke = AbstractC6483nL.f38280b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC6483nL.f38281c.getInt(objInvoke), AbstractC6483nL.f38282d.getInt(objInvoke), AbstractC6483nL.f38283e.getInt(objInvoke), AbstractC6483nL.f38284f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f41603c;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m24317c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

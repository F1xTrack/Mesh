package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: rL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6820rL {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = AbstractC6248oL.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z = drawable instanceof InterfaceC3845fp1;
        Object obj = drawable;
        if (z) {
            ((AbstractC4036gp1) ((InterfaceC3845fp1) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z2 = AbstractC6057nL.a;
        } else if (AbstractC6057nL.a) {
            try {
                Object objInvoke = AbstractC6057nL.b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC6057nL.c.getInt(objInvoke), AbstractC6057nL.d.getInt(objInvoke), AbstractC6057nL.e.getInt(objInvoke), AbstractC6057nL.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
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

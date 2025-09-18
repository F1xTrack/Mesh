package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: oB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6220oB1 implements InterfaceC3762fO {
    public static final C5536kc0 a = new C5536kc0(2);

    public static float b(int i, String[] strArr) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean c(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int d(Context context, int i, int i2) {
        TypedValue typedValueA = AbstractC5340ja1.a(context, i);
        return (typedValueA == null || typedValueA.type != 16) ? i2 : typedValueA.data;
    }

    public static TimeInterpolator e(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!c(strValueOf, "cubic-bezier") && !c(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!c(strValueOf, "cubic-bezier")) {
            if (c(strValueOf, "path")) {
                return AbstractC6788rA0.c(AbstractC7963xK1.d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(StringUtils.COMMA);
        if (strArrSplit.length == 4) {
            return AbstractC6788rA0.b(b(0, strArrSplit), b(1, strArrSplit), b(2, strArrSplit), b(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}

package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: oB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10490oB1 implements InterfaceC4050fO {

    /* renamed from: a */
    public static final C10031kc0 f38868a = new C10031kc0(2);

    /* renamed from: b */
    public static float m23357b(int i, String[] strArr) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* renamed from: c */
    public static boolean m23358c(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: d */
    public static int m23359d(Context context, int i, int i2) {
        TypedValue typedValueM22072a = AbstractC9900ja1.m22072a(context, i);
        return (typedValueM22072a == null || typedValueM22072a.type != 16) ? i2 : typedValueM22072a.data;
    }

    /* renamed from: e */
    public static TimeInterpolator m23360e(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m23358c(strValueOf, "cubic-bezier") && !m23358c(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m23358c(strValueOf, "cubic-bezier")) {
            if (m23358c(strValueOf, "path")) {
                return AbstractC10871rA0.m24168c(AbstractC11658xK1.m25840d(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(StringUtils.COMMA);
        if (strArrSplit.length == 4) {
            return AbstractC10871rA0.m24167b(m23357b(0, strArrSplit), m23357b(1, strArrSplit), m23357b(2, strArrSplit), m23357b(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}

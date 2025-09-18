package p000;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: ja1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9900ja1 {

    /* renamed from: a */
    public static final String[] f35251a = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public static TypedValue m22072a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m22073b(Context context, int i, boolean z) {
        TypedValue typedValueM22072a = m22072a(context, i);
        return (typedValueM22072a == null || typedValueM22072a.type != 18) ? z : typedValueM22072a.data != 0;
    }

    /* renamed from: c */
    public static TypedValue m22074c(Context context, int i, String str) {
        TypedValue typedValueM22072a = m22072a(context, i);
        if (typedValueM22072a != null) {
            return typedValueM22072a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}

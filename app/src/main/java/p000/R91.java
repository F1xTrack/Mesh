package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class R91 {

    /* renamed from: a */
    public static final ThreadLocal f10040a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f10041b = {-16842910};

    /* renamed from: c */
    public static final int[] f10042c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f10043d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f10044e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f10045f = new int[0];

    /* renamed from: g */
    public static final int[] f10046g = new int[1];

    /* renamed from: a */
    public static void m6917a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC8704aH0.f15432j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m6918b(Context context, int i) {
        ColorStateList colorStateListM6920d = m6920d(context, i);
        if (colorStateListM6920d != null && colorStateListM6920d.isStateful()) {
            return colorStateListM6920d.getColorForState(f10041b, colorStateListM6920d.getDefaultColor());
        }
        ThreadLocal threadLocal = f10040a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0749Lu.m5133f(m6919c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: c */
    public static int m6919c(Context context, int i) {
        int[] iArr = f10046g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m6920d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f10046g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC3982eJ.m17900b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: A7 */
/* loaded from: classes.dex */
public class C0008A7 {

    /* renamed from: b */
    public static final Class[] f74b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f75c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f76d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f77e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f78f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f79g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final L01 f80h = new L01();

    /* renamed from: a */
    public final Object[] f81a = new Object[2];

    /* renamed from: a */
    public C6279k6 mo56a(Context context, AttributeSet attributeSet) {
        return new C6279k6(context, attributeSet);
    }

    /* renamed from: b */
    public C6342l6 mo57b(Context context, AttributeSet attributeSet) {
        return new C6342l6(context, attributeSet, ru.mes.dnevnik.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C6468n6 mo58c(Context context, AttributeSet attributeSet) {
        return new C6468n6(context, attributeSet, ru.mes.dnevnik.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C1076R6 mo59d(Context context, AttributeSet attributeSet) {
        return new C1076R6(context, attributeSet);
    }

    /* renamed from: e */
    public C6803s7 mo60e(Context context, AttributeSet attributeSet) {
        return new C6803s7(context, attributeSet);
    }

    /* renamed from: f */
    public final View m61f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        L01 l01 = f80h;
        Constructor constructor = (Constructor) l01.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f74b);
            l01.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f81a);
    }
}

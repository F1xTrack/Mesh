package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class A7 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final L01 h = new L01();
    public final Object[] a = new Object[2];

    public C5439k6 a(Context context, AttributeSet attributeSet) {
        return new C5439k6(context, attributeSet);
    }

    public C5630l6 b(Context context, AttributeSet attributeSet) {
        return new C5630l6(context, attributeSet, ru.mes.dnevnik.R.attr.buttonStyle);
    }

    public C6012n6 c(Context context, AttributeSet attributeSet) {
        return new C6012n6(context, attributeSet, ru.mes.dnevnik.R.attr.checkboxStyle);
    }

    public R6 d(Context context, AttributeSet attributeSet) {
        return new R6(context, attributeSet);
    }

    public C6969s7 e(Context context, AttributeSet attributeSet) {
        return new C6969s7(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        L01 l01 = h;
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
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            l01.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}

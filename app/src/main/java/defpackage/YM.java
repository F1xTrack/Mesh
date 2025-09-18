package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.Window;
import java.util.LinkedHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public abstract class YM {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static boolean b;
    public static boolean c;

    public static C2204ao1 a(Window window) {
        C2204ao1 c2204ao1 = new C2204ao1(window, window.getDecorView());
        c2204ao1.a.h(2);
        if (b) {
            c2204ao1.a(1);
        } else {
            c2204ao1.b(1);
        }
        if (c) {
            c2204ao1.a(2);
        } else {
            c2204ao1.b(2);
        }
        return c2204ao1;
    }

    public static boolean b(Activity activity) {
        return c(activity, R.attr.enforceSystemBarsLightTheme) || (activity.getWindow().getDecorView().getResources().getConfiguration().uiMode & 48) != 32;
    }

    public static boolean c(Activity activity, int i) {
        LinkedHashMap linkedHashMap = a;
        Integer numValueOf = Integer.valueOf(i);
        Object objValueOf = linkedHashMap.get(numValueOf);
        if (objValueOf == null) {
            TypedValue typedValue = new TypedValue();
            objValueOf = Boolean.valueOf(activity.getTheme().resolveAttribute(i, typedValue, true) && typedValue.data != 0);
            linkedHashMap.put(numValueOf, objValueOf);
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}

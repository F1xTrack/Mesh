package p000;

import android.app.Activity;
import android.util.TypedValue;
import android.view.Window;
import java.util.LinkedHashMap;
import ru.mes.dnevnik.R;

/* renamed from: YM */
/* loaded from: classes2.dex */
public abstract class AbstractC1533YM {

    /* renamed from: a */
    public static final LinkedHashMap f14265a = new LinkedHashMap();

    /* renamed from: b */
    public static boolean f14266b;

    /* renamed from: c */
    public static boolean f14267c;

    /* renamed from: a */
    public static C8771ao1 m9263a(Window window) {
        C8771ao1 c8771ao1 = new C8771ao1(window, window.getDecorView());
        c8771ao1.f16606a.mo8864h(2);
        if (f14266b) {
            c8771ao1.m10338a(1);
        } else {
            c8771ao1.m10339b(1);
        }
        if (f14267c) {
            c8771ao1.m10338a(2);
        } else {
            c8771ao1.m10339b(2);
        }
        return c8771ao1;
    }

    /* renamed from: b */
    public static boolean m9264b(Activity activity) {
        return m9265c(activity, R.attr.enforceSystemBarsLightTheme) || (activity.getWindow().getDecorView().getResources().getConfiguration().uiMode & 48) != 32;
    }

    /* renamed from: c */
    public static boolean m9265c(Activity activity, int i) {
        LinkedHashMap linkedHashMap = f14265a;
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

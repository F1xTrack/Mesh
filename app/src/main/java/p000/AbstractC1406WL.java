package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: WL */
/* loaded from: classes.dex */
public abstract class AbstractC1406WL {

    /* renamed from: a */
    public static final Method f13137a;

    /* renamed from: b */
    public static final Method f13138b;

    /* renamed from: c */
    public static final Method f13139c;

    /* renamed from: d */
    public static final boolean f13140d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f13137a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f13138b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f13139c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f13140d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

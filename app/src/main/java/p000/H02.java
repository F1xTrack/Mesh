package p000;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class H02 {

    /* renamed from: a */
    public static boolean f3987a = true;

    /* renamed from: a */
    public static final boolean m3208a(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!O90.m5963a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m3209b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11964zk1.m26530b(viewGroup, z);
        } else if (f3987a) {
            try {
                AbstractC11964zk1.m26530b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f3987a = false;
            }
        }
    }
}

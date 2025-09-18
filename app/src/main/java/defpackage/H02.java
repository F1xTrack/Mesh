package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class H02 {
    public static boolean a = true;

    public static final boolean a(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!O90.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC8421zk1.b(viewGroup, z);
        } else if (a) {
            try {
                AbstractC8421zk1.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}

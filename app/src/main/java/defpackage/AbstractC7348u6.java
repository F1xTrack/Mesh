package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: u6 */
/* loaded from: classes.dex */
public abstract class AbstractC7348u6 {
    public static final ExecutorC7157t6 a = new ExecutorC7157t6(new TJ(6));
    public static int b = -100;
    public static C0675Ik0 c = null;
    public static C0675Ik0 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final C8 g = new C8(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (e == null) {
            try {
                int i2 = J7.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) J7.class), Build.VERSION.SDK_INT >= 24 ? I7.a() | 128 : 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void e(H6 h6) {
        synchronized (h) {
            try {
                C8 c8 = g;
                c8.getClass();
                C6972s8 c6972s8 = new C6972s8(c8);
                while (c6972s8.hasNext()) {
                    AbstractC7348u6 abstractC7348u6 = (AbstractC7348u6) ((WeakReference) c6972s8.next()).get();
                    if (abstractC7348u6 == h6 || abstractC7348u6 == null) {
                        c6972s8.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && b != i2) {
            b = i2;
            synchronized (h) {
                try {
                    C8 c8 = g;
                    c8.getClass();
                    C6972s8 c6972s8 = new C6972s8(c8);
                    while (c6972s8.hasNext()) {
                        AbstractC7348u6 abstractC7348u6 = (AbstractC7348u6) ((WeakReference) c6972s8.next()).get();
                        if (abstractC7348u6 != null) {
                            ((H6) abstractC7348u6).n(true, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}

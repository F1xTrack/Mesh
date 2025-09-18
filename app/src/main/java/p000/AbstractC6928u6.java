package p000;

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
public abstract class AbstractC6928u6 {

    /* renamed from: a */
    public static final ExecutorC6865t6 f43504a = new ExecutorC6865t6(new ExecutorC1215TJ(6));

    /* renamed from: b */
    public static int f43505b = -100;

    /* renamed from: c */
    public static C7750Ik0 f43506c = null;

    /* renamed from: d */
    public static C7750Ik0 f43507d = null;

    /* renamed from: e */
    public static Boolean f43508e = null;

    /* renamed from: f */
    public static boolean f43509f = false;

    /* renamed from: g */
    public static final C0135C8 f43510g = new C0135C8(0);

    /* renamed from: h */
    public static final Object f43511h = new Object();

    /* renamed from: i */
    public static final Object f43512i = new Object();

    /* renamed from: b */
    public static boolean m25106b(Context context) {
        if (f43508e == null) {
            try {
                int i = AbstractServiceC0575J7.f5349a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0575J7.class), Build.VERSION.SDK_INT >= 24 ? AbstractC0512I7.m3753a() | 128 : 640).metaData;
                if (bundle != null) {
                    f43508e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f43508e = Boolean.FALSE;
            }
        }
        return f43508e.booleanValue();
    }

    /* renamed from: e */
    public static void m25107e(LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6) {
        synchronized (f43511h) {
            try {
                C0135C8 c0135c8 = f43510g;
                c0135c8.getClass();
                C6804s8 c6804s8 = new C6804s8(c0135c8);
                while (c6804s8.hasNext()) {
                    AbstractC6928u6 abstractC6928u6 = (AbstractC6928u6) ((WeakReference) c6804s8.next()).get();
                    if (abstractC6928u6 == layoutInflaterFactory2C0448H6 || abstractC6928u6 == null) {
                        c6804s8.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public static void m25108l(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f43505b != i) {
            f43505b = i;
            synchronized (f43511h) {
                try {
                    C0135C8 c0135c8 = f43510g;
                    c0135c8.getClass();
                    C6804s8 c6804s8 = new C6804s8(c0135c8);
                    while (c6804s8.hasNext()) {
                        AbstractC6928u6 abstractC6928u6 = (AbstractC6928u6) ((WeakReference) c6804s8.next()).get();
                        if (abstractC6928u6 != null) {
                            ((LayoutInflaterFactory2C0448H6) abstractC6928u6).m3287n(true, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3279a();

    /* renamed from: c */
    public abstract void mo3280c();

    /* renamed from: d */
    public abstract void mo3281d();

    /* renamed from: f */
    public abstract boolean mo3282f(int i);

    /* renamed from: h */
    public abstract void mo3283h(int i);

    /* renamed from: i */
    public abstract void mo3284i(View view);

    /* renamed from: j */
    public abstract void mo3285j(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: m */
    public abstract void mo3286m(CharSequence charSequence);
}

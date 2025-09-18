package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import ru.mes.dnevnik.R;

/* renamed from: z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8286z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ RunnableC8286z2(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 2;
        Activity activity = this.b;
        switch (this.a) {
            case 0:
                if (!activity.isFinishing()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 28) {
                        Class cls = G2.a;
                        boolean z = i2 == 26 || i2 == 27;
                        Method method = G2.f;
                        if ((!z || method != null) && (G2.e != null || G2.d != null)) {
                            try {
                                Object obj2 = G2.c.get(activity);
                                if (obj2 != null && (obj = G2.b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    F2 f2 = new F2(activity);
                                    application.registerActivityLifecycleCallbacks(f2);
                                    Handler handler = G2.g;
                                    handler.post(new WZ(f2, i, obj2));
                                    try {
                                        if (i2 == 26 || i2 == 27) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new XZ(application, i, f2));
                                        break;
                                    } catch (Throwable th) {
                                        handler.post(new XZ(application, i, f2));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        activity.recreate();
                        break;
                    } else {
                        Class cls2 = G2.a;
                        activity.recreate();
                        break;
                    }
                }
                break;
            case 1:
                LinkedHashMap linkedHashMap = YM.a;
                Window window = activity.getWindow();
                O90.e(window, "getWindow(...)");
                YM.a(window);
                break;
            case 2:
                LinkedHashMap linkedHashMap2 = YM.a;
                Window window2 = activity.getWindow();
                O90.e(window2, "getWindow(...)");
                YM.a(window2);
                break;
            case 3:
                Window window3 = activity.getWindow();
                LinkedHashMap linkedHashMap3 = YM.a;
                O90.c(window3);
                C2204ao1 c2204ao1A = YM.a(window3);
                AbstractC3502e12.c(window3, false);
                window3.setStatusBarColor(0);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 27 || YM.c(activity, R.attr.enforceNavigationBarContrast)) {
                    boolean zB = YM.b(activity);
                    window3.setNavigationBarColor(i3 >= 29 ? 0 : (i3 < 27 || !zB) ? ZM.b : ZM.a);
                    c2204ao1A.a.f(i3 >= 27 ? zB : false);
                    if (i3 >= 29) {
                        window3.setStatusBarContrastEnforced(false);
                        window3.setNavigationBarContrastEnforced(true);
                    }
                } else {
                    window3.setNavigationBarColor(0);
                    if (i3 >= 29) {
                        window3.setStatusBarContrastEnforced(false);
                        window3.setNavigationBarContrastEnforced(false);
                    }
                }
                if (i3 >= 28) {
                    window3.getAttributes().layoutInDisplayCutoutMode = i3 >= 30 ? 3 : 1;
                    break;
                }
                break;
            case 4:
                O90.f(activity, "$activity");
                activity.getWindow().clearFlags(128);
                break;
            default:
                O90.f(activity, "$activity");
                activity.getWindow().addFlags(128);
                break;
        }
    }
}

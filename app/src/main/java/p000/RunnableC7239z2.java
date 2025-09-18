package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import ru.mes.dnevnik.R;

/* renamed from: z2 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7239z2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46600a;

    /* renamed from: b */
    public final /* synthetic */ Activity f46601b;

    public /* synthetic */ RunnableC7239z2(Activity activity, int i) {
        this.f46600a = i;
        this.f46601b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 2;
        Activity activity = this.f46601b;
        switch (this.f46600a) {
            case 0:
                if (!activity.isFinishing()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 28) {
                        Class cls = AbstractC0381G2.f3535a;
                        boolean z = i2 == 26 || i2 == 27;
                        Method method = AbstractC0381G2.f3540f;
                        if ((!z || method != null) && (AbstractC0381G2.f3539e != null || AbstractC0381G2.f3538d != null)) {
                            try {
                                Object obj2 = AbstractC0381G2.f3537c.get(activity);
                                if (obj2 != null && (obj = AbstractC0381G2.f3536b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    C0318F2 c0318f2 = new C0318F2(activity);
                                    application.registerActivityLifecycleCallbacks(c0318f2);
                                    Handler handler = AbstractC0381G2.f3541g;
                                    handler.post(new RunnableC1420WZ(c0318f2, i, obj2));
                                    try {
                                        if (i2 == 26 || i2 == 27) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new RunnableC1483XZ(application, i, c0318f2));
                                        break;
                                    } catch (Throwable th) {
                                        handler.post(new RunnableC1483XZ(application, i, c0318f2));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        activity.recreate();
                        break;
                    } else {
                        Class cls2 = AbstractC0381G2.f3535a;
                        activity.recreate();
                        break;
                    }
                }
                break;
            case 1:
                LinkedHashMap linkedHashMap = AbstractC1533YM.f14265a;
                Window window = activity.getWindow();
                O90.m5967e(window, "getWindow(...)");
                AbstractC1533YM.m9263a(window);
                break;
            case 2:
                LinkedHashMap linkedHashMap2 = AbstractC1533YM.f14265a;
                Window window2 = activity.getWindow();
                O90.m5967e(window2, "getWindow(...)");
                AbstractC1533YM.m9263a(window2);
                break;
            case 3:
                Window window3 = activity.getWindow();
                LinkedHashMap linkedHashMap3 = AbstractC1533YM.f14265a;
                O90.m5965c(window3);
                C8771ao1 c8771ao1M9263a = AbstractC1533YM.m9263a(window3);
                AbstractC9188e12.m17819c(window3, false);
                window3.setStatusBarColor(0);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 27 || AbstractC1533YM.m9265c(activity, R.attr.enforceNavigationBarContrast)) {
                    boolean zM9264b = AbstractC1533YM.m9264b(activity);
                    window3.setNavigationBarColor(i3 >= 29 ? 0 : (i3 < 27 || !zM9264b) ? AbstractC1596ZM.f14864b : AbstractC1596ZM.f14863a);
                    c8771ao1M9263a.f16606a.mo9116f(i3 >= 27 ? zM9264b : false);
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
                O90.m5968f(activity, "$activity");
                activity.getWindow().clearFlags(128);
                break;
            default:
                O90.m5968f(activity, "$activity");
                activity.getWindow().addFlags(128);
                break;
        }
    }
}

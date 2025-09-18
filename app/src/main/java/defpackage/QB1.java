package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class QB1 {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static Integer d;
    public static final FW0 e = new FW0();

    public static boolean a(View view) {
        O90.f(view, "view");
        return view.isPressed();
    }

    public static boolean b(RV0 rv0, PV0 pv0) {
        switch (pv0.ordinal()) {
            case 0:
                if (rv0.getScreenOrientation() == null) {
                    return false;
                }
                break;
            case 1:
                if (rv0.getStatusBarColor() == null) {
                    return false;
                }
                break;
            case 2:
                if (rv0.getStatusBarStyle() == null) {
                    return false;
                }
                break;
            case 3:
                if (rv0.x == null) {
                    return false;
                }
                break;
            case 4:
                if (rv0.w == null) {
                    return false;
                }
                break;
            case 5:
                if (rv0.k == null) {
                    return false;
                }
                break;
            case 6:
                if (rv0.getNavigationBarColor() == null) {
                    return false;
                }
                break;
            case 7:
                if (rv0.A == null) {
                    return false;
                }
                break;
            case 8:
                if (rv0.B == null) {
                    return false;
                }
                break;
            default:
                throw new C7074sg();
        }
        return true;
    }

    public static RV0 c(RV0 rv0, PV0 pv0) {
        InterfaceC5327jW0 fragmentWrapper;
        if (rv0 == null || (fragmentWrapper = rv0.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getI().iterator();
        while (it.hasNext()) {
            RV0 topScreen = ((SV0) it.next()).getTopScreen();
            RV0 rv0C = c(topScreen, pv0);
            if (rv0C != null) {
                return rv0C;
            }
            if (topScreen != null && b(topScreen, pv0)) {
                return topScreen;
            }
        }
        return null;
    }

    public static RV0 d(RV0 rv0, PV0 pv0) {
        RV0 rv0C = c(rv0, pv0);
        if (rv0C != null) {
            return rv0C;
        }
        if (b(rv0, pv0)) {
            return rv0;
        }
        for (ViewParent container = rv0.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof RV0) {
                RV0 rv02 = (RV0) container;
                if (b(rv02, pv0)) {
                    return rv02;
                }
            }
        }
        return null;
    }

    public static Boolean e(View view, MotionEvent motionEvent) {
        if (view != null) {
            return Boolean.valueOf(view.onTouchEvent(motionEvent));
        }
        return null;
    }

    public static void f(RV0 rv0, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean bool;
        O90.f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (d == null) {
            d = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        RV0 rv0D = d(rv0, PV0.b);
        RV0 rv0D2 = d(rv0, PV0.f);
        if (rv0D == null || (statusBarColor = rv0D.getStatusBarColor()) == null) {
            statusBarColor = d;
        }
        UiThreadUtil.runOnUiThread(new DW0(activity, statusBarColor, (rv0D2 == null || (bool = rv0D2.k) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    public static void g(RV0 rv0, Activity activity) {
        Boolean bool;
        O90.f(rv0, "screen");
        if (activity == null) {
            return;
        }
        RV0 rv0D = d(rv0, PV0.e);
        boolean zBooleanValue = (rv0D == null || (bool = rv0D.w) == null) ? false : bool.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new RunnableC8389za(zBooleanValue, new C2204ao1(window, window.getDecorView()), 7));
    }

    public static void h(RV0 rv0, Activity activity) {
        Integer navigationBarColor;
        O90.f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0D = d(rv0, PV0.g);
        int navigationBarColor2 = (rv0D == null || (navigationBarColor = rv0D.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new RunnableC5338ja(window, navigationBarColor2, 12));
        window.setNavigationBarColor(navigationBarColor2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(RV0 rv0, Activity activity) {
        C1776Wn1 c1854Xn1;
        C1776Wn1 c1854Xn12;
        Boolean bool;
        O90.f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0D = d(rv0, PV0.i);
        if (!((rv0D == null || (bool = rv0D.B) == null) ? false : bool.booleanValue())) {
            C6446pN0 c6446pN0 = new C6446pN0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                C2010Zn1 c2010Zn1 = new C2010Zn1(window.getInsetsController(), c6446pN0);
                c2010Zn1.d = window;
                c1854Xn1 = c2010Zn1;
            } else {
                c1854Xn1 = i >= 26 ? new C1854Xn1(window, c6446pN0) : new C1776Wn1(window, c6446pN0);
            }
            c1854Xn1.i(2);
            return;
        }
        C6446pN0 c6446pN02 = new C6446pN0(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            C2010Zn1 c2010Zn12 = new C2010Zn1(window.getInsetsController(), c6446pN02);
            c2010Zn12.d = window;
            c1854Xn12 = c2010Zn12;
        } else {
            c1854Xn12 = i2 >= 26 ? new C1854Xn1(window, c6446pN02) : new C1776Wn1(window, c6446pN02);
        }
        c1854Xn12.c(2);
        c1854Xn12.h(2);
    }

    public static void j(RV0 rv0, Activity activity) {
        Boolean bool;
        O90.f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0D = d(rv0, PV0.h);
        if (rv0D == null || (bool = rv0D.A) == null) {
            return;
        }
        AbstractC3502e12.c(window, !bool.booleanValue());
    }

    public static void k(RV0 rv0, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        O90.f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        RV0 rv0D = d(rv0, PV0.c);
        if (rv0D == null || (statusBarStyle = rv0D.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new XM(activity, 2, statusBarStyle));
    }

    public static void l(RV0 rv0, Activity activity, ReactContext reactContext) {
        Boolean bool;
        O90.f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        RV0 rv0D = d(rv0, PV0.d);
        UiThreadUtil.runOnUiThread(new EW0(activity, (rv0D == null || (bool = rv0D.x) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    public static void m(RV0 rv0, Activity activity, ReactContext reactContext) {
        Integer screenOrientation;
        if (a && activity != null) {
            RV0 rv0D = d(rv0, PV0.a);
            activity.setRequestedOrientation((rv0D == null || (screenOrientation = rv0D.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
        }
        if (b) {
            f(rv0, activity, reactContext);
            k(rv0, activity, reactContext);
            l(rv0, activity, reactContext);
            g(rv0, activity);
        }
        if (c) {
            h(rv0, activity);
            j(rv0, activity);
            i(rv0, activity);
        }
    }
}

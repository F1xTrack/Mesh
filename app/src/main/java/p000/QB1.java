package p000;

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

    /* renamed from: a */
    public static boolean f9526a;

    /* renamed from: b */
    public static boolean f9527b;

    /* renamed from: c */
    public static boolean f9528c;

    /* renamed from: d */
    public static Integer f9529d;

    /* renamed from: e */
    public static final FW0 f9530e = new FW0();

    /* renamed from: a */
    public static boolean m6598a(View view) {
        O90.m5968f(view, "view");
        return view.isPressed();
    }

    /* renamed from: b */
    public static boolean m6599b(RV0 rv0, PV0 pv0) {
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
                if (rv0.f10242x == null) {
                    return false;
                }
                break;
            case 4:
                if (rv0.f10241w == null) {
                    return false;
                }
                break;
            case 5:
                if (rv0.f10229k == null) {
                    return false;
                }
                break;
            case 6:
                if (rv0.getNavigationBarColor() == null) {
                    return false;
                }
                break;
            case 7:
                if (rv0.f10216A == null) {
                    return false;
                }
                break;
            case 8:
                if (rv0.f10217B == null) {
                    return false;
                }
                break;
            default:
                throw new C6838sg();
        }
        return true;
    }

    /* renamed from: c */
    public static RV0 m6600c(RV0 rv0, PV0 pv0) {
        InterfaceC9891jW0 fragmentWrapper;
        if (rv0 == null || (fragmentWrapper = rv0.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.getF20260i().iterator();
        while (it.hasNext()) {
            RV0 topScreen = ((SV0) it.next()).getTopScreen();
            RV0 rv0M6600c = m6600c(topScreen, pv0);
            if (rv0M6600c != null) {
                return rv0M6600c;
            }
            if (topScreen != null && m6599b(topScreen, pv0)) {
                return topScreen;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static RV0 m6601d(RV0 rv0, PV0 pv0) {
        RV0 rv0M6600c = m6600c(rv0, pv0);
        if (rv0M6600c != null) {
            return rv0M6600c;
        }
        if (m6599b(rv0, pv0)) {
            return rv0;
        }
        for (ViewParent container = rv0.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof RV0) {
                RV0 rv02 = (RV0) container;
                if (m6599b(rv02, pv0)) {
                    return rv02;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Boolean m6602e(View view, MotionEvent motionEvent) {
        if (view != null) {
            return Boolean.valueOf(view.onTouchEvent(motionEvent));
        }
        return null;
    }

    /* renamed from: f */
    public static void m6603f(RV0 rv0, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean bool;
        O90.m5968f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (f9529d == null) {
            f9529d = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        RV0 rv0M6601d = m6601d(rv0, PV0.f9087b);
        RV0 rv0M6601d2 = m6601d(rv0, PV0.f9091f);
        if (rv0M6601d == null || (statusBarColor = rv0M6601d.getStatusBarColor()) == null) {
            statusBarColor = f9529d;
        }
        UiThreadUtil.runOnUiThread(new DW0(activity, statusBarColor, (rv0M6601d2 == null || (bool = rv0M6601d2.f10229k) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    /* renamed from: g */
    public static void m6604g(RV0 rv0, Activity activity) {
        Boolean bool;
        O90.m5968f(rv0, "screen");
        if (activity == null) {
            return;
        }
        RV0 rv0M6601d = m6601d(rv0, PV0.f9090e);
        boolean zBooleanValue = (rv0M6601d == null || (bool = rv0M6601d.f10241w) == null) ? false : bool.booleanValue();
        Window window = activity.getWindow();
        UiThreadUtil.runOnUiThread(new RunnableC7273za(zBooleanValue, new C8771ao1(window, window.getDecorView()), 7));
    }

    /* renamed from: h */
    public static void m6605h(RV0 rv0, Activity activity) {
        Integer navigationBarColor;
        O90.m5968f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0M6601d = m6601d(rv0, PV0.f9092g);
        int navigationBarColor2 = (rv0M6601d == null || (navigationBarColor = rv0M6601d.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new RunnableC6246ja(window, navigationBarColor2, 12));
        window.setNavigationBarColor(navigationBarColor2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m6606i(RV0 rv0, Activity activity) {
        C8485Wn1 c8537Xn1;
        C8485Wn1 c8537Xn12;
        Boolean bool;
        O90.m5968f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0M6601d = m6601d(rv0, PV0.f9094i);
        if (!((rv0M6601d == null || (bool = rv0M6601d.f10217B) == null) ? false : bool.booleanValue())) {
            C10641pN0 c10641pN0 = new C10641pN0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                C8641Zn1 c8641Zn1 = new C8641Zn1(window.getInsetsController(), c10641pN0);
                c8641Zn1.f15132d = window;
                c8537Xn1 = c8641Zn1;
            } else {
                c8537Xn1 = i >= 26 ? new C8537Xn1(window, c10641pN0) : new C8485Wn1(window, c10641pN0);
            }
            c8537Xn1.mo8865i(2);
            return;
        }
        C10641pN0 c10641pN02 = new C10641pN0(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            C8641Zn1 c8641Zn12 = new C8641Zn1(window.getInsetsController(), c10641pN02);
            c8641Zn12.f15132d = window;
            c8537Xn12 = c8641Zn12;
        } else {
            c8537Xn12 = i2 >= 26 ? new C8537Xn1(window, c10641pN02) : new C8485Wn1(window, c10641pN02);
        }
        c8537Xn12.mo8862c(2);
        c8537Xn12.mo8864h(2);
    }

    /* renamed from: j */
    public static void m6607j(RV0 rv0, Activity activity) {
        Boolean bool;
        O90.m5968f(rv0, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        RV0 rv0M6601d = m6601d(rv0, PV0.f9093h);
        if (rv0M6601d == null || (bool = rv0M6601d.f10216A) == null) {
            return;
        }
        AbstractC9188e12.m17819c(window, !bool.booleanValue());
    }

    /* renamed from: k */
    public static void m6608k(RV0 rv0, Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        O90.m5968f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        RV0 rv0M6601d = m6601d(rv0, PV0.f9088c);
        if (rv0M6601d == null || (statusBarStyle = rv0M6601d.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new RunnableC1470XM(activity, 2, statusBarStyle));
    }

    /* renamed from: l */
    public static void m6609l(RV0 rv0, Activity activity, ReactContext reactContext) {
        Boolean bool;
        O90.m5968f(rv0, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        RV0 rv0M6601d = m6601d(rv0, PV0.f9089d);
        UiThreadUtil.runOnUiThread(new EW0(activity, (rv0M6601d == null || (bool = rv0M6601d.f10242x) == null) ? false : bool.booleanValue(), reactContext.getExceptionHandler()));
    }

    /* renamed from: m */
    public static void m6610m(RV0 rv0, Activity activity, ReactContext reactContext) {
        Integer screenOrientation;
        if (f9526a && activity != null) {
            RV0 rv0M6601d = m6601d(rv0, PV0.f9086a);
            activity.setRequestedOrientation((rv0M6601d == null || (screenOrientation = rv0M6601d.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
        }
        if (f9527b) {
            m6603f(rv0, activity, reactContext);
            m6608k(rv0, activity, reactContext);
            m6609l(rv0, activity, reactContext);
            m6604g(rv0, activity);
        }
        if (f9528c) {
            m6605h(rv0, activity);
            m6607j(rv0, activity);
            m6606i(rv0, activity);
        }
    }
}

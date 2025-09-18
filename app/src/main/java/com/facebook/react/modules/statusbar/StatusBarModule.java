package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC10944rk1;
import p000.AbstractC11077sn0;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC9664hk1;
import p000.EW0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.R41;
import p000.RunnableC1470XM;
import p000.RunnableC7273za;
import p000.S41;

@InterfaceC9101dL0(name = "StatusBarManager")
@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m22267d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getStatusBarHeightPx", "()F", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "colorDouble", "", "animated", "LTf1;", "setColor", "(DZ)V", "translucent", "setTranslucent", "(Z)V", "hidden", "setHidden", "style", "setStyle", "(Ljava/lang/String;)V", "Companion", "R41", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final R41 Companion = new R41();
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return 0.0f;
        }
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (AbstractC9664hk1.m18871a(decorView) == null) {
            return 0.0f;
        }
        return r0.f12756a.mo5837f(131).f5353b;
    }

    public static final void setHidden$lambda$1(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            O90.m5967e(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if ("dark-content".equals(str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        Window window;
        Activity currentActivity = getCurrentActivity();
        return AbstractC11077sn0.m24780h(new Pair(HEIGHT_KEY, Float.valueOf(AbstractC11406vL1.m25402a(getStatusBarHeightPx()))), new Pair(DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || (window = currentActivity.getWindow()) == null) ? "black" : String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(window.getStatusBarColor() & 16777215)}, 1))));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i = (int) colorDouble;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            UiThreadUtil.runOnUiThread(new S41(currentActivity, animated, i, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean hidden) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC7273za(currentActivity, hidden, 8));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String style) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC1470XM(currentActivity, 3, style));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean translucent) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            UiThreadUtil.runOnUiThread(new EW0(currentActivity, translucent, getReactApplicationContext()));
        }
    }
}

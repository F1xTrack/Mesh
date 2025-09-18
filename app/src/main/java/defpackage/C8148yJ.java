package defpackage;

import android.app.UiModeManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: yJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8148yJ {
    public final ReactApplicationContext a;

    public C8148yJ(ReactApplicationContext reactApplicationContext) {
        this.a = reactApplicationContext;
    }

    public final int a() {
        ReactApplicationContext reactApplicationContext = this.a;
        if (reactApplicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return 3;
        }
        UiModeManager uiModeManager = (UiModeManager) reactApplicationContext.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return 3;
        }
        int i = reactApplicationContext.getResources().getConfiguration().smallestScreenWidthDp;
        int i2 = i == 0 ? 4 : i >= 600 ? 2 : 1;
        if (i2 != 4) {
            return i2;
        }
        WindowManager windowManager = (WindowManager) reactApplicationContext.getSystemService("window");
        if (windowManager == null) {
            return 4;
        }
        windowManager.getDefaultDisplay().getRealMetrics(new DisplayMetrics());
        double dSqrt = Math.sqrt(Math.pow(r1.heightPixels / r1.ydpi, 2.0d) + Math.pow(r1.widthPixels / r1.xdpi, 2.0d));
        if (dSqrt < 3.0d || dSqrt > 6.9d) {
            return (dSqrt <= 6.9d || dSqrt > 18.0d) ? 4 : 2;
        }
        return 1;
    }
}

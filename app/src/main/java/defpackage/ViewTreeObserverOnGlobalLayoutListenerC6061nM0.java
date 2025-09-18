package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: nM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC6061nM0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Rect a;
    public final int b;
    public boolean c = false;
    public int d = 0;
    public int e = 0;
    public final /* synthetic */ ReactRootView f;

    public ViewTreeObserverOnGlobalLayoutListenerC6061nM0(ReactRootView reactRootView) {
        this.f = reactRootView;
        XZ1.f(reactRootView.getContext().getApplicationContext());
        this.a = new Rect();
        this.b = (int) AbstractC7586vL1.b(60.0f);
    }

    public static WritableMap a(double d, double d2, double d3, double d4) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, d4);
        writableMapCreateMap2.putDouble("screenX", d2);
        writableMapCreateMap2.putDouble(Snapshot.WIDTH, d3);
        writableMapCreateMap2.putDouble("screenY", d);
        writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
        writableMapCreateMap.putString("easing", "keyboard");
        writableMapCreateMap.putDouble("duration", ConfigValue.DOUBLE_DEFAULT_VALUE);
        return writableMapCreateMap;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        DeviceInfoModule deviceInfoModule;
        String str;
        double d;
        double d2;
        boolean zIsVisible;
        ReactRootView reactRootView = this.f;
        if (reactRootView.g() && reactRootView.j()) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            Rect rect = this.a;
            if (i >= 30) {
                reactRootView.getRootView().getWindowVisibleDisplayFrame(rect);
                WindowInsets rootWindowInsets2 = reactRootView.getRootView().getRootWindowInsets();
                if (rootWindowInsets2 != null && (zIsVisible = rootWindowInsets2.isVisible(WindowInsets.Type.ime())) != this.c) {
                    this.c = zIsVisible;
                    if (zIsVisible) {
                        int i2 = rootWindowInsets2.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets2.getInsets(WindowInsets.Type.systemBars()).bottom;
                        ViewGroup.LayoutParams layoutParams = reactRootView.getRootView().getLayoutParams();
                        UN1.a(layoutParams instanceof WindowManager.LayoutParams);
                        reactRootView.l("keyboardDidShow", a(AbstractC7586vL1.a(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? rect.bottom - i2 : rect.bottom), AbstractC7586vL1.a(rect.left), AbstractC7586vL1.a(rect.width()), AbstractC7586vL1.a(i2)));
                    } else {
                        reactRootView.l("keyboardDidHide", a(AbstractC7586vL1.a(rect.height()), ConfigValue.DOUBLE_DEFAULT_VALUE, AbstractC7586vL1.a(rect.width()), ConfigValue.DOUBLE_DEFAULT_VALUE));
                    }
                }
            } else {
                reactRootView.getRootView().getWindowVisibleDisplayFrame(rect);
                int safeInsetTop = (i < 28 || (rootWindowInsets = reactRootView.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
                int i3 = (XZ1.d().heightPixels - rect.bottom) + safeInsetTop;
                int i4 = this.d;
                int i5 = this.b;
                if (i4 != i3 && i3 > i5) {
                    this.d = i3;
                    this.c = true;
                    reactRootView.l("keyboardDidShow", a(AbstractC7586vL1.a(r9), AbstractC7586vL1.a(rect.left), AbstractC7586vL1.a(rect.width()), AbstractC7586vL1.a(this.d)));
                } else if (i4 != 0 && i3 <= i5) {
                    this.d = 0;
                    this.c = false;
                    reactRootView.l("keyboardDidHide", a(AbstractC7586vL1.a(rect.height()), ConfigValue.DOUBLE_DEFAULT_VALUE, AbstractC7586vL1.a(rect.width()), ConfigValue.DOUBLE_DEFAULT_VALUE));
                }
            }
            int rotation = ((WindowManager) reactRootView.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.e != rotation) {
                this.e = rotation;
                XZ1.e(reactRootView.getContext().getApplicationContext());
                if (rotation != 0) {
                    if (rotation == 1) {
                        str = "landscape-primary";
                        d2 = -90.0d;
                    } else if (rotation == 2) {
                        str = "portrait-secondary";
                        d = 180.0d;
                    } else if (rotation == 3) {
                        str = "landscape-secondary";
                        d2 = 90.0d;
                    }
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("name", str);
                    writableMapCreateMap.putDouble("rotationDegrees", d2);
                    writableMapCreateMap.putBoolean("isLandscape", z);
                    reactRootView.l("namedOrientationDidChange", writableMapCreateMap);
                } else {
                    str = "portrait-primary";
                    d = ConfigValue.DOUBLE_DEFAULT_VALUE;
                }
                z = false;
                d2 = d;
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("name", str);
                writableMapCreateMap2.putDouble("rotationDegrees", d2);
                writableMapCreateMap2.putBoolean("isLandscape", z);
                reactRootView.l("namedOrientationDidChange", writableMapCreateMap2);
            }
            ReactContext currentReactContext = reactRootView.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }
    }
}

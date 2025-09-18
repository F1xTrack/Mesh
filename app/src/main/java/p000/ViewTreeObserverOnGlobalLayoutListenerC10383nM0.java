package p000;

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
public final class ViewTreeObserverOnGlobalLayoutListenerC10383nM0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final Rect f38286a;

    /* renamed from: b */
    public final int f38287b;

    /* renamed from: c */
    public boolean f38288c = false;

    /* renamed from: d */
    public int f38289d = 0;

    /* renamed from: e */
    public int f38290e = 0;

    /* renamed from: f */
    public final /* synthetic */ ReactRootView f38291f;

    public ViewTreeObserverOnGlobalLayoutListenerC10383nM0(ReactRootView reactRootView) {
        this.f38291f = reactRootView;
        XZ1.m9090f(reactRootView.getContext().getApplicationContext());
        this.f38286a = new Rect();
        this.f38287b = (int) AbstractC11406vL1.m25403b(60.0f);
    }

    /* renamed from: a */
    public static WritableMap m23131a(double d, double d2, double d3, double d4) {
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
        ReactRootView reactRootView = this.f38291f;
        if (reactRootView.mo6041g() && reactRootView.mo6043j()) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            Rect rect = this.f38286a;
            if (i >= 30) {
                reactRootView.getRootView().getWindowVisibleDisplayFrame(rect);
                WindowInsets rootWindowInsets2 = reactRootView.getRootView().getRootWindowInsets();
                if (rootWindowInsets2 != null && (zIsVisible = rootWindowInsets2.isVisible(WindowInsets.Type.ime())) != this.f38288c) {
                    this.f38288c = zIsVisible;
                    if (zIsVisible) {
                        int i2 = rootWindowInsets2.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets2.getInsets(WindowInsets.Type.systemBars()).bottom;
                        ViewGroup.LayoutParams layoutParams = reactRootView.getRootView().getLayoutParams();
                        UN1.m7997a(layoutParams instanceof WindowManager.LayoutParams);
                        reactRootView.m10916l("keyboardDidShow", m23131a(AbstractC11406vL1.m25402a(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? rect.bottom - i2 : rect.bottom), AbstractC11406vL1.m25402a(rect.left), AbstractC11406vL1.m25402a(rect.width()), AbstractC11406vL1.m25402a(i2)));
                    } else {
                        reactRootView.m10916l("keyboardDidHide", m23131a(AbstractC11406vL1.m25402a(rect.height()), ConfigValue.DOUBLE_DEFAULT_VALUE, AbstractC11406vL1.m25402a(rect.width()), ConfigValue.DOUBLE_DEFAULT_VALUE));
                    }
                }
            } else {
                reactRootView.getRootView().getWindowVisibleDisplayFrame(rect);
                int safeInsetTop = (i < 28 || (rootWindowInsets = reactRootView.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
                int i3 = (XZ1.m9088d().heightPixels - rect.bottom) + safeInsetTop;
                int i4 = this.f38289d;
                int i5 = this.f38287b;
                if (i4 != i3 && i3 > i5) {
                    this.f38289d = i3;
                    this.f38288c = true;
                    reactRootView.m10916l("keyboardDidShow", m23131a(AbstractC11406vL1.m25402a(r9), AbstractC11406vL1.m25402a(rect.left), AbstractC11406vL1.m25402a(rect.width()), AbstractC11406vL1.m25402a(this.f38289d)));
                } else if (i4 != 0 && i3 <= i5) {
                    this.f38289d = 0;
                    this.f38288c = false;
                    reactRootView.m10916l("keyboardDidHide", m23131a(AbstractC11406vL1.m25402a(rect.height()), ConfigValue.DOUBLE_DEFAULT_VALUE, AbstractC11406vL1.m25402a(rect.width()), ConfigValue.DOUBLE_DEFAULT_VALUE));
                }
            }
            int rotation = ((WindowManager) reactRootView.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f38290e != rotation) {
                this.f38290e = rotation;
                XZ1.m9089e(reactRootView.getContext().getApplicationContext());
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
                    reactRootView.m10916l("namedOrientationDidChange", writableMapCreateMap);
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
                reactRootView.m10916l("namedOrientationDidChange", writableMapCreateMap2);
            }
            ReactContext currentReactContext = reactRootView.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }
    }
}

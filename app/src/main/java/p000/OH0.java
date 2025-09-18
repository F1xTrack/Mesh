package p000;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OH0 {

    /* renamed from: a */
    public final ReactContext f8337a;

    /* renamed from: b */
    public final T00 f8338b;

    /* renamed from: c */
    public final NH0 f8339c;

    /* renamed from: d */
    public final ViewGroup f8340d;

    /* renamed from: e */
    public boolean f8341e;

    /* renamed from: f */
    public boolean f8342f;

    public OH0(ReactContext reactContext, PH0 ph0) {
        this.f8337a = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = ph0.getId();
        if (id < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + ph0).toString());
        }
        NativeModule nativeModule = ((S91) reactContext).f10602a.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        O90.m5965c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        MH0 registry = rNGestureHandlerModule.getRegistry();
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = ph0;
        while (parent != null && !(parent instanceof InterfaceC11293uT0)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            throw new IllegalStateException(("View " + ph0 + " has not been mounted under ReactRootView").toString());
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f8340d = viewGroup;
        Objects.toString(viewGroup);
        T00 t00 = new T00(ph0, registry, new OJ1(19));
        t00.f11094c = 0.1f;
        this.f8338b = t00;
        NH0 nh0 = new NH0(this);
        nh0.f9903d = -id;
        this.f8339c = nh0;
        registry.m5295h(nh0);
        registry.m5288a(nh0.f9903d, id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6005a(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.OH0.m6005a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void m6006b() {
        Objects.toString(this.f8340d);
        NativeModule nativeModule = ((S91) this.f8337a).f10602a.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        O90.m5965c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        MH0 registry = rNGestureHandlerModule.getRegistry();
        NH0 nh0 = this.f8339c;
        O90.m5965c(nh0);
        registry.m5291d(nh0.f9903d);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}

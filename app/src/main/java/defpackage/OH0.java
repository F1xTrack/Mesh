package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class OH0 {
    public final ReactContext a;
    public final T00 b;
    public final NH0 c;
    public final ViewGroup d;
    public boolean e;
    public boolean f;

    public OH0(ReactContext reactContext, PH0 ph0) {
        this.a = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id = ph0.getId();
        if (id < 1) {
            throw new IllegalStateException(("Expect view tag to be set for " + ph0).toString());
        }
        NativeModule nativeModule = ((S91) reactContext).a.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        O90.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        MH0 registry = rNGestureHandlerModule.getRegistry();
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = ph0;
        while (parent != null && !(parent instanceof InterfaceC7418uT0)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            throw new IllegalStateException(("View " + ph0 + " has not been mounted under ReactRootView").toString());
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.d = viewGroup;
        Objects.toString(viewGroup);
        T00 t00 = new T00(ph0, registry, new OJ1(19));
        t00.c = 0.1f;
        this.b = t00;
        NH0 nh0 = new NH0(this);
        nh0.d = -id;
        this.c = nh0;
        registry.h(nh0);
        registry.a(nh0.d, id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OH0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        Objects.toString(this.d);
        NativeModule nativeModule = ((S91) this.a).a.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        O90.c(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        MH0 registry = rNGestureHandlerModule.getRegistry();
        NH0 nh0 = this.c;
        O90.c(nh0);
        registry.d(nh0.d);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}

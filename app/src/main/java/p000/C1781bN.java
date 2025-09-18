package p000;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.reactnativekeyboardcontroller.KeyboardBackgroundViewManager;
import com.reactnativekeyboardcontroller.KeyboardControllerModule;
import com.reactnativekeyboardcontroller.KeyboardControllerViewManager;
import com.reactnativekeyboardcontroller.KeyboardGestureAreaViewManager;
import com.reactnativekeyboardcontroller.OverKeyboardViewManager;
import com.reactnativekeyboardcontroller.StatusBarManagerCompatModule;
import com.swmansion.rnscreens.ModalScreenViewManager;
import com.swmansion.rnscreens.ScreenContainerViewManager;
import com.swmansion.rnscreens.ScreenContentWrapperManager;
import com.swmansion.rnscreens.ScreenFooterManager;
import com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import com.swmansion.rnscreens.ScreensModule;
import com.swmansion.rnscreens.SearchBarManager;
import com.th3rdwave.safeareacontext.SafeAreaContextModule;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import com.zoontek.rnedgetoedge.EdgeToEdgeModule;
import java.util.HashMap;
import java.util.List;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: bN */
/* loaded from: classes2.dex */
public final class C1781bN extends AbstractC7279zg {

    /* renamed from: a */
    public final /* synthetic */ int f16997a;

    @Override // p000.AbstractC7279zg, p000.ZL0
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.f16997a) {
            case 1:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26275f(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager(), new KeyboardBackgroundViewManager());
            case 2:
                O90.m5968f(reactApplicationContext, "reactContext");
                reactApplicationContext.addLifecycleEventListener(M80.f7000a);
                return AbstractC7230yu.m26275f(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager());
            case 3:
                O90.m5968f(reactApplicationContext, "reactContext");
                return AbstractC7230yu.m26275f(new SafeAreaProviderManager(), new SafeAreaViewManager());
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // p000.AbstractC7279zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.f16997a) {
            case 0:
                O90.m5968f(str, "name");
                O90.m5968f(reactApplicationContext, "reactContext");
                if (str.equals("RNEdgeToEdge")) {
                    return new EdgeToEdgeModule(reactApplicationContext);
                }
                return null;
            case 1:
                O90.m5968f(str, "name");
                O90.m5968f(reactApplicationContext, "reactContext");
                if (str.equals("KeyboardController")) {
                    return new KeyboardControllerModule(reactApplicationContext);
                }
                if (str.equals("StatusBarManager")) {
                    return new StatusBarManagerCompatModule(reactApplicationContext);
                }
                return null;
            case 2:
                O90.m5968f(str, UcumUtils.UCUM_SECONDS);
                O90.m5968f(reactApplicationContext, "reactApplicationContext");
                if (str.equals("RNSModule")) {
                    return new ScreensModule(reactApplicationContext);
                }
                return null;
            default:
                O90.m5968f(str, "name");
                O90.m5968f(reactApplicationContext, "reactContext");
                if (str.equals(SafeAreaContextModule.NAME)) {
                    return new SafeAreaContextModule(reactApplicationContext);
                }
                return null;
        }
    }

    @Override // p000.AbstractC7279zg
    public final InterfaceC9229eL0 getReactModuleInfoProvider() {
        switch (this.f16997a) {
            case 0:
                return new C1660aN(0);
            case 1:
                return new C1660aN(2);
            case 2:
                return new C1660aN(9);
            default:
                HashMap map = new HashMap();
                Class cls = new Class[]{SafeAreaContextModule.class}[0];
                InterfaceC9101dL0 interfaceC9101dL0 = (InterfaceC9101dL0) cls.getAnnotation(InterfaceC9101dL0.class);
                if (interfaceC9101dL0 != null) {
                    map.put(interfaceC9101dL0.name(), new ReactModuleInfo(interfaceC9101dL0.name(), cls.getName(), true, interfaceC9101dL0.needsEagerInit(), interfaceC9101dL0.isCxxModule(), false));
                }
                return new C7109wz(map, 2);
        }
    }
}

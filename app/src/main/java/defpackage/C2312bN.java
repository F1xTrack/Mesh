package defpackage;

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
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: bN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2312bN extends AbstractC8407zg {
    public final /* synthetic */ int a;

    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 1:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.f(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager(), new KeyboardBackgroundViewManager());
            case 2:
                O90.f(reactApplicationContext, "reactContext");
                reactApplicationContext.addLifecycleEventListener(M80.a);
                return AbstractC8259yu.f(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager());
            case 3:
                O90.f(reactApplicationContext, "reactContext");
                return AbstractC8259yu.f(new SafeAreaProviderManager(), new SafeAreaViewManager());
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                O90.f(str, "name");
                O90.f(reactApplicationContext, "reactContext");
                if (str.equals("RNEdgeToEdge")) {
                    return new EdgeToEdgeModule(reactApplicationContext);
                }
                return null;
            case 1:
                O90.f(str, "name");
                O90.f(reactApplicationContext, "reactContext");
                if (str.equals("KeyboardController")) {
                    return new KeyboardControllerModule(reactApplicationContext);
                }
                if (str.equals("StatusBarManager")) {
                    return new StatusBarManagerCompatModule(reactApplicationContext);
                }
                return null;
            case 2:
                O90.f(str, UcumUtils.UCUM_SECONDS);
                O90.f(reactApplicationContext, "reactApplicationContext");
                if (str.equals("RNSModule")) {
                    return new ScreensModule(reactApplicationContext);
                }
                return null;
            default:
                O90.f(str, "name");
                O90.f(reactApplicationContext, "reactContext");
                if (str.equals(SafeAreaContextModule.NAME)) {
                    return new SafeAreaContextModule(reactApplicationContext);
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() {
        switch (this.a) {
            case 0:
                return new C2121aN(0);
            case 1:
                return new C2121aN(2);
            case 2:
                return new C2121aN(9);
            default:
                HashMap map = new HashMap();
                Class cls = new Class[]{SafeAreaContextModule.class}[0];
                InterfaceC3373dL0 interfaceC3373dL0 = (InterfaceC3373dL0) cls.getAnnotation(InterfaceC3373dL0.class);
                if (interfaceC3373dL0 != null) {
                    map.put(interfaceC3373dL0.name(), new ReactModuleInfo(interfaceC3373dL0.name(), cls.getName(), true, interfaceC3373dL0.needsEagerInit(), interfaceC3373dL0.isCxxModule(), false));
                }
                return new C7894wz(map, 2);
        }
    }
}

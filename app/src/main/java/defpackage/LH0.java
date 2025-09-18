package defpackage;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class LH0 extends AbstractC8407zg implements InterfaceC0442Fk1 {
    public final F71 a = LB.b(TT.C);

    @Override // defpackage.InterfaceC0442Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider provider;
        ModuleSpec moduleSpec = (ModuleSpec) ((Map) this.a.getValue()).get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "reactContext");
        return AbstractC8259yu.f(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        O90.f(str, "name");
        O90.f(reactApplicationContext, "reactContext");
        if (str.equals("RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            O90.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (InterfaceC3563eL0) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new C2121aN(6);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e2);
        }
    }

    @Override // defpackage.InterfaceC0442Fk1
    public final Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return AbstractC8069xu.b0(((Map) this.a.getValue()).keySet());
    }

    @Override // defpackage.AbstractC8407zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return AbstractC8069xu.d0(((Map) this.a.getValue()).values());
    }
}

package p000;

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
public final class LH0 extends AbstractC7279zg implements InterfaceC7595Fk1 {

    /* renamed from: a */
    public final F71 f6594a = AbstractC0705LB.m4915b(C1225TT.f11363C);

    @Override // p000.InterfaceC7595Fk1
    public final ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        Provider provider;
        ModuleSpec moduleSpec = (ModuleSpec) ((Map) this.f6594a.getValue()).get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.getProvider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // p000.AbstractC7279zg, p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "reactContext");
        return AbstractC7230yu.m26275f(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // p000.AbstractC7279zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        O90.m5968f(str, "name");
        O90.m5968f(reactApplicationContext, "reactContext");
        if (str.equals("RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // p000.AbstractC7279zg
    public final InterfaceC9229eL0 getReactModuleInfoProvider() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            O90.m5966d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (InterfaceC9229eL0) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new C1660aN(6);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e2);
        }
    }

    @Override // p000.InterfaceC7595Fk1
    public final Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return AbstractC7167xu.m25982b0(((Map) this.f6594a.getValue()).keySet());
    }

    @Override // p000.AbstractC7279zg
    public final List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return AbstractC7167xu.m25984d0(((Map) this.f6594a.getValue()).values());
    }
}

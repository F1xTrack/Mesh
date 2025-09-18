package p000;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;

/* loaded from: classes.dex */
public final class S91 extends ReactContext {

    /* renamed from: a */
    public final ReactApplicationContext f10602a;

    /* renamed from: b */
    public final int f10603b;

    public S91(ReactApplicationContext reactApplicationContext, Context context, String str, int i) {
        super(context);
        initializeFromOther(reactApplicationContext);
        this.f10602a = reactApplicationContext;
        this.f10603b = i;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f10602a.addLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void destroy() {
        this.f10602a.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CatalystInstance getCatalystInstance() {
        return this.f10602a.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final Activity getCurrentActivity() {
        return this.f10602a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final UIManager getFabricUIManager() {
        return this.f10602a.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CallInvokerHolder getJSCallInvokerHolder() {
        return this.f10602a.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JavaScriptModule getJSModule(Class cls) {
        return this.f10602a.getJSModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f10602a.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final NativeModule getNativeModule(Class cls) {
        return this.f10602a.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final Collection getNativeModules() {
        return this.f10602a.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final String getSourceURL() {
        return this.f10602a.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void handleException(Exception exc) {
        this.f10602a.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasActiveCatalystInstance() {
        return this.f10602a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasActiveReactInstance() {
        return this.f10602a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCatalystInstance() {
        return this.f10602a.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCurrentActivity() {
        return this.f10602a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasNativeModule(Class cls) {
        return this.f10602a.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasReactInstance() {
        return this.f10602a.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean isBridgeless() {
        return this.f10602a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void registerSegment(int i, String str, Callback callback) {
        this.f10602a.registerSegment(i, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f10602a.removeLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final NativeModule getNativeModule(String str) {
        return this.f10602a.getNativeModule(str);
    }
}

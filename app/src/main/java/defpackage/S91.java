package defpackage;

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
    public final ReactApplicationContext a;
    public final int b;

    public S91(ReactApplicationContext reactApplicationContext, Context context, String str, int i) {
        super(context);
        initializeFromOther(reactApplicationContext);
        this.a = reactApplicationContext;
        this.b = i;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.a.addLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void destroy() {
        this.a.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CatalystInstance getCatalystInstance() {
        return this.a.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final Activity getCurrentActivity() {
        return this.a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final UIManager getFabricUIManager() {
        return this.a.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CallInvokerHolder getJSCallInvokerHolder() {
        return this.a.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JavaScriptModule getJSModule(Class cls) {
        return this.a.getJSModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.a.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final NativeModule getNativeModule(Class cls) {
        return this.a.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final Collection getNativeModules() {
        return this.a.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final String getSourceURL() {
        return this.a.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void handleException(Exception exc) {
        this.a.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasActiveCatalystInstance() {
        return this.a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasActiveReactInstance() {
        return this.a.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCatalystInstance() {
        return this.a.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCurrentActivity() {
        return this.a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasNativeModule(Class cls) {
        return this.a.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasReactInstance() {
        return this.a.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean isBridgeless() {
        return this.a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void registerSegment(int i, String str, Callback callback) {
        this.a.registerSegment(i, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.a.removeLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final NativeModule getNativeModule(String str) {
        return this.a.getNativeModule(str);
    }
}

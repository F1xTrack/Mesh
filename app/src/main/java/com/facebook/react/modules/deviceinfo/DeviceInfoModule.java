package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11205tn0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.XZ1;

@InterfaceC9101dL0(name = NativeDeviceInfoSpec.NAME)
@Metadata(m22266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m22267d2 = {"Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;", "Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "LTf1;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "emitUpdateDimensionsEvent", "invalidate", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "fontScale", "F", "Lcom/facebook/react/bridge/ReadableMap;", "previousDisplayMetrics", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    private float fontScale;
    private ReadableMap previousDisplayMetrics;
    private ReactApplicationContext reactApplicationContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        XZ1.m9090f(reactApplicationContext);
        this.fontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        reactApplicationContext.addLifecycleEventListener(this);
        this.reactApplicationContext = reactApplicationContext;
    }

    public final void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext != null) {
            if (!reactApplicationContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
                return;
            }
            WritableNativeMap writableNativeMapM9085a = XZ1.m9085a(this.fontScale);
            ReadableMap readableMap = this.previousDisplayMetrics;
            if (readableMap == null) {
                this.previousDisplayMetrics = writableNativeMapM9085a.copy();
            } else {
                if (writableNativeMapM9085a.equals(readableMap)) {
                    return;
                }
                this.previousDisplayMetrics = writableNativeMapM9085a.copy();
                reactApplicationContext.emitDeviceEvent("didUpdateDimensions", writableNativeMapM9085a);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        WritableNativeMap writableNativeMapM9085a = XZ1.m9085a(this.fontScale);
        this.previousDisplayMetrics = writableNativeMapM9085a.copy();
        return AbstractC11205tn0.m24984c(new Pair("Dimensions", writableNativeMapM9085a.toHashMap()));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Resources resources;
        Configuration configuration;
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        Float fValueOf = (reactApplicationContext == null || (resources = reactApplicationContext.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Float.valueOf(configuration.fontScale);
        if (fValueOf != null) {
            if (fValueOf.floatValue() == this.fontScale) {
                return;
            }
            this.fontScale = fValueOf.floatValue();
            emitUpdateDimensionsEvent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(Context context) {
        super(null);
        O90.m5968f(context, "context");
        this.reactApplicationContext = null;
        XZ1.m9090f(context);
        this.fontScale = context.getResources().getConfiguration().fontScale;
    }
}

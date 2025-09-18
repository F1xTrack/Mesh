package com.horcrux.svg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract WritableMap getBBox(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract WritableMap getCTM(Double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract WritableMap getPointAtLength(Double d, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getRawResource(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract WritableMap getScreenCTM(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract double getTotalLength(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract boolean isPointInFill(Double d, ReadableMap readableMap);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract boolean isPointInStroke(Double d, ReadableMap readableMap);
}

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addNetworkingHandler();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addWebSocketHandler(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC0965PK
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void release(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeWebSocketHandler(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void sendOverSocket(ReadableMap readableMap, double d);
}

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeAnimatedTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedTurboModule";

    public NativeAnimatedTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addAnimatedEventToView(double d, String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void connectAnimatedNodeToView(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void connectAnimatedNodes(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void createAnimatedNode(double d, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void disconnectAnimatedNodeFromView(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void disconnectAnimatedNodes(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void dropAnimatedNode(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void extractAnimatedNodeOffset(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void finishOperationBatch();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void flattenAnimatedNodeOffset(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getValue(double d, Callback callback);

    @ReactMethod
    @InterfaceC0965PK
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeAnimatedEventFromView(double d, String str, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void restoreDefaultValues(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setAnimatedNodeOffset(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setAnimatedNodeValue(double d, double d2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void startListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void startOperationBatch();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void stopAnimation(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void stopListeningToAnimatedNodeValue(double d);

    @ReactMethod
    @InterfaceC0965PK
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
    }
}

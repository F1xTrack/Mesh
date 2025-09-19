package com.reactnativecommunity.clipboard;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public abstract class NativeClipboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public NativeClipboardModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getImage(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getImageJPG(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getImagePNG(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getString(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getStrings(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void hasImage(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void hasNumber(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void hasString(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void hasURL(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void hasWebURL(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListener();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setImage(String str, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setListener();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setString(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setStrings(ReadableArray readableArray);
}

package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.OutputStream;
import java.util.HashMap;

/* renamed from: zL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11913zL0 {

    /* renamed from: d */
    public static final HashMap f46794d = new HashMap();

    /* renamed from: a */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter f46795a;

    /* renamed from: b */
    public String f46796b = "base64";

    /* renamed from: c */
    public OutputStream f46797c = null;

    public C11913zL0(ReactApplicationContext reactApplicationContext) {
        this.f46795a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* renamed from: a */
    public final void m26375a(String str, WritableArray writableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "data");
        writableMapCreateMap.putArray("detail", writableArray);
        writableMapCreateMap.putString("streamId", str);
        this.f46795a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    /* renamed from: b */
    public final void m26376b(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("detail", str3);
        writableMapCreateMap.putString("streamId", str);
        this.f46795a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    /* renamed from: c */
    public final void m26377c(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "error");
        writableMapCreateMap.putString("code", str2);
        writableMapCreateMap.putString("detail", str3);
        writableMapCreateMap.putString("streamId", str);
        this.f46795a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }
}

package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.OutputStream;
import java.util.HashMap;

/* renamed from: zL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8345zL0 {
    public static final HashMap d = new HashMap();
    public final DeviceEventManagerModule.RCTDeviceEventEmitter a;
    public String b = "base64";
    public OutputStream c = null;

    public C8345zL0(ReactApplicationContext reactApplicationContext) {
        this.a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public final void a(String str, WritableArray writableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "data");
        writableMapCreateMap.putArray("detail", writableArray);
        writableMapCreateMap.putString("streamId", str);
        this.a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    public final void b(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("detail", str3);
        writableMapCreateMap.putString("streamId", str);
        this.a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    public final void c(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", "error");
        writableMapCreateMap.putString("code", str2);
        writableMapCreateMap.putString("detail", str3);
        writableMapCreateMap.putString("streamId", str);
        this.a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }
}

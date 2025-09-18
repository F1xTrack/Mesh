package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* loaded from: classes2.dex */
public abstract class T91 {
    public static final void a(S91 s91, int i, AbstractC6260oP abstractC6260oP) {
        O90.d(s91, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b(s91, i);
        if (interfaceC7405uPB != null) {
            interfaceC7405uPB.g(abstractC6260oP);
        }
    }

    public static final void b(S91 s91, String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        O90.f(str, "event");
        if (s91 == null || (reactApplicationContext = s91.a) == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit(str, writableMap);
    }

    public static final void c(S91 s91, int i) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(new int[]{i}[0]);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        if (s91 == null || (reactApplicationContext = s91.a) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
    }
}

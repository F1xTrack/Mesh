package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* loaded from: classes2.dex */
public abstract class T91 {
    /* renamed from: a */
    public static final void m7608a(S91 s91, int i, AbstractC6550oP abstractC6550oP) {
        O90.m5966d(s91, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, i);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(abstractC6550oP);
        }
    }

    /* renamed from: b */
    public static final void m7609b(S91 s91, String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        O90.m5968f(str, "event");
        if (s91 == null || (reactApplicationContext = s91.f10602a) == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
            return;
        }
        rCTDeviceEventEmitter.emit(str, writableMap);
    }

    /* renamed from: c */
    public static final void m7610c(S91 s91, int i) {
        ReactApplicationContext reactApplicationContext;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(new int[]{i}[0]);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putArray("tags", writableArrayCreateArray);
        if (s91 == null || (reactApplicationContext = s91.f10602a) == null) {
            return;
        }
        reactApplicationContext.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
    }
}

package com.mrousavy.camera.react;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.extensions.C1691a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0492Ho;
import p000.AbstractC11077sn0;
import p000.AbstractC11432vY1;
import p000.AbstractC9366fP1;
import p000.C4115gQ;
import p000.C4265io;
import p000.C6260jo;
import p000.C6323ko;
import p000.CD0;
import p000.InterfaceC0754Lz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001-\u0018\u0000 02\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m22267d2 = {"Lcom/mrousavy/camera/react/CameraDevicesManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableArray;", "getDevicesJson", "()Lcom/facebook/react/bridge/ReadableArray;", "LTf1;", "sendUnavailableCamerasEvent", "()V", "", "getName", "()Ljava/lang/String;", "initialize", "invalidate", "sendAvailableDevicesChangedEvent", "", "", "getConstants", "()Ljava/util/Map;", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "LLz;", "coroutineScope", "LLz;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "LCD0;", "cameraProvider", "LCD0;", "Landroidx/camera/extensions/a;", "extensionsManager", "Landroidx/camera/extensions/a;", "jo", "callback", "Ljo;", "Companion", "io", "react-native-vision-camera_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CameraDevicesManager extends ReactContextBaseJavaModule {
    public static final C4265io Companion = new C4265io();
    private static final String TAG = "CameraDevices";
    private final C6260jo callback;
    private final CameraManager cameraManager;
    private CD0 cameraProvider;
    private final InterfaceC0754Lz coroutineScope;
    private final ExecutorService executor;
    private C1691a extensionsManager;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDevicesManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        ExecutorService executorService = AbstractC0492Ho.f4510b;
        this.executor = executorService;
        this.coroutineScope = AbstractC11432vY1.m25444a(new C4115gQ(executorService));
        Object systemService = reactApplicationContext.getSystemService("camera");
        O90.m5966d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.cameraManager = (CameraManager) systemService;
        this.callback = new C6260jo(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x023d, code lost:
    
        r17 = r2;
        p000.O90.m5965c(r6);
        r0 = com.facebook.react.bridge.Arguments.createMap();
        r0.putString(com.huawei.hms.p015rn.push.constants.NotificationConstants.f19487ID, r10);
        r2 = com.facebook.react.bridge.Arguments.createArray();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0259, code lost:
    
        if (r4.hasNext() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025b, code lost:
    
        r2.pushString(((p000.InterfaceC7782Ja0) r4.next()).mo7a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0269, code lost:
    
        p000.O90.m5965c(r2);
        r0.putArray("physicalDevices", r2);
        r0.putString("position", r5.f26843c.f38177a);
        r0.putString("name", r5.f26844d);
        r4 = r5.f26845e;
        r0.putBoolean("hasFlash", r4);
        r0.putBoolean("hasTorch", r4);
        r0.putDouble("minFocusDistance", r5.f26860t);
        r0.putBoolean("isMultiCam", r5.f26858r);
        r0.putBoolean("supportsRawCapture", false);
        r0.putBoolean("supportsLowLightBoost", r5.f26864x);
        r0.putBoolean("supportsFocus", r5.f26850j);
        r0.putDouble("minZoom", r5.f26846f);
        r0.putDouble("maxZoom", r5.f26847g);
        r0.putDouble("neutralZoom", 1.0d);
        r2 = r5.f26848h;
        p000.O90.m5967e(r2, "minExposure");
        r0.putInt("minExposure", r2.intValue());
        r2 = r5.f26849i;
        p000.O90.m5967e(r2, "maxExposure");
        r0.putInt("maxExposure", r2.intValue());
        r0.putString("hardwareLevel", r5.f26859s.f3549a);
        r0.putString("sensorOrientation", r5.f26855o.f8152a);
        r0.putArray("formats", r6);
        r1.pushMap(r0);
        r2 = r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.react.bridge.ReadableArray getDevicesJson() {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.react.CameraDevicesManager.getDevicesJson():com.facebook.react.bridge.ReadableArray");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUnavailableCamerasEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraDevicesChanged", Arguments.createArray());
    }

    @ReactMethod
    public final void addListener(String eventName) {
        O90.m5968f(eventName, "eventName");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReadableArray devicesJson = getDevicesJson();
        ReadableMap map = devicesJson.size() > 0 ? devicesJson.getMap(0) : null;
        return AbstractC11077sn0.m24781i(new Pair("availableCameraDevices", devicesJson), new Pair("userPreferredCameraDevice", map != null ? map.toHashMap() : null));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.cameraManager.registerAvailabilityCallback(this.callback, (Handler) null);
        AbstractC9366fP1.m18230b(this.coroutineScope, null, new C6323ko(this, null), 3);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.cameraManager.unregisterAvailabilityCallback(this.callback);
        super.invalidate();
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    public final void sendAvailableDevicesChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraDevicesChanged", getDevicesJson());
    }
}

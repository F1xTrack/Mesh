package com.mrousavy.camera.react;

import android.content.ComponentCallbacks2;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.huawei.hms.push.AttributionReporter;
import com.mrousavy.camera.frameprocessors.VisionCameraInstaller;
import com.mrousavy.camera.frameprocessors.VisionCameraProxy;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p000.AbstractActivityC11909zJ0;
import p000.AbstractC0492Ho;
import p000.AbstractC10599p22;
import p000.AbstractC11432vY1;
import p000.AbstractC3982eJ;
import p000.AbstractC9366fP1;
import p000.C0619Jp;
import p000.C0804Mm;
import p000.C10233mB0;
import p000.C4115gQ;
import p000.C4140gp;
import p000.C6199ip;
import p000.C6261jp;
import p000.C6324kp;
import p000.C6387lp;
import p000.C6450mp;
import p000.C6513np;
import p000.C6576op;
import p000.C6641pp;
import p000.C6767rp;
import p000.EnumC0817Mz;
import p000.InterfaceC0754Lz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.OZ1;
import p000.PA0;
import p000.RA0;
import p000.RunnableC6217j7;

@InterfaceC9101dL0(name = "CameraView")
@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010\"J'\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b,\u0010*J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b-\u0010*J'\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020\u000bH\u0007¢\u0006\u0004\b0\u0010\u001bJ\u000f\u00101\u001a\u00020\u000bH\u0007¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u000bH\u0007¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b6\u00104R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, m22267d2 = {"Lcom/mrousavy/camera/react/CameraViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "viewId", "Lgp;", "findCameraView", "(ILVy;)Ljava/lang/Object;", "", AttributionReporter.SYSTEM_PERMISSION, "", "canRequestPermission", "(Ljava/lang/String;)Z", "LRA0;", "getPermission", "(Ljava/lang/String;)LRA0;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "requestPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "invalidate", "()V", "getName", "()Ljava/lang/String;", "installFrameProcessorBindings", "()Z", "viewTag", "Lcom/facebook/react/bridge/ReadableMap;", "options", "takePhoto", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "jsOptions", "takeSnapshot", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "startRecording", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "pauseRecording", "(ILcom/facebook/react/bridge/Promise;)V", "resumeRecording", "stopRecording", "cancelRecording", "point", "focus", "getCameraPermissionStatus", "getMicrophonePermissionStatus", "getLocationPermissionStatus", "requestCameraPermission", "(Lcom/facebook/react/bridge/Promise;)V", "requestMicrophonePermission", "requestLocationPermission", "LLz;", "backgroundCoroutineScope", "LLz;", "Companion", "ip", "react-native-vision-camera_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final C6199ip Companion = new C6199ip();
    public static final String TAG = "CameraView";
    private static int sharedRequestCode = 10;
    private final InterfaceC0754Lz backgroundCoroutineScope;

    static {
        System.loadLibrary("VisionCamera");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.backgroundCoroutineScope = AbstractC11432vY1.m25444a(new C4115gQ(AbstractC0492Ho.f4510b));
    }

    private final boolean canRequestPermission(String str) {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        PA0 pa0 = currentActivity instanceof PA0 ? (PA0) currentActivity : null;
        if (pa0 != null) {
            return pa0.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public final Object findCameraView(int i, InterfaceC1382Vy interfaceC1382Vy) throws C10233mB0 {
        if (!UiThreadUtil.isOnUiThread()) {
            C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
            c0619Jp.m4439s();
            UiThreadUtil.runOnUiThread(new RunnableC6217j7(c0619Jp, i, this));
            Object objM4438r = c0619Jp.m4438r();
            EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
            return objM4438r;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            throw new Error("React Context was null!");
        }
        UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, 1, true);
        if (uIManagerM6095f == null) {
            throw new Error("UIManager not found!");
        }
        View viewResolveView = uIManagerM6095f.resolveView(i);
        C4140gp c4140gp = viewResolveView instanceof C4140gp ? (C4140gp) viewResolveView : null;
        if (c4140gp != null) {
            return c4140gp;
        }
        throw new C10233mB0(i);
    }

    private final RA0 getPermission(String str) {
        int iM17899a = AbstractC3982eJ.m17899a(getReactApplicationContext(), str);
        RA0.f10047b.getClass();
        RA0 ra0 = iM17899a != -1 ? iM17899a != 0 ? RA0.f10049d : RA0.f10050e : RA0.f10048c;
        return (ra0 == RA0.f10048c && canRequestPermission(str)) ? RA0.f10049d : ra0;
    }

    private final void requestPermission(String str, Promise promise) {
        ComponentCallbacks2 currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof PA0)) {
            promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
            return;
        }
        int i = sharedRequestCode;
        sharedRequestCode = i + 1;
        AbstractActivityC11909zJ0 abstractActivityC11909zJ0 = (AbstractActivityC11909zJ0) ((PA0) currentActivity);
        abstractActivityC11909zJ0.m26369k(new String[]{str}, i, new C0804Mm(i, promise, 1));
    }

    public static final boolean requestPermission$lambda$1(int i, Promise promise, int i2, String[] strArr, int[] iArr) {
        O90.m5968f(promise, "$promise");
        O90.m5968f(strArr, "<anonymous parameter 1>");
        O90.m5968f(iArr, "grantResults");
        if (i2 != i) {
            return false;
        }
        int i3 = iArr.length == 0 ? -1 : iArr[0];
        RA0.f10047b.getClass();
        promise.resolve((i3 != -1 ? i3 != 0 ? RA0.f10049d : RA0.f10050e : RA0.f10048c).f10052a);
        return true;
    }

    @ReactMethod
    public final void cancelRecording(int viewTag, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6261jp(viewTag, null, promise, this), 3);
    }

    @ReactMethod
    public final void focus(int viewTag, ReadableMap point, Promise promise) {
        O90.m5968f(point, "point");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6324kp(viewTag, null, promise, point, this), 3);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getCameraPermissionStatus() {
        return getPermission("android.permission.CAMERA").f10052a;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getLocationPermissionStatus() {
        RA0 permission = getPermission("android.permission.ACCESS_FINE_LOCATION");
        return permission == RA0.f10050e ? permission.f10052a : getPermission("android.permission.ACCESS_COARSE_LOCATION").f10052a;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getMicrophonePermissionStatus() {
        return getPermission("android.permission.RECORD_AUDIO").f10052a;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean installFrameProcessorBindings() {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
            VisionCameraInstaller.install(new VisionCameraProxy(reactApplicationContext));
            return true;
        } catch (Error unused) {
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        if (AbstractC11432vY1.m25447d(this.backgroundCoroutineScope)) {
            InterfaceC0754Lz interfaceC0754Lz = this.backgroundCoroutineScope;
            CancellationException cancellationException = new CancellationException("CameraViewModule has been destroyed.");
            cancellationException.initCause(null);
            AbstractC11432vY1.m25445b(interfaceC0754Lz, cancellationException);
        }
    }

    @ReactMethod
    public final void pauseRecording(int viewTag, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6387lp(viewTag, null, promise, this), 3);
    }

    @ReactMethod
    public final void requestCameraPermission(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        requestPermission("android.permission.CAMERA", promise);
    }

    @ReactMethod
    public final void requestLocationPermission(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        requestPermission("android.permission.ACCESS_FINE_LOCATION", promise);
    }

    @ReactMethod
    public final void requestMicrophonePermission(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        requestPermission("android.permission.RECORD_AUDIO", promise);
    }

    @ReactMethod
    public final void resumeRecording(int viewTag, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6450mp(viewTag, null, promise, this), 3);
    }

    @ReactMethod
    public final void startRecording(int viewTag, ReadableMap jsOptions, Callback onRecordCallback) {
        O90.m5968f(jsOptions, "jsOptions");
        O90.m5968f(onRecordCallback, "onRecordCallback");
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6513np(this, viewTag, jsOptions, onRecordCallback, null), 3);
    }

    @ReactMethod
    public final void stopRecording(int viewTag, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6576op(viewTag, null, promise, this), 3);
    }

    @ReactMethod
    public final void takePhoto(int viewTag, ReadableMap options, Promise promise) {
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6641pp(viewTag, null, promise, options, this), 3);
    }

    @ReactMethod
    public final void takeSnapshot(int viewTag, ReadableMap jsOptions, Promise promise) {
        O90.m5968f(jsOptions, "jsOptions");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC9366fP1.m18230b(this.backgroundCoroutineScope, null, new C6767rp(viewTag, null, promise, jsOptions, this), 3);
    }
}

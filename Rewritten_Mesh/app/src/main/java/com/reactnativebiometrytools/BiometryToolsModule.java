package com.reactnativebiometrytools;

import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import p000.C10189lr0;
import p000.C1051Qh;
import p000.C1113Rh;
import p000.C4151h;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.QQ0;
import p000.RunnableC0383G4;

@InterfaceC9101dL0(name = BiometryToolsModule.NAME)
@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0018"}, m22267d2 = {"Lcom/reactnativebiometrytools/BiometryToolsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "getSupportedBiometryType", "(Lcom/facebook/react/bridge/Promise;)V", "isSensorAvailable", "title", "Lcom/facebook/react/bridge/ReadableMap;", "options", "authenticate", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getAvailableFeature", "availableFeature", "Companion", "Rh", "kode-frontend_react-native-biometry-tools_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class BiometryToolsModule extends ReactContextBaseJavaModule {
    private static final String AUTHENTICATION_CANCELED = "AuthenticationCanceledByUser";
    public static final C1113Rh Companion = new C1113Rh();
    private static final String FACE = "Face";
    private static final String FINGERPRINT = "Fingerprint";
    private static final String IRIS = "Iris";
    public static final String NAME = "BiometryTools";
    private static final String NONE = null;
    private static final String NOT_ENROLLED = "BiometryScannerNotEnrolled";
    private static final String NOT_SUPPORTED = "BiometryScannerNotSupported";

    public BiometryToolsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final String getAvailableFeature() {
        return getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.fingerprint") ? "Fingerprint" : getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.biometrics.face") ? "Face" : getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.biometrics.iris") ? "Iris" : NONE;
    }

    @ReactMethod
    public final void authenticate(String title, ReadableMap options, Promise promise) {
        O90.m5968f(title, "title");
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (O90.m5963a(getAvailableFeature(), NONE)) {
            promise.reject(NOT_SUPPORTED, "Biometry scanner is not supported");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        O90.m5966d(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) currentActivity;
        String string = options.getString("subtitle");
        String string2 = options.getString("description");
        boolean z = options.getBoolean("withDeviceCredentials");
        String string3 = options.getString("cancelText");
        if (string3 == null) {
            string3 = "Cancel";
        }
        UiThreadUtil.runOnUiThread(new RunnableC0383G4(7, new C1051Qh(abstractActivityC1730l, title, string, string2, string3, z, new QQ0(promise))));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getSupportedBiometryType(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(getAvailableFeature());
    }

    @ReactMethod
    public final void isSensorAvailable(Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        String availableFeature = getAvailableFeature();
        if (O90.m5963a(availableFeature, NONE)) {
            promise.reject(NOT_SUPPORTED, "Biometry scanner is not supported");
        } else if (new C10189lr0(new C4151h(getReactApplicationContext(), 1)).m22547D(15) == 0) {
            promise.resolve(availableFeature);
        } else {
            promise.reject(NOT_ENROLLED, "Biometry scanner is not enrolled");
        }
    }
}

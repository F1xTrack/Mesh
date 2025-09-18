package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.ReactHostImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes.dex */
public class CJ0 {
    public final Activity a;
    public final String b;
    public QA0 c;
    public AJ0 d;
    public VJ0 e;

    @Deprecated
    public CJ0(Activity activity, String str) {
        this.a = activity;
        this.b = str;
    }

    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    public ReactRootView createRootView() {
        return null;
    }

    public Context getContext() {
        Activity activity = this.a;
        UN1.c(activity);
        return activity;
    }

    public Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.b;
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public VJ0 getReactDelegate() {
        return this.e;
    }

    public CK0 getReactHost() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ((MainApplication) ((IJ0) getPlainActivity().getApplication())).a();
        throw null;
    }

    public QK0 getReactInstanceManager() {
        return this.e.e.a();
    }

    public PL0 getReactNativeHost() {
        return ((MainApplication) ((IJ0) getPlainActivity().getApplication())).a;
    }

    public boolean isFabricEnabled() {
        return ReactFeatureFlags.enableFabricRenderer;
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    public void loadApp(String str) {
        this.e.c(str);
        Activity plainActivity = getPlainActivity();
        VJ0 vj0 = this.e;
        plainActivity.setContentView(ReactFeatureFlags.enableBridgelessArchitecture ? (ReactRootView) ((ViewGroup) ((AtomicReference) vj0.g.a).get()) : vj0.b);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ReactContext reactContextF;
        VJ0 vj0 = this.e;
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Activity activity = vj0.a;
        if (z) {
            ((ReactHostImpl) vj0.f).getClass();
            Objects.toString(activity);
            Objects.toString(intent);
            throw null;
        }
        PL0 pl0 = vj0.e;
        if (!pl0.e() || (reactContextF = pl0.a().f()) == null) {
            return;
        }
        reactContextF.onActivityResult(activity, i, i2, intent);
    }

    public boolean onBackPressed() {
        VJ0 vj0 = this.e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f).getClass();
            UiThreadUtil.assertOnUiThread();
            return true;
        }
        if (!vj0.e.e()) {
            return false;
        }
        QK0 qk0A = vj0.e.a();
        qk0A.getClass();
        UiThreadUtil.assertOnUiThread();
        ReactApplicationContext reactApplicationContext = qk0A.m;
        if (reactApplicationContext == null) {
            AbstractC3393dS.p("QK0");
            qk0A.j();
            return true;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactApplicationContext.getNativeModule(DeviceEventManagerModule.class);
        if (deviceEventManagerModule == null) {
            return true;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        AppearanceModule appearanceModule;
        VJ0 vj0 = this.e;
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Activity activity = vj0.a;
        if (z) {
            UN1.c(activity);
            ((ReactHostImpl) vj0.f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.e;
        if (pl0.e()) {
            QK0 qk0A = pl0.a();
            UN1.c(activity);
            qk0A.getClass();
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContextF = qk0A.f();
            if (reactContextF == null || (appearanceModule = (AppearanceModule) reactContextF.getNativeModule(AppearanceModule.class)) == null) {
                return;
            }
            appearanceModule.onConfigurationChanged(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.a.getWindow().setColorMode(1);
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.e = new VJ0(getPlainActivity(), getReactHost(), bundleComposeLaunchOptions);
        } else {
            this.e = new BJ0(this, getPlainActivity(), getReactNativeHost(), bundleComposeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    public void onDestroy() {
        ReactApplicationContext reactApplicationContext;
        VJ0 vj0 = this.e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            T71 t71 = vj0.g;
            if (t71 != null) {
                if (((ReactHostImpl) ((AtomicReference) t71.b).get()) != null) {
                    ((SurfaceHandlerBinding) t71.c).getSurfaceId();
                    int i = ReactHostImpl.a;
                    throw null;
                }
                N81.c(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached."));
                vj0.g = null;
            }
            ((ReactHostImpl) vj0.f).getClass();
            throw null;
        }
        ReactRootView reactRootView = vj0.b;
        if (reactRootView != null) {
            UiThreadUtil.assertOnUiThread();
            QK0 qk0 = reactRootView.a;
            if (qk0 != null && reactRootView.f) {
                UiThreadUtil.assertOnUiThread();
                if (qk0.a.remove(reactRootView) && (reactApplicationContext = qk0.m) != null && reactApplicationContext.hasActiveReactInstance()) {
                    QK0.e(reactRootView, reactApplicationContext);
                }
                reactRootView.f = false;
            }
            reactRootView.a = null;
            reactRootView.g = false;
            vj0.b = null;
        }
        if (vj0.e.e()) {
            QK0 qk0A = vj0.e.a();
            if (vj0.a == qk0A.p) {
                UiThreadUtil.assertOnUiThread();
                if (qk0A.j) {
                    qk0A.i.getClass();
                }
                synchronized (qk0A) {
                    try {
                        ReactContext reactContextF = qk0A.f();
                        if (reactContextF != null) {
                            if (qk0A.b == LifecycleState.c) {
                                reactContextF.onHostPause();
                                qk0A.b = LifecycleState.b;
                            }
                            if (qk0A.b == LifecycleState.b) {
                                reactContextF.onHostDestroy(false);
                            }
                        } else {
                            ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = qk0A.q;
                            if (reactInstanceManagerInspectorTarget != null) {
                                reactInstanceManagerInspectorTarget.close();
                                qk0A.q = null;
                            }
                        }
                        qk0A.b = LifecycleState.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                qk0A.p = null;
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.e;
        if (i == 90) {
            if (ReactFeatureFlags.enableBridgelessArchitecture && vj0.f != null) {
                UN1.c(null);
            }
            PL0 pl0 = vj0.e;
            if (pl0.e() && pl0.d()) {
                keyEvent.startTracking();
                return true;
            }
        } else {
            vj0.getClass();
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.e;
        if (i != 90) {
            vj0.getClass();
        } else if (!ReactFeatureFlags.enableBridgelessArchitecture || vj0.f == null) {
            PL0 pl0 = vj0.e;
            if (pl0.e() && pl0.d()) {
                QK0 qk0A = pl0.a();
                qk0A.getClass();
                UiThreadUtil.assertOnUiThread();
                qk0A.i.getClass();
                return true;
            }
        } else {
            UN1.c(null);
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.e;
        InterfaceC2490cJ interfaceC2490cJB = vj0.b();
        if (interfaceC2490cJB == null || (interfaceC2490cJB instanceof C6073nQ0)) {
            return false;
        }
        if (i != 82) {
            FC fc = vj0.d;
            View currentFocus = vj0.a.getCurrentFocus();
            if (i != 46 || (currentFocus instanceof EditText)) {
                return false;
            }
            if (!fc.a) {
                fc.a = true;
                new Handler(Looper.getMainLooper()).postDelayed(new DE(8, fc), 200L);
                return false;
            }
            fc.a = false;
        }
        return true;
    }

    public boolean onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        VJ0 vj0 = this.e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f).getClass();
            Objects.toString(intent);
            throw null;
        }
        PL0 pl0 = vj0.e;
        if (!pl0.e()) {
            return false;
        }
        QK0 qk0A = pl0.a();
        qk0A.getClass();
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextF = qk0A.f();
        if (reactContextF == null) {
            AbstractC3393dS.p("QK0");
        } else {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextF.getNativeModule(DeviceEventManagerModule.class)) != null)) {
                deviceEventManagerModule.emitNewIntentReceived(data);
            }
            reactContextF.onNewIntent(qk0A.p, intent);
        }
        return true;
    }

    public void onPause() {
        VJ0 vj0 = this.e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f).getClass();
            throw null;
        }
        if (vj0.e.e()) {
            QK0 qk0A = vj0.e.a();
            Activity activity = vj0.a;
            if (qk0A.k) {
                UN1.a(qk0A.p != null);
            }
            Activity activity2 = qk0A.p;
            if (activity2 != null) {
                UN1.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + qk0A.p.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
            }
            UiThreadUtil.assertOnUiThread();
            qk0A.o = null;
            if (qk0A.j) {
                qk0A.i.getClass();
            }
            synchronized (qk0A) {
                try {
                    ReactContext reactContextF = qk0A.f();
                    if (reactContextF != null) {
                        if (qk0A.b == LifecycleState.a) {
                            reactContextF.onHostResume(qk0A.p);
                            reactContextF.onHostPause();
                        } else if (qk0A.b == LifecycleState.c) {
                            reactContextF.onHostPause();
                        }
                    }
                    qk0A.b = LifecycleState.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.d = new AJ0(this, i, strArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        VJ0 vj0 = this.e;
        Activity activity = vj0.a;
        if (!(activity instanceof InterfaceC8136yF)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.e;
        if (pl0.e()) {
            QK0 qk0A = pl0.a();
            qk0A.getClass();
            UiThreadUtil.assertOnUiThread();
            qk0A.o = (InterfaceC8136yF) activity;
            UiThreadUtil.assertOnUiThread();
            qk0A.p = activity;
            if (qk0A.j) {
                InterfaceC2490cJ interfaceC2490cJ = qk0A.i;
                if (activity != 0) {
                    View decorView = activity.getWindow().getDecorView();
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    if (decorView.isAttachedToWindow()) {
                        interfaceC2490cJ.getClass();
                    } else {
                        decorView.addOnAttachStateChangeListener(new OK0(qk0A, decorView));
                    }
                } else if (!qk0A.k) {
                    interfaceC2490cJ.getClass();
                }
            }
            qk0A.k(false);
        }
        AJ0 aj0 = this.d;
        if (aj0 != null) {
            aj0.invoke(new Object[0]);
            this.d = null;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        VJ0 vj0 = this.e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.e;
        if (pl0.e()) {
            QK0 qk0A = pl0.a();
            qk0A.getClass();
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContextF = qk0A.f();
            if (reactContextF != null) {
                reactContextF.onWindowFocusChange(z);
            }
        }
    }

    public void requestPermissions(String[] strArr, int i, QA0 qa0) {
        this.c = qa0;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public CJ0(AbstractActivityC8339zJ0 abstractActivityC8339zJ0, String str) {
        this.a = abstractActivityC8339zJ0;
        this.b = str;
    }
}

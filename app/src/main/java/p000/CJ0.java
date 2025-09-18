package p000;

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

    /* renamed from: a */
    public final Activity f1312a;

    /* renamed from: b */
    public final String f1313b;

    /* renamed from: c */
    public QA0 f1314c;

    /* renamed from: d */
    public AJ0 f1315d;

    /* renamed from: e */
    public VJ0 f1316e;

    @Deprecated
    public CJ0(Activity activity, String str) {
        this.f1312a = activity;
        this.f1313b = str;
    }

    public Bundle composeLaunchOptions() {
        return getLaunchOptions();
    }

    public ReactRootView createRootView() {
        return null;
    }

    public Context getContext() {
        Activity activity = this.f1312a;
        UN1.m7999c(activity);
        return activity;
    }

    public Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.f1313b;
    }

    public Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public VJ0 getReactDelegate() {
        return this.f1316e;
    }

    public CK0 getReactHost() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ((MainApplication) ((IJ0) getPlainActivity().getApplication())).m24492a();
        throw null;
    }

    public QK0 getReactInstanceManager() {
        return this.f1316e.f12516e.m6302a();
    }

    public PL0 getReactNativeHost() {
        return ((MainApplication) ((IJ0) getPlainActivity().getApplication())).f41951a;
    }

    public boolean isFabricEnabled() {
        return ReactFeatureFlags.enableFabricRenderer;
    }

    public boolean isWideColorGamutEnabled() {
        return false;
    }

    public void loadApp(String str) {
        this.f1316e.m8395c(str);
        Activity plainActivity = getPlainActivity();
        VJ0 vj0 = this.f1316e;
        plainActivity.setContentView(ReactFeatureFlags.enableBridgelessArchitecture ? (ReactRootView) ((ViewGroup) ((AtomicReference) vj0.f12518g.f11173a).get()) : vj0.f12513b);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ReactContext reactContextM6636f;
        VJ0 vj0 = this.f1316e;
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Activity activity = vj0.f12512a;
        if (z) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            Objects.toString(activity);
            Objects.toString(intent);
            throw null;
        }
        PL0 pl0 = vj0.f12516e;
        if (!pl0.m6305e() || (reactContextM6636f = pl0.m6302a().m6636f()) == null) {
            return;
        }
        reactContextM6636f.onActivityResult(activity, i, i2, intent);
    }

    public boolean onBackPressed() {
        VJ0 vj0 = this.f1316e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            UiThreadUtil.assertOnUiThread();
            return true;
        }
        if (!vj0.f12516e.m6305e()) {
            return false;
        }
        QK0 qk0M6302a = vj0.f12516e.m6302a();
        qk0M6302a.getClass();
        UiThreadUtil.assertOnUiThread();
        ReactApplicationContext reactApplicationContext = qk0M6302a.f9577m;
        if (reactApplicationContext == null) {
            AbstractC3929dS.m17683p("QK0");
            qk0M6302a.m6640j();
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
        VJ0 vj0 = this.f1316e;
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Activity activity = vj0.f12512a;
        if (z) {
            UN1.m7999c(activity);
            ((ReactHostImpl) vj0.f12517f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.f12516e;
        if (pl0.m6305e()) {
            QK0 qk0M6302a = pl0.m6302a();
            UN1.m7999c(activity);
            qk0M6302a.getClass();
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContextM6636f = qk0M6302a.m6636f();
            if (reactContextM6636f == null || (appearanceModule = (AppearanceModule) reactContextM6636f.getNativeModule(AppearanceModule.class)) == null) {
                return;
            }
            appearanceModule.onConfigurationChanged(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        Bundle bundleComposeLaunchOptions = composeLaunchOptions();
        if (Build.VERSION.SDK_INT >= 26 && isWideColorGamutEnabled()) {
            this.f1312a.getWindow().setColorMode(1);
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f1316e = new VJ0(getPlainActivity(), getReactHost(), bundleComposeLaunchOptions);
        } else {
            this.f1316e = new BJ0(this, getPlainActivity(), getReactNativeHost(), bundleComposeLaunchOptions, isFabricEnabled());
        }
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    public void onDestroy() {
        ReactApplicationContext reactApplicationContext;
        VJ0 vj0 = this.f1316e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            T71 t71 = vj0.f12518g;
            if (t71 != null) {
                if (((ReactHostImpl) ((AtomicReference) t71.f11174b).get()) != null) {
                    ((SurfaceHandlerBinding) t71.f11175c).getSurfaceId();
                    int i = ReactHostImpl.f17939a;
                    throw null;
                }
                N81.m5568c(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached."));
                vj0.f12518g = null;
            }
            ((ReactHostImpl) vj0.f12517f).getClass();
            throw null;
        }
        ReactRootView reactRootView = vj0.f12513b;
        if (reactRootView != null) {
            UiThreadUtil.assertOnUiThread();
            QK0 qk0 = reactRootView.f17860a;
            if (qk0 != null && reactRootView.f17865f) {
                UiThreadUtil.assertOnUiThread();
                if (qk0.f9565a.remove(reactRootView) && (reactApplicationContext = qk0.f9577m) != null && reactApplicationContext.hasActiveReactInstance()) {
                    QK0.m6630e(reactRootView, reactApplicationContext);
                }
                reactRootView.f17865f = false;
            }
            reactRootView.f17860a = null;
            reactRootView.f17866g = false;
            vj0.f12513b = null;
        }
        if (vj0.f12516e.m6305e()) {
            QK0 qk0M6302a = vj0.f12516e.m6302a();
            if (vj0.f12512a == qk0M6302a.f9580p) {
                UiThreadUtil.assertOnUiThread();
                if (qk0M6302a.f9574j) {
                    qk0M6302a.f9573i.getClass();
                }
                synchronized (qk0M6302a) {
                    try {
                        ReactContext reactContextM6636f = qk0M6302a.m6636f();
                        if (reactContextM6636f != null) {
                            if (qk0M6302a.f9566b == LifecycleState.f17893c) {
                                reactContextM6636f.onHostPause();
                                qk0M6302a.f9566b = LifecycleState.f17892b;
                            }
                            if (qk0M6302a.f9566b == LifecycleState.f17892b) {
                                reactContextM6636f.onHostDestroy(false);
                            }
                        } else {
                            ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = qk0M6302a.f9581q;
                            if (reactInstanceManagerInspectorTarget != null) {
                                reactInstanceManagerInspectorTarget.close();
                                qk0M6302a.f9581q = null;
                            }
                        }
                        qk0M6302a.f9566b = LifecycleState.f17891a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                qk0M6302a.f9580p = null;
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.f1316e;
        if (i == 90) {
            if (ReactFeatureFlags.enableBridgelessArchitecture && vj0.f12517f != null) {
                UN1.m7999c(null);
            }
            PL0 pl0 = vj0.f12516e;
            if (pl0.m6305e() && pl0.mo3152d()) {
                keyEvent.startTracking();
                return true;
            }
        } else {
            vj0.getClass();
        }
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.f1316e;
        if (i != 90) {
            vj0.getClass();
        } else if (!ReactFeatureFlags.enableBridgelessArchitecture || vj0.f12517f == null) {
            PL0 pl0 = vj0.f12516e;
            if (pl0.m6305e() && pl0.mo3152d()) {
                QK0 qk0M6302a = pl0.m6302a();
                qk0M6302a.getClass();
                UiThreadUtil.assertOnUiThread();
                qk0M6302a.f9573i.getClass();
                return true;
            }
        } else {
            UN1.m7999c(null);
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        VJ0 vj0 = this.f1316e;
        InterfaceC1839cJ interfaceC1839cJM8394b = vj0.m8394b();
        if (interfaceC1839cJM8394b == null || (interfaceC1839cJM8394b instanceof C10391nQ0)) {
            return false;
        }
        if (i != 82) {
            C0328FC c0328fc = vj0.f12515d;
            View currentFocus = vj0.f12512a.getCurrentFocus();
            if (i != 46 || (currentFocus instanceof EditText)) {
                return false;
            }
            if (!c0328fc.f3086a) {
                c0328fc.f3086a = true;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0204DE(8, c0328fc), 200L);
                return false;
            }
            c0328fc.f3086a = false;
        }
        return true;
    }

    public boolean onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        VJ0 vj0 = this.f1316e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            Objects.toString(intent);
            throw null;
        }
        PL0 pl0 = vj0.f12516e;
        if (!pl0.m6305e()) {
            return false;
        }
        QK0 qk0M6302a = pl0.m6302a();
        qk0M6302a.getClass();
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextM6636f = qk0M6302a.m6636f();
        if (reactContextM6636f == null) {
            AbstractC3929dS.m17683p("QK0");
        } else {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextM6636f.getNativeModule(DeviceEventManagerModule.class)) != null)) {
                deviceEventManagerModule.emitNewIntentReceived(data);
            }
            reactContextM6636f.onNewIntent(qk0M6302a.f9580p, intent);
        }
        return true;
    }

    public void onPause() {
        VJ0 vj0 = this.f1316e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            throw null;
        }
        if (vj0.f12516e.m6305e()) {
            QK0 qk0M6302a = vj0.f12516e.m6302a();
            Activity activity = vj0.f12512a;
            if (qk0M6302a.f9575k) {
                UN1.m7997a(qk0M6302a.f9580p != null);
            }
            Activity activity2 = qk0M6302a.f9580p;
            if (activity2 != null) {
                UN1.m7998b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + qk0M6302a.f9580p.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
            }
            UiThreadUtil.assertOnUiThread();
            qk0M6302a.f9579o = null;
            if (qk0M6302a.f9574j) {
                qk0M6302a.f9573i.getClass();
            }
            synchronized (qk0M6302a) {
                try {
                    ReactContext reactContextM6636f = qk0M6302a.m6636f();
                    if (reactContextM6636f != null) {
                        if (qk0M6302a.f9566b == LifecycleState.f17891a) {
                            reactContextM6636f.onHostResume(qk0M6302a.f9580p);
                            reactContextM6636f.onHostPause();
                        } else if (qk0M6302a.f9566b == LifecycleState.f17893c) {
                            reactContextM6636f.onHostPause();
                        }
                    }
                    qk0M6302a.f9566b = LifecycleState.f17892b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1315d = new AJ0(this, i, strArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        VJ0 vj0 = this.f1316e;
        Activity activity = vj0.f12512a;
        if (!(activity instanceof InterfaceC7189yF)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.f12516e;
        if (pl0.m6305e()) {
            QK0 qk0M6302a = pl0.m6302a();
            qk0M6302a.getClass();
            UiThreadUtil.assertOnUiThread();
            qk0M6302a.f9579o = (InterfaceC7189yF) activity;
            UiThreadUtil.assertOnUiThread();
            qk0M6302a.f9580p = activity;
            if (qk0M6302a.f9574j) {
                InterfaceC1839cJ interfaceC1839cJ = qk0M6302a.f9573i;
                if (activity != 0) {
                    View decorView = activity.getWindow().getDecorView();
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    if (decorView.isAttachedToWindow()) {
                        interfaceC1839cJ.getClass();
                    } else {
                        decorView.addOnAttachStateChangeListener(new OK0(qk0M6302a, decorView));
                    }
                } else if (!qk0M6302a.f9575k) {
                    interfaceC1839cJ.getClass();
                }
            }
            qk0M6302a.m6641k(false);
        }
        AJ0 aj0 = this.f1315d;
        if (aj0 != null) {
            aj0.invoke(new Object[0]);
            this.f1315d = null;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        VJ0 vj0 = this.f1316e;
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            ((ReactHostImpl) vj0.f12517f).getClass();
            throw null;
        }
        PL0 pl0 = vj0.f12516e;
        if (pl0.m6305e()) {
            QK0 qk0M6302a = pl0.m6302a();
            qk0M6302a.getClass();
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContextM6636f = qk0M6302a.m6636f();
            if (reactContextM6636f != null) {
                reactContextM6636f.onWindowFocusChange(z);
            }
        }
    }

    public void requestPermissions(String[] strArr, int i, QA0 qa0) {
        this.f1314c = qa0;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public CJ0(AbstractActivityC11909zJ0 abstractActivityC11909zJ0, String str) {
        this.f1312a = abstractActivityC11909zJ0;
        this.f1313b = str;
    }
}

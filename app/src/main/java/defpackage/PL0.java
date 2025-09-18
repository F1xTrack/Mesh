package defpackage;

import android.app.Application;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PL0 {
    public final Application a;
    public QK0 b;

    public PL0(Application application) {
        this.a = application;
    }

    public final QK0 a() {
        if (this.b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.b = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.b;
    }

    public boolean b() {
        return true;
    }

    public OL0 c() {
        return new OL0(0);
    }

    public QK0 createReactInstanceManager() {
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        String str;
        JavaScriptExecutorFactory c7630va0;
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        RK0 baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        UN1.d(baseReactInstanceManagerBuilder.e, "Application property has not been set with this builder");
        JavaScriptExecutorFactory c7630va02 = null;
        if (baseReactInstanceManagerBuilder.i == LifecycleState.c) {
            UN1.d(null, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = true;
        UN1.b((!baseReactInstanceManagerBuilder.f && baseReactInstanceManagerBuilder.b == null && baseReactInstanceManagerBuilder.c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (baseReactInstanceManagerBuilder.d == null && baseReactInstanceManagerBuilder.b == null && baseReactInstanceManagerBuilder.c == null) {
            z = false;
        }
        UN1.b(z, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = baseReactInstanceManagerBuilder.e.getPackageName();
        String strE = AbstractC6960s4.e();
        Application application = baseReactInstanceManagerBuilder.e;
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = baseReactInstanceManagerBuilder.k;
        if (javaScriptExecutorFactory2 == null) {
            try {
                SoLoader.e(application.getApplicationContext(), 0);
                EnumC8200ya0 enumC8200ya0 = baseReactInstanceManagerBuilder.p;
                if (enumC8200ya0 == null) {
                    try {
                        try {
                            HermesExecutor.a();
                            c7630va0 = new Y20();
                        } catch (UnsatisfiedLinkError unused) {
                            int i = JSCExecutor.a;
                            SoLoader.j("jscexecutor");
                            c7630va0 = new C7630va0(packageName, strE);
                        }
                        c7630va02 = c7630va0;
                    } catch (UnsatisfiedLinkError e) {
                        AbstractC3393dS.e("RK0");
                        if (e.getMessage().contains("__cxa_bad_typeid")) {
                            throw e;
                        }
                    }
                } else if (enumC8200ya0 == EnumC8200ya0.b) {
                    HermesExecutor.a();
                    c7630va02 = new Y20();
                } else {
                    int i2 = JSCExecutor.a;
                    SoLoader.j("jscexecutor");
                    c7630va02 = new C7630va0(packageName, strE);
                }
                javaScriptExecutorFactory = c7630va02;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            javaScriptExecutorFactory = javaScriptExecutorFactory2;
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = baseReactInstanceManagerBuilder.c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = baseReactInstanceManagerBuilder.b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(baseReactInstanceManagerBuilder.e, str, false);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        String str2 = baseReactInstanceManagerBuilder.d;
        ArrayList arrayList = baseReactInstanceManagerBuilder.a;
        boolean z2 = baseReactInstanceManagerBuilder.f;
        InterfaceC3366dJ c3735fF = baseReactInstanceManagerBuilder.g;
        if (c3735fF == null) {
            c3735fF = new C3735fF();
        }
        InterfaceC3366dJ interfaceC3366dJ = c3735fF;
        boolean z3 = baseReactInstanceManagerBuilder.h;
        LifecycleState lifecycleState = baseReactInstanceManagerBuilder.i;
        UN1.d(lifecycleState, "Initial lifecycle state was not set");
        return new QK0(application, javaScriptExecutorFactory, jSBundleLoader, str2, arrayList, z2, interfaceC3366dJ, z3, lifecycleState, baseReactInstanceManagerBuilder.j, baseReactInstanceManagerBuilder.l, baseReactInstanceManagerBuilder.m, baseReactInstanceManagerBuilder.n, null, baseReactInstanceManagerBuilder.o, baseReactInstanceManagerBuilder.q);
    }

    public abstract boolean d();

    public final boolean e() {
        return this.b != null;
    }

    public final Application getApplication() {
        return this.a;
    }

    public RK0 getBaseReactInstanceManagerBuilder() {
        RK0 rk0 = new RK0();
        rk0.e = this.a;
        rk0.d = getJSMainModuleName();
        rk0.f = d();
        rk0.g = getDevSupportManagerFactory();
        getDevLoadingViewManager();
        rk0.h = b();
        rk0.o = c();
        rk0.j = getJSExceptionHandler();
        getRedBoxHandler();
        rk0.k = getJavaScriptExecutorFactory();
        rk0.n = getUIManagerProvider();
        rk0.i = LifecycleState.a;
        getReactPackageTurboModuleManagerDelegateBuilder();
        rk0.p = getJSEngineResolutionAlgorithm();
        rk0.q = getChoreographerProvider();
        getPausedInDebuggerOverlayManager();
        Iterator<ZL0> it = getPackages().iterator();
        while (it.hasNext()) {
            rk0.a.add(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile == null) {
            String bundleAssetName = getBundleAssetName();
            UN1.c(bundleAssetName);
            rk0.b = "assets://".concat(bundleAssetName);
            rk0.c = null;
        } else if (jSBundleFile.startsWith("assets://")) {
            rk0.b = jSBundleFile;
            rk0.c = null;
        } else {
            rk0.c = JSBundleLoader.createFileLoader(jSBundleFile);
            rk0.b = null;
        }
        return rk0;
    }

    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    public InterfaceC1162Or getChoreographerProvider() {
        return null;
    }

    public InterfaceC2109aJ getDevLoadingViewManager() {
        return null;
    }

    public InterfaceC3366dJ getDevSupportManagerFactory() {
        return null;
    }

    public String getJSBundleFile() {
        return null;
    }

    public EnumC8200ya0 getJSEngineResolutionAlgorithm() {
        return null;
    }

    public JSExceptionHandler getJSExceptionHandler() {
        return null;
    }

    public String getJSMainModuleName() {
        return "index.android";
    }

    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public abstract List<ZL0> getPackages();

    public InterfaceC7742wA0 getPausedInDebuggerOverlayManager() {
        return null;
    }

    public AbstractC3566eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    public RO0 getRedBoxHandler() {
        return null;
    }

    public UIManagerProvider getUIManagerProvider() {
        return new NL0();
    }
}

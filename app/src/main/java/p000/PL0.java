package p000;

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

    /* renamed from: a */
    public final Application f8998a;

    /* renamed from: b */
    public QK0 f8999b;

    public PL0(Application application) {
        this.f8998a = application;
    }

    /* renamed from: a */
    public final QK0 m6302a() {
        if (this.f8999b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f8999b = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f8999b;
    }

    /* renamed from: b */
    public boolean mo6303b() {
        return true;
    }

    /* renamed from: c */
    public OL0 mo6304c() {
        return new OL0(0);
    }

    public QK0 createReactInstanceManager() {
        JavaScriptExecutorFactory javaScriptExecutorFactory;
        String str;
        JavaScriptExecutorFactory c11435va0;
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        RK0 baseReactInstanceManagerBuilder = getBaseReactInstanceManagerBuilder();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        UN1.m8000d(baseReactInstanceManagerBuilder.f10125e, "Application property has not been set with this builder");
        JavaScriptExecutorFactory c11435va02 = null;
        if (baseReactInstanceManagerBuilder.f10129i == LifecycleState.f17893c) {
            UN1.m8000d(null, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z = true;
        UN1.m7998b((!baseReactInstanceManagerBuilder.f10126f && baseReactInstanceManagerBuilder.f10122b == null && baseReactInstanceManagerBuilder.f10123c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (baseReactInstanceManagerBuilder.f10124d == null && baseReactInstanceManagerBuilder.f10122b == null && baseReactInstanceManagerBuilder.f10123c == null) {
            z = false;
        }
        UN1.m7998b(z, "Either MainModulePath or JS Bundle File needs to be provided");
        String packageName = baseReactInstanceManagerBuilder.f10125e.getPackageName();
        String strM24606e = AbstractC6800s4.m24606e();
        Application application = baseReactInstanceManagerBuilder.f10125e;
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = baseReactInstanceManagerBuilder.f10131k;
        if (javaScriptExecutorFactory2 == null) {
            try {
                SoLoader.m11071e(application.getApplicationContext(), 0);
                EnumC11816ya0 enumC11816ya0 = baseReactInstanceManagerBuilder.f10136p;
                if (enumC11816ya0 == null) {
                    try {
                        try {
                            HermesExecutor.m10901a();
                            c11435va0 = new Y20();
                        } catch (UnsatisfiedLinkError unused) {
                            int i = JSCExecutor.f17913a;
                            SoLoader.m11076j("jscexecutor");
                            c11435va0 = new C11435va0(packageName, strM24606e);
                        }
                        c11435va02 = c11435va0;
                    } catch (UnsatisfiedLinkError e) {
                        AbstractC3929dS.m17672e("RK0");
                        if (e.getMessage().contains("__cxa_bad_typeid")) {
                            throw e;
                        }
                    }
                } else if (enumC11816ya0 == EnumC11816ya0.f46317b) {
                    HermesExecutor.m10901a();
                    c11435va02 = new Y20();
                } else {
                    int i2 = JSCExecutor.f17913a;
                    SoLoader.m11076j("jscexecutor");
                    c11435va02 = new C11435va0(packageName, strM24606e);
                }
                javaScriptExecutorFactory = c11435va02;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            javaScriptExecutorFactory = javaScriptExecutorFactory2;
        }
        JSBundleLoader jSBundleLoaderCreateAssetLoader = baseReactInstanceManagerBuilder.f10123c;
        if (jSBundleLoaderCreateAssetLoader == null && (str = baseReactInstanceManagerBuilder.f10122b) != null) {
            jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(baseReactInstanceManagerBuilder.f10125e, str, false);
        }
        JSBundleLoader jSBundleLoader = jSBundleLoaderCreateAssetLoader;
        String str2 = baseReactInstanceManagerBuilder.f10124d;
        ArrayList arrayList = baseReactInstanceManagerBuilder.f10121a;
        boolean z2 = baseReactInstanceManagerBuilder.f10126f;
        InterfaceC3920dJ c4041fF = baseReactInstanceManagerBuilder.f10127g;
        if (c4041fF == null) {
            c4041fF = new C4041fF();
        }
        InterfaceC3920dJ interfaceC3920dJ = c4041fF;
        boolean z3 = baseReactInstanceManagerBuilder.f10128h;
        LifecycleState lifecycleState = baseReactInstanceManagerBuilder.f10129i;
        UN1.m8000d(lifecycleState, "Initial lifecycle state was not set");
        return new QK0(application, javaScriptExecutorFactory, jSBundleLoader, str2, arrayList, z2, interfaceC3920dJ, z3, lifecycleState, baseReactInstanceManagerBuilder.f10130j, baseReactInstanceManagerBuilder.f10132l, baseReactInstanceManagerBuilder.f10133m, baseReactInstanceManagerBuilder.f10134n, null, baseReactInstanceManagerBuilder.f10135o, baseReactInstanceManagerBuilder.f10137q);
    }

    /* renamed from: d */
    public abstract boolean mo3152d();

    /* renamed from: e */
    public final boolean m6305e() {
        return this.f8999b != null;
    }

    public final Application getApplication() {
        return this.f8998a;
    }

    public RK0 getBaseReactInstanceManagerBuilder() {
        RK0 rk0 = new RK0();
        rk0.f10125e = this.f8998a;
        rk0.f10124d = getJSMainModuleName();
        rk0.f10126f = mo3152d();
        rk0.f10127g = getDevSupportManagerFactory();
        getDevLoadingViewManager();
        rk0.f10128h = mo6303b();
        rk0.f10135o = mo6304c();
        rk0.f10130j = getJSExceptionHandler();
        getRedBoxHandler();
        rk0.f10131k = getJavaScriptExecutorFactory();
        rk0.f10134n = getUIManagerProvider();
        rk0.f10129i = LifecycleState.f17891a;
        getReactPackageTurboModuleManagerDelegateBuilder();
        rk0.f10136p = getJSEngineResolutionAlgorithm();
        rk0.f10137q = getChoreographerProvider();
        getPausedInDebuggerOverlayManager();
        Iterator<ZL0> it = getPackages().iterator();
        while (it.hasNext()) {
            rk0.f10121a.add(it.next());
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile == null) {
            String bundleAssetName = getBundleAssetName();
            UN1.m7999c(bundleAssetName);
            rk0.f10122b = "assets://".concat(bundleAssetName);
            rk0.f10123c = null;
        } else if (jSBundleFile.startsWith("assets://")) {
            rk0.f10122b = jSBundleFile;
            rk0.f10123c = null;
        } else {
            rk0.f10123c = JSBundleLoader.createFileLoader(jSBundleFile);
            rk0.f10122b = null;
        }
        return rk0;
    }

    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    public InterfaceC0935Or getChoreographerProvider() {
        return null;
    }

    public InterfaceC1656aJ getDevLoadingViewManager() {
        return null;
    }

    public InterfaceC3920dJ getDevSupportManagerFactory() {
        return null;
    }

    public String getJSBundleFile() {
        return null;
    }

    public EnumC11816ya0 getJSEngineResolutionAlgorithm() {
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

    public InterfaceC11510wA0 getPausedInDebuggerOverlayManager() {
        return null;
    }

    public AbstractC9231eM0 getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    public RO0 getRedBoxHandler() {
        return null;
    }

    public UIManagerProvider getUIManagerProvider() {
        return new NL0();
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Trace;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class QK0 {
    public static final /* synthetic */ int y = 0;
    public volatile LifecycleState b;
    public N8 c;
    public volatile Thread d;
    public final JavaScriptExecutorFactory e;
    public final String g;
    public final ArrayList h;
    public final InterfaceC2490cJ i;
    public final boolean j;
    public final boolean k;
    public volatile ReactApplicationContext m;
    private final JSBundleLoader mBundleLoader;
    public final Application n;
    public InterfaceC8136yF o;
    public Activity p;
    public ReactInstanceManagerInspectorTarget q;
    public final ComponentCallbacks2C7868wq0 u;
    public final JSExceptionHandler v;
    public final UIManagerProvider w;
    public ArrayList x;
    public final Set a = Collections.synchronizedSet(new HashSet());
    public HashSet f = null;
    public final Object l = new Object();
    public final List r = Collections.synchronizedList(new ArrayList());
    public volatile boolean s = false;
    public volatile Boolean t = Boolean.FALSE;

    /* JADX WARN: Removed duplicated region for block: B:112:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QK0(android.app.Application r21, com.facebook.react.bridge.JavaScriptExecutorFactory r22, com.facebook.react.bridge.JSBundleLoader r23, java.lang.String r24, java.util.ArrayList r25, boolean r26, defpackage.InterfaceC3366dJ r27, boolean r28, com.facebook.react.common.LifecycleState r29, com.facebook.react.bridge.JSExceptionHandler r30, int r31, int r32, com.facebook.react.bridge.UIManagerProvider r33, defpackage.AbstractC3566eM0 r34, defpackage.OL0 r35, defpackage.InterfaceC1162Or r36) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QK0.<init>(android.app.Application, com.facebook.react.bridge.JavaScriptExecutorFactory, com.facebook.react.bridge.JSBundleLoader, java.lang.String, java.util.ArrayList, boolean, dJ, boolean, com.facebook.react.common.LifecycleState, com.facebook.react.bridge.JSExceptionHandler, int, int, com.facebook.react.bridge.UIManagerProvider, eM0, OL0, Or):void");
    }

    public static void e(InterfaceC5870mM0 interfaceC5870mM0, ReactApplicationContext reactApplicationContext) {
        AbstractC3393dS.b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        if (interfaceC5870mM0.getState().compareAndSet(1, 0)) {
            int uIManagerType = interfaceC5870mM0.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = interfaceC5870mM0.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager uIManagerF = OZ1.f(reactApplicationContext, uIManagerType, true);
                    if (uIManagerF != null) {
                        uIManagerF.stopSurface(rootViewTag);
                    } else {
                        AbstractC3393dS.p("ReactNative");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException("QK0", new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactApplicationContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(interfaceC5870mM0.getRootViewTag());
            }
            UiThreadUtil.assertOnUiThread();
            interfaceC5870mM0.getState().compareAndSet(1, 0);
            ViewGroup rootViewGroup = interfaceC5870mM0.getRootViewGroup();
            rootViewGroup.removeAllViews();
            rootViewGroup.setId(-1);
        }
    }

    public static void l(ZL0 zl0, CC0 cc0) {
        Iterable<ModuleHolder> nativeModuleIterator;
        new ArrayList().add("className: " + zl0.getClass().getSimpleName().toString());
        MT1.b("processPackage".concat(""));
        boolean z = zl0 instanceof C8084xz;
        if (z) {
            ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
        }
        boolean z2 = zl0 instanceof AbstractC8407zg;
        BridgeReactContext bridgeReactContext = (BridgeReactContext) cc0.b;
        if (z2) {
            nativeModuleIterator = ((AbstractC8407zg) zl0).getNativeModuleIterator(bridgeReactContext);
        } else {
            zl0.getClass().getSimpleName().concat(" is not a LazyReactPackage, falling back to old version.");
            AbstractC3393dS.b("ReactNative");
            final List listCreateNativeModules = zl0.createNativeModules(bridgeReactContext);
            nativeModuleIterator = new Iterable() { // from class: aM0
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return new C2310bM0(listCreateNativeModules);
                }
            };
        }
        for (ModuleHolder moduleHolder : nativeModuleIterator) {
            String name = moduleHolder.getName();
            HashMap map = (HashMap) cc0.c;
            if (map.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) map.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    StringBuilder sbQ = AbstractC8235ym.q("Native module ", name, " tried to override ");
                    sbQ.append(moduleHolder2.getClassName());
                    sbQ.append(". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                    throw new IllegalStateException(sbQ.toString());
                }
                map.remove(moduleHolder2);
            }
            map.put(name, moduleHolder);
        }
        if (z) {
            ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
        }
        Trace.endSection();
    }

    public final void a(LK0 lk0) {
        this.r.add(lk0);
    }

    public final void b(InterfaceC5870mM0 interfaceC5870mM0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iAddRootView;
        AbstractC3393dS.b("ReactNative");
        if (interfaceC5870mM0.getState().compareAndSet(0, 1)) {
            MT1.b("attachRootViewToInstance");
            UIManager uIManagerF = OZ1.f(this.m, interfaceC5870mM0.getUIManagerType(), true);
            if (uIManagerF == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = interfaceC5870mM0.getAppProperties();
            if (interfaceC5870mM0.getUIManagerType() == 2) {
                iAddRootView = uIManagerF.startSurface(interfaceC5870mM0.getRootViewGroup(), interfaceC5870mM0.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), interfaceC5870mM0.getWidthMeasureSpec(), interfaceC5870mM0.getHeightMeasureSpec());
                interfaceC5870mM0.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerF.addRootView(interfaceC5870mM0.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                interfaceC5870mM0.setRootViewTag(iAddRootView);
                ((ReactRootView) interfaceC5870mM0).k();
            }
            MT1.a(iAddRootView, "pre_rootView.onAttachedToReactInstance");
            UiThreadUtil.runOnUiThread(new RunnableC5338ja(iAddRootView, interfaceC5870mM0));
            Trace.endSection();
        }
    }

    public final BridgeReactContext c(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        AbstractC3393dS.b("ReactNative");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.n);
        JSExceptionHandler jSExceptionHandler = this.v;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.i;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        ArrayList arrayList = this.h;
        CC0 cc0 = new CC0(bridgeReactContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.h) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ZL0 zl0 = (ZL0) it.next();
                    MT1.b("createAndProcessCustomReactPackage");
                    try {
                        l(zl0, cc0);
                        Trace.endSection();
                    } finally {
                        Trace.endSection();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        MT1.b("buildNativeModuleRegistry");
        try {
            NativeModuleRegistry nativeModuleRegistry = new NativeModuleRegistry((BridgeReactContext) cc0.b, (HashMap) cc0.c);
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
            CatalystInstanceImpl.Builder jSExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(nativeModuleRegistry).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler);
            if (this.q == null && InspectorFlags.getFuseboxEnabled()) {
                this.q = new ReactInstanceManagerInspectorTarget(new PK0(this));
            }
            CatalystInstanceImpl.Builder inspectorTarget = jSExceptionHandler2.setInspectorTarget(this.q);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
            MT1.b("createCatalystInstance");
            try {
                CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
                catalystInstanceImplBuild.getRuntimeScheduler();
                UIManagerProvider uIManagerProvider = this.w;
                if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                    uIManagerCreateUIManager.initialize();
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                }
                ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
                MT1.b("runJSBundle");
                catalystInstanceImplBuild.runJSBundle();
                return bridgeReactContext;
            } catch (Throwable th2) {
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
            throw th3;
        }
    }

    public final void d() {
        AbstractC3393dS.b("QK0");
        UiThreadUtil.assertOnUiThread();
        if (this.s) {
            return;
        }
        this.s = true;
        n();
    }

    public final ReactContext f() {
        ReactApplicationContext reactApplicationContext;
        synchronized (this.l) {
            reactApplicationContext = this.m;
        }
        return reactApplicationContext;
    }

    public final List g(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        MT1.b("createAllViewManagers");
        try {
            if (this.x == null) {
                synchronized (this.h) {
                    try {
                        if (this.x == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.h.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((ZL0) it.next()).createViewManagers(reactApplicationContext));
                            }
                            this.x = arrayList;
                            Trace.endSection();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } finally {
                    }
                }
            }
            ArrayList arrayList2 = this.x;
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return arrayList2;
        } catch (Throwable th) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    public final Collection h() {
        HashSet hashSet;
        MT1.b("ReactInstanceManager.getViewManagerNames");
        try {
            HashSet hashSet2 = this.f;
            if (hashSet2 != null) {
                return hashSet2;
            }
            synchronized (this.l) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) f();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.h) {
                        try {
                            if (this.f == null) {
                                HashSet hashSet3 = new HashSet();
                                Iterator it = this.h.iterator();
                                while (it.hasNext()) {
                                    ZL0 zl0 = (ZL0) it.next();
                                    new ArrayList().add("Package: " + zl0.getClass().getSimpleName().toString());
                                    MT1.b("ReactInstanceManager.getViewManagerName".concat(""));
                                    if (zl0 instanceof InterfaceC0442Fk1) {
                                        Collection viewManagerNames = ((InterfaceC0442Fk1) zl0).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet3.addAll(viewManagerNames);
                                        }
                                    } else {
                                        AbstractC3393dS.q("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", zl0.getClass().getSimpleName());
                                    }
                                    Trace.endSection();
                                }
                                this.f = hashSet3;
                            }
                            hashSet = this.f;
                        } finally {
                        }
                    }
                    return hashSet;
                }
                AbstractC3393dS.p("ReactNative");
                return Collections.emptyList();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void i(Exception exc) {
        this.i.handleException(exc);
    }

    public final void j() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC8136yF interfaceC8136yF = this.o;
        if (interfaceC8136yF != null) {
            interfaceC8136yF.a();
        }
    }

    public final synchronized void k(boolean z) {
        try {
            ReactContext reactContextF = f();
            if (reactContextF != null && (z || this.b == LifecycleState.b || this.b == LifecycleState.a)) {
                reactContextF.onHostResume(this.p);
            }
            this.b = LifecycleState.c;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m() {
        AbstractC3393dS.b("QK0");
        O90.f(UJ0.a, "tag");
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.e;
        JSBundleLoader jSBundleLoader = this.mBundleLoader;
        AbstractC3393dS.b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        N8 n8 = new N8(javaScriptExecutorFactory, jSBundleLoader);
        if (this.d == null) {
            p(n8);
        } else {
            this.c = n8;
        }
    }

    public final void n() {
        AbstractC3393dS.b("QK0");
        O90.f(UJ0.a, "tag");
        UiThreadUtil.assertOnUiThread();
        if (!this.j || this.g == null) {
            m();
            return;
        }
        YI yiA = this.i.a();
        if (this.mBundleLoader == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new MD0(new C1562Tu0(this, 24, yiA), 10, yiA));
    }

    public final void o(LK0 lk0) {
        this.r.remove(lk0);
    }

    public final void p(N8 n8) {
        AbstractC3393dS.b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.a) {
            synchronized (this.l) {
                try {
                    if (this.m != null) {
                        r(this.m);
                        this.m = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = new Thread(null, new MD0(this, 8, n8), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.d.start();
    }

    public final void q(BridgeReactContext bridgeReactContext) {
        AbstractC3393dS.b("ReactNative");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        MT1.b("setupReactContext");
        synchronized (this.a) {
            try {
                synchronized (this.l) {
                    this.m = bridgeReactContext;
                }
                CatalystInstance catalystInstance = bridgeReactContext.getCatalystInstance();
                UN1.c(catalystInstance);
                catalystInstance.initialize();
                this.i.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = this.u.a;
                if (!copyOnWriteArrayList.contains(catalystInstance)) {
                    copyOnWriteArrayList.add(catalystInstance);
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    b((InterfaceC5870mM0) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        UiThreadUtil.runOnUiThread(new RunnableC1313Qp0(this, (LK0[]) this.r.toArray(new LK0[this.r.size()]), bridgeReactContext, 3));
        bridgeReactContext.runOnJSQueueThread(new A3(5));
        bridgeReactContext.runOnNativeModulesQueueThread(new A3(6));
        Trace.endSection();
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    public final void r(ReactApplicationContext reactApplicationContext) {
        AbstractC3393dS.b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        if (this.b == LifecycleState.c) {
            reactApplicationContext.onHostPause();
        }
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    e((InterfaceC5870mM0) it.next(), reactApplicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ComponentCallbacks2C7868wq0 componentCallbacks2C7868wq0 = this.u;
        componentCallbacks2C7868wq0.a.remove(reactApplicationContext.getCatalystInstance());
        reactApplicationContext.destroy();
        this.i.getClass();
    }
}

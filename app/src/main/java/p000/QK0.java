package p000;

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

    /* renamed from: y */
    public static final /* synthetic */ int f9564y = 0;

    /* renamed from: b */
    public volatile LifecycleState f9566b;

    /* renamed from: c */
    public C0827N8 f9567c;

    /* renamed from: d */
    public volatile Thread f9568d;

    /* renamed from: e */
    public final JavaScriptExecutorFactory f9569e;

    /* renamed from: g */
    public final String f9571g;

    /* renamed from: h */
    public final ArrayList f9572h;

    /* renamed from: i */
    public final InterfaceC1839cJ f9573i;

    /* renamed from: j */
    public final boolean f9574j;

    /* renamed from: k */
    public final boolean f9575k;

    /* renamed from: m */
    public volatile ReactApplicationContext f9577m;
    private final JSBundleLoader mBundleLoader;

    /* renamed from: n */
    public final Application f9578n;

    /* renamed from: o */
    public InterfaceC7189yF f9579o;

    /* renamed from: p */
    public Activity f9580p;

    /* renamed from: q */
    public ReactInstanceManagerInspectorTarget f9581q;

    /* renamed from: u */
    public final ComponentCallbacks2C11594wq0 f9585u;

    /* renamed from: v */
    public final JSExceptionHandler f9586v;

    /* renamed from: w */
    public final UIManagerProvider f9587w;

    /* renamed from: x */
    public ArrayList f9588x;

    /* renamed from: a */
    public final Set f9565a = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    public HashSet f9570f = null;

    /* renamed from: l */
    public final Object f9576l = new Object();

    /* renamed from: r */
    public final List f9582r = Collections.synchronizedList(new ArrayList());

    /* renamed from: s */
    public volatile boolean f9583s = false;

    /* renamed from: t */
    public volatile Boolean f9584t = Boolean.FALSE;

    /* JADX WARN: Removed duplicated region for block: B:112:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QK0(android.app.Application r21, com.facebook.react.bridge.JavaScriptExecutorFactory r22, com.facebook.react.bridge.JSBundleLoader r23, java.lang.String r24, java.util.ArrayList r25, boolean r26, p000.InterfaceC3920dJ r27, boolean r28, com.facebook.react.common.LifecycleState r29, com.facebook.react.bridge.JSExceptionHandler r30, int r31, int r32, com.facebook.react.bridge.UIManagerProvider r33, p000.AbstractC9231eM0 r34, p000.OL0 r35, p000.InterfaceC0935Or r36) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.QK0.<init>(android.app.Application, com.facebook.react.bridge.JavaScriptExecutorFactory, com.facebook.react.bridge.JSBundleLoader, java.lang.String, java.util.ArrayList, boolean, dJ, boolean, com.facebook.react.common.LifecycleState, com.facebook.react.bridge.JSExceptionHandler, int, int, com.facebook.react.bridge.UIManagerProvider, eM0, OL0, Or):void");
    }

    /* renamed from: e */
    public static void m6630e(InterfaceC10255mM0 interfaceC10255mM0, ReactApplicationContext reactApplicationContext) {
        AbstractC3929dS.m17669b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        if (interfaceC10255mM0.getState().compareAndSet(1, 0)) {
            int uIManagerType = interfaceC10255mM0.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = interfaceC10255mM0.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, uIManagerType, true);
                    if (uIManagerM6095f != null) {
                        uIManagerM6095f.stopSurface(rootViewTag);
                    } else {
                        AbstractC3929dS.m17683p("ReactNative");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException("QK0", new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactApplicationContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(interfaceC10255mM0.getRootViewTag());
            }
            UiThreadUtil.assertOnUiThread();
            interfaceC10255mM0.getState().compareAndSet(1, 0);
            ViewGroup rootViewGroup = interfaceC10255mM0.getRootViewGroup();
            rootViewGroup.removeAllViews();
            rootViewGroup.setId(-1);
        }
    }

    /* renamed from: l */
    public static void m6631l(ZL0 zl0, CC0 cc0) {
        Iterable<ModuleHolder> nativeModuleIterator;
        new ArrayList().add("className: " + zl0.getClass().getSimpleName().toString());
        MT1.m5371b("processPackage".concat(""));
        boolean z = zl0 instanceof C7172xz;
        if (z) {
            ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
        }
        boolean z2 = zl0 instanceof AbstractC7279zg;
        BridgeReactContext bridgeReactContext = (BridgeReactContext) cc0.f1250b;
        if (z2) {
            nativeModuleIterator = ((AbstractC7279zg) zl0).getNativeModuleIterator(bridgeReactContext);
        } else {
            zl0.getClass().getSimpleName().concat(" is not a LazyReactPackage, falling back to old version.");
            AbstractC3929dS.m17669b("ReactNative");
            final List listCreateNativeModules = zl0.createNativeModules(bridgeReactContext);
            nativeModuleIterator = new Iterable() { // from class: aM0
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return new C8842bM0(listCreateNativeModules);
                }
            };
        }
        for (ModuleHolder moduleHolder : nativeModuleIterator) {
            String name = moduleHolder.getName();
            HashMap map = (HashMap) cc0.f1251c;
            if (map.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) map.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("Native module ", name, " tried to override ");
                    sbM26240q.append(moduleHolder2.getClassName());
                    sbM26240q.append(". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                    throw new IllegalStateException(sbM26240q.toString());
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

    /* renamed from: a */
    public final void m6632a(LK0 lk0) {
        this.f9582r.add(lk0);
    }

    /* renamed from: b */
    public final void m6633b(InterfaceC10255mM0 interfaceC10255mM0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iAddRootView;
        AbstractC3929dS.m17669b("ReactNative");
        if (interfaceC10255mM0.getState().compareAndSet(0, 1)) {
            MT1.m5371b("attachRootViewToInstance");
            UIManager uIManagerM6095f = OZ1.m6095f(this.f9577m, interfaceC10255mM0.getUIManagerType(), true);
            if (uIManagerM6095f == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = interfaceC10255mM0.getAppProperties();
            if (interfaceC10255mM0.getUIManagerType() == 2) {
                iAddRootView = uIManagerM6095f.startSurface(interfaceC10255mM0.getRootViewGroup(), interfaceC10255mM0.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), interfaceC10255mM0.getWidthMeasureSpec(), interfaceC10255mM0.getHeightMeasureSpec());
                interfaceC10255mM0.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerM6095f.addRootView(interfaceC10255mM0.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                interfaceC10255mM0.setRootViewTag(iAddRootView);
                ((ReactRootView) interfaceC10255mM0).m10915k();
            }
            MT1.m5370a(iAddRootView, "pre_rootView.onAttachedToReactInstance");
            UiThreadUtil.runOnUiThread(new RunnableC6246ja(iAddRootView, interfaceC10255mM0));
            Trace.endSection();
        }
    }

    /* renamed from: c */
    public final BridgeReactContext m6634c(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        AbstractC3929dS.m17669b("ReactNative");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f9578n);
        JSExceptionHandler jSExceptionHandler = this.f9586v;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f9573i;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        ArrayList arrayList = this.f9572h;
        CC0 cc0 = new CC0(bridgeReactContext);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f9572h) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ZL0 zl0 = (ZL0) it.next();
                    MT1.m5371b("createAndProcessCustomReactPackage");
                    try {
                        m6631l(zl0, cc0);
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
        MT1.m5371b("buildNativeModuleRegistry");
        try {
            NativeModuleRegistry nativeModuleRegistry = new NativeModuleRegistry((BridgeReactContext) cc0.f1250b, (HashMap) cc0.f1251c);
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
            CatalystInstanceImpl.Builder jSExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(nativeModuleRegistry).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler);
            if (this.f9581q == null && InspectorFlags.getFuseboxEnabled()) {
                this.f9581q = new ReactInstanceManagerInspectorTarget(new PK0(this));
            }
            CatalystInstanceImpl.Builder inspectorTarget = jSExceptionHandler2.setInspectorTarget(this.f9581q);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
            MT1.m5371b("createCatalystInstance");
            try {
                CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
                Trace.endSection();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
                bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
                catalystInstanceImplBuild.getRuntimeScheduler();
                UIManagerProvider uIManagerProvider = this.f9587w;
                if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                    uIManagerCreateUIManager.initialize();
                    catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                }
                ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
                MT1.m5371b("runJSBundle");
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

    /* renamed from: d */
    public final void m6635d() {
        AbstractC3929dS.m17669b("QK0");
        UiThreadUtil.assertOnUiThread();
        if (this.f9583s) {
            return;
        }
        this.f9583s = true;
        m6643n();
    }

    /* renamed from: f */
    public final ReactContext m6636f() {
        ReactApplicationContext reactApplicationContext;
        synchronized (this.f9576l) {
            reactApplicationContext = this.f9577m;
        }
        return reactApplicationContext;
    }

    /* renamed from: g */
    public final List m6637g(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        MT1.m5371b("createAllViewManagers");
        try {
            if (this.f9588x == null) {
                synchronized (this.f9572h) {
                    try {
                        if (this.f9588x == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.f9572h.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((ZL0) it.next()).createViewManagers(reactApplicationContext));
                            }
                            this.f9588x = arrayList;
                            Trace.endSection();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } finally {
                    }
                }
            }
            ArrayList arrayList2 = this.f9588x;
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return arrayList2;
        } catch (Throwable th) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    /* renamed from: h */
    public final Collection m6638h() {
        HashSet hashSet;
        MT1.m5371b("ReactInstanceManager.getViewManagerNames");
        try {
            HashSet hashSet2 = this.f9570f;
            if (hashSet2 != null) {
                return hashSet2;
            }
            synchronized (this.f9576l) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) m6636f();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.f9572h) {
                        try {
                            if (this.f9570f == null) {
                                HashSet hashSet3 = new HashSet();
                                Iterator it = this.f9572h.iterator();
                                while (it.hasNext()) {
                                    ZL0 zl0 = (ZL0) it.next();
                                    new ArrayList().add("Package: " + zl0.getClass().getSimpleName().toString());
                                    MT1.m5371b("ReactInstanceManager.getViewManagerName".concat(""));
                                    if (zl0 instanceof InterfaceC7595Fk1) {
                                        Collection viewManagerNames = ((InterfaceC7595Fk1) zl0).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet3.addAll(viewManagerNames);
                                        }
                                    } else {
                                        AbstractC3929dS.m17684q("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", zl0.getClass().getSimpleName());
                                    }
                                    Trace.endSection();
                                }
                                this.f9570f = hashSet3;
                            }
                            hashSet = this.f9570f;
                        } finally {
                        }
                    }
                    return hashSet;
                }
                AbstractC3929dS.m17683p("ReactNative");
                return Collections.emptyList();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: i */
    public void m6639i(Exception exc) {
        this.f9573i.handleException(exc);
    }

    /* renamed from: j */
    public final void m6640j() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC7189yF interfaceC7189yF = this.f9579o;
        if (interfaceC7189yF != null) {
            interfaceC7189yF.mo5330a();
        }
    }

    /* renamed from: k */
    public final synchronized void m6641k(boolean z) {
        try {
            ReactContext reactContextM6636f = m6636f();
            if (reactContextM6636f != null && (z || this.f9566b == LifecycleState.f17892b || this.f9566b == LifecycleState.f17891a)) {
                reactContextM6636f.onHostResume(this.f9580p);
            }
            this.f9566b = LifecycleState.f17893c;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public final void m6642m() {
        AbstractC3929dS.m17669b("QK0");
        O90.m5968f(UJ0.f11732a, "tag");
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f9569e;
        JSBundleLoader jSBundleLoader = this.mBundleLoader;
        AbstractC3929dS.m17669b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        C0827N8 c0827n8 = new C0827N8(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f9568d == null) {
            m6645p(c0827n8);
        } else {
            this.f9567c = c0827n8;
        }
    }

    /* renamed from: n */
    public final void m6643n() {
        AbstractC3929dS.m17669b("QK0");
        O90.m5968f(UJ0.f11732a, "tag");
        UiThreadUtil.assertOnUiThread();
        if (!this.f9574j || this.f9571g == null) {
            m6642m();
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1529YI sharedPreferencesOnSharedPreferenceChangeListenerC1529YIMo4912a = this.f9573i.mo4912a();
        if (this.mBundleLoader == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new MD0(new C8342Tu0(this, 24, sharedPreferencesOnSharedPreferenceChangeListenerC1529YIMo4912a), 10, sharedPreferencesOnSharedPreferenceChangeListenerC1529YIMo4912a));
    }

    /* renamed from: o */
    public final void m6644o(LK0 lk0) {
        this.f9582r.remove(lk0);
    }

    /* renamed from: p */
    public final void m6645p(C0827N8 c0827n8) {
        AbstractC3929dS.m17669b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f9565a) {
            synchronized (this.f9576l) {
                try {
                    if (this.f9577m != null) {
                        m6647r(this.f9577m);
                        this.f9577m = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f9568d = new Thread(null, new MD0(this, 8, c0827n8), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f9568d.start();
    }

    /* renamed from: q */
    public final void m6646q(BridgeReactContext bridgeReactContext) {
        AbstractC3929dS.m17669b("ReactNative");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        MT1.m5371b("setupReactContext");
        synchronized (this.f9565a) {
            try {
                synchronized (this.f9576l) {
                    this.f9577m = bridgeReactContext;
                }
                CatalystInstance catalystInstance = bridgeReactContext.getCatalystInstance();
                UN1.m7999c(catalystInstance);
                catalystInstance.initialize();
                this.f9573i.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f9585u.f45133a;
                if (!copyOnWriteArrayList.contains(catalystInstance)) {
                    copyOnWriteArrayList.add(catalystInstance);
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.f9565a.iterator();
                while (it.hasNext()) {
                    m6633b((InterfaceC10255mM0) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        UiThreadUtil.runOnUiThread(new RunnableC8176Qp0(this, (LK0[]) this.f9582r.toArray(new LK0[this.f9582r.size()]), bridgeReactContext, 3));
        bridgeReactContext.runOnJSQueueThread(new RunnableC0004A3(5));
        bridgeReactContext.runOnNativeModulesQueueThread(new RunnableC0004A3(6));
        Trace.endSection();
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    /* renamed from: r */
    public final void m6647r(ReactApplicationContext reactApplicationContext) {
        AbstractC3929dS.m17669b("ReactNative");
        UiThreadUtil.assertOnUiThread();
        if (this.f9566b == LifecycleState.f17893c) {
            reactApplicationContext.onHostPause();
        }
        synchronized (this.f9565a) {
            try {
                Iterator it = this.f9565a.iterator();
                while (it.hasNext()) {
                    m6630e((InterfaceC10255mM0) it.next(), reactApplicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ComponentCallbacks2C11594wq0 componentCallbacks2C11594wq0 = this.f9585u;
        componentCallbacks2C11594wq0.f45133a.remove(reactApplicationContext.getCatalystInstance());
        reactApplicationContext.destroy();
        this.f9573i.getClass();
    }
}

package com.facebook.react.uimanager;

import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.C1930a;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC10272mU1;
import p000.AbstractC10639pM0;
import p000.AbstractC10889rJ0;
import p000.AbstractC11153tN0;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC7751Ik1;
import p000.AbstractC7917Lp1;
import p000.C10038kf1;
import p000.C10294mf1;
import p000.C10339n11;
import p000.C10550of1;
import p000.C10678pf1;
import p000.C10806qf1;
import p000.C10910rT1;
import p000.C10934rf1;
import p000.C11062sf1;
import p000.C11190tf1;
import p000.C11287uQ0;
import p000.C11573wf1;
import p000.C11827yf1;
import p000.C1565Ys;
import p000.C8581Yj1;
import p000.C8623Ze1;
import p000.C8753af1;
import p000.C8810b60;
import p000.C8881bf1;
import p000.C9654hf1;
import p000.C9782if1;
import p000.CC0;
import p000.ComponentCallbacks2C7803Jk1;
import p000.ComponentCallbacks2C9142df1;
import p000.DM0;
import p000.EM0;
import p000.EnumC10323mu0;
import p000.InterfaceC10255mM0;
import p000.InterfaceC6947uP;
import p000.InterfaceC7855Kk1;
import p000.InterfaceC8344Tv0;
import p000.InterfaceC8571Ye1;
import p000.InterfaceC9009cf1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9270ef1;
import p000.MJ0;
import p000.MT1;
import p000.NM0;
import p000.O90;
import p000.OZ1;
import p000.R02;
import p000.RZ1;
import p000.RunnableC1420WZ;
import p000.S91;
import p000.SZ1;
import p000.UJ0;
import p000.UN1;
import p000.XZ1;

@InterfaceC9101dL0(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG;
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final InterfaceC6947uP mEventDispatcher;
    private final List<InterfaceC9270ef1> mListeners;
    private final ComponentCallbacks2C9142df1 mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final C8623Ze1 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final ComponentCallbacks2C7803Jk1 mViewManagerRegistry;

    static {
        O90.m5968f(UJ0.f11735d, "tag");
        DEBUG = false;
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC7855Kk1 interfaceC7855Kk1, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new ComponentCallbacks2C9142df1();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        XZ1.m9090f(reactApplicationContext);
        C1930a c1930a = new C1930a(reactApplicationContext);
        this.mEventDispatcher = c1930a;
        this.mModuleConstants = createConstants(interfaceC7855Kk1);
        this.mCustomDirectEvents = RZ1.m7038c();
        ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1 = new ComponentCallbacks2C7803Jk1(interfaceC7855Kk1);
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
        this.mUIImplementation = new C8623Ze1(reactApplicationContext, componentCallbacks2C7803Jk1, c1930a, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(InterfaceC7855Kk1 interfaceC7855Kk1) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        new ArrayList().add("Lazy: " + Boolean.TRUE.toString());
        MT1.m5371b("CreateUIManagerConstants".concat(""));
        try {
            RZ1.m7037b();
            ((AbstractC10272mU1) interfaceC7855Kk1).getClass();
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
            throw th;
        }
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        CC0 cc0 = new CC0("UIManagerModule.getConstantsForViewManager");
        cc0.m1023I0(viewManager.getName(), "ViewManager");
        cc0.m1023I0(Boolean.TRUE, "Lazy");
        MT1.m5371b(((String) cc0.f1250b).concat(""));
        try {
            return Arguments.makeNativeMap(SZ1.m7394c(viewManager, null, map));
        } finally {
            Trace.endSection();
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null);
    }

    public void addUIBlock(InterfaceC8571Ye1 interfaceC8571Ye1) {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46391h.add(new C11190tf1(c11827yf1, interfaceC8571Ye1));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(InterfaceC9270ef1 interfaceC9270ef1) {
        this.mListeners.add(interfaceC9270ef1);
    }

    @ReactMethod
    public void clearJSResponder() {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46391h.add(new C9654hf1(c11827yf1, 0, 0, true, false));
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46391h.add(new C9782if1(c11827yf1, readableMap, callback));
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        NM0 nm0;
        if (DEBUG) {
            AbstractC3929dS.m17669b("ReactNative");
            O90.m5968f(UJ0.f11735d, "tag");
            O90.m5968f("(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap, "message");
        }
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            synchronized (c8623Ze1.f15070a) {
                try {
                    DM0 dm0CreateShadowNodeInstance = c8623Ze1.f15074e.m4401a(str).createShadowNodeInstance(c8623Ze1.f15072c);
                    DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i2);
                    UN1.m8000d(dm0M24384u, "Root node with tag " + i2 + " doesn't exist");
                    ((EM0) dm0CreateShadowNodeInstance).f2649a = i;
                    ((EM0) dm0CreateShadowNodeInstance).f2650b = str;
                    ((EM0) dm0CreateShadowNodeInstance).f2651c = ((EM0) dm0M24384u).f2649a;
                    S91 s91 = ((EM0) dm0M24384u).f2652d;
                    UN1.m7999c(s91);
                    dm0CreateShadowNodeInstance.mo1654d(s91);
                    C10910rT1 c10910rT1 = c8623Ze1.f15073d;
                    ((C11287uQ0) c10910rT1.f41680d).m25186a();
                    ((SparseArray) c10910rT1.f41678b).put(((EM0) dm0CreateShadowNodeInstance).f2649a, dm0CreateShadowNodeInstance);
                    if (readableMap != null) {
                        nm0 = new NM0(readableMap);
                        ((EM0) dm0CreateShadowNodeInstance).m2177H(nm0);
                    } else {
                        nm0 = null;
                    }
                    c8623Ze1.m9571g(dm0CreateShadowNodeInstance, nm0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        c8623Ze1.getClass();
        if (c8623Ze1.m9568d(i, "dispatchViewManagerCommand: " + i2)) {
            C11827yf1 c11827yf1 = c8623Ze1.f15075f;
            c11827yf1.getClass();
            c11827yf1.f46390g.add(new C10038kf1(c11827yf1, i, i2, readableArray));
        }
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManagerM6095f = OZ1.m6095f(getReactApplicationContext(), R02.m6874b(i), true);
        if (uIManagerM6095f == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManagerM6095f.dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManagerM6095f.dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        float fRound = Math.round(AbstractC11406vL1.m25403b((float) readableArray.getDouble(0)));
        float fRound2 = Math.round(AbstractC11406vL1.m25403b((float) readableArray.getDouble(1)));
        C11827yf1 c11827yf1 = c8623Ze1.f15075f;
        c11827yf1.f46391h.add(new C10550of1(c11827yf1, i, fRound, fRound2, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(AbstractC10889rJ0.m24257d("bubblingEventTypes", RZ1.m7036a(), "directEventTypes", RZ1.m7038c()));
    }

    @Deprecated
    public InterfaceC9009cf1 getDirectEventNamesResolver() {
        return new C10339n11(5, this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.getClass();
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(c11827yf1.f46398o));
        map.put("CommitEndTime", Long.valueOf(c11827yf1.f46399p));
        map.put("LayoutTime", Long.valueOf(c11827yf1.f46400q));
        map.put("DispatchViewUpdatesTime", Long.valueOf(c11827yf1.f46401r));
        map.put("RunStartTime", Long.valueOf(c11827yf1.f46402s));
        map.put("RunEndTime", Long.valueOf(c11827yf1.f46403t));
        map.put("BatchedExecutionTime", Long.valueOf(c11827yf1.f46404u));
        map.put("NonBatchedExecutionTime", Long.valueOf(c11827yf1.f46405v));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(c11827yf1.f46406w));
        map.put("CreateViewCount", Long.valueOf(c11827yf1.f46407x));
        map.put("UpdatePropsCount", Long.valueOf(c11827yf1.f46408y));
        return map;
    }

    @Deprecated
    public C8623Ze1 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ComponentCallbacks2C7803Jk1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.mo11048i((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.mo11047h();
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        c8623Ze1.f15079j = false;
        c8623Ze1.f15074e.m4403c();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        ((C1565Ys) AbstractC7917Lp1.f6883a.getValue()).m9387a();
        AbstractC7751Ik1.m3995a();
    }

    public void invalidateNodeLayout(int i) {
        DM0 dm0M24384u = this.mUIImplementation.f15073d.m24384u(i);
        if (dm0M24384u == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            ((EM0) dm0M24384u).m2180i();
            this.mUIImplementation.m9570f(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        C10910rT1 c10910rT1;
        boolean z;
        ReadableArray readableArray6 = readableArray;
        if (DEBUG) {
            AbstractC3929dS.m17669b("ReactNative");
            O90.m5968f(UJ0.f11735d, "tag");
            O90.m5968f("(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray6 + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5, "message");
        }
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            synchronized (c8623Ze1.f15070a) {
                try {
                    DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i);
                    int size = readableArray6 == null ? 0 : readableArray.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new C8810b60("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new C8810b60("Size of addChildTags != size of addAtIndices!");
                    }
                    int i2 = size + size2;
                    C8581Yj1[] c8581Yj1Arr = new C8581Yj1[i2];
                    int i3 = size + size3;
                    int[] iArr = new int[i3];
                    C8623Ze1 c8623Ze12 = c8623Ze1;
                    int[] iArr2 = new int[i3];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        UN1.m7999c(readableArray);
                        UN1.m7999c(readableArray2);
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = i3;
                            int i6 = readableArray6.getInt(i4);
                            int i7 = ((EM0) dm0M24384u).m2181j(i6).f2649a;
                            c8581Yj1Arr[i4] = new C8581Yj1(i7, readableArray2.getInt(i4));
                            iArr[i4] = i6;
                            iArr2[i4] = i7;
                            i4++;
                            readableArray6 = readableArray;
                            i3 = i5;
                            iArr3 = iArr3;
                            dm0M24384u = dm0M24384u;
                        }
                    }
                    DM0 dm0 = dm0M24384u;
                    int i8 = i3;
                    int[] iArr4 = iArr3;
                    if (size2 > 0) {
                        UN1.m7999c(readableArray3);
                        UN1.m7999c(readableArray4);
                        for (int i9 = 0; i9 < size2; i9++) {
                            c8581Yj1Arr[size + i9] = new C8581Yj1(readableArray3.getInt(i9), readableArray4.getInt(i9));
                        }
                    }
                    if (size3 > 0) {
                        UN1.m7999c(readableArray5);
                        for (int i10 = 0; i10 < size3; i10++) {
                            int i11 = readableArray5.getInt(i10);
                            int i12 = ((EM0) dm0).m2181j(i11).f2649a;
                            int i13 = size + i10;
                            iArr[i13] = i11;
                            iArr2[i13] = i12;
                            iArr4[i10] = i12;
                        }
                    }
                    Arrays.sort(c8581Yj1Arr, C8581Yj1.f14492c);
                    Arrays.sort(iArr);
                    int i14 = -1;
                    for (int i15 = i8 - 1; i15 >= 0; i15--) {
                        int i16 = iArr[i15];
                        if (i16 == i14) {
                            throw new C8810b60("Repeated indices in Removal list for view tag: " + i);
                        }
                        ((EM0) dm0).m2193v(i16);
                        i14 = iArr[i15];
                    }
                    int i17 = 0;
                    while (i17 < i2) {
                        C8581Yj1 c8581Yj1 = c8581Yj1Arr[i17];
                        C8623Ze1 c8623Ze13 = c8623Ze12;
                        DM0 dm0M24384u2 = c8623Ze13.f15073d.m24384u(c8581Yj1.f14493a);
                        if (dm0M24384u2 == null) {
                            throw new C8810b60("Trying to add unknown view tag: " + c8581Yj1.f14493a);
                        }
                        DM0 dm02 = dm0;
                        dm02.mo1656f(dm0M24384u2, c8581Yj1.f14494b);
                        i17++;
                        c8623Ze12 = c8623Ze13;
                        dm0 = dm02;
                    }
                    C8623Ze1 c8623Ze14 = c8623Ze12;
                    DM0 dm03 = dm0;
                    C10910rT1 c10910rT12 = c8623Ze14.f15076g;
                    c10910rT12.getClass();
                    int i18 = 0;
                    while (true) {
                        c10910rT1 = (C10910rT1) c10910rT12.f41679c;
                        int i19 = i8;
                        if (i18 >= i19) {
                            break;
                        }
                        int i20 = iArr2[i18];
                        int i21 = 0;
                        while (true) {
                            if (i21 >= size3) {
                                z = false;
                                break;
                            } else {
                                if (iArr4[i21] == i20) {
                                    z = true;
                                    break;
                                }
                                i21++;
                            }
                        }
                        c10910rT12.m24371F(c10910rT1.m24384u(i20), z);
                        i18++;
                        i8 = i19;
                    }
                    for (int i22 = 0; i22 < i2; i22++) {
                        C8581Yj1 c8581Yj12 = c8581Yj1Arr[i22];
                        c10910rT12.m24378d(dm03, c10910rT1.m24384u(c8581Yj12.f14493a), c8581Yj12.f14494b);
                    }
                    for (int i23 = 0; i23 < size3; i23++) {
                        DM0 dm0M24384u3 = c8623Ze14.f15073d.m24384u(iArr4[i23]);
                        c8623Ze14.m9574j(dm0M24384u3);
                        YogaNodeJNIBase yogaNodeJNIBase = ((EM0) dm0M24384u3).f2669u;
                        if (yogaNodeJNIBase != null) {
                            yogaNodeJNIBase.m11101n();
                            ((C1565Ys) AbstractC7917Lp1.f6883a.getValue()).mo4580d(yogaNodeJNIBase);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            C11827yf1 c11827yf1 = c8623Ze1.f15075f;
            c11827yf1.f46391h.add(new C10678pf1(c11827yf1, i, callback, 1));
        }
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            C11827yf1 c11827yf1 = c8623Ze1.f15075f;
            c11827yf1.f46391h.add(new C10678pf1(c11827yf1, i, callback, 0));
        }
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            try {
                c8623Ze1.m9572h(i, i2, c8623Ze1.f15077h);
                callback2.invoke(Float.valueOf(AbstractC11406vL1.m25402a(c8623Ze1.f15077h[0])), Float.valueOf(AbstractC11406vL1.m25402a(c8623Ze1.f15077h[1])), Float.valueOf(AbstractC11406vL1.m25402a(c8623Ze1.f15077h[2])), Float.valueOf(AbstractC11406vL1.m25402a(c8623Ze1.f15077h[3])));
            } catch (C8810b60 e) {
                callback.invoke(e.getMessage());
            }
        }
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        new ArrayList().add("BatchId: " + String.valueOf(i));
        MT1.m5371b("onBatchCompleteUI".concat(""));
        Iterator<InterfaceC9270ef1> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.f15075f.f46385b.getRootViewNum() > 0) {
                this.mUIImplementation.m9570f(i);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.getClass();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46394k = false;
        MJ0.m5303a().m5306d(2, c11827yf1.f46388e);
        c11827yf1.m26214c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46394k = true;
        if (ReactFeatureFlags.enableFabricRendererExclusively) {
            return;
        }
        MJ0.m5303a().m5305c(2, c11827yf1.f46388e);
    }

    public void prependUIBlock(InterfaceC8571Ye1 interfaceC8571Ye1) {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46391h.add(0, new C11190tf1(c11827yf1, interfaceC8571Ye1));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46396m = true;
        c11827yf1.f46398o = 0L;
        c11827yf1.f46407x = 0L;
        c11827yf1.f46408y = 0L;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        synchronized (c8623Ze1.f15070a) {
            c8623Ze1.f15073d.m24372G(i);
        }
        C11827yf1 c11827yf1 = c8623Ze1.f15075f;
        c11827yf1.f46391h.add(new C10806qf1(c11827yf1, i));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(InterfaceC9270ef1 interfaceC9270ef1) {
        this.mListeners.remove(interfaceC9270ef1);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        if (i % 10 == 1) {
            return i;
        }
        C10910rT1 c10910rT1 = this.mUIImplementation.f15073d;
        ((C11287uQ0) c10910rT1.f41680d).m25186a();
        if (((SparseBooleanArray) c10910rT1.f41679c).get(i)) {
            return i;
        }
        DM0 dm0M24384u = c10910rT1.m24384u(i);
        if (dm0M24384u == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return 0;
        }
        EM0 em0 = (EM0) dm0M24384u;
        UN1.m7997a(em0.f2651c != 0);
        return em0.f2651c;
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.f15075f.f46385b.resolveView(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int iM6874b = R02.m6874b(i);
        if (iM6874b != 2) {
            C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
            c11827yf1.f46391h.add(new C10934rf1(c11827yf1, i, i2));
        } else {
            UIManager uIManagerM6095f = OZ1.m6095f(getReactApplicationContext(), iM6874b, true);
            if (uIManagerM6095f != null) {
                uIManagerM6095f.sendAccessibilityEvent(i, i2);
            }
        }
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            AbstractC3929dS.m17669b("ReactNative");
            O90.m5968f(UJ0.f11735d, "tag");
            O90.m5968f("(UIManager.setChildren) tag: " + i + ", children: " + readableArray, "message");
        }
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            synchronized (c8623Ze1.f15070a) {
                try {
                    DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i);
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        DM0 dm0M24384u2 = c8623Ze1.f15073d.m24384u(readableArray.getInt(i2));
                        if (dm0M24384u2 == null) {
                            throw new C8810b60("Trying to add unknown view tag: " + readableArray.getInt(i2));
                        }
                        dm0M24384u.mo1656f(dm0M24384u2, i2);
                    }
                    C10910rT1 c10910rT1 = c8623Ze1.f15076g;
                    c10910rT1.getClass();
                    for (int i3 = 0; i3 < readableArray.size(); i3++) {
                        c10910rT1.m24378d(dm0M24384u, ((C10910rT1) c10910rT1.f41679c).m24384u(readableArray.getInt(i3)), i3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i);
        if (dm0M24384u == null) {
            return;
        }
        while (true) {
            EM0 em0 = (EM0) dm0M24384u;
            if (em0.m2183l() != EnumC10323mu0.f37987c) {
                int i2 = em0.f2649a;
                C11827yf1 c11827yf1 = c8623Ze1.f15075f;
                c11827yf1.f46391h.add(new C9654hf1(c11827yf1, i2, i, false, z));
                return;
            }
            dm0M24384u = em0.f2656h;
        }
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        C11827yf1 c11827yf1 = this.mUIImplementation.f15075f;
        c11827yf1.f46391h.add(new C11062sf1(c11827yf1, z));
    }

    public void setViewHierarchyUpdateDebugListener(InterfaceC8344Tv0 interfaceC8344Tv0) {
        this.mUIImplementation.f15075f.getClass();
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new C8753af1(this, reactApplicationContext, i, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        NM0 nm0 = new NM0(readableMap);
        c8623Ze1.getClass();
        UiThreadUtil.assertOnUiThread();
        c8623Ze1.f15075f.f46385b.updateProperties(i, nm0);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i);
        if (dm0M24384u == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        EM0 em0 = (EM0) dm0M24384u;
        YogaNative.jni_YGNodeStyleSetWidthJNI(em0.f2669u.f17997e, i2);
        YogaNative.jni_YGNodeStyleSetHeightJNI(em0.f2669u.f17997e, i3);
        C11827yf1 c11827yf1 = c8623Ze1.f15075f;
        if (c11827yf1.f46391h.isEmpty() && c11827yf1.f46390g.isEmpty()) {
            c8623Ze1.m9570f(-1);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new C8881bf1(this, reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            AbstractC3929dS.m17669b("ReactNative");
            O90.m5968f(UJ0.f11735d, "tag");
            O90.m5968f("(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap, "message");
        }
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        if (c8623Ze1.f15079j) {
            c8623Ze1.f15074e.m4401a(str);
            DM0 dm0M24384u = c8623Ze1.f15073d.m24384u(i);
            if (dm0M24384u == null) {
                throw new C8810b60(AbstractC11153tN0.m24909u(i, "Trying to update non-existent view with tag "));
            }
            if (readableMap != null) {
                NM0 nm0 = new NM0(readableMap);
                EM0 em0 = (EM0) dm0M24384u;
                em0.m2177H(nm0);
                if (dm0M24384u.mo1653c()) {
                    return;
                }
                C10910rT1 c10910rT1 = c8623Ze1.f15076g;
                c10910rT1.getClass();
                if (em0.f2658j && !C10910rT1.m24362B(nm0)) {
                    c10910rT1.m24374I(dm0M24384u, nm0);
                } else {
                    if (em0.f2658j) {
                        return;
                    }
                    int i2 = em0.f2649a;
                    C11827yf1 c11827yf1 = (C11827yf1) c10910rT1.f41678b;
                    c11827yf1.f46408y++;
                    c11827yf1.f46391h.add(new C11573wf1(c11827yf1, i2, nm0, 0));
                }
            }
        }
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        boolean z;
        C10910rT1 c10910rT1 = this.mUIImplementation.f15073d;
        DM0 dm0M24384u = c10910rT1.m24384u(i);
        DM0 dm0M24384u2 = c10910rT1.m24384u(i2);
        if (dm0M24384u == null || dm0M24384u2 == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        EM0 em0 = (EM0) dm0M24384u2;
        EM0 em02 = ((EM0) dm0M24384u).f2656h;
        while (true) {
            if (em02 == null) {
                z = false;
                break;
            } else {
                if (em02 == em0) {
                    z = true;
                    break;
                }
                em02 = em02.f2656h;
            }
        }
        callback.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap) {
        MT1.m5371b("UIManagerModule.addRootView");
        int iM23746b = AbstractC10639pM0.m23746b();
        S91 s91 = new S91(getReactApplicationContext(), t.getContext(), ((InterfaceC10255mM0) t).getSurfaceID(), -1);
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        synchronized (c8623Ze1.f15070a) {
            EM0 em0M9569e = c8623Ze1.m9569e();
            em0M9569e.f2649a = iM23746b;
            em0M9569e.f2652d = s91;
            s91.runOnNativeModulesQueueThread(new RunnableC1420WZ(c8623Ze1, em0M9569e, false, 18));
            c8623Ze1.f15075f.f46385b.addRootView(iM23746b, t);
        }
        Trace.endSection();
        return iM23746b;
    }

    @Override // com.facebook.react.bridge.UIManager
    public InterfaceC6947uP getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i2, str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        C8623Ze1 c8623Ze1 = this.mUIImplementation;
        c8623Ze1.getClass();
        if (c8623Ze1.m9568d(i, "dispatchViewManagerCommand: " + str)) {
            C11827yf1 c11827yf1 = c8623Ze1.f15075f;
            c11827yf1.getClass();
            c11827yf1.f46390g.add(new C10294mf1(c11827yf1, i, str, readableArray));
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManager;
        ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1 = this.mUIImplementation.f15074e;
        synchronized (componentCallbacks2C7803Jk1) {
            viewManager = (ViewManager) componentCallbacks2C7803Jk1.f5681a.get(str);
            if (viewManager == null) {
                viewManager = null;
            }
        }
        if (viewManager == null) {
            return null;
        }
        return getConstantsForViewManager(viewManager, this.mCustomDirectEvents);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new ComponentCallbacks2C9142df1();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        XZ1.m9090f(reactApplicationContext);
        C1930a c1930a = new C1930a(reactApplicationContext);
        this.mEventDispatcher = c1930a;
        HashMap map = new HashMap();
        this.mCustomDirectEvents = map;
        this.mModuleConstants = createConstants(list, null, map);
        ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1 = new ComponentCallbacks2C7803Jk1(list);
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
        this.mUIImplementation = new C8623Ze1(reactApplicationContext, componentCallbacks2C7803Jk1, c1930a, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        new ArrayList().add("Lazy: " + Boolean.FALSE.toString());
        MT1.m5371b("CreateUIManagerConstants".concat(""));
        try {
            return SZ1.m7393b(list, map, map2);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }
}

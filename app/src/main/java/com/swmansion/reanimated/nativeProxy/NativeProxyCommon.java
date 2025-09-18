package com.swmansion.reanimated.nativeProxy;

import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.BuildConfig;
import com.swmansion.reanimated.DevMenuUtils;
import com.swmansion.reanimated.NativeProxy;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.Utils;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import com.swmansion.worklets.WorkletsModule;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;
import p000.C7754Im0;
import p000.InterfaceC0965PK;
import p000.U00;

/* loaded from: classes2.dex */
public abstract class NativeProxyCommon {
    private final U00 gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected NodesManager mNodesManager;
    protected final WorkletsModule mWorkletsModule;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;

    static {
        SoLoader.m11076j("reanimated");
    }

    public NativeProxyCommon(ReactApplicationContext reactApplicationContext) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        U00 u00 = null;
        ReanimatedModule reanimatedModule = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mWorkletsModule = reanimatedModule.getWorkletsModule();
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            u00 = (U00) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = u00;
    }

    private void addDevMenuOption() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new C7754Im0(13));
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            hashSet.add((String) arrayList.get(i));
        }
        return hashSet;
    }

    private void toggleSlowAnimations() {
        boolean z = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z;
        if (!z) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
    }

    public void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (!this.cppVersion.equals(reanimatedJavaVersion)) {
            throw new RuntimeException(AbstractC1374Vq.m8593l(AbstractC7222ym.m26240q("[Reanimated] Mismatch between Java code version and C++ code version (", reanimatedJavaVersion, " vs. "), this.cppVersion, " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information."));
        }
    }

    @InterfaceC0965PK
    public void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    @InterfaceC0965PK
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mNodesManager.dispatchCommand(i, str, readableArray);
    }

    @InterfaceC0965PK
    public long getAnimationTimestamp() {
        if (!this.slowAnimationsEnabled) {
            return SystemClock.uptimeMillis();
        }
        return ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) + this.firstUptime.longValue();
    }

    public abstract HybridData getHybridData();

    @InterfaceC0965PK
    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    @InterfaceC0965PK
    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    public native void installJSIBindings();

    @InterfaceC0965PK
    public void maybeFlushUIUpdatesQueue() throws InterruptedException {
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperations();
    }

    @InterfaceC0965PK
    public float[] measure(int i) {
        return this.mNodesManager.measure(i);
    }

    @InterfaceC0965PK
    public String obtainProp(int i, String str) {
        return this.mNodesManager.obtainProp(i, str);
    }

    public void prepareLayoutAnimations(LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            return;
        }
        ReanimatedModule reanimatedModule = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule);
        this.mNodesManager = reanimatedModule.getNodesManager();
        ReanimatedModule reanimatedModule2 = (ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class);
        Objects.requireNonNull(reanimatedModule2);
        reanimatedModule2.getNodesManager().getAnimationsManager().setNativeMethods(NativeProxy.createNativeMethodsHolder(layoutAnimations));
    }

    @InterfaceC0965PK
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @InterfaceC0965PK
    public int registerSensor(int i, int i2, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i), i2, sensorSetter);
    }

    @InterfaceC0965PK
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @InterfaceC0965PK
    public void scrollTo(int i, double d, double d2, boolean z) {
        this.mNodesManager.scrollTo(i, d, d2, z);
    }

    @InterfaceC0965PK
    public void setCppVersion(String str) {
        this.cppVersion = str;
    }

    @InterfaceC0965PK
    public void setGestureState(int i, int i2) {
        U00 u00 = this.gestureHandlerStateManager;
        if (u00 != null) {
            u00.setGestureHandlerState(i, i2);
        }
    }

    @InterfaceC0965PK
    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z, boolean z2) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z, z2);
    }

    @InterfaceC0965PK
    public void unregisterSensor(int i) {
        this.reanimatedSensorContainer.unregisterSensor(i);
    }

    @InterfaceC0965PK
    public void unsubscribeFromKeyboardEvents(int i) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i);
    }

    @InterfaceC0965PK
    public void updateProps(int i, Map<String, Object> map) {
        this.mNodesManager.updateProps(i, map);
    }
}

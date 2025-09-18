package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.nativeProxy.NoopEventHandler;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC11406vL1;
import p000.AbstractC6550oP;
import p000.AbstractC7222ym;
import p000.AbstractChoreographerFrameCallbackC9317f20;
import p000.C0267EE;
import p000.C11827yf1;
import p000.C8623Ze1;
import p000.C8810b60;
import p000.DM0;
import p000.EM0;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.InterfaceC9009cf1;
import p000.MJ0;
import p000.NM0;
import p000.OZ1;
import p000.RunnableC1096RQ;
import p000.UN1;

/* loaded from: classes2.dex */
public class NodesManager implements InterfaceC7136xP {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ReaCompatibility compatibility;
    private double lastFrameTimeMs;
    private final AnimationsManager mAnimationManager;
    private int mAnimationsDragFactor;
    private final AbstractChoreographerFrameCallbackC9317f20 mChoreographerCallback;
    private final ReactContext mContext;
    protected final InterfaceC9009cf1 mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private NativeProxy mNativeProxy;
    private final MJ0 mReactChoreographer;
    private final C8623Ze1 mUIImplementation;
    private final UIManager mUIManager;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;
    private Long mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean mSlowAnimationsEnabled = false;
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private RCTEventEmitter mCustomEventHandler = new NoopEventHandler();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();
    public Set<String> uiProps = Collections.emptySet();
    public Set<String> nativeProps = Collections.emptySet();
    private Queue<NativeUpdateOperation> mOperationsInBatch = new LinkedList();
    private boolean mTryRunBatchUpdatesSynchronously = false;

    /* renamed from: com.swmansion.reanimated.NodesManager$1 */
    public class C24071 extends GuardedRunnable {
        final /* synthetic */ ReadableArray val$commandArgs;
        final /* synthetic */ String val$commandId;
        final /* synthetic */ int val$viewTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24071(JSExceptionHandler jSExceptionHandler, int i, String str, ReadableArray readableArray) {
            super(jSExceptionHandler);
            i = i;
            str = str;
            readableArray = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            NodesManager.this.mUIManager.dispatchCommand(i, str, readableArray);
        }
    }

    /* renamed from: com.swmansion.reanimated.NodesManager$2 */
    public class C24082 extends AbstractChoreographerFrameCallbackC9317f20 {
        public C24082(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // p000.AbstractChoreographerFrameCallbackC9317f20
        public void doFrameGuarded(long j) throws InterruptedException {
            NodesManager.this.onAnimationFrame(j);
        }
    }

    /* renamed from: com.swmansion.reanimated.NodesManager$3 */
    public class C24093 extends GuardedRunnable {
        final /* synthetic */ Queue val$copiedOperationsQueue;
        final /* synthetic */ Semaphore val$semaphore;
        final /* synthetic */ boolean val$trySynchronously;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24093(JSExceptionHandler jSExceptionHandler, boolean z, Semaphore semaphore, Queue queue) {
            super(jSExceptionHandler);
            z = z;
            semaphore = semaphore;
            queue = queue;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            C11827yf1 c11827yf1 = NodesManager.this.mUIImplementation.f15075f;
            boolean z = false;
            boolean z2 = c11827yf1.f46391h.isEmpty() && c11827yf1.f46390g.isEmpty();
            if (z && z2) {
                z = true;
            }
            if (!z) {
                semaphore.release();
            }
            while (!queue.isEmpty()) {
                NativeUpdateOperation nativeUpdateOperation = (NativeUpdateOperation) queue.remove();
                DM0 dm0M24384u = NodesManager.this.mUIImplementation.f15073d.m24384u(nativeUpdateOperation.mViewTag);
                if (dm0M24384u != null) {
                    UIManagerModule uIManagerModule = (UIManagerModule) NodesManager.this.mUIManager;
                    int i = nativeUpdateOperation.mViewTag;
                    String str = ((EM0) dm0M24384u).f2650b;
                    UN1.m7999c(str);
                    uIManagerModule.updateView(i, str, nativeUpdateOperation.mNativeProps);
                }
            }
            if (z2) {
                NodesManager.this.mUIImplementation.m9570f(-1);
            }
            if (z) {
                semaphore.release();
            }
        }
    }

    /* renamed from: com.swmansion.reanimated.NodesManager$4 */
    public static /* synthetic */ class C24104 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final class NativeUpdateOperation {
        public WritableMap mNativeProps;
        public int mViewTag;

        public NativeUpdateOperation(int i, WritableMap writableMap) {
            this.mViewTag = i;
            this.mNativeProps = writableMap;
        }
    }

    public interface OnAnimationFrame {
        void onAnimationFrame(double d);
    }

    public NodesManager(ReactContext reactContext, WorkletsModule workletsModule) {
        this.mUnsubscribe = null;
        this.mContext = reactContext;
        this.mWorkletsModule = workletsModule;
        UIManager uIManagerM6095f = OZ1.m6095f(reactContext, 1, true);
        this.mUIManager = uIManagerM6095f;
        this.mUIImplementation = uIManagerM6095f instanceof UIManagerModule ? ((UIManagerModule) uIManagerM6095f).getUIImplementation() : null;
        Objects.requireNonNull(uIManagerM6095f);
        this.mCustomEventNamesResolver = new C0267EE(28, uIManagerM6095f);
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = MJ0.m5303a();
        this.mChoreographerCallback = new AbstractChoreographerFrameCallbackC9317f20(reactContext) { // from class: com.swmansion.reanimated.NodesManager.2
            public C24082(ReactContext reactContext2) {
                super(reactContext2);
            }

            @Override // p000.AbstractChoreographerFrameCallbackC9317f20
            public void doFrameGuarded(long j) throws InterruptedException {
                NodesManager.this.onAnimationFrame(j);
            }
        };
        InterfaceC6947uP interfaceC6947uPM6090a = OZ1.m6090a(reactContext2, 1);
        Objects.requireNonNull(interfaceC6947uPM6090a);
        interfaceC6947uPM6090a.mo11049j(this);
        this.mUnsubscribe = new RunnableC1096RQ(this, 20, interfaceC6947uPM6090a);
        this.mAnimationManager = new AnimationsManager(reactContext2, uIManagerM6095f);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof ReadableArray) {
            if (obj instanceof WritableArray) {
                writableMap.putArray(str, (ReadableArray) obj);
                return;
            } else {
                writableMap.putArray(str, copyReadableArray((ReadableArray) obj));
                return;
            }
        }
        if (!(obj instanceof ReadableMap)) {
            throw new IllegalStateException("[Reanimated] Unknown type of animated value.");
        }
        if (obj instanceof WritableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            writableMap.putMap(str, copyReadableMap((ReadableMap) obj));
        }
    }

    private static WritableArray copyReadableArray(ReadableArray readableArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C24104.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    writableArrayCreateArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 2:
                    writableArrayCreateArray.pushString(readableArray.getString(i));
                    break;
                case 3:
                    writableArrayCreateArray.pushNull();
                    break;
                case 4:
                    writableArrayCreateArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 5:
                    writableArrayCreateArray.pushMap(copyReadableMap(readableArray.getMap(i)));
                    break;
                case 6:
                    writableArrayCreateArray.pushArray(copyReadableArray(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalStateException("[Reanimated] Unknown type of ReadableArray.");
            }
        }
        return writableArrayCreateArray;
    }

    private static WritableMap copyReadableMap(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }

    private void handleEvent(AbstractC6550oP abstractC6550oP) {
        abstractC6550oP.dispatch(this.mCustomEventHandler);
    }

    public /* synthetic */ void lambda$new$0(InterfaceC6947uP interfaceC6947uP) {
        interfaceC6947uP.mo11040a(this);
    }

    public void onAnimationFrame(long j) throws InterruptedException {
        double dLongValue = j / 1000000.0d;
        if (this.mSlowAnimationsEnabled) {
            dLongValue = ((dLongValue - this.mFirstUptime.longValue()) / this.mAnimationsDragFactor) + this.mFirstUptime.longValue();
        }
        if (dLongValue > this.lastFrameTimeMs) {
            this.lastFrameTimeMs = dLongValue;
            while (!this.mEventQueue.isEmpty()) {
                CopiedEvent copiedEventPoll = this.mEventQueue.poll();
                handleEvent(copiedEventPoll.getTargetTag(), copiedEventPoll.getEventName(), copiedEventPoll.getPayload());
            }
            if (!this.mFrameCallbacks.isEmpty()) {
                List<OnAnimationFrame> list = this.mFrameCallbacks;
                this.mFrameCallbacks = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).onAnimationFrame(dLongValue);
                }
            }
            performOperations();
        }
        this.mCallbackPosted.set(false);
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.m5306d(3, this.mChoreographerCallback);
        }
    }

    public void configureProps(Set<String> set, Set<String> set2) {
        this.uiProps = set;
        this.nativeProps = set2;
    }

    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.NodesManager.1
            final /* synthetic */ ReadableArray val$commandArgs;
            final /* synthetic */ String val$commandId;
            final /* synthetic */ int val$viewTag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24071(JSExceptionHandler jSExceptionHandler, int i2, String str2, ReadableArray readableArray2) {
                super(jSExceptionHandler);
                i = i2;
                str = str2;
                readableArray = readableArray2;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                NodesManager.this.mUIManager.dispatchCommand(i, str, readableArray);
            }
        });
    }

    public void enableSlowAnimations(boolean z, int i) {
        this.mSlowAnimationsEnabled = z;
        this.mAnimationsDragFactor = i;
        if (z) {
            this.mFirstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void enqueueUpdateViewOnNativeThread(int i, WritableMap writableMap, boolean z) {
        if (z) {
            this.mTryRunBatchUpdatesSynchronously = true;
        }
        this.mOperationsInBatch.add(new NativeUpdateOperation(i, writableMap));
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationManager;
    }

    public InterfaceC9009cf1 getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public void initWithContext(ReactApplicationContext reactApplicationContext) {
        this.mNativeProxy = new NativeProxy(reactApplicationContext, this.mWorkletsModule);
        this.mAnimationManager.setAndroidUIScheduler(this.mWorkletsModule.getAndroidUIScheduler());
        ReaCompatibility reaCompatibility = new ReaCompatibility(reactApplicationContext);
        this.compatibility = reaCompatibility;
        reaCompatibility.registerFabricEventListener(this);
    }

    public void invalidate() {
        AnimationsManager animationsManager = this.mAnimationManager;
        if (animationsManager != null) {
            animationsManager.invalidate();
        }
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.invalidate();
            this.mNativeProxy = null;
        }
        ReaCompatibility reaCompatibility = this.compatibility;
        if (reaCompatibility != null) {
            reaCompatibility.unregisterFabricEventListener(this);
        }
        Runnable runnable = this.mUnsubscribe;
        if (runnable != null) {
            runnable.run();
            this.mUnsubscribe = null;
        }
    }

    public boolean isAnimationRunning() {
        return this.mCallbackPosted.get();
    }

    public float[] measure(int i) {
        try {
            return NativeMethodsHelper.measure(this.mUIManager.resolveView(i));
        } catch (C8810b60 e) {
            e.printStackTrace();
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    public String obtainProp(int i, String str) {
        View viewResolveView;
        try {
            viewResolveView = this.mUIManager.resolveView(i);
            str.getClass();
            switch (str) {
                case "opacity":
                    return Float.toString(viewResolveView.getAlpha());
                case "height":
                    return Float.toString(AbstractC11406vL1.m25402a(viewResolveView.getHeight()));
                case "zIndex":
                    return Float.toString(viewResolveView.getElevation());
                case "top":
                    return Float.toString(AbstractC11406vL1.m25402a(viewResolveView.getTop()));
                case "left":
                    return Float.toString(AbstractC11406vL1.m25402a(viewResolveView.getLeft()));
                case "width":
                    return Float.toString(AbstractC11406vL1.m25402a(viewResolveView.getWidth()));
                case "backgroundColor":
                    Drawable background = viewResolveView.getBackground();
                    try {
                        Integer num = (Integer) background.getClass().getMethod("getColor", null).invoke(background, null);
                        num.intValue();
                        String str2 = String.format("%08x", num);
                        return "#" + str2.substring(2, 8) + str2.substring(0, 2);
                    } catch (Exception unused) {
                        return "Unable to resolve background color";
                    }
                default:
                    throw new IllegalArgumentException(AbstractC7222ym.m26234k("[Reanimated] Attempted to get unsupported property ", str, " with function `getViewProp`"));
            }
        } catch (Exception unused2) {
            return "[Reanimated] Unable to resolve view";
        }
    }

    @Override // p000.InterfaceC7136xP
    public void onEventDispatch(AbstractC6550oP abstractC6550oP) throws InterruptedException {
        if (this.mNativeProxy == null) {
            return;
        }
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(abstractC6550oP);
            performOperations();
            return;
        }
        if (this.mNativeProxy.isAnyHandlerWaitingForEvent(this.mCustomEventNamesResolver.mo2073e(abstractC6550oP.getEventName()), abstractC6550oP.getViewTag())) {
            this.mEventQueue.offer(new CopiedEvent(abstractC6550oP));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void performOperations() throws InterruptedException {
        if (this.mOperationsInBatch.isEmpty()) {
            return;
        }
        Queue<NativeUpdateOperation> queue = this.mOperationsInBatch;
        this.mOperationsInBatch = new LinkedList();
        boolean z = this.mTryRunBatchUpdatesSynchronously;
        this.mTryRunBatchUpdatesSynchronously = false;
        Semaphore semaphore = new Semaphore(0);
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.NodesManager.3
            final /* synthetic */ Queue val$copiedOperationsQueue;
            final /* synthetic */ Semaphore val$semaphore;
            final /* synthetic */ boolean val$trySynchronously;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24093(JSExceptionHandler jSExceptionHandler, boolean z2, Semaphore semaphore2, Queue queue2) {
                super(jSExceptionHandler);
                z = z2;
                semaphore = semaphore2;
                queue = queue2;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                C11827yf1 c11827yf1 = NodesManager.this.mUIImplementation.f15075f;
                boolean z2 = false;
                boolean z22 = c11827yf1.f46391h.isEmpty() && c11827yf1.f46390g.isEmpty();
                if (z && z22) {
                    z2 = true;
                }
                if (!z2) {
                    semaphore.release();
                }
                while (!queue.isEmpty()) {
                    NativeUpdateOperation nativeUpdateOperation = (NativeUpdateOperation) queue.remove();
                    DM0 dm0M24384u = NodesManager.this.mUIImplementation.f15073d.m24384u(nativeUpdateOperation.mViewTag);
                    if (dm0M24384u != null) {
                        UIManagerModule uIManagerModule = (UIManagerModule) NodesManager.this.mUIManager;
                        int i = nativeUpdateOperation.mViewTag;
                        String str = ((EM0) dm0M24384u).f2650b;
                        UN1.m7999c(str);
                        uIManagerModule.updateView(i, str, nativeUpdateOperation.mNativeProps);
                    }
                }
                if (z22) {
                    NodesManager.this.mUIImplementation.m9570f(-1);
                }
                if (z2) {
                    semaphore.release();
                }
            }
        });
        if (z2) {
            try {
                semaphore2.tryAcquire(16L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void scrollTo(int i, double d, double d2, boolean z) {
        try {
            NativeMethodsHelper.scrollTo(this.mUIManager.resolveView(i), d, d2, z);
        } catch (C8810b60 e) {
            e.printStackTrace();
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.m5305c(3, this.mChoreographerCallback);
    }

    public void updateProps(int i, Map<String, Object> map) {
        try {
            if (this.mUIManager.resolveView(i) == null) {
                return;
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (this.uiProps.contains(key)) {
                    addProp(javaOnlyMap, key, value);
                    z = true;
                } else if (this.nativeProps.contains(key)) {
                    addProp(writableMapCreateMap2, key, value);
                    z2 = true;
                } else {
                    addProp(writableMapCreateMap, key, value);
                    z3 = true;
                }
            }
            if (i != -1) {
                if (z) {
                    C8623Ze1 c8623Ze1 = this.mUIImplementation;
                    NM0 nm0 = new NM0(javaOnlyMap);
                    c8623Ze1.getClass();
                    UiThreadUtil.assertOnUiThread();
                    c8623Ze1.f15075f.f46385b.updateProperties(i, nm0);
                }
                if (z2) {
                    enqueueUpdateViewOnNativeThread(i, writableMapCreateMap2, true);
                }
                if (z3) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("viewTag", i);
                    writableMapCreateMap3.putMap("props", writableMapCreateMap);
                    sendEvent("onReanimatedPropsChange", writableMapCreateMap3);
                }
            }
        } catch (C8810b60 unused) {
        }
    }

    private void handleEvent(int i, String str, WritableMap writableMap) {
        this.mCustomEventHandler.receiveEvent(i, str, writableMap);
    }
}

package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.DevToolsReactPerfLogger;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.internal.interop.InteropUIBlockListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.fabric.mounting.MountItemDispatcher;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItemFactory;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.uimanager.events.C1931b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.A91;
import p000.AbstractC10596p12;
import p000.AbstractC10639pM0;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.AbstractC7751Ik1;
import p000.AbstractC9913jh0;
import p000.C4180hS;
import p000.C8810b60;
import p000.ComponentCallbacks2C7803Jk1;
import p000.EnumC7813Jp1;
import p000.G41;
import p000.G71;
import p000.InterfaceC10255mM0;
import p000.InterfaceC1301Ug;
import p000.InterfaceC6947uP;
import p000.MJ0;
import p000.O90;
import p000.Q12;
import p000.S61;
import p000.S91;
import p000.UJ0;
import p000.YQ1;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener, UIBlockViewResolver, G71 {
    public static final boolean ENABLE_FABRIC_LOGS;
    public static final boolean ENABLE_FABRIC_PERF_LOGS;
    private static final DevToolsReactPerfLogger.DevToolsReactPerfLoggerListener FABRIC_PERF_LOGGER;
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final InterfaceC1301Ug mBatchEventDispatchedListener;
    private Binding mBinding;
    public DevToolsReactPerfLogger mDevToolsReactPerfLogger;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final InterfaceC6947uP mEventDispatcher;
    private InteropUIBlockListener mInteropUIBlockListener;
    private final MountItemDispatcher mMountItemDispatcher;
    private final MountingManager.MountItemExecutor mMountItemExecutor;
    private final MountingManager mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final ComponentCallbacks2C7803Jk1 mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private final List<Integer> mMountedSurfaceIds = new ArrayList();
    private final Set<SynchronousEvent> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        private volatile boolean mIsMountingEnabled;

        public /* synthetic */ DispatchUIFrameCallback(FabricUIManager fabricUIManager, ReactApplicationContext reactApplicationContext) {
            this((ReactContext) reactApplicationContext);
        }

        @Override // com.facebook.react.fabric.GuardedFrameCallback
        public void doFrameGuarded(long j) {
            if (!this.mIsMountingEnabled || FabricUIManager.this.mDestroyed) {
                AbstractC3929dS.m17683p(FabricUIManager.TAG);
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.dispatchPreMountItems(j);
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                    MJ0.m5303a().m5305c(2, FabricUIManager.this.mDispatchUIFrameCallback);
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e) {
                    AbstractC3929dS.m17675h(FabricUIManager.TAG);
                    stop();
                    throw e;
                }
            } catch (Throwable th) {
                MJ0.m5303a().m5305c(2, FabricUIManager.this.mDispatchUIFrameCallback);
                throw th;
            }
        }

        public void stop() {
            this.mIsMountingEnabled = false;
        }

        private DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
            this.mIsMountingEnabled = true;
        }
    }

    public class MountItemDispatchListener implements MountItemDispatcher.ItemDispatchListener {
        public /* synthetic */ MountItemDispatchListener(FabricUIManager fabricUIManager, int i) {
            this();
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didDispatchMountItems() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void didMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            for (MountItem mountItem : list) {
                if (mountItem != null && !FabricUIManager.this.mMountedSurfaceIds.contains(Integer.valueOf(mountItem.getSurfaceId()))) {
                    FabricUIManager.this.mMountedSurfaceIds.add(Integer.valueOf(mountItem.getSurfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mMountedSurfaceIds.isEmpty()) {
                return;
            }
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.react.fabric.FabricUIManager.MountItemDispatchListener.1
                @Override // java.lang.Runnable
                public void run() {
                    FabricUIManager.this.mMountNotificationScheduled = false;
                    Binding binding = FabricUIManager.this.mBinding;
                    if (binding == null || FabricUIManager.this.mDestroyed) {
                        FabricUIManager.this.mMountedSurfaceIds.clear();
                        return;
                    }
                    Iterator it2 = FabricUIManager.this.mMountedSurfaceIds.iterator();
                    while (it2.hasNext()) {
                        binding.reportMount(((Integer) it2.next()).intValue());
                    }
                    FabricUIManager.this.mMountedSurfaceIds.clear();
                }
            });
        }

        @Override // com.facebook.react.fabric.mounting.MountItemDispatcher.ItemDispatchListener
        public void willMountItems(List<MountItem> list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        private MountItemDispatchListener() {
        }
    }

    static {
        boolean z;
        if (ReactFeatureFlags.enableFabricLogs) {
            z = true;
        } else {
            O90.m5968f(UJ0.f11736e, "tag");
            z = false;
        }
        ENABLE_FABRIC_LOGS = z;
        ENABLE_FABRIC_PERF_LOGS = z;
        FABRIC_PERF_LOGGER = new C4180hS();
        FabricSoLoader.staticInit();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, InterfaceC1301Ug interfaceC1301Ug) {
        MountingManager.MountItemExecutor mountItemExecutor = new MountingManager.MountItemExecutor() { // from class: com.facebook.react.fabric.FabricUIManager.1
            @Override // com.facebook.react.fabric.mounting.MountingManager.MountItemExecutor
            public void executeItems(Queue<MountItem> queue) {
                FabricUIManager.this.mMountItemDispatcher.dispatchMountItems(queue);
            }
        };
        this.mMountItemExecutor = mountItemExecutor;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(this, reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        MountingManager mountingManager = new MountingManager(componentCallbacks2C7803Jk1, mountItemExecutor);
        this.mMountingManager = mountingManager;
        this.mMountItemDispatcher = new MountItemDispatcher(mountingManager, new MountItemDispatchListener(this, 0));
        this.mEventDispatcher = new C1931b(reactApplicationContext);
        this.mBatchEventDispatchedListener = interfaceC1301Ug;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
        reactApplicationContext.registerComponentCallbacks(componentCallbacks2C7803Jk1);
    }

    private MountItem createIntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return MountItemFactory.createIntBufferBatchMountItem(i, iArr, objArr, i2);
    }

    private InteropUIBlockListener getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            InteropUIBlockListener interopUIBlockListener = new InteropUIBlockListener();
            this.mInteropUIBlockListener = interopUIBlockListener;
            addUIManagerEventListener(interopUIBlockListener);
        }
        return this.mInteropUIBlockListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$0(DevToolsReactPerfLogger.FabricCommitPoint fabricCommitPoint) {
        long commitDuration = fabricCommitPoint.getCommitDuration();
        long layoutDuration = fabricCommitPoint.getLayoutDuration();
        long diffDuration = fabricCommitPoint.getDiffDuration();
        long transactionEndDuration = fabricCommitPoint.getTransactionEndDuration();
        long batchExecutionDuration = fabricCommitPoint.getBatchExecutionDuration();
        LongStreamingStats longStreamingStats = DevToolsReactPerfLogger.mStreamingCommitStats;
        longStreamingStats.add(commitDuration);
        LongStreamingStats longStreamingStats2 = DevToolsReactPerfLogger.mStreamingLayoutStats;
        longStreamingStats2.add(layoutDuration);
        LongStreamingStats longStreamingStats3 = DevToolsReactPerfLogger.mStreamingDiffStats;
        longStreamingStats3.add(diffDuration);
        LongStreamingStats longStreamingStats4 = DevToolsReactPerfLogger.mStreamingTransactionEndStats;
        longStreamingStats4.add(transactionEndDuration);
        LongStreamingStats longStreamingStats5 = DevToolsReactPerfLogger.mStreamingBatchExecutionStats;
        longStreamingStats5.add(batchExecutionDuration);
        Object[] objArr = {Long.valueOf(fabricCommitPoint.getCommitNumber()), Long.valueOf(commitDuration), Double.valueOf(longStreamingStats.getAverage()), Double.valueOf(longStreamingStats.getMedian()), Long.valueOf(longStreamingStats.getMax()), Long.valueOf(layoutDuration), Double.valueOf(longStreamingStats2.getAverage()), Double.valueOf(longStreamingStats2.getMedian()), Long.valueOf(longStreamingStats2.getMax()), Long.valueOf(diffDuration), Double.valueOf(longStreamingStats3.getAverage()), Double.valueOf(longStreamingStats3.getMedian()), Long.valueOf(longStreamingStats3.getMax()), Long.valueOf(transactionEndDuration), Double.valueOf(longStreamingStats4.getAverage()), Double.valueOf(longStreamingStats4.getMedian()), Long.valueOf(longStreamingStats4.getMax()), Long.valueOf(batchExecutionDuration), Double.valueOf(longStreamingStats5.getAverage()), Double.valueOf(longStreamingStats5.getMedian()), Long.valueOf(longStreamingStats5.getMax())};
        if (AbstractC3929dS.f26114a.m18228o(4)) {
            String.format(null, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", objArr);
        }
    }

    private long measure(int i, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, float f2, float f3, float f4) {
        return measure(i, str, readableMap, readableMap2, readableMap3, f, f2, f3, f4, null);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f, float f2) {
        TextPaint textPaint;
        Spannable spannable;
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        float fM25403b = AbstractC11406vL1.m25403b(f);
        float fM25403b2 = AbstractC11406vL1.m25403b(f2);
        Spannable spannableM93c = A91.m93c(reactApplicationContext, readableMapBuffer, null);
        TextPaint textPaint2 = A91.f92a;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannableM93c, textPaint2);
        String string = readableMapBuffer2.getString(2);
        int i = !string.equals("balanced") ? !string.equals("simple") ? 1 : 0 : 2;
        boolean z = readableMapBuffer2.mo9114J(4) ? readableMapBuffer2.getBoolean(4) : true;
        String string2 = readableMapBuffer2.getString(5);
        int i2 = !string2.equals("balanced") ? !string2.equals("simple") ? 1 : 0 : 2;
        boolean z2 = readableMapBuffer2.mo9114J(3) ? readableMapBuffer2.getBoolean(3) : false;
        int i3 = readableMapBuffer2.mo9114J(0) ? readableMapBuffer2.getInt(0) : -1;
        Layout.Alignment alignmentM94d = A91.m94d(readableMapBuffer, spannableM93c);
        EnumC7813Jp1 enumC7813Jp1 = EnumC7813Jp1.f5716b;
        if (z2) {
            textPaint = textPaint2;
            spannable = spannableM93c;
            A91.m91a(spannableM93c, fM25403b, enumC7813Jp1, fM25403b2, EnumC7813Jp1.f5715a, readableMapBuffer2.mo9114J(6) ? readableMapBuffer2.getDouble(6) : Double.NaN, i3, z, i, i2, alignmentM94d);
        } else {
            textPaint = textPaint2;
            spannable = spannableM93c;
        }
        return (NativeArray) AbstractC10596p12.m23592a(spannable, A91.m92b(spannable, metricsIsBoring, fM25403b, enumC7813Jp1, z, i, i2, alignmentM94d), textPaint, reactApplicationContext);
    }

    private long measureMapBuffer(int i, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, ReadableMapBuffer readableMapBuffer3, float f, float f2, float f3, float f4, float[] fArr) {
        ReactContext context;
        if (i > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measureMapBuffer(context, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, AbstractC9913jh0.m22092d(f, f2), AbstractC9913jh0.m22091c(f, f2), AbstractC9913jh0.m22092d(f3, f4), AbstractC9913jh0.m22091c(f3, f4), fArr);
    }

    private void preallocateView(int i, int i2, String str, Object obj, Object obj2, Object obj3, boolean z) {
        this.mMountItemDispatcher.addPreAllocateMountItem(MountItemFactory.createPreAllocateViewMountItem(i, i2, str, (ReadableMap) obj, (G41) obj2, (EventEmitterWrapper) obj3, z));
    }

    private void scheduleMountItem(MountItem mountItem, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = mountItem instanceof BatchMountItem;
        boolean z2 = (z && !((BatchMountItem) mountItem).isBatchEmpty()) || !(z || mountItem == null);
        for (Iterator<UIManagerListener> it = this.mListeners.iterator(); it.hasNext(); it = it) {
            it.next().didScheduleMountItems(this);
        }
        if (z) {
            this.mCommitStartTime = j;
            this.mLayoutTime = j5 - j4;
            this.mFinishTransactionCPPTime = j7 - j6;
            this.mFinishTransactionTime = jUptimeMillis - j6;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z2) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            GuardedRunnable guardedRunnable = new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.fabric.FabricUIManager.3
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    FabricUIManager.this.mMountItemDispatcher.tryDispatchMountItems();
                }
            };
            if (UiThreadUtil.isOnUiThread()) {
                guardedRunnable.run();
            }
        }
        if (z) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i, j);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i, j5, i2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new C8810b60("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        InterfaceC10255mM0 interfaceC10255mM0 = (InterfaceC10255mM0) t;
        int rootViewTag = interfaceC10255mM0.getRootViewTag();
        this.mMountingManager.startSurface(rootViewTag, new S91(this.mReactApplicationContext, t.getContext(), interfaceC10255mM0.getSurfaceID(), rootViewTag), t);
        String jSModuleName = interfaceC10255mM0.getJSModuleName();
        if (ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17670c(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(UIBlock uIBlock) {
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            getInteropUIBlockListener().addUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(S61 s61, View view) {
        this.mMountingManager.attachRootView(s61.getSurfaceId(), view, new S91(this.mReactApplicationContext, view.getContext(), s61.getModuleName(), s61.getSurfaceId()));
        s61.setMountable(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.5
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                mountingManager.clearJSResponder();
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return "CLEAR_JS_RESPONDER";
            }
        });
    }

    public DispatchCommandMountItem createDispatchCommandMountItemForInterop(int i, int i2, String str, ReadableArray readableArray) {
        try {
            return MountItemFactory.createDispatchCommandMountItem(i, i2, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return MountItemFactory.createDispatchCommandMountItem(i, i2, str, readableArray);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i, String[] strArr) {
        S91 context = this.mMountingManager.getSurfaceManagerEnforced(i, "getColor").getContext();
        if (context == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(context, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    public ReadableMap getInspectorDataForInstance(int i, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.getEventEmitter(i, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.getRunStartTime()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.getBatchedExecutionTime()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public boolean getThemeData(int i, float[] fArr) {
        S91 context = this.mMountingManager.getSurfaceManagerEnforced(i, "getThemeData").getContext();
        if (context == null) {
            AbstractC3929dS.m17683p(TAG);
            return false;
        }
        EditText editText = new EditText(context);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        float[] fArr2 = {AbstractC11406vL1.m25402a(editText.getPaddingStart()), AbstractC11406vL1.m25402a(editText.getPaddingEnd()), AbstractC11406vL1.m25402a(editText.getPaddingTop()), AbstractC11406vL1.m25402a(editText.getPaddingBottom())};
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.mo11045f(new FabricEventEmitter(this));
        this.mEventDispatcher.mo11041b(this.mBatchEventDispatchedListener);
        if (ENABLE_FABRIC_PERF_LOGS) {
            DevToolsReactPerfLogger devToolsReactPerfLogger = new DevToolsReactPerfLogger();
            this.mDevToolsReactPerfLogger = devToolsReactPerfLogger;
            devToolsReactPerfLogger.addDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        AbstractC3929dS.m17677j(str);
        DevToolsReactPerfLogger devToolsReactPerfLogger = this.mDevToolsReactPerfLogger;
        if (devToolsReactPerfLogger != null) {
            devToolsReactPerfLogger.removeDevToolsReactPerfLoggerListener(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mDispatchUIFrameCallback.stop();
        this.mEventDispatcher.mo11042c(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.mo11043d();
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.m4403c();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.unregister();
        this.mBinding = null;
        AbstractC7751Ik1.m3995a();
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        this.mEventDispatcher.mo11047h();
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        MJ0.m5303a().m5306d(2, this.mDispatchUIFrameCallback);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        MJ0.m5303a().m5305c(2, this.mDispatchUIFrameCallback);
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.mo11044e();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            getInteropUIBlockListener().prependUIBlock(uIBlock);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("top")) {
            return str;
        }
        return "on" + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager, com.facebook.react.fabric.interop.UIBlockViewResolver
    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerForView = this.mMountingManager.getSurfaceManagerForView(i);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getView(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i, int i2) {
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(-1, i, i2));
    }

    public void sendAccessibilityEventFromJS(int i, int i2, String str) {
        int i3;
        if ("focus".equals(str)) {
            i3 = 8;
        } else if ("windowStateChange".equals(str)) {
            i3 = 32;
        } else if ("click".equals(str)) {
            i3 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException(AbstractC7222ym.m26245v("sendAccessibilityEventFromJS: invalid eventType ", str));
            }
            i3 = 128;
        }
        this.mMountItemDispatcher.addMountItem(MountItemFactory.createSendAccessibilityEventMountItem(i, i2, i3));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    public void setJSResponder(final int i, final int i2, final int i3, final boolean z) {
        this.mMountItemDispatcher.addMountItem(new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.4
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(i);
                if (surfaceManager != null) {
                    surfaceManager.setJSResponder(i2, i3, z);
                } else {
                    AbstractC3929dS.m17672e(FabricUIManager.TAG);
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return i;
            }

            @SuppressLint({"DefaultLocale"})
            public String toString() {
                return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(i2), Integer.valueOf(i));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        int rootViewTag = ((InterfaceC10255mM0) t).getRootViewTag();
        Context context = t.getContext();
        S91 s91 = new S91(this.mReactApplicationContext, context, str, rootViewTag);
        if (ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17670c(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.startSurface(rootViewTag, s91, t);
        Point pointM9299c = UiThreadUtil.isOnUiThread() ? YQ1.m9299c(t) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, AbstractC9913jh0.m22090b(i), AbstractC9913jh0.m22089a(i), AbstractC9913jh0.m22090b(i2), AbstractC9913jh0.m22089a(i2), pointM9299c.x, pointM9299c.y, Q12.m6548b(context), Q12.m6547a(context));
        return rootViewTag;
    }

    public void stopSurface(S61 s61) {
        if (!s61.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.stopSurface(s61.getSurfaceId());
        s61.stop();
        if (s61 instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) s61);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(final int i, final ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i2 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i2 + 1;
        MountItem mountItem = new MountItem() { // from class: com.facebook.react.fabric.FabricUIManager.2
            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public void execute(MountingManager mountingManager) {
                try {
                    mountingManager.updateProps(i, readableMap);
                } catch (Exception unused) {
                }
            }

            @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
            public int getSurfaceId() {
                return -1;
            }

            public String toString() {
                return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(i), "<hidden>");
            }
        };
        if (!this.mMountingManager.getViewExists(i)) {
            this.mMountItemDispatcher.addMountItem(mountItem);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i2);
        if (ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17670c(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i), "<hidden>");
        }
        mountItem.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean zM6547a;
        if (ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17668a(Integer.valueOf(i), TAG, "Updating Root Layout Specs for [%d]");
        }
        SurfaceMountingManager surfaceManager = this.mMountingManager.getSurfaceManager(i);
        if (surfaceManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C8810b60(AbstractC11153tN0.m24909u(i, "Cannot updateRootLayoutSpecs on surfaceId that does not exist: ")));
            return;
        }
        S91 context = surfaceManager.getContext();
        if (context != null) {
            boolean zM6548b = Q12.m6548b(context);
            zM6547a = Q12.m6547a(context);
            z = zM6548b;
        } else {
            z = false;
            zM6547a = false;
        }
        this.mBinding.setConstraints(i, AbstractC9913jh0.m22090b(i2), AbstractC9913jh0.m22089a(i2), AbstractC9913jh0.m22090b(i3), AbstractC9913jh0.m22089a(i3), i4, i5, z, zM6547a);
    }

    private long measure(int i, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, float f2, float f3, float f4, float[] fArr) {
        ReactContext context;
        if (i > 0) {
            SurfaceMountingManager surfaceManagerEnforced = this.mMountingManager.getSurfaceManagerEnforced(i, "measure");
            if (surfaceManagerEnforced.isStopped()) {
                return 0L;
            }
            context = surfaceManagerEnforced.getContext();
        } else {
            context = this.mReactApplicationContext;
        }
        return this.mMountingManager.measure(context, str, readableMap, readableMap2, readableMap3, AbstractC9913jh0.m22092d(f, f2), AbstractC9913jh0.m22091c(f, f2), AbstractC9913jh0.m22092d(f3, f4), AbstractC9913jh0.m22091c(f3, f4), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public InterfaceC6947uP getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        receiveEvent(i, i2, str, false, writableMap, 2);
    }

    @Deprecated
    public void dispatchCommand(int i, int i2, int i3, ReadableArray readableArray) {
        this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i, i2, i3, readableArray));
    }

    public void receiveEvent(int i, int i2, String str, boolean z, WritableMap writableMap, int i3) {
        receiveEvent(i, i2, str, z, writableMap, i3, false);
    }

    @Override // p000.G71
    public void receiveEvent(int i, int i2, String str, boolean z, WritableMap writableMap, int i3, boolean z2) {
        if (this.mDestroyed) {
            AbstractC3929dS.m17672e(TAG);
            return;
        }
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i, i2);
        if (eventEmitter == null) {
            if (this.mMountingManager.getViewExists(i2)) {
                this.mMountingManager.enqueuePendingEvent(i, i2, str, z, writableMap, i3);
                return;
            } else {
                AbstractC3929dS.m17669b(TAG);
                return;
            }
        }
        if (z2) {
            if (this.mSynchronousEvents.add(new SynchronousEvent(i, i2, str))) {
                eventEmitter.dispatchEventSynchronously(str, writableMap);
            }
        } else if (z) {
            eventEmitter.dispatchUnique(str, writableMap);
        } else {
            eventEmitter.dispatch(str, writableMap, i3);
        }
    }

    public void dispatchCommand(int i, int i2, String str, ReadableArray readableArray) {
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            this.mMountItemDispatcher.addViewCommandMountItem(createDispatchCommandMountItemForInterop(i, i2, str, readableArray));
        } else {
            this.mMountItemDispatcher.addViewCommandMountItem(MountItemFactory.createDispatchCommandMountItem(i, i2, str, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i) {
        this.mMountingManager.stopSurface(i);
        this.mBinding.stopSurface(i);
    }

    public void startSurface(S61 s61, Context context, View view) {
        int iM23746b = AbstractC10639pM0.m23746b();
        this.mMountingManager.startSurface(iM23746b, new S91(this.mReactApplicationContext, context, s61.getModuleName(), iM23746b), view);
        s61.setSurfaceId(iM23746b);
        if (s61 instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) s61);
        }
        s61.setMountable(view != null);
        s61.start();
    }
}

package com.facebook.react.fabric.mounting;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.GuardedFrameCallback;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC10874rB1;
import p000.AbstractC11153tN0;
import p000.AbstractC1374Vq;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.AbstractC7500Dp0;
import p000.C7522Ea0;
import p000.C8810b60;
import p000.C8932c31;
import p000.C9773ib0;
import p000.ComponentCallbacks2C7803Jk1;
import p000.G41;
import p000.I50;
import p000.InterfaceC10255mM0;
import p000.InterfaceC11293uT0;
import p000.MD0;
import p000.MJ0;
import p000.N61;
import p000.NM0;
import p000.RunnableC6246ja;
import p000.S91;
import p000.UN1;
import p000.YL0;

/* loaded from: classes.dex */
public class SurfaceMountingManager {
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES = false;
    public static final String TAG = "SurfaceMountingManager";
    private C7522Ea0 mJSResponderHandler;
    private MountingManager.MountItemExecutor mMountItemExecutor;
    private RemoveDeleteTreeUIFrameCallback mRemoveDeleteTreeUIFrameCallback;
    private RootViewManager mRootViewManager;
    private final int mSurfaceId;
    private C8932c31 mTagSetForStoppedSurface;
    private S91 mThemedReactContext;
    private ComponentCallbacks2C7803Jk1 mViewManagerRegistry;
    private volatile boolean mIsStopped = false;
    private volatile boolean mRootViewAttached = false;
    private ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    private Queue<MountItem> mOnViewAttachMountItems = new ArrayDeque();
    private final Stack<Integer> mReactTagsToRemove = new Stack<>();
    private final Set<Integer> mErroneouslyReaddedReactTags = new HashSet();

    /* renamed from: com.facebook.react.fabric.mounting.SurfaceMountingManager$4 */
    public class RunnableC19264 implements Runnable {
        final /* synthetic */ PendingViewEvent val$viewEvent;
        final /* synthetic */ ViewState val$viewState;

        public RunnableC19264(ViewState viewState, PendingViewEvent pendingViewEvent) {
            viewState = viewState;
            pendingViewEvent = pendingViewEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewState viewState = viewState;
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                pendingViewEvent.dispatch(eventEmitterWrapper);
                return;
            }
            if (viewState.mPendingEventQueue == null) {
                viewState.mPendingEventQueue = new LinkedList();
            }
            viewState.mPendingEventQueue.add(pendingViewEvent);
        }
    }

    public static class PendingViewEvent {
        private final boolean mCanCoalesceEvent;
        private final int mEventCategory;
        private final String mEventName;
        private final WritableMap mParams;

        public PendingViewEvent(String str, WritableMap writableMap, int i, boolean z) {
            this.mEventName = str;
            this.mParams = writableMap;
            this.mEventCategory = i;
            this.mCanCoalesceEvent = z;
        }

        public void dispatch(EventEmitterWrapper eventEmitterWrapper) {
            if (this.mCanCoalesceEvent) {
                eventEmitterWrapper.dispatchUnique(this.mEventName, this.mParams);
            } else {
                eventEmitterWrapper.dispatch(this.mEventName, this.mParams, this.mEventCategory);
            }
        }
    }

    public class RemoveDeleteTreeUIFrameCallback extends GuardedFrameCallback {
        private static final long FRAME_TIME_MS = 16;
        private static final long MAX_TIME_IN_FRAME = 9;

        public /* synthetic */ RemoveDeleteTreeUIFrameCallback(SurfaceMountingManager surfaceMountingManager, ReactContext reactContext, int i) {
            this(reactContext);
        }

        private boolean haveExceededNonBatchedFrameTime(long j) {
            return FRAME_TIME_MS - ((System.nanoTime() - j) / 1000000) < MAX_TIME_IN_FRAME;
        }

        @Override // com.facebook.react.fabric.GuardedFrameCallback
        public void doFrameGuarded(long j) {
            Stack stack = new Stack();
            int i = 0;
            while (!SurfaceMountingManager.this.mReactTagsToRemove.empty()) {
                try {
                    Integer num = (Integer) SurfaceMountingManager.this.mReactTagsToRemove.pop();
                    int iIntValue = num.intValue();
                    i++;
                    if (SurfaceMountingManager.this.mErroneouslyReaddedReactTags.contains(num)) {
                        ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new C8810b60("RemoveDeleteTree recursively tried to remove a React View that was actually reused. This indicates a bug in the Differ. [" + iIntValue + "]"));
                    } else {
                        stack.clear();
                        ViewState nullableViewState = SurfaceMountingManager.this.getNullableViewState(iIntValue);
                        if (nullableViewState != null) {
                            View view = nullableViewState.mView;
                            NativeModule nativeModule = nullableViewState.mViewManager;
                            if (nativeModule instanceof I50) {
                                I50 i50 = (I50) nativeModule;
                                int i2 = 0;
                                boolean z = false;
                                while (true) {
                                    View childAt = i50.getChildAt(view, i2);
                                    if (childAt == null) {
                                        break;
                                    }
                                    z = z || SurfaceMountingManager.this.getNullableViewState(childAt.getId()) != null;
                                    stack.push(Integer.valueOf(childAt.getId()));
                                    i2++;
                                }
                                if (z) {
                                    try {
                                        i50.removeAllViews(view);
                                    } catch (RuntimeException e) {
                                        ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, e);
                                        z = false;
                                    }
                                }
                                if (z) {
                                    SurfaceMountingManager.this.mReactTagsToRemove.addAll(stack);
                                }
                            }
                            SurfaceMountingManager.this.mTagToViewState.remove(num);
                            SurfaceMountingManager.this.onViewStateDeleted(nullableViewState);
                            if (i % 20 == 0 && haveExceededNonBatchedFrameTime(j)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th) {
                    if (SurfaceMountingManager.this.mReactTagsToRemove.empty()) {
                        SurfaceMountingManager.this.mErroneouslyReaddedReactTags.clear();
                        SurfaceMountingManager.this.mReactTagsToRemove.clear();
                    } else {
                        MJ0.m5303a().m5305c(5, this);
                    }
                    throw th;
                }
            }
            if (!SurfaceMountingManager.this.mReactTagsToRemove.empty()) {
                MJ0.m5303a().m5305c(5, this);
            } else {
                SurfaceMountingManager.this.mErroneouslyReaddedReactTags.clear();
                SurfaceMountingManager.this.mReactTagsToRemove.clear();
            }
        }

        private RemoveDeleteTreeUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
        }
    }

    public static class ViewState {
        public ReadableMap mCurrentLocalData;
        public NM0 mCurrentProps;
        public EventEmitterWrapper mEventEmitter;
        final boolean mIsRoot;
        public Queue<PendingViewEvent> mPendingEventQueue;
        final int mReactTag;
        public G41 mStateWrapper;
        final View mView;
        final ViewManager mViewManager;

        public /* synthetic */ ViewState(int i, View view, ViewManager viewManager, int i2) {
            this(i, view, viewManager);
        }

        public String toString() {
            return "ViewState [" + this.mReactTag + "] - isRoot: " + this.mIsRoot + " - props: " + this.mCurrentProps + " - localData: " + this.mCurrentLocalData + " - viewManager: " + this.mViewManager + " - isLayoutOnly: " + (this.mViewManager == null);
        }

        public /* synthetic */ ViewState(int i, View view, ViewManager viewManager, Object obj) {
            this(i, view, viewManager, true);
        }

        private ViewState(int i, View view, ViewManager viewManager) {
            this(i, view, viewManager, false);
        }

        private ViewState(int i, View view, ViewManager viewManager, boolean z) {
            this.mCurrentProps = null;
            this.mCurrentLocalData = null;
            this.mStateWrapper = null;
            this.mEventEmitter = null;
            this.mPendingEventQueue = null;
            this.mReactTag = i;
            this.mView = view;
            this.mIsRoot = z;
            this.mViewManager = viewManager;
        }
    }

    public SurfaceMountingManager(int i, C7522Ea0 c7522Ea0, ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, S91 s91) {
        this.mSurfaceId = i;
        this.mJSResponderHandler = c7522Ea0;
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
        this.mRootViewManager = rootViewManager;
        this.mMountItemExecutor = mountItemExecutor;
        this.mThemedReactContext = s91;
    }

    private void addRootView(View view) {
        if (isStopped()) {
            return;
        }
        this.mTagToViewState.put(Integer.valueOf(this.mSurfaceId), new ViewState(this.mSurfaceId, view, this.mRootViewManager, (Object) null));
        MD0 md0 = new MD0(this, 24, view);
        if (UiThreadUtil.isOnUiThread()) {
            md0.run();
        } else {
            UiThreadUtil.runOnUiThread(md0);
        }
    }

    private void executeMountItemsOnViewAttach() {
        this.mMountItemExecutor.executeItems(this.mOnViewAttachMountItems);
    }

    public ViewState getNullableViewState(int i) {
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    private static I50 getViewGroupManager(ViewState viewState) {
        NativeModule nativeModule = viewState.mViewManager;
        if (nativeModule != null) {
            return (I50) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
    }

    private ViewState getViewState(int i) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState != null) {
            return viewState;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Unable to find viewState for tag ", ". Surface stopped: ");
        sbM26237n.append(isStopped());
        throw new RetryableMountingLayerException(sbM26237n.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void lambda$addRootView$0(View view) {
        if (isStopped()) {
            return;
        }
        if (view.getId() == this.mSurfaceId) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C8810b60(AbstractC1374Vq.m8591j(new StringBuilder("Race condition in addRootView detected. Trying to set an id of ["), this.mSurfaceId, "] on the RootView, but that id has already been set. ")));
        } else if (view.getId() != -1) {
            AbstractC3929dS.m17673f(TAG, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.mSurfaceId));
            throw new C8810b60("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        view.setId(this.mSurfaceId);
        if (view instanceof InterfaceC10255mM0) {
            ((InterfaceC10255mM0) view).setRootViewTag(this.mSurfaceId);
        }
        if (!((C9773ib0) AbstractC10874rB1.f41370a).forceBatchingMountItemsOnAndroid()) {
            this.mRootViewAttached = true;
        }
        executeMountItemsOnViewAttach();
        if (((C9773ib0) AbstractC10874rB1.f41370a).forceBatchingMountItemsOnAndroid()) {
            this.mRootViewAttached = true;
        }
    }

    public void lambda$stopSurface$1() {
        ArrayList arrayList;
        this.mTagSetForStoppedSurface = new C8932c31();
        for (Map.Entry<Integer, ViewState> entry : this.mTagToViewState.entrySet()) {
            this.mTagSetForStoppedSurface.m10583g(entry.getKey().intValue(), this);
            onViewStateDeleted(entry.getValue());
        }
        this.mTagToViewState = null;
        this.mJSResponderHandler = null;
        this.mRootViewManager = null;
        this.mMountItemExecutor = null;
        this.mThemedReactContext = null;
        if (((C9773ib0) AbstractC10874rB1.f41370a).fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak()) {
            this.mRemoveDeleteTreeUIFrameCallback = null;
        }
        this.mOnViewAttachMountItems.clear();
        if (ReactFeatureFlags.enableViewRecycling) {
            ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1 = this.mViewManagerRegistry;
            int i = this.mSurfaceId;
            synchronized (componentCallbacks2C7803Jk1) {
                arrayList = new ArrayList(componentCallbacks2C7803Jk1.f5681a.values());
            }
            RunnableC6246ja runnableC6246ja = new RunnableC6246ja(arrayList, i, 14);
            if (UiThreadUtil.isOnUiThread()) {
                runnableC6246ja.run();
            } else {
                UiThreadUtil.runOnUiThread(runnableC6246ja);
            }
        }
        AbstractC3929dS.m17672e(TAG);
    }

    private static void logViewHierarchy(ViewGroup viewGroup, boolean z) {
        viewGroup.getId();
        String str = TAG;
        viewGroup.getClass().toString();
        AbstractC3929dS.m17672e(str);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            String str2 = TAG;
            viewGroup.getChildAt(i).getId();
            viewGroup.getChildAt(i).getClass().toString();
            AbstractC3929dS.m17672e(str2);
        }
        String str3 = TAG;
        AbstractC3929dS.m17672e(str3);
        if (z) {
            AbstractC3929dS.m17672e(str3);
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.getId();
                }
                String str4 = TAG;
                parent.getClass().toString();
                AbstractC3929dS.m17672e(str4);
            }
        }
    }

    public void onViewStateDeleted(ViewState viewState) {
        G41 g41 = viewState.mStateWrapper;
        if (g41 != null) {
            g41.destroyState();
            viewState.mStateWrapper = null;
        }
        EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            viewState.mEventEmitter = null;
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewState.mIsRoot || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(viewState.mView);
    }

    public void addViewAt(int i, int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        View view = viewState.mView;
        if (!(view instanceof ViewGroup)) {
            StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Unable to add a view into a view that is not a ViewGroup. ParentTag: ", " - Tag: ", i, i2, " - Index: ");
            sbM8594m.append(i3);
            String string = sbM8594m.toString();
            AbstractC3929dS.m17672e(TAG);
            throw new IllegalStateException(string);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ViewState viewState2 = getViewState(i2);
        View view2 = viewState2.mView;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + viewState2 + " and tag " + i2);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z = parent instanceof ViewGroup;
            int id = z ? ((ViewGroup) parent).getId() : -1;
            String str = TAG;
            StringBuilder sbM8594m2 = AbstractC1374Vq.m8594m("addViewAt: cannot insert view [", "] into parent [", i2, i, "]: View already has a parent: [");
            sbM8594m2.append(id);
            sbM8594m2.append("]  Parent: ");
            sbM8594m2.append(parent.getClass().getSimpleName());
            sbM8594m2.append(" View: ");
            sbM8594m2.append(view2.getClass().getSimpleName());
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sbM8594m2.toString()));
            if (z) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.mErroneouslyReaddedReactTags.add(Integer.valueOf(i2));
        }
        try {
            getViewGroupManager(viewState).addView(viewGroup, view2, i3);
        } catch (IllegalStateException e) {
            StringBuilder sbM8594m3 = AbstractC1374Vq.m8594m("addViewAt: failed to insert view [", "] into parent [", i2, i, "] at index ");
            sbM8594m3.append(i3);
            throw new IllegalStateException(sbM8594m3.toString(), e);
        }
    }

    public void attachRootView(View view, S91 s91) {
        this.mThemedReactContext = s91;
        addRootView(view);
    }

    public void createView(String str, int i, ReadableMap readableMap, G41 g41, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null || nullableViewState.mView == null) {
            createViewUnsafe(str, i, readableMap, g41, eventEmitterWrapper, z);
        }
    }

    public void createViewUnsafe(String str, int i, ReadableMap readableMap, G41 g41, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        ViewManager viewManagerM4401a;
        View viewCreateView;
        NM0 nm0 = new NM0(readableMap);
        if (z) {
            viewManagerM4401a = this.mViewManagerRegistry.m4401a(str);
            viewCreateView = viewManagerM4401a.createView(i, this.mThemedReactContext, nm0, g41, this.mJSResponderHandler);
        } else {
            viewManagerM4401a = null;
            viewCreateView = null;
        }
        ViewState viewState = new ViewState(i, viewCreateView, viewManagerM4401a, 0);
        viewState.mCurrentProps = nm0;
        viewState.mStateWrapper = g41;
        viewState.mEventEmitter = eventEmitterWrapper;
        this.mTagToViewState.put(Integer.valueOf(i), viewState);
    }

    public void deleteView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException(AbstractC7222ym.m26230g(i, "Unable to find viewState for tag: ", " for deleteView")));
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i));
            onViewStateDeleted(nullableViewState);
        }
    }

    public void enqueuePendingEvent(int i, String str, boolean z, WritableMap writableMap, int i2) {
        ViewState viewState;
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null || (viewState = concurrentHashMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager.4
            final /* synthetic */ PendingViewEvent val$viewEvent;
            final /* synthetic */ ViewState val$viewState;

            public RunnableC19264(ViewState viewState2, PendingViewEvent pendingViewEvent) {
                viewState = viewState2;
                pendingViewEvent = pendingViewEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewState viewState2 = viewState;
                EventEmitterWrapper eventEmitterWrapper = viewState2.mEventEmitter;
                if (eventEmitterWrapper != null) {
                    pendingViewEvent.dispatch(eventEmitterWrapper);
                    return;
                }
                if (viewState2.mPendingEventQueue == null) {
                    viewState2.mPendingEventQueue = new LinkedList();
                }
                viewState.mPendingEventQueue.add(pendingViewEvent);
            }
        });
    }

    public S91 getContext() {
        return this.mThemedReactContext;
    }

    public EventEmitterWrapper getEventEmitter(int i) {
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null) {
            return null;
        }
        return nullableViewState.mEventEmitter;
    }

    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public View getView(int i) {
        ViewState nullableViewState = getNullableViewState(i);
        View view = nullableViewState == null ? null : nullableViewState.mView;
        if (view != null) {
            return view;
        }
        throw new C8810b60(AbstractC7222ym.m26230g(i, "Trying to resolve view with tag ", " which doesn't exist"));
    }

    public boolean getViewExists(int i) {
        C8932c31 c8932c31 = this.mTagSetForStoppedSurface;
        if (c8932c31 != null) {
            if (AbstractC7500Dp0.m1900a(c8932c31.f17276c, i, c8932c31.f17274a) >= 0) {
                return true;
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.mTagToViewState;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i));
    }

    public boolean isRootViewAttached() {
        return this.mRootViewAttached;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public void preallocateView(String str, int i, ReadableMap readableMap, G41 g41, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        UiThreadUtil.assertOnUiThread();
        if (!isStopped() && getNullableViewState(i) == null) {
            createViewUnsafe(str, i, readableMap, g41, eventEmitterWrapper, z);
        }
    }

    public void printSurfaceState() {
        AbstractC3929dS.m17673f(TAG, "Views created for surface {%d}:", Integer.valueOf(getSurfaceId()));
        for (ViewState viewState : this.mTagToViewState.values()) {
            ViewManager viewManager = viewState.mViewManager;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = viewState.mView;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            AbstractC3929dS.m17673f(TAG, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(viewState.mReactTag), numValueOf, Boolean.valueOf(viewState.mIsRoot));
        }
    }

    @Deprecated
    public void receiveCommand(int i, int i2, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException(AbstractC7222ym.m26229f(i, "Unable to find viewState for tag: [", i2, "] for commandId: "));
        }
        ViewManager viewManager = nullableViewState.mViewManager;
        if (viewManager == null) {
            throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewManager for tag "));
        }
        View view = nullableViewState.mView;
        if (view == null) {
            throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewState view for tag "));
        }
        viewManager.receiveCommand((ViewManager) view, i2, readableArray);
    }

    public void removeDeleteTreeAt(int i, int i2, int i3) {
        if (isStopped()) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException(AbstractC7222ym.m26230g(i2, "Unable to find viewState for tag: [", "] for removeDeleteTreeAt")));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Unable to remove+delete a view from a view that is not a ViewGroup. ParentTag: ", " - Tag: ", i2, i, " - Index: ");
            sbM8594m.append(i3);
            String string = sbM8594m.toString();
            AbstractC3929dS.m17672e(TAG);
            throw new IllegalStateException(string);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException(AbstractC7222ym.m26230g(i2, "Unable to find view for tag [", "]"));
        }
        I50 viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i3);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i) {
            int childCount = viewGroup.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i4 = -1;
                    break;
                } else if (viewGroup.getChildAt(i4).getId() == i) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                AbstractC3929dS.m17672e(TAG);
                return;
            }
            logViewHierarchy(viewGroup, true);
            String str = TAG;
            StringBuilder sbM8594m2 = AbstractC1374Vq.m8594m("Tried to remove+delete view [", "] of parent [", i, i2, "] at index ");
            sbM8594m2.append(i3);
            sbM8594m2.append(", but got view tag ");
            sbM8594m2.append(id);
            sbM8594m2.append(" - actual index of view: ");
            sbM8594m2.append(i4);
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sbM8594m2.toString()));
            i3 = i4;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i3);
            if (this.mReactTagsToRemove.empty()) {
                if (this.mRemoveDeleteTreeUIFrameCallback == null) {
                    this.mRemoveDeleteTreeUIFrameCallback = new RemoveDeleteTreeUIFrameCallback(this, this.mThemedReactContext, 0);
                }
                MJ0.m5303a().m5305c(5, this.mRemoveDeleteTreeUIFrameCallback);
            }
            this.mReactTagsToRemove.push(Integer.valueOf(i));
        } catch (RuntimeException e) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i3, "Cannot remove child at index ", " from parent ViewGroup [");
            sbM26237n.append(viewGroup.getId());
            sbM26237n.append("], only ");
            sbM26237n.append(childCount2);
            sbM26237n.append(" children in parent. Warning: childCount may be incorrect!");
            throw new IllegalStateException(sbM26237n.toString(), e);
        }
    }

    public void removeViewAt(int i, int i2, int i3) {
        if (isStopped()) {
            return;
        }
        if (this.mErroneouslyReaddedReactTags.contains(Integer.valueOf(i))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C8810b60(AbstractC7222ym.m26230g(i, "removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [", "]")));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(i2);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(MountingManager.TAG, new IllegalStateException(AbstractC7222ym.m26230g(i2, "Unable to find viewState for tag: [", "] for removeViewAt")));
            return;
        }
        View view = nullableViewState.mView;
        if (!(view instanceof ViewGroup)) {
            StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Unable to remove a view from a view that is not a ViewGroup. ParentTag: ", " - Tag: ", i2, i, " - Index: ");
            sbM8594m.append(i3);
            String string = sbM8594m.toString();
            AbstractC3929dS.m17672e(TAG);
            throw new IllegalStateException(string);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException(AbstractC7222ym.m26230g(i2, "Unable to find view for tag [", "]"));
        }
        I50 viewGroupManager = getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(viewGroup, i3);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i) {
            int childCount = viewGroup.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    i4 = -1;
                    break;
                } else if (viewGroup.getChildAt(i4).getId() == i) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                AbstractC3929dS.m17672e(TAG);
                return;
            }
            logViewHierarchy(viewGroup, true);
            String str = TAG;
            StringBuilder sbM8594m2 = AbstractC1374Vq.m8594m("Tried to remove view [", "] of parent [", i, i2, "] at index ");
            sbM8594m2.append(i3);
            sbM8594m2.append(", but got view tag ");
            sbM8594m2.append(id);
            sbM8594m2.append(" - actual index of view: ");
            sbM8594m2.append(i4);
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sbM8594m2.toString()));
            i3 = i4;
        }
        try {
            viewGroupManager.removeViewAt(viewGroup, i3);
        } catch (RuntimeException e) {
            int childCount2 = viewGroupManager.getChildCount(viewGroup);
            logViewHierarchy(viewGroup, true);
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i3, "Cannot remove child at index ", " from parent ViewGroup [");
            sbM26237n.append(viewGroup.getId());
            sbM26237n.append("], only ");
            sbM26237n.append(childCount2);
            sbM26237n.append(" children in parent. Warning: childCount may be incorrect!");
            throw new IllegalStateException(sbM26237n.toString(), e);
        }
    }

    public void scheduleMountItemOnViewAttach(MountItem mountItem) {
        this.mOnViewAttachMountItems.add(mountItem);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        if (viewState.mViewManager == null) {
            throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewState manager for tag "));
        }
        View view = viewState.mView;
        if (view == null) {
            throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewState view for tag "));
        }
        view.sendAccessibilityEvent(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i, int i2, boolean z) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        if (!z) {
            this.mJSResponderHandler.m2355a(i2, null);
            return;
        }
        ViewState viewState = getViewState(i);
        View view = viewState.mView;
        if (i2 != i && (view instanceof ViewParent)) {
            this.mJSResponderHandler.m2355a(i2, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i + "].");
            return;
        }
        if (viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i + "] that is a root view");
        }
        this.mJSResponderHandler.m2355a(i2, view.getParent());
    }

    public void stopSurface() {
        AbstractC3929dS.m17672e(TAG);
        if (isStopped()) {
            return;
        }
        this.mIsStopped = true;
        for (ViewState viewState : this.mTagToViewState.values()) {
            G41 g41 = viewState.mStateWrapper;
            if (g41 != null) {
                g41.destroyState();
                viewState.mStateWrapper = null;
            }
            EventEmitterWrapper eventEmitterWrapper = viewState.mEventEmitter;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                viewState.mEventEmitter = null;
            }
        }
        N61 n61 = new N61(1, this);
        if (UiThreadUtil.isOnUiThread()) {
            n61.run();
        } else {
            UiThreadUtil.runOnUiThread(n61);
        }
    }

    public void updateEventEmitter(int i, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState == null) {
            viewState = new ViewState(i, (View) null, (ViewManager) null, 0);
            this.mTagToViewState.put(Integer.valueOf(i), viewState);
        }
        EventEmitterWrapper eventEmitterWrapper2 = viewState.mEventEmitter;
        viewState.mEventEmitter = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue<PendingViewEvent> queue = viewState.mPendingEventQueue;
        if (queue != null) {
            Iterator<PendingViewEvent> it = queue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitterWrapper);
            }
            viewState.mPendingEventQueue = null;
        }
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unable to find View for tag: "));
        }
        if (AbstractC10874rB1.m24211b()) {
            int i9 = 1;
            if (i8 == 1) {
                i9 = 0;
            } else if (i8 != 2) {
                i9 = 2;
            }
            view.setLayoutDirection(i9);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof InterfaceC11293uT0) {
            parent.requestLayout();
        }
        NativeModule nativeModule = getViewState(i2).mViewManager;
        I50 i50 = nativeModule != null ? (I50) nativeModule : null;
        if (i50 == null || !i50.needsCustomLayoutForChildren()) {
            view.layout(i3, i4, i5 + i3, i6 + i4);
        }
        int i10 = i7 == 0 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public void updateOverflowInset(int i, int i2, int i3, int i4, int i5) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        if (viewState.mIsRoot) {
            return;
        }
        KeyEvent.Callback callback = viewState.mView;
        if (callback == null) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unable to find View for tag: "));
        }
        if (callback instanceof YL0) {
            ((YL0) callback).setOverflowInset(i2, i3, i4, i5);
        }
    }

    public void updatePadding(int i, int i2, int i3, int i4, int i5) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        if (viewState.mIsRoot) {
            return;
        }
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unable to find View for tag: "));
        }
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            viewManager.setPadding(view, i2, i3, i4, i5);
        } else {
            throw new IllegalStateException("Unable to find ViewManager for view: " + viewState);
        }
    }

    public void updateProps(int i, ReadableMap readableMap) {
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        viewState.mCurrentProps = new NM0(readableMap);
        View view = viewState.mView;
        if (view == null) {
            throw new IllegalStateException(AbstractC7222ym.m26230g(i, "Unable to find view for tag [", "]"));
        }
        ViewManager viewManager = viewState.mViewManager;
        UN1.m7999c(viewManager);
        viewManager.updateProperties(view, viewState.mCurrentProps);
    }

    public void updateState(int i, G41 g41) {
        UiThreadUtil.assertOnUiThread();
        if (isStopped()) {
            return;
        }
        ViewState viewState = getViewState(i);
        G41 g412 = viewState.mStateWrapper;
        viewState.mStateWrapper = g41;
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager == null) {
            throw new IllegalStateException(AbstractC11153tN0.m24909u(i, "Unable to find ViewManager for tag: "));
        }
        Object objUpdateState = viewManager.updateState(viewState.mView, viewState.mCurrentProps, g41);
        if (objUpdateState != null) {
            viewManager.updateExtraData(viewState.mView, objUpdateState);
        }
        if (g412 != null) {
            g412.destroyState();
        }
    }

    public void receiveCommand(int i, String str, ReadableArray readableArray) {
        if (isStopped()) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(i);
        if (nullableViewState != null) {
            ViewManager viewManager = nullableViewState.mViewManager;
            if (viewManager != null) {
                View view = nullableViewState.mView;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewState view for tag "));
            }
            throw new RetryableMountingLayerException(AbstractC11153tN0.m24909u(i, "Unable to find viewState manager for tag "));
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i + " for commandId: " + str);
    }
}

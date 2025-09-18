package com.facebook.react.fabric.mounting;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.RootViewManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.C7522Ea0;
import p000.ComponentCallbacks2C7803Jk1;
import p000.EnumC7813Jp1;
import p000.InterfaceC8534Xm0;
import p000.S91;

/* loaded from: classes.dex */
public class MountingManager {
    private static final int MAX_STOPPED_SURFACE_IDS_LENGTH = 15;
    public static final String TAG = "MountingManager";
    private SurfaceMountingManager mLastQueriedSurfaceMountingManager;
    private SurfaceMountingManager mMostRecentSurfaceMountingManager;
    private final MountItemExecutor mMountItemExecutor;
    private final ComponentCallbacks2C7803Jk1 mViewManagerRegistry;
    private final ConcurrentHashMap<Integer, SurfaceMountingManager> mSurfaceIdToManager = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<Integer> mStoppedSurfaceIds = new CopyOnWriteArrayList<>();
    private final C7522Ea0 mJSResponderHandler = new C7522Ea0();
    private final RootViewManager mRootViewManager = new RootViewManager();

    public interface MountItemExecutor {
        void executeItems(Queue<MountItem> queue);
    }

    public MountingManager(ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, MountItemExecutor mountItemExecutor) {
        this.mViewManagerRegistry = componentCallbacks2C7803Jk1;
        this.mMountItemExecutor = mountItemExecutor;
    }

    public void attachRootView(int i, View view, S91 s91) {
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(i, "attachView");
        if (surfaceManagerEnforced.isStopped()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            surfaceManagerEnforced.attachRootView(view, s91);
        }
    }

    public void clearJSResponder() {
        C7522Ea0 c7522Ea0 = this.mJSResponderHandler;
        c7522Ea0.f2787a = -1;
        ViewParent viewParent = c7522Ea0.f2788b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        c7522Ea0.f2788b = null;
    }

    public void enqueuePendingEvent(int i, int i2, String str, boolean z, WritableMap writableMap, int i3) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager == null) {
            return;
        }
        surfaceManager.enqueuePendingEvent(i2, str, z, writableMap, i3);
    }

    public EventEmitterWrapper getEventEmitter(int i, int i2) {
        SurfaceMountingManager surfaceManagerForView = i == -1 ? getSurfaceManagerForView(i2) : getSurfaceManager(i);
        if (surfaceManagerForView == null) {
            return null;
        }
        return surfaceManagerForView.getEventEmitter(i2);
    }

    public SurfaceMountingManager getSurfaceManager(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mLastQueriedSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getSurfaceId() == i) {
            return this.mLastQueriedSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager2 = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager2 != null && surfaceMountingManager2.getSurfaceId() == i) {
            return this.mMostRecentSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager3 = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        this.mLastQueriedSurfaceMountingManager = surfaceMountingManager3;
        return surfaceMountingManager3;
    }

    public SurfaceMountingManager getSurfaceManagerEnforced(int i, String str) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager != null) {
            return surfaceManager;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i + "]. Context: " + str);
    }

    public SurfaceMountingManager getSurfaceManagerForView(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getViewExists(i)) {
            return this.mMostRecentSurfaceMountingManager;
        }
        Iterator<Map.Entry<Integer, SurfaceMountingManager>> it = this.mSurfaceIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            SurfaceMountingManager value = it.next().getValue();
            if (value != this.mMostRecentSurfaceMountingManager && value.getViewExists(i)) {
                if (this.mMostRecentSurfaceMountingManager == null) {
                    this.mMostRecentSurfaceMountingManager = value;
                }
                return value;
            }
        }
        return null;
    }

    public SurfaceMountingManager getSurfaceManagerForViewEnforced(int i) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(i);
        if (surfaceManagerForView != null) {
            return surfaceManagerForView;
        }
        throw new RetryableMountingLayerException(AbstractC7222ym.m26230g(i, "Unable to find SurfaceMountingManager for tag: [", "]"));
    }

    public boolean getViewExists(int i) {
        return getSurfaceManagerForView(i) != null;
    }

    public boolean isWaitingForViewAttach(int i) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager == null || surfaceManager.isStopped()) {
            return false;
        }
        return !surfaceManager.isRootViewAttached();
    }

    public long measure(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        return this.mViewManagerRegistry.m4401a(str).measure(reactContext, readableMap, readableMap2, readableMap3, f, enumC7813Jp1, f2, enumC7813Jp12, fArr);
    }

    public long measureMapBuffer(ReactContext reactContext, String str, InterfaceC8534Xm0 interfaceC8534Xm0, InterfaceC8534Xm0 interfaceC8534Xm02, InterfaceC8534Xm0 interfaceC8534Xm03, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        return this.mViewManagerRegistry.m4401a(str).measure(reactContext, interfaceC8534Xm0, interfaceC8534Xm02, interfaceC8534Xm03, f, enumC7813Jp1, f2, enumC7813Jp12, fArr);
    }

    @Deprecated
    public void receiveCommand(int i, int i2, int i3, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i, "receiveCommand:int").receiveCommand(i2, i3, readableArray);
    }

    public void sendAccessibilityEvent(int i, int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        if (i == -1) {
            getSurfaceManagerForViewEnforced(i2).sendAccessibilityEvent(i2, i3);
        } else {
            getSurfaceManagerEnforced(i, "sendAccessibilityEvent").sendAccessibilityEvent(i2, i3);
        }
    }

    public SurfaceMountingManager startSurface(int i, S91 s91, View view) {
        SurfaceMountingManager surfaceMountingManager = new SurfaceMountingManager(i, this.mJSResponderHandler, this.mViewManagerRegistry, this.mRootViewManager, this.mMountItemExecutor, s91);
        this.mSurfaceIdToManager.putIfAbsent(Integer.valueOf(i), surfaceMountingManager);
        if (this.mSurfaceIdToManager.get(Integer.valueOf(i)) != surfaceMountingManager) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(AbstractC7222ym.m26230g(i, "Called startSurface more than once for the SurfaceId [", "]")));
        }
        this.mMostRecentSurfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        if (view != null) {
            surfaceMountingManager.attachRootView(view, s91);
        }
        return surfaceMountingManager;
    }

    public void stopSurface(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        if (surfaceMountingManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(AbstractC7222ym.m26230g(i, "Cannot call stopSurface on non-existent surface: [", "]")));
            return;
        }
        while (this.mStoppedSurfaceIds.size() >= 15) {
            Integer num = this.mStoppedSurfaceIds.get(0);
            ConcurrentHashMap<Integer, SurfaceMountingManager> concurrentHashMap = this.mSurfaceIdToManager;
            num.getClass();
            concurrentHashMap.remove(num);
            this.mStoppedSurfaceIds.remove(num);
            AbstractC3929dS.m17668a(num, TAG, "Removing stale SurfaceMountingManager: [%d]");
        }
        this.mStoppedSurfaceIds.add(Integer.valueOf(i));
        surfaceMountingManager.stopSurface();
        if (this.mMostRecentSurfaceMountingManager == surfaceMountingManager) {
            this.mMostRecentSurfaceMountingManager = null;
        }
        if (this.mLastQueriedSurfaceMountingManager == surfaceMountingManager) {
            this.mLastQueriedSurfaceMountingManager = null;
        }
    }

    public boolean surfaceIsStopped(int i) {
        if (this.mStoppedSurfaceIds.contains(Integer.valueOf(i))) {
            return true;
        }
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        return surfaceManager != null && surfaceManager.isStopped();
    }

    public void updateProps(int i, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        getSurfaceManagerForViewEnforced(i).updateProps(i, readableMap);
    }

    public void receiveCommand(int i, int i2, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i, "receiveCommand:string").receiveCommand(i2, str, readableArray);
    }
}

package com.facebook.react.internal.featureflags;

import kotlin.Metadata;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0005\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'J\b\u0010\f\u001a\u00020\u0003H'J\b\u0010\r\u001a\u00020\u0003H'J\b\u0010\u000e\u001a\u00020\u0003H'J\b\u0010\u000f\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0003H'J\b\u0010\u0011\u001a\u00020\u0003H'J\b\u0010\u0012\u001a\u00020\u0003H'J\b\u0010\u0013\u001a\u00020\u0003H'J\b\u0010\u0014\u001a\u00020\u0003H'J\b\u0010\u0015\u001a\u00020\u0003H'J\b\u0010\u0016\u001a\u00020\u0003H'J\b\u0010\u0017\u001a\u00020\u0003H'J\b\u0010\u0018\u001a\u00020\u0003H'J\b\u0010\u0019\u001a\u00020\u0003H'J\b\u0010\u001a\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "", "allowCollapsableChildren", "", "allowRecursiveCommitsWithSynchronousMountOnAndroid", "batchRenderingUpdatesInEventLoop", "commonTestFlag", "destroyFabricSurfacesInReactInstanceManager", "enableBackgroundExecutor", "enableCleanTextInputYogaNode", "enableGranularShadowTreeStateReconciliation", "enableMicrotasks", "enableSynchronousStateUpdates", "enableUIConsistency", "fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak", "forceBatchingMountItemsOnAndroid", "fuseboxEnabledDebug", "fuseboxEnabledRelease", "lazyAnimationCallbacks", "preventDoubleTextMeasure", "setAndroidLayoutDirection", "useImmediateExecutorInAndroidBridgeless", "useModernRuntimeScheduler", "useNativeViewConfigsInBridgelessMode", "useRuntimeShadowNodeReferenceUpdate", "useRuntimeShadowNodeReferenceUpdateOnLayout", "useStateAlignmentMechanism", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public interface ReactNativeFeatureFlagsProvider {
    @InterfaceC0965PK
    boolean allowCollapsableChildren();

    @InterfaceC0965PK
    boolean allowRecursiveCommitsWithSynchronousMountOnAndroid();

    @InterfaceC0965PK
    boolean batchRenderingUpdatesInEventLoop();

    @InterfaceC0965PK
    boolean commonTestFlag();

    @InterfaceC0965PK
    boolean destroyFabricSurfacesInReactInstanceManager();

    @InterfaceC0965PK
    boolean enableBackgroundExecutor();

    @InterfaceC0965PK
    boolean enableCleanTextInputYogaNode();

    @InterfaceC0965PK
    boolean enableGranularShadowTreeStateReconciliation();

    @InterfaceC0965PK
    boolean enableMicrotasks();

    @InterfaceC0965PK
    boolean enableSynchronousStateUpdates();

    @InterfaceC0965PK
    boolean enableUIConsistency();

    @InterfaceC0965PK
    boolean fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak();

    @InterfaceC0965PK
    boolean forceBatchingMountItemsOnAndroid();

    @InterfaceC0965PK
    boolean fuseboxEnabledDebug();

    @InterfaceC0965PK
    boolean fuseboxEnabledRelease();

    @InterfaceC0965PK
    boolean lazyAnimationCallbacks();

    @InterfaceC0965PK
    boolean preventDoubleTextMeasure();

    @InterfaceC0965PK
    boolean setAndroidLayoutDirection();

    @InterfaceC0965PK
    boolean useImmediateExecutorInAndroidBridgeless();

    @InterfaceC0965PK
    boolean useModernRuntimeScheduler();

    @InterfaceC0965PK
    boolean useNativeViewConfigsInBridgelessMode();

    @InterfaceC0965PK
    boolean useRuntimeShadowNodeReferenceUpdate();

    @InterfaceC0965PK
    boolean useRuntimeShadowNodeReferenceUpdateOnLayout();

    @InterfaceC0965PK
    boolean useStateAlignmentMechanism();
}

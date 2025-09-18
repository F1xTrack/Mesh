package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import p000.AbstractC3929dS;
import p000.G41;

/* loaded from: classes.dex */
final class PreAllocateViewMountItem implements MountItem {
    private final String mComponent;
    private final EventEmitterWrapper mEventEmitterWrapper;
    private final boolean mIsLayoutable;
    private final ReadableMap mProps;
    private final int mReactTag;
    private final G41 mStateWrapper;
    private final int mSurfaceId;

    public PreAllocateViewMountItem(int i, int i2, String str, ReadableMap readableMap, G41 g41, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        this.mComponent = FabricNameComponentMapping.getFabricComponentName(str);
        this.mSurfaceId = i;
        this.mProps = readableMap;
        this.mStateWrapper = g41;
        this.mEventEmitterWrapper = eventEmitterWrapper;
        this.mReactTag = i2;
        this.mIsLayoutable = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            AbstractC3929dS.m17672e(FabricUIManager.TAG);
        } else {
            surfaceManager.preallocateView(this.mComponent, this.mReactTag, this.mProps, this.mStateWrapper, this.mEventEmitterWrapper, this.mIsLayoutable);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.mReactTag + "] - component: " + this.mComponent + " surfaceId: " + this.mSurfaceId + " isLayoutable: " + this.mIsLayoutable;
    }
}

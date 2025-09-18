package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DispatchStringCommandMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "", "surfaceId", "reactTag", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "<init>", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "getSurfaceId", "()I", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "LTf1;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "toString", "()Ljava/lang/String;", "I", "Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DispatchStringCommandMountItem extends DispatchCommandMountItem {
    private final ReadableArray commandArgs;
    private final String commandId;
    private final int reactTag;
    private final int surfaceId;

    public DispatchStringCommandMountItem(int i, int i2, String str, ReadableArray readableArray) {
        O90.m5968f(str, "commandId");
        this.surfaceId = i;
        this.reactTag = i2;
        this.commandId = str;
        this.commandArgs = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        O90.m5968f(mountingManager, "mountingManager");
        mountingManager.receiveCommand(this.surfaceId, this.reactTag, this.commandId, this.commandArgs);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.reactTag + "] " + this.commandId;
    }
}

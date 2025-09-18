package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;
import kotlin.Metadata;
import p000.AbstractC7222ym;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/DispatchIntCommandMountItem;", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "", "surfaceId", "reactTag", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "<init>", "(IIILcom/facebook/react/bridge/ReadableArray;)V", "getSurfaceId", "()I", "Lcom/facebook/react/fabric/mounting/MountingManager;", "mountingManager", "LTf1;", "execute", "(Lcom/facebook/react/fabric/mounting/MountingManager;)V", "", "toString", "()Ljava/lang/String;", "I", "Lcom/facebook/react/bridge/ReadableArray;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DispatchIntCommandMountItem extends DispatchCommandMountItem {
    private final ReadableArray commandArgs;
    private final int commandId;
    private final int reactTag;
    private final int surfaceId;

    public DispatchIntCommandMountItem(int i, int i2, int i3, ReadableArray readableArray) {
        this.surfaceId = i;
        this.reactTag = i2;
        this.commandId = i3;
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
        return AbstractC7222ym.m26229f(this.reactTag, "DispatchIntCommandMountItem [", this.commandId, "] ");
    }
}

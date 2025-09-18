package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import kotlin.Metadata;
import p000.G41;
import p000.O90;

@Metadata(m22266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 2\u0006\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, m22267d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/MountItemFactory;", "", "<init>", "()V", "", "surfaceId", "reactTag", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "createDispatchCommandMountItem", "(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/DispatchCommandMountItem;", "eventType", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "createSendAccessibilityEventMountItem", "(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "component", "Lcom/facebook/react/bridge/ReadableMap;", "props", "LG41;", "stateWrapper", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "eventEmitterWrapper", "", "isLayoutable", "createPreAllocateViewMountItem", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;LG41;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "", "intBuf", "", "objBuf", "commitNumber", "createIntBufferBatchMountItem", "(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class MountItemFactory {
    public static final MountItemFactory INSTANCE = new MountItemFactory();

    private MountItemFactory() {
    }

    public static final DispatchCommandMountItem createDispatchCommandMountItem(int surfaceId, int reactTag, int commandId, ReadableArray commandArgs) {
        return new DispatchIntCommandMountItem(surfaceId, reactTag, commandId, commandArgs);
    }

    public static final MountItem createIntBufferBatchMountItem(int surfaceId, int[] intBuf, Object[] objBuf, int commitNumber) {
        O90.m5968f(intBuf, "intBuf");
        O90.m5968f(objBuf, "objBuf");
        return new IntBufferBatchMountItem(surfaceId, intBuf, objBuf, commitNumber);
    }

    public static final MountItem createPreAllocateViewMountItem(int surfaceId, int reactTag, String component, ReadableMap props, G41 stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean isLayoutable) {
        O90.m5968f(component, "component");
        return new PreAllocateViewMountItem(surfaceId, reactTag, component, props, stateWrapper, eventEmitterWrapper, isLayoutable);
    }

    public static final MountItem createSendAccessibilityEventMountItem(int surfaceId, int reactTag, int eventType) {
        return new SendAccessibilityEventMountItem(surfaceId, reactTag, eventType);
    }

    public static final DispatchCommandMountItem createDispatchCommandMountItem(int surfaceId, int reactTag, String commandId, ReadableArray commandArgs) {
        O90.m5968f(commandId, "commandId");
        return new DispatchStringCommandMountItem(surfaceId, reactTag, commandId, commandArgs);
    }
}

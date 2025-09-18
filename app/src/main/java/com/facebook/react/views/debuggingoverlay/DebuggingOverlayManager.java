package com.facebook.react.views.debuggingoverlay;

import com.facebook.react.uimanager.SimpleViewManager;
import kotlin.Metadata;
import p000.C0014AD;
import p000.C7250zD;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.S91;

@InterfaceC9101dL0(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m22267d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "LzD;", "<init>", "()V", "view", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "LTf1;", "receiveCommand", "(LzD;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "LS91;", "context", "createViewInstance", "(LS91;)LzD;", "getName", "()Ljava/lang/String;", "Companion", "AD", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DebuggingOverlayManager extends SimpleViewManager<C7250zD> {
    public static final C0014AD Companion = new C0014AD();
    public static final String REACT_CLASS = "DebuggingOverlay";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C7250zD createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new C7250zD(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0175, code lost:
    
        if (r11 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0177, code lost:
    
        r20.setTraceUpdates(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0170 A[SYNTHETIC] */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveCommand(p000.C7250zD r20, java.lang.String r21, com.facebook.react.bridge.ReadableArray r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager.receiveCommand(zD, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }
}

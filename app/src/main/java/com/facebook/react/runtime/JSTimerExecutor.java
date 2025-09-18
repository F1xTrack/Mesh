package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import p000.C7678Ha0;
import p000.InterfaceC10413nb0;
import p000.O90;

@DoNotStripAny
@Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0018"}, m22267d2 = {"Lcom/facebook/react/runtime/JSTimerExecutor;", "Lnb0;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lcom/facebook/react/bridge/WritableNativeArray;", "timerIDs", "LTf1;", "callTimers", "(Lcom/facebook/react/bridge/WritableNativeArray;)V", "Lcom/facebook/react/bridge/WritableArray;", "(Lcom/facebook/react/bridge/WritableArray;)V", "", "frameTime", "callIdleCallbacks", "(D)V", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "Lcom/facebook/jni/HybridData;", "Companion", "Ha0", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class JSTimerExecutor implements InterfaceC10413nb0 {
    private static final C7678Ha0 Companion = new C7678Ha0();
    private final HybridData mHybridData;

    static {
        SoLoader.m11076j("rninstance");
    }

    public JSTimerExecutor(HybridData hybridData) {
        O90.m5968f(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    private final native void callTimers(WritableNativeArray timerIDs);

    @Override // p000.InterfaceC10413nb0
    public void callIdleCallbacks(double frameTime) {
    }

    @Override // p000.InterfaceC10413nb0
    public void callTimers(WritableArray timerIDs) {
        O90.m5968f(timerIDs, "timerIDs");
        callTimers((WritableNativeArray) timerIDs);
    }

    public void emitTimeDriftWarning(String warningMessage) {
        O90.m5968f(warningMessage, "warningMessage");
    }
}

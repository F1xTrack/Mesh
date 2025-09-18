package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: bu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8910bu0 extends AbstractChoreographerFrameCallbackC9317f20 {

    /* renamed from: a */
    public final /* synthetic */ NativeAnimatedModule f17215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8910bu0(NativeAnimatedModule nativeAnimatedModule, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f17215a = nativeAnimatedModule;
    }

    @Override // p000.AbstractChoreographerFrameCallbackC9317f20
    public final void doFrameGuarded(long j) {
        NativeAnimatedModule nativeAnimatedModule = this.f17215a;
        try {
            nativeAnimatedModule.mEnqueuedAnimationOnFrame = false;
            C1881a nodesManager = nativeAnimatedModule.getNodesManager();
            boolean z = true;
            if (nodesManager != null) {
                if (nodesManager.f17880b.size() > 0 || nodesManager.f17881c.size() > 0) {
                    nodesManager.m10937n(j);
                }
            }
            if (nodesManager != null && nativeAnimatedModule.mReactChoreographer != null) {
                if (((C9773ib0) AbstractC10874rB1.f41370a).lazyAnimationCallbacks()) {
                    if (nodesManager.f17880b.size() <= 0 && nodesManager.f17881c.size() <= 0) {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                }
                nativeAnimatedModule.enqueueFrameCallback();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

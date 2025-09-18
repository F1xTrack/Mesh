package defpackage;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: bu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2412bu0 extends AbstractChoreographerFrameCallbackC3695f20 {
    public final /* synthetic */ NativeAnimatedModule a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2412bu0(NativeAnimatedModule nativeAnimatedModule, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.a = nativeAnimatedModule;
    }

    @Override // defpackage.AbstractChoreographerFrameCallbackC3695f20
    public final void doFrameGuarded(long j) {
        NativeAnimatedModule nativeAnimatedModule = this.a;
        try {
            nativeAnimatedModule.mEnqueuedAnimationOnFrame = false;
            a nodesManager = nativeAnimatedModule.getNodesManager();
            boolean z = true;
            if (nodesManager != null) {
                if (nodesManager.b.size() > 0 || nodesManager.c.size() > 0) {
                    nodesManager.n(j);
                }
            }
            if (nodesManager != null && nativeAnimatedModule.mReactChoreographer != null) {
                if (((C4375ib0) AbstractC6792rB1.a).lazyAnimationCallbacks()) {
                    if (nodesManager.b.size() <= 0 && nodesManager.c.size() <= 0) {
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

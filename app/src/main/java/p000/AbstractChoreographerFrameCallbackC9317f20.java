package p000;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;

/* renamed from: f20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractChoreographerFrameCallbackC9317f20 implements Choreographer.FrameCallback {
    private final ReactContext reactContext;

    public AbstractChoreographerFrameCallbackC9317f20(ReactContext reactContext) {
        O90.m5968f(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (RuntimeException e) {
            this.reactContext.handleException(e);
        }
    }

    public abstract void doFrameGuarded(long j);
}

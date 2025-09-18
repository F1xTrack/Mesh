package com.facebook.react.fabric;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lcom/facebook/react/fabric/GuardedFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "frameTimeNanos", "LTf1;", "doFrame", "(J)V", "doFrameGuarded", "Lcom/facebook/react/bridge/JSExceptionHandler;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public abstract class GuardedFrameCallback implements Choreographer.FrameCallback {
    private final JSExceptionHandler exceptionHandler;

    public GuardedFrameCallback(JSExceptionHandler jSExceptionHandler) {
        O90.m5968f(jSExceptionHandler, "exceptionHandler");
        this.exceptionHandler = jSExceptionHandler;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        try {
            doFrameGuarded(frameTimeNanos);
        } catch (RuntimeException e) {
            this.exceptionHandler.handleException(e);
        }
    }

    public abstract void doFrameGuarded(long frameTimeNanos);

    /* JADX WARN: Illegal instructions before constructor call */
    public GuardedFrameCallback(ReactContext reactContext) {
        O90.m5968f(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        O90.m5967e(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}

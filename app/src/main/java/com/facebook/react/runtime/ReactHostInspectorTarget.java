package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p000.ExecutorC1215TJ;
import p000.FK0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\r¨\u0006\u0019"}, m22267d2 = {"Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "Ljava/io/Closeable;", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHostImpl", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "Ljava/util/concurrent/Executor;", "executor", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/util/concurrent/Executor;)Lcom/facebook/jni/HybridData;", "LTf1;", "sendDebuggerResumeCommand", "()V", "close", "", "isValid", "()Z", "Lcom/facebook/react/runtime/ReactHostImpl;", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "FK0", "TJ", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactHostInspectorTarget implements Closeable {
    private static final FK0 Companion = new FK0();
    private final HybridData mHybridData;
    private final ReactHostImpl reactHostImpl;

    static {
        SoLoader.m11076j("rninstance");
    }

    public ReactHostInspectorTarget(ReactHostImpl reactHostImpl) {
        O90.m5968f(reactHostImpl, "reactHostImpl");
        this.reactHostImpl = reactHostImpl;
        this.mHybridData = initHybrid(reactHostImpl, new ExecutorC1215TJ(11));
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(ReactHostImpl reactHostImpl, Executor executor);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final native void sendDebuggerResumeCommand();
}

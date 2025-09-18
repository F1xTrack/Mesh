package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import p000.C10233mB0;
import p000.C4140gp;
import p000.InterfaceC0965PK;
import p000.O90;
import p000.OZ1;
import p000.RunnableC6246ja;
import p000.RunnableC6694qf;

@Metadata(m22266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m22267d2 = {"Lcom/mrousavy/camera/frameprocessors/VisionCameraProxy;", "", "", "jsContext", "Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;", "jsCallInvokerHolder", "Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;", "scheduler", "Lcom/facebook/jni/HybridData;", "initHybrid", "(JLcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/mrousavy/camera/frameprocessors/VisionCameraScheduler;)Lcom/facebook/jni/HybridData;", "", "viewId", "Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "frameProcessor", "LTf1;", "setFrameProcessor", "(ILcom/mrousavy/camera/frameprocessors/FrameProcessor;)V", "removeFrameProcessor", "(I)V", "", "name", "", "options", "Lcom/mrousavy/camera/frameprocessors/FrameProcessorPlugin;", "initFrameProcessorPlugin", "(Ljava/lang/String;Ljava/util/Map;)Lcom/mrousavy/camera/frameprocessors/FrameProcessorPlugin;", "mHybridData", "Lcom/facebook/jni/HybridData;", "react-native-vision-camera_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class VisionCameraProxy {

    /* renamed from: a */
    public final WeakReference f19671a;

    @Keep
    @InterfaceC0965PK
    private HybridData mHybridData;

    public VisionCameraProxy(ReactApplicationContext reactApplicationContext) {
        CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
        O90.m5966d(jSCallInvokerHolder, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.CallInvokerHolderImpl");
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) jSCallInvokerHolder;
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null) {
            throw new Error("JSI Runtime is null! VisionCamera does not yet support bridgeless mode..");
        }
        long j = javaScriptContextHolder.get();
        VisionCameraScheduler visionCameraScheduler = new VisionCameraScheduler();
        this.f19671a = new WeakReference(reactApplicationContext);
        this.mHybridData = initHybrid(j, callInvokerHolderImpl, visionCameraScheduler);
    }

    private final native HybridData initHybrid(long jsContext, CallInvokerHolderImpl jsCallInvokerHolder, VisionCameraScheduler scheduler);

    /* renamed from: a */
    public final C4140gp m12744a(int i) throws C10233mB0 {
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f19671a.get();
        C4140gp c4140gp = null;
        if (reactApplicationContext != null) {
            UIManager uIManagerM6095f = OZ1.m6095f(reactApplicationContext, i, true);
            c4140gp = (C4140gp) (uIManagerM6095f != null ? uIManagerM6095f.resolveView(i) : null);
        }
        if (c4140gp != null) {
            return c4140gp;
        }
        throw new C10233mB0(i);
    }

    @Keep
    @InterfaceC0965PK
    public final FrameProcessorPlugin initFrameProcessorPlugin(String name, Map<String, ? extends Object> options) {
        O90.m5968f(name, "name");
        O90.m5968f(options, "options");
        return FrameProcessorPluginRegistry.getPlugin(name, this, options);
    }

    @Keep
    @InterfaceC0965PK
    public final void removeFrameProcessor(int viewId) {
        UiThreadUtil.runOnUiThread(new RunnableC6246ja(this, viewId, 15));
    }

    @Keep
    @InterfaceC0965PK
    public final void setFrameProcessor(int viewId, FrameProcessor frameProcessor) {
        O90.m5968f(frameProcessor, "frameProcessor");
        UiThreadUtil.runOnUiThread(new RunnableC6694qf(this, viewId, frameProcessor, 15));
    }
}

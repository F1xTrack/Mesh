package p000;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;

/* renamed from: va0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11435va0 implements JavaScriptExecutorFactory {

    /* renamed from: a */
    public final String f44417a;

    /* renamed from: b */
    public final String f44418b;

    public C11435va0(String str, String str2) {
        O90.m5968f(str, "appName");
        O90.m5968f(str2, "deviceName");
        this.f44417a = str;
        this.f44418b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f44417a);
        writableNativeMap.putString("DeviceIdentity", this.f44418b);
        return new JSCExecutor(JSCExecutor.initHybrid(writableNativeMap));
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        O90.m5968f(str, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public final String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}

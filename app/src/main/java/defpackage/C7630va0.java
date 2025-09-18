package defpackage;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;

/* renamed from: va0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7630va0 implements JavaScriptExecutorFactory {
    public final String a;
    public final String b;

    public C7630va0(String str, String str2) {
        O90.f(str, "appName");
        O90.f(str2, "deviceName");
        this.a = str;
        this.b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.a);
        writableNativeMap.putString("DeviceIdentity", this.b);
        return new JSCExecutor(JSCExecutor.initHybrid(writableNativeMap));
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        O90.f(str, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public final String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}

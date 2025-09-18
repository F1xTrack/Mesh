package p000;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* loaded from: classes.dex */
public final class Y20 implements JavaScriptExecutorFactory {
    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create() {
        return new HermesExecutor();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public final String toString() {
        return "JSIExecutor+HermesRuntime";
    }
}

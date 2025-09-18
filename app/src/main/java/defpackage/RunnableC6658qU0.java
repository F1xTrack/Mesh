package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.rustorepush.RustorePushModule;
import com.rustorepush.RustorePushService;
import java.util.LinkedHashMap;
import ru.ok.tracer.profiler.sampling.SamplingProfiler;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: qU0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6658qU0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ RunnableC6658qU0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b;
        switch (this.a) {
            case 0:
                LinkedHashMap linkedHashMap = RustorePushService.l;
                O90.f(str, "$token");
                C1016Mu0 c1016Mu0 = RustorePushService.m;
                if (c1016Mu0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("token", str);
                    RustorePushModule rustorePushModule = (RustorePushModule) c1016Mu0.b;
                    ReactApplicationContext reactApplicationContext = rustorePushModule.getReactApplicationContext();
                    O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    rustorePushModule.sendEvent(reactApplicationContext, "ON_NEW_TOKEN", writableNativeMap);
                    break;
                }
                break;
            case 1:
                SamplingProfiler.commit$lambda$1(str);
                break;
            default:
                SystraceProfiler.commit$lambda$1(str);
                break;
        }
    }
}

package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.rustorepush.RustorePushModule;
import com.rustorepush.RustorePushService;
import java.util.LinkedHashMap;
import ru.p031ok.tracer.profiler.sampling.SamplingProfiler;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: qU0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC10783qU0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f40894a;

    /* renamed from: b */
    public final /* synthetic */ String f40895b;

    public /* synthetic */ RunnableC10783qU0(String str, int i) {
        this.f40894a = i;
        this.f40895b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f40895b;
        switch (this.f40894a) {
            case 0:
                LinkedHashMap linkedHashMap = RustorePushService.f20245l;
                O90.m5968f(str, "$token");
                C7978Mu0 c7978Mu0 = RustorePushService.f20246m;
                if (c7978Mu0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("token", str);
                    RustorePushModule rustorePushModule = (RustorePushModule) c7978Mu0.f7393b;
                    ReactApplicationContext reactApplicationContext = rustorePushModule.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
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

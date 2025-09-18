package p000;

import android.os.Process;
import android.widget.EditText;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.remoteconfig.RemoteConfigModule;
import com.rustorepush.RustorePushModule;
import com.rustorepush.RustorePushService;
import com.swmansion.reanimated.ReanimatedModule;
import io.appmetrica.analytics.impl.C5159h0;
import io.legere.pdfiumandroid.PdfiumCore;
import java.lang.ref.WeakReference;
import ru.p031ok.tracer.profiler.sampling.SamplingProfiler;
import ru.p031ok.tracer.profiler.systrace.SystraceHook$start$executingThread$1;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: A3 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0004A3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30a;

    public /* synthetic */ RunnableC0004A3(int i) {
        this.f30a = i;
    }

    /* renamed from: a */
    private final void m33a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        switch (this.f30a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f18003a;
                break;
            case 1:
                break;
            case 2:
                int i2 = C1433Wm.f13394g;
                break;
            case 3:
                WeakReference weakReference = AbstractC10468o12.f38689a;
                if (weakReference != null && (editText = (EditText) weakReference.get()) != null) {
                    if (!(editText instanceof C9099dK0)) {
                        editText.requestFocus();
                        break;
                    } else {
                        ((C9099dK0) editText).m17539h();
                        break;
                    }
                }
                break;
            case 4:
                PdfiumCore._init_$lambda$28();
                break;
            case 5:
                Process.setThreadPriority(0);
                ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
                break;
            case 6:
                Process.setThreadPriority(0);
                break;
            case 7:
                ReanimatedModule.lambda$new$1();
                break;
            case 8:
                GQ0 gq0 = DQ0.f2012b;
                if (gq0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("callback", "firstLoadComplete");
                    RemoteConfigModule remoteConfigModule = (RemoteConfigModule) gq0.f3735b;
                    ReactApplicationContext reactApplicationContext = remoteConfigModule.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    remoteConfigModule.sendEvent(reactApplicationContext, "FIRST_LOAD_COMPLETE", writableNativeMap);
                    break;
                }
                break;
            case 9:
                GQ0 gq02 = DQ0.f2012b;
                if (gq02 != null) {
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString("callback", "persistentStorageUpdated");
                    RemoteConfigModule remoteConfigModule2 = (RemoteConfigModule) gq02.f3735b;
                    ReactApplicationContext reactApplicationContext2 = remoteConfigModule2.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    remoteConfigModule2.sendEvent(reactApplicationContext2, "PERSISTENT_STORAGE_UPDATED", writableNativeMap2);
                    break;
                }
                break;
            case 10:
                GQ0 gq03 = DQ0.f2012b;
                if (gq03 != null) {
                    WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                    writableNativeMap3.putString("callback", "initComplete");
                    RemoteConfigModule remoteConfigModule3 = (RemoteConfigModule) gq03.f3735b;
                    ReactApplicationContext reactApplicationContext3 = remoteConfigModule3.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext3, "access$getReactApplicationContext(...)");
                    remoteConfigModule3.sendEvent(reactApplicationContext3, "INIT_COMPLETE", writableNativeMap3);
                    break;
                }
                break;
            case 11:
                C7978Mu0 c7978Mu0 = RustorePushService.f20246m;
                if (c7978Mu0 != null) {
                    WritableNativeMap writableNativeMap4 = new WritableNativeMap();
                    writableNativeMap4.putString("callback", "onDeletedMessages");
                    RustorePushModule rustorePushModule = (RustorePushModule) c7978Mu0.f7393b;
                    ReactApplicationContext reactApplicationContext4 = rustorePushModule.getReactApplicationContext();
                    O90.m5967e(reactApplicationContext4, "access$getReactApplicationContext(...)");
                    rustorePushModule.sendEvent(reactApplicationContext4, "ON_DELETED_MESSAGES", writableNativeMap4);
                    break;
                }
                break;
            case 12:
                SamplingProfiler.onStart$lambda$3();
                break;
            case 13:
                SamplingProfiler.abort$lambda$2();
                break;
            case 14:
                SystraceHook$start$executingThread$1.run$lambda$0();
                break;
            case 15:
                SystraceProfiler.abort$lambda$2();
                break;
            default:
                C5159h0.m20470e();
                break;
        }
    }
}

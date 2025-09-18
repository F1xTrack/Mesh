package defpackage;

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
import io.appmetrica.analytics.impl.C4586h0;
import io.legere.pdfiumandroid.PdfiumCore;
import java.lang.ref.WeakReference;
import ru.ok.tracer.profiler.sampling.SamplingProfiler;
import ru.ok.tracer.profiler.systrace.SystraceHook$start$executingThread$1;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;

/* loaded from: classes.dex */
public final /* synthetic */ class A3 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ A3(int i) {
        this.a = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 1:
                break;
            case 2:
                int i2 = C1771Wm.g;
                break;
            case 3:
                WeakReference weakReference = AbstractC6188o12.a;
                if (weakReference != null && (editText = (EditText) weakReference.get()) != null) {
                    if (!(editText instanceof C3370dK0)) {
                        editText.requestFocus();
                        break;
                    } else {
                        ((C3370dK0) editText).h();
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
                GQ0 gq0 = DQ0.b;
                if (gq0 != null) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("callback", "firstLoadComplete");
                    RemoteConfigModule remoteConfigModule = (RemoteConfigModule) gq0.b;
                    ReactApplicationContext reactApplicationContext = remoteConfigModule.getReactApplicationContext();
                    O90.e(reactApplicationContext, "access$getReactApplicationContext(...)");
                    remoteConfigModule.sendEvent(reactApplicationContext, "FIRST_LOAD_COMPLETE", writableNativeMap);
                    break;
                }
                break;
            case 9:
                GQ0 gq02 = DQ0.b;
                if (gq02 != null) {
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString("callback", "persistentStorageUpdated");
                    RemoteConfigModule remoteConfigModule2 = (RemoteConfigModule) gq02.b;
                    ReactApplicationContext reactApplicationContext2 = remoteConfigModule2.getReactApplicationContext();
                    O90.e(reactApplicationContext2, "access$getReactApplicationContext(...)");
                    remoteConfigModule2.sendEvent(reactApplicationContext2, "PERSISTENT_STORAGE_UPDATED", writableNativeMap2);
                    break;
                }
                break;
            case 10:
                GQ0 gq03 = DQ0.b;
                if (gq03 != null) {
                    WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                    writableNativeMap3.putString("callback", "initComplete");
                    RemoteConfigModule remoteConfigModule3 = (RemoteConfigModule) gq03.b;
                    ReactApplicationContext reactApplicationContext3 = remoteConfigModule3.getReactApplicationContext();
                    O90.e(reactApplicationContext3, "access$getReactApplicationContext(...)");
                    remoteConfigModule3.sendEvent(reactApplicationContext3, "INIT_COMPLETE", writableNativeMap3);
                    break;
                }
                break;
            case 11:
                C1016Mu0 c1016Mu0 = RustorePushService.m;
                if (c1016Mu0 != null) {
                    WritableNativeMap writableNativeMap4 = new WritableNativeMap();
                    writableNativeMap4.putString("callback", "onDeletedMessages");
                    RustorePushModule rustorePushModule = (RustorePushModule) c1016Mu0.b;
                    ReactApplicationContext reactApplicationContext4 = rustorePushModule.getReactApplicationContext();
                    O90.e(reactApplicationContext4, "access$getReactApplicationContext(...)");
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
                C4586h0.e();
                break;
        }
    }
}

package p000;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: Nv */
/* loaded from: classes.dex */
public final /* synthetic */ class C0876Nv implements InterfaceC9347fG0 {

    /* renamed from: a */
    public final /* synthetic */ int f8127a;

    public /* synthetic */ C0876Nv(int i) {
        this.f8127a = i;
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        switch (this.f8127a) {
            case 0:
                return Collections.emptySet();
            case 1:
                C10809qh0 c10809qh0 = ExecutorsRegistrar.f18445a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC0333FH(Executors.newFixedThreadPool(4, new ThreadFactoryC1522YB("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18448d.get());
            case 2:
                C10809qh0 c10809qh02 = ExecutorsRegistrar.f18445a;
                return new ScheduledExecutorServiceC0333FH(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1522YB("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f18448d.get());
            case 3:
                C10809qh0 c10809qh03 = ExecutorsRegistrar.f18445a;
                return new ScheduledExecutorServiceC0333FH(Executors.newCachedThreadPool(new ThreadFactoryC1522YB("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f18448d.get());
            case 4:
                C10809qh0 c10809qh04 = ExecutorsRegistrar.f18445a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1522YB("Firebase Scheduler", 0, null));
            case 5:
                LL0 ll0 = FirebaseMessaging.f18465l;
                return null;
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                return GaugeManager.lambda$new$0();
            case 8:
                return GaugeManager.lambda$new$1();
            default:
                Clock clock = C11159tQ0.f43063j;
            case 9:
                return null;
        }
    }
}

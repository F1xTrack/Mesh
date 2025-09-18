package defpackage;

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
public final /* synthetic */ class C1096Nv implements InterfaceC3739fG0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C1096Nv(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.emptySet();
            case 1:
                C6697qh0 c6697qh0 = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new FH(Executors.newFixedThreadPool(4, new YB("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                C6697qh0 c6697qh02 = ExecutorsRegistrar.a;
                return new FH(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new YB("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                C6697qh0 c6697qh03 = ExecutorsRegistrar.a;
                return new FH(Executors.newCachedThreadPool(new YB("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                C6697qh0 c6697qh04 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new YB("Firebase Scheduler", 0, null));
            case 5:
                LL0 ll0 = FirebaseMessaging.l;
                return null;
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                return GaugeManager.lambda$new$0();
            case 8:
                return GaugeManager.lambda$new$1();
            default:
                Clock clock = C7218tQ0.j;
            case 9:
                return null;
        }
    }
}

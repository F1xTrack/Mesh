package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import io.sentry.C5791O0;
import io.sentry.C5820Y0;
import io.sentry.C6054k;
import io.sentry.C6060m;
import io.sentry.C6115r0;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5810V;
import io.sentry.android.core.cache.C5860a;
import io.sentry.android.core.internal.gestures.C5871a;
import io.sentry.android.core.internal.util.C5882b;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.C5926c;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.C5993e;
import io.sentry.cache.C5996h;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.internal.modules.C6050f;
import io.sentry.transport.C6156h;
import io.sentry.util.C6170c;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.n */
/* loaded from: classes2.dex */
public abstract class AbstractC5898n {
    /* renamed from: a */
    public static void m21599a(SentryAndroidOptions sentryAndroidOptions, Context context, C5832D c5832d, C5847T c5847t, C5863e c5863e) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C6156h)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C5860a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C6115r0) {
            sentryAndroidOptions.setConnectionStatusProvider(new C5820Y0(context, sentryAndroidOptions.getLogger(), c5832d));
        }
        sentryAndroidOptions.addEventProcessor(new C6054k(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5833E(context, c5832d, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5848U(sentryAndroidOptions, c5863e));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c5832d));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5912u(context, c5832d, sentryAndroidOptions));
        sentryAndroidOptions.setTransportGate(new C5832D(sentryAndroidOptions));
        synchronized (C5905e.m21604c()) {
            try {
                InterfaceC5810V interfaceC5810VM21605a = C5905e.m21604c().m21605a();
                if (interfaceC5810VM21605a != null) {
                    sentryAndroidOptions.setTransactionProfiler(interfaceC5810VM21605a);
                    C5905e.m21604c().m21608e();
                } else {
                    C5893m frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC6003a.m21735D(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setTransactionProfiler(new C5908q(context, sentryAndroidOptions, c5832d, frameMetricsCollector));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sentryAndroidOptions.setModulesLoader(new C6050f(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new C6042c(context, sentryAndroidOptions.getLogger()));
        boolean zM21544a = C5847T.m21544a(sentryAndroidOptions, "androidx.core.view.ScrollingView");
        boolean zM21544a2 = C5847T.m21544a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C5871a(zM21544a));
            if (zM21544a2 && C5847T.m21544a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM21544a2 && C5847T.m21544a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(C5882b.f33751b);
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C5896l());
            sentryAndroidOptions.addPerformanceCollector(new C5870i(sentryAndroidOptions.getLogger(), c5832d));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                C5893m frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                AbstractC6003a.m21735D(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new C5864e0(sentryAndroidOptions, frameMetricsCollector2));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C6060m(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            if (sentryAndroidOptions.isEnableScopePersistence()) {
                sentryAndroidOptions.addScopeObserver(new C5996h(sentryAndroidOptions));
            }
            sentryAndroidOptions.addOptionsObserver(new C5993e(sentryAndroidOptions));
        }
    }

    /* renamed from: b */
    public static void m21600b(Context context, SentryAndroidOptions sentryAndroidOptions, C5832D c5832d, C5847T c5847t, C5863e c5863e, boolean z, boolean z2, boolean z3) {
        C6170c c6170c = new C6170c(new C5897m(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C5791O0(new C5897m(sentryAndroidOptions), 0), c6170c));
        sentryAndroidOptions.addIntegration(new NdkIntegration(C5847T.m21545b("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m21523m());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C5791O0(new C5897m(sentryAndroidOptions), 1), c6170c));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AbstractC5911t.m21622c(context, c5832d));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c5832d, c5863e));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, sentryAndroidOptions.getLogger(), c5832d));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            replayIntegration.mo21393o(new C5926c());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }
}

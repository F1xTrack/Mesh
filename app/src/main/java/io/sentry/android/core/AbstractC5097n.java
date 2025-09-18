package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import io.sentry.C5137k;
import io.sentry.C5143m;
import io.sentry.C5165r0;
import io.sentry.EnumC5148n1;
import io.sentry.O0;
import io.sentry.Y0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5097n {
    public static void a(SentryAndroidOptions sentryAndroidOptions, Context context, D d, T t, C5088e c5088e) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.h)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C5165r0) {
            sentryAndroidOptions.setConnectionStatusProvider(new Y0(context, sentryAndroidOptions.getLogger(), d));
        }
        sentryAndroidOptions.addEventProcessor(new C5137k(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new E(context, d, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new U(sentryAndroidOptions, c5088e));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, d));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C5103u(context, d, sentryAndroidOptions));
        sentryAndroidOptions.setTransportGate(new D(sentryAndroidOptions));
        synchronized (io.sentry.android.core.performance.e.c()) {
            try {
                io.sentry.V vA = io.sentry.android.core.performance.e.c().a();
                if (vA != null) {
                    sentryAndroidOptions.setTransactionProfiler(vA);
                    io.sentry.android.core.performance.e.c().e();
                } else {
                    io.sentry.android.core.internal.util.m frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.config.a.D(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setTransactionProfiler(new C5100q(context, sentryAndroidOptions, d, frameMetricsCollector));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(context, sentryAndroidOptions.getLogger()));
        boolean zA = T.a(sentryAndroidOptions, "androidx.core.view.ScrollingView");
        boolean zA2 = T.a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(zA));
            if (zA2 && T.a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zA2 && T.a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(io.sentry.android.core.internal.util.b.b);
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C5095l());
            sentryAndroidOptions.addPerformanceCollector(new C5092i(sentryAndroidOptions.getLogger(), d));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.m frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.config.a.D(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new e0(sentryAndroidOptions, frameMetricsCollector2));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C5143m(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            if (sentryAndroidOptions.isEnableScopePersistence()) {
                sentryAndroidOptions.addScopeObserver(new io.sentry.cache.h(sentryAndroidOptions));
            }
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
    }

    public static void b(Context context, SentryAndroidOptions sentryAndroidOptions, D d, T t, C5088e c5088e, boolean z, boolean z2, boolean z3) {
        io.sentry.util.c cVar = new io.sentry.util.c(new C5096m(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new O0(new C5096m(sentryAndroidOptions), 0), cVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(T.b("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new O0(new C5096m(sentryAndroidOptions), 1), cVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AbstractC5102t.c(context, d));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, d, c5088e));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, sentryAndroidOptions.getLogger(), d));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            replayIntegration.o(new io.sentry.android.replay.c());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }
}

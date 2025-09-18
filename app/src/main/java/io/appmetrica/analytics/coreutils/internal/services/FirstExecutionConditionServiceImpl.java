package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a */
    private final ArrayList f29727a = new ArrayList();

    /* renamed from: b */
    private UtilityServiceConfiguration f29728b;

    /* renamed from: c */
    final UtilityServiceProvider f29729c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a */
        private boolean f29730a = false;

        /* renamed from: b */
        private long f29731b;

        /* renamed from: c */
        private long f29732c;

        /* renamed from: d */
        private long f29733d;

        /* renamed from: e */
        private final FirstExecutionDelayChecker f29734e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            this.f29734e = firstExecutionDelayChecker;
            this.f29732c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f29731b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f29733d = Long.MAX_VALUE;
            this.tag = str;
        }

        /* renamed from: a */
        public final void m19161a(long j) {
            this.f29733d = TimeUnit.SECONDS.toMillis(j);
        }

        /* renamed from: b */
        public final boolean m19163b() {
            if (this.f29730a) {
                return true;
            }
            return this.f29734e.delaySinceFirstStartupWasPassed(this.f29732c, this.f29731b, this.f29733d);
        }

        /* renamed from: a */
        public final void m19160a() {
            this.f29730a = true;
        }

        /* renamed from: a */
        public final void m19162a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f29732c = utilityServiceConfiguration.getInitialConfigTime();
            this.f29731b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j, long j2, long j3) {
            return j2 - j >= j3;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a */
        private final FirstExecutionConditionChecker f29735a;

        /* renamed from: b */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f29736b;

        /* renamed from: c */
        private final ICommonExecutor f29737c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zM19163b = this.f29735a.m19163b();
            if (zM19163b) {
                this.f29735a.m19160a();
            }
            return zM19163b;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j) {
            this.f29735a.m19161a(j);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j) {
            if (!this.f29735a.m19163b()) {
                return false;
            }
            this.f29736b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j), this.f29737c);
            this.f29735a.m19160a();
            return true;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f29735a.m19162a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f29736b = activationBarrierHelper;
            this.f29735a = firstExecutionConditionChecker;
            this.f29737c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(UtilityServiceProvider utilityServiceProvider) {
        this.f29729c = utilityServiceProvider;
    }

    /* renamed from: a */
    public final synchronized FirstExecutionHandler m19159a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f29727a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    public synchronized FirstExecutionDelayedTask createDelayedTask(String str, ICommonExecutor iCommonExecutor, Runnable runnable) {
        return m19159a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f29729c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f29728b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f29728b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f29727a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}

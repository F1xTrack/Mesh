package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import com.yandex.metrica.impl.ob.P6;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.Y0;
import io.sentry.android.core.NetworkBreadcrumbsIntegration;
import io.sentry.android.core.S;

/* loaded from: classes2.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JobParameters jobParameters = (JobParameters) this.b;
                int i = ConfigurationJobService.d;
                ConfigurationJobService configurationJobService = (ConfigurationJobService) this.c;
                configurationJobService.getClass();
                while (true) {
                    try {
                        JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork == null) {
                            return;
                        }
                        Intent intent = jobWorkItemDequeueWork.getIntent();
                        if (intent != null) {
                            P6 p6 = (P6) configurationJobService.c.get(intent.getAction());
                            if (p6 != null) {
                                configurationJobService.a.a(p6, intent.getExtras(), new o(configurationJobService, jobParameters, jobWorkItemDequeueWork));
                            } else {
                                jobParameters.completeWork(jobWorkItemDequeueWork);
                            }
                        } else {
                            jobParameters.completeWork(jobWorkItemDequeueWork);
                        }
                    } catch (Throwable unused) {
                        configurationJobService.jobFinished(jobParameters, true);
                        return;
                    }
                }
            default:
                if (((NetworkBreadcrumbsIntegration) this.c).e) {
                    return;
                }
                synchronized (((NetworkBreadcrumbsIntegration) this.c).d) {
                    try {
                        ((NetworkBreadcrumbsIntegration) this.c).g = new S(((NetworkBreadcrumbsIntegration) this.c).b, ((D1) this.b).getDateProvider());
                        NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.c;
                        if (Y0.r(networkBreadcrumbsIntegration.a, networkBreadcrumbsIntegration.c, networkBreadcrumbsIntegration.b, networkBreadcrumbsIntegration.g)) {
                            ((NetworkBreadcrumbsIntegration) this.c).c.k(EnumC5148n1.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                            io.sentry.config.a.a("NetworkBreadcrumbs");
                        } else {
                            ((NetworkBreadcrumbsIntegration) this.c).c.k(EnumC5148n1.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}

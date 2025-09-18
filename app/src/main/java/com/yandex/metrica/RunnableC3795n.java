package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import com.yandex.metrica.impl.p022ob.AbstractC2848P6;
import io.sentry.C5759D1;
import io.sentry.C5820Y0;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5846S;
import io.sentry.android.core.NetworkBreadcrumbsIntegration;
import io.sentry.config.AbstractC6003a;

/* renamed from: com.yandex.metrica.n */
/* loaded from: classes2.dex */
public final class RunnableC3795n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25475a;

    /* renamed from: b */
    public final /* synthetic */ Object f25476b;

    /* renamed from: c */
    public final /* synthetic */ Object f25477c;

    public /* synthetic */ RunnableC3795n(Object obj, int i, Object obj2) {
        this.f25475a = i;
        this.f25477c = obj;
        this.f25476b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25475a) {
            case 0:
                JobParameters jobParameters = (JobParameters) this.f25476b;
                int i = ConfigurationJobService.f20725d;
                ConfigurationJobService configurationJobService = (ConfigurationJobService) this.f25477c;
                configurationJobService.getClass();
                while (true) {
                    try {
                        JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork == null) {
                            return;
                        }
                        Intent intent = jobWorkItemDequeueWork.getIntent();
                        if (intent != null) {
                            AbstractC2848P6 abstractC2848P6 = (AbstractC2848P6) configurationJobService.f20728c.get(intent.getAction());
                            if (abstractC2848P6 != null) {
                                configurationJobService.f20726a.m14420a(abstractC2848P6, intent.getExtras(), new C3796o(configurationJobService, jobParameters, jobWorkItemDequeueWork));
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
                if (((NetworkBreadcrumbsIntegration) this.f25477c).f33571e) {
                    return;
                }
                synchronized (((NetworkBreadcrumbsIntegration) this.f25477c).f33570d) {
                    try {
                        ((NetworkBreadcrumbsIntegration) this.f25477c).f33573g = new C5846S(((NetworkBreadcrumbsIntegration) this.f25477c).f33568b, ((C5759D1) this.f25476b).getDateProvider());
                        NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.f25477c;
                        if (C5820Y0.m21478r(networkBreadcrumbsIntegration.f33567a, networkBreadcrumbsIntegration.f33569c, networkBreadcrumbsIntegration.f33568b, networkBreadcrumbsIntegration.f33573g)) {
                            ((NetworkBreadcrumbsIntegration) this.f25477c).f33569c.mo21407k(EnumC6069n1.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                            AbstractC6003a.m21742a("NetworkBreadcrumbs");
                        } else {
                            ((NetworkBreadcrumbsIntegration) this.f25477c).f33569c.mo21407k(EnumC6069n1.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}

package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationJobService;

@TargetApi(26)
/* loaded from: classes2.dex */
public class D6 implements H6, E6 {
    private final Context a;
    private final JobScheduler b;

    public D6(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a(long j, boolean z) {
        JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j);
        if (z) {
            minimumLatency.setOverrideDeadline(j);
        }
        JobScheduler jobScheduler = this.b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(minimumLatency.build());
            } catch (Throwable unused) {
            }
        }
    }

    public D6(Context context, JobScheduler jobScheduler) {
        this.a = context;
        this.b = jobScheduler;
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a() {
        JobScheduler jobScheduler = this.b;
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(1512302345);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.E6
    public void a(Bundle bundle) {
        JobInfo jobInfoBuild = new JobInfo.Builder(1512302346, new ComponentName(this.a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10L).build();
        JobScheduler jobScheduler = this.b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(jobInfoBuild);
            } catch (Throwable unused) {
            }
        }
    }
}

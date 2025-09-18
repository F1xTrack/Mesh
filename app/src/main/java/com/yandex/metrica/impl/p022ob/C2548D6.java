package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationJobService;

@TargetApi(26)
/* renamed from: com.yandex.metrica.impl.ob.D6 */
/* loaded from: classes2.dex */
public class C2548D6 implements InterfaceC2648H6, InterfaceC2573E6 {

    /* renamed from: a */
    private final Context f21006a;

    /* renamed from: b */
    private final JobScheduler f21007b;

    public C2548D6(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2648H6
    /* renamed from: a */
    public void mo13983a(long j, boolean z) {
        JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.f21006a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j);
        if (z) {
            minimumLatency.setOverrideDeadline(j);
        }
        JobScheduler jobScheduler = this.f21007b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(minimumLatency.build());
            } catch (Throwable unused) {
            }
        }
    }

    public C2548D6(Context context, JobScheduler jobScheduler) {
        this.f21006a = context;
        this.f21007b = jobScheduler;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2648H6
    /* renamed from: a */
    public void mo13982a() {
        JobScheduler jobScheduler = this.f21007b;
        if (jobScheduler != null) {
            try {
                jobScheduler.cancel(1512302345);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2573E6
    /* renamed from: a */
    public void mo13984a(Bundle bundle) {
        JobInfo jobInfoBuild = new JobInfo.Builder(1512302346, new ComponentName(this.f21006a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10L).build();
        JobScheduler jobScheduler = this.f21007b;
        if (jobScheduler != null) {
            try {
                jobScheduler.schedule(jobInfoBuild);
            } catch (Throwable unused) {
            }
        }
    }
}

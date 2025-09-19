package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p000.AbstractC11770yD0;
import p000.C1236Te;
import p000.C8539Xo1;
import p000.C8575Yg1;
import p000.C8877bd1;
import p000.RunnableC1096RQ;
import p000.RunnableC6234jO;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a */
    public static final /* synthetic */ int f18004a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C8877bd1.m10476b(getApplicationContext());
        C8539Xo1 c8539Xo1M7707a = C1236Te.m7707a();
        c8539Xo1M7707a.m9134Q(string);
        c8539Xo1M7707a.f13983d = AbstractC11770yD0.m26101b(i);
        if (string2 != null) {
            c8539Xo1M7707a.f13982c = Base64.decode(string2, 0);
        }
        C8575Yg1 c8575Yg1 = C8877bd1.m10475a().f17105d;
        C1236Te c1236TeM9144m = c8539Xo1M7707a.m9144m();
        RunnableC1096RQ runnableC1096RQ = new RunnableC1096RQ(this, 12, jobParameters);
        c8575Yg1.getClass();
        c8575Yg1.f14447e.execute(new RunnableC6234jO(c8575Yg1, c1236TeM9144m, i2, runnableC1096RQ));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package com.yandex.metrica;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.impl.p022ob.AbstractC2848P6;
import com.yandex.metrica.impl.p022ob.C2548D6;
import com.yandex.metrica.impl.p022ob.C2698J6;
import com.yandex.metrica.impl.p022ob.C2798N6;
import com.yandex.metrica.impl.p022ob.C2842P0;
import com.yandex.metrica.impl.p022ob.C2873Q6;
import com.yandex.metrica.impl.p022ob.C2897R6;
import com.yandex.metrica.impl.p022ob.C3581rn;
import io.sentry.C6059l1;
import java.util.HashMap;
import java.util.Locale;

@TargetApi(26)
/* loaded from: classes2.dex */
public class ConfigurationJobService extends JobService {

    /* renamed from: d */
    public static final /* synthetic */ int f20725d = 0;

    /* renamed from: a */
    public C2698J6 f20726a;

    /* renamed from: b */
    public final SparseArray f20727b = new SparseArray();

    /* renamed from: c */
    public final HashMap f20728c = new HashMap();

    public boolean complexJob(int i) {
        return i == 1512302347;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C2842P0.m14727a(getApplicationContext());
        Context applicationContext = getApplicationContext();
        Locale locale = Locale.US;
        applicationContext.getPackageName();
        this.f20726a = new C2698J6();
        C2798N6 c2798n6 = new C2798N6(getApplicationContext(), this.f20726a.m14418a(), new C2548D6(applicationContext));
        SparseArray sparseArray = this.f20727b;
        sparseArray.append(1512302345, new C2873Q6(getApplicationContext(), c2798n6));
        sparseArray.append(1512302346, new C2897R6(getApplicationContext(), c2798n6));
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        try {
            try {
                if (complexJob(jobParameters.getJobId())) {
                    ((C3581rn) this.f20726a.m14418a()).execute(new RunnableC3795n(this, 0, jobParameters));
                } else {
                    AbstractC2848P6 abstractC2848P6 = (AbstractC2848P6) this.f20727b.get(jobParameters.getJobId());
                    if (abstractC2848P6 == null) {
                        return false;
                    }
                    this.f20726a.m14420a(abstractC2848P6, jobParameters.getTransientExtras(), new C6059l1(this, jobParameters));
                }
                return true;
            } catch (Throwable unused) {
                jobFinished(jobParameters, false);
                return false;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return jobParameters != null && complexJob(jobParameters.getJobId());
    }
}

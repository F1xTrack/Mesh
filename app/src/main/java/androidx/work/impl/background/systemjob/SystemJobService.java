package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import p000.C10910rT1;
import p000.C11499w41;
import p000.C1210TE;
import p000.C4238iN;
import p000.C7551Eo1;
import p000.C7863Ko1;
import p000.InterfaceC3989eQ;
import p000.W71;
import p000.X71;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC3989eQ {

    /* renamed from: a */
    public C7863Ko1 f16587a;

    /* renamed from: b */
    public final HashMap f16588b = new HashMap();

    /* renamed from: c */
    public final C4238iN f16589c = new C4238iN(27, (byte) 0);

    static {
        C1210TE.m7637M("SystemJobService");
    }

    /* renamed from: b */
    public static C7551Eo1 m10336b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C7551Eo1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        JobParameters jobParameters;
        C1210TE.m7634G().getClass();
        synchronized (this.f16588b) {
            jobParameters = (JobParameters) this.f16588b.remove(c7551Eo1);
        }
        this.f16589c.m19020y(c7551Eo1);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(getApplicationContext());
            this.f16587a = c7863Ko1M4736d;
            c7863Ko1M4736d.f6319f.m6258b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            C1210TE.m7634G().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C7863Ko1 c7863Ko1 = this.f16587a;
        if (c7863Ko1 != null) {
            c7863Ko1.f6319f.m6262g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C10910rT1 c10910rT1;
        if (this.f16587a == null) {
            C1210TE.m7634G().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C7551Eo1 c7551Eo1M10336b = m10336b(jobParameters);
        if (c7551Eo1M10336b == null) {
            C1210TE.m7634G().getClass();
            return false;
        }
        synchronized (this.f16588b) {
            try {
                if (this.f16588b.containsKey(c7551Eo1M10336b)) {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    c7551Eo1M10336b.toString();
                    c1210teM7634G.getClass();
                    return false;
                }
                C1210TE c1210teM7634G2 = C1210TE.m7634G();
                c7551Eo1M10336b.toString();
                c1210teM7634G2.getClass();
                this.f16588b.put(c7551Eo1M10336b, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    c10910rT1 = new C10910rT1(29);
                    if (W71.m8672b(jobParameters) != null) {
                        c10910rT1.f41679c = Arrays.asList(W71.m8672b(jobParameters));
                    }
                    if (W71.m8671a(jobParameters) != null) {
                        c10910rT1.f41678b = Arrays.asList(W71.m8671a(jobParameters));
                    }
                    if (i >= 28) {
                        c10910rT1.f41680d = X71.m8935a(jobParameters);
                    }
                } else {
                    c10910rT1 = null;
                }
                this.f16587a.m4739g(this.f16589c.m19009A(c7551Eo1M10336b), c10910rT1);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f16587a == null) {
            C1210TE.m7634G().getClass();
            return true;
        }
        C7551Eo1 c7551Eo1M10336b = m10336b(jobParameters);
        if (c7551Eo1M10336b == null) {
            C1210TE.m7634G().getClass();
            return false;
        }
        C1210TE c1210teM7634G = C1210TE.m7634G();
        c7551Eo1M10336b.toString();
        c1210teM7634G.getClass();
        synchronized (this.f16588b) {
            this.f16588b.remove(c7551Eo1M10336b);
        }
        C11499w41 c11499w41M19020y = this.f16589c.m19020y(c7551Eo1M10336b);
        if (c11499w41M19020y != null) {
            this.f16587a.m4740h(c11499w41M19020y);
        }
        return !this.f16587a.f6319f.m6260e(c7551Eo1M10336b.f2911a);
    }
}

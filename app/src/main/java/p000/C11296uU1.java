package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: uU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11296uU1 extends AbstractC9608hI1 {

    /* renamed from: d */
    public JobScheduler f43706d;

    /* renamed from: C1 */
    public final void m25196C1(long j) {
        m18793A1();
        mo7681v1();
        JobScheduler jobScheduler = this.f43706d;
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (jobScheduler != null) {
            if (jobScheduler.getPendingJob(("measurement-client" + c9110dP1.f26031a.getPackageName()).hashCode()) != null) {
                mo6070n().f8386o.m24555d("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        YK1 yk1M25197D1 = m25197D1();
        if (yk1M25197D1 != YK1.CLIENT_UPLOAD_ELIGIBLE) {
            mo6070n().f8386o.m24554c(yk1M25197D1.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        mo6070n().f8386o.m24554c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(NotificationConstants.ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
        mo6070n().f8386o.m24554c(((JobScheduler) Preconditions.checkNotNull(this.f43706d)).schedule(new JobInfo.Builder(("measurement-client" + c9110dP1.f26031a.getPackageName()).hashCode(), new ComponentName(c9110dP1.f26031a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* renamed from: D1 */
    public final YK1 m25197D1() {
        m18793A1();
        mo7681v1();
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!c9110dP1.f26037g.m6511E1(null, IB1.f4753M0)) {
            return YK1.CLIENT_FLAG_OFF;
        }
        if (this.f43706d == null) {
            return YK1.MISSING_JOB_SCHEDULER;
        }
        C8143Py1 c8143Py1 = c9110dP1.f26037g;
        Boolean boolM6510D1 = c8143Py1.m6510D1("google_analytics_sgtm_upload_enabled");
        return !(boolM6510D1 == null ? false : boolM6510D1.booleanValue()) ? YK1.NOT_ENABLED_IN_MANIFEST : !c8143Py1.m6511E1(null, IB1.f4757O0) ? YK1.SDK_TOO_OLD : !C10282mZ1.m22857s2(c9110dP1.f26031a, "com.google.android.gms.measurement.AppMeasurementJobService") ? YK1.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT < 24 ? YK1.ANDROID_TOO_OLD : !c9110dP1.m17601o().m10749K1() ? YK1.NON_PLAY_MODE : YK1.CLIENT_UPLOAD_ELIGIBLE;
    }

    @Override // p000.AbstractC9608hI1
    /* renamed from: z1 */
    public final boolean mo2654z1() {
        return true;
    }
}

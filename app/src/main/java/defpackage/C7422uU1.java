package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.rn.push.constants.NotificationConstants;

/* renamed from: uU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7422uU1 extends AbstractC4128hI1 {
    public JobScheduler d;

    public final void C1(long j) {
        A1();
        v1();
        JobScheduler jobScheduler = this.d;
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (jobScheduler != null) {
            if (jobScheduler.getPendingJob(("measurement-client" + c3386dP1.a.getPackageName()).hashCode()) != null) {
                n().o.d("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        YK1 yk1D1 = D1();
        if (yk1D1 != YK1.CLIENT_UPLOAD_ELIGIBLE) {
            n().o.c(yk1D1.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        n().o.c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(NotificationConstants.ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
        n().o.c(((JobScheduler) Preconditions.checkNotNull(this.d)).schedule(new JobInfo.Builder(("measurement-client" + c3386dP1.a.getPackageName()).hashCode(), new ComponentName(c3386dP1.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final YK1 D1() {
        A1();
        v1();
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!c3386dP1.g.E1(null, IB1.M0)) {
            return YK1.CLIENT_FLAG_OFF;
        }
        if (this.d == null) {
            return YK1.MISSING_JOB_SCHEDULER;
        }
        C1263Py1 c1263Py1 = c3386dP1.g;
        Boolean boolD1 = c1263Py1.D1("google_analytics_sgtm_upload_enabled");
        return !(boolD1 == null ? false : boolD1.booleanValue()) ? YK1.NOT_ENABLED_IN_MANIFEST : !c1263Py1.E1(null, IB1.O0) ? YK1.SDK_TOO_OLD : !C5910mZ1.s2(c3386dP1.a, "com.google.android.gms.measurement.AppMeasurementJobService") ? YK1.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT < 24 ? YK1.ANDROID_TOO_OLD : !c3386dP1.o().K1() ? YK1.NON_PLAY_MODE : YK1.CLIENT_UPLOAD_ELIGIBLE;
    }

    @Override // defpackage.AbstractC4128hI1
    public final boolean z1() {
        return true;
    }
}

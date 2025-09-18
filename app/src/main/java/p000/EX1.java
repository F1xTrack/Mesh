package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class EX1 extends AbstractC9512gY1 {

    /* renamed from: e */
    public final AlarmManager f2740e;

    /* renamed from: f */
    public C10662pX1 f2741f;

    /* renamed from: g */
    public Integer f2742g;

    public EX1(C10152lY1 c10152lY1) {
        super(c10152lY1);
        this.f2740e = (AlarmManager) ((C9110dP1) this.f11615b).f26031a.getSystemService("alarm");
    }

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f2740e;
        if (alarmManager != null) {
            alarmManager.cancel(m2332E1());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C9110dP1) this.f11615b).f26031a.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(m2331D1());
        return false;
    }

    /* renamed from: C1 */
    public final void m2330C1() {
        JobScheduler jobScheduler;
        m18576z1();
        mo6070n().f8386o.m24555d("Unscheduling upload");
        AlarmManager alarmManager = this.f2740e;
        if (alarmManager != null) {
            alarmManager.cancel(m2332E1());
        }
        m2333F1().m8321a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C9110dP1) this.f11615b).f26031a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(m2331D1());
    }

    /* renamed from: D1 */
    public final int m2331D1() {
        if (this.f2742g == null) {
            this.f2742g = Integer.valueOf(("measurement" + ((C9110dP1) this.f11615b).f26031a.getPackageName()).hashCode());
        }
        return this.f2742g.intValue();
    }

    /* renamed from: E1 */
    public final PendingIntent m2332E1() {
        Context context = ((C9110dP1) this.f11615b).f26031a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC9344fE1.f27115a);
    }

    /* renamed from: F1 */
    public final VA1 m2333F1() {
        if (this.f2741f == null) {
            this.f2741f = new C10662pX1(this, this.f5586c.f37134l, 1);
        }
        return this.f2741f;
    }
}

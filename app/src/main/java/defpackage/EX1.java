package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class EX1 extends AbstractC3985gY1 {
    public final AlarmManager e;
    public C6477pX1 f;
    public Integer g;

    public EX1(C5716lY1 c5716lY1) {
        super(c5716lY1);
        this.e = (AlarmManager) ((C3386dP1) this.b).a.getSystemService("alarm");
    }

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            alarmManager.cancel(E1());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C3386dP1) this.b).a.getSystemService("jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(D1());
        return false;
    }

    public final void C1() {
        JobScheduler jobScheduler;
        z1();
        n().o.d("Unscheduling upload");
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            alarmManager.cancel(E1());
        }
        F1().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) ((C3386dP1) this.b).a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(D1());
    }

    public final int D1() {
        if (this.g == null) {
            this.g = Integer.valueOf(("measurement" + ((C3386dP1) this.b).a.getPackageName()).hashCode());
        }
        return this.g.intValue();
    }

    public final PendingIntent E1() {
        Context context = ((C3386dP1) this.b).a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC3734fE1.a);
    }

    public final VA1 F1() {
        if (this.f == null) {
            this.f = new C6477pX1(this, this.c.l, 1);
        }
        return this.f;
    }
}

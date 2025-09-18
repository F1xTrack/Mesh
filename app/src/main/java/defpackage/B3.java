package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* loaded from: classes.dex */
public abstract class B3 {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}

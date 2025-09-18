package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: B3 */
/* loaded from: classes.dex */
public abstract class AbstractC0067B3 {
    /* renamed from: a */
    public static void m475a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}

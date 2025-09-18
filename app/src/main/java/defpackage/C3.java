package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class C3 {
    public static final /* synthetic */ int a = 0;

    static {
        TE.M("Alarms");
    }

    public static void a(Context context, C0376Eo1 c0376Eo1, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = C1093Nu.e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C1093Nu.e(intent, c0376Eo1);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        TE teG = TE.G();
        c0376Eo1.toString();
        teG.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, C0376Eo1 c0376Eo1, long j) {
        T71 t71R = workDatabase.r();
        S71 s71G = t71R.G(c0376Eo1);
        if (s71G != null) {
            int i = s71G.c;
            a(context, c0376Eo1, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i2 = C1093Nu.e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C1093Nu.e(intent, c0376Eo1);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                B3.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objM = workDatabase.m(new CallableC0437Fj(3, new C3866fw1(workDatabase)));
        O90.e(objM, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objM).intValue();
        t71R.H(new S71(c0376Eo1.a, c0376Eo1.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i3 = C1093Nu.e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C1093Nu.e(intent2, c0376Eo1);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            B3.a(alarmManager2, 0, j, service2);
        }
    }
}

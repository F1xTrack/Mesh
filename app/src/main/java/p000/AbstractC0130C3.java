package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: C3 */
/* loaded from: classes.dex */
public abstract class AbstractC0130C3 {

    /* renamed from: a */
    public static final /* synthetic */ int f1153a = 0;

    static {
        C1210TE.m7637M("Alarms");
    }

    /* renamed from: a */
    public static void m958a(Context context, C7551Eo1 c7551Eo1, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = C0875Nu.f8119e;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C0875Nu.m5902e(intent, c7551Eo1);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C1210TE c1210teM7634G = C1210TE.m7634G();
        c7551Eo1.toString();
        c1210teM7634G.getClass();
        alarmManager.cancel(service);
    }

    /* renamed from: b */
    public static void m959b(Context context, WorkDatabase workDatabase, C7551Eo1 c7551Eo1, long j) {
        T71 t71Mo10325r = workDatabase.mo10325r();
        S71 s71M7559G = t71Mo10325r.m7559G(c7551Eo1);
        if (s71M7559G != null) {
            int i = s71M7559G.f10590c;
            m958a(context, c7551Eo1, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i2 = C0875Nu.f8119e;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            C0875Nu.m5902e(intent, c7551Eo1);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                AbstractC0067B3.m475a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objM23798m = workDatabase.m23798m(new CallableC0361Fj(3, new C9432fw1(workDatabase)));
        O90.m5967e(objM23798m, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objM23798m).intValue();
        t71Mo10325r.m7560H(new S71(c7551Eo1.f2911a, c7551Eo1.f2912b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i3 = C0875Nu.f8119e;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        C0875Nu.m5902e(intent2, c7551Eo1);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            AbstractC0067B3.m475a(alarmManager2, 0, j, service2);
        }
    }
}

package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: Vu1 */
/* loaded from: classes2.dex */
public final class C1719Vu1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1719Vu1(Object obj, int i, Object obj2) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws C1553Tr0 {
        Object obj = this.g;
        Object obj2 = this.f;
        switch (this.e) {
            case 0:
                ((C0787Jv1) obj2).a.getClass();
                C8261yu1 c8261yu1 = (C8261yu1) obj;
                O90.f(c8261yu1, CommonUrlParts.MODEL);
                return new C1475Sr0("sdkInfo", c8261yu1.a);
            case 1:
                C2226aw c2226aw = (C2226aw) obj2;
                if (!c2226aw.c) {
                    AbstractC6080nS1.a(AbstractC6653qS1.c(new C3311d11(new S51(10, c2226aw)), FK.a()), new C5403jv1(c2226aw, 0), new C5403jv1(c2226aw, 1));
                    Context context = ((A90) c2226aw.e).a;
                    Object systemService = context.getSystemService((Class<Object>) JobScheduler.class);
                    O90.e(systemService, "context.getSystemService(JobScheduler::class.java)");
                    JobScheduler jobScheduler = (JobScheduler) systemService;
                    List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                    O90.e(allPendingJobs, "jobScheduler.allPendingJobs");
                    if ((allPendingJobs instanceof Collection) && allPendingJobs.isEmpty()) {
                        JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                        int i = C6251oM.d;
                        jobScheduler.schedule(builder.setPeriodic(C6251oM.b(AbstractC3689f02.d(1440, EnumC6823rM.e))).setPersisted(true).build());
                        c2226aw.c = true;
                    } else {
                        Iterator<T> it = allPendingJobs.iterator();
                        while (it.hasNext()) {
                            if (((JobInfo) it.next()).getId() == 88123556) {
                                c2226aw.c = true;
                            }
                        }
                        JobInfo.Builder builder2 = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                        int i2 = C6251oM.d;
                        jobScheduler.schedule(builder2.setPeriodic(C6251oM.b(AbstractC3689f02.d(1440, EnumC6823rM.e))).setPersisted(true).build());
                        c2226aw.c = true;
                    }
                }
                A61 a61 = (A61) c2226aw.d;
                C1475Sr0 c1475Sr0 = (C1475Sr0) obj;
                O90.f(c1475Sr0, "metricsEvent");
                C1304Qm0 c1304Qm0 = (C1304Qm0) a61.b;
                String string = UUID.randomUUID().toString();
                O90.e(string, "randomUUID().toString()");
                byte[] bytes = C0318Dv0.k(c1475Sr0).getBytes(AbstractC7680vr.a);
                O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                F71 f71 = (F71) ((C3383dO1) c1304Qm0.b).c;
                ContentValues contentValues = new ContentValues();
                contentValues.put(CommonUrlParts.UUID, string);
                contentValues.put("metrics_event", bytes);
                try {
                    ((SQLiteDatabase) f71.getValue()).beginTransactionNonExclusive();
                    long jInsert = ((SQLiteDatabase) f71.getValue()).insert("metrics_event_table", null, contentValues);
                    ((SQLiteDatabase) f71.getValue()).setTransactionSuccessful();
                    ((SQLiteDatabase) f71.getValue()).endTransaction();
                    if (jInsert != -1) {
                        return C1518Tf1.a;
                    }
                    StringBuilder sb = new StringBuilder("Saving error ");
                    sb.append((Object) ("MetricsEventUuid(value=" + string + ')'));
                    String string2 = sb.toString();
                    O90.f(string2, "message");
                    throw new C1553Tr0(string2, null);
                } finally {
                }
            default:
                ((C7887ww1) obj2).a.getClass();
                C3294cw1 c3294cw1 = (C3294cw1) obj;
                O90.f(c3294cw1, CommonUrlParts.MODEL);
                return new C1475Sr0(c3294cw1.a, c3294cw1.b);
        }
    }
}

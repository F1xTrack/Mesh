package p000;

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
public final class C8447Vu1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f12856e;

    /* renamed from: f */
    public final /* synthetic */ Object f12857f;

    /* renamed from: g */
    public final /* synthetic */ Object f12858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8447Vu1(Object obj, int i, Object obj2) {
        super(0);
        this.f12856e = i;
        this.f12857f = obj;
        this.f12858g = obj2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws C8336Tr0 {
        Object obj = this.f12858g;
        Object obj2 = this.f12857f;
        switch (this.f12856e) {
            case 0:
                ((C7825Jv1) obj2).f5800a.getClass();
                C11857yu1 c11857yu1 = (C11857yu1) obj;
                O90.m5968f(c11857yu1, CommonUrlParts.MODEL);
                return new C8284Sr0("sdkInfo", c11857yu1.f46535a);
            case 1:
                C1753aw c1753aw = (C1753aw) obj2;
                if (!c1753aw.f16683c) {
                    AbstractC10396nS1.m23145a(AbstractC10780qS1.m24004c(new C9059d11(new S51(10, c1753aw)), AbstractC0336FK.m2578a()), new C9942jv1(c1753aw, 0), new C9942jv1(c1753aw, 1));
                    Context context = ((A90) c1753aw.f16685e).f91a;
                    Object systemService = context.getSystemService((Class<Object>) JobScheduler.class);
                    O90.m5967e(systemService, "context.getSystemService(JobScheduler::class.java)");
                    JobScheduler jobScheduler = (JobScheduler) systemService;
                    List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                    O90.m5967e(allPendingJobs, "jobScheduler.allPendingJobs");
                    if ((allPendingJobs instanceof Collection) && allPendingJobs.isEmpty()) {
                        JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                        int i = C6547oM.f38966d;
                        jobScheduler.schedule(builder.setPeriodic(C6547oM.m23369b(AbstractC9313f02.m18151d(1440, EnumC6738rM.f41612e))).setPersisted(true).build());
                        c1753aw.f16683c = true;
                    } else {
                        Iterator<T> it = allPendingJobs.iterator();
                        while (it.hasNext()) {
                            if (((JobInfo) it.next()).getId() == 88123556) {
                                c1753aw.f16683c = true;
                            }
                        }
                        JobInfo.Builder builder2 = new JobInfo.Builder(88123556, new ComponentName(context, (Class<?>) SendMetricsEventJobService.class));
                        int i2 = C6547oM.f38966d;
                        jobScheduler.schedule(builder2.setPeriodic(C6547oM.m23369b(AbstractC9313f02.m18151d(1440, EnumC6738rM.f41612e))).setPersisted(true).build());
                        c1753aw.f16683c = true;
                    }
                }
                A61 a61 = (A61) c1753aw.f16684d;
                C8284Sr0 c8284Sr0 = (C8284Sr0) obj;
                O90.m5968f(c8284Sr0, "metricsEvent");
                C8170Qm0 c8170Qm0 = (C8170Qm0) a61.f73b;
                String string = UUID.randomUUID().toString();
                O90.m5967e(string, "randomUUID().toString()");
                byte[] bytes = C7512Dv0.m1927k(c8284Sr0).getBytes(AbstractC7038vr.f44561a);
                O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                F71 f71 = (F71) ((C9108dO1) c8170Qm0.f9780b).f26013c;
                ContentValues contentValues = new ContentValues();
                contentValues.put(CommonUrlParts.UUID, string);
                contentValues.put("metrics_event", bytes);
                try {
                    ((SQLiteDatabase) f71.getValue()).beginTransactionNonExclusive();
                    long jInsert = ((SQLiteDatabase) f71.getValue()).insert("metrics_event_table", null, contentValues);
                    ((SQLiteDatabase) f71.getValue()).setTransactionSuccessful();
                    ((SQLiteDatabase) f71.getValue()).endTransaction();
                    if (jInsert != -1) {
                        return C8313Tf1.f11463a;
                    }
                    StringBuilder sb = new StringBuilder("Saving error ");
                    sb.append((Object) ("MetricsEventUuid(value=" + string + ')'));
                    String string2 = sb.toString();
                    O90.m5968f(string2, "message");
                    throw new C8336Tr0(string2, null);
                } finally {
                }
            default:
                ((C11607ww1) obj2).f45173a.getClass();
                C9048cw1 c9048cw1 = (C9048cw1) obj;
                O90.m5968f(c9048cw1, CommonUrlParts.MODEL);
                return new C8284Sr0(c9048cw1.f25727a, c9048cw1.f25728b);
        }
    }
}

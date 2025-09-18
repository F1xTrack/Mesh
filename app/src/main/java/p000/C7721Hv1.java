package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* renamed from: Hv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7721Hv1 {

    /* renamed from: b */
    public static final long f4604b;

    /* renamed from: a */
    public final Context f4605a;

    static {
        int i = C6547oM.f38966d;
        f4604b = AbstractC9313f02.m18151d(15, EnumC6738rM.f41612e);
    }

    public C7721Hv1(Context context) {
        this.f4605a = context;
    }

    /* renamed from: a */
    public final void m3649a() {
        Context context = this.f4605a;
        Object systemService = context.getSystemService((Class<Object>) JobScheduler.class);
        O90.m5967e(systemService, "applicationContext.getSy…JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        O90.m5967e(allPendingJobs, "jobScheduler.allPendingJobs");
        if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 12857125) {
                    return;
                }
            }
        }
        jobScheduler.schedule(new JobInfo.Builder(12857125, new ComponentName(context, (Class<?>) PersistableConfigSyncJobService.class)).setPeriodic(C6547oM.m23369b(f4604b)).setPersisted(true).build());
    }
}

package defpackage;

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
public final class C0631Hv1 {
    public static final long b;
    public final Context a;

    static {
        int i = C6251oM.d;
        b = AbstractC3689f02.d(15, EnumC6823rM.e);
    }

    public C0631Hv1(Context context) {
        this.a = context;
    }

    public final void a() {
        Context context = this.a;
        Object systemService = context.getSystemService((Class<Object>) JobScheduler.class);
        O90.e(systemService, "applicationContext.getSy…JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        O90.e(allPendingJobs, "jobScheduler.allPendingJobs");
        if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 12857125) {
                    return;
                }
            }
        }
        jobScheduler.schedule(new JobInfo.Builder(12857125, new ComponentName(context, (Class<?>) PersistableConfigSyncJobService.class)).setPeriodic(C6251oM.b(b)).setPersisted(true).build());
    }
}

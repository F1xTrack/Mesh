package com.p019vk.push.core.remote.config.omicron.scheduler;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.p019vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p000.AbstractC7167xu;
import p000.AbstractC7222ym;
import p000.AbstractC7759Io1;
import p000.AbstractC8008Nj0;
import p000.C0241Dp;
import p000.C10075ky0;
import p000.C1156SN;
import p000.C11687xZ0;
import p000.C4149gy;
import p000.C7603Fo1;
import p000.C7852Kj0;
import p000.C7863Ko1;
import p000.C8383Uo1;
import p000.ExecutorC6865t6;
import p000.NA0;
import p000.RunnableC1420WZ;

/* loaded from: classes2.dex */
public class WorkManagerScheduledExecutor implements ScheduledExecutor {

    /* renamed from: b */
    public static final int[] f20568b = {1, 2, 4};

    /* renamed from: c */
    public static ScheduledExecutor.ScheduledTask f20569c;

    /* renamed from: a */
    public final AbstractC7759Io1 f20570a;

    public static class PeriodicWorker extends Worker {

        /* renamed from: a */
        public final ScheduledExecutor.ScheduledTask f20571a;

        public PeriodicWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            this.f20571a = WorkManagerScheduledExecutor.f20569c;
        }

        @Override // androidx.work.Worker
        public AbstractC8008Nj0 doWork() {
            ScheduledExecutor.ScheduledTask scheduledTask;
            return (getRunAttemptCount() > 5 || (scheduledTask = this.f20571a) == null) ? new C7852Kj0() : scheduledTask.execute() == ScheduledExecutor.TaskResult.SUCCESS ? AbstractC8008Nj0.m5818a() : new C7852Kj0();
        }
    }

    public WorkManagerScheduledExecutor(AbstractC7759Io1 abstractC7759Io1) {
        this.f20570a = abstractC7759Io1;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor
    public boolean isActive() {
        C7863Ko1 c7863Ko1 = (C7863Ko1) this.f20570a;
        c7863Ko1.getClass();
        RunnableC1420WZ runnableC1420WZ = new RunnableC1420WZ(c7863Ko1);
        ((ExecutorC6865t6) c7863Ko1.f6317d.f13981b).execute(runnableC1420WZ);
        try {
            List list = (List) ((C11687xZ0) runnableC1420WZ.f13260b).get();
            if (list != null && !list.isEmpty()) {
                int i = ((C7603Fo1) list.get(0)).f3421b;
                int[] iArr = f20568b;
                for (int i2 = 0; i2 < 3; i2++) {
                    if (AbstractC7222ym.m26226c(iArr[i2], i)) {
                        return true;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    @Override // com.p019vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor
    public void schedule(ScheduledExecutor.ScheduledTask scheduledTask, int i, TimeUnit timeUnit) {
        boolean zIsActive = isActive();
        AbstractC7759Io1 abstractC7759Io1 = this.f20570a;
        if (zIsActive) {
            C7863Ko1 c7863Ko1 = (C7863Ko1) abstractC7759Io1;
            c7863Ko1.getClass();
            c7863Ko1.f6317d.m9154x(new C0241Dp(c7863Ko1, "push_sdk_omicron_update_work", true));
        }
        f20569c = scheduledTask;
        C10075ky0 c10075ky0 = new C10075ky0(PeriodicWorker.class, i, TimeUnit.MINUTES);
        ((C8383Uo1) c10075ky0.f28106c).f12143j = new C4149gy(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC7167xu.m25987g0(new LinkedHashSet()) : C1156SN.f10705a);
        abstractC7759Io1.mo4022b("push_sdk_omicron_update_work", 1, (NA0) c10075ky0.m18675b());
    }
}

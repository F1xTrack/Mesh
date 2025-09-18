package com.vk.push.core.remote.config.omicron.scheduler;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor;
import defpackage.AbstractC0688Io1;
import defpackage.AbstractC1061Nj0;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8235ym;
import defpackage.C0299Dp;
import defpackage.C0454Fo1;
import defpackage.C0828Kj0;
import defpackage.C0844Ko1;
import defpackage.C1623Uo1;
import defpackage.C4061gy;
import defpackage.C5602ky0;
import defpackage.C8007xZ0;
import defpackage.ExecutorC7157t6;
import defpackage.NA0;
import defpackage.SN;
import defpackage.WZ;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WorkManagerScheduledExecutor implements ScheduledExecutor {
    public static final int[] b = {1, 2, 4};
    public static ScheduledExecutor.ScheduledTask c;
    public final AbstractC0688Io1 a;

    public static class PeriodicWorker extends Worker {
        public final ScheduledExecutor.ScheduledTask a;

        public PeriodicWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            this.a = WorkManagerScheduledExecutor.c;
        }

        @Override // androidx.work.Worker
        public AbstractC1061Nj0 doWork() {
            ScheduledExecutor.ScheduledTask scheduledTask;
            return (getRunAttemptCount() > 5 || (scheduledTask = this.a) == null) ? new C0828Kj0() : scheduledTask.execute() == ScheduledExecutor.TaskResult.SUCCESS ? AbstractC1061Nj0.a() : new C0828Kj0();
        }
    }

    public WorkManagerScheduledExecutor(AbstractC0688Io1 abstractC0688Io1) {
        this.a = abstractC0688Io1;
    }

    @Override // com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor
    public boolean isActive() {
        C0844Ko1 c0844Ko1 = (C0844Ko1) this.a;
        c0844Ko1.getClass();
        WZ wz = new WZ(c0844Ko1);
        ((ExecutorC7157t6) c0844Ko1.d.b).execute(wz);
        try {
            List list = (List) ((C8007xZ0) wz.b).get();
            if (list != null && !list.isEmpty()) {
                int i = ((C0454Fo1) list.get(0)).b;
                int[] iArr = b;
                for (int i2 = 0; i2 < 3; i2++) {
                    if (AbstractC8235ym.c(iArr[i2], i)) {
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

    @Override // com.vk.push.core.remote.config.omicron.scheduler.ScheduledExecutor
    public void schedule(ScheduledExecutor.ScheduledTask scheduledTask, int i, TimeUnit timeUnit) {
        boolean zIsActive = isActive();
        AbstractC0688Io1 abstractC0688Io1 = this.a;
        if (zIsActive) {
            C0844Ko1 c0844Ko1 = (C0844Ko1) abstractC0688Io1;
            c0844Ko1.getClass();
            c0844Ko1.d.x(new C0299Dp(c0844Ko1, "push_sdk_omicron_update_work", true));
        }
        c = scheduledTask;
        C5602ky0 c5602ky0 = new C5602ky0(PeriodicWorker.class, i, TimeUnit.MINUTES);
        ((C1623Uo1) c5602ky0.c).j = new C4061gy(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? AbstractC8069xu.g0(new LinkedHashSet()) : SN.a);
        abstractC0688Io1.b("push_sdk_omicron_update_work", 1, (NA0) c5602ky0.b());
    }
}

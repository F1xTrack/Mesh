package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.mes.dnevnik.R;

/* renamed from: Ko1 */
/* loaded from: classes.dex */
public final class C0844Ko1 extends AbstractC0688Io1 {
    public static C0844Ko1 k;
    public static C0844Ko1 l;
    public static final Object m;
    public final Context a;
    public final C6928rv b;
    public final WorkDatabase c;
    public final C1857Xo1 d;
    public final List e;
    public final PD0 f;
    public final C0481Fx1 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final T71 j;

    static {
        TE.M("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public C0844Ko1(Context context, C6928rv c6928rv, C1857Xo1 c1857Xo1) throws Resources.NotFoundException {
        C6082nT0 c6082nT0A;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC7157t6 executorC7157t6 = (ExecutorC7157t6) c1857Xo1.b;
        O90.f(applicationContext, "context");
        O90.f(executorC7157t6, "queryExecutor");
        if (z) {
            c6082nT0A = new C6082nT0(applicationContext, null, WorkDatabase.class);
            c6082nT0A.j = true;
        } else {
            c6082nT0A = WQ1.a(applicationContext, "androidx.work.workdb", WorkDatabase.class);
            c6082nT0A.i = new C1286Qg0(applicationContext);
        }
        c6082nT0A.g = executorC7157t6;
        c6082nT0A.d.add(C1477Ss.a);
        c6082nT0A.a(C1709Vr0.g);
        c6082nT0A.a(new YR0(applicationContext, 2, 3));
        c6082nT0A.a(C1709Vr0.h);
        c6082nT0A.a(C1709Vr0.i);
        c6082nT0A.a(new YR0(applicationContext, 5, 6));
        c6082nT0A.a(C1709Vr0.j);
        c6082nT0A.a(C1709Vr0.k);
        c6082nT0A.a(C1709Vr0.l);
        c6082nT0A.a(new YR0(applicationContext));
        c6082nT0A.a(new YR0(applicationContext, 10, 11));
        c6082nT0A.a(C1709Vr0.d);
        c6082nT0A.a(C1709Vr0.e);
        c6082nT0A.a(C1709Vr0.f);
        c6082nT0A.l = false;
        c6082nT0A.m = true;
        WorkDatabase workDatabase = (WorkDatabase) c6082nT0A.b();
        Context applicationContext2 = context.getApplicationContext();
        TE te = new TE(4);
        synchronized (TE.f) {
            TE.g = te;
        }
        O90.f(applicationContext2, "context");
        Context applicationContext3 = applicationContext2.getApplicationContext();
        O90.e(applicationContext3, "context.applicationContext");
        C1831Xg c1831Xg = new C1831Xg(applicationContext3, c1857Xo1, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        O90.e(applicationContext4, "context.applicationContext");
        C1831Xg c1831Xg2 = new C1831Xg(applicationContext4, c1857Xo1, 1);
        Context applicationContext5 = applicationContext2.getApplicationContext();
        O90.e(applicationContext5, "context.applicationContext");
        int i = AbstractC3480dv0.a;
        Object c3290cv0 = Build.VERSION.SDK_INT >= 24 ? new C3290cv0(applicationContext5, c1857Xo1) : new C3671ev0(applicationContext5, c1857Xo1);
        Context applicationContext6 = applicationContext2.getApplicationContext();
        O90.e(applicationContext6, "context.applicationContext");
        C1831Xg c1831Xg3 = new C1831Xg(applicationContext6, c1857Xo1, 2);
        T71 t71 = new T71();
        t71.a = c1831Xg;
        t71.b = c1831Xg2;
        t71.c = c3290cv0;
        t71.d = c1831Xg3;
        this.j = t71;
        int i2 = CV0.a;
        V71 v71 = new V71(applicationContext2, this);
        AbstractC0486Fz0.a(applicationContext2, SystemJobService.class, true);
        TE.G().getClass();
        List listAsList = Arrays.asList(v71, new Z10(applicationContext2, c6928rv, t71, this));
        PD0 pd0 = new PD0(context, c6928rv, c1857Xo1, workDatabase, listAsList);
        Context applicationContext7 = context.getApplicationContext();
        this.a = applicationContext7;
        this.b = c6928rv;
        this.d = c1857Xo1;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = pd0;
        this.g = new C0481Fx1(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24 && AbstractC0766Jo1.a(applicationContext7)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.x(new RunnableC5902mX(applicationContext7, this));
    }

    public static C0844Ko1 c() {
        synchronized (m) {
            try {
                C0844Ko1 c0844Ko1 = k;
                if (c0844Ko1 != null) {
                    return c0844Ko1;
                }
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0844Ko1 d(Context context) {
        C0844Ko1 c0844Ko1C;
        synchronized (m) {
            try {
                c0844Ko1C = c();
                if (c0844Ko1C == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0844Ko1C;
    }

    @Override // defpackage.AbstractC0688Io1
    public final ES1 b(String str, int i, NA0 na0) {
        if (i != 3) {
            return new C8243yo1(this, str, i != 2 ? 1 : 2, Collections.singletonList(na0)).b();
        }
        O90.f(na0, "workRequest");
        ES1 es1 = new ES1(1);
        ((ExecutorC7157t6) this.d.b).execute(new CE(this, str, es1, new C4263i1(na0, this, str, es1, 1), na0, 3));
        return es1;
    }

    public final void e() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        ArrayList arrayListF;
        WorkDatabase workDatabase = this.c;
        Context context = this.a;
        int i = V71.e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = V71.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                V71.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C1701Vo1 c1701Vo1U = workDatabase.u();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1701Vo1U.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) c1701Vo1U.l;
        C3414dZ c3414dZA = c5581kr0.a();
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
            CV0.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
            throw th;
        }
    }

    public final void g(C7725w41 c7725w41, C6846rT1 c6846rT1) {
        C1857Xo1 c1857Xo1 = this.d;
        RunnableC1492Sx runnableC1492Sx = new RunnableC1492Sx(15);
        runnableC1492Sx.b = this;
        runnableC1492Sx.c = c7725w41;
        runnableC1492Sx.d = c6846rT1;
        c1857Xo1.x(runnableC1492Sx);
    }

    public final void h(C7725w41 c7725w41) {
        this.d.x(new X41(this, c7725w41, false));
    }
}

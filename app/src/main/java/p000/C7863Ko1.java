package p000;

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
public final class C7863Ko1 extends AbstractC7759Io1 {

    /* renamed from: k */
    public static C7863Ko1 f6311k;

    /* renamed from: l */
    public static C7863Ko1 f6312l;

    /* renamed from: m */
    public static final Object f6313m;

    /* renamed from: a */
    public final Context f6314a;

    /* renamed from: b */
    public final C6790rv f6315b;

    /* renamed from: c */
    public final WorkDatabase f6316c;

    /* renamed from: d */
    public final C8539Xo1 f6317d;

    /* renamed from: e */
    public final List f6318e;

    /* renamed from: f */
    public final PD0 f6319f;

    /* renamed from: g */
    public final C7621Fx1 f6320g;

    /* renamed from: h */
    public boolean f6321h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f6322i;

    /* renamed from: j */
    public final T71 f6323j;

    static {
        C1210TE.m7637M("WorkManagerImpl");
        f6311k = null;
        f6312l = null;
        f6313m = new Object();
    }

    public C7863Ko1(Context context, C6790rv c6790rv, C8539Xo1 c8539Xo1) throws Resources.NotFoundException {
        C10397nT0 c10397nT0M8759a;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC6865t6 executorC6865t6 = (ExecutorC6865t6) c8539Xo1.f13981b;
        O90.m5968f(applicationContext, "context");
        O90.m5968f(executorC6865t6, "queryExecutor");
        if (z) {
            c10397nT0M8759a = new C10397nT0(applicationContext, null, WorkDatabase.class);
            c10397nT0M8759a.f38323j = true;
        } else {
            c10397nT0M8759a = WQ1.m8759a(applicationContext, "androidx.work.workdb", WorkDatabase.class);
            c10397nT0M8759a.f38322i = new C8158Qg0(applicationContext);
        }
        c10397nT0M8759a.f38320g = executorC6865t6;
        c10397nT0M8759a.f38317d.add(C1187Ss.f11015a);
        c10397nT0M8759a.m23150a(C8440Vr0.f12828g);
        c10397nT0M8759a.m23150a(new YR0(applicationContext, 2, 3));
        c10397nT0M8759a.m23150a(C8440Vr0.f12829h);
        c10397nT0M8759a.m23150a(C8440Vr0.f12830i);
        c10397nT0M8759a.m23150a(new YR0(applicationContext, 5, 6));
        c10397nT0M8759a.m23150a(C8440Vr0.f12831j);
        c10397nT0M8759a.m23150a(C8440Vr0.f12832k);
        c10397nT0M8759a.m23150a(C8440Vr0.f12833l);
        c10397nT0M8759a.m23150a(new YR0(applicationContext));
        c10397nT0M8759a.m23150a(new YR0(applicationContext, 10, 11));
        c10397nT0M8759a.m23150a(C8440Vr0.f12825d);
        c10397nT0M8759a.m23150a(C8440Vr0.f12826e);
        c10397nT0M8759a.m23150a(C8440Vr0.f12827f);
        c10397nT0M8759a.f38325l = false;
        c10397nT0M8759a.f38326m = true;
        WorkDatabase workDatabase = (WorkDatabase) c10397nT0M8759a.m23151b();
        Context applicationContext2 = context.getApplicationContext();
        C1210TE c1210te = new C1210TE(4);
        synchronized (C1210TE.f11211f) {
            C1210TE.f11212g = c1210te;
        }
        O90.m5968f(applicationContext2, "context");
        Context applicationContext3 = applicationContext2.getApplicationContext();
        O90.m5967e(applicationContext3, "context.applicationContext");
        C1490Xg c1490Xg = new C1490Xg(applicationContext3, c8539Xo1, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        O90.m5967e(applicationContext4, "context.applicationContext");
        C1490Xg c1490Xg2 = new C1490Xg(applicationContext4, c8539Xo1, 1);
        Context applicationContext5 = applicationContext2.getApplicationContext();
        O90.m5967e(applicationContext5, "context.applicationContext");
        int i = AbstractC9173dv0.f26389a;
        Object c9045cv0 = Build.VERSION.SDK_INT >= 24 ? new C9045cv0(applicationContext5, c8539Xo1) : new C9301ev0(applicationContext5, c8539Xo1);
        Context applicationContext6 = applicationContext2.getApplicationContext();
        O90.m5967e(applicationContext6, "context.applicationContext");
        C1490Xg c1490Xg3 = new C1490Xg(applicationContext6, c8539Xo1, 2);
        T71 t71 = new T71();
        t71.f11173a = c1490Xg;
        t71.f11174b = c1490Xg2;
        t71.f11175c = c9045cv0;
        t71.f11176d = c1490Xg3;
        this.f6323j = t71;
        int i2 = CV0.f1414a;
        V71 v71 = new V71(applicationContext2, this);
        AbstractC7624Fz0.m2870a(applicationContext2, SystemJobService.class, true);
        C1210TE.m7634G().getClass();
        List listAsList = Arrays.asList(v71, new Z10(applicationContext2, c6790rv, t71, this));
        PD0 pd0 = new PD0(context, c6790rv, c8539Xo1, workDatabase, listAsList);
        Context applicationContext7 = context.getApplicationContext();
        this.f6314a = applicationContext7;
        this.f6315b = c6790rv;
        this.f6317d = c8539Xo1;
        this.f6316c = workDatabase;
        this.f6318e = listAsList;
        this.f6319f = pd0;
        this.f6320g = new C7621Fx1(workDatabase);
        this.f6321h = false;
        if (Build.VERSION.SDK_INT >= 24 && AbstractC7811Jo1.m4418a(applicationContext7)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f6317d.m9154x(new RunnableC6432mX(applicationContext7, this));
    }

    /* renamed from: c */
    public static C7863Ko1 m4735c() {
        synchronized (f6313m) {
            try {
                C7863Ko1 c7863Ko1 = f6311k;
                if (c7863Ko1 != null) {
                    return c7863Ko1;
                }
                return f6312l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static C7863Ko1 m4736d(Context context) {
        C7863Ko1 c7863Ko1M4735c;
        synchronized (f6313m) {
            try {
                c7863Ko1M4735c = m4735c();
                if (c7863Ko1M4735c == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7863Ko1M4735c;
    }

    @Override // p000.AbstractC7759Io1
    /* renamed from: b */
    public final ES1 mo4022b(String str, int i, NA0 na0) {
        if (i != 3) {
            return new C11845yo1(this, str, i != 2 ? 1 : 2, Collections.singletonList(na0)).m26263b();
        }
        O90.m5968f(na0, "workRequest");
        ES1 es1 = new ES1(1);
        ((ExecutorC6865t6) this.f6317d.f13981b).execute(new RunnableC0141CE(this, str, es1, new C4216i1(na0, this, str, es1, 1), na0, 3));
        return es1;
    }

    /* renamed from: e */
    public final void m4737e() {
        synchronized (f6313m) {
            try {
                this.f6321h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f6322i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f6322i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m4738f() {
        ArrayList arrayListM8312f;
        WorkDatabase workDatabase = this.f6316c;
        Context context = this.f6314a;
        int i = V71.f12380e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListM8312f = V71.m8312f(context, jobScheduler)) != null && !arrayListM8312f.isEmpty()) {
            Iterator it = arrayListM8312f.iterator();
            while (it.hasNext()) {
                V71.m8310a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C8435Vo1 c8435Vo1Mo10328u = workDatabase.mo10328u();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8435Vo1Mo10328u.f12763a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) c8435Vo1Mo10328u.f12774l;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
            CV0.m1192a(this.f6315b, workDatabase, this.f6318e);
        } catch (Throwable th) {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
            throw th;
        }
    }

    /* renamed from: g */
    public final void m4739g(C11499w41 c11499w41, C10910rT1 c10910rT1) {
        C8539Xo1 c8539Xo1 = this.f6317d;
        RunnableC1192Sx runnableC1192Sx = new RunnableC1192Sx(15);
        runnableC1192Sx.f11079b = this;
        runnableC1192Sx.f11080c = c11499w41;
        runnableC1192Sx.f11081d = c10910rT1;
        c8539Xo1.m9154x(runnableC1192Sx);
    }

    /* renamed from: h */
    public final void m4740h(C11499w41 c11499w41) {
        this.f6317d.m9154x(new X41(this, c11499w41, false));
    }
}

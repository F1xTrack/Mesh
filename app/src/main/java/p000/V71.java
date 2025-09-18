package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class V71 implements InterfaceC11933zV0 {

    /* renamed from: e */
    public static final /* synthetic */ int f12380e = 0;

    /* renamed from: a */
    public final Context f12381a;

    /* renamed from: b */
    public final JobScheduler f12382b;

    /* renamed from: c */
    public final C7863Ko1 f12383c;

    /* renamed from: d */
    public final U71 f12384d;

    static {
        C1210TE.m7637M("SystemJobScheduler");
    }

    public V71(Context context, C7863Ko1 c7863Ko1) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        U71 u71 = new U71(context);
        this.f12381a = context;
        this.f12383c = c7863Ko1;
        this.f12382b = jobScheduler;
        this.f12384d = u71;
    }

    /* renamed from: a */
    public static void m8310a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            c1210teM7634G.getClass();
        }
    }

    /* renamed from: d */
    public static ArrayList m8311d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListM8312f = m8312f(context, jobScheduler);
        if (arrayListM8312f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListM8312f.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            C7551Eo1 c7551Eo1M8313g = m8313g(jobInfo);
            if (c7551Eo1M8313g != null && str.equals(c7551Eo1M8313g.f2911a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static ArrayList m8312f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            C1210TE.m7634G().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static C7551Eo1 m8313g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C7551Eo1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: b */
    public final boolean mo8314b() {
        return true;
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: c */
    public final void mo8315c(String str) {
        Context context = this.f12381a;
        JobScheduler jobScheduler = this.f12382b;
        ArrayList arrayListM8311d = m8311d(context, jobScheduler, str);
        if (arrayListM8311d == null || arrayListM8311d.isEmpty()) {
            return;
        }
        Iterator it = arrayListM8311d.iterator();
        while (it.hasNext()) {
            m8310a(jobScheduler, ((Integer) it.next()).intValue());
        }
        T71 t71Mo10325r = this.f12383c.f6316c.mo10325r();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t71Mo10325r.f11173a;
        workDatabase_Impl.m23792b();
        C10061kr0 c10061kr0 = (C10061kr0) t71Mo10325r.f11176d;
        C3936dZ c3936dZM2771a = c10061kr0.m2771a();
        if (str == null) {
            c3936dZM2771a.mo2032V(1);
        } else {
            c3936dZM2771a.mo2033d(1, str);
        }
        workDatabase_Impl.m23793c();
        try {
            c3936dZM2771a.m17710m();
            workDatabase_Impl.m23799n();
        } finally {
            workDatabase_Impl.m23795j();
            c10061kr0.m2776f(c3936dZM2771a);
        }
    }

    @Override // p000.InterfaceC11933zV0
    /* renamed from: e */
    public final void mo8316e(C8383Uo1... c8383Uo1Arr) {
        int iIntValue;
        ArrayList arrayListM8311d;
        int iIntValue2;
        C7863Ko1 c7863Ko1 = this.f12383c;
        WorkDatabase workDatabase = c7863Ko1.f6316c;
        C9432fw1 c9432fw1 = new C9432fw1(workDatabase);
        for (C8383Uo1 c8383Uo1 : c8383Uo1Arr) {
            workDatabase.m23793c();
            try {
                C8383Uo1 c8383Uo1M8569l = workDatabase.mo10328u().m8569l(c8383Uo1.f12134a);
                if (c8383Uo1M8569l != null && c8383Uo1M8569l.f12135b == 1) {
                    C7551Eo1 c7551Eo1M22338d = AbstractC10084l12.m22338d(c8383Uo1);
                    S71 s71M7559G = workDatabase.mo10325r().m7559G(c7551Eo1M22338d);
                    WorkDatabase workDatabase2 = (WorkDatabase) c9432fw1.f27505b;
                    if (s71M7559G != null) {
                        iIntValue = s71M7559G.f10590c;
                    } else {
                        c7863Ko1.f6315b.getClass();
                        Object objM23798m = workDatabase2.m23798m(new X50(c9432fw1, c7863Ko1.f6315b.f42151a, 0));
                        O90.m5967e(objM23798m, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objM23798m).intValue();
                    }
                    if (s71M7559G == null) {
                        c7863Ko1.f6316c.mo10325r().m7560H(new S71(c7551Eo1M22338d.f2911a, c7551Eo1M22338d.f2912b, iIntValue));
                    }
                    m8317h(c8383Uo1, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListM8311d = m8311d(this.f12381a, this.f12382b, c8383Uo1.f12134a)) != null) {
                        int iIndexOf = arrayListM8311d.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListM8311d.remove(iIndexOf);
                        }
                        if (arrayListM8311d.isEmpty()) {
                            c7863Ko1.f6315b.getClass();
                            Object objM23798m2 = workDatabase2.m23798m(new X50(c9432fw1, c7863Ko1.f6315b.f42151a, 0));
                            O90.m5967e(objM23798m2, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objM23798m2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListM8311d.get(0)).intValue();
                        }
                        m8317h(c8383Uo1, iIntValue2);
                    }
                    workDatabase.m23799n();
                } else {
                    C1210TE.m7634G().getClass();
                    workDatabase.m23799n();
                }
            } finally {
                workDatabase.m23795j();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* renamed from: h */
    public final void m8317h(p000.C8383Uo1 r19, int r20) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.V71.m8317h(Uo1, int):void");
    }
}

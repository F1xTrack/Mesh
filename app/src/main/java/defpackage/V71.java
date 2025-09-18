package defpackage;

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
public final class V71 implements InterfaceC8375zV0 {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final JobScheduler b;
    public final C0844Ko1 c;
    public final U71 d;

    static {
        TE.M("SystemJobScheduler");
    }

    public V71(Context context, C0844Ko1 c0844Ko1) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        U71 u71 = new U71(context);
        this.a = context;
        this.c = c0844Ko1;
        this.b = jobScheduler;
        this.d = u71;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            TE teG = TE.G();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            teG.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            C0376Eo1 c0376Eo1G = g(jobInfo);
            if (c0376Eo1G != null && str.equals(c0376Eo1G.a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            TE.G().getClass();
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

    public static C0376Eo1 g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0376Eo1(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC8375zV0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.InterfaceC8375zV0
    public final void c(String str) {
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList arrayListD = d(context, jobScheduler, str);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        T71 t71R = this.c.c.r();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t71R.a;
        workDatabase_Impl.b();
        C5581kr0 c5581kr0 = (C5581kr0) t71R.d;
        C3414dZ c3414dZA = c5581kr0.a();
        if (str == null) {
            c3414dZA.V(1);
        } else {
            c3414dZA.d(1, str);
        }
        workDatabase_Impl.c();
        try {
            c3414dZA.m();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            c5581kr0.f(c3414dZA);
        }
    }

    @Override // defpackage.InterfaceC8375zV0
    public final void e(C1623Uo1... c1623Uo1Arr) {
        int iIntValue;
        ArrayList arrayListD;
        int iIntValue2;
        C0844Ko1 c0844Ko1 = this.c;
        WorkDatabase workDatabase = c0844Ko1.c;
        C3866fw1 c3866fw1 = new C3866fw1(workDatabase);
        for (C1623Uo1 c1623Uo1 : c1623Uo1Arr) {
            workDatabase.c();
            try {
                C1623Uo1 c1623Uo1L = workDatabase.u().l(c1623Uo1.a);
                if (c1623Uo1L != null && c1623Uo1L.b == 1) {
                    C0376Eo1 c0376Eo1D = AbstractC5615l12.d(c1623Uo1);
                    S71 s71G = workDatabase.r().G(c0376Eo1D);
                    WorkDatabase workDatabase2 = (WorkDatabase) c3866fw1.b;
                    if (s71G != null) {
                        iIntValue = s71G.c;
                    } else {
                        c0844Ko1.b.getClass();
                        Object objM = workDatabase2.m(new X50(c3866fw1, c0844Ko1.b.a, 0));
                        O90.e(objM, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objM).intValue();
                    }
                    if (s71G == null) {
                        c0844Ko1.c.r().H(new S71(c0376Eo1D.a, c0376Eo1D.b, iIntValue));
                    }
                    h(c1623Uo1, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListD = d(this.a, this.b, c1623Uo1.a)) != null) {
                        int iIndexOf = arrayListD.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListD.remove(iIndexOf);
                        }
                        if (arrayListD.isEmpty()) {
                            c0844Ko1.b.getClass();
                            Object objM2 = workDatabase2.m(new X50(c3866fw1, c0844Ko1.b.a, 0));
                            O90.e(objM2, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objM2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListD.get(0)).intValue();
                        }
                        h(c1623Uo1, iIntValue2);
                    }
                    workDatabase.n();
                } else {
                    TE.G().getClass();
                    workDatabase.n();
                }
            } finally {
                workDatabase.j();
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
    public final void h(defpackage.C1623Uo1 r19, int r20) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V71.h(Uo1, int):void");
    }
}

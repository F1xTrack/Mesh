package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p000.AbstractC0083BJ;
import p000.AbstractC10340n12;
import p000.AbstractC8008Nj0;
import p000.C10781qT0;
import p000.C1210TE;
import p000.C4149gy;
import p000.C7249zC;
import p000.C7863Ko1;
import p000.C7967Mo1;
import p000.C8383Uo1;
import p000.C8435Vo1;
import p000.C8539Xo1;
import p000.MY1;
import p000.O90;
import p000.RY1;
import p000.T71;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m22267d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.m5968f(context, "context");
        O90.m5968f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final AbstractC8008Nj0 doWork() throws Throwable {
        C10781qT0 c10781qT0;
        T71 t71;
        C7967Mo1 c7967Mo1;
        C8539Xo1 c8539Xo1;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        WorkDatabase workDatabase = C7863Ko1.m4736d(getApplicationContext()).f6316c;
        O90.m5967e(workDatabase, "workManager.workDatabase");
        C8435Vo1 c8435Vo1Mo10328u = workDatabase.mo10328u();
        C7967Mo1 c7967Mo1Mo10326s = workDatabase.mo10326s();
        C8539Xo1 c8539Xo1Mo10329v = workDatabase.mo10329v();
        T71 t71Mo10325r = workDatabase.mo10325r();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        c8435Vo1Mo10328u.getClass();
        C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c10781qT0M24005a.mo2030E(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c8435Vo1Mo10328u.f12763a;
        workDatabase_Impl.m23792b();
        Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
        try {
            int iM5396c = MY1.m5396c(cursorM7035c, NotificationConstants.f19487ID);
            int iM5396c2 = MY1.m5396c(cursorM7035c, "state");
            int iM5396c3 = MY1.m5396c(cursorM7035c, "worker_class_name");
            int iM5396c4 = MY1.m5396c(cursorM7035c, "input_merger_class_name");
            int iM5396c5 = MY1.m5396c(cursorM7035c, "input");
            int iM5396c6 = MY1.m5396c(cursorM7035c, "output");
            int iM5396c7 = MY1.m5396c(cursorM7035c, "initial_delay");
            int iM5396c8 = MY1.m5396c(cursorM7035c, "interval_duration");
            int iM5396c9 = MY1.m5396c(cursorM7035c, "flex_duration");
            int iM5396c10 = MY1.m5396c(cursorM7035c, "run_attempt_count");
            int iM5396c11 = MY1.m5396c(cursorM7035c, "backoff_policy");
            int iM5396c12 = MY1.m5396c(cursorM7035c, "backoff_delay_duration");
            int iM5396c13 = MY1.m5396c(cursorM7035c, "last_enqueue_time");
            int iM5396c14 = MY1.m5396c(cursorM7035c, "minimum_retention_duration");
            c10781qT0 = c10781qT0M24005a;
            try {
                int iM5396c15 = MY1.m5396c(cursorM7035c, "schedule_requested_at");
                int iM5396c16 = MY1.m5396c(cursorM7035c, "run_in_foreground");
                int iM5396c17 = MY1.m5396c(cursorM7035c, "out_of_quota_policy");
                int iM5396c18 = MY1.m5396c(cursorM7035c, "period_count");
                int iM5396c19 = MY1.m5396c(cursorM7035c, "generation");
                int iM5396c20 = MY1.m5396c(cursorM7035c, "required_network_type");
                int iM5396c21 = MY1.m5396c(cursorM7035c, "requires_charging");
                int iM5396c22 = MY1.m5396c(cursorM7035c, "requires_device_idle");
                int iM5396c23 = MY1.m5396c(cursorM7035c, "requires_battery_not_low");
                int iM5396c24 = MY1.m5396c(cursorM7035c, "requires_storage_not_low");
                int iM5396c25 = MY1.m5396c(cursorM7035c, "trigger_content_update_delay");
                int iM5396c26 = MY1.m5396c(cursorM7035c, "trigger_max_content_delay");
                int iM5396c27 = MY1.m5396c(cursorM7035c, "content_uri_triggers");
                int i6 = iM5396c14;
                ArrayList arrayList = new ArrayList(cursorM7035c.getCount());
                while (cursorM7035c.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM7035c.isNull(iM5396c) ? null : cursorM7035c.getString(iM5396c);
                    int iM23052g = AbstractC10340n12.m23052g(cursorM7035c.getInt(iM5396c2));
                    String string2 = cursorM7035c.isNull(iM5396c3) ? null : cursorM7035c.getString(iM5396c3);
                    String string3 = cursorM7035c.isNull(iM5396c4) ? null : cursorM7035c.getString(iM5396c4);
                    C7249zC c7249zCM26326a = C7249zC.m26326a(cursorM7035c.isNull(iM5396c5) ? null : cursorM7035c.getBlob(iM5396c5));
                    C7249zC c7249zCM26326a2 = C7249zC.m26326a(cursorM7035c.isNull(iM5396c6) ? null : cursorM7035c.getBlob(iM5396c6));
                    long j = cursorM7035c.getLong(iM5396c7);
                    long j2 = cursorM7035c.getLong(iM5396c8);
                    long j3 = cursorM7035c.getLong(iM5396c9);
                    int i7 = cursorM7035c.getInt(iM5396c10);
                    int iM23049d = AbstractC10340n12.m23049d(cursorM7035c.getInt(iM5396c11));
                    long j4 = cursorM7035c.getLong(iM5396c12);
                    long j5 = cursorM7035c.getLong(iM5396c13);
                    int i8 = i6;
                    long j6 = cursorM7035c.getLong(i8);
                    int i9 = iM5396c11;
                    int i10 = iM5396c15;
                    long j7 = cursorM7035c.getLong(i10);
                    iM5396c15 = i10;
                    int i11 = iM5396c16;
                    if (cursorM7035c.getInt(i11) != 0) {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = true;
                    } else {
                        iM5396c16 = i11;
                        i = iM5396c17;
                        z = false;
                    }
                    int iM23051f = AbstractC10340n12.m23051f(cursorM7035c.getInt(i));
                    iM5396c17 = i;
                    int i12 = iM5396c18;
                    int i13 = cursorM7035c.getInt(i12);
                    iM5396c18 = i12;
                    int i14 = iM5396c19;
                    int i15 = cursorM7035c.getInt(i14);
                    iM5396c19 = i14;
                    int i16 = iM5396c20;
                    int iM23050e = AbstractC10340n12.m23050e(cursorM7035c.getInt(i16));
                    iM5396c20 = i16;
                    int i17 = iM5396c21;
                    if (cursorM7035c.getInt(i17) != 0) {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = true;
                    } else {
                        iM5396c21 = i17;
                        i2 = iM5396c22;
                        z2 = false;
                    }
                    if (cursorM7035c.getInt(i2) != 0) {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = true;
                    } else {
                        iM5396c22 = i2;
                        i3 = iM5396c23;
                        z3 = false;
                    }
                    if (cursorM7035c.getInt(i3) != 0) {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = true;
                    } else {
                        iM5396c23 = i3;
                        i4 = iM5396c24;
                        z4 = false;
                    }
                    if (cursorM7035c.getInt(i4) != 0) {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = true;
                    } else {
                        iM5396c24 = i4;
                        i5 = iM5396c25;
                        z5 = false;
                    }
                    long j8 = cursorM7035c.getLong(i5);
                    iM5396c25 = i5;
                    int i18 = iM5396c26;
                    long j9 = cursorM7035c.getLong(i18);
                    iM5396c26 = i18;
                    int i19 = iM5396c27;
                    if (!cursorM7035c.isNull(i19)) {
                        blob = cursorM7035c.getBlob(i19);
                    }
                    iM5396c27 = i19;
                    arrayList.add(new C8383Uo1(string, iM23052g, string2, string3, c7249zCM26326a, c7249zCM26326a2, j, j2, j3, new C4149gy(iM23050e, z2, z3, z4, z5, j8, j9, AbstractC10340n12.m23048c(blob)), i7, iM23049d, j4, j5, j6, j7, z, iM23051f, i13, i15));
                    iM5396c11 = i9;
                    i6 = i8;
                }
                cursorM7035c.close();
                c10781qT0.release();
                ArrayList arrayListM8565h = c8435Vo1Mo10328u.m8565h();
                ArrayList arrayListM8563f = c8435Vo1Mo10328u.m8563f();
                if (arrayList.isEmpty()) {
                    t71 = t71Mo10325r;
                    c7967Mo1 = c7967Mo1Mo10326s;
                    c8539Xo1 = c8539Xo1Mo10329v;
                } else {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    int i20 = AbstractC0083BJ.f706a;
                    c1210teM7634G.getClass();
                    C1210TE c1210teM7634G2 = C1210TE.m7634G();
                    t71 = t71Mo10325r;
                    c7967Mo1 = c7967Mo1Mo10326s;
                    c8539Xo1 = c8539Xo1Mo10329v;
                    AbstractC0083BJ.m579a(c7967Mo1, c8539Xo1, t71, arrayList);
                    c1210teM7634G2.getClass();
                }
                if (!arrayListM8565h.isEmpty()) {
                    C1210TE c1210teM7634G3 = C1210TE.m7634G();
                    int i21 = AbstractC0083BJ.f706a;
                    c1210teM7634G3.getClass();
                    C1210TE c1210teM7634G4 = C1210TE.m7634G();
                    AbstractC0083BJ.m579a(c7967Mo1, c8539Xo1, t71, arrayListM8565h);
                    c1210teM7634G4.getClass();
                }
                if (!arrayListM8563f.isEmpty()) {
                    C1210TE c1210teM7634G5 = C1210TE.m7634G();
                    int i22 = AbstractC0083BJ.f706a;
                    c1210teM7634G5.getClass();
                    C1210TE c1210teM7634G6 = C1210TE.m7634G();
                    AbstractC0083BJ.m579a(c7967Mo1, c8539Xo1, t71, arrayListM8563f);
                    c1210teM7634G6.getClass();
                }
                return AbstractC8008Nj0.m5818a();
            } catch (Throwable th) {
                th = th;
                cursorM7035c.close();
                c10781qT0.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c10781qT0 = c10781qT0M24005a;
        }
    }
}

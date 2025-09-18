package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* renamed from: pP1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6453pP1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ EY1 b;
    public /* synthetic */ BinderC5880mP1 c;

    public /* synthetic */ RunnableC6453pP1() {
        this.a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C5674lK1 c5674lK1M1;
        switch (this.a) {
            case 0:
                BinderC5880mP1 binderC5880mP1 = this.c;
                binderC5880mP1.a.f0();
                binderC5880mP1.a.Z(this.b);
                break;
            case 1:
                BinderC5880mP1 binderC5880mP12 = this.c;
                binderC5880mP12.a.f0();
                C5716lY1 c5716lY1 = binderC5880mP12.a;
                RI1.p(c5716lY1);
                EY1 ey1 = this.b;
                Preconditions.checkNotEmpty(ey1.a);
                c5716lY1.i(ey1);
                break;
            case 2:
                BinderC5880mP1 binderC5880mP13 = this.c;
                binderC5880mP13.a.f0();
                C5716lY1 c5716lY12 = binderC5880mP13.a;
                RI1.p(c5716lY12);
                EY1 ey12 = this.b;
                Preconditions.checkNotNull(ey12);
                Preconditions.checkNotEmpty(ey12.a);
                boolean zE1 = c5716lY12.U().E1(null, IB1.u0);
                int i = 0;
                String str = ey12.a;
                if (zE1) {
                    long jCurrentTimeMillis = c5716lY12.zzb().currentTimeMillis();
                    int iZ1 = c5716lY12.U().z1(null, IB1.d0);
                    c5716lY12.U();
                    long jLongValue = jCurrentTimeMillis - ((Long) IB1.e.a(null)).longValue();
                    while (i < iZ1 && c5716lY12.O(jLongValue, null)) {
                        i++;
                    }
                } else {
                    c5716lY12.U();
                    long jIntValue = ((Integer) IB1.l.a(null)).intValue();
                    while (i < jIntValue && c5716lY12.O(0L, str)) {
                        i++;
                    }
                }
                if (c5716lY12.U().E1(null, IB1.v0)) {
                    c5716lY12.F();
                }
                if (c5716lY12.U().E1(null, IB1.L0)) {
                    YK1 yk1A = YK1.a(ey12.G);
                    C3413dY1 c3413dY1 = c5716lY12.j;
                    c3413dY1.v1();
                    if (((C3386dP1) c3413dY1.b).g.E1(null, IB1.K0) && yk1A == YK1.CLIENT_UPLOAD_ELIGIBLE && !C3413dY1.B1(str) && (c5674lK1M1 = c3413dY1.y1().M1(str)) != null && c5674lK1M1.E() && !c5674lK1M1.v().p().isEmpty()) {
                        c5716lY12.A(c5716lY12.zzb().currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            default:
                BinderC5880mP1 binderC5880mP14 = this.c;
                binderC5880mP14.a.f0();
                C5716lY1 c5716lY13 = binderC5880mP14.a;
                if (c5716lY13.y != null) {
                    ArrayList arrayList = new ArrayList();
                    c5716lY13.z = arrayList;
                    arrayList.addAll(c5716lY13.y);
                }
                C1656Uz1 c1656Uz1 = c5716lY13.c;
                C5716lY1.w(c1656Uz1);
                EY1 ey13 = this.b;
                String str2 = (String) Preconditions.checkNotNull(ey13.a);
                Preconditions.checkNotEmpty(str2);
                c1656Uz1.v1();
                c1656Uz1.z1();
                try {
                    SQLiteDatabase sQLiteDatabaseC1 = c1656Uz1.C1();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseC1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseC1.delete("events", "app_id=?", strArr) + sQLiteDatabaseC1.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseC1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseC1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseC1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseC1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseC1.delete("queue", "app_id=?", strArr) + sQLiteDatabaseC1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseC1.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseC1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseC1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseC1.delete("upload_queue", "app_id=?", strArr);
                    if (iDelete > 0) {
                        c1656Uz1.n().o.b(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    c1656Uz1.n().g.b(OL1.B1(str2), e, "Error resetting analytics data. appId, error");
                }
                if (ey13.h) {
                    c5716lY13.T(ey13);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC6453pP1(BinderC5880mP1 binderC5880mP1, EY1 ey1, int i) {
        this.a = i;
        this.b = ey1;
        this.c = binderC5880mP1;
    }
}

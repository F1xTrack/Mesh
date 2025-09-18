package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* renamed from: pP1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10646pP1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f40052a;

    /* renamed from: b */
    public /* synthetic */ EY1 f40053b;

    /* renamed from: c */
    public /* synthetic */ BinderC10262mP1 f40054c;

    public /* synthetic */ RunnableC10646pP1() {
        this.f40052a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C10124lK1 c10124lK1M5658M1;
        switch (this.f40052a) {
            case 0:
                BinderC10262mP1 binderC10262mP1 = this.f40054c;
                binderC10262mP1.f37671a.m22486f0();
                binderC10262mP1.f37671a.m22477Z(this.f40053b);
                break;
            case 1:
                BinderC10262mP1 binderC10262mP12 = this.f40054c;
                binderC10262mP12.f37671a.m22486f0();
                C10152lY1 c10152lY1 = binderC10262mP12.f37671a;
                RI1.m6952p(c10152lY1);
                EY1 ey1 = this.f40053b;
                Preconditions.checkNotEmpty(ey1.f2754a);
                c10152lY1.m22491i(ey1);
                break;
            case 2:
                BinderC10262mP1 binderC10262mP13 = this.f40054c;
                binderC10262mP13.f37671a.m22486f0();
                C10152lY1 c10152lY12 = binderC10262mP13.f37671a;
                RI1.m6952p(c10152lY12);
                EY1 ey12 = this.f40053b;
                Preconditions.checkNotNull(ey12);
                Preconditions.checkNotEmpty(ey12.f2754a);
                boolean zM6511E1 = c10152lY12.m22472U().m6511E1(null, IB1.f4827u0);
                int i = 0;
                String str = ey12.f2754a;
                if (zM6511E1) {
                    long jCurrentTimeMillis = c10152lY12.zzb().currentTimeMillis();
                    int iM6518z1 = c10152lY12.m22472U().m6518z1(null, IB1.f4790d0);
                    c10152lY12.m22472U();
                    long jLongValue = jCurrentTimeMillis - ((Long) IB1.f4792e.m3028a(null)).longValue();
                    while (i < iM6518z1 && c10152lY12.m22466O(jLongValue, null)) {
                        i++;
                    }
                } else {
                    c10152lY12.m22472U();
                    long jIntValue = ((Integer) IB1.f4808l.m3028a(null)).intValue();
                    while (i < jIntValue && c10152lY12.m22466O(0L, str)) {
                        i++;
                    }
                }
                if (c10152lY12.m22472U().m6511E1(null, IB1.f4829v0)) {
                    c10152lY12.m22457F();
                }
                if (c10152lY12.m22472U().m6511E1(null, IB1.f4751L0)) {
                    YK1 yk1M9258a = YK1.m9258a(ey12.f2753G);
                    C9128dY1 c9128dY1 = c10152lY12.f37132j;
                    c9128dY1.mo7681v1();
                    if (((C9110dP1) c9128dY1.f11615b).f26037g.m6511E1(null, IB1.f4749K0) && yk1M9258a == YK1.CLIENT_UPLOAD_ELIGIBLE && !C9128dY1.m17707B1(str) && (c10124lK1M5658M1 = c9128dY1.m4345y1().m5658M1(str)) != null && c10124lK1M5658M1.m22394E() && !c10124lK1M5658M1.m22401v().m23982p().isEmpty()) {
                        c10152lY12.m22452A(c10152lY12.zzb().currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            default:
                BinderC10262mP1 binderC10262mP14 = this.f40054c;
                binderC10262mP14.f37671a.m22486f0();
                C10152lY1 c10152lY13 = binderC10262mP14.f37671a;
                if (c10152lY13.f37147y != null) {
                    ArrayList arrayList = new ArrayList();
                    c10152lY13.f37148z = arrayList;
                    arrayList.addAll(c10152lY13.f37147y);
                }
                C8405Uz1 c8405Uz1 = c10152lY13.f37125c;
                C10152lY1.m22451w(c8405Uz1);
                EY1 ey13 = this.f40053b;
                String str2 = (String) Preconditions.checkNotNull(ey13.f2754a);
                Preconditions.checkNotEmpty(str2);
                c8405Uz1.mo7681v1();
                c8405Uz1.m18576z1();
                try {
                    SQLiteDatabase sQLiteDatabaseM8212C1 = c8405Uz1.m8212C1();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM8212C1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("events", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM8212C1.delete("upload_queue", "app_id=?", strArr);
                    if (iDelete > 0) {
                        c8405Uz1.mo6070n().f8386o.m24553b(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    c8405Uz1.mo6070n().f8378g.m24553b(OL1.m6026B1(str2), e, "Error resetting analytics data. appId, error");
                }
                if (ey13.f2761h) {
                    c10152lY13.m22471T(ey13);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC10646pP1(BinderC10262mP1 binderC10262mP1, EY1 ey1, int i) {
        this.f40052a = i;
        this.f40053b = ey1;
        this.f40054c = binderC10262mP1;
    }
}

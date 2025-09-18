package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.W4 */
/* loaded from: classes2.dex */
public final class C4892W4 extends DatabaseScript {

    /* renamed from: a */
    public final int f30896a = 2000;

    /* renamed from: b */
    public final String f30897b = NotificationConstants.NUMBER;

    /* renamed from: c */
    public final String f30898c = "global_number";

    /* renamed from: d */
    public final String f30899d = "number_of_type";

    /* renamed from: e */
    public final String f30900e = "name";

    /* renamed from: f */
    public final String f30901f = "value";

    /* renamed from: g */
    public final String f30902g = "type";

    /* renamed from: h */
    public final String f30903h = CrashHianalyticsData.TIME;

    /* renamed from: i */
    public final String f30904i = "session_id";

    /* renamed from: j */
    public final String f30905j = "error_environment";

    /* renamed from: k */
    public final String f30906k = "session_type";

    /* renamed from: l */
    public final String f30907l = "app_environment";

    /* renamed from: m */
    public final String f30908m = "app_environment_revision";

    /* renamed from: n */
    public final String f30909n = "truncated";

    /* renamed from: o */
    public final String f30910o = "custom_type";

    /* renamed from: p */
    public final String f30911p = "encrypting_mode";

    /* renamed from: q */
    public final String f30912q = "profile_id";

    /* renamed from: r */
    public final String f30913r = "first_occurrence_status";

    /* renamed from: s */
    public final String f30914s = "source";

    /* renamed from: t */
    public final String f30915t = "attribution_id_changed";

    /* renamed from: u */
    public final String f30916u = "open_id";

    /* renamed from: v */
    public final String f30917v = "extras";

    /* renamed from: w */
    public final String f30918w = "reports";

    /* renamed from: x */
    public final C5141g7 f30919x = new C5141g7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public static boolean m19932a(C5116f7 c5116f7) {
        Long l;
        EnumC4898Wa enumC4898Wa;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        Long l5 = c5116f7.f31659a;
        return (l5 == null || l5.longValue() < 10000000000L || c5116f7.f31660b == null || (l = c5116f7.f31661c) == null || l.longValue() < 0 || (enumC4898Wa = c5116f7.f31662d) == null || enumC4898Wa == EnumC4898Wa.EVENT_TYPE_UNDEFINED || (l2 = c5116f7.f31663e) == null || l2.longValue() < 0 || (l3 = c5116f7.f31664f) == null || l3.longValue() < 0 || ((l4 = c5116f7.f31665g.f31540d) != null && l4.longValue() < 0) || ((num = c5116f7.f31665g.f31545i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query(this.f30918w, null, null, null, null, null, null, String.valueOf(this.f30896a));
            while (cursorQuery.moveToNext()) {
                try {
                    C5116f7 c5116f7M19933a = m19933a(cursorQuery);
                    if (c5116f7M19933a != null && m19932a(c5116f7M19933a)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f30919x.fromModel(c5116f7M19933a));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursorQuery = cursor;
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f30918w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f30918w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|2|65|3|(1:5)(2:6|(2:8|5)(1:9))|10|(1:12)(3:13|(1:15)(2:16|(1:18)(1:19))|12)|20|63|21|(2:24|(1:26)(16:27|30|57|31|(1:33)(2:34|(0)(1:37))|61|40|(1:43)|44|59|45|48|(1:50)(1:51)|52|53|54))|23|57|31|(0)(0)|61|40|(0)|44|59|45|48|(0)(0)|52|53|54|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC5243k9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[PHI: r4
  0x0115: PHI (r4v7 io.appmetrica.analytics.impl.k9) = (r4v5 io.appmetrica.analytics.impl.k9), (r4v6 io.appmetrica.analytics.impl.k9) binds: [B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:31:0x0107, B:34:0x0118), top: B:57:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:10:0x002a, B:20:0x00e0, B:44:0x0132, B:48:0x0142, B:52:0x0157, B:51:0x0151, B:38:0x0120, B:29:0x0103, B:13:0x00d4, B:16:0x00d9, B:6:0x0024, B:31:0x0107, B:34:0x0118, B:21:0x00ea, B:24:0x00fb, B:27:0x0100), top: B:65:0x0005, inners: #0, #3 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5116f7 m19933a(android.database.Cursor r32) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4892W4.m19933a(android.database.Cursor):io.appmetrica.analytics.impl.f7");
    }
}

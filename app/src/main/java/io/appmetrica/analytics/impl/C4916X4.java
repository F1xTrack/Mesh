package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.X4 */
/* loaded from: classes2.dex */
public final class C4916X4 extends DatabaseScript {

    /* renamed from: a */
    public final String f31003a = "sessions";

    /* renamed from: b */
    public final int f31004b = 200;

    /* renamed from: c */
    public final String f31005c = NotificationConstants.f19487ID;

    /* renamed from: d */
    public final String f31006d = "start_time";

    /* renamed from: e */
    public final String f31007e = "report_request_parameters";

    /* renamed from: f */
    public final String f31008f = "server_time_offset";

    /* renamed from: g */
    public final String f31009g = "type";

    /* renamed from: h */
    public final String f31010h = "obtained_before_first_sync";

    /* renamed from: i */
    public final C5491u7 f31011i = new C5491u7(null, 1, 0 == true ? 1 : 0);

    /* renamed from: a */
    public final C5466t7 m19963a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f31005c)));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(this.f31009g));
            EnumC4955Yj enumC4955Yj = EnumC4955Yj.FOREGROUND;
            boolean z = true;
            if (i != 0) {
                enumC4955Yj = EnumC4955Yj.BACKGROUND;
                if (i != 1) {
                    enumC4955Yj = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f31007e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f31006d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f31008f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f31010h)) != 1) {
                z = false;
            }
            return new C5466t7(lValueOf, enumC4955Yj, string, new C5441s7(lValueOf2, lValueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    @Override // io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void runScript(android.database.sqlite.SQLiteDatabase r12) throws android.database.SQLException {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r3 = r11.f31003a     // Catch: java.lang.Throwable -> L5a
            int r2 = r11.f31004b     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5a
        L19:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            io.appmetrica.analytics.impl.t7 r3 = r11.m19963a(r2)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L19
            java.lang.Long r4 = r3.f32621a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L19
            io.appmetrica.analytics.impl.Yj r4 = r3.f32622b     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            java.lang.String r4 = r3.f32623c     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L42
            goto L19
        L42:
            io.appmetrica.analytics.impl.s7 r4 = r3.f32624d     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r4 = r4.f32535a     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L19
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L19
            io.appmetrica.analytics.impl.u7 r4 = r11.f31011i     // Catch: java.lang.Throwable -> L5b
            android.content.ContentValues r3 = r4.fromModel(r3)     // Catch: java.lang.Throwable -> L5b
            r0.add(r3)     // Catch: java.lang.Throwable -> L5b
            goto L19
        L5a:
            r2 = r1
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r2.<init>(r3)
            java.lang.String r3 = r11.f31003a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.execSQL(r2)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )"
            r12.execSQL(r2)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r0.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            java.lang.String r3 = "sessions"
            r12.insertOrThrow(r3, r1, r2)     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4916X4.runScript(android.database.sqlite.SQLiteDatabase):void");
    }
}

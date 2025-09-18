package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.k9 */
/* loaded from: classes2.dex */
public class C3385k9 extends AbstractC2850P8 {

    /* renamed from: a */
    private static final String f23916a = "CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + EnumC3772z6.FOREGROUND.m17324a() + ",app_environment TEXT DEFAULT '{}',app_environment_revision INTEGER DEFAULT 0 )";

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws Throwable {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment TEXT DEFAULT '{}'");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment_revision INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
        sQLiteDatabase.execSQL(f23916a);
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                    String asString = contentValues.getAsString("environment");
                    contentValues.remove("environment");
                    contentValues.put("error_environment", asString);
                    sQLiteDatabase.insert("reports", null, contentValues);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    C2968U2.m15239a(cursor);
                    throw th;
                }
            }
            C2968U2.m15239a(cursorRawQuery);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

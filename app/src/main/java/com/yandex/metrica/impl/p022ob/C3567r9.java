package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.r9 */
/* loaded from: classes2.dex */
public class C3567r9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN first_occurrence_status INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}

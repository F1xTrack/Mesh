package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.m9 */
/* loaded from: classes2.dex */
public class C3437m9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN connection_type INTEGER DEFAULT 2");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cellular_connection_type TEXT ");
    }
}

package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.h9 */
/* loaded from: classes2.dex */
public class C3307h9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}

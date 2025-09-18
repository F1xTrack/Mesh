package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.m9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2923m9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN connection_type INTEGER DEFAULT 2");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cellular_connection_type TEXT ");
    }
}

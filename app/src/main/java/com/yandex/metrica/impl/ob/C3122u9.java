package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.u9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3122u9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN global_number INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN number_of_type INTEGER DEFAULT 0");
    }
}

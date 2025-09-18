package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.YandexMetrica;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.a9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2624a9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS api_level_info (API_LEVEL INT )");
        ContentValues contentValues = new ContentValues();
        contentValues.put("API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        sQLiteDatabase.insert("api_level_info", "API_LEVEL", contentValues);
    }
}

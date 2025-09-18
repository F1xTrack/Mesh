package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2898l9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN truncated INTEGER DEFAULT 0");
    }
}

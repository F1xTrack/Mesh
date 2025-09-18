package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.s9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3072s9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN wifi_network_info TEXT DEFAULT ''");
    }
}

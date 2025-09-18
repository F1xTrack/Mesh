package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p022ob.C2825O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.U8 */
/* loaded from: classes2.dex */
public class C2974U8 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL(C2825O8.d.f21857b);
        sQLiteDatabase.execSQL(C2825O8.e.f21859b);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}

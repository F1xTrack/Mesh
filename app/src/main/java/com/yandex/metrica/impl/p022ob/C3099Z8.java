package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p022ob.C2825O8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.Z8 */
/* loaded from: classes2.dex */
public class C3099Z8 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C2825O8.a.b.f21853b);
        sQLiteDatabase.execSQL(C2825O8.a.InterfaceC7302a.f21851b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}

package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.j9 */
/* loaded from: classes2.dex */
public class C3359j9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb = new StringBuilder("ALTER TABLE reports ADD COLUMN session_type INTEGER DEFAULT ");
        EnumC3772z6 enumC3772z6 = EnumC3772z6.FOREGROUND;
        sb.append(enumC3772z6.m17324a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder("UPDATE reports SET session_type = ");
        EnumC3772z6 enumC3772z62 = EnumC3772z6.BACKGROUND;
        sb2.append(enumC3772z62.m17324a());
        sb2.append(" WHERE session_id = -2");
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN type INTEGER DEFAULT " + enumC3772z6.m17324a());
        sQLiteDatabase.execSQL("UPDATE sessions SET type = " + enumC3772z62.m17324a() + " WHERE id = -2");
    }
}

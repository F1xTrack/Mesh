package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.j9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2848j9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb = new StringBuilder("ALTER TABLE reports ADD COLUMN session_type INTEGER DEFAULT ");
        EnumC3249z6 enumC3249z6 = EnumC3249z6.FOREGROUND;
        sb.append(enumC3249z6.a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder("UPDATE reports SET session_type = ");
        EnumC3249z6 enumC3249z62 = EnumC3249z6.BACKGROUND;
        sb2.append(enumC3249z62.a());
        sb2.append(" WHERE session_id = -2");
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN type INTEGER DEFAULT " + enumC3249z6.a());
        sQLiteDatabase.execSQL("UPDATE sessions SET type = " + enumC3249z62.a() + " WHERE id = -2");
    }
}

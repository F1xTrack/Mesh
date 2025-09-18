package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.q9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3023q9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN encrypting_mode INTEGER DEFAULT " + EnumC2937mn.NONE.a());
        sQLiteDatabase.execSQL("UPDATE reports SET encrypting_mode = " + EnumC2937mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.a() + " where type=" + EnumC2865k1.EVENT_TYPE_IDENTITY.b());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}

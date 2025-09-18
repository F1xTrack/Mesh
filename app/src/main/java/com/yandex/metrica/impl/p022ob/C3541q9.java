package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.q9 */
/* loaded from: classes2.dex */
public class C3541q9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN encrypting_mode INTEGER DEFAULT " + EnumC3451mn.NONE.m16436a());
        sQLiteDatabase.execSQL("UPDATE reports SET encrypting_mode = " + EnumC3451mn.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.m16436a() + " where type=" + EnumC3377k1.EVENT_TYPE_IDENTITY.m16250b());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}

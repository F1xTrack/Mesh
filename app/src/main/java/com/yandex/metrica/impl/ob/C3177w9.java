package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.M;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.w9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3177w9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN battery_charge_type INTEGER DEFAULT " + M.b.a.UNKNOWN.a());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN collection_mode TEXT");
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", "reports", "value", "type", Integer.valueOf(EnumC2865k1.EVENT_TYPE_START.b())));
    }
}

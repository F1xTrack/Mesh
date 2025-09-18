package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p022ob.C2766M;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.w9 */
/* loaded from: classes2.dex */
public class C3697w9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN battery_charge_type INTEGER DEFAULT " + C2766M.b.a.UNKNOWN.m14568a());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN collection_mode TEXT");
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", "reports", "value", "type", Integer.valueOf(EnumC3377k1.EVENT_TYPE_START.m16250b())));
    }
}

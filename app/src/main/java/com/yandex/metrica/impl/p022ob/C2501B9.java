package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p022ob.C3006Vf;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.B9 */
/* loaded from: classes2.dex */
public class C2501B9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException, android.database.SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN open_id INTEGER DEFAULT " + new C3006Vf.d.a().f22597x);
    }
}

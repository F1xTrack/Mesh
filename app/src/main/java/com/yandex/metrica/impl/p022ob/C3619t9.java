package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.t9 */
/* loaded from: classes2.dex */
public class C3619t9 extends AbstractC2850P8 {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2850P8
    /* renamed from: a */
    public void mo13851a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2L)});
        sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2L)});
    }
}

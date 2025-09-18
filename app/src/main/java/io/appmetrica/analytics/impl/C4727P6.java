package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;
import java.sql.SQLException;

/* renamed from: io.appmetrica.analytics.impl.P6 */
/* loaded from: classes2.dex */
public final class C4727P6 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sessions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
    }
}

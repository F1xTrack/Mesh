package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.sql.SQLException;

/* loaded from: classes2.dex */
public final class R6 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
    }
}

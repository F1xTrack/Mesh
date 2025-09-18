package io.appmetrica.analytics.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4843rj extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS temp_cache (id INTEGER PRIMARY KEY,scope TEXT,data BLOB,timestamp INTEGER)");
    }
}

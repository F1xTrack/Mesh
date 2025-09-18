package io.appmetrica.analytics.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes2.dex */
public final class Y4 extends DatabaseScript {
    public final X4 a = new X4();
    public final W4 b = new W4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        this.a.runScript(sQLiteDatabase);
        this.b.runScript(sQLiteDatabase);
    }
}

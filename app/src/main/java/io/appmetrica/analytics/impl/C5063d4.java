package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.d4 */
/* loaded from: classes2.dex */
public final class C5063d4 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("preferences", "key = ?", new String[]{"NEXT_STARTUP_TIME"});
    }
}

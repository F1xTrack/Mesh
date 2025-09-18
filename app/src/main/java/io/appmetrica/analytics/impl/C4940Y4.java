package io.appmetrica.analytics.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.Y4 */
/* loaded from: classes2.dex */
public final class C4940Y4 extends DatabaseScript {

    /* renamed from: a */
    public final C4916X4 f31091a = new C4916X4();

    /* renamed from: b */
    public final C4892W4 f31092b = new C4892W4();

    @Override // io.appmetrica.analytics.coreapi.internal.p025db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        this.f31091a.runScript(sQLiteDatabase);
        this.f31092b.runScript(sQLiteDatabase);
    }
}

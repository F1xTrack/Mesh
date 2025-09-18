package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.sql.SQLException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class V6 extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException, android.database.SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS temp_cache");
        Iterator<ModuleServicesDatabase> it = C4667ka.C.m().a().iterator();
        while (it.hasNext()) {
            Iterator<TableDescription> it2 = it.next().getTables().iterator();
            while (it2.hasNext()) {
                sQLiteDatabase.execSQL(it2.next().getDropTableScript());
            }
        }
    }
}

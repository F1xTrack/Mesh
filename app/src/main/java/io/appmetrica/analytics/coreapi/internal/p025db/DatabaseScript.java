package io.appmetrica.analytics.coreapi.internal.p025db;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class DatabaseScript {
    public abstract void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException;
}

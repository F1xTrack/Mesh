package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.O8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2824i9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws Throwable {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions_BACKUP (id INTEGER,start_time INTEGER,connection_type INTEGER,network_type TEXT,country_code INTEGER,operator_id INTEGER,lac INTEGER,report_request_parameters TEXT );");
        sQLiteDatabase.execSQL("INSERT INTO sessions_BACKUP SELECT id,start_time,connection_type,network_type,country_code,operator_id,lac,report_request_parameters FROM sessions;");
        sQLiteDatabase.execSQL("DROP TABLE sessions;");
        sQLiteDatabase.execSQL(O8.e.b);
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sessions_BACKUP", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(NotificationConstants.ID);
                    arrayList.add("start_time");
                    arrayList.add("report_request_parameters");
                    ContentValues contentValues2 = new ContentValues(contentValues);
                    for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                        if (!arrayList.contains(entry.getKey())) {
                            contentValues2.remove(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        contentValues.remove((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                    jSONObject.putOpt(HiAnalyticsConstant.BI_KEY_NET_TYPE, contentValues.get("network_type"));
                    jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                    jSONObject.putOpt("lac", contentValues.get("lac"));
                    jSONObject.putOpt("country_code", contentValues.get("country_code"));
                    contentValues2.put("network_info", jSONObject.toString());
                    sQLiteDatabase.insertOrThrow("sessions", null, contentValues2);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    U2.a(cursor);
                    throw th;
                }
            }
            U2.a(cursorRawQuery);
            sQLiteDatabase.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN wifi_network_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cell_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN location_info TEXT DEFAULT ''");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

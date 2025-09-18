package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ew1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3675ew1 extends SQLiteOpenHelper {
    public final C6518pl0 a;

    public C3675ew1(Context context, C6518pl0 c6518pl0) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.a = c6518pl0;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        O90.f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws JSONException, SQLException {
        if (i == 1 && i2 == 2 && sQLiteDatabase != null) {
            this.a.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
                int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(columnIndexOrThrow);
                    O90.e(string, "cursor.getString(uuidColumnIndex)");
                    byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                    O90.e(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                    arrayList.add(C0474Fv0.s(string, D51.h(blob)));
                }
                AbstractC2141aT1.a(cursorRawQuery, null);
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0322Dw1 c0322Dw1 = (C0322Dw1) it.next();
                    O90.f(c0322Dw1, "dto");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = c0322Dw1.a;
                    String str2 = c0322Dw1.b;
                    Map map = c0322Dw1.c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    jSONObject.put("data", jSONObject2);
                    String string2 = jSONObject.toString(0);
                    O90.e(string2, "jsonObject.toString(0)");
                    byte[] bytes = string2.getBytes(AbstractC7680vr.a);
                    O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                    C0190Ce1 c0190Ce1 = C0190Ce1.o;
                    String strV = J8.v(bytes, c0190Ce1);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", str2);
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry entry2 : map.entrySet()) {
                        jSONObject4.put((String) entry2.getKey(), (String) entry2.getValue());
                        it = it;
                    }
                    jSONObject3.put("data", jSONObject4);
                    jSONObject3.put(CrashHianalyticsData.TIME, jCurrentTimeMillis);
                    String string3 = jSONObject3.toString(0);
                    O90.e(string3, "jsonObject.toString(0)");
                    byte[] bytes2 = string3.getBytes(AbstractC7680vr.a);
                    O90.e(bytes2, "this as java.lang.String).getBytes(charset)");
                    String strX = AbstractC7209tN0.x("\n                WHEN metrics_event = x'", strV, "' THEN x'", J8.v(bytes2, c0190Ce1), "'\n            ");
                    arrayList2.add(str);
                    sb.append(strX);
                    it = it;
                }
                sb.append("\n                END\n                WHERE uuid IN (" + AbstractC8069xu.H(arrayList2, null, null, null, C4258i.k, 31) + ")\n            ");
                String string4 = sb.toString();
                O90.e(string4, "updateQuery.toString()");
                sQLiteDatabase.execSQL(AbstractC7728w51.c(string4));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2141aT1.a(cursorRawQuery, th);
                    throw th2;
                }
            }
        }
    }
}

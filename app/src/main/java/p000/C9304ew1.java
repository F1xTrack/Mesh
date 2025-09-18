package p000;

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
public final class C9304ew1 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final C10689pl0 f26947a;

    public C9304ew1(Context context, C10689pl0 c10689pl0) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f26947a = c10689pl0;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        O90.m5968f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws JSONException, SQLException {
        if (i == 1 && i2 == 2 && sQLiteDatabase != null) {
            this.f26947a.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
            try {
                int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
                int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(columnIndexOrThrow);
                    O90.m5967e(string, "cursor.getString(uuidColumnIndex)");
                    byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                    O90.m5967e(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                    arrayList.add(C7616Fv0.m2823s(string, D51.m1549h(blob)));
                }
                AbstractC8729aT1.m9749a(cursorRawQuery, null);
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7515Dw1 c7515Dw1 = (C7515Dw1) it.next();
                    O90.m5968f(c7515Dw1, "dto");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = c7515Dw1.f2326a;
                    String str2 = c7515Dw1.f2327b;
                    Map map = c7515Dw1.f2328c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    jSONObject.put("data", jSONObject2);
                    String string2 = jSONObject.toString(0);
                    O90.m5967e(string2, "jsonObject.toString(0)");
                    byte[] bytes = string2.getBytes(AbstractC7038vr.f44561a);
                    O90.m5967e(bytes, "this as java.lang.String).getBytes(charset)");
                    C7427Ce1 c7427Ce1 = C7427Ce1.f1555o;
                    String strM4195v = AbstractC0576J8.m4195v(bytes, c7427Ce1);
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
                    O90.m5967e(string3, "jsonObject.toString(0)");
                    byte[] bytes2 = string3.getBytes(AbstractC7038vr.f44561a);
                    O90.m5967e(bytes2, "this as java.lang.String).getBytes(charset)");
                    String strM24912x = AbstractC11153tN0.m24912x("\n                WHEN metrics_event = x'", strM4195v, "' THEN x'", AbstractC0576J8.m4195v(bytes2, c7427Ce1), "'\n            ");
                    arrayList2.add(str);
                    sb.append(strM24912x);
                    it = it;
                }
                sb.append("\n                END\n                WHERE uuid IN (" + AbstractC7167xu.m25962H(arrayList2, null, null, null, C4214i.f28726k, 31) + ")\n            ");
                String string4 = sb.toString();
                O90.m5967e(string4, "updateQuery.toString()");
                sQLiteDatabase.execSQL(AbstractC11501w51.m25562c(string4));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC8729aT1.m9749a(cursorRawQuery, th);
                    throw th2;
                }
            }
        }
    }
}

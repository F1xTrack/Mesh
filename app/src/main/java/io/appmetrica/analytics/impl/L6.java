package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class L6 {
    public final ReentrantReadWriteLock.ReadLock a;
    public final ReentrantReadWriteLock.WriteLock b;
    public final Y6 c;
    public final K6 d;
    public final Object e;
    public final ArrayList f;
    public final Context g;
    public final C4567g5 h;
    public final AtomicLong i;
    public final ArrayList j;
    public final H6 k;
    public final C4569g7 l;

    static {
        HashSet hashSet = new HashSet();
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public L6(C4567g5 c4567g5, Y6 y6, H6 h6, C4569g7 c4569g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        this.e = new Object();
        this.f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.j = new ArrayList();
        this.c = y6;
        this.g = c4567g5.getContext();
        this.h = c4567g5;
        this.k = h6;
        this.l = c4569g7;
        atomicLong.set(b());
        K6 k6 = new K6(this, c4567g5);
        this.d = k6;
        k6.setName(a(c4567g5));
    }

    public final long a() {
        this.a.lock();
        try {
            return this.i.get();
        } finally {
            this.a.unlock();
        }
    }

    public final long b() {
        SQLiteDatabase readableDatabase;
        this.a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.a.unlock();
        return jQueryRowsCount;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                    this.a.unlock();
                    hn.a(cursorRawQuery);
                    hn.a(cursorRawQuery2);
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.a.unlock();
        hn.a(cursorRawQuery);
        hn.a(cursorRawQuery2);
    }

    public final void d() {
        this.d.start();
    }

    public final long a(Set set) {
        this.a.lock();
        Cursor cursorRawQuery = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        hn.a(cursorRawQuery);
        this.a.unlock();
        return j;
    }

    public final void a(O8 o8) {
        this.j.add(o8);
    }

    public static String a(Ba ba) {
        return "DatabaseWorker [" + ba.b().e() + "]";
    }

    public final void a(long j, Yj yj, long j2) {
        JSONObject jSONObject;
        boolean zA;
        C4903u7 c4903u7 = new C4903u7(null, 1, 0 == true ? 1 : 0);
        Eg eg = (Eg) this.h.l.a();
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        try {
            jSONObject = new JSONObject().put("dId", eg.getDeviceId()).put("uId", eg.getUuid()).put("appVer", eg.getAppVersion()).put("appBuild", eg.getAppBuildNumber()).put("kitBuildType", eg.getAnalyticsSdkBuildType()).put("osVer", eg.getOsVersion()).put("osApiLev", eg.getOsApiLevel()).put("lang", eg.getLocale()).put("root", eg.getDeviceRootStatus()).put("app_debuggable", ((R5) eg).a).put(CommonUrlParts.APP_FRAMEWORK, eg.getAppFramework()).put("attribution_id", eg.s).put("analyticsSdkVersionName", eg.getAnalyticsSdkVersionName()).put("kitBuildNumber", eg.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Em.a());
        C4676kj c4676kj = AbstractC4652jj.a;
        synchronized (c4676kj) {
            zA = c4676kj.b.a(true);
        }
        ContentValues contentValuesFromModel = c4903u7.fromModel(new C4879t7(lValueOf, yj, string, new C4855s7(lValueOf2, lValueOf3, Boolean.valueOf(zA))));
        if (contentValuesFromModel == null) {
            return;
        }
        this.b.lock();
        try {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesFromModel);
            }
        } catch (Throwable unused2) {
        }
        this.b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.e) {
            this.f.add(contentValues);
        }
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC4857s9.i), TextUtils.join(", ", AbstractC4857s9.j), 10), 2, this.h.b.b, true).b;
        } catch (Throwable th) {
            C4557fj c4557fj = Fi.a;
            c4557fj.getClass();
            c4557fj.a(new C4533ej("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return;
        }
        this.b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), NotificationConstants.ID, "events", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                F6 f6A = this.k.a(writableDatabase, str, 1, this.h.b.b, z);
                if (f6A.a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = f6A.a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.j.iterator();
                    while (it2.hasNext()) {
                        ((O8) it2.next()).b(arrayList);
                    }
                }
                List list = f6A.a;
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        a((ContentValues) list.get(i3), "Event removed from db");
                    }
                }
                this.i.addAndGet(-f6A.b);
            }
        } catch (Throwable unused) {
        }
        this.b.unlock();
    }

    public final ContentValues a(long j, Yj yj) {
        ContentValues contentValues = new ContentValues();
        this.a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + yj.a + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        hn.a(cursorRawQuery);
        this.a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC4857s9.d.contains(Wa.a(asInteger != null ? asInteger.intValue() : -1))) {
            C4545f7 model = new C4569g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.h.n;
            Wa wa = model.d;
            C4521e7 c4521e7 = model.g;
            publicLogger.info(AbstractC4553ff.a(str, wa, c4521e7.b, c4521e7.c), new Object[0]);
        }
    }

    public static boolean a(L6 l6) {
        boolean zIsEmpty;
        synchronized (l6.e) {
            zIsEmpty = l6.f.isEmpty();
        }
        return zIsEmpty;
    }
}

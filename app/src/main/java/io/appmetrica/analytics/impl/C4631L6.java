package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreutils.internal.p027db.DBUtils;
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

/* renamed from: io.appmetrica.analytics.impl.L6 */
/* loaded from: classes2.dex */
public final class C4631L6 {

    /* renamed from: a */
    public final ReentrantReadWriteLock.ReadLock f30431a;

    /* renamed from: b */
    public final ReentrantReadWriteLock.WriteLock f30432b;

    /* renamed from: c */
    public final C4942Y6 f30433c;

    /* renamed from: d */
    public final C4607K6 f30434d;

    /* renamed from: e */
    public final Object f30435e;

    /* renamed from: f */
    public final ArrayList f30436f;

    /* renamed from: g */
    public final Context f30437g;

    /* renamed from: h */
    public final C5139g5 f30438h;

    /* renamed from: i */
    public final AtomicLong f30439i;

    /* renamed from: j */
    public final ArrayList f30440j;

    /* renamed from: k */
    public final C4535H6 f30441k;

    /* renamed from: l */
    public final C5141g7 f30442l;

    static {
        HashSet hashSet = new HashSet();
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C4631L6(C5139g5 c5139g5, C4942Y6 c4942y6, C4535H6 c4535h6, C5141g7 c5141g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f30431a = reentrantReadWriteLock.readLock();
        this.f30432b = reentrantReadWriteLock.writeLock();
        this.f30435e = new Object();
        this.f30436f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f30439i = atomicLong;
        this.f30440j = new ArrayList();
        this.f30433c = c4942y6;
        this.f30437g = c5139g5.getContext();
        this.f30438h = c5139g5;
        this.f30441k = c4535h6;
        this.f30442l = c5141g7;
        atomicLong.set(m19591b());
        C4607K6 c4607k6 = new C4607K6(this, c5139g5);
        this.f30434d = c4607k6;
        c4607k6.setName(m19578a(c5139g5));
    }

    /* renamed from: a */
    public final long m19583a() {
        this.f30431a.lock();
        try {
            return this.f30439i.get();
        } finally {
            this.f30431a.unlock();
        }
    }

    /* renamed from: b */
    public final long m19591b() {
        SQLiteDatabase readableDatabase;
        this.f30431a.lock();
        try {
            readableDatabase = this.f30433c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f30431a.unlock();
        return jQueryRowsCount;
    }

    /* renamed from: c */
    public final void m19592c() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f30431a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f30433c.getReadableDatabase();
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
                    this.f30431a.unlock();
                    AbstractC5182hn.m20509a(cursorRawQuery);
                    AbstractC5182hn.m20509a(cursorRawQuery2);
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f30431a.unlock();
        AbstractC5182hn.m20509a(cursorRawQuery);
        AbstractC5182hn.m20509a(cursorRawQuery2);
    }

    /* renamed from: d */
    public final void m19593d() {
        this.f30434d.start();
    }

    /* renamed from: a */
    public final long m19584a(Set set) {
        this.f30431a.lock();
        Cursor cursorRawQuery = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f30433c.getReadableDatabase();
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
        AbstractC5182hn.m20509a(cursorRawQuery);
        this.f30431a.unlock();
        return j;
    }

    /* renamed from: a */
    public final void m19590a(InterfaceC4705O8 interfaceC4705O8) {
        this.f30440j.add(interfaceC4705O8);
    }

    /* renamed from: a */
    public static String m19578a(InterfaceC4392Ba interfaceC4392Ba) {
        return "DatabaseWorker [" + interfaceC4392Ba.mo19229b().mo20058e() + "]";
    }

    /* renamed from: a */
    public final void m19587a(long j, EnumC4955Yj enumC4955Yj, long j2) {
        JSONObject jSONObject;
        boolean zM20962a;
        C5491u7 c5491u7 = new C5491u7(null, 1, 0 == true ? 1 : 0);
        C4473Eg c4473Eg = (C4473Eg) this.f30438h.f31733l.m21113a();
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        try {
            jSONObject = new JSONObject().put("dId", c4473Eg.getDeviceId()).put("uId", c4473Eg.getUuid()).put("appVer", c4473Eg.getAppVersion()).put("appBuild", c4473Eg.getAppBuildNumber()).put("kitBuildType", c4473Eg.getAnalyticsSdkBuildType()).put("osVer", c4473Eg.getOsVersion()).put("osApiLev", c4473Eg.getOsApiLevel()).put("lang", c4473Eg.getLocale()).put("root", c4473Eg.getDeviceRootStatus()).put("app_debuggable", ((C4773R5) c4473Eg).f30676a).put(CommonUrlParts.APP_FRAMEWORK, c4473Eg.getAppFramework()).put("attribution_id", c4473Eg.f30095s).put("analyticsSdkVersionName", c4473Eg.getAnalyticsSdkVersionName()).put("kitBuildNumber", c4473Eg.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(AbstractC4479Em.m19397a());
        C5253kj c5253kj = AbstractC5228jj.f31988a;
        synchronized (c5253kj) {
            zM20962a = c5253kj.f32081b.m20962a(true);
        }
        ContentValues contentValuesFromModel = c5491u7.fromModel(new C5466t7(lValueOf, enumC4955Yj, string, new C5441s7(lValueOf2, lValueOf3, Boolean.valueOf(zM20962a))));
        if (contentValuesFromModel == null) {
            return;
        }
        this.f30432b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f30433c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesFromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f30432b.unlock();
    }

    /* renamed from: a */
    public final void m19588a(ContentValues contentValues) {
        synchronized (this.f30435e) {
            this.f30436f.add(contentValues);
        }
        synchronized (this.f30434d) {
            this.f30434d.notifyAll();
        }
    }

    /* renamed from: a */
    public final int m19582a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f30441k.m19459a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC5443s9.f32561i), TextUtils.join(", ", AbstractC5443s9.f32562j), 10), 2, this.f30438h.f31723b.f31145b, true).f30124b;
        } catch (Throwable th) {
            C5128fj c5128fj = AbstractC4499Fi.f30148a;
            c5128fj.getClass();
            c5128fj.m20394a(new C5103ej("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    /* renamed from: a */
    public final void m19586a(long j, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return;
        }
        this.f30432b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), NotificationConstants.f19487ID, "events", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.f30433c.getWritableDatabase();
            if (writableDatabase != null) {
                C4487F6 c4487f6M19459a = this.f30441k.m19459a(writableDatabase, str, 1, this.f30438h.f31723b.f31145b, z);
                if (c4487f6M19459a.f30123a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c4487f6M19459a.f30123a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f30440j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC4705O8) it2.next()).mo19309b(arrayList);
                    }
                }
                List list = c4487f6M19459a.f30123a;
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        m19589a((ContentValues) list.get(i3), "Event removed from db");
                    }
                }
                this.f30439i.addAndGet(-c4487f6M19459a.f30124b);
            }
        } catch (Throwable unused) {
        }
        this.f30432b.unlock();
    }

    /* renamed from: a */
    public final ContentValues m19585a(long j, EnumC4955Yj enumC4955Yj) {
        ContentValues contentValues = new ContentValues();
        this.f30431a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f30433c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + enumC4955Yj.f31130a + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC5182hn.m20509a(cursorRawQuery);
        this.f30431a.unlock();
        return contentValues;
    }

    /* renamed from: a */
    public static String m19579a(LinkedHashMap linkedHashMap) {
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

    /* renamed from: a */
    public static String[] m19581a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public final void m19589a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC5443s9.f32556d.contains(EnumC4898Wa.m19946a(asInteger != null ? asInteger.intValue() : -1))) {
            C5116f7 model = new C5141g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f30438h.f31735n;
            EnumC4898Wa enumC4898Wa = model.f31662d;
            C5091e7 c5091e7 = model.f31665g;
            publicLogger.info(AbstractC5124ff.m20389a(str, enumC4898Wa, c5091e7.f31538b, c5091e7.f31539c), new Object[0]);
        }
    }

    /* renamed from: a */
    public static boolean m19580a(C4631L6 c4631l6) {
        boolean zIsEmpty;
        synchronized (c4631l6.f30435e) {
            zIsEmpty = c4631l6.f30436f.isEmpty();
        }
        return zIsEmpty;
    }
}

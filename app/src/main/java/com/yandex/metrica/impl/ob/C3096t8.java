package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.ob.A;
import com.yandex.metrica.impl.ob.C3071s8;
import com.yandex.metrica.impl.ob.O8;
import com.yandex.metrica.impl.ob.Vi;
import com.yandex.metrica.impl.ob.Yn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.yandex.metrica.impl.ob.t8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3096t8 {
    private static final HashSet<Integer> o;
    private final ReentrantReadWriteLock a;
    private final Lock b;
    private final Lock c;
    private final C3176w8 d;
    private final a e;
    private final Object f;
    private final List<ContentValues> g;
    private final Context h;
    private final C2744f4 i;
    private final AtomicLong j;
    private final List<Ub> k;
    private final C3071s8 l;
    private volatile ao<Vi.b, Object> m;
    private final bo<Vi.b, Object> n;

    /* renamed from: com.yandex.metrica.impl.ob.t8$a */
    public class a extends C3166vn {
        private final C2744f4 b;

        public a(C2744f4 c2744f4) {
            this.b = c2744f4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            while (c()) {
                try {
                } catch (Throwable unused) {
                    d();
                }
                synchronized (this) {
                    try {
                        if (C3096t8.a(C3096t8.this)) {
                            wait();
                        }
                        synchronized (C3096t8.this.f) {
                            arrayList = new ArrayList(C3096t8.this.g);
                            C3096t8.this.g.clear();
                        }
                        C3096t8.this.a(arrayList);
                        synchronized (this) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(C3096t8.this.a((ContentValues) it.next())));
                                }
                                Iterator it2 = C3096t8.this.k.iterator();
                                while (it2.hasNext()) {
                                    ((Ub) it2.next()).a(arrayList2);
                                }
                                this.b.l().c();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        o = hashSet;
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC2865k1.EVENT_TYPE_START.b()));
    }

    public C3096t8(C2744f4 c2744f4, C3176w8 c3176w8, C3071s8 c3071s8) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
        this.f = new Object();
        this.g = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.j = atomicLong;
        this.k = new ArrayList();
        this.n = new bo<>();
        this.d = c3176w8;
        this.h = c2744f4.g();
        this.i = c2744f4;
        this.l = c3071s8;
        atomicLong.set(d());
        a aVar = new a(c2744f4);
        this.e = aVar;
        aVar.setName(a(c2744f4));
        a(c2744f4.v());
    }

    public void e() {
        this.e.start();
    }

    private void a(Qi qi) {
        Vi.a aVar = null;
        Vi.a aVar2 = (!qi.f().p || qi.Q() == null) ? null : qi.Q().b;
        if (qi.f().p && qi.Q() != null) {
            aVar = qi.Q().a;
        }
        EnumMap enumMap = new EnumMap(Vi.b.class);
        enumMap.put((EnumMap) Vi.b.WIFI, (Vi.b) (aVar2 == null ? new co() : new io(new ho(new lo(), new mo()), new Nm(), aVar2.a, aVar2.b)));
        enumMap.put((EnumMap) Vi.b.CELL, (Vi.b) (aVar == null ? new co() : new io(new ho(new Yn.a(), new Zn()), new Nm(), aVar.a, aVar.b)));
        this.m = new ao<>(enumMap);
    }

    private long d() {
        SQLiteDatabase readableDatabase;
        this.b.lock();
        try {
            readableDatabase = this.d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jA = readableDatabase != null ? C2814i.a(readableDatabase, "reports") : 0L;
        this.b.unlock();
        return jA;
    }

    public Cursor b(long j, EnumC3249z6 enumC3249z6) throws SQLiteException {
        SQLiteDatabase readableDatabase;
        this.b.lock();
        try {
            readableDatabase = this.d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("reports", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(enumC3249z6.a())}, null, null, "number ASC", null) : null;
        this.b.unlock();
        return cursorQuery;
    }

    public long c() {
        this.b.lock();
        try {
            return this.j.get();
        } finally {
            this.b.unlock();
        }
    }

    public List<ContentValues> b() {
        ArrayList arrayList = new ArrayList();
        this.b.lock();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.d.getReadableDatabase();
                if (readableDatabase != null) {
                    cursorRawQuery = readableDatabase.rawQuery(O8.e.c, null);
                    while (cursorRawQuery.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    }
                }
            } catch (Throwable unused) {
                arrayList = new ArrayList();
            }
            return arrayList;
        } finally {
            U2.a(cursorRawQuery);
            this.b.unlock();
        }
    }

    public long a(Set<Integer> set) {
        this.b.lock();
        Cursor cursorRawQuery = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i = 0;
                for (Integer num : set) {
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
        U2.a(cursorRawQuery);
        this.b.unlock();
        return j;
    }

    public void b(Qi qi) {
        a(qi);
    }

    public void a(Ub ub) {
        this.k.add(ub);
    }

    private static String a(InterfaceC2843j4 interfaceC2843j4) {
        return "DatabaseWorker [" + ((C2744f4) interfaceC2843j4).e().c() + "]";
    }

    public void a(long j, EnumC3249z6 enumC3249z6, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.ID, Long.valueOf(j));
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("server_time_offset", Long.valueOf(Lm.c().a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(Lm.c().e()));
        contentValues.put("type", Integer.valueOf(enumC3249z6.a()));
        new C3014q0(this.h).a(this.i.m()).a(contentValues).a();
        this.c.lock();
        try {
            SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.c.unlock();
    }

    public void a(C2862jn c2862jn, int i, C3174w6 c3174w6, A.a aVar, C2819i4 c2819i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.NUMBER, Long.valueOf(c3174w6.a()));
        contentValues.put("global_number", Integer.valueOf(J0.d(i) ? c2819i4.a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(c2819i4.a(i)));
        contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(c3174w6.b()));
        contentValues.put("session_id", Long.valueOf(c3174w6.c()));
        contentValues.put("session_type", Integer.valueOf(c3174w6.d().a()));
        new C3014q0(this.h).a(this.i.m()).a(contentValues).a(c2862jn, aVar, o.contains(Integer.valueOf(i)) ? this.n : this.m);
        synchronized (this.f) {
            this.g.add(contentValues);
        }
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    public int a(long j) {
        SQLiteDatabase writableDatabase;
        this.c.lock();
        try {
            int i = O8.a;
            writableDatabase = this.d.getWritableDatabase();
        } catch (Throwable unused) {
        }
        int iDelete = writableDatabase != null ? writableDatabase.delete("sessions", O8.e.d, new String[]{String.valueOf(j)}) : 0;
        this.c.unlock();
        return iDelete;
    }

    public void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.c.lock();
            if (this.j.get() > this.i.m().K() && (writableDatabase = this.d.getWritableDatabase()) != null) {
                this.j.addAndGet(-a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        this.c.unlock();
    }

    private int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.l.a(sQLiteDatabase, "reports", String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", NotificationConstants.ID, "reports", "type", TextUtils.join(", ", J0.i), TextUtils.join(", ", J0.j), NotificationConstants.ID, 10), C3071s8.b.DB_OVERFLOW, this.i.e().a(), true).b;
        } catch (Throwable th) {
            ((Nh) Oh.a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    public void a(long j, int i, int i2, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i2 <= 0) {
            return;
        }
        this.c.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), NotificationConstants.ID, "reports", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
            if (writableDatabase != null) {
                C3071s8.a aVarA = this.l.a(writableDatabase, "reports", str, C3071s8.b.BAD_REQUEST, this.i.e().a(), z);
                if (aVarA.a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ContentValues> it = aVarA.a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(a(it.next())));
                    }
                    Iterator<Ub> it2 = this.k.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(arrayList);
                    }
                }
                if (this.i.q().c() && (list = aVarA.a) != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        a(list.get(i3), "Event removed from db");
                    }
                }
                this.j.addAndGet(-aVarA.b);
            }
        } catch (Throwable unused) {
        }
        this.c.unlock();
    }

    public Cursor a(Map<String, String> map) {
        SQLiteDatabase readableDatabase;
        this.b.lock();
        try {
            readableDatabase = this.d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, a("id >= ?", map), a(new String[]{Long.toString(0L)}, map), null, null, "id ASC", null) : null;
        this.b.unlock();
        return cursorQuery;
    }

    public void a(List<ContentValues> list) {
        SQLiteDatabase writableDatabase;
        if (list.isEmpty()) {
            return;
        }
        this.c.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.d.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    writableDatabase.beginTransaction();
                    for (ContentValues contentValues : list) {
                        writableDatabase.insertOrThrow("reports", null, contentValues);
                        this.j.incrementAndGet();
                        a(contentValues, "Event saved to db");
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.j.get();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    writableDatabase = sQLiteDatabase;
                    U2.a(writableDatabase);
                    this.c.unlock();
                }
            }
        } catch (Throwable unused2) {
        }
        U2.a(writableDatabase);
        this.c.unlock();
    }

    public ContentValues a(long j, EnumC3249z6 enumC3249z6) {
        ContentValues contentValues = new ContentValues();
        this.b.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + enumC3249z6.a() + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
            U2.a(cursorRawQuery);
            this.b.unlock();
        } catch (Throwable unused) {
            U2.a(cursorRawQuery);
            this.b.unlock();
        }
        return contentValues;
    }

    private static String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str2 + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    private static String[] a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (J0.c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString("name");
            int i = O2.a;
            if (asString == null) {
                asString = "";
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString("value");
            String str2 = asString2 != null ? asString2 : "";
            if (J0.e(a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.i.q().b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    public static boolean a(C3096t8 c3096t8) {
        boolean zIsEmpty;
        synchronized (c3096t8.f) {
            zIsEmpty = c3096t8.g.isEmpty();
        }
        return zIsEmpty;
    }
}

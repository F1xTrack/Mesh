package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.metrica.impl.p022ob.C2466A;
import com.yandex.metrica.impl.p022ob.C2825O8;
import com.yandex.metrica.impl.p022ob.C3009Vi;
import com.yandex.metrica.impl.p022ob.C3089Yn;
import com.yandex.metrica.impl.p022ob.C3592s8;
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

/* renamed from: com.yandex.metrica.impl.ob.t8 */
/* loaded from: classes2.dex */
public class C3618t8 {

    /* renamed from: o */
    private static final HashSet<Integer> f24799o;

    /* renamed from: a */
    private final ReentrantReadWriteLock f24800a;

    /* renamed from: b */
    private final Lock f24801b;

    /* renamed from: c */
    private final Lock f24802c;

    /* renamed from: d */
    private final C3696w8 f24803d;

    /* renamed from: e */
    private final a f24804e;

    /* renamed from: f */
    private final Object f24805f;

    /* renamed from: g */
    private final List<ContentValues> f24806g;

    /* renamed from: h */
    private final Context f24807h;

    /* renamed from: i */
    private final C3250f4 f24808i;

    /* renamed from: j */
    private final AtomicLong f24809j;

    /* renamed from: k */
    private final List<InterfaceC2977Ub> f24810k;

    /* renamed from: l */
    private final C3592s8 f24811l;

    /* renamed from: m */
    private volatile C3140ao<C3009Vi.b, Object> f24812m;

    /* renamed from: n */
    private final C3166bo<C3009Vi.b, Object> f24813n;

    /* renamed from: com.yandex.metrica.impl.ob.t8$a */
    public class a extends C3685vn {

        /* renamed from: b */
        private final C3250f4 f24814b;

        public a(C3250f4 c3250f4) {
            this.f24814b = c3250f4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            while (mo16707c()) {
                try {
                } catch (Throwable unused) {
                    m17100d();
                }
                synchronized (this) {
                    try {
                        if (C3618t8.m16822a(C3618t8.this)) {
                            wait();
                        }
                        synchronized (C3618t8.this.f24805f) {
                            arrayList = new ArrayList(C3618t8.this.f24806g);
                            C3618t8.this.f24806g.clear();
                        }
                        C3618t8.this.m16837a(arrayList);
                        synchronized (this) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(C3618t8.this.m16815a((ContentValues) it.next())));
                                }
                                Iterator it2 = C3618t8.this.f24810k.iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC2977Ub) it2.next()).mo15113a(arrayList2);
                                }
                                this.f24814b.m15913l().m15305c();
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
        f24799o = hashSet;
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_INIT.m16250b()));
        hashSet.add(Integer.valueOf(EnumC3377k1.EVENT_TYPE_START.m16250b()));
    }

    public C3618t8(C3250f4 c3250f4, C3696w8 c3696w8, C3592s8 c3592s8) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24800a = reentrantReadWriteLock;
        this.f24801b = reentrantReadWriteLock.readLock();
        this.f24802c = reentrantReadWriteLock.writeLock();
        this.f24805f = new Object();
        this.f24806g = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f24809j = atomicLong;
        this.f24810k = new ArrayList();
        this.f24813n = new C3166bo<>();
        this.f24803d = c3696w8;
        this.f24807h = c3250f4.m15908g();
        this.f24808i = c3250f4;
        this.f24811l = c3592s8;
        atomicLong.set(m16826d());
        a aVar = new a(c3250f4);
        this.f24804e = aVar;
        aVar.setName(m16818a(c3250f4));
        m16821a(c3250f4.m15922v());
    }

    /* renamed from: e */
    public void m16842e() {
        this.f24804e.start();
    }

    /* renamed from: a */
    private void m16821a(C2885Qi c2885Qi) {
        C3009Vi.a aVar = null;
        C3009Vi.a aVar2 = (!c2885Qi.m14880f().f24723p || c2885Qi.m14868Q() == null) ? null : c2885Qi.m14868Q().f22622b;
        if (c2885Qi.m14880f().f24723p && c2885Qi.m14868Q() != null) {
            aVar = c2885Qi.m14868Q().f22621a;
        }
        EnumMap enumMap = new EnumMap(C3009Vi.b.class);
        enumMap.put((EnumMap) C3009Vi.b.WIFI, (C3009Vi.b) (aVar2 == null ? new C3192co() : new C3348io(new C3322ho(new C3426lo(), new C3452mo()), new C2814Nm(), aVar2.f22623a, aVar2.f22624b)));
        enumMap.put((EnumMap) C3009Vi.b.CELL, (C3009Vi.b) (aVar == null ? new C3192co() : new C3348io(new C3322ho(new C3089Yn.a(), new C3114Zn()), new C2814Nm(), aVar.f22623a, aVar.f22624b)));
        this.f24812m = new C3140ao<>(enumMap);
    }

    /* renamed from: d */
    private long m16826d() {
        SQLiteDatabase readableDatabase;
        this.f24801b.lock();
        try {
            readableDatabase = this.f24803d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jM16060a = readableDatabase != null ? C3323i.m16060a(readableDatabase, "reports") : 0L;
        this.f24801b.unlock();
        return jM16060a;
    }

    /* renamed from: b */
    public Cursor m16838b(long j, EnumC3772z6 enumC3772z6) throws SQLiteException {
        SQLiteDatabase readableDatabase;
        this.f24801b.lock();
        try {
            readableDatabase = this.f24803d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("reports", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(enumC3772z6.m17324a())}, null, null, "number ASC", null) : null;
        this.f24801b.unlock();
        return cursorQuery;
    }

    /* renamed from: c */
    public long m16841c() {
        this.f24801b.lock();
        try {
            return this.f24809j.get();
        } finally {
            this.f24801b.unlock();
        }
    }

    /* renamed from: b */
    public List<ContentValues> m16839b() {
        ArrayList arrayList = new ArrayList();
        this.f24801b.lock();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.f24803d.getReadableDatabase();
                if (readableDatabase != null) {
                    cursorRawQuery = readableDatabase.rawQuery(C2825O8.e.f21860c, null);
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
            C2968U2.m15239a(cursorRawQuery);
            this.f24801b.unlock();
        }
    }

    /* renamed from: a */
    public long m16829a(Set<Integer> set) {
        this.f24801b.lock();
        Cursor cursorRawQuery = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f24803d.getReadableDatabase();
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
        C2968U2.m15239a(cursorRawQuery);
        this.f24801b.unlock();
        return j;
    }

    /* renamed from: b */
    public void m16840b(C2885Qi c2885Qi) {
        m16821a(c2885Qi);
    }

    /* renamed from: a */
    public void m16835a(InterfaceC2977Ub interfaceC2977Ub) {
        this.f24810k.add(interfaceC2977Ub);
    }

    /* renamed from: a */
    private static String m16818a(InterfaceC3354j4 interfaceC3354j4) {
        return "DatabaseWorker [" + ((C3250f4) interfaceC3354j4).m15906e().mo15702c() + "]";
    }

    /* renamed from: a */
    public void m16834a(long j, EnumC3772z6 enumC3772z6, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.f19487ID, Long.valueOf(j));
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("server_time_offset", Long.valueOf(C2764Lm.m14551c().mo14352a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C2764Lm.m14551c().m14555e()));
        contentValues.put("type", Integer.valueOf(enumC3772z6.m17324a()));
        new C3532q0(this.f24807h).m16595a(this.f24808i.m15914m()).m16594a(contentValues).m16596a();
        this.f24802c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f24803d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f24802c.unlock();
    }

    /* renamed from: a */
    public void m16836a(C3373jn c3373jn, int i, C3694w6 c3694w6, C2466A.a aVar, C3328i4 c3328i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationConstants.NUMBER, Long.valueOf(c3694w6.m17118a()));
        contentValues.put("global_number", Integer.valueOf(C2692J0.m14405d(i) ? c3328i4.m16080a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(c3328i4.m16081a(i)));
        contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(c3694w6.m17121b()));
        contentValues.put("session_id", Long.valueOf(c3694w6.m17123c()));
        contentValues.put("session_type", Integer.valueOf(c3694w6.m17125d().m17324a()));
        new C3532q0(this.f24807h).m16595a(this.f24808i.m15914m()).m16594a(contentValues).m16597a(c3373jn, aVar, f24799o.contains(Integer.valueOf(i)) ? this.f24813n : this.f24812m);
        synchronized (this.f24805f) {
            this.f24806g.add(contentValues);
        }
        synchronized (this.f24804e) {
            this.f24804e.notifyAll();
        }
    }

    /* renamed from: a */
    public int m16828a(long j) {
        SQLiteDatabase writableDatabase;
        this.f24802c.lock();
        try {
            int i = C2825O8.f21845a;
            writableDatabase = this.f24803d.getWritableDatabase();
        } catch (Throwable unused) {
        }
        int iDelete = writableDatabase != null ? writableDatabase.delete("sessions", C2825O8.e.f21861d, new String[]{String.valueOf(j)}) : 0;
        this.f24802c.unlock();
        return iDelete;
    }

    /* renamed from: a */
    public void m16832a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f24802c.lock();
            if (this.f24809j.get() > this.f24808i.m15914m().m16137K() && (writableDatabase = this.f24803d.getWritableDatabase()) != null) {
                this.f24809j.addAndGet(-m16816a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        this.f24802c.unlock();
    }

    /* renamed from: a */
    private int m16816a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f24811l.m16720a(sQLiteDatabase, "reports", String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", NotificationConstants.f19487ID, "reports", "type", TextUtils.join(", ", C2692J0.f21482i), TextUtils.join(", ", C2692J0.f21483j), NotificationConstants.f19487ID, 10), C3592s8.b.DB_OVERFLOW, this.f24808i.m15906e().m15700a(), true).f24658b;
        } catch (Throwable th) {
            ((C2809Nh) C2834Oh.m14711a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    /* renamed from: a */
    public void m16833a(long j, int i, int i2, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i2 <= 0) {
            return;
        }
        this.f24802c.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), NotificationConstants.f19487ID, "reports", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.f24803d.getWritableDatabase();
            if (writableDatabase != null) {
                C3592s8.a aVarM16720a = this.f24811l.m16720a(writableDatabase, "reports", str, C3592s8.b.BAD_REQUEST, this.f24808i.m15906e().m15700a(), z);
                if (aVarM16720a.f24657a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ContentValues> it = aVarM16720a.f24657a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(m16815a(it.next())));
                    }
                    Iterator<InterfaceC2977Ub> it2 = this.f24810k.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo15115b(arrayList);
                    }
                }
                if (this.f24808i.m15918q().m17370c() && (list = aVarM16720a.f24657a) != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        m16820a(list.get(i3), "Event removed from db");
                    }
                }
                this.f24809j.addAndGet(-aVarM16720a.f24658b);
            }
        } catch (Throwable unused) {
        }
        this.f24802c.unlock();
    }

    /* renamed from: a */
    public Cursor m16831a(Map<String, String> map) {
        SQLiteDatabase readableDatabase;
        this.f24801b.lock();
        try {
            readableDatabase = this.f24803d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, m16819a("id >= ?", map), m16823a(new String[]{Long.toString(0L)}, map), null, null, "id ASC", null) : null;
        this.f24801b.unlock();
        return cursorQuery;
    }

    /* renamed from: a */
    public void m16837a(List<ContentValues> list) {
        SQLiteDatabase writableDatabase;
        if (list.isEmpty()) {
            return;
        }
        this.f24802c.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.f24803d.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    writableDatabase.beginTransaction();
                    for (ContentValues contentValues : list) {
                        writableDatabase.insertOrThrow("reports", null, contentValues);
                        this.f24809j.incrementAndGet();
                        m16820a(contentValues, "Event saved to db");
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f24809j.get();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    writableDatabase = sQLiteDatabase;
                    C2968U2.m15240a(writableDatabase);
                    this.f24802c.unlock();
                }
            }
        } catch (Throwable unused2) {
        }
        C2968U2.m15240a(writableDatabase);
        this.f24802c.unlock();
    }

    /* renamed from: a */
    public ContentValues m16830a(long j, EnumC3772z6 enumC3772z6) {
        ContentValues contentValues = new ContentValues();
        this.f24801b.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f24803d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + enumC3772z6.m17324a() + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
            C2968U2.m15239a(cursorRawQuery);
            this.f24801b.unlock();
        } catch (Throwable unused) {
            C2968U2.m15239a(cursorRawQuery);
            this.f24801b.unlock();
        }
        return contentValues;
    }

    /* renamed from: a */
    private static String m16819a(String str, Map<String, String> map) {
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

    /* renamed from: a */
    private static String[] m16823a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    private void m16820a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C2692J0.m14404c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString("name");
            int i = C2819O2.f21836a;
            if (asString == null) {
                asString = "";
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString("value");
            String str2 = asString2 != null ? asString2 : "";
            if (C2692J0.m14406e(m16815a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.f24808i.m15918q().m17366b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m16815a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    /* renamed from: a */
    public static boolean m16822a(C3618t8 c3618t8) {
        boolean zIsEmpty;
        synchronized (c3618t8.f24805f) {
            zIsEmpty = c3618t8.f24806g.isEmpty();
        }
        return zIsEmpty;
    }
}

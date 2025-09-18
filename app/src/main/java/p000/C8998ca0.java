package p000;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ca0 */
/* loaded from: classes.dex */
public final class C8998ca0 {

    /* renamed from: m */
    public static final String[] f17614m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final AbstractC10653pT0 f17615a;

    /* renamed from: b */
    public final HashMap f17616b;

    /* renamed from: c */
    public final LinkedHashMap f17617c;

    /* renamed from: d */
    public final String[] f17618d;

    /* renamed from: e */
    public final AtomicBoolean f17619e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f17620f;

    /* renamed from: g */
    public volatile C3936dZ f17621g;

    /* renamed from: h */
    public final C1338VG f17622h;

    /* renamed from: i */
    public final WU0 f17623i;

    /* renamed from: j */
    public final Object f17624j;

    /* renamed from: k */
    public final Object f17625k;

    /* renamed from: l */
    public final GR0 f17626l;

    public C8998ca0(AbstractC10653pT0 abstractC10653pT0, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f17615a = abstractC10653pT0;
        this.f17616b = map;
        this.f17622h = new C1338VG(strArr.length);
        O90.m5967e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f17623i = new WU0();
        this.f17624j = new Object();
        this.f17625k = new Object();
        this.f17617c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            O90.m5967e(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            O90.m5967e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f17617c.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f17616b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f17618d = strArr2;
        for (Map.Entry entry : this.f17616b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            O90.m5967e(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            O90.m5967e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f17617c.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                O90.m5967e(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f17617c;
                linkedHashMap.put(lowerCase4, AbstractC11077sn0.m24778f(linkedHashMap, lowerCase3));
            }
        }
        this.f17626l = new GR0(27, this);
    }

    /* renamed from: a */
    public final boolean m10791a() {
        C1482XY c1482xy = this.f17615a.f40093a;
        if (!O90.m5963a(c1482xy != null ? Boolean.valueOf(((SQLiteDatabase) c1482xy.f13844b).isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f17620f) {
            this.f17615a.m23794g().mo1557M();
        }
        return this.f17620f;
    }

    /* renamed from: b */
    public final void m10792b(C1482XY c1482xy, int i) throws SQLException {
        c1482xy.m9081w("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f17618d[i];
        String[] strArr = f17614m;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC11111t22.m24834a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            O90.m5967e(str3, "StringBuilder().apply(builderAction).toString()");
            c1482xy.m9081w(str3);
        }
    }

    /* renamed from: c */
    public final void m10793c(C1482XY c1482xy) {
        O90.m5968f(c1482xy, "database");
        if (c1482xy.m9072A()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f17615a.f40100h.readLock();
            O90.m5967e(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f17624j) {
                    int[] iArrM8346j = this.f17622h.m8346j();
                    if (iArrM8346j == null) {
                        return;
                    }
                    if (c1482xy.m9073D()) {
                        c1482xy.m9078n();
                    } else {
                        c1482xy.m9077m();
                    }
                    try {
                        int length = iArrM8346j.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrM8346j[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                m10792b(c1482xy, i2);
                            } else if (i3 == 2) {
                                String str = this.f17618d[i2];
                                String[] strArr = f17614m;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + AbstractC11111t22.m24834a(str, strArr[i5]);
                                    O90.m5967e(str2, "StringBuilder().apply(builderAction).toString()");
                                    c1482xy.m9081w(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        c1482xy.m9076U();
                        c1482xy.m9080p();
                    } catch (Throwable th) {
                        c1482xy.m9080p();
                        throw th;
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}

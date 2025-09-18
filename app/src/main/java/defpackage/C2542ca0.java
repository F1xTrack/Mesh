package defpackage;

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
public final class C2542ca0 {
    public static final String[] m = {"UPDATE", "DELETE", "INSERT"};
    public final AbstractC6464pT0 a;
    public final HashMap b;
    public final LinkedHashMap c;
    public final String[] d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile boolean f;
    public volatile C3414dZ g;
    public final VG h;
    public final WU0 i;
    public final Object j;
    public final Object k;
    public final GR0 l;

    public C2542ca0(AbstractC6464pT0 abstractC6464pT0, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.a = abstractC6464pT0;
        this.b = map;
        this.h = new VG(strArr.length);
        O90.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new WU0();
        this.j = new Object();
        this.k = new Object();
        this.c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            O90.e(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            O90.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.c.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.d = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            O90.e(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            O90.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.c.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                O90.e(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.c;
                linkedHashMap.put(lowerCase4, AbstractC7096sn0.f(linkedHashMap, lowerCase3));
            }
        }
        this.l = new GR0(27, this);
    }

    public final boolean a() {
        XY xy = this.a.a;
        if (!O90.a(xy != null ? Boolean.valueOf(((SQLiteDatabase) xy.b).isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.f) {
            this.a.g().M();
        }
        return this.f;
    }

    public final void b(XY xy, int i) throws SQLException {
        xy.w("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.d[i];
        String[] strArr = m;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC7146t22.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            O90.e(str3, "StringBuilder().apply(builderAction).toString()");
            xy.w(str3);
        }
    }

    public final void c(XY xy) {
        O90.f(xy, "database");
        if (xy.A()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.a.h.readLock();
            O90.e(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    int[] iArrJ = this.h.j();
                    if (iArrJ == null) {
                        return;
                    }
                    if (xy.D()) {
                        xy.n();
                    } else {
                        xy.m();
                    }
                    try {
                        int length = iArrJ.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrJ[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                b(xy, i2);
                            } else if (i3 == 2) {
                                String str = this.d[i2];
                                String[] strArr = m;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + AbstractC7146t22.a(str, strArr[i5]);
                                    O90.e(str2, "StringBuilder().apply(builderAction).toString()");
                                    xy.w(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        xy.U();
                        xy.p();
                    } catch (Throwable th) {
                        xy.p();
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

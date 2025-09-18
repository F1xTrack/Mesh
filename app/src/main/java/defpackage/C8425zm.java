package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8425zm {
    public final long a;
    public long b;
    public final Object c;

    public /* synthetic */ C8425zm(long j, long j2, Object obj) {
        this.a = j;
        this.b = j2;
        this.c = obj;
    }

    public synchronized Object a(Object obj) {
        C0135Bm0 c0135Bm0;
        c0135Bm0 = (C0135Bm0) ((LinkedHashMap) this.c).get(obj);
        return c0135Bm0 != null ? c0135Bm0.a : null;
    }

    public int b() {
        if (!((C0134Bm) this.c).c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = jUptimeMillis;
        }
        long j = jUptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    public int c() {
        boolean zC = ((C0134Bm) this.c).c();
        long j = this.a;
        if (zC) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }

    public int d(Object obj) {
        return 1;
    }

    public synchronized Object f(Object obj, Object obj2) {
        int iD = d(obj2);
        long j = iD;
        if (j >= this.a) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        C0135Bm0 c0135Bm0 = (C0135Bm0) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new C0135Bm0(iD, obj2));
        if (c0135Bm0 != null) {
            this.b -= c0135Bm0.b;
            if (!c0135Bm0.a.equals(obj2)) {
                e(obj, c0135Bm0.a);
            }
        }
        g(this.a);
        return c0135Bm0 != null ? c0135Bm0.a : null;
    }

    public synchronized void g(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C0135Bm0 c0135Bm0 = (C0135Bm0) entry.getValue();
            this.b -= c0135Bm0.b;
            Object key = entry.getKey();
            it.remove();
            e(key, c0135Bm0.a);
        }
    }

    public C8425zm(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public C8425zm(C0134Bm c0134Bm, long j) {
        this.c = c0134Bm;
        this.b = -1L;
        this.a = j;
    }

    public void e(Object obj, Object obj2) {
    }
}

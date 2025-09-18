package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: zm */
/* loaded from: classes.dex */
public class C7285zm {

    /* renamed from: a */
    public final long f46985a;

    /* renamed from: b */
    public long f46986b;

    /* renamed from: c */
    public final Object f46987c;

    public /* synthetic */ C7285zm(long j, long j2, Object obj) {
        this.f46985a = j;
        this.f46986b = j2;
        this.f46987c = obj;
    }

    /* renamed from: a */
    public synchronized Object m26534a(Object obj) {
        C7390Bm0 c7390Bm0;
        c7390Bm0 = (C7390Bm0) ((LinkedHashMap) this.f46987c).get(obj);
        return c7390Bm0 != null ? c7390Bm0.f1018a : null;
    }

    /* renamed from: b */
    public int m26535b() {
        if (!((C0112Bm) this.f46987c).m857c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f46986b == -1) {
            this.f46986b = jUptimeMillis;
        }
        long j = jUptimeMillis - this.f46986b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    /* renamed from: c */
    public int m26536c() {
        boolean zM857c = ((C0112Bm) this.f46987c).m857c();
        long j = this.f46985a;
        if (zM857c) {
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

    /* renamed from: d */
    public int mo1872d(Object obj) {
        return 1;
    }

    /* renamed from: f */
    public synchronized Object m26537f(Object obj, Object obj2) {
        int iMo1872d = mo1872d(obj2);
        long j = iMo1872d;
        if (j >= this.f46985a) {
            mo1873e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f46986b += j;
        }
        C7390Bm0 c7390Bm0 = (C7390Bm0) ((LinkedHashMap) this.f46987c).put(obj, obj2 == null ? null : new C7390Bm0(iMo1872d, obj2));
        if (c7390Bm0 != null) {
            this.f46986b -= c7390Bm0.f1019b;
            if (!c7390Bm0.f1018a.equals(obj2)) {
                mo1873e(obj, c7390Bm0.f1018a);
            }
        }
        m26538g(this.f46985a);
        return c7390Bm0 != null ? c7390Bm0.f1018a : null;
    }

    /* renamed from: g */
    public synchronized void m26538g(long j) {
        while (this.f46986b > j) {
            Iterator it = ((LinkedHashMap) this.f46987c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C7390Bm0 c7390Bm0 = (C7390Bm0) entry.getValue();
            this.f46986b -= c7390Bm0.f1019b;
            Object key = entry.getKey();
            it.remove();
            mo1873e(key, c7390Bm0.f1018a);
        }
    }

    public C7285zm(long j) {
        this.f46987c = new LinkedHashMap(100, 0.75f, true);
        this.f46985a = j;
    }

    public C7285zm(C0112Bm c0112Bm, long j) {
        this.f46987c = c0112Bm;
        this.f46986b = -1L;
        this.f46985a = j;
    }

    /* renamed from: e */
    public void mo1873e(Object obj, Object obj2) {
    }
}

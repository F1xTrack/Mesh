package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11447vg0 {

    /* renamed from: a */
    public final HashMap f44485a = new HashMap();

    /* renamed from: b */
    public final int f44486b = 64;

    /* renamed from: c */
    public final int f44487c;

    public C11447vg0(int i) {
        this.f44487c = i;
    }

    /* renamed from: b */
    public static String m25473b(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    /* renamed from: a */
    public final synchronized Map m25474a() {
        return Collections.unmodifiableMap(new HashMap(this.f44485a));
    }

    /* renamed from: c */
    public final synchronized boolean m25475c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strM25473b = m25473b(this.f44487c, str);
        if (this.f44485a.size() >= this.f44486b && !this.f44485a.containsKey(strM25473b)) {
            return false;
        }
        String strM25473b2 = m25473b(this.f44487c, str2);
        String str3 = (String) this.f44485a.get(strM25473b);
        if (str3 == null ? strM25473b2 == null : str3.equals(strM25473b2)) {
            return false;
        }
        HashMap map = this.f44485a;
        if (str2 == null) {
            strM25473b2 = "";
        }
        map.put(strM25473b, strM25473b2);
        return true;
    }

    /* renamed from: d */
    public final synchronized void m25476d(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM25473b = m25473b(this.f44487c, str);
                if (this.f44485a.size() < this.f44486b || this.f44485a.containsKey(strM25473b)) {
                    String str2 = (String) entry.getValue();
                    this.f44485a.put(strM25473b, str2 == null ? "" : m25473b(this.f44487c, str2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

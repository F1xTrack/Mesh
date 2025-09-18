package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7648vg0 {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public C7648vg0(int i) {
        this.c = i;
    }

    public static String b(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    public final synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strB = b(this.c, str);
        if (this.a.size() >= this.b && !this.a.containsKey(strB)) {
            return false;
        }
        String strB2 = b(this.c, str2);
        String str3 = (String) this.a.get(strB);
        if (str3 == null ? strB2 == null : str3.equals(strB2)) {
            return false;
        }
        HashMap map = this.a;
        if (str2 == null) {
            strB2 = "";
        }
        map.put(strB, strB2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strB = b(this.c, str);
                if (this.a.size() < this.b || this.a.containsKey(strB)) {
                    String str2 = (String) entry.getValue();
                    this.a.put(strB, str2 == null ? "" : b(this.c, str2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

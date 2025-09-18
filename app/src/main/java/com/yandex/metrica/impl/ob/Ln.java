package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Ln {
    private final Kn a;
    private final Jn b;

    public Ln(Im im, String str) {
        this(new Kn(30, 50, 4000, str, im), new Jn(4500, str, im));
    }

    public synchronized boolean a(Gm gm, String str, String str2) {
        try {
            if (gm.size() >= this.a.a().a() && (this.a.a().a() != gm.size() || !gm.containsKey(str))) {
                this.a.a(str);
            } else {
                if (!this.b.a(gm, str, str2)) {
                    gm.put(str, str2);
                    return true;
                }
                this.b.a(str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean b(Gm gm, String str, String str2) {
        if (gm == null) {
            return false;
        }
        String strA = this.a.b().a(str);
        String strA2 = this.a.c().a(str2);
        if (!gm.containsKey(strA)) {
            if (strA2 != null) {
                return a(gm, strA, strA2);
            }
            return false;
        }
        String str3 = gm.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(gm, strA, strA2);
        }
        return false;
    }

    public Ln(Kn kn, Jn jn) {
        this.a = kn;
        this.b = jn;
    }
}

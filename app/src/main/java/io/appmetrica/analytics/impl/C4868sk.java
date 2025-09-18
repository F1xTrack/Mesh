package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4868sk {
    public final C4741nc a;
    public final C4717mc b;

    public C4868sk(PublicLogger publicLogger, String str) {
        this(new C4741nc(str, publicLogger), new C4717mc(str, publicLogger));
    }

    public final synchronized boolean a(C4813qc c4813qc, String str, String str2) {
        try {
            int size = c4813qc.size();
            int i = this.a.c.a;
            if (size < i || (i == c4813qc.size() && c4813qc.containsKey(str))) {
                this.b.getClass();
                int length = c4813qc.a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (c4813qc.containsKey(str)) {
                    String str3 = (String) c4813qc.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    c4813qc.put(str, str2);
                    return true;
                }
                C4717mc c4717mc = this.b;
                c4717mc.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c4717mc.a, 4500, str);
            } else {
                C4741nc c4741nc = this.a;
                c4741nc.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c4741nc.e, Integer.valueOf(c4741nc.c.a), str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(C4813qc c4813qc, String str, String str2) {
        if (c4813qc == null) {
            return false;
        }
        String strA = this.a.a.a(str);
        String strA2 = this.a.b.a(str2);
        if (!c4813qc.containsKey(strA)) {
            if (strA2 != null) {
                return a(c4813qc, strA, strA2);
            }
            return false;
        }
        String str3 = (String) c4813qc.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(c4813qc, strA, strA2);
        }
        return false;
    }

    public C4868sk(C4741nc c4741nc, C4717mc c4717mc) {
        this.a = c4741nc;
        this.b = c4717mc;
    }
}

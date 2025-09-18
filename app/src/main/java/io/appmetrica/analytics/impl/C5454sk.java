package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sk */
/* loaded from: classes2.dex */
public final class C5454sk {

    /* renamed from: a */
    public final C5321nc f32576a;

    /* renamed from: b */
    public final C5296mc f32577b;

    public C5454sk(PublicLogger publicLogger, String str) {
        this(new C5321nc(str, publicLogger), new C5296mc(str, publicLogger));
    }

    /* renamed from: a */
    public final synchronized boolean m21049a(C5396qc c5396qc, String str, String str2) {
        try {
            int size = c5396qc.size();
            int i = this.f32576a.f32272c.f29844a;
            if (size < i || (i == c5396qc.size() && c5396qc.containsKey(str))) {
                this.f32577b.getClass();
                int length = c5396qc.f32444a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (c5396qc.containsKey(str)) {
                    String str3 = (String) c5396qc.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    c5396qc.put(str, str2);
                    return true;
                }
                C5296mc c5296mc = this.f32577b;
                c5296mc.f32199b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c5296mc.f32198a, 4500, str);
            } else {
                C5321nc c5321nc = this.f32576a;
                c5321nc.f32273d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c5321nc.f32274e, Integer.valueOf(c5321nc.f32272c.f29844a), str);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final boolean m21050b(C5396qc c5396qc, String str, String str2) {
        if (c5396qc == null) {
            return false;
        }
        String strMo19479a = this.f32576a.f32270a.mo19479a(str);
        String strMo19479a2 = this.f32576a.f32271b.mo19479a(str2);
        if (!c5396qc.containsKey(strMo19479a)) {
            if (strMo19479a2 != null) {
                return m21049a(c5396qc, strMo19479a, strMo19479a2);
            }
            return false;
        }
        String str3 = (String) c5396qc.get(strMo19479a);
        if (strMo19479a2 == null || !strMo19479a2.equals(str3)) {
            return m21049a(c5396qc, strMo19479a, strMo19479a2);
        }
        return false;
    }

    public C5454sk(C5321nc c5321nc, C5296mc c5296mc) {
        this.f32576a = c5321nc;
        this.f32577b = c5296mc;
    }
}

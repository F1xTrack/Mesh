package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: kV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5514kV extends GA0 {
    public static final C7533v4 b = C7533v4.d();
    public final C0493Gb1 a;

    public C5514kV(C0493Gb1 c0493Gb1) {
        this.a = c0493Gb1;
    }

    public static boolean d(C0493Gb1 c0493Gb1, int i) {
        if (c0493Gb1 == null) {
            return false;
        }
        C7533v4 c7533v4 = b;
        if (i > 1) {
            c7533v4.f();
            return false;
        }
        for (Map.Entry entry : c0493Gb1.F().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.isEmpty()) {
                    c7533v4.f();
                } else if (strTrim.length() > 100) {
                    c7533v4.f();
                } else if (((Long) entry.getValue()) == null) {
                    Objects.toString(entry.getValue());
                    c7533v4.f();
                    return false;
                }
            }
            c7533v4.f();
            return false;
        }
        Iterator it = c0493Gb1.L().iterator();
        while (it.hasNext()) {
            if (!d((C0493Gb1) it.next(), i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(C0493Gb1 c0493Gb1, int i) {
        Long l;
        C7533v4 c7533v4 = b;
        if (c0493Gb1 == null) {
            c7533v4.f();
            return false;
        }
        if (i > 1) {
            c7533v4.f();
            return false;
        }
        String strJ = c0493Gb1.J();
        if (strJ != null) {
            String strTrim = strJ.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (c0493Gb1.I() <= 0) {
                    c7533v4.f();
                    return false;
                }
                if (!c0493Gb1.M()) {
                    c7533v4.f();
                    return false;
                }
                if (c0493Gb1.J().startsWith("_st_") && ((l = (Long) c0493Gb1.F().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    c7533v4.f();
                    return false;
                }
                Iterator it = c0493Gb1.L().iterator();
                while (it.hasNext()) {
                    if (!e((C0493Gb1) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : c0493Gb1.G().entrySet()) {
                    try {
                        GA0.b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        e.getLocalizedMessage();
                        c7533v4.f();
                        return false;
                    }
                }
                return true;
            }
        }
        c7533v4.f();
        return false;
    }

    @Override // defpackage.GA0
    public final boolean a() {
        C0493Gb1 c0493Gb1 = this.a;
        boolean zE = e(c0493Gb1, 0);
        C7533v4 c7533v4 = b;
        if (!zE) {
            c0493Gb1.J();
            c7533v4.f();
            return false;
        }
        if (c0493Gb1.E() <= 0) {
            Iterator it = c0493Gb1.L().iterator();
            while (it.hasNext()) {
                if (((C0493Gb1) it.next()).E() > 0) {
                }
            }
            return true;
        }
        if (d(c0493Gb1, 0)) {
            return true;
        }
        c7533v4.f();
        return false;
    }
}

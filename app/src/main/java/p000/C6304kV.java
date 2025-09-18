package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: kV */
/* loaded from: classes.dex */
public final class C6304kV extends GA0 {

    /* renamed from: b */
    public static final C6989v4 f36510b = C6989v4.m25319d();

    /* renamed from: a */
    public final C7629Gb1 f36511a;

    public C6304kV(C7629Gb1 c7629Gb1) {
        this.f36511a = c7629Gb1;
    }

    /* renamed from: d */
    public static boolean m22216d(C7629Gb1 c7629Gb1, int i) {
        if (c7629Gb1 == null) {
            return false;
        }
        C6989v4 c6989v4 = f36510b;
        if (i > 1) {
            c6989v4.m25324f();
            return false;
        }
        for (Map.Entry entry : c7629Gb1.m3109F().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.isEmpty()) {
                    c6989v4.m25324f();
                } else if (strTrim.length() > 100) {
                    c6989v4.m25324f();
                } else if (((Long) entry.getValue()) == null) {
                    Objects.toString(entry.getValue());
                    c6989v4.m25324f();
                    return false;
                }
            }
            c6989v4.m25324f();
            return false;
        }
        Iterator it = c7629Gb1.m3114L().iterator();
        while (it.hasNext()) {
            if (!m22216d((C7629Gb1) it.next(), i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m22217e(C7629Gb1 c7629Gb1, int i) {
        Long l;
        C6989v4 c6989v4 = f36510b;
        if (c7629Gb1 == null) {
            c6989v4.m25324f();
            return false;
        }
        if (i > 1) {
            c6989v4.m25324f();
            return false;
        }
        String strM3112J = c7629Gb1.m3112J();
        if (strM3112J != null) {
            String strTrim = strM3112J.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (c7629Gb1.m3111I() <= 0) {
                    c6989v4.m25324f();
                    return false;
                }
                if (!c7629Gb1.m3115M()) {
                    c6989v4.m25324f();
                    return false;
                }
                if (c7629Gb1.m3112J().startsWith("_st_") && ((l = (Long) c7629Gb1.m3109F().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    c6989v4.m25324f();
                    return false;
                }
                Iterator it = c7629Gb1.m3114L().iterator();
                while (it.hasNext()) {
                    if (!m22217e((C7629Gb1) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : c7629Gb1.m3110G().entrySet()) {
                    try {
                        GA0.m2937b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        e.getLocalizedMessage();
                        c6989v4.m25324f();
                        return false;
                    }
                }
                return true;
            }
        }
        c6989v4.m25324f();
        return false;
    }

    @Override // p000.GA0
    /* renamed from: a */
    public final boolean mo2939a() {
        C7629Gb1 c7629Gb1 = this.f36511a;
        boolean zM22217e = m22217e(c7629Gb1, 0);
        C6989v4 c6989v4 = f36510b;
        if (!zM22217e) {
            c7629Gb1.m3112J();
            c6989v4.m25324f();
            return false;
        }
        if (c7629Gb1.m3108E() <= 0) {
            Iterator it = c7629Gb1.m3114L().iterator();
            while (it.hasNext()) {
                if (((C7629Gb1) it.next()).m3108E() > 0) {
                }
            }
            return true;
        }
        if (m22216d(c7629Gb1, 0)) {
            return true;
        }
        c6989v4.m25324f();
        return false;
    }
}

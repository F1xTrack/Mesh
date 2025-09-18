package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.qe */
/* loaded from: classes2.dex */
public final class C4815qe extends AbstractC4452bd implements xn {
    public static final C4791pe d = new C4791pe("LOCATION_TRACKING_ENABLED", null);
    public static final C4791pe e = new C4791pe("PREF_KEY_OFFSET", null);
    public static final C4791pe f = new C4791pe("UNCHECKED_TIME", null);
    public static final C4791pe g = new C4791pe("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final C4791pe h = new C4791pe("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final C4791pe i = new C4791pe("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final C4791pe j = new C4791pe("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final C4791pe k = new C4791pe("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final C4791pe l = new C4791pe("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final C4791pe m = new C4791pe("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final C4791pe n = new C4791pe("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final C4791pe o = new C4791pe("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final C4791pe p = new C4791pe("SATELLITE_CLIDS_CHECKED", null);
    public static final C4791pe q = new C4791pe("VITAL_DATA", null);
    public static final C4791pe r = new C4791pe("LAST_KOTLIN_VERSION_SEND_TIME", null);

    public C4815qe(Ea ea) {
        super(ea);
    }

    public final long a(int i2) {
        return this.a.getLong(e.b, i2);
    }

    public final C4815qe b(boolean z) {
        return (C4815qe) b(g.b, z);
    }

    public final C4815qe c(boolean z) {
        return (C4815qe) b(f.b, z);
    }

    public final void d(boolean z) {
        b(d.b, z).b();
    }

    public final boolean e() {
        return this.a.getBoolean(d.b, false);
    }

    public final long f() {
        return this.a.getLong(r.b, 0L);
    }

    public final C4815qe g() {
        return (C4815qe) b(p.b, true);
    }

    public final C4815qe h() {
        return (C4815qe) b(o.b, true);
    }

    public final boolean i() {
        return this.a.getBoolean(o.b, false);
    }

    public final boolean j() {
        return this.a.getBoolean(p.b, false);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(f.b, z);
    }

    public final C4815qe b(long j2) {
        return (C4815qe) b(h.b, j2);
    }

    public final C4815qe c(long j2) {
        return (C4815qe) b(r.b, j2);
    }

    public final C4815qe d(long j2) {
        return (C4815qe) b(e.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4452bd
    public final String f(String str) {
        return new C4791pe(str, null).b;
    }

    public final long a(long j2) {
        return this.a.getLong(h.b, j2);
    }

    public final C4815qe b(EnumC4766od enumC4766od, int i2) {
        C4791pe c4791pe;
        int iOrdinal = enumC4766od.ordinal();
        if (iOrdinal == 0) {
            c4791pe = i;
        } else if (iOrdinal != 1) {
            c4791pe = iOrdinal != 2 ? null : k;
        } else {
            c4791pe = j;
        }
        return c4791pe != null ? (C4815qe) b(c4791pe.b, i2) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4767oe
    public final Set<String> c() {
        return this.a.a();
    }

    public final Boolean d() {
        C4791pe c4791pe = g;
        if (!this.a.a(c4791pe.b)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(c4791pe.b, true));
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final String a() {
        return this.a.getString(q.b, null);
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final void a(String str) {
        b(q.b, str).b();
    }

    public final C4815qe b(EnumC4766od enumC4766od, long j2) {
        C4791pe c4791pe;
        int iOrdinal = enumC4766od.ordinal();
        if (iOrdinal == 0) {
            c4791pe = l;
        } else if (iOrdinal != 1) {
            c4791pe = iOrdinal != 2 ? null : n;
        } else {
            c4791pe = m;
        }
        return c4791pe != null ? (C4815qe) b(c4791pe.b, j2) : this;
    }

    public final int a(EnumC4766od enumC4766od, int i2) {
        C4791pe c4791pe;
        int iOrdinal = enumC4766od.ordinal();
        if (iOrdinal == 0) {
            c4791pe = i;
        } else if (iOrdinal != 1) {
            c4791pe = iOrdinal != 2 ? null : k;
        } else {
            c4791pe = j;
        }
        if (c4791pe == null) {
            return i2;
        }
        return this.a.getInt(c4791pe.b, i2);
    }

    public final long a(EnumC4766od enumC4766od, long j2) {
        C4791pe c4791pe;
        int iOrdinal = enumC4766od.ordinal();
        if (iOrdinal == 0) {
            c4791pe = l;
        } else if (iOrdinal != 1) {
            c4791pe = iOrdinal != 2 ? null : n;
        } else {
            c4791pe = m;
        }
        if (c4791pe == null) {
            return j2;
        }
        return this.a.getLong(c4791pe.b, j2);
    }
}

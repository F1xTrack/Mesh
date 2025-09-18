package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.qe */
/* loaded from: classes2.dex */
public final class C5398qe extends AbstractC5022bd implements InterfaceC5582xn {

    /* renamed from: d */
    public static final C5373pe f32448d = new C5373pe("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e */
    public static final C5373pe f32449e = new C5373pe("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    public static final C5373pe f32450f = new C5373pe("UNCHECKED_TIME", null);

    /* renamed from: g */
    public static final C5373pe f32451g = new C5373pe("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h */
    public static final C5373pe f32452h = new C5373pe("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i */
    public static final C5373pe f32453i = new C5373pe("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j */
    public static final C5373pe f32454j = new C5373pe("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k */
    public static final C5373pe f32455k = new C5373pe("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l */
    public static final C5373pe f32456l = new C5373pe("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m */
    public static final C5373pe f32457m = new C5373pe("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n */
    public static final C5373pe f32458n = new C5373pe("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o */
    public static final C5373pe f32459o = new C5373pe("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p */
    public static final C5373pe f32460p = new C5373pe("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q */
    public static final C5373pe f32461q = new C5373pe("VITAL_DATA", null);

    /* renamed from: r */
    public static final C5373pe f32462r = new C5373pe("LAST_KOTLIN_VERSION_SEND_TIME", null);

    public C5398qe(InterfaceC4467Ea interfaceC4467Ea) {
        super(interfaceC4467Ea);
    }

    /* renamed from: a */
    public final long m20959a(int i) {
        return this.f32347a.getLong(f32449e.f32397b, i);
    }

    /* renamed from: b */
    public final C5398qe m20966b(boolean z) {
        return (C5398qe) m20874b(f32451g.f32397b, z);
    }

    /* renamed from: c */
    public final C5398qe m20968c(boolean z) {
        return (C5398qe) m20874b(f32450f.f32397b, z);
    }

    /* renamed from: d */
    public final void m20971d(boolean z) {
        m20874b(f32448d.f32397b, z).m20875b();
    }

    /* renamed from: e */
    public final boolean m20972e() {
        return this.f32347a.getBoolean(f32448d.f32397b, false);
    }

    /* renamed from: f */
    public final long m20973f() {
        return this.f32347a.getLong(f32462r.f32397b, 0L);
    }

    /* renamed from: g */
    public final C5398qe m20974g() {
        return (C5398qe) m20874b(f32460p.f32397b, true);
    }

    /* renamed from: h */
    public final C5398qe m20975h() {
        return (C5398qe) m20874b(f32459o.f32397b, true);
    }

    /* renamed from: i */
    public final boolean m20976i() {
        return this.f32347a.getBoolean(f32459o.f32397b, false);
    }

    /* renamed from: j */
    public final boolean m20977j() {
        return this.f32347a.getBoolean(f32460p.f32397b, false);
    }

    /* renamed from: a */
    public final boolean m20962a(boolean z) {
        return this.f32347a.getBoolean(f32450f.f32397b, z);
    }

    /* renamed from: b */
    public final C5398qe m20963b(long j) {
        return (C5398qe) m20872b(f32452h.f32397b, j);
    }

    /* renamed from: c */
    public final C5398qe m20967c(long j) {
        return (C5398qe) m20872b(f32462r.f32397b, j);
    }

    /* renamed from: d */
    public final C5398qe m20969d(long j) {
        return (C5398qe) m20872b(f32449e.f32397b, j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5022bd
    /* renamed from: f */
    public final String mo20188f(String str) {
        return new C5373pe(str, null).f32397b;
    }

    /* renamed from: a */
    public final long m20960a(long j) {
        return this.f32347a.getLong(f32452h.f32397b, j);
    }

    /* renamed from: b */
    public final C5398qe m20964b(EnumC5347od enumC5347od, int i) {
        C5373pe c5373pe;
        int iOrdinal = enumC5347od.ordinal();
        if (iOrdinal == 0) {
            c5373pe = f32453i;
        } else if (iOrdinal != 1) {
            c5373pe = iOrdinal != 2 ? null : f32455k;
        } else {
            c5373pe = f32454j;
        }
        return c5373pe != null ? (C5398qe) m20871b(c5373pe.f32397b, i) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5348oe
    /* renamed from: c */
    public final Set<String> mo20823c() {
        return this.f32347a.mo19347a();
    }

    /* renamed from: d */
    public final Boolean m20970d() {
        C5373pe c5373pe = f32451g;
        if (!this.f32347a.mo19348a(c5373pe.f32397b)) {
            return null;
        }
        return Boolean.valueOf(this.f32347a.getBoolean(c5373pe.f32397b, true));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final String mo20031a() {
        return this.f32347a.getString(f32461q.f32397b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final void mo20032a(String str) {
        m20873b(f32461q.f32397b, str).m20875b();
    }

    /* renamed from: b */
    public final C5398qe m20965b(EnumC5347od enumC5347od, long j) {
        C5373pe c5373pe;
        int iOrdinal = enumC5347od.ordinal();
        if (iOrdinal == 0) {
            c5373pe = f32456l;
        } else if (iOrdinal != 1) {
            c5373pe = iOrdinal != 2 ? null : f32458n;
        } else {
            c5373pe = f32457m;
        }
        return c5373pe != null ? (C5398qe) m20872b(c5373pe.f32397b, j) : this;
    }

    /* renamed from: a */
    public final int m20958a(EnumC5347od enumC5347od, int i) {
        C5373pe c5373pe;
        int iOrdinal = enumC5347od.ordinal();
        if (iOrdinal == 0) {
            c5373pe = f32453i;
        } else if (iOrdinal != 1) {
            c5373pe = iOrdinal != 2 ? null : f32455k;
        } else {
            c5373pe = f32454j;
        }
        if (c5373pe == null) {
            return i;
        }
        return this.f32347a.getInt(c5373pe.f32397b, i);
    }

    /* renamed from: a */
    public final long m20961a(EnumC5347od enumC5347od, long j) {
        C5373pe c5373pe;
        int iOrdinal = enumC5347od.ordinal();
        if (iOrdinal == 0) {
            c5373pe = f32456l;
        } else if (iOrdinal != 1) {
            c5373pe = iOrdinal != 2 ? null : f32458n;
        } else {
            c5373pe = f32457m;
        }
        if (c5373pe == null) {
            return j;
        }
        return this.f32347a.getLong(c5373pe.f32397b, j);
    }
}

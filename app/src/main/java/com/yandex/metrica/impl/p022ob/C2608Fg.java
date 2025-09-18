package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Fg */
/* loaded from: classes2.dex */
public final class C2608Fg {

    /* renamed from: a */
    public final String f21216a;

    /* renamed from: b */
    public final long f21217b;

    /* renamed from: c */
    public final long f21218c;

    /* renamed from: d */
    public final a f21219d;

    /* renamed from: com.yandex.metrica.impl.ob.Fg$a */
    public enum a {
        UNKNOWN("unknown"),
        GP("gpl"),
        HMS("hms-content-provider");


        /* renamed from: a */
        public final String f21224a;

        a(String str) {
            this.f21224a = str;
        }
    }

    private C2608Fg(byte[] bArr) throws C3193d {
        C3081Yf c3081YfM15508a = C3081Yf.m15508a(bArr);
        this.f21216a = c3081YfM15508a.f22891b;
        this.f21217b = c3081YfM15508a.f22893d;
        this.f21218c = c3081YfM15508a.f22892c;
        this.f21219d = m14132a(c3081YfM15508a.f22894e);
    }

    /* renamed from: a */
    public static C2608Fg m14133a(byte[] bArr) throws C3193d {
        if (C2968U2.m15246a(bArr)) {
            return null;
        }
        return new C2608Fg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2608Fg.class != obj.getClass()) {
            return false;
        }
        C2608Fg c2608Fg = (C2608Fg) obj;
        return this.f21217b == c2608Fg.f21217b && this.f21218c == c2608Fg.f21218c && this.f21216a.equals(c2608Fg.f21216a) && this.f21219d == c2608Fg.f21219d;
    }

    public int hashCode() {
        int iHashCode = this.f21216a.hashCode() * 31;
        long j = this.f21217b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f21218c;
        return this.f21219d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f21216a + "', referrerClickTimestampSeconds=" + this.f21217b + ", installBeginTimestampSeconds=" + this.f21218c + ", source=" + this.f21219d + '}';
    }

    /* renamed from: a */
    public byte[] m14134a() {
        C3081Yf c3081Yf = new C3081Yf();
        c3081Yf.f22891b = this.f21216a;
        c3081Yf.f22893d = this.f21217b;
        c3081Yf.f22892c = this.f21218c;
        int iOrdinal = this.f21219d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        c3081Yf.f22894e = i;
        return AbstractC3219e.m15809a(c3081Yf);
    }

    public C2608Fg(String str, long j, long j2, a aVar) {
        this.f21216a = str;
        this.f21217b = j;
        this.f21218c = j2;
        this.f21219d = aVar;
    }

    /* renamed from: a */
    private a m14132a(int i) {
        if (i == 1) {
            return a.GP;
        }
        if (i != 2) {
            return a.UNKNOWN;
        }
        return a.HMS;
    }
}

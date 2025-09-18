package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public final class Fg {
    public final String a;
    public final long b;
    public final long c;
    public final a d;

    public enum a {
        UNKNOWN("unknown"),
        GP("gpl"),
        HMS("hms-content-provider");

        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    private Fg(byte[] bArr) throws C2689d {
        Yf yfA = Yf.a(bArr);
        this.a = yfA.b;
        this.b = yfA.d;
        this.c = yfA.c;
        this.d = a(yfA.e);
    }

    public static Fg a(byte[] bArr) throws C2689d {
        if (U2.a(bArr)) {
            return null;
        }
        return new Fg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Fg.class != obj.getClass()) {
            return false;
        }
        Fg fg = (Fg) obj;
        return this.b == fg.b && this.c == fg.c && this.a.equals(fg.a) && this.d == fg.d;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + '}';
    }

    public byte[] a() {
        Yf yf = new Yf();
        yf.b = this.a;
        yf.d = this.b;
        yf.c = this.c;
        int iOrdinal = this.d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        yf.e = i;
        return AbstractC2714e.a(yf);
    }

    public Fg(String str, long j, long j2, a aVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = aVar;
    }

    private a a(int i) {
        if (i == 1) {
            return a.GP;
        }
        if (i != 2) {
            return a.UNKNOWN;
        }
        return a.HMS;
    }
}

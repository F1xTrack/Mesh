package defpackage;

import java.util.List;

/* renamed from: Sc */
/* loaded from: classes.dex */
public final class C1429Sc extends SA {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final C1507Tc g;
    public final C7065sd h;
    public final C6874rd i;
    public final C1741Wc j;
    public final List k;
    public final int l;

    public C1429Sc(String str, String str2, String str3, long j, Long l, boolean z, C1507Tc c1507Tc, C7065sd c7065sd, C6874rd c6874rd, C1741Wc c1741Wc, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = c1507Tc;
        this.h = c7065sd;
        this.i = c6874rd;
        this.j = c1741Wc;
        this.k = list;
        this.l = i;
    }

    public final C1351Rc a() {
        C1351Rc c1351Rc = new C1351Rc();
        c1351Rc.a = this.a;
        c1351Rc.b = this.b;
        c1351Rc.c = this.c;
        c1351Rc.d = this.d;
        c1351Rc.e = this.e;
        c1351Rc.f = this.f;
        c1351Rc.g = this.g;
        c1351Rc.h = this.h;
        c1351Rc.i = this.i;
        c1351Rc.j = this.j;
        c1351Rc.k = this.k;
        c1351Rc.l = this.l;
        c1351Rc.m = (byte) 7;
        return c1351Rc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SA)) {
            return false;
        }
        C1429Sc c1429Sc = (C1429Sc) ((SA) obj);
        if (this.a.equals(c1429Sc.a)) {
            if (this.b.equals(c1429Sc.b)) {
                String str = c1429Sc.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == c1429Sc.d) {
                        Long l = c1429Sc.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == c1429Sc.f && this.g.equals(c1429Sc.g)) {
                                C7065sd c7065sd = c1429Sc.h;
                                C7065sd c7065sd2 = this.h;
                                if (c7065sd2 != null ? c7065sd2.equals(c7065sd) : c7065sd == null) {
                                    C6874rd c6874rd = c1429Sc.i;
                                    C6874rd c6874rd2 = this.i;
                                    if (c6874rd2 != null ? c6874rd2.equals(c6874rd) : c6874rd == null) {
                                        C1741Wc c1741Wc = c1429Sc.j;
                                        C1741Wc c1741Wc2 = this.j;
                                        if (c1741Wc2 != null ? c1741Wc2.equals(c1741Wc) : c1741Wc == null) {
                                            List list = c1429Sc.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == c1429Sc.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        C7065sd c7065sd = this.h;
        int iHashCode4 = (iHashCode3 ^ (c7065sd == null ? 0 : c7065sd.hashCode())) * 1000003;
        C6874rd c6874rd = this.i;
        int iHashCode5 = (iHashCode4 ^ (c6874rd == null ? 0 : c6874rd.hashCode())) * 1000003;
        C1741Wc c1741Wc = this.j;
        int iHashCode6 = (iHashCode5 ^ (c1741Wc == null ? 0 : c1741Wc.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return AbstractC1705Vq.j(sb, this.l, "}");
    }
}

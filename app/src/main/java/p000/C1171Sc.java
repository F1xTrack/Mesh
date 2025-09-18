package p000;

import java.util.List;

/* renamed from: Sc */
/* loaded from: classes.dex */
public final class C1171Sc extends AbstractC1143SA {

    /* renamed from: a */
    public final String f10865a;

    /* renamed from: b */
    public final String f10866b;

    /* renamed from: c */
    public final String f10867c;

    /* renamed from: d */
    public final long f10868d;

    /* renamed from: e */
    public final Long f10869e;

    /* renamed from: f */
    public final boolean f10870f;

    /* renamed from: g */
    public final C1234Tc f10871g;

    /* renamed from: h */
    public final C6835sd f10872h;

    /* renamed from: i */
    public final C6755rd f10873i;

    /* renamed from: j */
    public final C1423Wc f10874j;

    /* renamed from: k */
    public final List f10875k;

    /* renamed from: l */
    public final int f10876l;

    public C1171Sc(String str, String str2, String str3, long j, Long l, boolean z, C1234Tc c1234Tc, C6835sd c6835sd, C6755rd c6755rd, C1423Wc c1423Wc, List list, int i) {
        this.f10865a = str;
        this.f10866b = str2;
        this.f10867c = str3;
        this.f10868d = j;
        this.f10869e = l;
        this.f10870f = z;
        this.f10871g = c1234Tc;
        this.f10872h = c6835sd;
        this.f10873i = c6755rd;
        this.f10874j = c1423Wc;
        this.f10875k = list;
        this.f10876l = i;
    }

    /* renamed from: a */
    public final C1108Rc m7399a() {
        C1108Rc c1108Rc = new C1108Rc();
        c1108Rc.f10324a = this.f10865a;
        c1108Rc.f10325b = this.f10866b;
        c1108Rc.f10326c = this.f10867c;
        c1108Rc.f10327d = this.f10868d;
        c1108Rc.f10328e = this.f10869e;
        c1108Rc.f10329f = this.f10870f;
        c1108Rc.f10330g = this.f10871g;
        c1108Rc.f10331h = this.f10872h;
        c1108Rc.f10332i = this.f10873i;
        c1108Rc.f10333j = this.f10874j;
        c1108Rc.f10334k = this.f10875k;
        c1108Rc.f10335l = this.f10876l;
        c1108Rc.f10336m = (byte) 7;
        return c1108Rc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1143SA)) {
            return false;
        }
        C1171Sc c1171Sc = (C1171Sc) ((AbstractC1143SA) obj);
        if (this.f10865a.equals(c1171Sc.f10865a)) {
            if (this.f10866b.equals(c1171Sc.f10866b)) {
                String str = c1171Sc.f10867c;
                String str2 = this.f10867c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f10868d == c1171Sc.f10868d) {
                        Long l = c1171Sc.f10869e;
                        Long l2 = this.f10869e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f10870f == c1171Sc.f10870f && this.f10871g.equals(c1171Sc.f10871g)) {
                                C6835sd c6835sd = c1171Sc.f10872h;
                                C6835sd c6835sd2 = this.f10872h;
                                if (c6835sd2 != null ? c6835sd2.equals(c6835sd) : c6835sd == null) {
                                    C6755rd c6755rd = c1171Sc.f10873i;
                                    C6755rd c6755rd2 = this.f10873i;
                                    if (c6755rd2 != null ? c6755rd2.equals(c6755rd) : c6755rd == null) {
                                        C1423Wc c1423Wc = c1171Sc.f10874j;
                                        C1423Wc c1423Wc2 = this.f10874j;
                                        if (c1423Wc2 != null ? c1423Wc2.equals(c1423Wc) : c1423Wc == null) {
                                            List list = c1171Sc.f10875k;
                                            List list2 = this.f10875k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f10876l == c1171Sc.f10876l) {
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
        int iHashCode = (((this.f10865a.hashCode() ^ 1000003) * 1000003) ^ this.f10866b.hashCode()) * 1000003;
        String str = this.f10867c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f10868d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f10869e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f10870f ? 1231 : 1237)) * 1000003) ^ this.f10871g.hashCode()) * 1000003;
        C6835sd c6835sd = this.f10872h;
        int iHashCode4 = (iHashCode3 ^ (c6835sd == null ? 0 : c6835sd.hashCode())) * 1000003;
        C6755rd c6755rd = this.f10873i;
        int iHashCode5 = (iHashCode4 ^ (c6755rd == null ? 0 : c6755rd.hashCode())) * 1000003;
        C1423Wc c1423Wc = this.f10874j;
        int iHashCode6 = (iHashCode5 ^ (c1423Wc == null ? 0 : c1423Wc.hashCode())) * 1000003;
        List list = this.f10875k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f10876l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f10865a);
        sb.append(", identifier=");
        sb.append(this.f10866b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f10867c);
        sb.append(", startedAt=");
        sb.append(this.f10868d);
        sb.append(", endedAt=");
        sb.append(this.f10869e);
        sb.append(", crashed=");
        sb.append(this.f10870f);
        sb.append(", app=");
        sb.append(this.f10871g);
        sb.append(", user=");
        sb.append(this.f10872h);
        sb.append(", os=");
        sb.append(this.f10873i);
        sb.append(", device=");
        sb.append(this.f10874j);
        sb.append(", events=");
        sb.append(this.f10875k);
        sb.append(", generatorType=");
        return AbstractC1374Vq.m8591j(sb, this.f10876l, "}");
    }
}

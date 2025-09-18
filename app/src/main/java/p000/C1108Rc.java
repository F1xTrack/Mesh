package p000;

import java.util.List;

/* renamed from: Rc */
/* loaded from: classes.dex */
public final class C1108Rc {

    /* renamed from: a */
    public String f10324a;

    /* renamed from: b */
    public String f10325b;

    /* renamed from: c */
    public String f10326c;

    /* renamed from: d */
    public long f10327d;

    /* renamed from: e */
    public Long f10328e;

    /* renamed from: f */
    public boolean f10329f;

    /* renamed from: g */
    public C1234Tc f10330g;

    /* renamed from: h */
    public C6835sd f10331h;

    /* renamed from: i */
    public C6755rd f10332i;

    /* renamed from: j */
    public C1423Wc f10333j;

    /* renamed from: k */
    public List f10334k;

    /* renamed from: l */
    public int f10335l;

    /* renamed from: m */
    public byte f10336m;

    /* renamed from: a */
    public final C1171Sc m7048a() {
        String str;
        String str2;
        C1234Tc c1234Tc;
        if (this.f10336m == 7 && (str = this.f10324a) != null && (str2 = this.f10325b) != null && (c1234Tc = this.f10330g) != null) {
            return new C1171Sc(str, str2, this.f10326c, this.f10327d, this.f10328e, this.f10329f, c1234Tc, this.f10331h, this.f10332i, this.f10333j, this.f10334k, this.f10335l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10324a == null) {
            sb.append(" generator");
        }
        if (this.f10325b == null) {
            sb.append(" identifier");
        }
        if ((this.f10336m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f10336m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f10330g == null) {
            sb.append(" app");
        }
        if ((this.f10336m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}

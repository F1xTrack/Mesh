package p000;

import java.util.List;

/* renamed from: Lc */
/* loaded from: classes.dex */
public final class C0731Lc {

    /* renamed from: a */
    public int f6749a;

    /* renamed from: b */
    public String f6750b;

    /* renamed from: c */
    public int f6751c;

    /* renamed from: d */
    public int f6752d;

    /* renamed from: e */
    public long f6753e;

    /* renamed from: f */
    public long f6754f;

    /* renamed from: g */
    public long f6755g;

    /* renamed from: h */
    public String f6756h;

    /* renamed from: i */
    public List f6757i;

    /* renamed from: j */
    public byte f6758j;

    /* renamed from: a */
    public final C0794Mc m5031a() {
        String str;
        if (this.f6758j == 63 && (str = this.f6750b) != null) {
            return new C0794Mc(this.f6749a, str, this.f6751c, this.f6752d, this.f6753e, this.f6754f, this.f6755g, this.f6756h, this.f6757i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f6758j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f6750b == null) {
            sb.append(" processName");
        }
        if ((this.f6758j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f6758j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f6758j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f6758j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f6758j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(AbstractC1374Vq.m8592k(sb, "Missing required properties:"));
    }
}

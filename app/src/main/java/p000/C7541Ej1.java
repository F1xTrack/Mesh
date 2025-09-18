package p000;

/* renamed from: Ej1 */
/* loaded from: classes.dex */
public final class C7541Ej1 {

    /* renamed from: a */
    public final C9432fw1 f2860a;

    /* renamed from: b */
    public final C11962zj1 f2861b;

    /* renamed from: c */
    public final C7005vK f2862c = new C7005vK(5);

    /* renamed from: d */
    public final C0577J9 f2863d = new C0577J9();

    /* renamed from: e */
    public final C0577J9 f2864e = new C0577J9();

    /* renamed from: f */
    public final C6455mu f2865f;

    /* renamed from: g */
    public C8321Tj1 f2866g;

    /* renamed from: h */
    public C8321Tj1 f2867h;

    /* renamed from: i */
    public long f2868i;

    /* renamed from: j */
    public long f2869j;

    public C7541Ej1(C9432fw1 c9432fw1, C11962zj1 c11962zj1) {
        this.f2860a = c9432fw1;
        this.f2861b = c11962zj1;
        C6455mu c6455mu = new C6455mu();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c6455mu.f37981a = 0;
        c6455mu.f37982b = 0;
        c6455mu.f37984d = new long[iHighestOneBit];
        c6455mu.f37983c = iHighestOneBit - 1;
        this.f2865f = c6455mu;
        this.f2867h = C8321Tj1.f11486e;
        this.f2869j = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m2370a() {
        C6455mu c6455mu = this.f2865f;
        c6455mu.f37981a = 0;
        c6455mu.f37982b = 0;
        this.f2869j = -9223372036854775807L;
        C0577J9 c0577j9 = this.f2864e;
        if (c0577j9.m4230t() > 0) {
            YN1.m9278c(c0577j9.m4230t() > 0);
            while (c0577j9.m4230t() > 1) {
                c0577j9.m4226p();
            }
            Object objM4226p = c0577j9.m4226p();
            objM4226p.getClass();
            c0577j9.m4221a(0L, (Long) objM4226p);
        }
        C8321Tj1 c8321Tj1 = this.f2866g;
        C0577J9 c0577j92 = this.f2863d;
        if (c8321Tj1 != null) {
            c0577j92.m4222b();
            return;
        }
        if (c0577j92.m4230t() > 0) {
            YN1.m9278c(c0577j92.m4230t() > 0);
            while (c0577j92.m4230t() > 1) {
                c0577j92.m4226p();
            }
            Object objM4226p2 = c0577j92.m4226p();
            objM4226p2.getClass();
            this.f2866g = (C8321Tj1) objM4226p2;
        }
    }
}

package p000;

/* renamed from: Fh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7588Fh0 extends AbstractC7364Az0 {

    /* renamed from: n */
    public static final /* synthetic */ InterfaceC10293mf0[] f3390n;

    /* renamed from: h */
    public final C10773qP0 f3391h;

    /* renamed from: i */
    public final C6479nH f3392i;

    /* renamed from: j */
    public final C8426Vk0 f3393j;

    /* renamed from: k */
    public final C10929rd0 f3394k;

    /* renamed from: l */
    public final C8166Qk0 f3395l;

    /* renamed from: m */
    public final InterfaceC0510I5 f3396m;

    static {
        IP0 ip0 = BP0.f799a;
        f3390n = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C7588Fh0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), ip0.mo3850f(new GE0(ip0.mo3846b(C7588Fh0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7588Fh0(C6479nH c6479nH, C10773qP0 c10773qP0) {
        O90.m5968f(c6479nH, "outerContext");
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        super((C7454Cs0) c9773ib0.f29352o, c10773qP0.f40861a);
        this.f3391h = c10773qP0;
        C6479nH c6479nHM9056a = XT1.m9056a(c6479nH, this, null, 6);
        this.f3392i = c6479nHM9056a;
        O90.m5968f(((C0712LI) c9773ib0.f29341d).m4944c().f45520c, "<this>");
        C10417nd0 c10417nd0 = C10417nd0.f38414g;
        C9773ib0 c9773ib02 = (C9773ib0) c6479nHM9056a.f38228b;
        C8582Yk0 c8582Yk0 = (C8582Yk0) c9773ib02.f29338a;
        C7536Eh0 c7536Eh0 = new C7536Eh0(this, 0);
        c8582Yk0.getClass();
        this.f3393j = new C8426Vk0(c8582Yk0, c7536Eh0);
        this.f3394k = new C10929rd0(c6479nHM9056a, c10773qP0, this);
        C7536Eh0 c7536Eh02 = new C7536Eh0(this, 2);
        c8582Yk0.getClass();
        this.f3395l = new C8166Qk0(c8582Yk0, c7536Eh02);
        this.f3396m = ((C7316Ab0) c9773ib02.f29359v).f271b ? S20.f10539b : AbstractC1618Zi.m9582e(c6479nHM9056a, c10773qP0);
        c8582Yk0.m9349a(new C7536Eh0(this, 1));
    }

    @Override // p000.InterfaceC11993zz0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo2748d0() {
        return this.f3394k;
    }

    @Override // p000.AbstractC7364Az0, p000.AbstractC0329FD, p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return new C7391Bm1(this);
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return this.f3396m;
    }

    @Override // p000.AbstractC7364Az0, p000.AbstractC0203DD, p000.AbstractC1259U0
    public final String toString() {
        return "Lazy Java package fragment: " + this.f494f + " of module " + ((C7454Cs0) ((C9773ib0) this.f3392i.f38228b).f29352o);
    }
}

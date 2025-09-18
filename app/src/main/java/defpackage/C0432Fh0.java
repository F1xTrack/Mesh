package defpackage;

/* renamed from: Fh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0432Fh0 extends AbstractC0096Az0 {
    public static final /* synthetic */ InterfaceC5927mf0[] n;
    public final C6643qP0 h;
    public final C6045nH i;
    public final C1688Vk0 j;
    public final C6875rd0 k;
    public final C1298Qk0 l;
    public final I5 m;

    static {
        IP0 ip0 = BP0.a;
        n = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C0432Fh0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), ip0.f(new GE0(ip0.b(C0432Fh0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0432Fh0(C6045nH c6045nH, C6643qP0 c6643qP0) {
        O90.f(c6045nH, "outerContext");
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        super((C0231Cs0) c4375ib0.o, c6643qP0.a);
        this.h = c6643qP0;
        C6045nH c6045nHA = XT1.a(c6045nH, this, null, 6);
        this.i = c6045nHA;
        O90.f(((LI) c4375ib0.d).c().c, "<this>");
        C6112nd0 c6112nd0 = C6112nd0.g;
        C4375ib0 c4375ib02 = (C4375ib0) c6045nHA.b;
        C1922Yk0 c1922Yk0 = (C1922Yk0) c4375ib02.a;
        C0354Eh0 c0354Eh0 = new C0354Eh0(this, 0);
        c1922Yk0.getClass();
        this.j = new C1688Vk0(c1922Yk0, c0354Eh0);
        this.k = new C6875rd0(c6045nHA, c6643qP0, this);
        C0354Eh0 c0354Eh02 = new C0354Eh0(this, 2);
        c1922Yk0.getClass();
        this.l = new C1298Qk0(c1922Yk0, c0354Eh02);
        this.m = ((C0024Ab0) c4375ib02.v).b ? S20.b : AbstractC1993Zi.e(c6045nHA, c6643qP0);
        c1922Yk0.a(new C0354Eh0(this, 1));
    }

    @Override // defpackage.InterfaceC8465zz0
    public final InterfaceC5578kq0 d0() {
        return this.k;
    }

    @Override // defpackage.AbstractC0096Az0, defpackage.FD, defpackage.ED
    public final W21 e() {
        return new C0136Bm1(this);
    }

    @Override // defpackage.U0, defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return this.m;
    }

    @Override // defpackage.AbstractC0096Az0, defpackage.DD, defpackage.U0
    public final String toString() {
        return "Lazy Java package fragment: " + this.f + " of module " + ((C0231Cs0) ((C4375ib0) this.i.b).o);
    }
}

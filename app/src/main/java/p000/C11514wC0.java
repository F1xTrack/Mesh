package p000;

/* renamed from: wC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11514wC0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f44706e;

    /* renamed from: f */
    public final /* synthetic */ String f44707f;

    /* renamed from: g */
    public final /* synthetic */ String f44708g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11514wC0(String str, String str2, int i) {
        super(1);
        this.f44706e = i;
        this.f44707f = str;
        this.f44708g = str2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        String str = this.f44708g;
        String str2 = this.f44707f;
        switch (this.f44706e) {
            case 0:
                G01 g01 = (G01) obj;
                O90.m5968f(g01, "$this$function");
                C7472Db0 c7472Db0 = AbstractC11641xC0.f45475b;
                g01.m2876a(str2, c7472Db0);
                C7472Db0 c7472Db02 = AbstractC11641xC0.f45474a;
                g01.m2876a(str, c7472Db0, c7472Db0, c7472Db02, c7472Db02);
                g01.m2878c(str2, c7472Db02);
                break;
            case 1:
                G01 g012 = (G01) obj;
                O90.m5968f(g012, "$this$function");
                C7472Db0 c7472Db03 = AbstractC11641xC0.f45475b;
                g012.m2876a(str2, c7472Db03);
                g012.m2876a(str, c7472Db03, c7472Db03, c7472Db03);
                g012.m2878c(str2, c7472Db03);
                break;
            case 2:
                G01 g013 = (G01) obj;
                O90.m5968f(g013, "$this$function");
                C7472Db0 c7472Db04 = AbstractC11641xC0.f45475b;
                g013.m2876a(str2, c7472Db04);
                C7472Db0 c7472Db05 = AbstractC11641xC0.f45474a;
                g013.m2876a(str, c7472Db04, c7472Db04, AbstractC11641xC0.f45476c, c7472Db05);
                g013.m2878c(str2, c7472Db05);
                break;
            case 3:
                G01 g014 = (G01) obj;
                O90.m5968f(g014, "$this$function");
                C7472Db0 c7472Db06 = AbstractC11641xC0.f45475b;
                g014.m2876a(str2, c7472Db06);
                C7472Db0 c7472Db07 = AbstractC11641xC0.f45476c;
                g014.m2876a(str2, c7472Db07);
                C7472Db0 c7472Db08 = AbstractC11641xC0.f45474a;
                g014.m2876a(str, c7472Db06, c7472Db07, c7472Db07, c7472Db08);
                g014.m2878c(str2, c7472Db08);
                break;
            case 4:
                G01 g015 = (G01) obj;
                O90.m5968f(g015, "$this$function");
                C7472Db0 c7472Db09 = AbstractC11641xC0.f45476c;
                g015.m2876a(str2, c7472Db09);
                g015.m2878c(str, AbstractC11641xC0.f45475b, c7472Db09);
                break;
            default:
                G01 g016 = (G01) obj;
                O90.m5968f(g016, "$this$function");
                g016.m2876a(str2, AbstractC11641xC0.f45474a);
                g016.m2878c(str, AbstractC11641xC0.f45475b, AbstractC11641xC0.f45476c);
                break;
        }
        return c8313Tf1;
    }
}

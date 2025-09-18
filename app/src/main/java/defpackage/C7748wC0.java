package defpackage;

/* renamed from: wC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7748wC0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7748wC0(String str, String str2, int i) {
        super(1);
        this.e = i;
        this.f = str;
        this.g = str2;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        String str = this.g;
        String str2 = this.f;
        switch (this.e) {
            case 0:
                G01 g01 = (G01) obj;
                O90.f(g01, "$this$function");
                C0258Db0 c0258Db0 = AbstractC7938xC0.b;
                g01.a(str2, c0258Db0);
                C0258Db0 c0258Db02 = AbstractC7938xC0.a;
                g01.a(str, c0258Db0, c0258Db0, c0258Db02, c0258Db02);
                g01.c(str2, c0258Db02);
                break;
            case 1:
                G01 g012 = (G01) obj;
                O90.f(g012, "$this$function");
                C0258Db0 c0258Db03 = AbstractC7938xC0.b;
                g012.a(str2, c0258Db03);
                g012.a(str, c0258Db03, c0258Db03, c0258Db03);
                g012.c(str2, c0258Db03);
                break;
            case 2:
                G01 g013 = (G01) obj;
                O90.f(g013, "$this$function");
                C0258Db0 c0258Db04 = AbstractC7938xC0.b;
                g013.a(str2, c0258Db04);
                C0258Db0 c0258Db05 = AbstractC7938xC0.a;
                g013.a(str, c0258Db04, c0258Db04, AbstractC7938xC0.c, c0258Db05);
                g013.c(str2, c0258Db05);
                break;
            case 3:
                G01 g014 = (G01) obj;
                O90.f(g014, "$this$function");
                C0258Db0 c0258Db06 = AbstractC7938xC0.b;
                g014.a(str2, c0258Db06);
                C0258Db0 c0258Db07 = AbstractC7938xC0.c;
                g014.a(str2, c0258Db07);
                C0258Db0 c0258Db08 = AbstractC7938xC0.a;
                g014.a(str, c0258Db06, c0258Db07, c0258Db07, c0258Db08);
                g014.c(str2, c0258Db08);
                break;
            case 4:
                G01 g015 = (G01) obj;
                O90.f(g015, "$this$function");
                C0258Db0 c0258Db09 = AbstractC7938xC0.c;
                g015.a(str2, c0258Db09);
                g015.c(str, AbstractC7938xC0.b, c0258Db09);
                break;
            default:
                G01 g016 = (G01) obj;
                O90.f(g016, "$this$function");
                g016.a(str2, AbstractC7938xC0.a);
                g016.c(str, AbstractC7938xC0.b, AbstractC7938xC0.c);
                break;
        }
        return c1518Tf1;
    }
}

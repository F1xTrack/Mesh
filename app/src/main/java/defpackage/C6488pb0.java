package defpackage;

import java.util.Map;

/* renamed from: pb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6488pb0 extends C1346Ra0 {
    public static final /* synthetic */ InterfaceC5927mf0[] g;
    public final C1688Vk0 f;

    static {
        IP0 ip0 = BP0.a;
        g = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C6488pb0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6488pb0(WO0 wo0, C6045nH c6045nH) {
        super(c6045nH, wo0, AbstractC6390p41.t);
        O90.f(wo0, "annotation");
        O90.f(c6045nH, "c");
        C1922Yk0 c1922Yk0 = (C1922Yk0) ((C4375ib0) c6045nH.b).a;
        C3881g1 c3881g1 = new C3881g1(27, this);
        c1922Yk0.getClass();
        this.f = new C1688Vk0(c1922Yk0, c3881g1);
    }

    @Override // defpackage.C1346Ra0, defpackage.InterfaceC7916x5
    public final Map g() {
        return (Map) WS1.b(this.f, g[0]);
    }
}

package p000;

import java.util.Map;

/* renamed from: Za0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8614Za0 extends C8198Ra0 {

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC10293mf0[] f14987g;

    /* renamed from: f */
    public final C8426Vk0 f14988f;

    static {
        IP0 ip0 = BP0.f799a;
        f14987g = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8614Za0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8614Za0(WO0 wo0, C6479nH c6479nH) {
        super(c6479nH, wo0, AbstractC10604p41.f39815m);
        O90.m5968f(c6479nH, "c");
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C1225TT c1225tt = C1225TT.f11385u;
        c8582Yk0.getClass();
        this.f14988f = new C8426Vk0(c8582Yk0, c1225tt);
    }

    @Override // p000.C8198Ra0, p000.InterfaceC7116x5
    /* renamed from: g */
    public final Map mo4961g() {
        return (Map) WS1.m8763b(this.f14988f, f14987g[0]);
    }
}

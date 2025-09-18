package p000;

import java.util.Map;

/* renamed from: jb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9901jb0 extends C8198Ra0 {

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC10293mf0[] f35262g;

    /* renamed from: f */
    public final C8426Vk0 f35263f;

    static {
        IP0 ip0 = BP0.f799a;
        f35262g = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C9901jb0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9901jb0(WO0 wo0, C6479nH c6479nH) {
        super(c6479nH, wo0, AbstractC10604p41.f39825w);
        O90.m5968f(wo0, "annotation");
        O90.m5968f(c6479nH, "c");
        C8582Yk0 c8582Yk0 = (C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a;
        C4090g1 c4090g1 = new C4090g1(26, this);
        c8582Yk0.getClass();
        this.f35263f = new C8426Vk0(c8582Yk0, c4090g1);
    }

    @Override // p000.C8198Ra0, p000.InterfaceC7116x5
    /* renamed from: g */
    public final Map mo4961g() {
        return (Map) WS1.m8763b(this.f35263f, f35262g[0]);
    }
}

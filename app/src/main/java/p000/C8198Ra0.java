package p000;

import java.util.Map;

/* renamed from: Ra0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8198Ra0 implements InterfaceC7116x5, InterfaceC10619pC0 {

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10293mf0[] f10312e;

    /* renamed from: a */
    public final C0664KX f10313a;

    /* renamed from: b */
    public final W21 f10314b;

    /* renamed from: c */
    public final C8426Vk0 f10315c;

    /* renamed from: d */
    public final InterfaceC8146Qa0 f10316d;

    static {
        IP0 ip0 = BP0.f799a;
        f10312e = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8198Ra0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public C8198Ra0(C6479nH c6479nH, WO0 wo0, C0664KX c0664kx) {
        O90.m5968f(c6479nH, "c");
        O90.m5968f(c0664kx, "fqName");
        this.f10313a = c0664kx;
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        this.f10314b = wo0 != null ? ((C10689pl0) c9773ib0.f29347j).m23868n(wo0) : W21.f12940O0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) c9773ib0.f29338a;
        C7053w5 c7053w5 = new C7053w5(c6479nH, 7, this);
        c8582Yk0.getClass();
        this.f10315c = new C8426Vk0(c8582Yk0, c7053w5);
        this.f10316d = wo0 != null ? (InterfaceC8146Qa0) AbstractC7167xu.m25956B(wo0.m8753b()) : null;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: e */
    public final W21 mo4959e() {
        return this.f10314b;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: f */
    public final C0664KX mo4960f() {
        return this.f10313a;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: g */
    public Map mo4961g() {
        return C0842NN.f7735a;
    }

    @Override // p000.InterfaceC7116x5
    public final AbstractC7742Ig0 getType() {
        return (X01) WS1.m8763b(this.f10315c, f10312e[0]);
    }
}

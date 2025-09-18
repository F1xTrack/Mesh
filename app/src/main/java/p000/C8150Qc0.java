package p000;

import java.util.Collection;

/* renamed from: Qc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8150Qc0 implements InterfaceC7102ws {

    /* renamed from: d */
    public static final C7356Av0 f9694d;

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10293mf0[] f9695e;

    /* renamed from: f */
    public static final C0664KX f9696f;

    /* renamed from: g */
    public static final C8340Tt0 f9697g;

    /* renamed from: h */
    public static final C0055As f9698h;

    /* renamed from: a */
    public final C7454Cs0 f9699a;

    /* renamed from: b */
    public final InterfaceC6497nZ f9700b;

    /* renamed from: c */
    public final C8426Vk0 f9701c;

    static {
        IP0 ip0 = BP0.f799a;
        f9695e = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8150Qc0.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f9694d = new C7356Av0(16);
        f9696f = AbstractC10732q41.f40588l;
        C0789MX c0789mx = AbstractC10604p41.f39804c;
        C8340Tt0 c8340Tt0M5392f = c0789mx.m5392f();
        O90.m5967e(c8340Tt0M5392f, "shortName(...)");
        f9697g = c8340Tt0M5392f;
        f9698h = C0055As.m358j(c0789mx.m5393g());
    }

    public C8150Qc0(C8582Yk0 c8582Yk0, C7454Cs0 c7454Cs0) {
        C6228jI c6228jI = C6228jI.f35027I;
        this.f9699a = c7454Cs0;
        this.f9700b = c6228jI;
        this.f9701c = new C8426Vk0(c8582Yk0, new C7053w5(this, 9, c8582Yk0));
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: a */
    public final InterfaceC6976us mo6737a(C0055As c0055As) {
        O90.m5968f(c0055As, "classId");
        if (c0055As.equals(f9698h)) {
            return (C7165xs) WS1.m8763b(this.f9701c, f9695e[0]);
        }
        return null;
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: b */
    public final Collection mo6738b(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "packageFqName");
        return c0664kx.equals(f9696f) ? AbstractC11433vZ0.m25454e((C7165xs) WS1.m8763b(this.f9701c, f9695e[0])) : C1156SN.f10705a;
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: c */
    public final boolean mo6739c(C0664KX c0664kx, C8340Tt0 c8340Tt0) {
        O90.m5968f(c0664kx, "packageFqName");
        O90.m5968f(c8340Tt0, "name");
        return c8340Tt0.equals(f9697g) && c0664kx.equals(f9696f);
    }
}

package p000;

import java.util.Map;

/* renamed from: Pj */
/* loaded from: classes2.dex */
public final class C0990Pj implements InterfaceC7116x5 {

    /* renamed from: a */
    public final AbstractC11955zg0 f9259a;

    /* renamed from: b */
    public final C0664KX f9260b;

    /* renamed from: c */
    public final Map f9261c;

    /* renamed from: d */
    public final Object f9262d;

    public C0990Pj(AbstractC11955zg0 abstractC11955zg0, C0664KX c0664kx, Map map) {
        O90.m5968f(abstractC11955zg0, "builtIns");
        O90.m5968f(c0664kx, "fqName");
        this.f9259a = abstractC11955zg0;
        this.f9260b = c0664kx;
        this.f9261c = map;
        this.f9262d = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C4090g1(6, this));
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: e */
    public final W21 mo4959e() {
        return W21.f12940O0;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: f */
    public final C0664KX mo4960f() {
        return this.f9260b;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: g */
    public final Map mo4961g() {
        return this.f9261c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC7116x5
    public final AbstractC7742Ig0 getType() {
        Object value = this.f9262d.getValue();
        O90.m5967e(value, "getValue(...)");
        return (AbstractC7742Ig0) value;
    }
}

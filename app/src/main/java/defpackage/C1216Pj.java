package defpackage;

import java.util.Map;

/* renamed from: Pj */
/* loaded from: classes2.dex */
public final class C1216Pj implements InterfaceC7916x5 {
    public final AbstractC8408zg0 a;
    public final KX b;
    public final Map c;
    public final Object d;

    public C1216Pj(AbstractC8408zg0 abstractC8408zg0, KX kx, Map map) {
        O90.f(abstractC8408zg0, "builtIns");
        O90.f(kx, "fqName");
        this.a = abstractC8408zg0;
        this.b = kx;
        this.c = map;
        this.d = LB.c(EnumC4205hi0.b, new C3881g1(6, this));
    }

    @Override // defpackage.InterfaceC7916x5
    public final W21 e() {
        return W21.O0;
    }

    @Override // defpackage.InterfaceC7916x5
    public final KX f() {
        return this.b;
    }

    @Override // defpackage.InterfaceC7916x5
    public final Map g() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC7916x5
    public final AbstractC0663Ig0 getType() {
        Object value = this.d.getValue();
        O90.e(value, "getValue(...)");
        return (AbstractC0663Ig0) value;
    }
}

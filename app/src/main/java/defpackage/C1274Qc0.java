package defpackage;

import java.util.Collection;

/* renamed from: Qc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1274Qc0 implements InterfaceC7873ws {
    public static final C0084Av0 d;
    public static final /* synthetic */ InterfaceC5927mf0[] e;
    public static final KX f;
    public static final C1559Tt0 g;
    public static final C0074As h;
    public final C0231Cs0 a;
    public final InterfaceC6099nZ b;
    public final C1688Vk0 c;

    static {
        IP0 ip0 = BP0.a;
        e = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1274Qc0.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new C0084Av0(16);
        f = AbstractC6581q41.l;
        MX mx = AbstractC6390p41.c;
        C1559Tt0 c1559Tt0F = mx.f();
        O90.e(c1559Tt0F, "shortName(...)");
        g = c1559Tt0F;
        h = C0074As.j(mx.g());
    }

    public C1274Qc0(C1922Yk0 c1922Yk0, C0231Cs0 c0231Cs0) {
        C5284jI c5284jI = C5284jI.I;
        this.a = c0231Cs0;
        this.b = c5284jI;
        this.c = new C1688Vk0(c1922Yk0, new C7726w5(this, 9, c1922Yk0));
    }

    @Override // defpackage.InterfaceC7873ws
    public final InterfaceC7492us a(C0074As c0074As) {
        O90.f(c0074As, "classId");
        if (c0074As.equals(h)) {
            return (C8063xs) WS1.b(this.c, e[0]);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7873ws
    public final Collection b(KX kx) {
        O90.f(kx, "packageFqName");
        return kx.equals(f) ? AbstractC7627vZ0.e((C8063xs) WS1.b(this.c, e[0])) : SN.a;
    }

    @Override // defpackage.InterfaceC7873ws
    public final boolean c(KX kx, C1559Tt0 c1559Tt0) {
        O90.f(kx, "packageFqName");
        O90.f(c1559Tt0, "name");
        return c1559Tt0.equals(g) && kx.equals(f);
    }
}

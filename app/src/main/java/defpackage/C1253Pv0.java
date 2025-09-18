package defpackage;

import java.util.List;

/* renamed from: Pv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1253Pv0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ T71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1253Pv0(T71 t71, int i) {
        super(1);
        this.e = i;
        this.f = t71;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        InterfaceC0386Es interfaceC0386EsB;
        switch (this.e) {
            case 0:
                C1097Nv0 c1097Nv0 = (C1097Nv0) obj;
                O90.f(c1097Nv0, "<name for destructuring parameter 0>");
                C0074As c0074As = c1097Nv0.a;
                if (c0074As.c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c0074As);
                }
                C0074As c0074AsF = c0074As.f();
                List list = c1097Nv0.b;
                T71 t71 = this.f;
                if (c0074AsF != null) {
                    interfaceC0386EsB = t71.B(c0074AsF, AbstractC8069xu.w(list));
                } else {
                    C1454Sk0 c1454Sk0 = (C1454Sk0) t71.c;
                    KX kxG = c0074As.g();
                    O90.e(kxG, "getPackageFqName(...)");
                    interfaceC0386EsB = (InterfaceC0386Es) c1454Sk0.invoke(kxG);
                }
                InterfaceC0386Es interfaceC0386Es = interfaceC0386EsB;
                boolean z = !c0074As.b.e().d();
                Z41 z41 = (Z41) t71.a;
                C1559Tt0 c1559Tt0I = c0074As.i();
                O90.e(c1559Tt0I, "getShortClassName(...)");
                Integer num = (Integer) AbstractC8069xu.C(list);
                return new C1175Ov0(z41, interfaceC0386Es, c1559Tt0I, z, num != null ? num.intValue() : 0);
            default:
                KX kx = (KX) obj;
                O90.f(kx, "fqName");
                return new ON((InterfaceC0153Bs0) this.f.b, kx, 0);
        }
    }
}

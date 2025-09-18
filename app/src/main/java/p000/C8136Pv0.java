package p000;

import java.util.List;

/* renamed from: Pv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8136Pv0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f9358e;

    /* renamed from: f */
    public final /* synthetic */ T71 f9359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8136Pv0(T71 t71, int i) {
        super(1);
        this.f9358e = i;
        this.f9359f = t71;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        InterfaceC0307Es interfaceC0307EsM7556B;
        switch (this.f9358e) {
            case 0:
                C8032Nv0 c8032Nv0 = (C8032Nv0) obj;
                O90.m5968f(c8032Nv0, "<name for destructuring parameter 0>");
                C0055As c0055As = c8032Nv0.f8128a;
                if (c0055As.f453c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c0055As);
                }
                C0055As c0055AsM362f = c0055As.m362f();
                List list = c8032Nv0.f8129b;
                T71 t71 = this.f9359f;
                if (c0055AsM362f != null) {
                    interfaceC0307EsM7556B = t71.m7556B(c0055AsM362f, AbstractC7167xu.m25995w(list));
                } else {
                    C8270Sk0 c8270Sk0 = (C8270Sk0) t71.f11175c;
                    C0664KX c0664kxM363g = c0055As.m363g();
                    O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
                    interfaceC0307EsM7556B = (InterfaceC0307Es) c8270Sk0.invoke(c0664kxM363g);
                }
                InterfaceC0307Es interfaceC0307Es = interfaceC0307EsM7556B;
                boolean z = !c0055As.f452b.m4657e().m4656d();
                Z41 z41 = (Z41) t71.f11173a;
                C8340Tt0 c8340Tt0M365i = c0055As.m365i();
                O90.m5967e(c8340Tt0M365i, "getShortClassName(...)");
                Integer num = (Integer) AbstractC7167xu.m25957C(list);
                return new C8084Ov0(z41, interfaceC0307Es, c8340Tt0M365i, z, num != null ? num.intValue() : 0);
            default:
                C0664KX c0664kx = (C0664KX) obj;
                O90.m5968f(c0664kx, "fqName");
                return new C0905ON((InterfaceC7402Bs0) this.f9359f.f11174b, c0664kx, 0);
        }
    }
}

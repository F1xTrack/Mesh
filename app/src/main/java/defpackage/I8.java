package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public class I8 extends AbstractC0323Dx {
    public final AbstractC1676Vg0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public I8(List list, InterfaceC6099nZ interfaceC6099nZ) {
        super(list);
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Vg0, nZ] */
    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        InterfaceC1087Ns interfaceC1087NsA;
        O90.f(interfaceC0153Bs0, "module");
        AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) this.b.invoke(interfaceC0153Bs0);
        if (!AbstractC8408zg0.y(abstractC0663Ig0) && (((interfaceC1087NsA = abstractC0663Ig0.E().a()) == null || AbstractC8408zg0.r(interfaceC1087NsA) == null) && !AbstractC8408zg0.B(abstractC0663Ig0, AbstractC6390p41.V.i()) && !AbstractC8408zg0.B(abstractC0663Ig0, AbstractC6390p41.W.i()) && !AbstractC8408zg0.B(abstractC0663Ig0, AbstractC6390p41.X.i()))) {
            AbstractC8408zg0.B(abstractC0663Ig0, AbstractC6390p41.Y.i());
        }
        return abstractC0663Ig0;
    }
}

package defpackage;

import java.util.List;

/* renamed from: dq0 */
/* loaded from: classes2.dex */
public final class C3465dq0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ C4038gq0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ C6613qF0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3465dq0(C4038gq0 c4038gq0, boolean z, C6613qF0 c6613qF0) {
        super(0);
        this.e = c4038gq0;
        this.f = z;
        this.g = c6613qF0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        List listB0;
        C4038gq0 c4038gq0 = this.e;
        AbstractC0447Fm0 abstractC0447Fm0A = c4038gq0.a((CD) c4038gq0.a.e);
        if (abstractC0447Fm0A != null) {
            C1666Vd c1666Vd = c4038gq0.a;
            boolean z = this.f;
            C6613qF0 c6613qF0 = this.g;
            listB0 = z ? AbstractC8069xu.b0(((C7955xI) c1666Vd.c).e.i(abstractC0447Fm0A, c6613qF0)) : AbstractC8069xu.b0(((C7955xI) c1666Vd.c).e.b(abstractC0447Fm0A, c6613qF0));
        } else {
            listB0 = null;
        }
        return listB0 == null ? MN.a : listB0;
    }
}

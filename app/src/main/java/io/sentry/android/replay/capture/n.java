package io.sentry.android.replay.capture;

import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class n extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(1);
        this.e = i;
        this.f = oVar;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                k kVar = (k) obj;
                O90.f(kVar, "segment");
                if (kVar instanceof i) {
                    i iVar = (i) kVar;
                    o oVar = this.f;
                    i.a(iVar, oVar.t);
                    oVar.l(oVar.j() + 1);
                    oVar.n(iVar.a.u);
                }
                break;
            default:
                k kVar2 = (k) obj;
                O90.f(kVar2, "segment");
                if (kVar2 instanceof i) {
                    o oVar2 = this.f;
                    i.a((i) kVar2, oVar2.t);
                    oVar2.l(oVar2.j() + 1);
                }
                break;
        }
        return C1518Tf1.a;
    }
}

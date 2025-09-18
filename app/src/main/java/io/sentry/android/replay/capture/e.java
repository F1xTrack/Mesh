package io.sentry.android.replay.capture;

import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class e extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i) {
        super(1);
        this.e = i;
        this.f = fVar;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                k kVar = (k) obj;
                O90.f(kVar, "segment");
                if (kVar instanceof i) {
                    f fVar = this.f;
                    fVar.w.add(kVar);
                    fVar.l(fVar.j() + 1);
                }
                break;
            default:
                k kVar2 = (k) obj;
                O90.f(kVar2, "segment");
                if (kVar2 instanceof i) {
                    f fVar2 = this.f;
                    fVar2.w.add(kVar2);
                    fVar2.l(fVar2.j() + 1);
                }
                break;
        }
        return C1518Tf1.a;
    }
}

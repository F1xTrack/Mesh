package defpackage;

import java.util.ArrayList;

/* renamed from: lj1 */
/* loaded from: classes.dex */
public final class C5749lj1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5217ix0 f;
    public final /* synthetic */ C7467uj1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5749lj1(C5217ix0 c5217ix0, C7467uj1 c7467uj1, int i) {
        super(1);
        this.e = i;
        this.f = c5217ix0;
        this.g = c7467uj1;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                this.f.d(SP.x, new C5558kj1(this.g, (ArrayList) obj, 0));
                break;
            case 1:
                this.f.d(SP.y, new C5558kj1(this.g, (ArrayList) obj, 1));
                break;
            default:
                this.f.d(SP.A, new C5558kj1(this.g, (ArrayList) obj, 2));
                break;
        }
        return C1518Tf1.a;
    }
}

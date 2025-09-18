package p000;

import java.util.ArrayList;

/* renamed from: lj1 */
/* loaded from: classes.dex */
public final class C10174lj1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f37273e;

    /* renamed from: f */
    public final /* synthetic */ C9817ix0 f37274f;

    /* renamed from: g */
    public final /* synthetic */ C11326uj1 f37275g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10174lj1(C9817ix0 c9817ix0, C11326uj1 c11326uj1, int i) {
        super(1);
        this.f37273e = i;
        this.f37274f = c9817ix0;
        this.f37275g = c11326uj1;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f37273e) {
            case 0:
                this.f37274f.m21947d(EnumC1158SP.f10740x, new C10046kj1(this.f37275g, (ArrayList) obj, 0));
                break;
            case 1:
                this.f37274f.m21947d(EnumC1158SP.f10741y, new C10046kj1(this.f37275g, (ArrayList) obj, 1));
                break;
            default:
                this.f37274f.m21947d(EnumC1158SP.f10715A, new C10046kj1(this.f37275g, (ArrayList) obj, 2));
                break;
        }
        return C8313Tf1.f11463a;
    }
}

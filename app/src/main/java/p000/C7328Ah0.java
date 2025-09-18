package p000;

/* renamed from: Ah0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7328Ah0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f333e;

    /* renamed from: f */
    public final /* synthetic */ C7484Dh0 f334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7328Ah0(C7484Dh0 c7484Dh0, int i) {
        super(1);
        this.f333e = i;
        this.f334f = c7484Dh0;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f333e) {
            case 0:
                C8340Tt0 c8340Tt0 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt0, "it");
                return C7484Dh0.m1759v(this.f334f, c8340Tt0);
            default:
                C8340Tt0 c8340Tt02 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt02, "it");
                return C7484Dh0.m1760w(this.f334f, c8340Tt02);
        }
    }
}

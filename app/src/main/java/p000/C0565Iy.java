package p000;

/* renamed from: Iy */
/* loaded from: classes2.dex */
public final class C0565Iy extends AbstractC1259U0 implements QN0 {

    /* renamed from: c */
    public final /* synthetic */ int f5232c = 0;

    /* renamed from: d */
    public final C8340Tt0 f5233d;

    /* renamed from: e */
    public final InterfaceC0266ED f5234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0565Iy(InterfaceC7032vl interfaceC7032vl, AbstractC7742Ig0 abstractC7742Ig0, C8340Tt0 c8340Tt0) {
        super(abstractC7742Ig0);
        O90.m5968f(abstractC7742Ig0, "receiverType");
        this.f5234e = (AbstractC0329FD) interfaceC7032vl;
        this.f5233d = c8340Tt0;
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        switch (this.f5232c) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC6976us) this.f5234e) + " }";
            default:
                return "Cxt { " + ((AbstractC0329FD) this.f5234e) + " }";
        }
    }

    /* renamed from: w1 */
    public final C8340Tt0 m4089w1() {
        switch (this.f5232c) {
        }
        return this.f5233d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565Iy(InterfaceC6976us interfaceC6976us, AbstractC7742Ig0 abstractC7742Ig0, C8340Tt0 c8340Tt0) {
        super(abstractC7742Ig0);
        O90.m5968f(abstractC7742Ig0, "receiverType");
        this.f5234e = interfaceC6976us;
        this.f5233d = c8340Tt0;
    }
}

package p000;

/* renamed from: h11 */
/* loaded from: classes2.dex */
public final class C9571h11 extends AbstractC8926c11 {

    /* renamed from: a */
    public final /* synthetic */ int f28165a = 2;

    /* renamed from: b */
    public final AbstractC8926c11 f28166b;

    /* renamed from: c */
    public final Object f28167c;

    public C9571h11(AbstractC8926c11 abstractC8926c11, InterfaceC0021AK interfaceC0021AK) {
        O90.m5968f(interfaceC0021AK, "dispatcher");
        this.f28166b = abstractC8926c11;
        this.f28167c = interfaceC0021AK;
    }

    @Override // p000.AbstractC8926c11
    /* renamed from: a */
    public final void mo10562a(InterfaceC10467o11 interfaceC10467o11) {
        switch (this.f28165a) {
            case 0:
                ((C9571h11) this.f28166b).mo10562a(new C9443g11(interfaceC10467o11, this));
                break;
            case 1:
                ((C9571h11) this.f28166b).mo10562a(new C9443g11(interfaceC10467o11, this, (byte) 0));
                break;
            default:
                ((InterfaceC0021AK) this.f28167c).mo155a(new C7053w5(this, 24, interfaceC10467o11));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9571h11(C9571h11 c9571h11, InterfaceC6434mZ interfaceC6434mZ) {
        this.f28166b = c9571h11;
        this.f28167c = (AbstractC8418Vg0) interfaceC6434mZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9571h11(C9571h11 c9571h11, InterfaceC6497nZ interfaceC6497nZ) {
        this.f28166b = c9571h11;
        this.f28167c = (AbstractC8418Vg0) interfaceC6497nZ;
    }
}

package p000;

/* renamed from: i11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9699i11 extends AbstractC8926c11 {

    /* renamed from: a */
    public final /* synthetic */ int f28759a;

    /* renamed from: b */
    public final AbstractC8926c11 f28760b;

    /* renamed from: c */
    public final AbstractC8418Vg0 f28761c;

    /* JADX WARN: Multi-variable type inference failed */
    public C9699i11(AbstractC8926c11 abstractC8926c11, InterfaceC6497nZ interfaceC6497nZ, int i) {
        this.f28759a = i;
        switch (i) {
            case 1:
                this.f28760b = abstractC8926c11;
                this.f28761c = (AbstractC8418Vg0) interfaceC6497nZ;
                break;
            case 2:
                this.f28760b = abstractC8926c11;
                this.f28761c = (AbstractC8418Vg0) interfaceC6497nZ;
                break;
            case 3:
                this.f28760b = abstractC8926c11;
                this.f28761c = (AbstractC8418Vg0) interfaceC6497nZ;
                break;
            default:
                this.f28760b = abstractC8926c11;
                this.f28761c = (AbstractC8418Vg0) interfaceC6497nZ;
                break;
        }
    }

    @Override // p000.AbstractC8926c11
    /* renamed from: a */
    public final void mo10562a(InterfaceC10467o11 interfaceC10467o11) {
        switch (this.f28759a) {
            case 0:
                this.f28760b.mo10562a(new C0827N8(interfaceC10467o11, 21, this));
                break;
            case 1:
                this.f28760b.mo10562a(new C10211m11(interfaceC10467o11, this));
                break;
            case 2:
                this.f28760b.mo10562a(new C1339VH(interfaceC10467o11, this, false, 21));
                break;
            default:
                this.f28760b.mo10562a(new CC0(interfaceC10467o11, 26, this));
                break;
        }
    }
}

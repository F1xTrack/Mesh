package defpackage;

/* renamed from: i11, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4265i11 extends AbstractC2435c11 {
    public final /* synthetic */ int a;
    public final AbstractC2435c11 b;
    public final AbstractC1676Vg0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4265i11(AbstractC2435c11 abstractC2435c11, InterfaceC6099nZ interfaceC6099nZ, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = abstractC2435c11;
                this.c = (AbstractC1676Vg0) interfaceC6099nZ;
                break;
            case 2:
                this.b = abstractC2435c11;
                this.c = (AbstractC1676Vg0) interfaceC6099nZ;
                break;
            case 3:
                this.b = abstractC2435c11;
                this.c = (AbstractC1676Vg0) interfaceC6099nZ;
                break;
            default:
                this.b = abstractC2435c11;
                this.c = (AbstractC1676Vg0) interfaceC6099nZ;
                break;
        }
    }

    @Override // defpackage.AbstractC2435c11
    public final void a(InterfaceC6187o11 interfaceC6187o11) {
        switch (this.a) {
            case 0:
                this.b.a(new N8(interfaceC6187o11, 21, this));
                break;
            case 1:
                this.b.a(new C5805m11(interfaceC6187o11, this));
                break;
            case 2:
                this.b.a(new VH(interfaceC6187o11, this, false, 21));
                break;
            default:
                this.b.a(new CC0(interfaceC6187o11, 26, this));
                break;
        }
    }
}

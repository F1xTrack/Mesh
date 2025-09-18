package p000;

/* renamed from: dG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9091dG0 implements InterfaceC8265Sh1 {

    /* renamed from: a */
    public final /* synthetic */ int f25916a;

    /* renamed from: b */
    public boolean f25917b = false;

    /* renamed from: c */
    public boolean f25918c = false;

    /* renamed from: d */
    public C1849cT f25919d;

    /* renamed from: e */
    public final InterfaceC8554Xw0 f25920e;

    public /* synthetic */ C9091dG0(InterfaceC8554Xw0 interfaceC8554Xw0, int i) {
        this.f25916a = i;
        this.f25920e = interfaceC8554Xw0;
    }

    @Override // p000.InterfaceC8265Sh1
    public final InterfaceC8265Sh1 add(boolean z) {
        switch (this.f25916a) {
            case 0:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C8958cG0) this.f25920e).m10632g(this.f25919d, z ? 1 : 0, this.f25918c);
                return this;
            case 1:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C9054cz1) this.f25920e).m17448h(this.f25919d, z ? 1 : 0, this.f25918c);
                return this;
            default:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C11272uI1) this.f25920e).m25162h(this.f25919d, z ? 1 : 0, this.f25918c);
                return this;
        }
    }

    @Override // p000.InterfaceC8265Sh1
    /* renamed from: b */
    public final InterfaceC8265Sh1 mo4360b(String str) {
        switch (this.f25916a) {
            case 0:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C8958cG0) this.f25920e).m10633h(this.f25919d, str, this.f25918c);
                return this;
            case 1:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C9054cz1) this.f25920e).m17447g(this.f25919d, str, this.f25918c);
                return this;
            default:
                if (this.f25917b) {
                    throw new C7198yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f25917b = true;
                ((C11272uI1) this.f25920e).m25161g(this.f25919d, str, this.f25918c);
                return this;
        }
    }
}

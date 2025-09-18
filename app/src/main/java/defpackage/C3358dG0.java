package defpackage;

/* renamed from: dG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3358dG0 implements InterfaceC1446Sh1 {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public C2520cT d;
    public final InterfaceC1880Xw0 e;

    public /* synthetic */ C3358dG0(InterfaceC1880Xw0 interfaceC1880Xw0, int i) {
        this.a = i;
        this.e = interfaceC1880Xw0;
    }

    @Override // defpackage.InterfaceC1446Sh1
    public final InterfaceC1446Sh1 add(boolean z) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C2482cG0) this.e).g(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C3303cz1) this.e).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C7386uI1) this.e).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }

    @Override // defpackage.InterfaceC1446Sh1
    public final InterfaceC1446Sh1 b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C2482cG0) this.e).h(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C3303cz1) this.e).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new C8163yO("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((C7386uI1) this.e).g(this.d, str, this.c);
                return this;
        }
    }
}

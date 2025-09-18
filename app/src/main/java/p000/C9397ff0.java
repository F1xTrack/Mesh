package p000;

/* renamed from: ff0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9397ff0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f27309e;

    /* renamed from: f */
    public final /* synthetic */ C9525gf0 f27310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9397ff0(C9525gf0 c9525gf0, int i) {
        super(0);
        this.f27309e = i;
        this.f27310f = c9525gf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f27309e) {
            case 0:
                return new C9269ef0(this.f27310f);
            default:
                return this.f27310f.m24957t();
        }
    }
}

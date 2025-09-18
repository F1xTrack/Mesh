package defpackage;

/* renamed from: Je0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0735Je0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1124Oe0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0735Je0(C1124Oe0 c1124Oe0, int i) {
        super(0);
        this.e = i;
        this.f = c1124Oe0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return AbstractC7407uP1.a(this.f.b);
            default:
                return new C0968Me0(this.f);
        }
    }
}

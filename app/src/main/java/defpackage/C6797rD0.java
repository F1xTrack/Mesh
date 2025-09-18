package defpackage;

/* renamed from: rD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6797rD0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ EnumC6988sD0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6797rD0(EnumC6988sD0 enumC6988sD0, int i) {
        super(0);
        this.e = i;
        this.f = enumC6988sD0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return AbstractC6581q41.l.c(this.f.b);
            default:
                return AbstractC6581q41.l.c(this.f.a);
        }
    }
}

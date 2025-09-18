package p000;

/* renamed from: Je0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7790Je0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f5659e;

    /* renamed from: f */
    public final /* synthetic */ C8050Oe0 f5660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7790Je0(C8050Oe0 c8050Oe0, int i) {
        super(0);
        this.f5659e = i;
        this.f5660f = c8050Oe0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f5659e) {
            case 0:
                return AbstractC11286uP1.m25185a(this.f5660f.f8553b);
            default:
                return new C7946Me0(this.f5660f);
        }
    }
}

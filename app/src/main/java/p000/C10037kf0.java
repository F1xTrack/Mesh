package p000;

/* renamed from: kf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10037kf0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f36592e;

    /* renamed from: f */
    public final /* synthetic */ C10165lf0 f36593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10037kf0(C10165lf0 c10165lf0, int i) {
        super(0);
        this.f36592e = i;
        this.f36593f = c10165lf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f36592e) {
            case 0:
                return new C9909jf0(this.f36593f);
            default:
                return this.f36593f.m24957t();
        }
    }
}

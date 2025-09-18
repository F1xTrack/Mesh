package p000;

/* renamed from: of0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10549of0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f39151e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC10677pf0 f39152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10549of0(AbstractC10677pf0 abstractC10677pf0, int i) {
        super(0);
        this.f39151e = i;
        this.f39152f = abstractC10677pf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f39151e) {
            case 0:
                return W22.m8653a(this.f39152f, true);
            default:
                AbstractC10677pf0 abstractC10677pf0 = this.f39152f;
                FE0 fe0Mo1121c = abstractC10677pf0.mo1740u().mo8094p().mo1121c();
                return fe0Mo1121c == null ? EZ1.m2343c(abstractC10677pf0.mo1740u().mo8094p(), S20.f10539b) : fe0Mo1121c;
        }
    }
}

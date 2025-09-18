package defpackage;

/* renamed from: qf0 */
/* loaded from: classes2.dex */
public final class C6691qf0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC6881rf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6691qf0(AbstractC6881rf0 abstractC6881rf0, int i) {
        super(0);
        this.e = i;
        this.f = abstractC6881rf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return W22.a(this.f, false);
            default:
                AbstractC6881rf0 abstractC6881rf0 = this.f;
                JE0 je0D = abstractC6881rf0.u().p().d();
                return je0D == null ? EZ1.d(abstractC6881rf0.u().p(), S20.b) : je0D;
        }
    }
}

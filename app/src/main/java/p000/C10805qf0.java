package p000;

/* renamed from: qf0 */
/* loaded from: classes2.dex */
public final class C10805qf0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f41094e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC10933rf0 f41095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10805qf0(AbstractC10933rf0 abstractC10933rf0, int i) {
        super(0);
        this.f41094e = i;
        this.f41095f = abstractC10933rf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f41094e) {
            case 0:
                return W22.m8653a(this.f41095f, false);
            default:
                AbstractC10933rf0 abstractC10933rf0 = this.f41095f;
                JE0 je0Mo1122d = abstractC10933rf0.mo1740u().mo8094p().mo1122d();
                return je0Mo1122d == null ? EZ1.m2344d(abstractC10933rf0.mo1740u().mo8094p(), S20.f10539b) : je0Mo1122d;
        }
    }
}

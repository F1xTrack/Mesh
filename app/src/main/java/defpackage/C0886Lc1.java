package defpackage;

/* renamed from: Lc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886Lc1 extends AbstractC0496Gc1 {
    public final /* synthetic */ int a = 1;
    public AbstractC0418Fc1 b;

    public /* synthetic */ C0886Lc1() {
    }

    @Override // defpackage.AbstractC0496Gc1, defpackage.InterfaceC0340Ec1
    public void a(AbstractC0418Fc1 abstractC0418Fc1) {
        switch (this.a) {
            case 1:
                C0963Mc1 c0963Mc1 = (C0963Mc1) this.b;
                if (!c0963Mc1.E) {
                    c0963Mc1.J();
                    c0963Mc1.E = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        switch (this.a) {
            case 0:
                this.b.C();
                abstractC0418Fc1.z(this);
                break;
            default:
                C0963Mc1 c0963Mc1 = (C0963Mc1) this.b;
                int i = c0963Mc1.D - 1;
                c0963Mc1.D = i;
                if (i == 0) {
                    c0963Mc1.E = false;
                    c0963Mc1.o();
                }
                abstractC0418Fc1.z(this);
                break;
        }
    }

    public C0886Lc1(AbstractC0418Fc1 abstractC0418Fc1) {
        this.b = abstractC0418Fc1;
    }
}

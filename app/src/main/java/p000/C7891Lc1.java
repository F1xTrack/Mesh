package p000;

/* renamed from: Lc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7891Lc1 extends AbstractC7631Gc1 {

    /* renamed from: a */
    public final /* synthetic */ int f6770a = 1;

    /* renamed from: b */
    public AbstractC7579Fc1 f6771b;

    public /* synthetic */ C7891Lc1() {
    }

    @Override // p000.AbstractC7631Gc1, p000.InterfaceC7527Ec1
    /* renamed from: a */
    public void mo2334a(AbstractC7579Fc1 abstractC7579Fc1) {
        switch (this.f6770a) {
            case 1:
                C7943Mc1 c7943Mc1 = (C7943Mc1) this.f6771b;
                if (!c7943Mc1.f7272E) {
                    c7943Mc1.m2692J();
                    c7943Mc1.f7272E = true;
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC7527Ec1
    /* renamed from: c */
    public final void mo2336c(AbstractC7579Fc1 abstractC7579Fc1) {
        switch (this.f6770a) {
            case 0:
                this.f6771b.mo2685C();
                abstractC7579Fc1.mo2715z(this);
                break;
            default:
                C7943Mc1 c7943Mc1 = (C7943Mc1) this.f6771b;
                int i = c7943Mc1.f7271D - 1;
                c7943Mc1.f7271D = i;
                if (i == 0) {
                    c7943Mc1.f7272E = false;
                    c7943Mc1.m2706o();
                }
                abstractC7579Fc1.mo2715z(this);
                break;
        }
    }

    public C7891Lc1(AbstractC7579Fc1 abstractC7579Fc1) {
        this.f6771b = abstractC7579Fc1;
    }
}

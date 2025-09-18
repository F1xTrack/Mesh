package p000;

/* renamed from: Rv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8240Rv0 extends AbstractC0585JH {

    /* renamed from: c */
    public final /* synthetic */ int f10482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8240Rv0(X01 x01, int i) {
        super(x01);
        this.f10482c = i;
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        switch (this.f10482c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        switch (this.f10482c) {
            case 0:
                return new C8240Rv0(x01, 0);
            default:
                return new C8240Rv0(x01, 1);
        }
    }
}

package p000;

import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: Th1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8317Th1 extends AbstractC9803iq0 {

    /* renamed from: c */
    public final /* synthetic */ int f11468c = 1;

    /* renamed from: d */
    public final int f11469d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8317Th1(int i) {
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "must have at least ", " value parameter");
        sbM26237n.append(i > 1 ? UcumUtils.UCUM_SECONDS : "");
        super(sbM26237n.toString(), 1);
        this.f11469d = i;
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: a */
    public final boolean mo7727a(C9261eb0 c9261eb0) {
        switch (this.f11468c) {
            case 0:
                if (c9261eb0.mo1221f0().size() >= this.f11469d) {
                }
                break;
            default:
                if (c9261eb0.mo1221f0().size() == this.f11469d) {
                }
                break;
        }
        return false;
    }

    public C8317Th1() {
        super("must have exactly 2 value parameters", 1);
        this.f11469d = 2;
    }
}

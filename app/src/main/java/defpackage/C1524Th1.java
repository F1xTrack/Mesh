package defpackage;

import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: Th1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1524Th1 extends AbstractC5197iq0 {
    public final /* synthetic */ int c = 1;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1524Th1(int i) {
        StringBuilder sbN = AbstractC8235ym.n(i, "must have at least ", " value parameter");
        sbN.append(i > 1 ? UcumUtils.UCUM_SECONDS : "");
        super(sbN.toString(), 1);
        this.d = i;
    }

    @Override // defpackage.InterfaceC8440zr
    public final boolean a(C3611eb0 c3611eb0) {
        switch (this.c) {
            case 0:
                if (c3611eb0.f0().size() >= this.d) {
                }
                break;
            default:
                if (c3611eb0.f0().size() == this.d) {
                }
                break;
        }
        return false;
    }

    public C1524Th1() {
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }
}

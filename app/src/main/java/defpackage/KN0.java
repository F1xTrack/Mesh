package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class KN0 extends P81 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ MN0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN0(String str, MN0 mn0) {
        super(str, true);
        this.f = mn0;
    }

    @Override // defpackage.P81
    public final long a() {
        switch (this.e) {
            case 0:
                MN0 mn0 = this.f;
                try {
                    if (mn0.j()) {
                    }
                } catch (IOException e) {
                    mn0.c(e, null);
                    break;
                }
                break;
            default:
                DN0 dn0 = this.f.g;
                O90.c(dn0);
                dn0.e();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN0(MN0 mn0) {
        super(AbstractC1705Vq.l(new StringBuilder(), mn0.l, " writer"), true);
        this.f = mn0;
    }
}

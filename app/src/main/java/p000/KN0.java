package p000;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class KN0 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ int f6037e = 0;

    /* renamed from: f */
    public final /* synthetic */ MN0 f6038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN0(String str, MN0 mn0) {
        super(str, true);
        this.f6038f = mn0;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() {
        switch (this.f6037e) {
            case 0:
                MN0 mn0 = this.f6038f;
                try {
                    if (mn0.m5358j()) {
                    }
                } catch (IOException e) {
                    mn0.m5351c(e, null);
                    break;
                }
                break;
            default:
                DN0 dn0 = this.f6038f.f7125g;
                O90.m5965c(dn0);
                dn0.m1668e();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN0(MN0 mn0) {
        super(AbstractC1374Vq.m8593l(new StringBuilder(), mn0.f7130l, " writer"), true);
        this.f6038f = mn0;
    }
}

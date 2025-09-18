package p000;

/* renamed from: lG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10116lG1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36993a;

    /* renamed from: b */
    public final /* synthetic */ long f36994b;

    /* renamed from: c */
    public final /* synthetic */ TJ1 f36995c;

    public /* synthetic */ RunnableC10116lG1(TJ1 tj1, long j, int i) {
        this.f36993a = i;
        this.f36994b = j;
        this.f36995c = tj1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36993a) {
            case 0:
                ((C7933Lx1) this.f36995c).m5164D1(this.f36994b);
                break;
            default:
                JU1 ju1 = (JU1) this.f36995c;
                C7933Lx1 c7933Lx1 = ((C9110dP1) ju1.f11615b).f26047q;
                C9110dP1.m17591d(c7933Lx1);
                c7933Lx1.m5166z1(this.f36994b);
                ju1.f5549f = null;
                break;
        }
    }
}

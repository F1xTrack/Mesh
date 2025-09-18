package p000;

import android.os.Handler;
import java.util.Objects;

/* renamed from: vH */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7002vH implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44314a;

    /* renamed from: b */
    public final /* synthetic */ C7065wH f44315b;

    public /* synthetic */ RunnableC7002vH(C7065wH c7065wH, int i) {
        this.f44314a = i;
        this.f44315b = c7065wH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44314a) {
            case 0:
                C7065wH.m25583a(this.f44315b);
                return;
            default:
                C7065wH c7065wH = this.f44315b;
                if (c7065wH.f44751g != 0) {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    Objects.toString(c7065wH.f44747c);
                    c1210teM7634G.getClass();
                    return;
                }
                c7065wH.f44751g = 1;
                C1210TE c1210teM7634G2 = C1210TE.m7634G();
                Objects.toString(c7065wH.f44747c);
                c1210teM7634G2.getClass();
                if (!c7065wH.f44748d.f6504d.m6265j(c7065wH.f44756l, null)) {
                    c7065wH.m25584b();
                    return;
                }
                C8773ap1 c8773ap1 = c7065wH.f44748d.f6503c;
                C7551Eo1 c7551Eo1 = c7065wH.f44747c;
                synchronized (c8773ap1.f16611d) {
                    C1210TE c1210teM7634G3 = C1210TE.m7634G();
                    Objects.toString(c7551Eo1);
                    c1210teM7634G3.getClass();
                    c8773ap1.m10341a(c7551Eo1);
                    RunnableC8643Zo1 runnableC8643Zo1 = new RunnableC8643Zo1(c8773ap1, c7551Eo1);
                    c8773ap1.f16609b.put(c7551Eo1, runnableC8643Zo1);
                    c8773ap1.f16610c.put(c7551Eo1, c7065wH);
                    ((Handler) c8773ap1.f16608a.f11590b).postDelayed(runnableC8643Zo1, 600000L);
                }
                return;
        }
    }
}

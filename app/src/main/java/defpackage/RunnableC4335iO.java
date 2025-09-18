package defpackage;

import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

/* renamed from: iO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4335iO implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7020sO b;

    public /* synthetic */ RunnableC4335iO(C7020sO c7020sO, int i) {
        this.a = i;
        this.b = c7020sO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C7020sO c7020sO = this.b;
                AbstractC1500Sz1.a(c7020sO.a(), new C0481Fx1(c7020sO), c7020sO.h);
                return;
            case 1:
                C7020sO c7020sO2 = this.b;
                c7020sO2.h.execute(new RunnableC4335iO(c7020sO2, 2));
                return;
            case 2:
                C7020sO c7020sO3 = this.b;
                if (c7020sO3.v) {
                    AbstractC0759Jm0.f(c7020sO3.a);
                    c7020sO3.w = null;
                    c7020sO3.j();
                    c7020sO3.v = false;
                    return;
                }
                return;
            case 3:
                C7020sO c7020sO4 = this.b;
                int iX = AbstractC8235ym.x(c7020sO4.D);
                if (iX == 1) {
                    c7020sO4.g();
                    return;
                } else {
                    if (iX == 6 || iX == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                C7020sO c7020sO5 = this.b;
                switch (AbstractC8235ym.x(c7020sO5.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c7020sO5.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        c7020sO5.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO5.D)));
                }
            case 5:
                C7020sO c7020sO6 = this.b;
                c7020sO6.A = true;
                if (c7020sO6.z) {
                    c7020sO6.e.stop();
                    c7020sO6.h();
                    return;
                }
                return;
            default:
                C7020sO c7020sO7 = this.b;
                AbstractC0759Jm0.f("Recorder");
                if (AbstractC7387uJ.a.z0(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    C3954gO0.q(c7020sO7);
                    return;
                }
                return;
        }
    }
}

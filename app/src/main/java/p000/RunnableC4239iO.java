package p000;

import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

/* renamed from: iO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4239iO implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29116a;

    /* renamed from: b */
    public final /* synthetic */ C6820sO f29117b;

    public /* synthetic */ RunnableC4239iO(C6820sO c6820sO, int i) {
        this.f29116a = i;
        this.f29117b = c6820sO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29116a) {
            case 0:
                C6820sO c6820sO = this.f29117b;
                AbstractC8301Sz1.m7478a(c6820sO.m24717a(), new C7621Fx1(c6820sO), c6820sO.f42398h);
                return;
            case 1:
                C6820sO c6820sO2 = this.f29117b;
                c6820sO2.f42398h.execute(new RunnableC4239iO(c6820sO2, 2));
                return;
            case 2:
                C6820sO c6820sO3 = this.f29117b;
                if (c6820sO3.f42412v) {
                    AbstractC7806Jm0.m4412f(c6820sO3.f42391a);
                    c6820sO3.f42413w = null;
                    c6820sO3.m24726j();
                    c6820sO3.f42412v = false;
                    return;
                }
                return;
            case 3:
                C6820sO c6820sO4 = this.f29117b;
                int iM26247x = AbstractC7222ym.m26247x(c6820sO4.f42390D);
                if (iM26247x == 1) {
                    c6820sO4.m24723g();
                    return;
                } else {
                    if (iM26247x == 6 || iM26247x == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                C6820sO c6820sO5 = this.f29117b;
                switch (AbstractC7222ym.m26247x(c6820sO5.f42390D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c6820sO5.m24722f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        c6820sO5.m24725i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO5.f42390D)));
                }
            case 5:
                C6820sO c6820sO6 = this.f29117b;
                c6820sO6.f42387A = true;
                if (c6820sO6.f42416z) {
                    c6820sO6.f42395e.stop();
                    c6820sO6.m24724h();
                    return;
                }
                return;
            default:
                C6820sO c6820sO7 = this.f29117b;
                AbstractC7806Jm0.m4412f("Recorder");
                if (AbstractC6941uJ.f43644a.m17864z0(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                    C9491gO0.m18483q(c6820sO7);
                    return;
                }
                return;
        }
    }
}

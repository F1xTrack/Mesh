package defpackage;

import android.app.Activity;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;
import io.appmetrica.analytics.impl.Kb;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: za */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8389za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC8389za(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CC0 cc0 = (CC0) this.c;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) cc0.c).a;
                boolean z = xq.c0;
                boolean z2 = this.b;
                if (z != z2) {
                    xq.c0 = z2;
                    xq.m.f(23, new SQ(z2, 1));
                    break;
                }
                break;
            case 1:
                C3954gO0 c3954gO0 = (C3954gO0) ((C0999Mo1) this.c).b;
                boolean z3 = c3954gO0.X;
                boolean z4 = this.b;
                if (z3 == z4) {
                    AbstractC0759Jm0.f("Recorder");
                    break;
                } else {
                    c3954gO0.X = z4;
                    c3954gO0.I();
                    break;
                }
            case 2:
                C0644Ia c0644Ia = (C0644Ia) ((C1016Mu0) this.c).b;
                c0644Ia.q = this.b;
                if (c0644Ia.g == 2) {
                    c0644Ia.a();
                    break;
                }
                break;
            case 3:
                C4025gm c4025gm = (C4025gm) this.c;
                boolean z5 = c4025gm.a;
                boolean z6 = this.b;
                if (z5 != z6) {
                    c4025gm.a = z6;
                    if (!z6) {
                        C1774Wn c1774Wn = new C1774Wn("The camera control has became inactive.");
                        C0365El c0365El = (C0365El) c4025gm.g;
                        if (c0365El != null) {
                            c0365El.d(c1774Wn);
                            c4025gm.g = null;
                            break;
                        }
                    } else if (c4025gm.b) {
                        C6329om c6329om = (C6329om) c4025gm.c;
                        c6329om.getClass();
                        AbstractC1500Sz1.l(AbstractC8171yQ1.b(new B7(4, c6329om))).d(new G4(8, c4025gm), (ExecutorC5715lY0) c4025gm.d);
                        c4025gm.b = false;
                        break;
                    }
                }
                break;
            case 4:
                C0212Cm c0212Cm = (C0212Cm) this.c;
                boolean z7 = this.b;
                c0212Cm.G = z7;
                if (z7 && c0212Cm.L == 4) {
                    c0212Cm.J(false);
                    break;
                }
                break;
            case 5:
                Kb.a((Kb) this.c, this.b);
                break;
            case 6:
                C4360iW0 c4360iW0 = (C4360iW0) this.c;
                O90.f(c4360iW0, "this$0");
                if (!this.b) {
                    c4360iW0.s(EnumC3978gW0.b, c4360iW0);
                    c4360iW0.t(0.0f, false);
                    break;
                } else {
                    c4360iW0.s(EnumC3978gW0.a, c4360iW0);
                    c4360iW0.t(1.0f, false);
                    break;
                }
            case 7:
                C2204ao1 c2204ao1 = (C2204ao1) this.c;
                if (!this.b) {
                    c2204ao1.b(1);
                    break;
                } else {
                    c2204ao1.a(1);
                    break;
                }
            case 8:
                StatusBarModule.setHidden$lambda$1((Activity) this.c, this.b);
                break;
            case 9:
                SystraceProfiler.onStop$lambda$4$lambda$3(this.b, (String) this.c);
                break;
            default:
                ((WindowsInsetsManager) this.c).lambda$updateWindowDecor$0(this.b);
                break;
        }
    }

    public /* synthetic */ RunnableC8389za(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}

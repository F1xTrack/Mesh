package p000;

import android.app.Activity;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;
import io.appmetrica.analytics.impl.C4612Kb;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: za */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7273za implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46874a;

    /* renamed from: b */
    public final /* synthetic */ boolean f46875b;

    /* renamed from: c */
    public final /* synthetic */ Object f46876c;

    public /* synthetic */ RunnableC7273za(Object obj, boolean z, int i) {
        this.f46874a = i;
        this.f46876c = obj;
        this.f46875b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46874a) {
            case 0:
                CC0 cc0 = (CC0) this.f46876c;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a;
                boolean z = c1474xq.f13718c0;
                boolean z2 = this.f46875b;
                if (z != z2) {
                    c1474xq.f13718c0 = z2;
                    c1474xq.f13730m.m8134f(23, new C1159SQ(z2, 1));
                    break;
                }
                break;
            case 1:
                C9491gO0 c9491gO0 = (C9491gO0) ((C7967Mo1) this.f46876c).f7363b;
                boolean z3 = c9491gO0.f27742X;
                boolean z4 = this.f46875b;
                if (z3 == z4) {
                    AbstractC7806Jm0.m4412f("Recorder");
                    break;
                } else {
                    c9491gO0.f27742X = z4;
                    c9491gO0.m18492I();
                    break;
                }
            case 2:
                C0541Ia c0541Ia = (C0541Ia) ((C7978Mu0) this.f46876c).f7393b;
                c0541Ia.f5009q = this.f46875b;
                if (c0541Ia.f4999g == 2) {
                    c0541Ia.m3938a();
                    break;
                }
                break;
            case 3:
                C4137gm c4137gm = (C4137gm) this.f46876c;
                boolean z5 = c4137gm.f27979a;
                boolean z6 = this.f46875b;
                if (z5 != z6) {
                    c4137gm.f27979a = z6;
                    if (!z6) {
                        C1434Wn c1434Wn = new C1434Wn("The camera control has became inactive.");
                        C0300El c0300El = (C0300El) c4137gm.f27985g;
                        if (c0300El != null) {
                            c0300El.m2377d(c1434Wn);
                            c4137gm.f27985g = null;
                            break;
                        }
                    } else if (c4137gm.f27980b) {
                        C6573om c6573om = (C6573om) c4137gm.f27981c;
                        c6573om.getClass();
                        AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C0071B7(4, c6573om))).mo2494d(new RunnableC0383G4(8, c4137gm), (ExecutorC10151lY0) c4137gm.f27982d);
                        c4137gm.f27980b = false;
                        break;
                    }
                }
                break;
            case 4:
                C0175Cm c0175Cm = (C0175Cm) this.f46876c;
                boolean z7 = this.f46875b;
                c0175Cm.f1616G = z7;
                if (z7 && c0175Cm.f1621L == 4) {
                    c0175Cm.m1323J(false);
                    break;
                }
                break;
            case 5:
                C4612Kb.m19549a((C4612Kb) this.f46876c, this.f46875b);
                break;
            case 6:
                C9763iW0 c9763iW0 = (C9763iW0) this.f46876c;
                O90.m5968f(c9763iW0, "this$0");
                if (!this.f46875b) {
                    c9763iW0.m19055s(EnumC9507gW0.f27823b, c9763iW0);
                    c9763iW0.m19056t(0.0f, false);
                    break;
                } else {
                    c9763iW0.m19055s(EnumC9507gW0.f27822a, c9763iW0);
                    c9763iW0.m19056t(1.0f, false);
                    break;
                }
            case 7:
                C8771ao1 c8771ao1 = (C8771ao1) this.f46876c;
                if (!this.f46875b) {
                    c8771ao1.m10339b(1);
                    break;
                } else {
                    c8771ao1.m10338a(1);
                    break;
                }
            case 8:
                StatusBarModule.setHidden$lambda$1((Activity) this.f46876c, this.f46875b);
                break;
            case 9:
                SystraceProfiler.onStop$lambda$4$lambda$3(this.f46875b, (String) this.f46876c);
                break;
            default:
                ((WindowsInsetsManager) this.f46876c).lambda$updateWindowDecor$0(this.f46875b);
                break;
        }
    }

    public /* synthetic */ RunnableC7273za(boolean z, Object obj, int i) {
        this.f46874a = i;
        this.f46875b = z;
        this.f46876c = obj;
    }
}

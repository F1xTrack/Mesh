package p000;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: Bw */
/* loaded from: classes.dex */
public final /* synthetic */ class C0122Bw implements InterfaceC1319Uy, InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ Object f1089a;

    /* renamed from: b */
    public final /* synthetic */ Object f1090b;

    /* renamed from: c */
    public final /* synthetic */ Object f1091c;

    /* renamed from: d */
    public final /* synthetic */ Object f1092d;

    /* renamed from: e */
    public final /* synthetic */ Object f1093e;

    public /* synthetic */ C0122Bw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f1089a = obj;
        this.f1090b = obj2;
        this.f1091c = obj3;
        this.f1092d = obj4;
        this.f1093e = obj5;
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        Surface surface;
        C10715py0 c10715py0 = (C10715py0) this.f1089a;
        Z61 z61 = (Z61) this.f1090b;
        EnumC11690xa1 enumC11690xa1 = (EnumC11690xa1) this.f1091c;
        C1614Ze c1614Ze = (C1614Ze) this.f1092d;
        C1613Zd c1613Zd = (C1613Zd) this.f1093e;
        C0149CM c0149cm = z61.f14739c;
        C1488Xe c1488XeM8126b = AbstractC8371Ui1.m8126b(c1613Zd, c0149cm, c1614Ze);
        C1551Ye c1551Ye = c1613Zd.f15046a;
        Size size = z61.f14738b;
        Range range = z61.f14740d;
        String str = c1488XeM8126b.f13886a;
        C7276zd c7276zd = c1488XeM8126b.f13888c;
        C1362Ve c1362Ve = (C1362Ve) (c7276zd != null ? new C1002Pv(str, enumC11690xa1, c1551Ye, size, c7276zd, c0149cm, range) : new C8761aj1(str, enumC11690xa1, c1551Ye, size, c0149cm, range)).get();
        try {
            C1686an c1686an = (C1686an) c10715py0.f40466f;
            Executor executor = (Executor) c10715py0.f40464d;
            c1686an.getClass();
            C6820sO c6820sO = new C6820sO(executor, c1362Ve);
            c10715py0.f40467g = c6820sO;
            InterfaceC1661aO interfaceC1661aO = c6820sO.f42396f;
            if (interfaceC1661aO instanceof C6740rO) {
                C6740rO c6740rO = (C6740rO) interfaceC1661aO;
                ExecutorC10151lY0 executorC10151lY0 = (ExecutorC10151lY0) c10715py0.f40465e;
                C4224i9 c4224i9 = new C4224i9(c10715py0, c0300El, z61, 23);
                synchronized (c6740rO.f41635a) {
                    c6740rO.f41638d = c4224i9;
                    executorC10151lY0.getClass();
                    c6740rO.f41639e = executorC10151lY0;
                    surface = c6740rO.f41636b;
                }
                if (surface != null) {
                    try {
                        executorC10151lY0.execute(new RunnableC3973eA(c4224i9, 28, surface));
                    } catch (RejectedExecutionException unused) {
                        AbstractC7806Jm0.m4412f(c6740rO.f41640f.f42391a);
                    }
                }
            } else {
                c0300El.m2377d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (U90 e) {
            AbstractC7806Jm0.m4412f("VideoEncoderSession");
            c0300El.m2377d(e);
        }
        return "ConfigureVideoEncoderFuture " + c10715py0;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Date date = (Date) this.f1092d;
        HashMap map = (HashMap) this.f1093e;
        C0248Dw c0248Dw = (C0248Dw) this.f1089a;
        c0248Dw.getClass();
        C9450g32 c9450g32 = (C9450g32) this.f1090b;
        if (!c9450g32.mo11144k()) {
            return AbstractC9376fU1.m18243d(new C6684qV("Firebase Installations failed to get installation ID for fetch.", c9450g32.mo11141h()));
        }
        C9450g32 c9450g322 = (C9450g32) this.f1091c;
        if (!c9450g322.mo11144k()) {
            return AbstractC9376fU1.m18243d(new C6684qV("Firebase Installations failed to get installation auth token for fetch.", c9450g322.mo11141h()));
        }
        try {
            C0185Cw c0185CwM1948b = c0248Dw.m1948b((String) c9450g32.mo11142i(), ((C1172Sd) c9450g322.mo11142i()).f10878a, date, map);
            return c0185CwM1948b.f1762a != 0 ? AbstractC9376fU1.m18244e(c0185CwM1948b) : c0248Dw.f2318f.m26007f(c0185CwM1948b.f1763b).m18387n(c0248Dw.f2315c, new C0071B7(23, c0185CwM1948b));
        } catch (C6747rV e) {
            return AbstractC9376fU1.m18243d(e);
        }
    }
}

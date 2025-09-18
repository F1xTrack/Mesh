package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: Bw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0164Bw implements InterfaceC1651Uy, InterfaceC0443Fl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0164Bw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        Surface surface;
        C6557py0 c6557py0 = (C6557py0) this.a;
        Z61 z61 = (Z61) this.b;
        EnumC8011xa1 enumC8011xa1 = (EnumC8011xa1) this.c;
        C1981Ze c1981Ze = (C1981Ze) this.d;
        C1978Zd c1978Zd = (C1978Zd) this.e;
        CM cm = z61.c;
        C1825Xe c1825XeB = AbstractC1605Ui1.b(c1978Zd, cm, c1981Ze);
        C1903Ye c1903Ye = c1978Zd.a;
        Size size = z61.b;
        Range range = z61.d;
        String str = c1825XeB.a;
        C8398zd c8398zd = c1825XeB.c;
        C1669Ve c1669Ve = (C1669Ve) (c8398zd != null ? new C1252Pv(str, enumC8011xa1, c1903Ye, size, c8398zd, cm, range) : new C2189aj1(str, enumC8011xa1, c1903Ye, size, cm, range)).get();
        try {
            C2199an c2199an = (C2199an) c6557py0.f;
            Executor executor = (Executor) c6557py0.d;
            c2199an.getClass();
            C7020sO c7020sO = new C7020sO(executor, c1669Ve);
            c6557py0.g = c7020sO;
            InterfaceC2124aO interfaceC2124aO = c7020sO.f;
            if (interfaceC2124aO instanceof C6829rO) {
                C6829rO c6829rO = (C6829rO) interfaceC2124aO;
                ExecutorC5715lY0 executorC5715lY0 = (ExecutorC5715lY0) c6557py0.e;
                C4290i9 c4290i9 = new C4290i9(c6557py0, c0365El, z61, 23);
                synchronized (c6829rO.a) {
                    c6829rO.d = c4290i9;
                    executorC5715lY0.getClass();
                    c6829rO.e = executorC5715lY0;
                    surface = c6829rO.b;
                }
                if (surface != null) {
                    try {
                        executorC5715lY0.execute(new RunnableC3529eA(c4290i9, 28, surface));
                    } catch (RejectedExecutionException unused) {
                        AbstractC0759Jm0.f(c6829rO.f.a);
                    }
                }
            } else {
                c0365El.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (U90 e) {
            AbstractC0759Jm0.f("VideoEncoderSession");
            c0365El.d(e);
        }
        return "ConfigureVideoEncoderFuture " + c6557py0;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Date date = (Date) this.d;
        HashMap map = (HashMap) this.e;
        C0320Dw c0320Dw = (C0320Dw) this.a;
        c0320Dw.getClass();
        C3892g32 c3892g32 = (C3892g32) this.b;
        if (!c3892g32.k()) {
            return AbstractC3782fU1.d(new C6660qV("Firebase Installations failed to get installation ID for fetch.", c3892g32.h()));
        }
        C3892g32 c3892g322 = (C3892g32) this.c;
        if (!c3892g322.k()) {
            return AbstractC3782fU1.d(new C6660qV("Firebase Installations failed to get installation auth token for fetch.", c3892g322.h()));
        }
        try {
            C0242Cw c0242CwB = c0320Dw.b((String) c3892g32.i(), ((C1432Sd) c3892g322.i()).a, date, map);
            return c0242CwB.a != 0 ? AbstractC3782fU1.e(c0242CwB) : c0320Dw.f.f(c0242CwB.b).n(c0320Dw.c, new B7(23, c0242CwB));
        } catch (C6850rV e) {
            return AbstractC3782fU1.d(e);
        }
    }
}

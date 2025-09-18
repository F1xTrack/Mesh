package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC0783MR;
import p000.AbstractC9441g02;
import p000.C0487Hj;
import p000.C0751Lw;
import p000.C0786MU;
import p000.C0912OU;
import p000.C1087RH;
import p000.C11011sG0;
import p000.C11159tQ0;
import p000.C1329V7;
import p000.C1468XK;
import p000.C4183hV;
import p000.C6367lV;
import p000.C6430mV;
import p000.C6790rv;
import p000.C6853sv;
import p000.C7252zF;
import p000.C7277ze;
import p000.C7356Av0;
import p000.C7978Mu0;
import p000.C8071Oo1;
import p000.C8170Qm0;
import p000.C8326Tm0;
import p000.C8342Tu0;
import p000.C9937jt0;
import p000.G10;
import p000.GR0;
import p000.InterfaceC0562Iv;
import p000.InterfaceC1478XU;
import p000.InterfaceC7637Gf1;
import p000.InterfaceC8307Tc1;
import p000.InterfaceC9347fG0;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static C4183hV lambda$getComponents$0(C11011sG0 c11011sG0, InterfaceC0562Iv interfaceC0562Iv) {
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class);
        C7277ze c7277ze = (C7277ze) interfaceC0562Iv.mo4068c(C7277ze.class).get();
        Executor executor = (Executor) interfaceC0562Iv.mo4071h(c11011sG0);
        C4183hV c4183hV = new C4183hV();
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        C0751Lw c0751LwM5135e = C0751Lw.m5135e();
        c0751LwM5135e.getClass();
        C0751Lw.f6930d.f44133b = AbstractC9441g02.m18379c(context);
        c0751LwM5135e.f6934c.m18420c(context);
        C1329V7 c1329v7M8297a = C1329V7.m8297a();
        synchronized (c1329v7M8297a) {
            if (!c1329v7M8297a.f12376p) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(c1329v7M8297a);
                    c1329v7M8297a.f12376p = true;
                }
            }
        }
        c1329v7M8297a.m8299c(new C6430mV());
        if (c7277ze != null) {
            AppStartTrace appStartTraceM11328b = AppStartTrace.m11328b();
            appStartTraceM11328b.m11333g(context);
            executor.execute(new GR0(3, appStartTraceM11328b));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return c4183hV;
    }

    public static C6367lV providesFirebasePerformance(InterfaceC0562Iv interfaceC0562Iv) {
        interfaceC0562Iv.mo4066a(C4183hV.class);
        C0786MU c0786mu = (C0786MU) interfaceC0562Iv.mo4066a(C0786MU.class);
        InterfaceC1478XU interfaceC1478XU = (InterfaceC1478XU) interfaceC0562Iv.mo4066a(InterfaceC1478XU.class);
        InterfaceC9347fG0 interfaceC9347fG0Mo4068c = interfaceC0562Iv.mo4068c(C11159tQ0.class);
        InterfaceC9347fG0 interfaceC9347fG0Mo4068c2 = interfaceC0562Iv.mo4068c(InterfaceC8307Tc1.class);
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8627a = c0786mu;
        c8071Oo1.f8628b = interfaceC1478XU;
        c8071Oo1.f8629c = interfaceC9347fG0Mo4068c;
        c8071Oo1.f8630d = interfaceC9347fG0Mo4068c2;
        C0487Hj c0487Hj = new C0487Hj(new G10(15, c8071Oo1), new C8342Tu0(15, c8071Oo1), new C7978Mu0(16, c8071Oo1), new C8170Qm0(18, c8071Oo1), new C9937jt0(14, c8071Oo1), new C8326Tm0(c8071Oo1), new C7356Av0(14, c8071Oo1), 2);
        C1468XK c1468xk = new C1468XK();
        c1468xk.f13675b = C1468XK.f13673c;
        c1468xk.f13674a = c0487Hj;
        return (C6367lV) c1468xk.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6853sv> getComponents() {
        C11011sG0 c11011sG0 = new C11011sG0(InterfaceC7637Gf1.class, Executor.class);
        C6790rv c6790rvM24810b = C6853sv.m24810b(C6367lV.class);
        c6790rvM24810b.f42153c = LIBRARY_NAME;
        c6790rvM24810b.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b.m24548a(new C1087RH(1, 1, C11159tQ0.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(InterfaceC1478XU.class));
        c6790rvM24810b.m24548a(new C1087RH(1, 1, InterfaceC8307Tc1.class));
        c6790rvM24810b.m24548a(C1087RH.m6929c(C4183hV.class));
        c6790rvM24810b.f42157g = new C0912OU(4);
        C6853sv c6853svM24549b = c6790rvM24810b.m24549b();
        C6790rv c6790rvM24810b2 = C6853sv.m24810b(C4183hV.class);
        c6790rvM24810b2.f42153c = EARLY_LIBRARY_NAME;
        c6790rvM24810b2.m24548a(C1087RH.m6929c(C0786MU.class));
        c6790rvM24810b2.m24548a(C1087RH.m6927a(C7277ze.class));
        c6790rvM24810b2.m24548a(new C1087RH(c11011sG0, 1, 0));
        c6790rvM24810b2.m24550c(2);
        c6790rvM24810b2.f42157g = new C7252zF(c11011sG0, 2);
        return Arrays.asList(c6853svM24549b, c6790rvM24810b2.m24549b(), AbstractC0783MR.m5363a(LIBRARY_NAME, "21.0.4"));
    }
}
